package org.xutils.view;

import android.app.Activity;
import android.view.View;

final class ViewFinder {
    private Activity activity;
    private View view;

    public ViewFinder(View view) {
        this.view = view;
    }

    public ViewFinder(Activity activity) {
        this.activity = activity;
    }

    public View findViewById(int i) {
        if (this.view != null) {
            return this.view.findViewById(i);
        }
        if (this.activity != null) {
            return this.activity.findViewById(i);
        }
        return null;
    }

    public View findViewByInfo(ViewInfo viewInfo) {
        return findViewById(viewInfo.value, viewInfo.parentId);
    }

    public View findViewById(int i, int i2) {
        View viewFindViewById = null;
        if (i2 > 0) {
            viewFindViewById = findViewById(i2);
        }
        if (viewFindViewById != null) {
            return viewFindViewById.findViewById(i);
        }
        return findViewById(i);
    }
}
