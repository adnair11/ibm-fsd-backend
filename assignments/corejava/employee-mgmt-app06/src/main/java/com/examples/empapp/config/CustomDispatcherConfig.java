package com.examples.empapp.config;



import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.examples.empapp.dao.EmployeeDAO;
import com.examples.empapp.service.EmployeeService;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.examples.empapp")
public class CustomDispatcherConfig {
	@Bean
	EmployeeService empService()
	{
		return new EmployeeService();
	}
	
	@Bean
	 EmployeeDAO empDao () {
		return new EmployeeDAO();
	}
	
	@Bean
	public MysqlDataSource dataSource()
	{
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setServerName("localhost");
		dataSource.setDatabaseName("jdbctraining");
		dataSource.setUser("training");
		dataSource.setPassword("training");
   
		return dataSource;
	}
	@Bean
	public Connection conn()
	{
		
		Connection conn=null;
		     try {
				conn = dataSource().getConnection();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		     return conn;
	}
	

   
    

}
