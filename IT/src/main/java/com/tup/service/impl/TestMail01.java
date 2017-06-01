package com.tup.service.impl;

import java.io.File;
import java.io.StringWriter;
import java.util.UUID;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tup.commons.utils.CustomizedPropertyPlaceholderConfigurer;
import com.tup.commons.utils.FileUtil;
import com.tup.commons.utils.VeDate;
import com.tup.service.ITestMail01;

@Service
public class TestMail01 implements ITestMail01 {
	@Autowired
	private VelocityEngine velocityEngine;

	private String root;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tup.service.impl.ITestMail01#init()
	 */
	@Override
	public void init() {

		UUID uuid = UUID.randomUUID();	 
		root = CustomizedPropertyPlaceholderConfigurer.getContextProperty("tup.folder").toString();
		System.out.println("test");
		System.out.println(root);
		String att1template = "velocity/mail2.vm";
		VelocityContext context = contextAttch01();
		String html = getContent(context, att1template);
		String file = root + this.getClass().getName() + File.separator 
				+ VeDate.getStringDateShort() + File.separator
				+ (uuid.toString())+".txt";
		FileUtil.saveFile(file, html);
		System.out.println(file);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.tup.service.impl.ITestMail01#getContent()
	 */
	private VelocityContext contextAttch01() {

		VelocityContext context = new VelocityContext();
		// 向VelocityContext中放入键值
		context.put("user", "张三1");
		context.put("content", "123456789");
		context.put("age", "20");
		context.put("address", "陕西西安");
		context.put("blog", "http://blogjava.net/sxyx2008");
		return context;
	}

	public String getContent(VelocityContext context, String template) {

		// 实例化一个StringWriter
		StringWriter writer = new StringWriter();
		// 从vm目录下加载hello.vm模板,在eclipse工程中该vm目录与src目录平级
		velocityEngine.mergeTemplate(template, "UTF-8", context, writer);
		return writer.toString();
	}
}
