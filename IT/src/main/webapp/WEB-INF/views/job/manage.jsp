<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    var jobconfigDataGrid;
    $(function() {
        jobconfigDataGrid = $('#jobconfigDataGrid').datagrid({
            url : '${path }/jobconfig/dataGrid',
            striped : true,
           // rownumbers : true,
            pagination : true,
            singleSelect : false,
            checkbox:true,
            idField : 'id',
            sortName : 'id',
            sortOrder : 'asc',
            pageSize : 20,
            pageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500 ],
            columns : [ [
             {field:'ck',checkbox:true}
            ,{width : '80',title : 'id',field : 'id',sortable : true}
            ,{width : '80',title : 'configCode',field : 'configCode',sortable : false}
            ,{width : '200',title : 'configName',field : 'configName',sortable : false}
            ,{width : '40',title : 'freq',field : 'freq',sortable : true}
            ,{width : '50',title : 'retryTime',field : 'retryTime',sortable : false}
            ,{width : '240',title : 'email',field : 'email',sortable : true}
            ,{width : '80',title : 'configStatus',field : 'configStatus',sortable : false}
            ,{width : '150',title : 'ktrName',field : 'ktrName',sortable : false}
            ,{width : '80',title : 'remark',field : 'remark',sortable : true}
            ,{width : '130',title : 'createTime',field : 'createTime',sortable : false}
            ,{width : '130',title : 'updateTime',field : 'updateTime',sortable : false}
            ,{width : '80',title : 'runStatus',field : 'runStatus',sortable : false}
            , {
                width : '60',
                title : '状态',
                field : 'runStatus',
                sortable : true,
                formatter : function(value, row, index) {
                    switch (value) {
                    case '0':
                        return '正常';
                    case '1':
                        return '停用';
                    default:
                    	return 'xx';
                    }
                }
            }, {
                field : 'action',
                title : '操作',
                width : 200,
                formatter : function(value, row, index) {
                    var str = '';
                        <shiro:hasPermission name="/jobconfig/grant">
                            str += $.formatString('<a href="javascript:void(0)" class="jobconfig-easyui-linkbutton-ok" data-options="plain:true,iconCls:\'fi-check icon-green\'" onclick="grantjobconfigFun(\'{0}\');" >授权</a>', row.id);
                        </shiro:hasPermission>
                        <shiro:hasPermission name="/jobconfig/edit">
                            str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                            str += $.formatString('<a href="javascript:void(0)" class="jobconfig-easyui-linkbutton-edit" data-options="plain:true,iconCls:\'fi-pencil icon-blue\'" onclick="editjobconfigFun(\'{0}\');" >编辑</a>', row.id);
                        </shiro:hasPermission>
                        <shiro:hasPermission name="/jobconfig/delete">
                            str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                            str += $.formatString('<a href="javascript:void(0)" class="jobconfig-easyui-linkbutton-del" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="deletejobconfigFun(\'{0}\');" >删除</a>', row.id);
                        </shiro:hasPermission>
                    return str;
                }
            } ] ],
            onLoadSuccess:function(data){
                $('.jobconfig-easyui-linkbutton-ok').linkbutton({text:'授权'});
                $('.jobconfig-easyui-linkbutton-edit').linkbutton({text:'编辑'});
                $('.jobconfig-easyui-linkbutton-del').linkbutton({text:'删除'});
            },
            toolbar : '#jobconfigToolbar'
        });
    });

    function addjobconfigFun() {
        parent.$.modalDialog({
            title : '添加',
            width : 500,
            height : 300,
            href : '${path }/jobconfig/addPage',
            buttons : [ {
                text : '确定',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = jobconfigDataGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#jobconfigAddForm');
                    f.submit();
                }
            } ]
        });
    }

    function editjobconfigFun(id) {
        if (id == undefined) {
            var rows = jobconfigDataGrid.datagrid('getSelections');
            id = rows[0].id;
        } else {
            jobconfigDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
        }
        parent.$.modalDialog({
            title : '编辑',
            width : 500,
            height : 300,
            href : '${path }/jobconfig/editPage?id=' + id,
            buttons : [ {
                text : '确定',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = jobconfigDataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#jobconfigEditForm');
                    f.submit();
                }
            } ]
        });
    }

    function deletejobconfigFun(id) {
        if (id == undefined) {//点击右键菜单才会触发这个
            var rows = jobconfigDataGrid.datagrid('getSelections');
            id = rows[0].id;
        } else {//点击操作里面的删除图标会触发这个
            jobconfigDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
        }
        parent.$.messager.confirm('询问', '您是否要删除当前角色？', function(b) {
            if (b) {
                progressLoad();
                $.post('${path }/jobconfig/delete', {
                    id : id
                }, function(result) {
                    if (result.success) {
                        parent.$.messager.alert('提示', result.msg, 'info');
                        jobconfigDataGrid.datagrid('reload');
                    }
                    progressClose();
                }, 'JSON');
            }
        });
    }

    function grantjobconfigFun(id) {
        if (id == undefined) {
            var rows = jobconfigDataGrid.datagrid('getSelections');
            id = rows[0].id;
        } else {
            jobconfigDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
        }
        
        parent.$.modalDialog({
            title : '授权',
            width : 500,
            height : 500,
            href : '${path }/jobconfig/grantPage?id=' + id,
            buttons : [ {
                text : '确定',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = jobconfigDataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#jobconfigGrantForm');
                    f.submit();
                }
            } ]
        });
    }
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'center',fit:true,border:false">
        <table id="jobconfigDataGrid" data-options="fit:true,border:false"></table>
    </div>
</div>
<div id="jobconfigToolbar" style="display: none;">
    <shiro:hasPermission name="/jobconfig/add">
        <a onclick="addjobconfigFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'fi-plus icon-green'">添加</a>
    </shiro:hasPermission>
</div>