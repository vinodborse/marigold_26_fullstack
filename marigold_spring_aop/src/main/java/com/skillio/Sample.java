package com.skillio;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Sample {
	
//	@Before("execution(public void *data())")
//	public void belcome() {
//		System.out.println("Welcome");
//	}
	
//	@After("execution(public void data())")
//	public void bye() {
//		System.out.println("Bye");
//	}
	
	@Around("execution(public void data())")
	public void abc(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Welcome");
		pjp.proceed();
		System.out.println("Bye");
	}
	
}




