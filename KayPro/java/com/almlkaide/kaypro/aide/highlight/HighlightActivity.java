package com.almlkaide.kaypro.aide.highlight;

import adrt.ADRTLogCatReader;
import android.R;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.baidu.mobstat.Config;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.aide.application.AppTheme;
import com.almlkaide.kaypro.aide.highlight.color.Colors;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.app.base.BaseActivity;
import com.almlkaide.kaypro.util.Toasty;
import com.almlkaide.kaypro.util.Utils;
import com.almlkaide.kaypro.widget.CustomListView;
import java.util.ArrayList;
import java.util.List;
import net.margaritov.preference.colorpicker.ColorPickerDialog;
import net.margaritov.preference.colorpicker.ColorPickerPreference;

public class HighlightActivity extends BaseActivity implements AdapterView.OnItemClickListener, ActionBar.TabListener {
    private HighlightAdapter adapter;
    private ListView mListView;
    private List<Item> list = new ArrayList();
    private boolean isDataChangeed = false;

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
    }

    @Override
    protected void onCreate(Bundle bundle) {
        ADRTLogCatReader.onContext(this, "com.almlkaide.kaypro");
        super.onCreate(bundle);
        this.mListView = new CustomListView(this);
        setContentView(this.mListView);
        this.mListView.setOnItemClickListener(this);
        initActionBar();
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        toggleList("p1".equals(tab.getTag()));
    }

    private void toggleList(boolean z) {
        this.list = new ArrayList();
        for (Colors colors : HighlightUtils.getHighlightColor().values()) {
            this.list.add(new Item(colors.label, colors.name, z ? colors.lightColor : colors.darkColor));
        }
        if (this.adapter == null) {
            this.adapter = new HighlightAdapter(this, this.list);
            this.adapter.setIsLight(z);
            this.mListView.setAdapter((ListAdapter) this.adapter);
        } else {
            this.adapter.setIsLight(z);
            this.adapter.setList(this.list);
            this.adapter.notifyDataSetChanged();
        }
    }

    private void initActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setTitle(getIntent().getCharSequenceExtra(Config.FEED_LIST_ITEM_TITLE));
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setNavigationMode(2);
        if (!AppTheme.THEME_INDIGO.equals(AppTheme.getThemeName())) {
            actionBar.addTab(actionBar.newTab().setText(Utils.isCN() ? "亮主题高亮配置" : "Light").setTag("p1").setTabListener(this));
        }
        actionBar.addTab(actionBar.newTab().setText(Utils.isCN() ? "暗主题高亮配置" : "Dark").setTag(Config.EVENT_H5_PAGE).setTabListener(this));
        if (AppTheme.THEME_INDIGO.equals(AppTheme.getThemeName())) {
            return;
        }
        actionBar.getTabAt(0).select();
        if (AIDEUtils.isLightTheme()) {
            return;
        }
        actionBar.getTabAt(1).select();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Item item = this.adapter.getItem(i);
        ColorPickerDialog colorPickerDialog = new ColorPickerDialog(this, Color.parseColor(item.getColor(this.adapter.isLight())));
        colorPickerDialog.setTitle(item.getTitle());
        colorPickerDialog.setOnColorChangedListener(new ColorPickerDialog.OnColorChangedListener(this, item) {
            private final HighlightActivity this$0;
            private final Item val$item;

            {
                this.this$0 = this;
                this.val$item = item;
            }

            @Override
            public void onColorChanged(int i2) {
                HighlightUtils.getHSp().edit().putString(this.val$item.getSpKey(this.this$0.adapter.isLight()), ColorPickerPreference.convertToARGB(i2)).commit();
                this.this$0.adapter.notifyDataSetChanged();
                this.this$0.isDataChangeed = true;
            }
        });
        colorPickerDialog.setButton(-3, getResources().getString(AideR.string.dialog_bt_default), new DialogInterface.OnClickListener(this, item) {
            private final HighlightActivity this$0;
            private final Item val$item;

            {
                this.this$0 = this;
                this.val$item = item;
            }

            @Override
            public void onClick(DialogInterface dialogInterface, int i2) {
                HighlightUtils.getHSp().edit().putString(this.val$item.getSpKey(this.this$0.adapter.isLight()), this.val$item.getDefaultColor()).commit();
                this.this$0.adapter.notifyDataSetChanged();
                this.this$0.isDataChangeed = true;
            }
        });
        colorPickerDialog.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Utils.isCN() ? "还原" : "Restore").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
            private final HighlightActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                SharedPreferences.Editor editorEdit = HighlightUtils.getHSp().edit();
                for (Item item : this.this$0.list) {
                    editorEdit.putString(item.getSpKey(this.this$0.adapter.isLight()), item.getDefaultColor());
                }
                editorEdit.commit();
                this.this$0.onTabSelected(this.this$0.getActionBar().getSelectedTab(), (FragmentTransaction) null);
                this.this$0.isDataChangeed = true;
                Toasty.success(Utils.isCN() ? "已还原至默认" : "Restored to default").show();
                return false;
            }
        });
        menu.add(Utils.isCN() ? "还原亮/暗" : "Reset light/dark").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this) {
            private final HighlightActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                SharedPreferences.Editor editorEdit = HighlightUtils.getHSp().edit();
                editorEdit.clear();
                for (Colors colors : HighlightUtils.getHighlightColor().values()) {
                    editorEdit.putString(HighlightUtils.getSpKey(colors.name, true), colors.lightColor);
                    editorEdit.putString(HighlightUtils.getSpKey(colors.name, false), colors.darkColor);
                }
                editorEdit.commit();
                this.this$0.onTabSelected(this.this$0.getActionBar().getSelectedTab(), (FragmentTransaction) null);
                this.this$0.isDataChangeed = true;
                Toasty.success(Utils.isCN() ? "已还原至默认" : "Reset to default").show();
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override
    public void onBackPressed() {
        if (getActionBar().getTabCount() >= 2 && getActionBar().getSelectedTab().getTag().equals(Config.EVENT_H5_PAGE)) {
            getActionBar().getTabAt(0).select();
        } else {
            super.onBackPressed();
            overridePendingTransition(0, 0);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (this.isDataChangeed) {
            AIDEUtils.getAIDEEditorPager().Zo();
            AIDEUtils.getMainActivity().setEditorBackground();
        }
    }
}
