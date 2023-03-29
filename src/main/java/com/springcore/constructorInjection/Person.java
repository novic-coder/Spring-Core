package com.springcore.constructorInjection;

import java.util.List;

public class Person {
	
	private String name;
	private int personId;
	private Certificate certificate;
	private List<String> list;
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int personId, Certificate certificate) {
		super();
		this.name = name;
		this.personId = personId;
		this.certificate = certificate;
		
	}
	
	public Person(String name, int personId, Certificate certificate, List<String> list) {
		super();
		this.name = name;
		this.personId = personId;
		this.certificate = certificate;
		this.list = list;
		
	}

	@Override
	public String toString() {
		return this.name+" : "+this.personId+"{ "+this.certificate.certificateName+" }";
	}
	
	public String toString1() {
		return this.name+" : "+this.personId+"{ "+this.certificate.certificateName+" }"+ "{  "+this.list+" } ";
	}
	
}
