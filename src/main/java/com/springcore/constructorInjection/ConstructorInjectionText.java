package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionText {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/constructorinjection/constructorRef.xml");
		Person person1 = (Person)context.getBean("person");
		Person person2 = (Person)context.getBean("person2");
		Person person3 = (Person)context.getBean("person3");
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3.toString1());
		System.out.println(person3);
	}
}

