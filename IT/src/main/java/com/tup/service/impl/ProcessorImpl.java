package com.tup.service.impl;

import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.tup.service.Processor;

public class ProcessorImpl implements Processor {

	// 日志对象
	private static Log logger = LogFactory.getLog(ProcessorImpl.class);

	// 执行器
	private TaskExecutor taskExecutor;

	// 业务接口
	private TaskServiceImpl service;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tup.service.impl.Processor#process()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tup.service.impl.Processor#process()
	 */
	public void process() {
		// 使用多线程处理
		taskExecutor.execute(new Runnable() {
			public void run() {
				try {
					logger.debug("[Thread " + Thread.currentThread().getId() + " start]");
					// 业务处理
					System.out.println(service.handle("小明：我先来  at "));
					logger.debug("[Thread " + Thread.currentThread().getId() + " end]");
				} catch (RuntimeException e) {
					logger.error("Service handle exception", e);
				}
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tup.service.impl.Processor#process1()
	 */
	public void process1() {
		// 使用多线程处理
		taskExecutor.execute(new Runnable() {
			public void run() {
				try {
					logger.debug("[Thread " + Thread.currentThread().getId() + " start]");
					// 业务处理
					System.out.println(service.handle("小红：不，我先来 at "));
					logger.debug("[Thread " + Thread.currentThread().getId() + " end]");
				} catch (RuntimeException e) {
					logger.error("Service handle exception", e);
				}
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tup.service.impl.Processor#process2()
	 */
	public void process2() {
		// 使用多线程处理
		taskExecutor.execute(new Runnable() {
			public void run() {
				try {
					logger.debug("[Thread " + Thread.currentThread().getId() + " start]");
					// 业务处理
					System.out.println(service.handle("小赵：。。。 at "));
					logger.debug("[Thread " + Thread.currentThread().getId() + " end]");
				} catch (RuntimeException e) {
					logger.error("Service handle exception", e);
				}
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tup.service.impl.Processor#setService(org.springframework.stereotype.
	 * Service)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tup.service.impl.Processor#setService(org.springframework.stereotype.
	 * Service)
	 */
	public void setService(TaskServiceImpl service) {
		this.service = service;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tup.service.impl.Processor#setTaskExecutor(org.springframework.core.
	 * task.TaskExecutor)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.tup.service.impl.Processor#setTaskExecutor(org.springframework.core.
	 * task.TaskExecutor)
	 */
	public void setTaskExecutor(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

}
