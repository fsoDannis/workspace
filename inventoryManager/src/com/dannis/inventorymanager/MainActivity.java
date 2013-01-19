package com.dannis.inventorymanager;

import java.util.ArrayList;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import com.dannis.inventorymanager.models.InventoryItem;
import com.dannis.inventorymanager.models.ItemType;
public class MainActivity extends Activity {

	private TextView _thisText;
	private EditText _etProductName;
	private EditText _etProductPrice;
	private EditText _etProductQty;
	private Button _button1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		_etProductName = (EditText)findViewById(R.id.etProductName);
		_etProductPrice = (EditText)findViewById(R.id.etProductPrice);
		_etProductQty = (EditText)findViewById(R.id.etProductQty);
		_button1 = (Button)findViewById(R.id.button1);
		_thisText = (TextView)findViewById(R.id.tvProductList);
		
		
		final ArrayList<InventoryItem> inventoryCollection = new ArrayList<InventoryItem>();
		
		_button1.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				InventoryItem item = new InventoryItem();
				item.setName(_etProductName.getText().toString());
				item.setPrice(Double.parseDouble(_etProductPrice.getText().toString()));
				item.setQty(Integer.parseInt(_etProductQty.getText().toString()));
				item.setItemType(ItemType.Shoe);
			
				inventoryCollection.add(item);
				
				_thisText.setText("");
				for(InventoryItem thisItem : inventoryCollection)
				{
					_thisText.setText(_thisText.getText() + " " + thisItem.toString() + "\n\n");
				}
			}
		});
	}
}