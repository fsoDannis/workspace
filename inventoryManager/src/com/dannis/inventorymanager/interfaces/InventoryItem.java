package com.dannis.inventorymanager.interfaces;

public interface InventoryItem {
		// set name of inventoryItem
		public boolean setName(String name);
		
		// set price of inventoryItem
		public boolean setPrice(double price);
		
		// set qty of inventoryItem
		public boolean setQty(int qty);
		
		
		// get name of inventoryItem
		public String getName();
		
		// get price of inventoryItem
		public double getPrice();
		
		// get qty of inventoryItem
		public int getQty();

}
