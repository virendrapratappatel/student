package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan({"com.student"})
@SpringBootApplication
@EnableCaching
public class StudentApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
		
	}
	

}
