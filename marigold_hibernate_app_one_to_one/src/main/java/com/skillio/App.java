package com.skillio;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        Configuration cf = new Configuration().configure("hibernate.cfg.xml")
    											.addAnnotatedClass(User.class)
    											.addAnnotatedClass(Aadhar.class);
    	SessionFactory sf = cf.buildSessionFactory();
    	
    	Session session =sf.openSession();
    	
    	session.beginTransaction();
    	//----
    	
    	User user = new User();
    	
    	user.setId(1);
    	user.setName("Vinod");
    	user.setAddress("Pune");
    	
    	session.persist(user);
    	
    	Aadhar aadhar = new Aadhar();
    	
    	aadhar.setId(101);    	
    	aadhar.setAadharNumber(123123);
    	aadhar.setUsr(user);
    	
    	session.persist(aadhar);
    	
    	
    	
    	
    	//---
    	session.getTransaction().commit();
    	session.close();
    }
}
