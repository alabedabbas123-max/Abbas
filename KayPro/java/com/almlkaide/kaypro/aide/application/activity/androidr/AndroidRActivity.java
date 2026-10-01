package com.almlkaide.kaypro.aide.application.activity.androidr;

import adrt.ADRTLogCatReader;
import android.R;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.app.base.BaseActivity;
import com.almlkaide.kaypro.util.Utils;

public class AndroidRActivity extends BaseActivity {
    @Override
    public boolean isApplyTheme() {
        return !getIntent().hasExtra("themeid");
    }

    @Override
    protected void onCreate(Bundle bundle) {
        Fragment fragmentTextAppearance;
        String str;
        ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
        Intent intent = getIntent();
        if (intent.hasExtra("themeid")) {
            setTheme(intent.getIntExtra("themeid", 0));
        }
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
            if (intent.hasExtra(Config.FEED_LIST_ITEM_TITLE)) {
                getActionBar().setTitle(intent.getStringExtra(Config.FEED_LIST_ITEM_TITLE));
            } else {
                getActionBar().setTitle(Utils.isCN() ? "系统资源查看" : "View system resources");
            }
        }
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        Fragment fragment = (Fragment) null;
        String stringExtra = intent.getStringExtra("tag");
        if (FragmentTag.TAG_STRING.equals(stringExtra)) {
            fragmentTextAppearance = new FragmentString();
        } else if (FragmentTag.TAG_COLOR.equals(stringExtra)) {
            fragmentTextAppearance = new FragmentColor();
        } else if (FragmentTag.TAG_DRAWABLE.equals(stringExtra)) {
            fragmentTextAppearance = new FragmentDrawable();
        } else if (FragmentTag.TAG_THENCE.equals(stringExtra)) {
            fragmentTextAppearance = new FragmentTheme();
        } else if (FragmentTag.TAG_THEME_PREVIEW.equals(stringExtra)) {
            fragmentTextAppearance = new FragmentThemePreview();
        } else {
            fragmentTextAppearance = FragmentTag.TAG_TEXTAPPEARANCE.equals(stringExtra) ? new FragmentTextAppearance() : fragment;
        }
        if (fragmentTextAppearance == null) {
            FragmentMain fragmentMain = new FragmentMain();
            str = FragmentTag.TAG_MAIN;
            fragmentTextAppearance = fragmentMain;
        } else {
            str = stringExtra;
        }
        Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(str);
        if (fragmentFindFragmentByTag != null) {
            fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
        }
        fragmentTransactionBeginTransaction.replace(R.id.content, fragmentTextAppearance, str).commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
