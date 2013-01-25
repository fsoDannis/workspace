package com.dannis.findit;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.dannis.lib.webStuff;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

	Context _context;
	LinearLayout _appLayout;
	searchForm _search;
	placesDisplay _places;
	favDisplay _favorites;
	boolean connected = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		_context = this;
		_appLayout = new LinearLayout(this);
		
		//CREATING THE SEARCH BAR & BUTTON
		 _search = new searchForm(_context, "Enter a Place...","find it!");
		
		//ADDING SEARCH HANDLER
		Button searchButton = _search.getButton();
		
		//GRABBING TEXT WHEN USER TYPES
		searchButton.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("USER TYPED:",_search.getField().getText().toString());
				getPlace(_search.getField().getText().toString());
			}
		});
		
		//DETECT NETWORK CONNECTION
		connected = webStuff.getConnectionStatus(_context);
		if(connected){
			Log.i("NETWORK CONNECTION", webStuff.getConnectionType(_context));
		}
		
		//ADD PLACES DISPLAY
		_places = new placesDisplay(_context);
		
		//ADDING FAVORITES DISPLAY
		_favorites = new favDisplay(_context);
		
		//ADDING VIEWS TO THE MAIN LAYOUT
		_appLayout.addView(_search);
		_appLayout.addView(_places);
		_appLayout.addView(_favorites);

		
		_appLayout.setOrientation(LinearLayout.VERTICAL);
		
		setContentView(_appLayout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
    	  
	private void getPlace(String place){
		Log.i("Click", place);
		//This Link gets you to the base link to the api service
		String baseURl = "http://query.yahooapis.com/v1/public/yql";
		String yql = "select * from local.search where zip='45103' and query='"+ place + "'";
		String qs;
		try{
			qs =URLEncoder.encode(yql,"UTF-8");
		}catch (Exception e){
			Log.e("Bad URL","ENCODING PROBLEM");
			qs="";
		}
		URL finalURL;
		try{
			finalURL = new URL(baseURl +"?q="+ qs + "&format=json&diagnostics=true&env=store://datatables.org/alltableswithkeys");
			QuoteRequest qr=new QuoteRequest();
			qr.execute(finalURL);
		}catch (MalformedURLException e){
			Log.e("BAD URL","MALFORMED URL");
			finalURL =null;
		}
	}

	private class QuoteRequest extends AsyncTask<URL, Void, String>{
		@Override
		protected String doInBackground(URL... urls){
			String response ="";
			for(URL url: urls){
				response = webStuff.getURLStringResponse(url);
			}
			return response;
		}
		@Override
		protected void onPostExecute(String result){
			Log.i("URL RESPONSE", result);
			try{
				JSONObject json = new JSONObject(result);
				JSONObject query = json.getJSONObject("query");
				JSONObject results = query.getJSONObject("results");
				JSONArray ja = results.getJSONArray("Result");
				String title = ja.getJSONObject(0).getString("Title");
				String address = ja.getJSONObject(0).getString("Address");
				String phone = ja.getJSONObject(0).getString("Phone");
				//THIS LITTLE TOAST GUY HATES ME!
				/*	if(query.getString("count").compareTo("0")==0){
					Toast toast= Toast.makeText(_context,"Invalid Entry", Toast.LENGTH_SHORT);
					toast.show();
				}else{
					Toast toast= Toast.makeText(_context,"Valid Entry" + list.substring("place"), Toast.LENGTH_SHORT);
					toast.show();
				}*/
				
				//ja.getJSONObject(0).getString("Title");
				Log.i("JSON RESULTS","Name: " + title.toString()+" Address: " + address.toString()+" Phone: "+ phone.toString());
			}catch (JSONException e){
				Log.e("JSON","JSON OBJECT EXCEPTION");
			}
			
			
		}
	}
}
