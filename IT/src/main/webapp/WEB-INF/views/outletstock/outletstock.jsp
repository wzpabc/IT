<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    var outletstockDataGrid;
    $(function() {
        outletstockDataGrid = $('#outletstockDataGrid').datagrid({
        url : '${path}/outletstock/dataGrid',
        striped : true,
        //rownumbers : true,
        pagination : true,
        singleSelect : true,
        idField : 'id',
        sortName : 'id',
        sortOrder : 'asc',
        pageSize : 20,
        pageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500],
        columns : [ [ 
         
        	{ width : '60',title : 'id', field : 'id',sortable : true },
        	{ width : '60',title : 'year', field : 'year',sortable : true },
        	{ width : '60',title : 'month', field : 'month',sortable : true },
        	{ width : '60',title : 'outletno', field : 'outletno',sortable : true },
        	{ width : '60',title : 'area', field : 'area',sortable : true },
        	{ width : '60',title : 'rental', field : 'rental',sortable : true },
        	{ width : '60',title : 'salary', field : 'salary',sortable : true },
        	{ width : '100',title : 'filename', field : 'filename',sortable : true },
        	{ width : '60',title : 'itemno', field : 'itemno',sortable : true },
        	{ width : '200',title : 'itemname', field : 'itemname',sortable : true },
        	{ width : '60',title : 'unit', field : 'unit',sortable : true },
        	{ width : '60',title : 'price', field : 'price',sortable : true },
        	{ width : '60',title : 'shopamount', field : 'shopamount',sortable : true },
        	{ width : '60',title : 'warehouse1amount', field : 'warehouse1amount',sortable : true },
        	{ width : '60',title : 'warehouse2amount', field : 'warehouse2amount',sortable : true },
        	{ width : '60',title : 'totalamount', field : 'totalamount',sortable : true },
        	{ width : '60',title : 'total', field : 'total',sortable : true },
		    {
            field : 'action',
            title : '操作',
            width : 200,
            formatter : function(value, row, index) {
                var str = '';
                <shiro:hasPermission name="/user/add">
                    str += $.formatString('<a href="javascript:void(0)" class="outletstock-easyui-linkbutton-edit" data-options="plain:true,iconCls:\'fi-pencil icon-blue\'" onclick="outletstockEditFun(\'{0}\');" >编辑</a>', row.id);
                </shiro:hasPermission>
                <shiro:hasPermission name="/user/add">
                    str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                    str += $.formatString('<a href="javascript:void(0)" class="outletstock-easyui-linkbutton-del" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="outletstockDeleteFun(\'{0}\');" >删除</a>', row.id);
                </shiro:hasPermission>
                return str;
            }
        } ] ],
        onLoadSuccess:function(data){
            $('.outletstock-easyui-linkbutton-edit').linkbutton({text:'编辑'});
            $('.outletstock-easyui-linkbutton-del').linkbutton({text:'删除'});
        },
        toolbar : '#outletstockToolbar'
    });
});

/**
 * 添加框
 * @param url
 */
function outletstockAddFun() {
    parent.$.modalDialog({
        title : '添加',
        width : 700,
        height : 600,
        href : '${path}/outletstock/addPage',
        buttons : [ {
			            text : '确定',
			            handler : function() {
			                parent.$.modalDialog.openner_dataGrid = outletstockDataGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
			                var f = parent.$.modalDialog.handler.find('#outletstockAddForm');
			                f.submit();
			            }
			        } ,
			        {
			            text : '关闭',
			            handler : function() {
			                alert("关闭");
			            }
			        } ,
			        {
			            text : '重置',
			            handler : function() {
			            	 alert("重置");
			            }
			        } 
        ]
    });
}


/**
 * 编辑
 */
function outletstockEditFun(id) {
    if (id == undefined) {
        var rows = outletstockDataGrid.datagrid('getSelections');
        id = rows[0].id;
    } else {
        outletstockDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
    }
    parent.$.modalDialog({
        title : '编辑',
        width : 700,
        height : 600,
        href :  '${path}/outletstock/editPage?id=' + id,
        buttons : [ {
			            text : '确定',
			            handler : function() {
			                parent.$.modalDialog.openner_dataGrid = outletstockDataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
			                var f = parent.$.modalDialog.handler.find('#outletstockEditForm');
			                f.submit();
			            }
			        } ,
			        {
			            text : '关闭',
			            handler : function() {
			                alert("关闭");
			            }
			        } ,
			        {
			            text : '重置',
			            handler : function() {
			            	 alert("重置");
			            }
			        } 
        ]
    });
}


/**
 * 删除
 */
 function outletstockDeleteFun(id) {
     if (id == undefined) {//点击右键菜单才会触发这个
         var rows = outletstockDataGrid.datagrid('getSelections');
         id = rows[0].id;
     } else {//点击操作里面的删除图标会触发这个
         outletstockDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
     }
     parent.$.messager.confirm('询问', '您是否要删除当前角色？', function(b) {
         if (b) {
             progressLoad();
             $.post('${path}/outletstock/delete', {
                 id : id
             }, function(result) {
                 if (result.success) {
                     parent.$.messager.alert('提示', result.msg, 'info');
                     outletstockDataGrid.datagrid('reload');
                 }
                 progressClose();
             }, 'JSON');
         }
     });
}


/**
 * 清除
 */
function outletstockCleanFun() {
    $('#outletstockSearchForm input').val('');
    outletstockDataGrid.datagrid('load', {});
}
/**
 * 搜索
 */
function outletstockSearchFun() {
     outletstockDataGrid.datagrid('load', $.serializeObject($('#outletstockSearchForm')));
}
</script>

<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'north',border:false" style="height: 30px; overflow: hidden;background-color: #fff">
        <form id="outletstockSearchForm">
            <table>
                <tr>
                    <td>名称:</td>
                    <td><input name="name" type="text" class="easyui-textbox"  placeholder="搜索条件"/></td>                 
                </tr>
            </table>
        </form>
     </div>
 
    <div data-options="region:'center',border:false">
        <table id="outletstockDataGrid" data-options="fit:true,border:false"></table>
    </div>
</div>
<div id="outletstockToolbar" style="display: none;">
    <shiro:hasPermission name="/user/add">
        <a onclick="outletstockAddFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'fi-plus icon-green'">添加</a>
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-magnifying-glass',plain:true" onclick="outletstockSearchFun();">查询</a>
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-x-circle',plain:true" onclick="outletstockCleanFun();">清空</a>       
    </shiro:hasPermission>
</div>