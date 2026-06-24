package com.skillio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/student/{rn}")
	public Student getStudentByRollno(@PathVariable("rn") Long rollno) {
		return ss.studentByRollno(rollno);
	}
	
	@GetMapping("/student-by-name")
	public List<Student> getStudentByName(@RequestParam("name") String name) {
		return ss.getStudentByName(name);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return ss.getAllStudents();
	}
	
	@GetMapping("/student-by-mail")
	public Student getByMail(@RequestParam("mail") String mail) {
		return ss.getByMail(mail);
	}
}
