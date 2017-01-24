package com.tup.service;

import com.tup.model.Report;
import com.tup.commons.utils.PageInfo;
import com.baomidou.mybatisplus.service.IService;
import com.tup.form.ReportHelper;

/**
 * <p>
 *   服务类
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface IReportService extends IService<Report> {
	 
	void setHelper(ReportHelper helper);

	void selectDataGrid(PageInfo pageInfo);
	
}
