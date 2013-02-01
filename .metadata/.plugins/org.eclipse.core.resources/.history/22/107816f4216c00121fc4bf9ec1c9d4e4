package com.example.findit_3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class Second_Activity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText(getIntent().getExtras().getString("Entered Text"));
	}
}
