package com.springcore.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Employee;

public class AdditionMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ambiguity/Ambiguityref.xml");
		Addition add1 = (Addition) context.getBean("addition1");
		add1.doSum();
		Addition add2 = (Addition) context.getBean("addition2");
		add2.doSum();
		Addition add3 = (Addition) context.getBean("addition3");
		add3.doSum();

	}

}
