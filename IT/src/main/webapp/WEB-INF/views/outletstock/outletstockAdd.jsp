<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/global.jsp"%>
<script type="text/javascript">
    $(function() {
        $('#outletstockAddForm').form({
            url : '${path}/outletstock/add',
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
                    //之所以能在这里调用到parent.$.modalDialog.openner_dataGrid这个对象，是因为user.jsp页面预定义好了
                    parent.$.modalDialog.openner_dataGrid.datagrid('reload');
                    parent.$.modalDialog.handler.dialog('close');
                } else {
                    parent.$.messager.alert('错误', result.msg, 'error');
                }
            }
        });
    });
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
	<div data-options="region:'center',border:false"
		style="overflow: hidden; padding: 3px;">
		<form id="outletstockAddForm" method="post">
			<table class="grid">
				<tr>
					<td>id</td>
					<td><input name="id" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>year</td>
					<td><input name="year" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>month</td>
					<td><input name="month" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>outletno</td>
					<td><input name="outletno" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>area</td>
					<td><input name="area" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>rental</td>
					<td><input name="rental" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>salary</td>
					<td><input name="salary" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>filename</td>
					<td><input name="filename" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>itemno</td>
					<td><input name="itemno" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>itemname</td>
					<td><input name="itemname" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>unit</td>
					<td><input name="unit" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>price</td>
					<td><input name="price" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>shopamount</td>
					<td><input name="shopamount" type="text"
						class="easyui-textbox" data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>warehouse1amount</td>
					<td><input name="warehouse1amount" type="text"
						class="easyui-textbox" data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>warehouse2amount</td>
					<td><input name="warehouse2amount" type="text"
						class="easyui-textbox" data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>totalamount</td>
					<td><input name="totalamount" type="text"
						class="easyui-textbox" data-options="required:true" value=""></td>
				</tr>
				<tr>
					<td>total</td>
					<td><input name="total" type="text" class="easyui-textbox"
						data-options="required:true" value=""></td>
				</tr>
			</table>
		</form>
	</div>
</div>