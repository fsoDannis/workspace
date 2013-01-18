package com.example.java_week2;

import java.util.ArrayList;
import java.util.HashMap;
import com.dannis.ecom.Phone;
import android.os.Bundle;

import com.dannis.ecom.Money;
import com.dannis.ecom.Phone;
import com.dannis.ecom.Product;
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
				double moneyDouble = Double.parseDouble(money.getText().toString());
				
				HashMap<Money, Integer> change = Money.getChange(moneyDouble);
				Log.i("BUTTON CLICKED: ", 
						"Dollar: " + change.get(Money.DOLLAR) +"\r\n"+
								"Quarter: " + change.get(Money.QUARTER) +"\r\n"+
								"Dime: " + change.get(Money.DIME) +"\r\n"+
								"Nickel: " + change.get(Money.NICKEL) +"\r\n"+
								"Penny: " + change.get(Money.PENNY)

						);
				
			}
		});
		
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Phone("iPhone 4S", 499.99));
		products.add(new Phone("iPhone 5", 649.99));
		products.add(new Phone("Nexus", 199.99));
		products.add(new Phone("Samsung", 399.99));
		
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
