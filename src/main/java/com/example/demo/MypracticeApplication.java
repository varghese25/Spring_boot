package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MypracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MypracticeApplication.class, args);

		@SuppressWarnings("unused")
		Home h = context.getBean(Home.class); // Spring bean 
		h.connect();
		
		Home h2 = context.getBean(Home.class); // Spring bean 
		h.connect();
		
		
	}
}
