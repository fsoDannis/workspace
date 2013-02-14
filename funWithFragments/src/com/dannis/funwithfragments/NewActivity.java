package com.dannis.funwithfragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;
import android.app.Activity;
import android.view.Menu;

public class NewActivity extends Base_Activity{

	TextView nameOut;
	
/*	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}*/
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_activity);
		
		Intent intent = getIntent();
		
		String text = intent.getStringExtra("screenText");
		
		Log.i("New Activity", "Intent Text = " + text);
		if (text=!null)
		{
			nameOut = (TextView) findViewById(R.id.name);
			nameOut = setText(text);
		}
		
	}
}
