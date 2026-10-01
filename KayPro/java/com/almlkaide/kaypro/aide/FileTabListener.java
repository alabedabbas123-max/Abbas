package com.almlkaide.kaypro.aide;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.support.annotation.Keep;
import android.view.inputmethod.InputMethodManager;
import com.aide.ui.MainActivity;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.almlkaide.kaypro.aide.filebrowser.FileBrowserAdapter;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.util.Utils;

public class FileTabListener implements ActionBar.TabListener {
    public static FileTabListener sFileTabListener;
    final ActionBar.TabListener _tabListener;
    final MainActivity activity;

    final String f4931str;

    final ActionBar.Tab f4932tab;

    public FileTabListener(MainActivity mainActivity, ActionBar.Tab tab, String str) {
        this.activity = mainActivity;
        this.f4932tab = tab;
        this.f4931str = str;
        try {
            this._tabListener = (ActionBar.TabListener) ReflectUtils.reflect(Class.forName("com.aide.ui.ma")).newInstance(new Object[]{mainActivity, tab, str}).get();
            sFileTabListener = this;
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        this._tabListener.onTabSelected(tab, fragmentTransaction);
        FileBrowserAdapter.notifyDataSetChanged();
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        this._tabListener.onTabUnselected(tab, fragmentTransaction);
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        this._tabListener.onTabReselected(tab, fragmentTransaction);
    }

    @Keep
    public static boolean editorMenuClose(Object obj) {
        Boolean bool = (Boolean) ReflectUtils.reflect(obj).method("run_").get();
        AIDEUtils.getMainActivity().setFileTabVisible(AIDEUtils.getCurrentEditorFile() != null);
        if (AIDEUtils.getCurrentEditorFile() == null) {
            InputMethodManager inputMethodManager = (InputMethodManager) Utils.getApp().getSystemService("input_method");
            if (KeyboardUtils.isSoftInputVisible(AIDEUtils.getMainActivity())) {
                inputMethodManager.toggleSoftInput(1, 0);
            }
        }
        FileBrowserAdapter.notifyDataSetChanged();
        return bool.booleanValue();
    }

    @Keep
    public static boolean filetabMenuCloseAll(Object obj) {
        return editorMenuClose(obj);
    }

    @Keep
    public static boolean filetabMenuCloseOthers(Object obj) {
        return editorMenuClose(obj);
    }
}
