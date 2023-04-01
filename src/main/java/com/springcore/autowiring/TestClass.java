package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main (String args[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowiring/autoconfig.xml");
		Employee employee1 = context.getBean("employee1",Employee.class);
		System.out.println(employee1);
	
	}
  
}
