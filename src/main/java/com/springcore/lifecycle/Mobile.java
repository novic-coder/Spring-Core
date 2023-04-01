package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mobile {
	
	private String brandName ;
	private int price;
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [brandName=" + brandName + ", price=" + price + "]";
	}
	
	@PostConstruct
	public void start(){
		System.out.println("Startining the initialization");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Destroying the bean ");
	}
	

}
