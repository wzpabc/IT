<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    var jobDataGrid;
    $(function() {
        jobDataGrid = $('#jobDataGrid').datagrid({
          //  url : '${path }/job/dataGrid',
            striped : true,
            rownumbers : true,
            pagination : true,
            singleSelect : true,
            idField : 'id',
            sortName : 'id',
            sortOrder : 'asc',
            pageSize : 20,
            pageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500 ],
            frozenColumns : [ [ {
                width : '100',
                title : 'id',
                field : 'id',
                sortable : true
            }, {
                width : '80',
                title : '名称',
                field : 'name',
                sortable : true
            } , {
                width : '80',
                title : '排序号',
                field : 'seq',
                sortable : true
            }, {
                width : '200',
                title : '描述',
                field : 'description'
            } , {
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
                field : 'action',
                title : '操作',
                width : 200,
                formatter : function(value, row, index) {
                    var str = '';
                        <shiro:hasPermission name="/job/grant">
                            str += $.formatString('<a href="javascript:void(0)" class="job-easyui-linkbutton-ok" data-options="plain:true,iconCls:\'fi-check icon-green\'" onclick="grantjobFun(\'{0}\');" >授权</a>', row.id);
                        </shiro:hasPermission>
                        <shiro:hasPermission name="/job/edit">
                            str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                            str += $.formatString('<a href="javascript:void(0)" class="job-easyui-linkbutton-edit" data-options="plain:true,iconCls:\'fi-pencil icon-blue\'" onclick="editjobFun(\'{0}\');" >编辑</a>', row.id);
                        </shiro:hasPermission>
                        <shiro:hasPermission name="/job/delete">
                            str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                            str += $.formatString('<a href="javascript:void(0)" class="job-easyui-linkbutton-del" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="deletejobFun(\'{0}\');" >删除</a>', row.id);
                        </shiro:hasPermission>
                    return str;
                }
            } ] ],
            onLoadSuccess:function(data){
                $('.job-easyui-linkbutton-ok').linkbutton({text:'授权'});
                $('.job-easyui-linkbutton-edit').linkbutton({text:'编辑'});
                $('.job-easyui-linkbutton-del').linkbutton({text:'删除'});
            },
            toolbar : '#jobToolbar'
        });
    });

    function addjobFun() {
        parent.$.modalDialog({
            title : '添加',
            width : 500,
            height : 300,
            //href : '${path }/job/addPage',
            buttons : [ {
                text : '确定',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = jobDataGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#jobAddForm');
                    f.submit();
                }
            } ]
        });
    }

    function editjobFun(id) {
        if (id == undefined) {
            var rows = jobDataGrid.datagrid('getSelections');
            id = rows[0].id;
        } else {
            jobDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
        }
        parent.$.modalDialog({
            title : '编辑',
            width : 500,
            height : 300,
            href : '${path }/job/editPage?id=' + id,
            buttons : [ {
                text : '确定',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = jobDataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#jobEditForm');
                    f.submit();
                }
            } ]
        });
    }

    function deletejobFun(id) {
        if (id == undefined) {//点击右键菜单才会触发这个
            var rows = jobDataGrid.datagrid('getSelections');
            id = rows[0].id;
        } else {//点击操作里面的删除图标会触发这个
            jobDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
        }
        parent.$.messager.confirm('询问', '您是否要删除当前角色？', function(b) {
            if (b) {
                progressLoad();
                $.post('${path }/job/delete', {
                    id : id
                }, function(result) {
                    if (result.success) {
                        parent.$.messager.alert('提示', result.msg, 'info');
                        jobDataGrid.datagrid('reload');
                    }
                    progressClose();
                }, 'JSON');
            }
        });
    }

    function grantjobFun(id) {
        if (id == undefined) {
            var rows = jobDataGrid.datagrid('getSelections');
            id = rows[0].id;
        } else {
            jobDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
        }
        
        parent.$.modalDialog({
            title : '授权',
            width : 500,
            height : 500,
           // href : '${path }/job/grantPage?id=' + id,
            buttons : [ {
                text : '确定',
                handler : function() {
                    parent.$.modalDialog.openner_dataGrid = jobDataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                    var f = parent.$.modalDialog.handler.find('#jobGrantForm');
                    f.submit();
                }
            } ]
        });
    }
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'center',fit:true,border:false">
        <table id="jobDataGrid" data-options="fit:true,border:false"></table>
    </div>
</div>
<div id="jobToolbar" style="display: none;">
    <shiro:hasPermission name="/job/add">
        <a onclick="addjobFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'fi-plus icon-green'">添加</a>
    </shiro:hasPermission>
</div>