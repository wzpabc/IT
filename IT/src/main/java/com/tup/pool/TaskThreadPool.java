package com.tup.pool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * 数据抽取任务线程池
 * @author hxf
 * @date 2015/09/25
 */
public class TaskThreadPool {
//	/**
//	 *  线程池维护线程的最少数量
//	 */
//	public static int corePoolSize = ResourceUtil.getNumber("thread_init_size");
//	
//	/**
//	 * 线程池维护线程的最大数量
//	 */
//	public static int maximumPoolSize = ResourceUtil.getNumber("thread_max_size");
//	
	/**
	 * 线程池维护线程所允许的空闲时间
	 */
	private static long keepAliveTime = 300;
	
	/**
	 * 线程池所使用的缓冲队列
	 */ 
	private static BlockingQueue<Runnable> workQueue = new LinkedBlockingDeque<Runnable>();
	
	/**
	 * 线程池
	 */
	//public static ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.SECONDS, workQueue);
	
	/**
	 * 执行任务
	 */
	//public static void executeJob(ConfigDTO configDTO){
//		TaskThread act = new TaskThread(configDTO);
//		executor.execute(act);
//	}
}
