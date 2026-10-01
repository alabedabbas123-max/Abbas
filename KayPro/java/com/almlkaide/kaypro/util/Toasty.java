package com.almlkaide.kaypro.util;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.annotation.CheckResult;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ResourceUtils;
import com.almlkaide.kaypro.aide.AideR;

@SuppressLint("InflateParams")
public class Toasty {
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT = 0;
    static Drawable app_icon;
    static boolean is11;
    static int utils_toast_view_lefticon_resid;
    static int utils_toast_view_msg_resid;
    static int utils_toast_view_resid;
    private static final Typeface LOADED_TOAST_TYPEFACE = Typeface.create("sans-serif-condensed", 0);
    private static Typeface currentTypeface = LOADED_TOAST_TYPEFACE;
    private static int textSize = 14;
    private static boolean tintIcon = true;
    private static boolean allowQueue = true;
    private static Toast lastToast = (Toast) null;
    public static boolean enable = false;

    static {
        is11 = Build.VERSION.SDK_INT >= 30;
        utils_toast_view_resid = 0;
        utils_toast_view_lefticon_resid = 0;
        utils_toast_view_msg_resid = R.id.message;
    }

    Toasty() {
    }

    public static Toast getToast() {
        return lastToast;
    }

    public static void cancel() {
        if (lastToast != null) {
            getToast().cancel();
        }
    }

    @CheckResult
    public static Toast toast(int i) {
        return toast(Utils.getApp().getString(i));
    }

    @CheckResult
    public static Toast toast(CharSequence charSequence) {
        return toast(Utils.getApp(), charSequence, 0);
    }

    @CheckResult
    public static Toast toast(Context context, int i, int i2) {
        return toast(context, context.getString(i), i2);
    }

    @CheckResult
    public static Toast toast(Context context, CharSequence charSequence, int i) {
        return info(charSequence, i, true);
    }

    @CheckResult
    public static Toast success(Context context, int i, int i2) {
        return success(i, i2, true);
    }

    @CheckResult
    public static Toast success(Context context, CharSequence charSequence, int i) {
        return success(charSequence, i, true);
    }

    @CheckResult
    public static Toast normal(int i) {
        return normal((CharSequence) Utils.getApp().getString(i), 0, (Drawable) null, false);
    }

    @CheckResult
    public static Toast normal(CharSequence charSequence) {
        return normal(charSequence, 0, (Drawable) null, false);
    }

    @CheckResult
    public static Toast normal(int i, Drawable drawable) {
        return normal((CharSequence) Utils.getApp().getString(i), 0, drawable, true);
    }

    @CheckResult
    public static Toast normal(CharSequence charSequence, Drawable drawable) {
        return normal(charSequence, 0, drawable, true);
    }

    @CheckResult
    public static Toast normal(int i, int i2) {
        return normal((CharSequence) Utils.getApp().getString(i), i2, (Drawable) null, false);
    }

    @CheckResult
    public static Toast normal(CharSequence charSequence, int i) {
        return normal(charSequence, i, (Drawable) null, false);
    }

    @CheckResult
    public static Toast normal(int i, int i2, Drawable drawable) {
        return normal((CharSequence) Utils.getApp().getString(i), i2, drawable, true);
    }

    @CheckResult
    public static Toast normal(CharSequence charSequence, int i, Drawable drawable) {
        return normal(charSequence, i, drawable, true);
    }

    @CheckResult
    public static Toast normal(int i, int i2, Drawable drawable, boolean z) {
        return custom((CharSequence) Utils.getApp().getString(i), drawable, ToastyUtils.getColor(AideR.color.normalColor), ToastyUtils.getColor(AideR.color.defaultTextColor), i2, z, true);
    }

    @CheckResult
    public static Toast normal(CharSequence charSequence, int i, Drawable drawable, boolean z) {
        return custom(charSequence, drawable, ToastyUtils.getColor(AideR.color.normalColor), ToastyUtils.getColor(AideR.color.defaultTextColor), i, z, true);
    }

