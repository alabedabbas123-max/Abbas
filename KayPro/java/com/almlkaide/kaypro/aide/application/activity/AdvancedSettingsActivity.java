package com.almlkaide.kaypro.aide.application.activity;

import android.R;
import android.os.Bundle;
import com.almlkaide.kaypro.app.base.BaseActivity;

/**
 * Hosts the advanced-settings preference fragment referenced by AndroidManifest.xml.
 * The activity source was missing from the extracted tree, although its fragment
 * and manifest declaration were present.
 */
public class AdvancedSettingsActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.content, new AdvancedSettingsFragment())
                    .commit();
        }
    }
}
