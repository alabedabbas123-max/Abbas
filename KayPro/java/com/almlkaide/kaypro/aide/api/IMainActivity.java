package com.almlkaide.kaypro.aide.api;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.io.File;

public interface IMainActivity {
    void onBeforeSigningAPK(File file, Object obj);

    void onCreate(Activity activity, Bundle bundle);

    void onCreateOptionsMenu(Menu menu);

    void onMenuOpened(int i, Menu menu);

    boolean onOptionsItemSelected(MenuItem menuItem);

    void onPrepareOptionsMenu(Menu menu);
}
