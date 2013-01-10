package com.fullsail.AVF_WK4;


import android.os.Bundle;
import com.phonegap.*;


public class AVF_WK4Activity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}