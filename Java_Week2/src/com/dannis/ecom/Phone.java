package com.dannis.ecom;

public class Phone implements Product {

	String name;
	double price;
	
	public Phone(String name, double price){
		setName(name);
		setPrice(price);
	}
	
	@Override
	public boolean setName(String name) {
		this.name = name;
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setPrice(double price) {
		this.price = price;
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

}
