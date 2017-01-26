package com.tup.service.impl;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;
import org.pentaho.di.core.KettleEnvironment;
import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.job.Job;
import org.pentaho.di.job.JobMeta;
import org.springframework.beans.factory.annotation.Autowired;

import com.tup.commons.base.KettleConfigHelper;
import com.tup.model.JobConfig;
import com.tup.service.IJobConfigService;

public class KettleProcessorService implements Runnable {
	private static Logger logger = Logger.getLogger(KettleProcessorService.class);
	// kettle job parameters
	private KettleConfigHelper kettleconfig;
	// kettle job record
	private JobConfig job;
	private String ktrfullname;
	// @Autowired
	private IJobConfigService iJobConfigService;

	public IJobConfigService getiJobConfigService() {
		return iJobConfigService;
	}

	public void setiJobConfigService(IJobConfigService iJobConfigService) {
		this.iJobConfigService = iJobConfigService;
	}

	public KettleProcessorService() {
		// super();
	}

	public KettleProcessorService(KettleConfigHelper kettleconfig, JobConfig job) {
		// super();
		System.out.println("create KettleProcessorService");
		this.kettleconfig = kettleconfig;
		this.job = job;
	}

	public KettleProcessorService(KettleConfigHelper kettleconfig, JobConfig job, IJobConfigService iJobConfigService) {
		super();
		this.kettleconfig = kettleconfig;
		this.job = job;
		this.iJobConfigService = iJobConfigService;
	}

	public KettleConfigHelper getKettleconfig() {
		return kettleconfig;
	}

	public void setKettleconfig(KettleConfigHelper kettleconfig) {
		this.kettleconfig = kettleconfig;
	}

	public JobConfig getJob() {
		return job;
	}

	public void setJob(JobConfig job) {
		this.job = job;
	}

	// bean to map
	public static Map<String, Object> ConvertObjectToMap(Object obj)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> pomclass = obj.getClass();
		pomclass = obj.getClass();
		Method[] methods = obj.getClass().getMethods();
		Map<String, Object> map = new HashMap<String, Object>();
		for (Method m : methods) {
			if (m.getName().startsWith("get") && !m.getName().startsWith("getClass")) {
				Object value = (Object) m.invoke(obj);
				map.put(m.getName().substring(3), (Object) value);
			}
		}
		return map;
	}

	public void process(JobConfig jobentity, KettleConfigHelper kettleconfig)
			throws KettleException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		iJobConfigService.updateByIdRunStatus(job, "2");// processing
		KettleEnvironment.init();
		ktrfullname = System.getProperty("webapp.root") + File.separator + "kettle" + File.separator
				+ jobentity.getKtrName();
		JobMeta jobMeta = new JobMeta(ktrfullname, null);
		Job job = new Job(null, jobMeta);
		Map<String, Object> map = ConvertObjectToMap(kettleconfig);
		for (String key : map.keySet()) {
			// // map parameters
			job.setVariable(key, (String) map.get(key));
			// System.out.println("Key = " + key + ", Value = " + (String)
			// map.get(key));
		}
		job.start();
		job.waitUntilFinished();
	}

	// by job
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep((new Random()).nextInt(3000));
			process(job, kettleconfig);
			// release job
			iJobConfigService.updateByIdRunStatus(job, "0"); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			iJobConfigService.updateByIdRunStatus(job, "3");
			//retry +1
			iJobConfigService.RetryAutoIncrement(job);
			e.printStackTrace();
		}
	}

}
