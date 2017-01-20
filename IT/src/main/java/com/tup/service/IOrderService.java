package com.tup.service;

import com.baomidou.mybatisplus.service.IService;
import com.tup.commons.utils.PageInfo;
import com.tup.mssql.model.OrderHeaderIn;

public interface IOrderService extends IService<OrderHeaderIn>{
	  void selectDataGrid(PageInfo pageInfo);
	  
	  
}
