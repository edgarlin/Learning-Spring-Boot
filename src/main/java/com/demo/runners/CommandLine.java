package com.demo.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLine implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(CommandLine.class);

	public void run(String... args) throws Exception {
		LOGGER.info("runner");
	}

}
