package com.skillio.service;

import java.util.List;
import java.util.Optional;

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

	public Student studentByRollno(Long rollno) {
		Optional<Student> s1 = sr.findById(rollno);
		if(s1.isPresent()) {
			return s1.get();
		} else {
			return new Student();
		}
	}

	public List<Student> getStudentByName(String name) {
		return sr.findByName(name);
	}

	public List<Student> getAllStudents() {
		return sr.findAll();
	}

	public Student getByMail(String mail) {
		return sr.findByMail(mail).orElse(new Student());
	}
	
}
