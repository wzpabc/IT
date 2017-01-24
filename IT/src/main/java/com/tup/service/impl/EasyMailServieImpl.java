//package com.tup.service.impl;
//
//import java.io.File;
//import java.util.Iterator;
//import java.util.Map;
//
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.util.StringUtils;
//
//import com.alibaba.druid.support.logging.Log;
//import com.alibaba.druid.support.logging.LogFactory; 
//
//public class EasyMailServieImpl  {  
//	  private static transient Log logger = LogFactory.getLog(EasyMailServieImpl.class);   
//	    
//	  //注入MailSender  
//	  private JavaMailSender javaMailSender;  
//	    
//	  //注入线程池  
//	  private EasyMailExecutorPool easyMailExecutorPool;  
//	    
//	  //设置发件人  
//	  private String from;  
//	    
//	  public void setEasyMailExecutorPool(EasyMailExecutorPool easyMailExecutorPool) {  
//	    this.easyMailExecutorPool = easyMailExecutorPool;  
//	  }  
//	  
//	  public void setJavaMailSender(JavaMailSender javaMailSender) {  
//	    this.javaMailSender = javaMailSender;  
//	  }  
//	    
//	  public void setFrom(String from) {  
//	    this.from = from;  
//	  }  
//	  
//	  /** 
//	   * 简单的邮件发送接口，感兴趣的同学可以在这个基础上继续添加 
//	   * @param to 
//	   * @param subject 
//	   * @param text 
//	   */  
//	  public void sendMessage(EmailEntity email){  
//	    if (null == email) {  
//	      if (logger.isDebugEnabled()) {  
//	        logger.debug("something you need to tell here");  
//	      }  
//	      return;  
//	    }  
//	    SimpleMailMessage simpleMailMessage = new SimpleMailMessage();  
//	      
//	    simpleMailMessage.setTo(email.getTo());  
//	    simpleMailMessage.setSubject(email.getSubject());  
//	    simpleMailMessage.setText(email.getText());  
//	    simpleMailMessage.setFrom(from);  
//	      
//	    easyMailExecutorPool.getService().execute(new MailRunner(simpleMailMessage));  
//	  }  
//	    
//	  /** 
//	   * 发送复杂格式邮件的接口，可以添加附件，图片，等等，但是需要修改这个方法， 
//	   * 如何做到添加附件和图片论坛上有例子了，需要的同学搜一下, 
//	   * 事实上这里的text参数最好是来自于模板，用模板生成html页面，然后交给javamail去发送， 
//	   * 如何使用模板来生成html见 {@link http://www.iteye.com/topic/71430 } 
//	   *  
//	   * @param to 
//	   * @param subject 
//	   * @param text 
//	   * @throws MessagingException 
//	   */  
//	  public void sendMimeMessage(EmailEntity email) throws MessagingException {  
//	    if (null == email) {  
//	      if (logger.isDebugEnabled()) {  
//	        logger.debug("something you need to tell here");  
//	      }  
//	      return;  
//	    }  
//	    MimeMessage message = javaMailSender.createMimeMessage();  
//	    MimeMessageHelper helper = new MimeMessageHelper(message);  
//	      
//	    helper.setTo(email.getTo());  
//	    helper.setFrom(from);  
//	    helper.setSubject(email.getSubject());  
//	      
//	    this.addAttachmentOrImg(helper, email.getAttachment(), true);  
//	    this.addAttachmentOrImg(helper, email.getImg(), false);  
//	      
//	    //这里的text是html格式的, 可以使用模板引擎来生成html模板, velocity或者freemarker都可以做到  
//	    helper.setText(email.getText(),true);  
//	      
//	    easyMailExecutorPool.getService().execute(new MailRunner(message));  
//	  }  
//	    
//	  /** 
//	   * 添加附件或者是图片 
//	   * @param helper 
//	   * @param map 
//	   * @param isAttachment 
//	   * @throws MessagingException 
//	   */  
//	  private void addAttachmentOrImg(MimeMessageHelper helper, Map map, boolean isAttachment) throws MessagingException {  
//	    for (Iterator it = map.entrySet().iterator(); it.hasNext();) {  
//	      Map.Entry entry = (Map.Entry) it.next();  
//	      String key = (String) entry.getKey();  
//	      String value = (String) entry.getValue();  
//	      if (StringUtils.isNotBlank(key) && StringUtils.isNotBlank(value)) {  
//	        FileSystemResource file = new FileSystemResource(new File(value));  
//	        if (!file.exists()) continue;  
//	        if (isAttachment) {  
//	          helper.addAttachment(key, file);  
//	        } else {  
//	          helper.addInline(key, file);  
//	        }  
//	      }  
//	    }  
//	  }  
//	    
//	  /** 
//	   * 用来发送邮件的 Runnable, 该类是一个内部类，之所以使用内部类，而没有使用嵌套类（静态内部类）， 
//	   * 是因为内部类可以之间得到 service 的 javaMailSender 
//	   * 每次发送邮件都会从线程池中取一个线程, 然后进行发邮件操作 
//	   * @author ahuaxuan 
//	   */  
//	  private class MailRunner implements Runnable {  
//	    SimpleMailMessage simpleMailMessage;  
//	    MimeMessage mimeMessage;   
//	      
//	    /** 
//	     * 构造简单文本邮件 
//	     * @param simpleMailMessage 
//	     */  
//	    public MailRunner(SimpleMailMessage simpleMailMessage) {  
//	      if (mimeMessage == null) {  
//	        this.simpleMailMessage = simpleMailMessage;  
//	      }  
//	    }  
//	      
//	    /** 
//	     * 构造复杂邮件，可以添加附近，图片，等等 
//	     * @param mimeMessage 
//	     */  
//	    public MailRunner(MimeMessage mimeMessage) {  
//	      if (simpleMailMessage == null) {  
//	        this.mimeMessage = mimeMessage;  
//	      }  
//	    }  
//	      
//	    /** 
//	     * 该方法将在线程池中的线程中执行 
//	     */  
//	    public void run() {  
//	      try {  
//	        if (simpleMailMessage != null) {  
//	          javaMailSender.send(this.simpleMailMessage);  
//	        } else if (mimeMessage != null) {  
//	          javaMailSender.send(this.mimeMessage);  
//	        }  
//	                
//	            } catch (Exception e) {  
//	              if (logger.isDebugEnabled()) {  
//	                logger.debug("logger something here", e);  
//	              }  
//	            }       
//	    }  
//	  }  
//	}  