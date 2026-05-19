package com.skillio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
        Configuration cf = new Configuration().configure("hibernate.cfg.xml")
    											.addAnnotatedClass(Student.class)
    											.addAnnotatedClass(Teacher.class);
    	SessionFactory sf = cf.buildSessionFactory();
    	
    	Session session =sf.openSession();
    	
    	session.beginTransaction();
    	//----
/*    	Student s1 = new Student();
    	s1.setRollno(1);
    	s1.setName("Vinod");
    	s1.setAddress("Pune");
    	
    	Student s2 = new Student(6, "Lala", "Mumbai");
    	Student s3 = new Student(7, "Ramu", "Mumbai");
    	Student s4 = new Student(8, "Shmbdya", "Salim ki gali");
*/
/*    	List<Student> stds = new ArrayList<Student>();    	
    	stds.add(s1);
    	stds.add(s2);
    	stds.add(s3);
    	stds.add(s4);
    	
    //	List<Student> stds = Arrays.asList(s1, s2, s3,s4);
    		
  	for(Student s: stds) {
    		session.persist(s);
    	}
*/
    	
    	//session.save(s);
//    	session.persist(s1);
//    	session.persist(s2);
//   	session.persist(s3);
//    	session.persist(s4);
    	
    	// SELECT * FROM student WHERE rollno = 2;
/*    	
        Student s = session.get(Student.class, 2);
        System.out.println(s.getName());
*/    	
    	
/*    	
    	Student s = session.get(Student.class, 7);
    	
    	System.out.println("BEFORE:- "+ s.getName());
    	
    	s.setName("Ramu kaka");
*/    	
    	
    	Student s = session.get(Student.class, 8);
    	
    	session.remove(s);
    	// DELETE FROM student WHERE rollno = 8;
    	
    	//----
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
