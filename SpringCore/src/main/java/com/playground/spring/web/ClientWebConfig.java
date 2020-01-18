package com.playground.spring.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.playground.spring.security.SecurityConfig;

@EnableWebMvc
@Configuration
@ComponentScan({"com.playground.spring.*"})
@Import({SecurityConfig.class})
public class ClientWebConfig implements WebMvcConfigurer {
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver bean = new InternalResourceViewResolver();
		//bean.setViewClass(JstlView.class);
		bean.setPrefix("/pages/");
		bean.setSuffix(".jsp");
		System.out.println("Bean {viewResolver} created...");
		
		return bean;
	}
}
