package com.springcore.lifecycle;

public class ElectronicVehicle {
	
	private String modelName;
	private int price;
	
	public ElectronicVehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectronicVehicle(String modelName, int price) {
		System.out.println("settirng attributes");
		this.modelName = modelName;
		this.price = price;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ElectronicVehicle [modelName=" + modelName + ", price=" + price + "]";
	}
	
	
	// cerating init method and destroy method  it will be called at initialization and destroy 
	
	public void init(){
		System.out.println("Inside init method");
	}
	
	public void destroy(){
		System.out.println("Inside Destroy method");
	}
}
