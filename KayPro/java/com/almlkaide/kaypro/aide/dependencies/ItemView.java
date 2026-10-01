package com.almlkaide.kaypro.aide.dependencies;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.blankj.utilcode.util.SizeUtils;

public class ItemView extends LinearLayout {

    final CheckBox f4960cb;

    final Context f4961ctx;
    final TextView text;

    public ItemView(Context context) {
        super(context);
        this.f4961ctx = context;
        int iDp2px = dp2px(10);
        setPadding(iDp2px, iDp2px, iDp2px, iDp2px);
        this.f4960cb = new CheckBox(context);
        this.text = new TextView(context);
        setGravity(16);
        this.f4960cb.setClickable(false);
        this.f4960cb.setFocusable(false);
        this.text.setPadding(SizeUtils.dp2px(10), 0, 0, 0);
        this.text.setTextAppearance(context, R.style.TextAppearance.Large);
        this.text.setTextSize(15);
        addView(this.f4960cb);
        addView(this.text);
    }

    public void setChecked(boolean z) {
        this.f4960cb.setChecked(z);
    }

    public void setText(CharSequence charSequence) {
        this.text.setText(charSequence);
    }

    public static int dp2px(float f) {
        return (int) ((Resources.getSystem().getDisplayMetrics().density * f) + 0.5f);
    }
}
