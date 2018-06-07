package com.demo.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(AppRunner.class);

	public void run(ApplicationArguments args) throws Exception {
		LOGGER.info("option names : {}", args.getOptionNames());
		LOGGER.info("args         : {}", args.getNonOptionArgs());
	}

}