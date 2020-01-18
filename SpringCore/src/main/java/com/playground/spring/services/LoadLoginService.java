package com.playground.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.playground.spring.beans.Login;
import com.playground.spring.beans.Role;

@Service("loadLoginServiceBean")
public class LoadLoginService {
	
	
	public LoadLoginService() {}
	
	@Autowired
	@Qualifier("jdbcTemplateBean")
    JdbcTemplate jdbcTemplate;
	
	public Login loadUserByLoginId(String loginName) {
		
		/*if(jdbcTemplate == null) {
			ApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);
			jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplateBean");
		}*/
		
		
		Login login = (Login) jdbcTemplate.queryForObject("SELECT login_id, login_name, password FROM login_details where login_name = ? ",
	            new Object[] { loginName }, new BeanPropertyRowMapper(Login.class));
		if(login != null) {
			
			
			
			Role [] roles = (Role[])jdbcTemplate.queryForObject("SELECT rl.role_id, rl.role_name, rl.description FROM user_roles us, roles rl where us.role_id = rl.role_id and login_id = ? ",
		            new Object[] { login.getLoginId() }, new BeanPropertyRowMapper(Role.class));
			
			System.out.println("Roles : "+roles);
			if(roles != null && roles.length > 0) {
				int roleCount = roles.length;
				String [] dbRoles = new String[roleCount];
				
				for (Role role : roles) {
					dbRoles[--roleCount] = role.getRole();					
				}
				
				login.setRoles(dbRoles);
			}
			
			
		}
		System.out.println("Loaded User : "+login);
	    return login;
	}
}
