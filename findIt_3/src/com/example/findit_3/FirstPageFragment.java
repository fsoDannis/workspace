package com.example.findit_3;


import android.app.Fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.LinearLayout;;

public class FirstPageFragment extends Fragment {
		
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
			super.onCreateView(inflater, container, savedInstanceState);
	
			LinearLayout view = (LinearLayout) inflater.inflate(R.layout.activity_main, container, false);
//
//			Button B = (Button) view.findViewById(R.id.infoPage);
//			B.setOnClickListener(new OnClickListener() {
//
//			@Override
//
//			public void onClick(View v) {
//			listener.onInfoPage();
//			}
//			});

			return view;

			};
			
}