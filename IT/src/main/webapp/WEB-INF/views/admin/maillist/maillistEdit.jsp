<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    $(function() {
        $('#maillistEditForm').form({
            url : '${path}/maillist/edit',
            onSubmit : function() {
                progressLoad();
                var isValid = $(this).form('validate');
                if (!isValid) {
                    progressClose();
                }
                return isValid;
            },
            success : function(result) {
                progressClose();
                result = $.parseJSON(result);
                if (result.success) {
                    parent.$.modalDialog.openner_dataGrid.datagrid('reload');//之所以能在这里调用到parent.$.modalDialog.openner_dataGrid这个对象，是因为user.jsp页面预定义好了
                    parent.$.modalDialog.handler.dialog('close');
                } else {
                    parent.$.messager.alert('错误', result.msg, 'error');
                }
            }
        });
        
        $("#editStatus").val('${maillist.status}'); 
        
    });
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'center',border:false" title="" style="overflow: hidden;padding: 3px;">
        <form id="maillistEditForm" method="post">
            <table class="grid">
              		         <tr>
                    <td>id</td>
                    <td><input name="id" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>subject</td>
                    <td><input name="subject" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>content</td>
                    <td><input name="content" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>type</td>
                    <td><input name="type" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>emailto</td>
                    <td><input name="emailto" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>emailcc</td>
                    <td><input name="emailcc" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>emailbc</td>
                    <td><input name="emailbc" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>attpath</td>
                    <td><input name="attpath" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>status</td>
                    <td><input name="status" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>execdate</td>
                    <td><input name="execdate" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>lastexecdate</td>
                    <td><input name="lastexecdate" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>retrytimes</td>
                    <td><input name="retrytimes" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>createtime</td>
                    <td><input name="createtime" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>updatetime</td>
                    <td><input name="updatetime" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		    		         <tr>
                    <td>deleteflag</td>
                    <td><input name="deleteflag" type="text" class="easyui-textbox"  data-options="required:true" value=""></td>
                </tr> 
		                    <tr>
                    <td>商家名称</td>
                    <td><input name="id" type="hidden"  value="${maillist.id}">
                    <input name="name" type="text" placeholder="请输入名称" class="easyui-validatebox" data-options="required:true" value="${maillist.name}"></td>
                </tr>
                <tr>
                    <td>状态</td>
                    <td >
                        <select id="editStatus" name="status" class="easyui-combobox" data-options="width:140,height:29,editable:false,panelHeight:'auto'">
                            <option value="0">正常</option>
                            <option value="1">停用</option>
                        </select>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>