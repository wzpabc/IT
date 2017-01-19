<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/commons/global.jsp" %>
<script type="text/javascript">
    $(function () {
        $('#orderDataGrid').datagrid({
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
            	{width:'70',title:'市场',field:'sykcoo',sortable:false},							
            	{width:'70',title:'订单类型',field:'sydcto',sortable:false},							
            	{width:'70',title:'MCU',field:'symcu',sortable:false},							
            	{width:'70',title:'市场01',field:'syco',sortable:false},							
            	{width:'70',title:'ShipTo',field:'syan8',sortable:false},							
            	{width:'70',title:'SoldTo',field:'syshan',sortable:false},							
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
            	{width:'100',title:'收货人',field:'shmlnm',sortable:false},							
            	{width:'150',title:'收货地址',field:'shadd1',sortable:false},							
            	//{width:'100',title:'未定义',field:'shadd2',sortable:false},							
            	//{width:'100',title:'未定义',field:'shadd3',sortable:false},							
            	//{width:'100',title:'未定义',field:'shadd4',sortable:false},							
            	{width:'100',title:'JDE状态',field:'jdeStatus',sortable:false},							
            	{width:'150',title:'jdeInsertdate',field:'jdeInsertdate',sortable:false},							
            	//{width:'100',title:'jdeUpdatedate',field:'jdeUpdatedate',sortable:false},							
            	//{width:'100',title:'jdeOrdernumber',field:'jdeOrdernumber',sortable:false},							
            	//{width:'100',title:'未定义',field:'jdeProccesslog',sortable:false},							
            	{width:'150',title:'ktProcessdate',field:'ktProcessdate',sortable:false},							
            	{width:'80',title:'sydoco',field:'sydoco',sortable:false},							
            	//{width:'100',title:'sydoco',field:'ediflag',sortable:false},							
            	//{width:'100',title:'未定义',field:'syekco',sortable:false},							
            	//{width:'100',title:'未定义',field:'syedoc',sortable:false},							
            	//{width:'100',title:'未定义',field:'syedct',sortable:false},							
            	//{width:'100',title:'未定义',field:'syedbt',sortable:false},							
            	{width:'100',title:'fmsProcessDate',field:'fmsProcessDate',sortable:false}]]
        });
    });
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'center',border:false">
        <table id="orderDataGrid" data-options="fit:true,border:false"></table>
    </div>
</div>