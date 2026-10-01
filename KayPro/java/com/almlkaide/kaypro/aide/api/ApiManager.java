package com.almlkaide.kaypro.aide.api;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.MetaDataUtils;
import com.blankj.utilcode.util.StringUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ApiManager {
    private static MainActivityEventManager sIMainActivity;

    public static MainActivityEventManager getIMainActivity() {
        if (sIMainActivity == null) {
            sIMainActivity = new MainActivityEventManager();
        }
        return sIMainActivity;
    }

    public static class MainActivityEventManager extends SimpleIMainActivity {
        private Map<String, IMainActivity> mIMainActivity = new HashMap();

        public MainActivityEventManager() {
            init();
        }

        public <T extends IMainActivity> T find(Class<T> cls) {
            return (T) find(cls.getCanonicalName());
        }

        public IMainActivity find(String str) {
            return this.mIMainActivity.get(str);
        }

        Iterator<IMainActivity> iterator() {
            return this.mIMainActivity.values().iterator();
        }

        private void init() {
            String[] strArrSplit;
            String metaDataInApp = MetaDataUtils.getMetaDataInApp("IMainActivity");
            LogUtils.iTag("MetaData", new Object[]{metaDataInApp});
            if (StringUtils.isTrimEmpty(metaDataInApp) || (strArrSplit = metaDataInApp.split(",")) == null || strArrSplit.length == 0) {
                return;
            }
            for (String str : strArrSplit) {
                if (!StringUtils.isTrimEmpty(metaDataInApp)) {
                    try {
                        this.mIMainActivity.put(str, (IMainActivity) Class.forName(str).newInstance());
                    } catch (Throwable th) {
                        LogUtils.e(new Object[]{th});
                    }
                }
            }
        }

        @Override
        public void onCreate(Activity activity, Bundle bundle) {
            Iterator<IMainActivity> it = iterator();
            while (it.hasNext()) {
                it.next().onCreate(activity, bundle);
            }
        }

        @Override
        public void onCreateOptionsMenu(Menu menu) {
            Iterator<IMainActivity> it = iterator();
            while (it.hasNext()) {
                it.next().onCreateOptionsMenu(menu);
            }
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem menuItem) {
            Iterator<IMainActivity> it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (it.next().onOptionsItemSelected(menuItem)) {
                    z = true;
                }
            }
            return z;
        }

        @Override
        public void onPrepareOptionsMenu(Menu menu) {
            Iterator<IMainActivity> it = iterator();
            while (it.hasNext()) {
                it.next().onPrepareOptionsMenu(menu);
            }
        }

        @Override
        public void onMenuOpened(int i, Menu menu) {
            Iterator<IMainActivity> it = iterator();
            while (it.hasNext()) {
                it.next().onMenuOpened(i, menu);
            }
        }

        @Override
        public void onBeforeSigningAPK(File file, Object obj) {
            Iterator<IMainActivity> it = iterator();
            while (it.hasNext()) {
                it.next().onBeforeSigningAPK(file, obj);
            }
        }
    }
}
