package com.skillio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Student {
	
	//localhost:8080/<web-app>/std

	@GetMapping("/std")
	public void hello() {
		System.out.println("Hello Students");
	}
}