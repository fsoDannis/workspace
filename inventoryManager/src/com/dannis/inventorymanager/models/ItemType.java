package com.dannis.inventorymanager.models;

public enum ItemType {
	Shoe(1),
	Sock(2),
	Shirt(3),
	Pants(4);
	
	private final int value;
	
	ItemType(int value){
		this.value = value;
	}
}
