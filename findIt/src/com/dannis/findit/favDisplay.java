package com.dannis.findit;

import java.util.ArrayList;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;



public class favDisplay extends LinearLayout{

	Button _add;
	Button _remove;
	Spinner _list;
	Context _context;
	ArrayList<String> _places = new ArrayList<String>();
	
	
	public favDisplay(Context context){
		super(context);
		_context = context;
		
		LayoutParams lp;
	
		_places.add("Select a Favorite Place");
		_list = new Spinner(_context);
		lp = new LayoutParams(0,LayoutParams.WRAP_CONTENT,1.0f);
		_list.setLayoutParams(lp);
		
		//SETTING UP THE LIST ADAPTER
		ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(_context, android.R.layout.simple_spinner_dropdown_item, _places);
		listAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		_list.setAdapter(listAdapter);
		_list.setOnItemSelectedListener(new OnItemSelectedListener() {
			
			@Override
			public void onItemSelected(AdapterView<?> parent, View v, int pos, long id){
				Log.i("FAVORITE SELECTED",parent.getItemAtPosition(pos).toString());
			}
			
			@Override
			public void onNothingSelected(AdapterView<?> parent){
				Log.i("FAVORITE SELECTED","NONE");
				
			}
		});
		
		updateFavorites();
		
		_add = new Button (_context);
		_add.setText("+");
		_remove = new Button (_context);	
		_remove.setText("-");
	
		this.addView(_list);
		this.addView(_add);
		this.addView(_remove);
		
		// Spreading the View all the way across the screen
		lp = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
		this.setLayoutParams(lp);
	
	}
	//Setting up the content for the list.
	private void updateFavorites(){
		_places.add("Apple Store");
		_places.add("Home");
		_places.add("Time Warner");
		_places.add("Parent's House");
		_places.add("In-Laws House");
		_places.add("Apple Store");
	}
}
