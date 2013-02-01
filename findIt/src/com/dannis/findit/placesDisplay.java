package com.dannis.findit;

import android.content.Context;
import android.widget.GridLayout;
import android.widget.TextView;
import android.graphics.Color;

public class placesDisplay extends GridLayout{

	//Setting the textview Placeholders for the values
	TextView _title;
	TextView _address;
	TextView _phone;
	TextView _distance;
	Context _context;
	
	public placesDisplay(Context context){
		super(context);
		
		_context = context;
		
		this.setColumnCount(2);
		
		//SETTING THE LABELS AND THE PLACEHOLDERS FOR CONTENT
		TextView businessNameLabel = new TextView(_context);
		businessNameLabel.setText("Business Name: ");
		businessNameLabel.setBackgroundColor(Color.BLACK);
		businessNameLabel.setTextColor(Color.RED);
		businessNameLabel.setHeight(50);
		businessNameLabel.setTextSize(18);
		_title = new TextView(context);
		_title.setTextColor(Color.RED);
		_title.setBackgroundColor(Color.BLACK);
		_title.setHeight(50);
		_title.setTextSize(18);
		_title.setWidth(480);
		
		TextView addressLabel = new TextView(_context);
		addressLabel.setText("Address: ");
		addressLabel.setBackgroundColor(Color.BLUE);
		addressLabel.setTextColor(Color.WHITE);
		addressLabel.setHeight(50);
		addressLabel.setTextSize(18);
		addressLabel.setWidth(234);
		_address = new TextView(context);
		_address.setTextColor(Color.WHITE);
		_address.setBackgroundColor(Color.BLUE);
		_address.setHeight(50);
		_address.setTextSize(18);
		_address.setWidth(480);
		
		TextView phoneNumberLabel = new TextView(_context);
		phoneNumberLabel.setText("Phone Number: ");
		phoneNumberLabel.setBackgroundColor(Color.BLUE);
		phoneNumberLabel.setTextColor(Color.WHITE);
		phoneNumberLabel.setHeight(50);
		phoneNumberLabel.setTextSize(18);
		phoneNumberLabel.setWidth(234);
		_phone = new TextView(context);
		_phone.setTextColor(Color.WHITE);
		_phone.setBackgroundColor(Color.BLUE);
		_phone.setHeight(50);
		_phone.setTextSize(18);
		_phone.setWidth(480);
		
		TextView locationLabel = new TextView(_context);
		locationLabel.setText("Distance: ");
		locationLabel.setBackgroundColor(Color.BLUE);
		locationLabel.setTextColor(Color.WHITE);
		locationLabel.setHeight(50);
		locationLabel.setTextSize(18);
		locationLabel.setWidth(234);
		_distance = new TextView(context);
		_distance.setTextColor(Color.WHITE);
		_distance.setBackgroundColor(Color.BLUE);
		_distance.setHeight(50);
		_distance.setTextSize(18);
		_distance.setWidth(480);
		
		this.addView(businessNameLabel);
		this.addView(_title);
		this.addView(addressLabel);
		this.addView(_address);
		this.addView(phoneNumberLabel);
		this.addView(_phone);
		this.addView(locationLabel);
		this.addView(_distance);
		
		
	}
}
