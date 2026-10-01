package com.almlkaide.kaypro.aide.project;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.almlkaide.kaypro.util.Utils;
import java.io.IOException;

public class PUtils {
    public static int dp2px(float f) {
        return (int) ((Resources.getSystem().getDisplayMetrics().density * f) + 0.5f);
    }

    public static String getAssetsFile(String str) {
        return Utils.getAssetsDataFile(new StringBuffer().append("templates/").append(str).toString());
    }

    public static Bitmap getIcon(Context context, String str) {
        try {
            return BitmapFactory.decodeStream(context.getAssets().open(getAssetsFile(new StringBuffer().append("icons/").append(str).toString())));
        } catch (IOException e) {
            return (Bitmap) null;
        }
    }
}
