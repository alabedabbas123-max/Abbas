package com.almlkaide.kaypro.aide.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.aide.ui.views.SplitView;
import com.almlkaide.kaypro.aide.util.AIDEUtils;
import com.almlkaide.kaypro.util.ViewUtil;

public class CustomSplitView extends SplitView {
    public CustomSplitView(Context context) {
        super(context);
    }

    public CustomSplitView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomSplitView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View getSeparatorView() {
        View viewFindViewByTag = ViewUtil.findViewByTag((ViewGroup) this, (Object) "split_separator");
        if (viewFindViewByTag == null) {
            throw new RuntimeException("split_separator is null");
        }
        return viewFindViewByTag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View getBottomView() {
        View viewFindViewByTag = ViewUtil.findViewByTag((ViewGroup) this, (Object) "BrowserPager");
        if (viewFindViewByTag == null) {
            throw new RuntimeException("BrowserPager is null");
        }
        return viewFindViewByTag;
    }

    public void setSwipeEnabled(boolean z) {
        if (AIDEUtils.getMainDrawerLayout() != null) {
            z = false;
        }
        super.setSwipeEnabled(z);
    }
}
