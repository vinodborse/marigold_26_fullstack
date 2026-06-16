package com.skillio.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.skillio.model.Employee;

@Service
public class EmployeeService {

	public List<Employee> allEmployees() {
		Employee e1 = new Employee(1, "Vinod", "vinod@gmail.com", 123, "IT", 100000, "Pune");
		Employee e2 = new Employee(23, "Don", "don@gmail.com", 345, "IT", 25000, "Pune");
		Employee e3 = new Employee(4, "Lala", "lala@gmail.com", 321, "ADMIN", 5000, "Pune");
		Employee e4 = new Employee(45, "Shemdi", "shemdi@gmail.com", 432, "ADMIN", 5000, "Pune");
		Employee e5 = new Employee(7, "Aliya", "aliya@gmail.com", 231, "ADMIN", 7000, "Pune");
		Employee e6 = new Employee(8, "Salmon", "salmon@gmail.com", 222, "HR", 12000, "Pune");
		Employee e7 = new Employee(9, "Thakela", "thakela@gmail.com", 989, "HR", 15000, "Pune");
		Employee e8 = new Employee(2, "Ramu", "ramu@gmail.com", 4356, "HR", 15000, "Pune");
		
		return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8);
	}
	
	
	public Employee getEmployee(String email) {
		for(Employee emp: allEmployees()) {
			if(emp.getEmail().equals(email)) {
				return emp;
			}
		}
		return new Employee();
	}
	
	
	
}
