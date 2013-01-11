package com.dannis.androiduidemo;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

	LinearLayout ll;
	LinearLayout.LayoutParams lp;
	EditText et;
	TextView tv;
	TextView result;

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.VERTICAL);
		lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
		ll.setLayoutParams(lp);
		
		//Log.i("TEST", "TEST TEST TEST");
		
		
		// Add a text view
		tv = new TextView(this);
		//tv.setText(R.string.hello_dan);
		//tv.setText("Hi Dan...");
		ll.addView(tv);
		
		
		//Add an Edit Field with a Hint
		et = new EditText(this);
		et.setHint("How much bucks you got?");
		//ll.addView(et);
		
		//Add a button and set the text
		Button b = new Button(this);
		b.setText("Convert those Dollars!");
		//ll.addView(b);
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int quarter = getResources().getInteger(R.integer.quarter);
				int nickel = getResources().getInteger(R.integer.nickel);
				int dime = getResources().getInteger(R.integer.dime);
				int penny = getResources().getInteger(R.integer.penny);
				
				int entry = Integer.parseInt(et.getText().toString());
						
				int numQ = (100/quarter)*entry;
				int numD = (100/dime)*entry;
				int numN = (100/nickel)*entry;
				int numP = (100/penny)*entry;
				
				
				result.setText("Quarters: " + numQ + "\r\n" +
						"Dimes: " + numD + "\r\n" +
						"Nickels: " + numN + "\r\n" +
						"Pennies: " + numP + "\r\n"
						);
			}
		});
			
        // Loop of Characters
        String[] characters = {"Ironman", "HawkEye", "The Hulk", "Captain America"};
        int size = characters.length;
        for (int i=0; i<size; i++)
        {
          tv.append((characters[i]+"\n"));
        }
		

		
		//Setting a Horizontal Layout
		LinearLayout form = new LinearLayout(this);
		form.setOrientation(LinearLayout.HORIZONTAL);
		lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		form.setLayoutParams(lp);
		
		//Adding the edit Text and the Button to the layout
		form.addView(et);
		form.addView(b);
		
		result = new TextView(this);
		ll.addView(result);
		
		//Adding the form to the screen
		ll.addView(form);
		
		setContentView(ll);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
