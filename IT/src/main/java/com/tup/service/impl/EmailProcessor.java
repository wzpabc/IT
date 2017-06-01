package com.tup.service.impl;

import org.springframework.core.task.TaskExecutor;

public class EmailProcessor {
	private TaskExecutor taskExecutor;// inject from task.xml
	private EmailProcessorService emailProcessorService;// inject from task.xml extends
												// Runnable

	public void process() {

		taskExecutor.execute(emailProcessorService);
	}

	public TaskExecutor getTaskExecutor() {
		return taskExecutor;
	}

	public void setTaskExecutor(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

	public EmailProcessorService getEmailProcessorService() {
		return emailProcessorService;
	}

	public void setEmailProcessorService(EmailProcessorService emailProcessorService) {
		this.emailProcessorService = emailProcessorService;
	}

	 

}
