package com.tup.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.tup.commons.base.EmailAuthenticator;
import com.tup.commons.utils.VeDate;
import com.tup.model.JobEmail;
import com.tup.service.IJobEmailService;

@Service
public class MailSenderService implements Runnable {
	private static transient Log logger = LogFactory.getLog(MailSenderService.class);

	// @Autowired
	private JavaMailSenderImpl mailSender;

	@Autowired
	private IJobEmailService iJobEmailService;
	// 发送邮件的服务器的IP和端口
	private String host;
	private int size = 10;
	private String port = "25";
	private String from = "";

	// 登陆邮件发送服务器的用户名和密码
	private String userName;
	private String password;

	// 是否需要身份验证
	private boolean validate = false;

	public MimeMessage createMimeMessage(JobEmail email) throws MessagingException, UnsupportedEncodingException {
		// 判断是否需要身份认证
		// EmailAuthenticator authenticator = null;
		// if (isValidate()) {
		// // 如果需要身份认证，则创建一个密码验证器
		// authenticator = new EmailAuthenticator(getUserName(), getPassword());
		// }
		// Session sendMailSession = Session.getDefaultInstance(getProperties(),
		// authenticator);
		// // 根据session创建一个邮件消息
		// MimeMessage mimeMessage = new MimeMessage(sendMailSession);

		MimeMessage mimeMessage = mailSender.createMimeMessage();
		System.out.println(email.toString());
		MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, false, "UTF-8");
		// messageHelper.setFrom("");
		messageHelper.setSubject(email.getSubject());
		messageHelper.setTo(email.getEmailto());
		messageHelper.setCc(email.getEmailcc());
		messageHelper.setText(email.getContent(), true); // html: true
		// messageHelper.setText("<body><p>Hello Html Email</p><img
		// src='cid:file'/></body>", true);
		// FileSystemResource file = new
		// FileSystemResource("C:\\Users\\image1.jpg");
		// messageHelper.addInline("file", file);
		messageHelper.setBcc(email.getEmailcc());
		messageHelper.setSentDate(VeDate.getNow());
		return mimeMessage;
	}

	public void run() {
		// TODO Auto-generated method stub
		List<JobEmail> lists = iJobEmailService.selectMailList(size);
		// update

		for (JobEmail email : lists) {
			MimeMessage msg;
			try {

				msg = createMimeMessage(email);
				// mailSender.send(msg);
				iJobEmailService.updateByIdStatus2(email, 2);
			} catch (Exception e) {
				iJobEmailService.updateByIdStatus2(email, 3);// error
				// TODO Auto-generated catch block
				if (logger.isDebugEnabled()) {
					logger.debug("something you need to tell here");
				}
				e.printStackTrace();
				
			}

		}

	}

	/**
	 * 创建MimeMessage
	 * 
	 * @param mailBean
	 * @return
	 * @throws MessagingException
	 * @throws UnsupportedEncodingException
	 */
	/**
	 * 获得邮件会话属性
	 */

	public Properties getProperties() {
		Properties p = new Properties();
		p.put("mail.smtp.host", this.host);
		p.put("mail.smtp.port", this.port);
		p.put("mail.smtp.auth", validate ? "true" : "false");
		return p;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValidate() {
		return validate;
	}

	public void setValidate(boolean validate) {
		this.validate = validate;
	}

	public JavaMailSenderImpl getMailSender() {
		return mailSender;
	}

	public void setMailSender(JavaMailSenderImpl mailSender) {
		this.mailSender = mailSender;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}