package com.skillio;

public class Student {

	private int rollno;
	private String name;
	private String address;
	
	private Batch b;

	
	
	
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Batch getB() {
		return b;
	}

	public void setB(Batch b) {
		this.b = b;
	}

	
	public Student() {}
	
	public Student(int rollno, String name, String address, Batch b) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.b = b;
	}

	public void studentDetails() {
	
		b.setId(101);
		b.setName("FULLSTACK");
		System.out.println("Student batch is = "+ b.getName());
	}
	
	public void studentData() {
		b.setId(101);
		b.setName("FULLSTACK");
		System.out.println("Student batch Data is = "+ b.getName());
	}
	
	
}
