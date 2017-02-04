package com.tup.service;

import com.tup.model.Outletstock;
import com.tup.commons.utils.PageInfo;
import com.baomidou.mybatisplus.service.IService;
import com.tup.form.OutletstockHelper;

/**
 * <p>
 *   服务类
 * </p>
 *
 * @author patrick.wang
 * @since 2017-02-04
 */
public interface IOutletstockService extends IService<Outletstock> {
	 
	void setHelper(OutletstockHelper helper);

	void selectDataGrid(PageInfo pageInfo);
	
}
