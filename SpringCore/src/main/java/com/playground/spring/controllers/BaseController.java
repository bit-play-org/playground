package com.playground.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	@RequestMapping(value = {"/", "/home"})
	public String loadIndex() {
		return "index";
	}
	
	@RequestMapping("/secured/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@RequestMapping("/secured/admin")
	public String admin() {
		return "admin";
	}
	
	@RequestMapping("/secured/user")
	public String user() {
		return "user";
	}
	
	@RequestMapping("/secured/dba")
	public String dba() {
		return "dba";
	}
}
