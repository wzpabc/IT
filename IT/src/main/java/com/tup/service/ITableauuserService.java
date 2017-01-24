package com.tup.service;

import com.tup.model.Tableauuser;
import com.tup.commons.utils.PageInfo;
import com.baomidou.mybatisplus.service.IService;
import com.tup.form.TableauuserHelper;

/**
 * <p>
 *   服务类
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface ITableauuserService extends IService<Tableauuser> {
	 
	void setHelper(TableauuserHelper helper);

	void selectDataGrid(PageInfo pageInfo);
	
}
