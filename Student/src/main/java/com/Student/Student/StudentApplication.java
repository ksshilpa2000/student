package com.Student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {

	
	public static void main(String[] args) {
		System.out.println("before calling run");
		SpringApplication.run(StudentApplication.class, args);
		System.out.println("after calling run");
	}

}
