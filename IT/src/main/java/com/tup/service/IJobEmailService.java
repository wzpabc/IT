package com.tup.service;

import com.tup.model.JobEmail;
import com.tup.commons.utils.PageInfo;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.tup.form.JobEmailHelper;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author patrick.wang
 * @since 2017-01-23
 */
public interface IJobEmailService extends IService<JobEmail> {

	void setHelper(JobEmailHelper helper);

	void selectDataGrid(PageInfo pageInfo);

	List<JobEmail> selectMailList(int size);

	void updateByIdStatus2(JobEmail entity, int status);

}
