package com.skillio;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	Teacher t1 = new Teacher();
    	Teacher t2 = new Teacher();
    	Teacher t3 = new Teacher();
    	
    	System.out.println(t1);
    	System.out.println(t2);
    	System.out.println(t3);
    	
    	System.out.println("------------------------");
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	
    	//Sample obj = ac.getBean("s", Sample.class); //new Student();
    	//obj.name();    	
    	
    	Teacher tch1 = ac.getBean("s", Teacher.class);
    	Teacher tch2 = ac.getBean("s", Teacher.class);
    	Teacher tch3 = ac.getBean("s", Teacher.class);
    	
    	System.out.println(tch1);
    	System.out.println(tch2);
    	System.out.println(tch3);
    	
    	
    	

    }
}
