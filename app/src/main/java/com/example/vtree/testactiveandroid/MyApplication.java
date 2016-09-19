package com.example.vtree.testactiveandroid;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by longdg123 on 9/19/2016.
 */
public class MyApplication extends Application {
    public static final String TAG = "DEMO";

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();

        // Notice this initialization code here
        ActiveAndroid.initialize(this);
    }
}
