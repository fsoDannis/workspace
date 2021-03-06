package com.example.findit_3;


import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class FirstPageFragment extends Fragment {
		
	private FormListener listener;
	
	public interface FormListener{
		public void onsecondClick();
	}
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
			super.onCreateView(inflater, container, savedInstanceState);
	
			LinearLayout view = (LinearLayout) inflater.inflate(R.layout.activity_main, container, false);


			
			final EditText et = (EditText) view.findViewById(R.id.et_EnterName);
			et.setTextColor(Color.WHITE);
			
			Button B = (Button) view.findViewById(R.id.b_Enter);
			B.setBackgroundColor(Color.WHITE);
			B.setTextColor(Color.BLACK);
			B.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// Sending from this class to the "second" view/class
					listener.onsecondClick();
				}
			});

			return view;

			};
			
			@Override
			public void onAttach(Activity activity){
				super.onAttach(activity);
				try{
					listener = (FormListener) activity;
					}catch (ClassCastException e){
						throw new ClassCastException(activity.toString() + "must implement FormListener");
					}
			}
			
}