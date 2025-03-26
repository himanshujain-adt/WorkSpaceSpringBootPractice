package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dto.LogCheck;

@SpringBootApplication
public class EmployeeModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeModuleApplication.class, args);
		  LogCheck logCheck = new LogCheck();
	        logCheck.message();
	}

}
