package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Laptop implements InitializingBean,DisposableBean{
	
	private int price;
	private String processor;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getProcessor() {
		return processor;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	@Override
	public String toString() {
		return "Laptop [price=" + price + ", processor=" + processor + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// after property set it will be running initialization
		System.out.println("I am buying the Laptop from Showroom");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		// this will be running for destroy
		
		System.out.println("Brought it now leaving the shoroom");
		
	}
	
	
}
