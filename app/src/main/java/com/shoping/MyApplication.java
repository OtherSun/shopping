package com.shoping;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by qf on 2017/1/4.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
