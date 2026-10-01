package com.almlkaide.kaypro.aide.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.support.v4.widget.SwipeRefreshLayout;

public class CustomSwipeRefreshLayout extends SwipeRefreshLayout {
    private void init() {
    }

    public CustomSwipeRefreshLayout(Context context) {
        super(context);
        init();
    }

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        setColorScheme(R.color.holo_red_light, R.color.holo_orange_dark, R.color.holo_blue_dark, R.color.holo_green_dark);
    }
}
