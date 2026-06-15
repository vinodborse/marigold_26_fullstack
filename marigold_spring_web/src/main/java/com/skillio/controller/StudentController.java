package com.skillio.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.model.Student;
import com.skillio.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	
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
	
	@GetMapping("/student-details-pv/{rn}/{nm}/{add}") // GET:- localhost:8080/web-app/student-details/3
	public Student studentDetailsPV(@PathVariable("rn") int rollno,
									@PathVariable("nm") String name,
									@PathVariable("add") String address) {
		return new Student(rollno, name, address);
	}
	
	
	@GetMapping("/student-details-rp") // GET:- localhost:8080/web-app/student-details?rn=420
	public Student studentDetailsRP(@RequestParam("rn") int rollno,
									@RequestParam("nm") String name,
									@RequestParam("add") String address) {
		return new Student(rollno, name, address);
	}
	
	
	@GetMapping("/student-details-rb/{data}") // GET:- localhost:8080/web-app/student-details
	public Student studentDetailsRB (@RequestBody Student std) {
		return std;
	}
	
	
	
	@GetMapping("/student-details/{rn}") // GET:- localhost:8080/web-app/student-details
	public Student studentDetails (@PathVariable("rn") int rollno) {
	

		Student std = ss.getStudent(rollno);
		
		return std;
	}
	
	
}

/*
com.skillio.model
		Student.java

com.skillio.controller
		@RestController
		StudentController.java

com.skillio.service
		@Service
		StudentService.java
*/


