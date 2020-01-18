package com.playground.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JDBCConfig {
	@Bean("dataSourceBean")
    public DataSource mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/sample_app");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
 
        return dataSource;
    }
	
	@Bean("jdbcTemplateBean")
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		
		/*if(dataSource == null) {
			System.out.println("Datasource not found...");
			dataSource = mysqlDataSource();
		}*/
		
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }
}
