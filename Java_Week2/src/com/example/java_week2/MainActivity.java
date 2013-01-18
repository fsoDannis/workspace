package com.example.java_week2;

import android.os.Bundle;
import com.dannis.lib.*;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LinearLayout ll = new LinearLayout(this);
		LinearLayout entryBox = formThings.singleEntryWithButton(this, "Type", "go");
		
		Button moneyButton = (Button) entryBox.findViewById(2);
		
		moneyButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				EditText money = (EditText) v.getTag();
				Log.i("BUTTON CLICKED: ", money.getText().toString());
			}
		});
		
		
		ll.addView(entryBox);
		
		setContentView(ll);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