    @CheckResult
    public static Toast warning(int i) {
        return warning((CharSequence) Utils.getApp().getString(i), 0, true);
    }

    @CheckResult
    public static Toast warning(CharSequence charSequence) {
        return warning(charSequence, 0, true);
    }

    @CheckResult
    public static Toast warning(int i, int i2) {
        return warning((CharSequence) Utils.getApp().getString(i), i2, true);
    }

    @CheckResult
    public static Toast warning(CharSequence charSequence, int i) {
        return warning(charSequence, i, true);
    }

    @CheckResult
    public static Toast warning(int i, int i2, boolean z) {
        return custom((CharSequence) Utils.getApp().getString(i), ToastyUtils.getDrawable(AideR.drawable.ic_error_outline_white_24dp), ToastyUtils.getColor(AideR.color.warningColor), ToastyUtils.getColor(AideR.color.defaultTextColor), i2, z, true);
    }

    @CheckResult
    public static Toast warning(CharSequence charSequence, int i, boolean z) {
        return custom(charSequence, ToastyUtils.getDrawable(AideR.drawable.ic_error_outline_white_24dp), ToastyUtils.getColor(AideR.color.warningColor), ToastyUtils.getColor(AideR.color.defaultTextColor), i, z, true);
    }

    @CheckResult
    public static Toast info(int i) {
        return info((CharSequence) Utils.getApp().getString(i), 0, true);
    }

    @CheckResult
    public static Toast info(CharSequence charSequence) {
        return info(charSequence, 0, true);
    }

    @CheckResult
    public static Toast info(int i, int i2) {
        return info((CharSequence) Utils.getApp().getString(i), i2, true);
    }

    @CheckResult
    public static Toast info(CharSequence charSequence, int i) {
        return info(charSequence, i, true);
    }

    @CheckResult
    public static Toast info(int i, int i2, boolean z) {
        return custom((CharSequence) Utils.getApp().getString(i), ToastyUtils.getDrawable(AideR.drawable.ic_info_outline_white_24dp), ToastyUtils.getColor(AideR.color.infoColor), ToastyUtils.getColor(AideR.color.defaultTextColor), i2, z, true);
    }

    @CheckResult
    public static Toast info(CharSequence charSequence, int i, boolean z) {
        return custom(charSequence, ToastyUtils.getDrawable(AideR.drawable.ic_info_outline_white_24dp), ToastyUtils.getColor(AideR.color.infoColor), ToastyUtils.getColor(AideR.color.defaultTextColor), i, z, true);
    }

    @CheckResult
    public static Toast success(int i) {
        return success((CharSequence) Utils.getApp().getString(i), 0, true);
    }

    @CheckResult
    public static Toast success(CharSequence charSequence) {
        return success(charSequence, 0, true);
    }

    @CheckResult
    public static Toast success(int i, int i2) {
        return success((CharSequence) Utils.getApp().getString(i), i2, true);
    }

    @CheckResult
    public static Toast success(CharSequence charSequence, int i) {
        return success(charSequence, i, true);
    }

    @CheckResult
    public static Toast success(int i, int i2, boolean z) {
        return custom((CharSequence) Utils.getApp().getString(i), ToastyUtils.getDrawable(AideR.drawable.ic_check_white_24dp), ToastyUtils.getColor(AideR.color.successColor), ToastyUtils.getColor(AideR.color.defaultTextColor), i2, z, true);
    }

    @CheckResult
    public static Toast success(CharSequence charSequence, int i, boolean z) {
        return custom(charSequence, ToastyUtils.getDrawable(AideR.drawable.ic_check_white_24dp), ToastyUtils.getColor(AideR.color.successColor), ToastyUtils.getColor(AideR.color.defaultTextColor), i, z, true);
    }

