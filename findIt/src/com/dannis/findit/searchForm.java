package com.dannis.findit;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class searchForm extends LinearLayout{
	
	EditText _searchField;
	Button _searchButton;

	public searchForm(Context context, String hint, String buttonText){
		super(context);
		
		LayoutParams lp;
		
		_searchField = new EditText(context);
		lp = new LayoutParams(0,LayoutParams.WRAP_CONTENT,1.0f);
		_searchField.setLayoutParams(lp);
		_searchField.setHint(hint);
		
		_searchButton = new Button(context);
		_searchButton.setText(buttonText);
		
		this.addView(_searchField);
		this.addView(_searchButton);
		
		// Spreading the View all the way accross the scren
		lp = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
		this.setLayoutParams(lp);
		
	}
	///Functions so we can get back to them in the Main
	public EditText getField(){
		return _searchField;
	}
	
	public Button getButton(){
		return _searchButton;
	}
	
	
	
}
