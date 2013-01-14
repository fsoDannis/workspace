package com.dannis.androiduidemo;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.graphics.Color;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class MainActivity extends Activity {

	LinearLayout ll;
	LinearLayout.LayoutParams lp;
	TextView tArray;

	EditText et;
	TextView tv;
	TextView result;

	Boolean addTextViewRed;
	AlertDialog alert;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ll = new LinearLayout(this);
		ll.setOrientation(LinearLayout.VERTICAL);
		ll.setBackgroundColor(getResources().getColor(R.color.solid_black));
		lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.MATCH_PARENT);
		ll.setLayoutParams(lp);

		
		// Add a text view
				tArray = new TextView(this);
				//tv.setText(R.string.hello_dan);
				//tArray.setText("");
				ll.addView(tArray);
				tArray.setBackgroundColor(getResources().getColor(R.color.white));	
				
		
		//Add an Edit Field with a Hint
		et = new EditText(this);
		et.setHint("Enter the Hours Worked.");
		et.setTextColor(getResources().getColor(R.color.white));
		//ll.addView(et);

		//Add a button and set the text
		Button b = new Button(this);
		b.setText("Calculate");
		//ll.addView(b);
		b.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				//If Statement.. If Blank change hint color and message
				String check = et.getText().toString();
					if (check.length() <= 0){
						et.setHintTextColor(getResources().getColor(R.color.solid_red));
						et.setHint("You must enter a Number...");
						
					}else{
				
						int Jin = getResources().getInteger(R.integer.Jin);
						int Nguyen = getResources().getInteger(R.integer.Nguyen);
						int Niko = getResources().getInteger(R.integer.Niko);
						int Nikita = getResources().getInteger(R.integer.Nikita);
						
						int entry = Integer.parseInt(et.getText().toString());
								
						int payJin = Jin*entry;
						int payNgu = Nguyen*entry;
						int payNiko = Niko*entry;
						int payNika = Nikita*entry;
						
						
						result.setText("Jin earned: " + payJin + " Dollars"+"\r\n" +
								"Nguyen earned: " + payNgu + " Dollars"+ "\r\n" +
								"Niko earned: " + payNiko + " Dollars"+ "\r\n" +
								"Nikita earned: " + payNika + " Dollars"+ "\r\n"
								);
					}}
				});

			
        // Loop of Characters
        String[] characters = {"\n" + getString(R.string.Jin),getString(R.string.Nguyen),getString(R.string.Niko),getString(R.string.Nikita)};
        int size = characters.length;
        for (int i=0; i<size; i++)
        {
          tArray.append((characters[i]+"\n"));
          tArray.setGravity(Gravity.CENTER);
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
		result.setTextColor(getResources().getColor(R.color.solid_red));
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
