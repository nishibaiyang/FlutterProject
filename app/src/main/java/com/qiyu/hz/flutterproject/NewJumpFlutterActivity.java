/*
 * NewJumpFlutterActivity.java
 * Copyright 2018 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.qiyu.hz.flutterproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

public class NewJumpFlutterActivity extends AppCompatActivity {
    private FlutterView flutterView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        FrameLayout.LayoutParams layout = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT);
        flutterView = Flutter.createView(this, getLifecycle(), "PhoneCheck");
        addContentView(flutterView, layout);

//        setContentView(R.layout.activity_new_jump_flutter);
    }
}