    @CheckResult
    public static Toast error(int i) {
        return error((CharSequence) Utils.getApp().getString(i), 0, true);
    }

    @CheckResult
    public static Toast error(CharSequence charSequence) {
        return error(charSequence, 0, true);
    }

    @CheckResult
    public static Toast error(int i, int i2) {
        return error((CharSequence) Utils.getApp().getString(i), i2, true);
    }

    @CheckResult
    public static Toast error(CharSequence charSequence, int i) {
        return error(charSequence, i, true);
    }

    @CheckResult
    public static Toast error(int i, int i2, boolean z) {
        return custom((CharSequence) Utils.getApp().getString(i), ToastyUtils.getDrawable(AideR.drawable.ic_clear_white_24dp), ToastyUtils.getColor(AideR.color.errorColor), ToastyUtils.getColor(AideR.color.defaultTextColor), i2, z, true);
    }

    @CheckResult
    public static Toast error(CharSequence charSequence, int i, boolean z) {
        return custom(charSequence, ToastyUtils.getDrawable(AideR.drawable.ic_clear_white_24dp), ToastyUtils.getColor(AideR.color.errorColor), ToastyUtils.getColor(AideR.color.defaultTextColor), i, z, true);
    }

    @CheckResult
    public static Toast custom(int i, Drawable drawable, int i2, boolean z) {
        return custom((CharSequence) Utils.getApp().getString(i), drawable, -1, ToastyUtils.getColor(AideR.color.defaultTextColor), i2, z, false);
    }

    @CheckResult
    public static Toast custom(CharSequence charSequence, Drawable drawable, int i, boolean z) {
        return custom(charSequence, drawable, -1, ToastyUtils.getColor(AideR.color.defaultTextColor), i, z, false);
    }

    @CheckResult
    public static Toast custom(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return custom(Utils.getApp().getString(i), ToastyUtils.getDrawable(i2), ToastyUtils.getColor(i3), ToastyUtils.getColor(AideR.color.defaultTextColor), i4, z, z2);
    }

    @CheckResult
    public static Toast custom(CharSequence charSequence, int i, int i2, int i3, boolean z, boolean z2) {
        return custom(charSequence, ToastyUtils.getDrawable(i), ToastyUtils.getColor(i2), ToastyUtils.getColor(AideR.color.defaultTextColor), i3, z, z2);
    }

    @CheckResult
    public static Toast custom(int i, Drawable drawable, int i2, int i3, boolean z, boolean z2) {
        return custom(Utils.getApp().getString(i), drawable, ToastyUtils.getColor(i2), ToastyUtils.getColor(AideR.color.defaultTextColor), i3, z, z2);
    }

    @CheckResult
    public static Toast custom(int i, Drawable drawable, int i2, int i3, int i4, boolean z, boolean z2) {
        return custom(Utils.getApp().getString(i), drawable, ToastyUtils.getColor(i2), ToastyUtils.getColor(i3), i4, z, z2);
    }

