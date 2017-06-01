package com.tup.service;

import com.tup.model.Maillist;
import com.tup.commons.utils.PageInfo;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.tup.form.MaillistHelper;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author patrick.wang
 * @since 2017-05-27
 */
public interface IMaillistService extends IService<Maillist> {

	void setHelper(MaillistHelper helper);

	void selectDataGrid(PageInfo pageInfo);

	public List<Maillist> selectMailList(int size);

	Boolean markSuccess(Maillist entity);

	Boolean markFail(Maillist entity);

}
