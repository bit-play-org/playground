package com.playground.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("{noop}user").authorities("ROLE_USER");
		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").authorities("ROLE_ADMIN");
	}
		
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/secured/**").access("hasRole('ROLE_ADMIN')")
		.and().formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("")
		.failureUrl("/login?error")
		.usernameParameter("userName")
		.passwordParameter("pass")
		.and()
		.logout().logoutUrl("/login?logout")
		.and()
		.csrf();
	}
}
