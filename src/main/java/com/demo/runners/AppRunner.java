package com.demo.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.demo.config.AppConfig;

@Component
public class AppRunner implements ApplicationRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(AppRunner.class);

	@Autowired
	AppConfig appConfig;

	public void run(ApplicationArguments args) throws Exception {
		LOGGER.info("option names : {}", args.getOptionNames());
		LOGGER.info("args         : {}", args.getNonOptionArgs());
		LOGGER.info("string       : {}", appConfig.getS());
		LOGGER.info("boolean      : {}", appConfig.isB());
		LOGGER.info("Date         : {}", appConfig.getD());
		LOGGER.info("BigDecimal   : {}", appConfig.getI());
		for (int i = 0; i < appConfig.getL().size(); i++) {
			LOGGER.info("list {}       : {}", i, appConfig.getL().get(i));

		}
	}

}