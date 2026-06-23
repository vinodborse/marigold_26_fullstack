package com.skillio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.model.Student;
import com.skillio.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService ss;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student std) {
		return ss.saveStudent(std);
	}
}
