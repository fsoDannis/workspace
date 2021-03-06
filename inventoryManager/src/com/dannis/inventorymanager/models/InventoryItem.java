package com.dannis.inventorymanager.models;

public class InventoryItem implements com.dannis.inventorymanager.interfaces.InventoryItem {

	
	//-----------------------------------------------------------------------
	//Private Fields
	//-----------------------------------------------------------------------
	private String _productName = "";
	private double _price = 0.0;
	private int _qty = 0;
	private ItemType _itemType;
	
	public void setItemType(ItemType thisItem){
		_itemType = thisItem;
	}
	
	@Override
	public boolean setName(String name) {
		this._productName = name;
		return false;
	}

	@Override
	public boolean setPrice(double price) {
		this._price = price;
		return false;
	}

	@Override
	public boolean setQty(int qty) {
		this._qty = qty;
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return _productName;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return _price;
	}

	@Override
	public int getQty() {
		// TODO Auto-generated method stub
		return _qty;
	}
	
	@Override
	public String toString(){
		return "Item Type: " +  _itemType +" Product name: " + _productName + " Product Price" + String.valueOf(_price) + " Number on hand:"+ String.valueOf(_qty); 
	}

}
