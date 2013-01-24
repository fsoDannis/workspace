package com.dannis.findit;

import android.content.Context;
import android.widget.GridLayout;
import android.widget.TextView;

public class placesDisplay extends GridLayout{

	//Setting the textview Placeholders for the values
	TextView _businessName;
	TextView _address;
	TextView _phoneNumber;
	TextView _location;
	Context _context;
	
	public placesDisplay(Context context){
		super(context);
		
		_context = context;
		
		this.setColumnCount(2);
		
		//SETTING THE LABELS AND THE PLACEHOLDERS FOR CONTENT
		TextView businessNameLabel = new TextView(_context);
		businessNameLabel.setText("Business Name: ");
		_businessName = new TextView(context);
		
		TextView addressLabel = new TextView(_context);
		addressLabel.setText("Address: ");
		_address = new TextView(context);
		
		TextView phoneNumberLabel = new TextView(_context);
		phoneNumberLabel.setText("Phone Number: ");
		_phoneNumber = new TextView(context);
		
		TextView locationLabel = new TextView(_context);
		locationLabel.setText("Location: ");
		_location = new TextView(context);
		
		this.addView(businessNameLabel);
		this.addView(_businessName);
		this.addView(addressLabel);
		this.addView(_address);
		this.addView(phoneNumberLabel);
		this.addView(_phoneNumber);
		this.addView(locationLabel);
		this.addView(_location);
		
		
	}
}
