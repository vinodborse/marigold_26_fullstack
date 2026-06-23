package com.skillio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillio.model.Student;
import com.skillio.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository sr;
	
	public Student saveStudent(Student std) {
		Student s = sr.save(std);
		return s;
	}

}
