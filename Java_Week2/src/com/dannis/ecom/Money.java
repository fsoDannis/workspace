package com.dannis.ecom;

import java.util.HashMap;

public enum Money {
	PENNY(1),
	NICKEL(5),
	DIME(10),
	QUARTER(25),
	DOLLAR(100);
	
	private final int value;
	
	Money(int value){
		this.value = value;
	}
	
	public static HashMap<K, V> getChange(double amount){
		
	}
}
