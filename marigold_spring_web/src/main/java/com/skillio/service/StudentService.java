package com.skillio.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.skillio.model.Student;

@Service
public class StudentService {

	public Student getStudent(int rollno) {
		Student s1 = new Student(1,"Vinod", "Pune");
		Student s2 = new Student(2,"Don", "Pune");
		Student s3 = new Student(4,"Aliya", "Pune");
		Student s4 = new Student(5,"Virot", "Pune");
		Student s5 = new Student(7,"Salmon", "Pune");
		

		List<Student> students = Arrays.asList(s1, s2, s3, s4, s5);

		for(Student std: students) {
		
			if(std.getRollno() == rollno) {
				return std;
			}
		}
		return new Student();
	}
}
