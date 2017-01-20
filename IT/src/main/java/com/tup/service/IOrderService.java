package com.tup.service;

import com.baomidou.mybatisplus.service.IService;
import com.tup.commons.base.RequestOrderParamHelper;
import com.tup.commons.utils.PageInfo;
import com.tup.mssql.model.OrderHeaderIn;
import com.tup.service.impl.OrderServiceImpl;

public interface IOrderService extends IService<OrderHeaderIn> {
	void selectDataGrid(PageInfo pageInfo);

	OrderServiceImpl setHelper(RequestOrderParamHelper helper);

}
