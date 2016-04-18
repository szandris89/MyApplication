package com.test.myapplication;

import android.app.Application;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class MVPApplication  extends Application{

    public static MVPApplication injector;
    @Override
    public void onCreate() {
        super.onCreate();
        //injector = DaggerMVPApplicationComponent.builder().viewModule(new ViewModule(this)).build();
    }
}
