<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    var reportmappingDataGrid;
    $(function() {
        reportmappingDataGrid = $('#reportmappingDataGrid').datagrid({
        url : '${path}/reportmapping/dataGrid',
        striped : true,
        rownumbers : true,
        pagination : true,
        singleSelect : true,
        idField : 'id',
        sortName : 'id',
        sortOrder : 'asc',
        pageSize : 20,
        pageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500],
        frozenColumns : [ [ {
            width : '60',
            title : '编号',
            field : 'id',
            sortable : true
        }, {
            width : '60',
            title : '状态',
            field : 'status',
            sortable : true,
            formatter : function(value, row, index) {
                switch (value) {
                case 0:
                    return '正常';
                case 1:
                    return '停用';
                }
            }
        }, {
            width : '140',
            title : '创建时间',
            field : 'createTime',
            sortable : true
        }, {
            field : 'action',
            title : '操作',
            width : 200,
            formatter : function(value, row, index) {
                var str = '';
                <shiro:hasPermission name="/reportmapping/edit">
                    str += $.formatString('<a href="javascript:void(0)" class="reportmapping-easyui-linkbutton-edit" data-options="plain:true,iconCls:\'fi-pencil icon-blue\'" onclick="reportmappingEditFun(\'{0}\');" >编辑</a>', row.id);
                </shiro:hasPermission>
                <shiro:hasPermission name="/reportmapping/delete">
                    str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                    str += $.formatString('<a href="javascript:void(0)" class="reportmapping-easyui-linkbutton-del" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="reportmappingDeleteFun(\'{0}\');" >删除</a>', row.id);
                </shiro:hasPermission>
                return str;
            }
        } ] ],
        onLoadSuccess:function(data){
            $('.reportmapping-easyui-linkbutton-edit').linkbutton({text:'编辑'});
            $('.reportmapping-easyui-linkbutton-del').linkbutton({text:'删除'});
        },
        toolbar : '#reportmappingToolbar'
    });
});

/**
 * 添加框
 * @param url
 */
function reportmappingAddFun() {
    parent.$.modalDialog({
        title : '添加',
        width : 700,
        height : 600,
        href : '${path}/reportmapping/addPage',
        buttons : [ {
            text : '确定',
            handler : function() {
                parent.$.modalDialog.openner_dataGrid = reportmappingDataGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
                var f = parent.$.modalDialog.handler.find('#reportmappingAddForm');
                f.submit();
            }
        } ]
    });
}


/**
 * 编辑
 */
function reportmappingEditFun(id) {
    if (id == undefined) {
        var rows = reportmappingDataGrid.datagrid('getSelections');
        id = rows[0].id;
    } else {
        reportmappingDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
    }
    parent.$.modalDialog({
        title : '编辑',
        width : 700,
        height : 600,
        href :  '${path}/reportmapping/editPage?id=' + id,
        buttons : [ {
            text : '确定',
            handler : function() {
                parent.$.modalDialog.openner_dataGrid = reportmappingDataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                var f = parent.$.modalDialog.handler.find('#reportmappingEditForm');
                f.submit();
            }
        } ]
    });
}


/**
 * 删除
 */
 function reportmappingDeleteFun(id) {
     if (id == undefined) {//点击右键菜单才会触发这个
         var rows = reportmappingDataGrid.datagrid('getSelections');
         id = rows[0].id;
     } else {//点击操作里面的删除图标会触发这个
         reportmappingDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
     }
     parent.$.messager.confirm('询问', '您是否要删除当前角色？', function(b) {
         if (b) {
             progressLoad();
             $.post('${path}/reportmapping/delete', {
                 id : id
             }, function(result) {
                 if (result.success) {
                     parent.$.messager.alert('提示', result.msg, 'info');
                     reportmappingDataGrid.datagrid('reload');
                 }
                 progressClose();
             }, 'JSON');
         }
     });
}


/**
 * 清除
 */
function reportmappingCleanFun() {
    $('#reportmappingSearchForm input').val('');
    reportmappingDataGrid.datagrid('load', {});
}
/**
 * 搜索
 */
function reportmappingSearchFun() {
     reportmappingDataGrid.datagrid('load', $.serializeObject($('#reportmappingSearchForm')));
}
</script>

<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'north',border:false" style="height: 30px; overflow: hidden;background-color: #fff">
        <form id="reportmappingSearchForm">
            <table>
                <tr>
                    <th>名称:</th>
                    <td><input name="name" placeholder="搜索条件"/></td>
                    <td>
                        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-magnifying-glass',plain:true" onclick="reportmappingSearchFun();">查询</a>
                        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-x-circle',plain:true" onclick="reportmappingCleanFun();">清空</a>
                    </td>
                </tr>
            </table>
        </form>
     </div>
 
    <div data-options="region:'center',border:false">
        <table id="reportmappingDataGrid" data-options="fit:true,border:false"></table>
    </div>
</div>
<div id="reportmappingToolbar" style="display: none;">
    <shiro:hasPermission name="/reportmapping/add">
        <a onclick="reportmappingAddFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'fi-page-add'">添加</a>
    </shiro:hasPermission>
</div>