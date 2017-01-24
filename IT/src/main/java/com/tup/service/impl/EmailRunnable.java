package com.tup.service.impl;

import org.springframework.core.task.TaskExecutor;

public class EmailRunnable {

	private TaskExecutor taskExecutor;
	private MailSenderService mailSenderService;

	public void process() {

		taskExecutor.execute(mailSenderService);
	}

	public TaskExecutor getTaskExecutor() {
		return taskExecutor;
	}

	public void setTaskExecutor(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

	public MailSenderService getMailSenderService() {
		return mailSenderService;
	}

	public void setMailSenderService(MailSenderService mailSenderService) {
		this.mailSenderService = mailSenderService;
	}
	
}
