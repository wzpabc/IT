package com.tup.service;

import org.springframework.core.task.TaskExecutor;

import com.tup.service.impl.TaskServiceImpl;

public interface Processor {

	/* (non-Javadoc)
	 * @see com.tup.service.impl.Processor#process()
	 */
	void process();

	void process1();

	void process2();

	/* (non-Javadoc)
	 * @see com.tup.service.impl.Processor#setService(org.springframework.stereotype.Service)
	 */
	void setService(TaskServiceImpl service);

	/* (non-Javadoc)
	 * @see com.tup.service.impl.Processor#setTaskExecutor(org.springframework.core.task.TaskExecutor)
	 */
	void setTaskExecutor(TaskExecutor taskExecutor);

}