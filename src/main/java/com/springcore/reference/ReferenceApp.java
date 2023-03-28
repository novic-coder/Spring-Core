package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceApp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/reference/refconfig.xml");
		 Book book = (Book)context.getBean("book1");
		 System.out.println(book.getBookName());
		 System.out.println(book.getAuthorName());
		 
		 Book book2 = (Book)context.getBean("book2");
		 System.out.println(book2.getBookName());
		 System.out.println(book2.getAuthorName());
	}

}