    @CheckResult
    @SuppressLint("ShowToast")
    public static Toast custom(CharSequence charSequence, Drawable drawable, int i, int i2, int i3, boolean z, boolean z2) {
        Drawable drawable2;
        if (!isEnable()) {
            if (!allowQueue) {
                cancel();
            }
            Toast toastCreateDefaultToast = createDefaultToast(Utils.getApp(), charSequence, i3);
            lastToast = toastCreateDefaultToast;
            return toastCreateDefaultToast;
        }
        Toast toastMakeText = Toast.makeText(Utils.getApp(), "", i3);
        View viewInflate = ((LayoutInflater) Utils.getApp().getSystemService("layout_inflater")).inflate(AideR.layout.toast_layout, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(AideR.C1673id.toast_icon);
        TextView textView = (TextView) viewInflate.findViewById(AideR.C1673id.toast_text);
        if (z2) {
            drawable2 = ToastyUtils.tint9PatchDrawableFrame(i);
        } else {
            drawable2 = ToastyUtils.getDrawable(AideR.drawable.toast_frame);
        }
        ToastyUtils.setBackground(viewInflate, drawable2);
        if (z) {
            if (drawable == null) {
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            }
            if (tintIcon) {
                drawable = ToastyUtils.tintIcon(drawable, i2);
            }
            ToastyUtils.setBackground(imageView, drawable);
        } else {
            imageView.setVisibility(8);
        }
        textView.setText(charSequence);
        textView.setTextColor(i2);
        textView.setTypeface(currentTypeface);
        textView.setTextSize(2, textSize);
        toastMakeText.setView(viewInflate);
        if (!allowQueue) {
            cancel();
        }
        lastToast = toastMakeText;
        return toastMakeText;
    }

    private static boolean isEnable() {
        return enable && !is11;
    }

    private static Toast createDefaultToast(Context context, CharSequence charSequence, int i) {
        if (is11) {
            Toast toastMakeText = Toast.makeText(Utils.getApp(), "", i);
            toastMakeText.setText(charSequence);
            return toastMakeText;
        }
        Toast toastMakeText2 = Toast.makeText(Utils.getApp(), "", i);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (utils_toast_view_resid <= 0) {
            utils_toast_view_resid = ResourceUtils.getLayoutIdByName("utils_toast_view");
        }
        if (utils_toast_view_lefticon_resid <= 0) {
            utils_toast_view_lefticon_resid = ResourceUtils.getIdByName("utvLeftIconView");
        }
        View viewInflate = layoutInflater.inflate(utils_toast_view_resid, (ViewGroup) null, false);
        View viewFindViewById = viewInflate.findViewById(utils_toast_view_lefticon_resid);
        if (app_icon == null) {
            app_icon = AppUtils.getAppIcon();
        }
        viewFindViewById.setVisibility(0);
        ViewCompat.setBackground(viewFindViewById, app_icon);
        ((TextView) viewInflate.findViewById(utils_toast_view_msg_resid)).setText(charSequence);
        toastMakeText2.setView(viewInflate);
        return toastMakeText2;
    }

    public static class Config {
        private Typeface typeface = Toasty.currentTypeface;
        private int textSize = Toasty.textSize;
        private boolean tintIcon = Toasty.tintIcon;
        private boolean allowQueue = true;

        Config() {
        }

        @CheckResult
        public static Config getInstance() {
            return new Config();
        }

        public static void reset() {
            Toasty.currentTypeface = Toasty.LOADED_TOAST_TYPEFACE;
            Toasty.textSize = 14;
            Toasty.tintIcon = true;
            Toasty.allowQueue = true;
        }

        @CheckResult
        public Config setToastTypeface(Typeface typeface) {
            this.typeface = typeface;
            return this;
        }

        @CheckResult
        public Config setTextSize(int i) {
            this.textSize = i;
            return this;
        }

        @CheckResult
        public Config tintIcon(boolean z) {
            this.tintIcon = z;
            return this;
        }

        @CheckResult
        public Config allowQueue(boolean z) {
            this.allowQueue = z;
            return this;
        }

        public void apply() {
            Toasty.currentTypeface = this.typeface;
            Toasty.textSize = this.textSize;
            Toasty.tintIcon = this.tintIcon;
            Toasty.allowQueue = this.allowQueue;
        }
    }

    static class ToastyUtils {
        ToastyUtils() {
        }

        static Drawable tintIcon(Drawable drawable, int i) {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            return drawable;
        }

        static Drawable tint9PatchDrawableFrame(int i) {
            return tintIcon((NinePatchDrawable) getDrawable(AideR.drawable.toast_frame), i);
        }

        static void setBackground(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        static Drawable getDrawable(int i) {
            return Utils.getApp().getResources().getDrawable(i);
        }

        static int getColor(int i) {
            return Utils.getColorFromResources(i);
        }
    }
}
