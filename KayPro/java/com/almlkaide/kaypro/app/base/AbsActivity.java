package com.almlkaide.kaypro.app.base;

import adrt.ADRTLogCatReader;
import android.app.Activity;
import android.os.Bundle;
import com.almlkaide.kaypro.aide.application.AppTheme;

public abstract class AbsActivity extends Activity {
    public abstract boolean isApplyTheme();

    @Override
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
        super.onCreate(bundle);
        if (isApplyTheme()) {
            AppTheme.initTheme(this);
        }
    }
}
