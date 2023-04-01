package com.springcore.autowiring;

public class Employee {
	
	// properties 
	
	private String eName;
	private int salary;
	private Address address;


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String eName, int salary, Address address) {
		super();
		this.eName = eName;
		this.salary = salary;
		this.address = address;
		System.out.println("Inside Constructor");
	}


	public String geteName() {
		return eName;
	}


	public void seteName(String eName) {
		this.eName = eName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", salary=" + salary + ", address=" + address + "]";
	}
		
	

}
