package com.dannis.lib;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class webStuff {
	
	static Boolean _conn = false;
	static String _connectionType = "Unavailable";
	
	private static void netInfo(Context context){
		ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo ni = cm.getActiveNetworkInfo();
		if(ni != null){
			if(ni.isConnected()){
				
			}
		}
	}
	
	
}
