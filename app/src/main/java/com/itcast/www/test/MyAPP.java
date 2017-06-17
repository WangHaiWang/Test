package com.itcast.www.test;

import android.app.Application;

import org.xutils.x;

/**
 * Created by 35720 on 2017/6/14.
 */

public class MyAPP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true);
    }
}

