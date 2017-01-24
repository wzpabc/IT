package com.tup.service;

import com.tup.model.Reportcls;
import com.tup.commons.utils.PageInfo;
import com.baomidou.mybatisplus.service.IService;
import com.tup.form.ReportclsHelper;

/**
 * <p>
 *   服务类
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface IReportclsService extends IService<Reportcls> {
	 
	void setHelper(ReportclsHelper helper);

	void selectDataGrid(PageInfo pageInfo);
	
}
