package com.skillio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.model.Student;

@RestController
public class StudentController {
	
	//localhost:8080/<web-app>/std

	@GetMapping("/hello")
	public void hello() {
		System.out.println("Hello Students");
	}
	
	@GetMapping("/get-student")
	public Student getStudent() {
		Student s = new Student(1, "Vinod", "Pune");
		return s;
	}
	
	@GetMapping("/student-details")
	public Student studentDetails(int rollno) {
		return new Student(2, "Don", "Pune");
	}
	
	
	
	
}

/*
com.skillio.model
		Student.java
com.skillio.controller
		StudentController.java

*/