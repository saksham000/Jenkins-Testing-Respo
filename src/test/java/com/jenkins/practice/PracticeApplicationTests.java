package com.jenkins.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PracticeApplicationTests {

	Logger logger = LoggerFactory.getLogger(PracticeApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("Test is Executed...!");
		logger.info("Jenkins is Running and pushing image to Docker !!!!");
		assertEquals(true, true);
	}

}
