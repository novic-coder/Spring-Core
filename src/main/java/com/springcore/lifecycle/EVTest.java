package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EVTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconf.xml");
		/*ElectronicVehicle ev1 = (ElectronicVehicle)context.getBean("ev1");
		System.out.println(ev1);
		*/
		// registering shutdown hook in order to initialize destroy
		
		context.registerShutdownHook();
		
		/*System.out.println("-------------------------------------");
		Laptop laptop = (Laptop)context.getBean("laptop1");
		System.out.println(laptop);*/
		
		Mobile mobile1 = (Mobile)context.getBean("mobile");
		System.out.println(mobile1);
		
	}

}
