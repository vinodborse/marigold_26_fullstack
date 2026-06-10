package com.skillio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherController {

	@GetMapping("/data")
	public void data() {
		System.out.println("Hello Teacher");
	}
	

	@GetMapping("/tch")
	public void detail() {
		System.out.println("Teacher:- Vinod");
	}
}
