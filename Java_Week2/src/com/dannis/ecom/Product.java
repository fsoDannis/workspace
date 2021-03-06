package com.dannis.ecom;

public interface Product {

	// set name of product
	public boolean setName(String name);
	
	// set price of product
	public boolean setPrice(double price);
	
	// get name of product
	public String getName();
	
	// get price of product
	public double getPrice();
}
