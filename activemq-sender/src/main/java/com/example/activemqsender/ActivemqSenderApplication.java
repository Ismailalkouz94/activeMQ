package com.example.activemqsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ActivemqSenderApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqSenderApplication.class, args);
	}

}
