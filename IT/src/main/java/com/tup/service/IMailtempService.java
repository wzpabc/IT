package com.tup.service;

import com.tup.model.Mailtemp;
import com.tup.commons.utils.PageInfo;
import com.baomidou.mybatisplus.service.IService;
import com.tup.form.MailtempHelper;

/**
 * <p>
 *   服务类
 * </p>
 *
 * @author patrick.wang
 * @since 2017-05-27
 */
public interface IMailtempService extends IService<Mailtemp> {
	 
	void setHelper(MailtempHelper helper);

	void selectDataGrid(PageInfo pageInfo);
	
}
