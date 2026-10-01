package com.almlkaide.kaypro.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;

public class VPDrawerLayout extends DrawerLayout implements DrawerLayout.DrawerListener, ViewPager.OnPageChangeListener, View.OnTouchListener {
    private boolean closeIng;
    private ViewPager viewPager;

    public VPDrawerLayout(Context context) {
        super(context);
        block$1020();
        this.closeIng = true;
    }

    public VPDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        block$1020();
        this.closeIng = true;
    }

    public VPDrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        block$1020();
        this.closeIng = true;
    }

    private void block$1020() {
        init();
    }

    private ViewPager findViewPager(ViewGroup viewGroup) {
        ViewPager viewPagerFindViewPager;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= viewGroup.getChildCount()) {
                return (ViewPager) null;
            }
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof ViewPager) {
                return (ViewPager) childAt;
            }
            if ((childAt instanceof ViewGroup) && (viewPagerFindViewPager = findViewPager((ViewGroup) childAt)) != null) {
                return viewPagerFindViewPager;
            }
            i = i2 + 1;
        }
    }

    private void init() {
        addDrawerListener(this);
        setOnTouchListener(this);
    }

    @Override
    public void onDrawerClosed(View view) {
        setDrawerLockMode(0);
    }

    @Override
    public void onDrawerOpened(View view) {
        setDrawerLockMode(2);
        if (this.viewPager != null) {
            onPageSelected(this.viewPager.getCurrentItem());
        }
    }

    @Override
    public void onDrawerSlide(View view, float f) {
    }

    @Override
    public void onDrawerStateChanged(int i) {
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ViewPager viewPagerFindViewPager = findViewPager(this);
        if (viewPagerFindViewPager != null) {
            setViewPager(viewPagerFindViewPager);
        }
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !isDrawerOpen(8388611)) {
            return super.onKeyDown(i, keyEvent);
        }
        closeDrawers();
        return true;
    }

    @Override
    public void onPageScrollStateChanged(int i) {
    }

    @Override
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override
    public void onPageSelected(int i) {
        if (i == this.viewPager.getAdapter().getCount() - 1) {
            setDrawerLockMode(0);
        } else if (getDrawerLockMode(8388611) == 0) {
            setDrawerLockMode(2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.closeIng = true;
                return false;
            case 1:
                if (this.closeIng) {
                    closeDrawers();
                }
                return false;
            case 2:
                this.closeIng = false;
                return false;
            default:
                return false;
        }
    }

    public void setViewPager(ViewPager viewPager) {
        this.viewPager = viewPager;
        viewPager.addOnPageChangeListener(this);
    }
}
