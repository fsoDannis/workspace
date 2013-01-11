package com.dannis.androiduidemo;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

	LinearLayout ll;
	LinearLayout.LayoutParams lp;
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.VERTICAL);
		lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
		ll.setLayoutParams(lp);
		
		//Log.i("TEST", "TEST TEST TEST");
		
		
		// Add a text view
		TextView tv = new TextView(this);
		//tv.setText(R.string.hello_world);
		tv.setText("Hi Dan...");
		ll.addView(tv);
		
		//Add an Edit Field with a Hint
		EditText et = new EditText(this);
		et.setHint("Type some info here!");
		//ll.addView(et);
		
		//Add a button and set the text
		Button b = new Button(this);
		b.setText("Click Me!");
		//ll.addView(b);
		
		//Setting a Horizontal Layout
		LinearLayout form = new LinearLayout(this);
		form.setOrientation(LinearLayout.HORIZONTAL);
		form.setLayoutParams(lp);
		
		form.addView(et);
		form.addView(b);
		
		ll.addView(form);
		
		setContentView(ll);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
