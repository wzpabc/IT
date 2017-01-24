//package com.tup.service.impl;
//
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Properties;
//
//import javax.mail.Address;
//import javax.mail.BodyPart;
//import javax.mail.Message;
//import javax.mail.Message.RecipientType;
//import javax.mail.MessagingException;
//import javax.mail.Multipart;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//
//import com.tup.commons.base.EmailAuthenticator;
//import com.tup.model.JobEmail;
//
//public class SimpleMailSender {
//
//	public static void sendMessage(String smtpHost, String from, String fromUserPassword, String to, String subject,
//			String messageText, String messageType) {
//		// 第一步：配置javax.mail.Session对象
//		System.out.println("为" + smtpHost + "配置mail session对象");
//
//		Properties props = new Properties();
//		props.put("mail.smtp.host", smtpHost);
//		props.put("mail.smtp.starttls.enable", "true");// 使用 STARTTLS安全连接
//		// props.put("mail.smtp.port", "25"); //google使用465或587端口
//		props.put("mail.smtp.auth", "true"); // 使用验证
//		// props.put("mail.debug", "true");
//		Session mailSession = Session.getInstance(props, new EmailAuthenticator(from, fromUserPassword));
//
//		// 第二步：编写消息
//		System.out.println("编写消息from——to:" + from + "——" + to);
//
//		InternetAddress fromAddress = new InternetAddress(from);
//		InternetAddress toAddress = new InternetAddress(to);
//
//		MimeMessage message = new MimeMessage(mailSession);
//
//		message.setFrom(fromAddress);
//		message.addRecipient(RecipientType.TO, toAddress);
//
//		message.setSentDate(Calendar.getInstance().getTime());
//		message.setSubject(subject);
//		message.setContent(messageText, messageType);
//
//		// 第三步：发送消息
//		Transport transport = mailSession.getTransport("smtp");
//		transport.connect(smtpHost, "chaofeng19861126", fromUserPassword);
//		Transport.send(message, message.getRecipients(RecipientType.TO));
//		System.out.println("message yes");
//	}
//
//	 
//
//	/**
//	 * 以文本格式发送邮件
//	 * 
//	 * @param mailInfo
//	 *            待发送的邮件的信息
//	 */
//	public boolean sendTextMail(JobEmail mailInfo) {
//		// 判断是否需要身份认证
//		EmailAuthenticator authenticator = null;
//		Properties pro = mailInfo.getProperties();
//		if (mailInfo.isValidate()) {
//			// 如果需要身份认证，则创建一个密码验证器
//			authenticator = new EmailAuthenticator(mailInfo.getUserName(), mailInfo.getPassword());
//		}
//		// 根据邮件会话属性和密码验证器构造一个发送邮件的session
//		Session sendMailSession = Session.getDefaultInstance(pro, authenticator);
//		try {
//			// 根据session创建一个邮件消息
//			Message mailMessage = new MimeMessage(sendMailSession);
//			// 创建邮件发送者地址
//			Address from = new InternetAddress(mailInfo.getFromAddress());
//			// 设置邮件消息的发送者
//			mailMessage.setFrom(from);
//			// 创建邮件的接收者地址，并设置到邮件消息中
//			Address to = new InternetAddress(mailInfo.getToAddress());
//			mailMessage.setRecipient(Message.RecipientType.TO, to);
//			// 设置邮件消息的主题
//			mailMessage.setSubject(mailInfo.getSubject());
//			// 设置邮件消息发送的时间
//			mailMessage.setSentDate(new Date());
//			// 设置邮件消息的主要内容
//			String mailContent = mailInfo.getContent();
//			mailMessage.setText(mailContent);
//			// 发送邮件
//			Transport.send(mailMessage);
//			return true;
//		} catch (MessagingException ex) {
//			ex.printStackTrace();
//		}
//		return false;
//	}
//
//	/**
//	 * 以HTML格式发送邮件
//	 * 
//	 * @param mailInfo
//	 *            待发送的邮件信息
//	 */
//	public  boolean sendHtmlMail(JobEmail mailInfo) {
//		// 判断是否需要身份认证
//		EmailAuthenticator authenticator = null;
//		Properties pro = mailInfo.getProperties();
//		// 如果需要身份认证，则创建一个密码验证器
//		if (mailInfo.isValidate()) {
//			authenticator = new EmailAuthenticator(mailInfo.getUserName(), mailInfo.getPassword());
//		}
//		// 根据邮件会话属性和密码验证器构造一个发送邮件的session
//		Session sendMailSession = Session.getDefaultInstance(pro, authenticator);
//		try {
//			// 根据session创建一个邮件消息
//			Message mailMessage = new MimeMessage(sendMailSession);
//			// 创建邮件发送者地址
//			Address from = new InternetAddress(mailInfo.getFromAddress());
//			// 设置邮件消息的发送者
//			mailMessage.setFrom(from);
//			// 创建邮件的接收者地址，并设置到邮件消息中
//			Address to = new InternetAddress(mailInfo.getToAddress());
//			// Message.RecipientType.TO属性表示接收者的类型为TO
//			mailMessage.setRecipient(Message.RecipientType.TO, to);
//			// 设置邮件消息的主题
//			mailMessage.setSubject(mailInfo.getSubject());
//			// 设置邮件消息发送的时间
//			mailMessage.setSentDate(new Date());
//			// MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象
//			Multipart mainPart = new MimeMultipart();
//			// 创建一个包含HTML内容的MimeBodyPart
//			BodyPart html = new MimeBodyPart();
//			// 设置HTML内容
//			html.setContent(mailInfo.getContent(), "text/html; charset=utf-8");
//			mainPart.addBodyPart(html);
//			// 将MiniMultipart对象设置为邮件内容
//			mailMessage.setContent(mainPart);
//			// 发送邮件
//			Transport.send(mailMessage);
//			return true;
//		} catch (MessagingException ex) {
//			ex.printStackTrace();
//		}
//		return false;
//	}
//}
