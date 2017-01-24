package com.tup.service;

import com.baomidou.mybatisplus.service.IService;
import com.tup.commons.utils.PageInfo;
import com.tup.form.EmailHelper;
import com.tup.model.Email;

public interface IEmailService extends IService<Email> {

	/* (non-Javadoc)
	 * @see com.tup.service.impl.IEmailService#setHelper(com.tup.commons.base.RequestEmailParamHelper)
	 */
	void setHelper(EmailHelper helper);

	/* (non-Javadoc)
	 * @see com.tup.service.impl.IEmailService#selectDataGrid(com.tup.commons.utils.PageInfo)
	 */
	//@Transactional
	void selectDataGrid(PageInfo pageInfo);

}