<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    $(function () {
    	//
    	orderDataGrid = $('#orderDataGrid').datagrid({
            url: '${path }/ordersync/dataGrid',
           // url:'',
            striped: true,
            pagination: true,
            singleSelect: false,
            idField: 'id',
            checkbox:true,
            pageSize: 20,
            pageList: [10, 20, 30, 40, 50, 100, 200, 300, 400, 500],
            columns: [[
            	{field:'ck',checkbox:true}, 
            	{width:'280',title:'编号',field:'id',sortable:false},	
            	{width:'150',title:'订单编号',field:'syvr01',sortable:true},							
            	{width:'80',title:'JDE订单编号',field:'sydoco',sortable:false},	
            	{width:'70',title:'市场',field:'sykcoo',sortable:false},							
            	{width:'70',title:'订单类型',field:'sydcto',sortable:false},							
            	{width:'70',title:'MCU',field:'symcu',sortable:false},							
            	{width:'70',title:'市场01',field:'syco',sortable:false},							
            	{width:'70',title:'下单者',field:'syan8',sortable:false},							
            	{width:'70',title:'收货者',field:'syshan',sortable:false},							
            	{width:'150',title:'订单日期',field:'sytrdj',sortable:false},							
            	//{width:'100',title:'未定义',field:'sydrqj',sortable:false},							
            	//{width:'100',title:'未定义',field:'sypddj',sortable:false},							
            	//{width:'100',title:'未定义',field:'sydrqt',sortable:false},							
            	//{width:'100',title:'未定义',field:'sydel1',sortable:false},							
            	//{width:'100',title:'未定义',field:'sydel2',sortable:false},							
            	//{width:'100',title:'未定义',field:'syurcd',sortable:false},							
            	//{width:'100',title:'未定义',field:'syurdt',sortable:false},							
            	//{width:'100',title:'未定义',field:'syurat',sortable:false},							
            	//{width:'100',title:'未定义',field:'syurab',sortable:false},							
            	//{width:'100',title:'未定义',field:'syurrf',sortable:false},							
            	{width:'100',title:'收货人',field:'samlnm',sortable:false},							
            	{width:'150',title:'收货地址',field:'saadd1',sortable:false},							
            	//{width:'100',title:'未定义',field:'saadd2',sortable:false},							
            	//{width:'100',title:'未定义',field:'saadd3',sortable:false},							
            	//{width:'100',title:'未定义',field:'saadd4',sortable:false},	
            	{width:'100',title:'JDE状态',field:'jdeStatus',sortable:false},							
            	//{width:'150',title:'jdeInsertdate',field:'jdeInsertdate',sortable:false},							
            	//{width:'100',title:'jdeUpdatedate',field:'jdeUpdatedate',sortable:false},							
            	//{width:'100',title:'jdeOrdernumber',field:'jdeOrdernumber',sortable:false},							
            	//{width:'100',title:'未定义',field:'jdeProccesslog',sortable:false},							
            	{width:'150',title:'ktProcessdate',field:'ktProcessdate',sortable:false},							
            	//{width:'100',title:'sydoco',field:'ediflag',sortable:false},							
            	//{width:'100',title:'未定义',field:'syekco',sortable:false},							
            	//{width:'100',title:'未定义',field:'syedoc',sortable:false},							
            	//{width:'100',title:'未定义',field:'syedct',sortable:false},							
            	//{width:'100',title:'未定义',field:'syedbt',sortable:false},							
            	{width:'100',title:'fmsProcessDate',field:'fmsProcessDate',sortable:false}]
            ],
            toolbar : '#orderToolbar'
        });
    });
    
    $(document).ready(function() {
        function count() {
        	//alert($('[name=autorefresh]:checked').val());
        	if( $('[name=autorefresh]:checked').val()=="checked"){
        		orderDataGrid.datagrid('load', $.serializeObject($('#searchForm')));
        	} 
        }
        var auto_refresh = setInterval(function() { count() }, 5000);
        count();
    });
    
    var msg=""
    
    function searchFun() {
    	if(
    	(1==1||document.getElementById("orderno").value!==""||document.getElementById("organno").value!=="")   	
    			
    	){
    		orderDataGrid.datagrid('load', $.serializeObject($('#searchForm')));
    	}else{
    		msg=((document.getElementById("organno").value!=="") ? a="客户编号" : a="订单编号")+'不能为空.'; 
    		slide();
    	}
    	
    }
    function slide(){
        $.messager.show({
            title:'Messager',
            iconCls:'fi-mail',
            msg:window.msg,
            timeout:3000,
            showType:'slide'
        });
    }
    function cleanFun() {

    	 $("#searchForm input").not(".easyui-combobox").val(''); 
  	
         orderDataGrid.datagrid('load', {},function(){ $("#cc").combobox('reload'); });
        
    }
    
   
    function orderSelectedSyncFun(){
    	var ids = [];
    	var rows = orderDataGrid.datagrid('getSelections');
    	if(rows.length<1){
        	msg="请选中要同步记录";
        	slide(); 
    	}else{ 
    		 for(var i=0; i<rows.length; i++){
        	    ids.push({"syvr01":rows[i].syvr01});
        	}
          	$.ajax({    
                type: "post",   
                url: "${path }/ordersync/update",   
                data:JSON.stringify(ids) ,    
                contentType: "application/json; charset=utf-8",    
                dataType: "json",    
                success: function (response) {    
                	window.msg=response+ " success!";    
                	orderDataGrid.datagrid('load', {});
                	slide(); 
                }, error: function () {    
                	window.msg="error";     
                	slide(); 
                }    
            });    
        	orderDataGrid.datagrid('clearSelections');        	 
    	}   
    	
    	 
    }
    
    
    function orderAllSyncFun(){
    	msg="您确定要执行操作吗？";
    	 $.messager.defaults = { ok: "是", cancel: "否",width:"300px" ,iconCls:'fi-alert icon-red'};
    	$.messager.confirm("Tips", msg, function (r) {          	
            if (r) {  
            	$.post("${path }/ordersync/updateAll", {}, function(result){ msg=result+"条订单已同步"; slide();}, "json");
                orderDataGrid.datagrid('load', {});
                return true;  
            }else{
            	msg="已取消";
            	slide();
            	return false;  
            }  
        });  
     }
    
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
<div data-options="region:'north',border:false" style="height: 60px; overflow: hidden;background-color: #fff">
        <form id="searchForm" class="content">
            <table id="mtb">
                <tr>
                    <td>&nbsp订单编号:</td>
                    <td><input id="orderno" name="orderno" type="text" class="easyui-textbox" placeholder="请输入订单编号"  style="border-radius10px;"/></td>
                    <td>&nbsp客户编号:</td>
                    <td><input id="organno" name="organno" class="easyui-textbox" placeholder="请输入客户编号"  style="border-radius10px;"/></td>
                    <td>&nbsp订单类型：</td>
                    <td>
                       <input id="cc" class="easyui-combobox" name="ordertype"  data-options="valueField:'id',value:'ALL',textField:'text',url:'${staticPath }/ordertype'">
                    </td>
                   
                 </tr>
                 <tr>
                  <td>&nbsp订单日期从:</td>
                  <td>
                  	<input name="createdateStart" class="easyui-datebox"  /> 
                  </td>
                  <td>&nbsp订单日期从至:</td>
                   <td>
                   	 <input  name="createdateEnd" class="easyui-datebox"   /> 
                   </td>
                     <td><input type="checkbox" id="autorefresh" name="autorefresh" value="checked">auto-refresh<br /></td>              		  
                </tr>
            </table>
        </form>
    </div>
    <div data-options="region:'center',border:false">
        <table id="orderDataGrid" data-options="fit:true,border:false"></table>
    </div>
</div>
 

<div id="orderToolbar" style="display: none;">
    <shiro:hasPermission name="/ordersync/search">
       <!-- <a href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'fi-plus icon-green'" onclick="searchOrderFun();" >添加</a>   --> 
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-magnifying-glass',plain:true" onclick="searchFun();">查询</a>
          </shiro:hasPermission> 
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-x-circle',plain:true" onclick="cleanFun();">重置</a>
            <shiro:hasPermission name="/ordersync/update">
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-link',plain:true" onclick="setTimeout(function(){  orderSelectedSyncFun();}, 100);">同步选定订单</a>
           </shiro:hasPermission>
            <shiro:hasPermission name="/ordersync/updateAll">
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-fast-forward',plain:true" onclick="orderAllSyncFun();">同步所有订单</a>
           </shiro:hasPermission> 
  
   
</div> 
    <div id="w" class="easyui-window" title="正在处理" data-options="iconCls:'fi-loop',closed:true" >
       <div id="p" class="easyui-progressbar" style="width:400px;"></div>
    </div> 