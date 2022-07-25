package com.itaspirants;

import org.apache.log4j.Logger;

public class LoggingWithLog4JMultipleAppenders {
	static Logger logger = Logger.getLogger(LoggingWithLog4JMultipleAppenders.class);

	public static void main(String[] args) {
		System.out.println("Output of console appender:");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.fatal("This is fatal message");
		logger.error("This is error message");
		System.out.println("Logic executed successfully....");
		System.out.println("Please go through log/log.out file for logging details by file appender.");
	}
}



