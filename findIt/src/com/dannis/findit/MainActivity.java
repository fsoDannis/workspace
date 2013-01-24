package com.dannis.findit;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	Context _context;
	LinearLayout _appLayout;
	searchForm _search;
	placesDisplay _places;
	favDisplay _favorites;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		_context = this;
		_appLayout = new LinearLayout(this);
		
		//CREATING THE SEARCH BAR & BUTTON
		 _search = new searchForm(_context, "Enter a Place...","find it!");
		
		//ADDING SEARCH HANDLER
		Button searchButton = _search.getButton();
		
		//GRABBING TEXT WHEN USER TYPES
		searchButton.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("USER TYPED:",_search.getField().getText().toString());
		
			}
		});
		
		//ADD PLACES DISPLAY
		_places = new placesDisplay(_context);
		
		//ADDING FAVORITES DISPLAY
		_favorites = new favDisplay(_context);
		
		//ADDING VIEWS TO THE MAIN LAYOUT
		_appLayout.addView(_search);
		_appLayout.addView(_places);
		_appLayout.addView(_favorites);

		
		_appLayout.setOrientation(LinearLayout.VERTICAL);
		
		setContentView(_appLayout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
