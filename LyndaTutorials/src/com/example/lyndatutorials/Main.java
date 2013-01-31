package com.example.lyndatutorials;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button B = (Button) findViewById(R.id.b_Enter);
		final EditText et = (EditText) findViewById(R.id.et_EnterName);
		
		
		//Sending the information from the Edit Box through the button and onto the next screen
		B.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Sending from this class to the "second" view/class
				Intent intent = new Intent(Main.this, SecondActivity.class);
				//This is the information that will be sent.
				intent.putExtra("Entered Text", "Hello, " + et.getText().toString());
				startActivity(intent);
			}
		});
		
	
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
