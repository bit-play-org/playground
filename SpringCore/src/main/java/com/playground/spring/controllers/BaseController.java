package com.playground.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	@RequestMapping("/")
	public String loadIndex() {
		return "index";
	}
	
	@RequestMapping("/secured/welcome")
	public String welcome() {
		return "welcome";
	}
}
