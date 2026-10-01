package com.ikimuhendis.ldrawer;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.support.v4.widget.DrawerLayout;
import com.almlkaide.kaypro.aide.AideR;
import com.almlkaide.kaypro.graphics.drawable.DrawerArrowDrawable;
import java.lang.reflect.Method;

public class ActionBarDrawerToggle extends android.support.v4.app.ActionBarDrawerToggle {

    private static final String f4819TAG;
    protected boolean animateEnabled;
    protected Activity mActivity;
    protected int mCloseDrawerContentDescRes;
    protected DrawerArrowDrawable mDrawerImage;
    protected DrawerLayout mDrawerLayout;
    protected int mOpenDrawerContentDescRes;

    static {
        try {
            f4819TAG = Class.forName("com.ikimuhendis.ldrawer.ActionBarDrawerToggle").getName();
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public ActionBarDrawerToggle(Activity activity, DrawerLayout drawerLayout, DrawerArrowDrawable drawerArrowDrawable, int i, int i2) {
        super(activity, drawerLayout, AideR.drawable.ic_drawer, i, i2);
        this.mActivity = activity;
        this.mDrawerLayout = drawerLayout;
        this.mOpenDrawerContentDescRes = i;
        this.mCloseDrawerContentDescRes = i2;
        this.mDrawerImage = drawerArrowDrawable;
        this.animateEnabled = true;
    }

    @Override
    public void syncState() {
        if (this.mDrawerImage == null) {
            super.syncState();
            return;
        }
        if (this.animateEnabled) {
            if (this.mDrawerLayout.isDrawerOpen(8388611)) {
                this.mDrawerImage.setProgress(1.0f);
            } else {
                this.mDrawerImage.setProgress(0.0f);
            }
        }
        setActionBarUpIndicator();
        setActionBarDescription();
    }

    @Override
    public void setDrawerIndicatorEnabled(boolean z) {
        if (this.mDrawerImage == null) {
            super.setDrawerIndicatorEnabled(z);
        } else {
            setActionBarUpIndicator();
            setActionBarDescription();
        }
    }

    @Override
    public boolean isDrawerIndicatorEnabled() {
        if (this.mDrawerImage == null) {
            return super.isDrawerIndicatorEnabled();
        }
        return true;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        if (this.mDrawerImage == null) {
            super.onConfigurationChanged(configuration);
        } else {
            syncState();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    @Override
    public void onDrawerSlide(View view, float f) {
        if (this.mDrawerImage == null) {
            super.onDrawerSlide(view, f);
        } else if (this.animateEnabled) {
            this.mDrawerImage.setVerticalMirror(!this.mDrawerLayout.isDrawerOpen(8388611));
            this.mDrawerImage.setProgress(f);
        }
    }

    @Override
    public void onDrawerOpened(View view) {
        if (this.mDrawerImage == null) {
            super.onDrawerOpened(view);
            return;
        }
        if (this.animateEnabled) {
            this.mDrawerImage.setProgress(1.0f);
        }
        setActionBarDescription();
    }

    @Override
    public void onDrawerClosed(View view) {
        if (this.mDrawerImage == null) {
            super.onDrawerClosed(view);
            return;
        }
        if (this.animateEnabled) {
            this.mDrawerImage.setProgress(0.0f);
        }
        setActionBarDescription();
    }

    protected void setActionBarUpIndicator() {
        try {
            if (this.mActivity != null) {
                try {
                    Class<?> cls = Class.forName("android.app.ActionBar");
                    Class<?>[] clsArr = new Class[1];
                    try {
                        clsArr[0] = Class.forName("android.graphics.drawable.Drawable");
                        cls.getDeclaredMethod("setHomeAsUpIndicator", clsArr).invoke(this.mActivity.getActionBar(), this.mDrawerImage);
                    } catch (ClassNotFoundException e) {
                        throw new NoClassDefFoundError(e.getMessage());
                    }
                } catch (ClassNotFoundException e2) {
                    throw new NoClassDefFoundError(e2.getMessage());
                }
            }
        } catch (Exception e3) {
            Log.e(f4819TAG, "setActionBarUpIndicator error", e3);
            View viewFindViewById = this.mActivity.findViewById(R.id.home);
            if (viewFindViewById != null) {
                ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                if (viewGroup.getChildCount() == 2) {
                    View childAt = viewGroup.getChildAt(0);
                    View childAt2 = viewGroup.getChildAt(1);
                    if (childAt.getId() != 16908332) {
                        childAt2 = childAt;
                    }
                    if (childAt2 instanceof ImageView) {
                        ((ImageView) childAt2).setImageDrawable(this.mDrawerImage);
                    }
                }
            }
        }
    }

    protected void setActionBarDescription() {
        if (this.mActivity != null) {
            try {
                if (this.mActivity.getActionBar() != null) {
                    try {
                        Method declaredMethod = Class.forName("android.app.ActionBar").getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
                        ActionBar actionBar = this.mActivity.getActionBar();
                        Object[] objArr = new Object[1];
                        objArr[0] = new Integer(this.mDrawerLayout.isDrawerOpen(8388611) ? this.mOpenDrawerContentDescRes : this.mCloseDrawerContentDescRes);
                        declaredMethod.invoke(actionBar, objArr);
                        if (Build.VERSION.SDK_INT <= 19) {
                            this.mActivity.getActionBar().setSubtitle(this.mActivity.getActionBar().getSubtitle());
                        }
                    } catch (ClassNotFoundException e) {
                        throw new NoClassDefFoundError(e.getMessage());
                    }
                }
            } catch (Exception e2) {
                Log.e(f4819TAG, "setActionBarUpIndicator", e2);
            }
        }
    }

    public void setAnimateEnabled(boolean z) {
        this.animateEnabled = z;
    }

    public boolean isAnimateEnabled() {
        return this.animateEnabled;
    }
}
