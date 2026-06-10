package com.skillio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller + @ResponseBody
public class EmployeeController {
	
	@GetMapping("/emp")
	public String test() {
		return "Employee class";
	}
	
	@PostMapping("/pemp")
//	public @ResponseBody String sample() {
	public String sample() {
		return "We are using POST method..!!";
	}
	
	
	
	@PutMapping("/pemp")
	public String updateData() {
		return "We are using PUT MAPPING";
	}
	
	@DeleteMapping("/pemp")
	public String deleteData() {
		return "We are using DELETEEEEEEEEEE";
	}
	

}


//SELECT	---> @GetMapping    R
//INSERT	---> @PostMapping   C
//UPDATE  ---> @PutMapping    U
//DELETE  ---> @DeleteMapping D



