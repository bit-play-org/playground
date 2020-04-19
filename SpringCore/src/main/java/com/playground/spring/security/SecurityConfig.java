package com.playground.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserDetailsService userDetailService;
	
	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		//auth.inMemoryAuthentication().passwordEncoder(passwordEncoder).withUser("user").password(passwordEncoder.encode("user")).roles("USER");
		//auth.inMemoryAuthentication().passwordEncoder(passwordEncoder).withUser("admin").password(passwordEncoder.encode("admin")).roles("ADMIN");
		System.out.println("Validating user details");
		auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder);
	}
		
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/pages/**").denyAll()
		.antMatchers("/secured/user").hasAnyRole("USER", "ADMIN", "DBA")
		.antMatchers("/secured/admin").hasAnyRole("ADMIN")
		.antMatchers("/secured/dba").hasAnyRole("DBA")
		.and().formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/secured/welcome")
		.failureUrl("/login?error")
		.usernameParameter("username")
		.passwordParameter("password")
		.and()
		.logout().logoutUrl("/login?logout")
		.invalidateHttpSession(true)
		.and()
		.exceptionHandling().accessDeniedPage("/access-denied")
		.and()
		.csrf();
		
		/*http.authorizeRequests()
		.antMatchers("/secured/**").access("hasRole('ROLE_ADMIN')")
		.and().formLogin();*/
	}
	
	@Bean
	  public UserDetailsService userDetailsService() {
	    return new CustomUserDetailService();
	  };
	
	@Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
