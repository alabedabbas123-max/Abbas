package com.almlkaide.kaypro.aide.api;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.io.File;

public abstract class SimpleIMainActivity implements IMainActivity {
    protected Activity convert;

    @Override
    public void onBeforeSigningAPK(File file, Object obj) {
    }

    @Override
    public void onCreateOptionsMenu(Menu menu) {
    }

    @Override
    public void onMenuOpened(int i, Menu menu) {
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
    }

    @Override
    public void onCreate(Activity activity, Bundle bundle) {
        this.convert = activity;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }
}
