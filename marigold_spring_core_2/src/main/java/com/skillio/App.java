package com.skillio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//    	Student s = new Student();
//    	s.setRollno(1);
//    	s.setName("Vinod");
//    	s.setAddress("Pune");
//
//    	Batch batch = new Batch();
//    	s.setB(batch);
//    	
//    	s.setB(new Batch());
    	
    	
    	
    	
//    	Student s2 = new Student(2, "Don", "Pune");
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	Student s1 = ac.getBean("std", Student.class);
    	
//    	System.out.println(s1.getName());
    	
    	s1.studentDetails();
    }
}
