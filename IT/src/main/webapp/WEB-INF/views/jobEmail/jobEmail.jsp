<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    var jobEmailDataGrid;
    $(function() {
        jobEmailDataGrid = $('#jobEmailDataGrid').datagrid({
        url : '${path}/jobEmail/dataGrid',
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
         
				 {
            width : '60',
            title : 'mail',
            field : 'mail',
            sortable : true
        },
				 {
            width : '60',
            title : 'execDate',
            field : 'execDate',
            sortable : true
        },
				 {
            width : '60',
            title : 'nextExecDate',
            field : 'nextExecDate',
            sortable : true
        },
				 {
            width : '60',
            title : 'YearWeek',
            field : 'YearWeek',
            sortable : true
        },
				 {
            width : '60',
            title : 'OrganNo',
            field : 'OrganNo',
            sortable : true
        },
				 {
            width : '60',
            title : 'organName',
            field : 'organName',
            sortable : true
        },
				 {
            width : '60',
            title : 'EmailTo',
            field : 'EmailTo',
            sortable : true
        },
				 {
            width : '60',
            title : 'EmailCC',
            field : 'EmailCC',
            sortable : true
        },
				 {
            width : '60',
            title : 'EmailBC',
            field : 'EmailBC',
            sortable : true
        },
				 {
            width : '60',
            title : 'subject',
            field : 'subject',
            sortable : true
        },
				 {
            width : '60',
            title : 'content',
            field : 'content',
            sortable : true
        },
				 {
            width : '60',
            title : 'attPath',
            field : 'attPath',
            sortable : true
        },
				 {
            width : '60',
            title : 'isActive',
            field : 'isActive',
            sortable : true
        },
				 {
            width : '60',
            title : 'week',
            field : 'week',
            sortable : true
        },
				 {
            width : '60',
            title : 'quarter',
            field : 'quarter',
            sortable : true
        },
				 {
            width : '60',
            title : 'month',
            field : 'month',
            sortable : true
        },
				 {
            width : '60',
            title : 'year',
            field : 'year',
            sortable : true
        },
				 {
            width : '60',
            title : 'createTime',
            field : 'createTime',
            sortable : true
        },
				 {
            width : '60',
            title : 'updateTime',
            field : 'updateTime',
            sortable : true
        },
				 {
            width : '60',
            title : 'deleteFlag',
            field : 'deleteFlag',
            sortable : true
        },
				 {
            width : '60',
            title : 'id',
            field : 'id',
            sortable : true
        },
				 {
            width : '60',
            title : 'status',
            field : 'status',
            sortable : true
        },
				 {
            width : '60',
            title : 'type',
            field : 'type',
            sortable : true
        },
		        {
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
        }
        , {
            field : 'action',
            title : '操作',
            width : 200,
            formatter : function(value, row, index) {
                var str = '';
                <shiro:hasPermission name="/user/add">
                    str += $.formatString('<a href="javascript:void(0)" class="jobEmail-easyui-linkbutton-edit" data-options="plain:true,iconCls:\'fi-pencil icon-blue\'" onclick="jobEmailEditFun(\'{0}\');" >编辑</a>', row.id);
                </shiro:hasPermission>
                <shiro:hasPermission name="/user/add">
                    str += '&nbsp;&nbsp;|&nbsp;&nbsp;';
                    str += $.formatString('<a href="javascript:void(0)" class="jobEmail-easyui-linkbutton-del" data-options="plain:true,iconCls:\'fi-x icon-red\'" onclick="jobEmailDeleteFun(\'{0}\');" >删除</a>', row.id);
                </shiro:hasPermission>
                return str;
            }
        } 
        ] ],
        onLoadSuccess:function(data){
            $('.jobEmail-easyui-linkbutton-edit').linkbutton({text:'编辑'});
            $('.jobEmail-easyui-linkbutton-del').linkbutton({text:'删除'});
        },
        toolbar : '#jobEmailToolbar'
    });
});

/**
 * 添加框
 * @param url
 */
function jobEmailAddFun() {
    parent.$.modalDialog({
        title : '添加',
        width : 700,
        height : 600,
        href : '${path}/jobEmail/addPage',
        buttons : [ {
            text : '确定',
            handler : function() {
                parent.$.modalDialog.openner_dataGrid = jobEmailDataGrid;//因为添加成功之后，需要刷新这个treeGrid，所以先预定义好
                var f = parent.$.modalDialog.handler.find('#jobEmailAddForm');
                f.submit();
            }
        } ]
    });
}


/**
 * 编辑
 */
function jobEmailEditFun(id) {
    if (id == undefined) {
        var rows = jobEmailDataGrid.datagrid('getSelections');
        id = rows[0].id;
    } else {
        jobEmailDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
    }
    parent.$.modalDialog({
        title : '编辑',
        width : 700,
        height : 600,
        href :  '${path}/jobEmail/editPage?id=' + id,
        buttons : [ {
            text : '确定',
            handler : function() {
                parent.$.modalDialog.openner_dataGrid = jobEmailDataGrid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                var f = parent.$.modalDialog.handler.find('#jobEmailEditForm');
                f.submit();
            }
        } ]
    });
}


/**
 * 删除
 */
 function jobEmailDeleteFun(id) {
     if (id == undefined) {//点击右键菜单才会触发这个
         var rows = jobEmailDataGrid.datagrid('getSelections');
         id = rows[0].id;
     } else {//点击操作里面的删除图标会触发这个
         jobEmailDataGrid.datagrid('unselectAll').datagrid('uncheckAll');
     }
     parent.$.messager.confirm('询问', '您是否要删除当前角色？', function(b) {
         if (b) {
             progressLoad();
             $.post('${path}/jobEmail/delete', {
                 id : id
             }, function(result) {
                 if (result.success) {
                     parent.$.messager.alert('提示', result.msg, 'info');
                     jobEmailDataGrid.datagrid('reload');
                 }
                 progressClose();
             }, 'JSON');
         }
     });
}


/**
 * 清除
 */
function jobEmailCleanFun() {
    $('#jobEmailSearchForm input').val('');
    jobEmailDataGrid.datagrid('load', {});
}
/**
 * 搜索
 */
function jobEmailSearchFun() {
     jobEmailDataGrid.datagrid('load', $.serializeObject($('#jobEmailSearchForm')));
}
</script>

<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'north',border:false" style="height: 30px; overflow: hidden;background-color: #fff">
        <form id="jobEmailSearchForm">
            <table>
                <tr>
                    <td>名称:</td>
                    <td><input name="name" type="text" class="easyui-textbox"  placeholder="搜索条件"/></td>
                    
                </tr>
            </table>
        </form>
     </div>
 
    <div data-options="region:'center',border:false">
        <table id="jobEmailDataGrid" data-options="fit:true,border:false"></table>
    </div>
</div>
<div id="jobEmailToolbar" style="display: none;">
    <shiro:hasPermission name="/user/add">
        <a onclick="jobEmailAddFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'fi-plus icon-green'">添加</a>
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-magnifying-glass',plain:true" onclick="jobEmailSearchFun();">查询</a>
        <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'fi-x-circle',plain:true" onclick="jobEmailCleanFun();">清空</a>
    </shiro:hasPermission>
</div>