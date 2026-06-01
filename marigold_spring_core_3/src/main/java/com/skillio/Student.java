package com.skillio;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	private Batch b;
	
	public void studentDetails() {
		System.out.println("From student"); 
		b.batchName();
	}
}
