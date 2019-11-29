package com.example.machenike.orangemusic10.App;

import android.app.Application;
import android.content.Context;

import org.xutils.x;

public class MyApp extends Application {
    private static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);
        this.context=getApplicationContext();
    }
    public static Context getappcontext(){
        return context;
    }
}
