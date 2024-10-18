package com.Vithushan.BackEndProject;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackEndProjectApplication {

	public static void main(String[] args) {
		org.springframework.context.ApplicationContext context =  SpringApplication.run(BackEndProjectApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
