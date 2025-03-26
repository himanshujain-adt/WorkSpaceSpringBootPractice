package com.example.dto;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

public class LogCheck {
private static final Log  log=LogFactory.getLog(LogCheck.class);
public void message() {
	log.info("This is INFO message");
	log.error("This is error message");
}

}
