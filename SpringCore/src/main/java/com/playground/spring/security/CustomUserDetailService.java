package com.playground.spring.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.playground.spring.beans.Login;
import com.playground.spring.services.LoadLoginService;

public class CustomUserDetailService implements UserDetailsService{

	Map<String, CustomeUser> userDb = new HashMap<String, CustomeUser>();
	
	@Autowired
	@Qualifier("loadLoginServiceBean")
	LoadLoginService loadLoginService;
		
	private Map<String, CustomeUser> getUserMap() {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		CustomeUser adminUser = new CustomeUser("admin", encoder.encode("admin"), "ADMIN", "USER");
		
		CustomeUser user = new CustomeUser("user", encoder.encode("user"), "USER");
		
		CustomeUser dba = new CustomeUser("dba", encoder.encode("dba"), "DBA", "USER");
		
		userDb.put("admin", adminUser);
		userDb.put("dba", dba);
		userDb.put("user", user);
		
		return userDb;
	}
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();		
		//CustomeUser loadedUser = getUserMap().get(username);
		CustomeUser loadedUser = null;
		Login loggedInUser = loadLoginService.loadUserByLoginId(username);
		
		if(loggedInUser != null) {
			loadedUser = new CustomeUser();
			loadedUser.setUserName(loggedInUser.getUserName());
			loadedUser.setPassword(encoder.encode(loggedInUser.getPassword()));
			loadedUser.setRoles(loggedInUser.getRoles());
			
			
			if(loadedUser != null) {
				
				System.out.println("User : "+username+" Loaded");
				UserBuilder builder = User.withUsername(username);
				builder.password(loadedUser.getPassword());
				builder.roles(loadedUser.getRoles());
				return builder.build();
				
			}
		}else {
			System.out.println("User : "+username+" Not Found");
			throw new UsernameNotFoundException(username);
		}
		
		return null;
		
	}

	/*@Bean
	public LoadLoginService loadLoginServiceBean() {
		return new LoadLoginService();
	}*/
}
