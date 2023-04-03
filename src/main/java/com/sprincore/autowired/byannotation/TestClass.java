package com.sprincore.autowired.byannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main (String args[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sprincore/autowired/byannotation/autoconfig.xml");
		Employee employee1 = context.getBean("employee",Employee.class);
		System.out.println(employee1);
	
	}
  
}
