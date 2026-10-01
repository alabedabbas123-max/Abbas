package com.almlkaide.kaypro.aide.application.activity;

import adrt.ADRTLogCatReader;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class NoDisplayActivity extends Activity {
    @Override
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
        super.onCreate(bundle);
        Intent intent = getIntent();
        try {
            intent.setClass(this, Class.forName("com.almlkaide.kaypro.aide.AideMainActivity"));
            startActivity(intent);
            finish();
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }
}
