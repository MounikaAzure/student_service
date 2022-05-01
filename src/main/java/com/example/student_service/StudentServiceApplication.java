package com.example.student_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentServiceApplication {

	public static void main(String[] args) {
		System.out.println("Starting the web server");
		SpringApplication.run(StudentServiceApplication.class, args);
	}

}
