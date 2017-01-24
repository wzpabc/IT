package com.tup.service.impl;

import org.springframework.stereotype.Service;

import com.tup.commons.utils.VeDate;
import com.tup.service.ITaskService;

@Service
public class TaskServiceImpl implements ITaskService   {
//	@Resource
//	private HelloDaoJDBC helloDao;
//	
//	@Resource
//	private WebServiceContext wsc;
	
	/* (non-Javadoc)
	 * @see com.tup.service.impl.ITaskService#sayHello(java.lang.String)
	 */
	//@Override
	public String handle(String name) {
		 return name+" "+VeDate.getStringDate();
	}
}

 