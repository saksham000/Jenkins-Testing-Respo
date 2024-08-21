package com.jenkins.practice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class PracticeApplication {

	public static Logger  = LoggerFactory.getLogger(PracticeApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application Started...");
	}

	public static void main(String[] args) {
		logger.info("Application Running...");
		logger.info("Application Running For Second Time...");
		SpringApplication.run(PracticeApplication.class, args);
	}

}
