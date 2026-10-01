package com.almlkaide.kaypro.aide.application.activity;

import adrt.ADRTLogCatReader;
import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import com.aide.ui.preferences.PreferencesActivity;
import com.blankj.utilcode.util.ResourceUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.aide.application.AppTheme;
import com.almlkaide.kaypro.util.Utils;

public class AidePreferencesActivity extends PreferencesActivity implements ActionBar.TabListener {

    private FragmentManager f4934fm;
    boolean from_main;

    private ListView f4935lv;
    private AdvancedSettingsFragment mAdvancedSettingsFragment;
    Menu mOptionMenu;
    private final String TAG_TAB_SETTING = "tag_tab_settings";
    private final String TAG_TAB_ADVANCED_SETTING = "tag_tab_advance_settings";
    private final String TAG_FRAGMENT_ADVANCED_SETTING = "tag_fragment_advance_settings";

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onHeaderClick(PreferenceActivity.Header header, int i) {
        super/*android.preference.PreferenceActivity*/.onHeaderClick(header, i);
    }

    public Menu getOptionMenu() {
        return this.mOptionMenu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
        AppTheme.initTheme(this);
        super.onCreate(bundle);
        this.f4935lv = getListView();
        this.from_main = getIntent().getBooleanExtra("from_main", false);
        if (this.from_main) {
            getActionBar().setTitle(AideR.string.command_settings);
            getActionBar().setDisplayHomeAsUpEnabled(true);
            this.f4934fm = getFragmentManager();
            if (this.f4934fm.findFragmentByTag("tag_fragment_advance_settings") == null) {
                this.mAdvancedSettingsFragment = new AdvancedSettingsFragment();
                FragmentTransaction fragmentTransactionBeginTransaction = this.f4934fm.beginTransaction();
                fragmentTransactionBeginTransaction.add(R.id.content, this.mAdvancedSettingsFragment, "tag_fragment_advance_settings");
                fragmentTransactionBeginTransaction.hide(this.mAdvancedSettingsFragment);
                fragmentTransactionBeginTransaction.commit();
            } else {
                this.mAdvancedSettingsFragment = (AdvancedSettingsFragment) this.f4934fm.findFragmentByTag("tag_fragment_advance_settings");
            }
            ActionBar actionBar = getActionBar();
            actionBar.setNavigationMode(2);
            actionBar.addTab(actionBar.newTab().setText(AideR.string.command_settings).setTag("tag_tab_settings").setTabListener(this));
            actionBar.addTab(actionBar.newTab().setText(AideR.string.advanced_settings).setTag("tag_tab_advance_settings").setTabListener(this));
            actionBar.getTabAt(0).select();
        }
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        if (this.mAdvancedSettingsFragment != null) {
            String string = tab.getTag().toString();
            if (string.equals("tag_tab_settings")) {
                this.f4935lv.setVisibility(0);
                this.f4934fm.beginTransaction().hide(this.mAdvancedSettingsFragment).commit();
            } else if (string.equals("tag_tab_advance_settings")) {
                this.f4935lv.setVisibility(8);
                this.f4934fm.beginTransaction().show(this.mAdvancedSettingsFragment).commit();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        if (this.from_main) {
            ActionBar actionBar = getActionBar();
            if (actionBar.getSelectedTab().getTag().toString().equals("tag_tab_advance_settings")) {
                actionBar.getTabAt(0).select();
                return;
            }
        }
        super/*android.preference.PreferenceActivity*/.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.app.Activity*/.onConfigurationChanged(configuration);
        if (ScreenUtils.isPortrait()) {
            getActionBar().setTitle(AideR.string.command_settings);
        } else {
            getActionBar().setTitle((CharSequence) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.home:
                finish();
                return true;
            default:
                return super/*android.preference.PreferenceActivity*/.onOptionsItemSelected(menuItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(Menu menu) {
        this.mOptionMenu = menu;
        if (this.from_main) {
            menu.add(Utils.isCN() ? "更新日志" : "Updatelog").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
                private final AidePreferencesActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    this.this$0.showUpdateLogDialog(this.this$0, menuItem.getTitle());
                    return false;
                }
            }).setIcon(AideR.drawable.ic_clipboard_text).setShowAsAction(5);
            menu.add(Utils.isCN() ? "关于此版本" : "About").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
                private final AidePreferencesActivity this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public boolean onMenuItemClick(MenuItem menuItem) {
                    this.this$0.showAboutDialog(this.this$0, menuItem.getTitle());
                    return false;
                }
            });
        }
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    public void showAboutDialog(Activity activity, CharSequence charSequence) {
        String assets2String = ResourceUtils.readAssets2String(Utils.getAssetsDataFile("about.html"));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(charSequence).setMessage(Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(assets2String, 0) : Html.fromHtml(assets2String)).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).create();
        alertDialogCreate.show();
        Utils.setMessageIsSelectable(alertDialogCreate);
        Utils.setAlertDialogMovementMethod(alertDialogCreate);
    }

    public void showUpdateLogDialog(Activity activity, CharSequence charSequence) {
        new AlertDialog.Builder(activity).setTitle(charSequence).setMessage(ResourceUtils.readAssets2String(Utils.getAssetsDataFile("updatelog.txt"))).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
    }
}
