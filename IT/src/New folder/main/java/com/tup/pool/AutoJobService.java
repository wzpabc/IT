package com.tup.pool;

import org.apache.log4j.Logger;

/**
 * @desc 自动任务
 * @author hxf
 * @date 2015-09-27
 */
public class AutoJobService {
	private static Logger logger = Logger.getLogger(AutoJobService.class);

	/**
	 * 计数器
	 */
	private static long num = 0;

	/**
	 * @desc 执行方法
	 * @return
	 */
	public void execute() {
		logger.info(" 周期任务开始执行,间隔计数器为： " + (++num));

		try {
//			List<ConfigDTO> taskList = new ArrayList<ConfigDTO>();
//			taskList.addAll(ConstantUtils.TASK_LIST);
//			
//			logger.info(" 激活的服务共： [ "+taskList.size()+" ] 个");
//			if (CollectionUtils.isNotEmpty(taskList)) {
//				for (ConfigDTO configDTO : taskList) {
//					if(configDTO == null){
//						continue;
//					}
//					if (ConstantUtils.RUNNING_TASK_INFO.get(configDTO.getConfigCode()) == null) {
//						ConstantUtils.RUNNING_TASK_INFO.put(configDTO.getConfigCode(), new ConfigVO());
//					}
//					if (ConstantUtils.RUNNING_TASK.get(configDTO
//							.getConfigCode()) != null) {
//						logger.info(" 服务编码  "+configDTO.getConfigCode()+" 的服务未运行完成，此次任务抛弃 ");
//						continue;
//					}
//					
//					if(StringUtils.isEmpty(configDTO.getKtrName())){
//						logger.info(" 服务编码  "+configDTO.getConfigCode()+" 未指定KTR，请检查 ");
//						continue;
//					}
//					
//					//周期
//					int freq = configDTO.getFreq();
//					if(freq == 0  || num%freq > 0){
//						logger.info(" 服务编码  "+configDTO.getConfigCode()+" 周期时间未到！ 抛弃任务 ！");
//						continue;
//					}
//					TaskThreadPool.executeJob(configDTO);
//				}
//			}
		} catch (Exception e) {
			logger.info(" JOB运行失败！"+e.getMessage());
		}
	}
}
