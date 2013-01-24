package com.dannis.findit;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class favDisplay extends LinearLayout{

	Button _add;
	Button _remove;
	Spinner _list;
	Context _context;
	
	
	public favDisplay(Context context){
		super(context);
		_context = context;
		
		LayoutParams lp;
	
		_list = new Spinner(_context);
		lp = new LayoutParams(0,LayoutParams.WRAP_CONTENT,1.0f);
		_list.setLayoutParams(lp);
	
		_add = new Button (_context);
		_add.setText("+");
		_remove = new Button (_context);	
		_remove.setText("-");
	
		this.addView(_list);
		this.addView(_add);
		this.addView(_remove);
	
	}
}
