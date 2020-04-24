package com.example.activemqreceiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ActivemqReceiverApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqReceiverApplication.class, args);
	}

}
