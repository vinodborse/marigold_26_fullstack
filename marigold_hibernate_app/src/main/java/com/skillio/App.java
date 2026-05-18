package com.skillio;

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
    	
    	
    	//----
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
