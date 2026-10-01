package com.almlkaide.kaypro.util;

import android.R;
import android.app.Dialog;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.blankj.utilcode.util.ScreenUtils;

public class DialogHelper {
    public static void showBottomDialog(Dialog dialog) {
        dialog.show();
        customDialog(dialog);
    }

    public static void customDialog(Dialog dialog) {
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (ScreenUtils.isLandscape()) {
            ((ViewGroup.LayoutParams) attributes).width = ScreenUtils.getScreenWidth() / 2;
            attributes.gravity = 81;
        } else {
            ((ViewGroup.LayoutParams) attributes).width = ScreenUtils.getScreenWidth();
            attributes.gravity = 80;
        }
        window.setAttributes(attributes);
        TypedArray typedArrayObtainStyledAttributes = dialog.getContext().obtainStyledAttributes(new int[]{R.attr.colorBackground});
        window.setBackgroundDrawable(typedArrayObtainStyledAttributes.getDrawable(0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
