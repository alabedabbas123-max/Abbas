package com.almlkaide.kaypro.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.blankj.utilcode.util.KeyboardUtils;
import com.almlkaide.kaypro.util.Utils;

public class KeyboardFillView extends View {
    public KeyboardFillView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (Utils.getSp().getBoolean("use_adjustPan", false)) {
            KeyboardUtils.registerSoftInputChangedListener((Activity) context, new KeyboardUtils.OnSoftInputChangedListener(this) {
                private final KeyboardFillView this$0;

                {
                    this.this$0 = this;
                }

                public void onSoftInputChanged(int i) {
                    this.this$0.getLayoutParams().height = i;
                    this.this$0.requestLayout();
                }
            });
        }
    }
}
