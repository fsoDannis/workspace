package com.example.findit_3;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button B = (Button) findViewById(R.id.b_Enter);
		B.setBackgroundColor(Color.WHITE);
		B.setTextColor(Color.BLACK);
		
		final EditText et = (EditText) findViewById(R.id.et_EnterName);
		et.setTextColor(Color.WHITE);
		//ImageView iv = (ImageView) findViewById(R.drawable.newbg);
	
		
		/*  Getting Image from the Gallery
		ImageView iv = (ImageView) findViewById(R.id.imageView1);
		iv.setImageURI ( (Uri) getIntent().getExtras().get(Intent.EXTRA_STREAM));
		*/
		
		
		//Sending the information from the Edit Box through the button and onto the next screen
		B.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Sending from this class to the "second" view/class
				Intent intent = new Intent(Main.this, Second_Activity.class);
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