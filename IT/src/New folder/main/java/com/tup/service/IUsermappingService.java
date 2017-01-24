package com.tup.service;

import com.tup.model.Usermapping;
import com.tup.commons.utils.PageInfo;
import com.baomidou.mybatisplus.service.IService;
import com.tup.form.UsermappingHelper;

/**
 * <p>
 *   服务类
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface IUsermappingService extends IService<Usermapping> {
	 
	void setHelper(UsermappingHelper helper);

	void selectDataGrid(PageInfo pageInfo);
	
}
