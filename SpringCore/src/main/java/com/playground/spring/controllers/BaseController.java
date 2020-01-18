package com.playground.spring.controllers;



import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	
	@RequestMapping(value = {"/", "/home"})
	public String loadIndex() {
		return "login";
	}
	
	@RequestMapping("/secured/welcome")
	public String welcome(Authentication authentication) {
		
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		String userForward = "user";
		if(userDetails.getAuthorities() != null && userDetails.getAuthorities().size() > 0) {
			for (GrantedAuthority grantedAuthority :userDetails.getAuthorities()) {
				String authority =  grantedAuthority.getAuthority();
				
				
				if("ROLE_ADMIN".equals(authority)) {
					userForward = "admin";
				}else if ("ROLE_DBA".equals(authority)) {
					userForward = "dba";
				}
				
				
			}
		}else {
			System.out.println("No authorities granted...");
		}
		
		System.out.println("Userforward: "+userForward);
		return userForward;
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
