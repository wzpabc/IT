package com.tup.service;

import com.tup.model.Fmsuser;
import com.tup.commons.utils.PageInfo;
import com.baomidou.mybatisplus.service.IService;
import com.tup.form.FmsuserHelper;

/**
 * <p>
 *   服务类
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface IFmsuserService extends IService<Fmsuser> {
	 
	void setHelper(FmsuserHelper helper);

	void selectDataGrid(PageInfo pageInfo);
	
}
