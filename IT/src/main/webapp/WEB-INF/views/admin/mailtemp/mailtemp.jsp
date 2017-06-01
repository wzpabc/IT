<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    var mailtempDataGrid;
    $(function() {
        mailtempDataGrid = $('#mailtempDataGrid').datagrid({
        url : '${path}/mailtemp/dataGrid',
        striped : true,
        rownumbers : true,
        pagination : true,
        singleSelect : true,
        idField : 'id',
        sortName : 'id',
        sortOrder : 'asc',
        pageSize : 20,
        pageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500],
        columns : [ [ 
         
				 { width : '60',title : 'id', field : 'id',sortable : true },
				 { width : '60',title : 'subject', field : 'subject',sortable : true },
				 { width : '60',title : 'content', field : 'content',sortable : true },
				 { width : '60',title : 'type', field : 'type',sortable : true },
				 { width : '60',title : 'emailto', field : 'emailto',sortable : true },
				 { width : '60',title : 'emailcc', field : 'emailcc',sortable : true },
				 { width : '60',title : 'emailbc', field : 'emailbc',sortable : true },
				 { width : '60',title : 'attpath', field : 'attpath',sortable : true },
				 { width : '60',title : 'status', field : 'status',sortable : true },
				 { width : '60',title : 'execdate', field : 'execdate',sortable : true },
				 { width : '60',title : 'lastexecdate', field : 'lastexecdate',sortable : true },
				 { width : '60',title : 'retrytimes', field : 'retrytimes',sortable : true },
				 { width : '60',title : 'createtime', field : 'createtime',sortable : true },
				 { width : '60',title : 'updatetime', field : 'updatetime',sortable : true },
				 { width : '60',title : 'deleteflag', field : 'deleteflag',sortable : true },
		        {
            field : 'action',
            title : '操作',
            width : 200,
            formatter : function(value, row, index) {
                var str = '';
                <shiro:hasPermission name="/user/add">
                    str += $.formatString('<a href="javascript:void(0)" class="mailtemp-easyui-linkbutton-edit" data-options="plain:true,iconCls:\'fi-pencil icon-blue\'" onclick="mailtempEditFun(\'{0}\');" >编辑</a>', row.id);
                </shiro:hasPermission>
                <shiro:hasPermission name="/user/add">
                    str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                    str += $.formatString('<a href="javascript:void(0)" class="mailtemp-easyui-linkbutton-del" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="mailtempDeleteFun(\'{0}\');" >删除</a>', row.id);
                </shiro:hasPermission>
                return str;
            }
        } ] ],
        onLoadSuccess:function(data){
            $('.mailtemp-easyui-linkbutton-edit').linkbutton({text:'编辑'});
            $('.mailtemp-easyui-linkbutton-del').linkbutton({text:'删除'});
        },
        toolbar : '#mailtempToolbar'
    });
});

/**
 * 添加框
 * @param url
 */
function mailtempAddFun() {
    parent.$.modalDialog({
        title : '添加',
        width : 700,
        height : 600,
        href : '${path}/mailtemp/addPage',
        buttons : [ {
			            text : '确定',
			            handler : function() {
			                parent.$.modalDialog.openner_dataGrid = mailtempDataGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
			                var f = parent.$.modalDialog.handler.find('#mailtempAddForm');
			                f.submit();
					            }
					 }  ,
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
			        } ]
    });
}


/**
 * 编辑
 */
function mailtempEditFun(id) {
    if (id == undefined) {
        var rows = mailtempDataGrid.datagrid('getSelections');
        id = rows[0].id;
    } else {
        mailtempDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
    }
    parent.$.modalDialog({
        title : '编辑',
        width : 700,
        height : 600,
        href :  '${path}/mailtemp/editPage?id=' + id,
        buttons : [ {
		            text : '确定',
		            handler : function() {
				                parent.$.modalDialog.openner_dataGrid = mailtempDataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
				                var f = parent.$.modalDialog.handler.find('#mailtempEditForm');
				                f.submit();
				            }
				        }  ,
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
			        } ]
    });
}


/**
 * 删除
 */
 function mailtempDeleteFun(id) {
     if (id == undefined) {//点击右键菜单才会触发这个
         var rows = mailtempDataGrid.datagrid('getSelections');
         id = rows[0].id;
     } else {//点击操作里面的删除图标会触发这个
         mailtempDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
     }
     parent.$.messager.confirm('询问', '您是否要删除当前角色？', function(b) {
         if (b) {
             progressLoad();
             $.post('${path}/mailtemp/delete', {
                 id : id
             }, function(result) {
                 if (result.success) {
                     parent.$.messager.alert('提示', result.msg, 'info');
                     mailtempDataGrid.datagrid('reload');
                 }
                 progressClose();
             }, 'JSON');
         }
     });
}


/**
 * 清除
 */
function mailtempCleanFun() {
    $('#mailtempSearchForm input').val('');
    mailtempDataGrid.datagrid('load', {});
}
/**
 * 搜索
 */
function mailtempSearchFun() {
     mailtempDataGrid.datagrid('load', $.serializeObject($('#mailtempSearchForm')));
}
</script>

<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'north',border:false" style="height: 30px; overflow: hidden;background-color: #fff">
        <form id="mailtempSearchForm">
            <table>
                <tr>
                    <td>名称:</td>
                    <td><input name="name" type="text" class="easyui-textbox"  placeholder="搜索条件"/></td>                 
                </tr>
            </table>
        </form>
     </div>
 
    <div data-options="region:'center',border:false">
        <table id="mailtempDataGrid" data-options="fit:true,border:false"></table>
    </div>
</div>
<div id="mailtempToolbar" style="display: none;">
    <shiro:hasPermission name="/user/add">
        <a onclick="mailtempAddFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'fi-plus icon-green'">添加</a>
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-magnifying-glass',plain:true" onclick="mailtempSearchFun();">查询</a>
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-x-circle',plain:true" onclick="mailtempCleanFun();">清空</a>       
    </shiro:hasPermission>
</div>