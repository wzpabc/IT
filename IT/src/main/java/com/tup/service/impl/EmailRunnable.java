package com.tup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

import com.tup.service.IJobEmailService;

public class EmailRunnable {

	private TaskExecutor taskExecutor;
	private MailSenderService mailSenderService;

	@Autowired
	private IJobEmailService service;
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
