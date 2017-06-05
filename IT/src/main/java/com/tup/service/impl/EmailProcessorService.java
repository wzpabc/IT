package com.tup.service.impl;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.tup.commons.utils.FileUtil;
import com.tup.commons.utils.VeDate;
import com.tup.model.Maillist;
import com.tup.service.IMaillistService;
import com.tup.service.ITestMail01;

public class EmailProcessorService implements Runnable { 
	private String root;
	private int port;
	private String users;
	private String smtp;
	private String password;
	private String[] userArray;
	private int size = 1;

	@Autowired
	private IMaillistService maillistService;

	@Autowired
	private JavaMailSenderImpl mailSender;// spring standar mail
	
	@Autowired
	private ITestMail01 testMail01;

	// 使用Velocity模板，需要Velocity的jar包，然后需要声明一个VelocityEngine对象
//	@Autowired
//	private VelocityEngine velocityEngine;

	//@Override
	public void run() {
		MimeMessage msg;

		for (Maillist mail : maillistService.selectMailList(size)) {

			try {
				msg = createMimeMessage(mail);
				mailSender.send(msg);
				maillistService.markSuccess(mail);
			} catch (Exception e) {

				maillistService.markFail(mail);
				e.printStackTrace();
				// TODO: handle exception
			}
			System.out.println(mail.toString());

		}
		// TODO Auto-generated method stub
		//generateMail01.init(); 
		  testMail01.init();
		//System.out.println(root);
		// System.out.println(this.toString());
		System.out.println((new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()));

	}

	public MimeMessage createMimeMessage(Maillist email) throws MessagingException, UnsupportedEncodingException {

		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "GB2312");
		messageHelper.setSubject(email.getSubject());
		messageHelper.setText(FileUtil.loadFile(email.getContent(), "GB2312"), true);
		messageHelper.setTo(email.getEmailto().split(";"));
		messageHelper.setCc(email.getEmailcc().split(";"));
		messageHelper.setBcc(email.getEmailbc().split(";"));
		String[] attchs = email.getAttpath().split(";");
		for (int i = 0; i < attchs.length; i++) {
			File file = new File(attchs[i]);
			if (file.exists()) {
				messageHelper.addAttachment(file.getName(), file);
			}
		}
		messageHelper.setSentDate(VeDate.getNow());
		return mimeMessage;
	}

	 

	public void templateSend() throws MessagingException {
		// // 声明Map对象，并填入用来填充模板文件的键值对
		// Map<String, Object> model = new HashMap<String, Object>();
		// model.put("user", "hehaiyang");
		// model.put("content", "good evening !");
		// // Spring提供的VelocityEngineUtils将模板进行数据填充，并转换成普通的String对象
		// // 文件地址相对应src目录
		// String emailText =
		// VelocityEngineUtils.mergeTemplateIntoString(velocityEngine,
		// root+"/velocity/mail.vm", model);
		// 和上面一样的发送邮件的工作
		// MimeMessage msg = mailSender.createMimeMessage();
		// MimeMessageHelper helper = new MimeMessageHelper(msg, true);
		// helper.setFrom(mailSender.getUsername());
		// helper.setTo("234567890@qq.com");
		// helper.setSubject("Rich content mail");
		// helper.setText(emailText, true);
		//
		// mailSender.send(msg);
		// }

	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	@Override
	public String toString() {
		return "EmailProcessorService [root=" + root + ", port=" + port + ", users=" + users + ", smtp=" + smtp
				+ ", password=" + password + ", userArray=" + Arrays.toString(userArray) + "]";
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getSmtp() {
		return smtp;
	}

	public void setSmtp(String smtp) {
		this.smtp = smtp;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getUserArray() {
		return userArray;
	}

	public void setUserArray(String[] userArray) {
		this.userArray = userArray;
	}

}
