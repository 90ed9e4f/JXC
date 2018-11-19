package com.l2r.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页控制器
 * @author 郭鹏
 *
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	public String root() {
		return "redirect:/login.html";
	}
}
