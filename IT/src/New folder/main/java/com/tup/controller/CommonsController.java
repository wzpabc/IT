package com.tup.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tup.commons.utils.CaptchaUtils;

/**
 * 通用的控制器
 * 
 * @author L.cm
 *
 */
@Controller
public class CommonsController {

	/**
	 * 图标页
	 */
	@GetMapping("icons.html")
	public String icons() {
		return "icons";
	}

	@GetMapping("/m_report")
	public String report() {
		return "maintain/report";
	}

	@GetMapping("/m_tup")
	public String tup() {
		return "/maintain/tup";
	}

	@GetMapping("/mailhome")
	public String mailhome() {
		return "/mail/home";
	}

	@GetMapping("/order")
	public String order() {
		return "/job/ordersync";
	}

	@PostMapping("/ordertype")
	public String jdestatus() {
		return "/data/ordertype";
	}

	/**
	 * 图形验证码
	 */

	@GetMapping("captcha.jpg")
	public void captcha(HttpServletRequest request, HttpServletResponse response) {
		CaptchaUtils.generate(request, response);
	}

}
