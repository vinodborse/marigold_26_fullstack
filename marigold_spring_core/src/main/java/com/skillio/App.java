package com.skillio;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	
    	Sample obj = ac.getBean("s", Sample.class); //new Student();
    	obj.name();
    }
}
