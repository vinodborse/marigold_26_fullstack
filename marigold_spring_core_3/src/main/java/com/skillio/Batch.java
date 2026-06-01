package com.skillio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Batch {
	
	@Autowired
	private Teacher tch;

	public void batchName() {
		System.out.println("FULLSTACK");
		tch.teacherData();
	}
}
