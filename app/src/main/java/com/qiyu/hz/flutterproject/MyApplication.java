/*
 * MyApplication.java
 * Copyright 2018 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */
package com.qiyu.hz.flutterproject;

import android.app.Application;

import io.flutter.view.FlutterMain;

/**
 * @author qiyu
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        FlutterMain.startInitialization(this);
        super.onCreate();
    }
}
