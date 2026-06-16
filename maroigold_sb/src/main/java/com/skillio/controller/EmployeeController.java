package com.skillio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.model.Employee;
import com.skillio.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;

	@GetMapping("/employee/{email}")
	public Employee getEmployeeByEmail(@PathVariable("email") String email) {
		return es.getEmployee(email);	
	}
}
