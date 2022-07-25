package com.itaspirants;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class LoggingToDatabase {
	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(LoggingToDatabase.class.getName());

	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("Output of console appender:");
		log.debug("Debug message to database");
		log.info("Info message to database");
		System.out.println("Logic executed successfully....");
		System.out.println("Please go through log/log.out file for logging details by file appender.");
		System.out.println("And logs table in root database for logging details database appender.");
	}
}
