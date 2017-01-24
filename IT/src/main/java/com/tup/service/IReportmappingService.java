package com.tup.service;

import com.tup.model.Reportmapping;
import com.tup.commons.utils.PageInfo;
import com.baomidou.mybatisplus.service.IService;
import com.tup.form.ReportmappingHelper;

/**
 * <p>
 *   服务类
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface IReportmappingService extends IService<Reportmapping> {
	 
	void setHelper(ReportmappingHelper helper);

	void selectDataGrid(PageInfo pageInfo);
	
}
