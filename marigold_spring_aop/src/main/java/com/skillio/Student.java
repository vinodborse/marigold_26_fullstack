package com.skillio;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	Teacher tch;

	
	public void data() {
		System.out.println("Hello Students");
		tch.tdata();

	}
	
	public void sample() {

		System.out.println("We are in sample method");
	}
	

}
