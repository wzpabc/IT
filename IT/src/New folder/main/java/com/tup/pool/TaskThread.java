package com.tup.pool;

import org.apache.log4j.Logger;

/**
 * 任务处理线程
 * @author hxf
 * @date 2015-09-25
 */
public class TaskThread implements Runnable{
	/**
	 * 日志
	 */
	private static Logger logger = Logger.getLogger(TaskThread.class);
	/**
	 * 配置对象
	 */
//	private ConfigDTO configDTO;
//	
//	
//	public TaskThread(ConfigDTO configDTO) {
//		this.configDTO = configDTO;
//	}

	public void run() {
//		logger.info(" 服务编码 "+configDTO.getConfigCode()+" 开始运行");
//		try{
//			// 添加到正在运行队列
//			ConstantUtils.RUNNING_TASK.put(configDTO.getConfigCode(), "1");
//			
//			ConfigVO configVO = ConstantUtils.RUNNING_TASK_INFO.get(configDTO.getConfigCode());
//			if (configVO != null) {
//				configVO.setNearestRunTime(new Date());
//			}
//			
//			logger.info(Thread.currentThread()+"  服务编码 "+configDTO.getConfigCode()+" 添加运行时缓存 ");
//			
//			if (configDTO != null) {
//				
//				configDTO.setRunStatus("1"); //表示正在运行
//				String ktrName = configDTO.getKtrName();
//				
//				//拼装路径
//				StringBuilder sb = new StringBuilder(ConstantUtils.getRootPath());
//				sb.append(File.separator);
//				sb.append("kettle");
//				sb.append(File.separator);
//				sb.append(ktrName);
//				
//				Thread.sleep((int)(Math.random()*30000));
//				Map<String, String> paramsMap = new HashMap<String, String>();
//				int retryTime = configDTO.getRetryTime();
//				if(retryTime > 0 ){
//					paramsMap.put("max_times", (retryTime-1)+"");
//				}
//				paramsMap.put("job_receive_addr", configDTO.getEmail());
//				KettleService.runJob(sb.toString(),paramsMap);
//			}
//		}catch (Exception e) {
//			logger.info(" 服务运行KTR出现问题，请检查数据 "+e.getMessage());
//			configDTO.setRunStatus("0"); //表示已经停止
//		}finally{
//			ConstantUtils.RUNNING_TASK.remove(configDTO.getConfigCode());
//			logger.info(" 服务编码 "+configDTO.getConfigCode()+" 移除运行时缓存 ");
//		}
//		logger.info(Thread.currentThread()+" 服务编码 "+configDTO.getConfigCode()+" 运行结束");
//		logger.info(" 正在执行任务数 ：" + ConstantUtils.RUNNING_TASK.size());
	}
}
