package com.yy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @ClassName IndexController
 * @Description 首页控制器
 * @Author yangfeng
 * @Date 2025/7/29 14:09
 * @Version 1.0
 */
@Controller
public class IndexController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

}