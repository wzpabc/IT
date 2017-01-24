//package com.tup.pool;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//
//import org.pentaho.di.core.KettleEnvironment;
//import org.pentaho.di.job.Job;
//import org.pentaho.di.job.JobMeta;
//
//import com.douples.config.constant.ConstantUtils;
//import com.douples.config.init.ResourceUtil;
//
//
///**
// * kettle服务类
// * @author hxf
// * @date 2015-09-27
// */
//public class KettleService{
//	
//	/**
//	* java 调用 kettle 的job
//	* @param jobname 如： String jobname= "D:\\kettle\\informix_to_am_4.ktr";
//	*/
//	public static void runJob(String jobname,Map<String, String> paramMap) throws Exception{  
//		KettleEnvironment.init();   
//		//jobname 是Job脚本的路径及名称   
//		JobMeta jobMeta = new JobMeta(jobname, null);   
//		Job job = new Job(null, jobMeta);   
//		
//		/*job.setVariable("send_addr", ResourceUtil.getString("send_addr"));*/
//		
//		String receive = ResourceUtil.getString("send_addr");
//		receive =receive.replace("，", ",");//将中文的逗号替换成send_addr英文的逗号
//		
//		job.setVariable("send_addr", receive);
//		
//		job.setVariable("smtp",  ResourceUtil.getString("smtp"));
//		job.setVariable("port", ResourceUtil.getString("port"));
//		job.setVariable("mail_username",  ResourceUtil.getString("mail_username"));
//		job.setVariable("mail_password",  ResourceUtil.getString("mail_password"));
//		
//		job.setVariable("oos_ip", ResourceUtil.getString("oos_ip"));
//		job.setVariable("oos_dbname", ResourceUtil.getString("oos_dbname"));
//		job.setVariable("oos_port", ResourceUtil.getString("oos_port"));
//		job.setVariable("oos_username", ResourceUtil.getString("oos_username"));
//		job.setVariable("oos_password", ResourceUtil.getString("oos_password"));
//		
//		
//		job.setVariable("osb_ip", ResourceUtil.getString("osb_ip"));
//		job.setVariable("osb_dbname", ResourceUtil.getString("osb_dbname"));
//		job.setVariable("osb_port", ResourceUtil.getString("osb_port"));
//		job.setVariable("osb_username", ResourceUtil.getString("osb_username"));
//		job.setVariable("osb_password", ResourceUtil.getString("osb_password"));
//		//设置重试次数
//		String max_times =  paramMap.get("max_times");
//		job.setVariable("max_times",max_times == null ? "0" : max_times.toString());
//		//job自己的邮件地址
//		String job_receive_addr =  paramMap.get("job_receive_addr");
//		if(ConstantUtils.Emaillist.size()<1){//如果常量类中集合为空话，把前台邮件进行处理赋给常量集合
//			ConstantUtils.Emaillist = ConstantUtils.Listmail(job_receive_addr);
//		}else{//大于1的话将设置的集合下标替换
//			ConstantUtils.Emaillist=ConstantUtils.Maillist(ConstantUtils.Emaillist);//改变常量类集合下标
//		}
//		//job.setVariable("job_receive_addr",job_receive_addr == null ? "" : job_receive_addr);
//		job.setVariable("receive_addr",ConstantUtils.Emaillist.get(0));
//		//向Job 脚本传递参数，脚本中获取参数值：${参数名}   
//		job.start();   
//		//等待完成
//		job.waitUntilFinished();   
//		//出现错误 抛异常
//		if (job.getErrors() > 0) {   
//			 throw new Exception("There are errors during job exception!(执行job发生异常)");  
//		}   
//	}
//	
//	public static void runJob(String jobname,Date date) throws Exception{  
//		if(date == null){
//			 throw new Exception("导入日期不存在！");  
//		}
//		
//		KettleEnvironment.init(false);   
//		//jobname 是Job脚本的路径及名称   
//		JobMeta jobMeta = new JobMeta(jobname, null);   
//		Job job = new Job(null, jobMeta); 
//		
////		job.setVariable("date", DateTimeUtil.formatDate(date, "yyyy-MM-dd"));
////		job.setVariable("pdate", DateTimeUtil.formatDate(date, "yyyyMMdd"));
////		job.setVariable("sdate", DateTimeUtil.formatDate(date, "yyyy/MM/dd"));
//		//数据库
////		job.setVariable("host_name", ConfigCenter.getSystemParamInstance().sureValue("kettle.hostName", "10.241.90.117","数据库主机IP"));
////		job.setVariable("datebase_name", ConfigCenter.getSystemParamInstance().sureValue("kettle.databaseName", "orcl","数据库名字"));
////		job.setVariable("port", ConfigCenter.getSystemParamInstance().sureValue("kettle.port", "1521","数据库端口"));
////		job.setVariable("user_name", ConfigCenter.getSystemParamInstance().sureValue("kettle.userName", "omcp","数据库用户名"));
////		job.setVariable("password", ConfigCenter.getSystemParamInstance().sureValue("kettle.password", "omcP123","数据库密码"));
////		job.setVariable("jndiName", ConfigCenter.getSystemParamInstance().sureValue("kettle.jndiName", "OMCP_DS","JNDI数据源名字"));
//		//向Job 脚本传递参数，脚本中获取参数值：${参数名}   
//		job.start();   
//		//等待完成
//		job.waitUntilFinished();   
//		//出现错误 抛异常
//		if (job.getErrors() > 0) {   
//			 throw new Exception("There are errors during job exception!(执行job发生异常)");  
//		}   
//	}
//}