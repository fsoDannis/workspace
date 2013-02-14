package com.dannis.funwithfragments;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Base_Activity {

	private final String TAG = "Main Activity";

	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("TAG", "onCreate");
	}
	
	public void buttonClick (View view){
		Log.i("TAG", "Starting New Activity");
		Intent intent = new Intent (this, NewActivity.class);
		intent.putExtra("screenText", "Hello");
		startActivity(intent);
	}
}
