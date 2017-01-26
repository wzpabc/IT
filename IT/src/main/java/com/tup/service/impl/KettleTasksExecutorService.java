package com.tup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;

import com.tup.commons.base.KettleConfigHelper;
import com.tup.model.JobConfig;
import com.tup.service.IJobConfigService;

public class KettleTasksExecutorService {
	private KettleConfigHelper kettleconfig; 
	// kettle job record
	@Autowired
	private IJobConfigService iJobConfigService;
	private TaskExecutor taskExecutor;
	private int size = 20;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public KettleConfigHelper getKettleconfig() {
		return kettleconfig;
	}

	public void setKettleconfig(KettleConfigHelper kettleconfig) {
		this.kettleconfig = kettleconfig;
	}

	public TaskExecutor getTaskExecutor() {
		return taskExecutor;
	}

	public void setTaskExecutor(TaskExecutor taskExecutor) {
		this.taskExecutor = taskExecutor;
	}

	public void init() {
		for (JobConfig job : iJobConfigService.selectJobConfigList(size)) { 
			taskExecutor.execute(new KettleProcessorService(kettleconfig, job,iJobConfigService));
		}
			
	}
}
