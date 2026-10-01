package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import com.sun.tools.javac.jvm.ByteCodes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import sun.misc.FloatConsts;

public final class ToastUtils {
    private static final int COLOR_DEFAULT = -16777217;
    private static final ToastUtils DEFAULT_MAKER = make();
    private static final String NOTHING = "toast nothing";
    private static final String NULL = "toast null";
    private static final String TAG_TOAST = "TAG_TOAST";
    private static IToast iToast;
    private String mMode;
    private int mGravity = -1;
    private int mXOffset = -1;
    private int mYOffset = -1;
    private int mBgColor = COLOR_DEFAULT;
    private int mBgResource = -1;
    private int mTextColor = COLOR_DEFAULT;
    private int mTextSize = -1;
    private boolean isLong = false;
    private Drawable[] mIcons = new Drawable[4];
    private boolean isNotUseSystemToast = false;

    static abstract class AbsToast implements IToast {
        protected Toast mToast = new Toast(Utils.getApp());
        protected ToastUtils mToastUtils;
        protected View mToastView;

        AbsToast(ToastUtils toastUtils) {
            this.mToastUtils = toastUtils;
            if (toastUtils.mGravity == -1 && this.mToastUtils.mXOffset == -1 && this.mToastUtils.mYOffset == -1) {
                return;
            }
            this.mToast.setGravity(this.mToastUtils.mGravity, this.mToastUtils.mXOffset, this.mToastUtils.mYOffset);
        }

        @Override
        public void cancel() {
            Toast toast = this.mToast;
            if (toast != null) {
                toast.cancel();
            }
            this.mToast = null;
            this.mToastView = null;
        }

        protected void setBg(TextView textView) {
            if (this.mToastUtils.mBgResource != -1) {
                this.mToastView.setBackgroundResource(this.mToastUtils.mBgResource);
                textView.setBackgroundColor(0);
                return;
            }
            if (this.mToastUtils.mBgColor != ToastUtils.COLOR_DEFAULT) {
                Drawable background = this.mToastView.getBackground();
                Drawable background2 = textView.getBackground();
                if (background != null && background2 != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.mToastUtils.mBgColor, PorterDuff.Mode.SRC_IN));
                    textView.setBackgroundColor(0);
                } else if (background != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.mToastUtils.mBgColor, PorterDuff.Mode.SRC_IN));
                } else if (background2 != null) {
                    background2.mutate().setColorFilter(new PorterDuffColorFilter(this.mToastUtils.mBgColor, PorterDuff.Mode.SRC_IN));
                } else {
                    this.mToastView.setBackgroundColor(this.mToastUtils.mBgColor);
                }
            }
        }

        @Override
        public void setToastView(View view) {
            this.mToastView = view;
            this.mToast.setView(view);
        }

        @Override
        public void setToastView(CharSequence charSequence) {
            View viewTryApplyUtilsToastView = this.mToastUtils.tryApplyUtilsToastView(charSequence);
            if (viewTryApplyUtilsToastView != null) {
                setToastView(viewTryApplyUtilsToastView);
                return;
            }
            View view = this.mToast.getView();
            this.mToastView = view;
            if (view == null || view.findViewById(R.id.message) == null) {
                setToastView(UtilsBridge.layoutId2View(ResourceUtils.getLayoutIdByName("utils_toast_view")));
            }
            TextView textView = (TextView) this.mToastView.findViewById(R.id.message);
            textView.setText(charSequence);
            if (this.mToastUtils.mTextColor != ToastUtils.COLOR_DEFAULT) {
                textView.setTextColor(this.mToastUtils.mTextColor);
            }
            if (this.mToastUtils.mTextSize != -1) {
                textView.setTextSize(this.mToastUtils.mTextSize);
            }
            setBg(textView);
        }
    }

    static final class ActivityToast extends AbsToast {
        private static int sShowingIndex;
        private Utils.ActivityLifecycleCallbacks mActivityLifecycleCallbacks;

        ActivityToast(ToastUtils toastUtils) {
            super(toastUtils);
        }

        private View getToastViewSnapshot(int i) {
            Bitmap bitmapView2Bitmap = UtilsBridge.view2Bitmap(this.mToastView);
            ImageView imageView = new ImageView(Utils.getApp());
            imageView.setTag(ToastUtils.TAG_TOAST + i);
            imageView.setImageBitmap(bitmapView2Bitmap);
            return imageView;
        }

        public boolean isShowing() {
            return this.mActivityLifecycleCallbacks != null;
        }

        private void registerLifecycleCallback() {
            final int i = sShowingIndex;
            Utils.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Utils.ActivityLifecycleCallbacks() {
                @Override
                public void onActivityCreated(Activity activity) {
                    if (ActivityToast.this.isShowing()) {
                        ActivityToast.this.showWithActivity(activity, i, false);
                    }
                }
            };
            this.mActivityLifecycleCallbacks = activityLifecycleCallbacks;
            UtilsBridge.addActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }

        private void showSystemToast(int i) {
            SystemToast systemToast = new SystemToast(this.mToastUtils);
            systemToast.mToast = this.mToast;
            systemToast.show(i);
        }

        public void showWithActivity(Activity activity, int i, boolean z) {
            Window window = activity.getWindow();
            if (window != null) {
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = this.mToast.getGravity();
                layoutParams.bottomMargin = this.mToast.getYOffset() + UtilsBridge.getNavBarHeight();
                layoutParams.leftMargin = this.mToast.getXOffset();
                View toastViewSnapshot = getToastViewSnapshot(i);
                if (z) {
                    toastViewSnapshot.setAlpha(0.0f);
                    toastViewSnapshot.animate().alpha(1.0f).setDuration(200L).start();
                }
                viewGroup.addView(toastViewSnapshot, layoutParams);
            }
        }

        private void unregisterLifecycleCallback() {
            UtilsBridge.removeActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
            this.mActivityLifecycleCallbacks = null;
        }

        @Override
        public void cancel() {
            Window window;
            if (isShowing()) {
                unregisterLifecycleCallback();
                for (Activity activity : UtilsBridge.getActivityList()) {
                    if (UtilsBridge.isActivityAlive(activity) && (window = activity.getWindow()) != null) {
                        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                        StringBuilder sb = new StringBuilder();
                        sb.append(ToastUtils.TAG_TOAST);
                        sb.append(sShowingIndex - 1);
                        View viewFindViewWithTag = viewGroup.findViewWithTag(sb.toString());
                        if (viewFindViewWithTag != null) {
                            try {
                                viewGroup.removeView(viewFindViewWithTag);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            super.cancel();
        }

        @Override
        public void show(int i) {
            if (this.mToast == null) {
                return;
            }
            if (!UtilsBridge.isAppForeground()) {
                showSystemToast(i);
                return;
            }
            boolean z = false;
            for (Activity activity : UtilsBridge.getActivityList()) {
                if (UtilsBridge.isActivityAlive(activity)) {
                    showWithActivity(activity, sShowingIndex, true);
                    z = true;
                }
            }
            if (!z) {
                showSystemToast(i);
                return;
            }
            registerLifecycleCallback();
            UtilsBridge.runOnUiThreadDelayed(new Runnable() {
                @Override
                public void run() {
                    ActivityToast.this.cancel();
                }
            }, i == 0 ? 2000L : 3500L);
            sShowingIndex++;
        }
    }

    interface IToast {
        void cancel();

        void setToastView(View view);

        void setToastView(CharSequence charSequence);

        void show(int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MODE {
        public static final String DARK = "dark";
        public static final String LIGHT = "light";
    }

    static final class SystemToast extends AbsToast {

        static class SafeHandler extends Handler {
            private Handler impl;

            SafeHandler(Handler handler) {
                this.impl = handler;
            }

            @Override
            public void dispatchMessage(Message message) {
                try {
                    this.impl.dispatchMessage(message);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void handleMessage(Message message) {
                this.impl.handleMessage(message);
            }
        }

        SystemToast(ToastUtils toastUtils) {
            super(toastUtils);
            if (Build.VERSION.SDK_INT == 25) {
                try {
                    Field declaredField = Toast.class.getDeclaredField("mTN");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.mToast);
                    Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, new SafeHandler((Handler) declaredField2.get(obj)));
                } catch (Exception unused) {
                }
            }
        }

        @Override
        public void show(int i) {
            if (this.mToast == null) {
                return;
            }
            this.mToast.setDuration(i);
            this.mToast.show();
        }
    }

    public static final class UtilsMaxWidthRelativeLayout extends RelativeLayout {
        private static final int SPACING = UtilsBridge.dp2px(80.0f);

        public UtilsMaxWidthRelativeLayout(Context context) {
            super(context);
        }

        public UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(UtilsBridge.getAppScreenWidth() - SPACING, FloatConsts.SIGN_BIT_MASK), i2);
        }
    }

    static final class WindowManagerToast extends AbsToast {
        private Utils.ActivityLifecycleCallbacks mActivityLifecycleCallbacks;
        private WindowManager.LayoutParams mParams;

        private WindowManager f18mWM;

        WindowManagerToast(ToastUtils toastUtils, int i) {
            super(toastUtils);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.mParams = layoutParams;
            layoutParams.type = i;
        }

        @Override
        public void cancel() {
            try {
                if (this.f18mWM != null) {
                    this.f18mWM.removeViewImmediate(this.mToastView);
                    this.f18mWM = null;
                }
            } catch (Exception unused) {
            }
            super.cancel();
        }

        @Override
        public void show(int i) {
            if (this.mToast == null) {
                return;
            }
            this.mParams.height = -2;
            this.mParams.width = -2;
            this.mParams.format = -3;
            this.mParams.windowAnimations = R.style.Animation.Toast;
            this.mParams.setTitle("ToastWithoutNotification");
            this.mParams.flags = ByteCodes.dcmpg;
            this.mParams.packageName = Utils.getApp().getPackageName();
            this.mParams.gravity = this.mToast.getGravity();
            if ((this.mParams.gravity & 7) == 7) {
                this.mParams.horizontalWeight = 1.0f;
            }
            if ((this.mParams.gravity & ByteCodes.imod) == 112) {
                this.mParams.verticalWeight = 1.0f;
            }
            this.mParams.x = this.mToast.getXOffset();
            this.mParams.y = this.mToast.getYOffset();
            this.mParams.horizontalMargin = this.mToast.getHorizontalMargin();
            this.mParams.verticalMargin = this.mToast.getVerticalMargin();
            WindowManager windowManager = (WindowManager) Utils.getApp().getSystemService("window");
            this.f18mWM = windowManager;
            if (windowManager != null) {
                try {
                    windowManager.addView(this.mToastView, this.mParams);
                } catch (Exception unused) {
                }
            }
            UtilsBridge.runOnUiThreadDelayed(new Runnable() {
                @Override
                public void run() {
                    WindowManagerToast.this.cancel();
                }
            }, i == 0 ? 2000L : 3500L);
        }
    }

    public static void cancel() {
        IToast iToast2 = iToast;
        if (iToast2 != null) {
            iToast2.cancel();
            iToast = null;
        }
    }

    public static ToastUtils getDefaultMaker() {
        return DEFAULT_MAKER;
    }

    private int getDuration() {
        return this.isLong ? 1 : 0;
    }

    private static CharSequence getToastFriendlyText(CharSequence charSequence) {
        if (charSequence == null) {
            return NULL;
        }
        return charSequence.length() == 0 ? NOTHING : charSequence;
    }

    public static ToastUtils make() {
        return new ToastUtils();
    }

    public static IToast newToast(ToastUtils toastUtils) {
        if (toastUtils.isNotUseSystemToast || !NotificationManagerCompat.from(Utils.getApp()).areNotificationsEnabled() || (Build.VERSION.SDK_INT >= 23 && UtilsBridge.isGrantedDrawOverlays())) {
            if (Build.VERSION.SDK_INT < 25) {
                return new WindowManagerToast(toastUtils, 2005);
            }
            if (UtilsBridge.isGrantedDrawOverlays()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    new WindowManagerToast(toastUtils, 2038);
                } else {
                    new WindowManagerToast(toastUtils, 2002);
                }
            }
            return new ActivityToast(toastUtils);
        }
        return new SystemToast(toastUtils);
    }

    private static void show(View view, int i, ToastUtils toastUtils) {
        show(view, null, i, toastUtils);
    }

    private static void show(final View view, final CharSequence charSequence, final int i, ToastUtils toastUtils) {
        UtilsBridge.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                ToastUtils.cancel();
                IToast unused = ToastUtils.iToast = ToastUtils.newToast(ToastUtils.this);
                if (view != null) {
                    ToastUtils.iToast.setToastView(view);
                } else {
                    ToastUtils.iToast.setToastView(charSequence);
                }
                ToastUtils.iToast.show(i);
            }
        });
    }

    private static void show(CharSequence charSequence, int i, ToastUtils toastUtils) {
        show(null, getToastFriendlyText(charSequence), i, toastUtils);
    }

    public static void showLong(int i) {
        show(UtilsBridge.getString(i), 1, DEFAULT_MAKER);
    }

    public static void showLong(int i, Object... objArr) {
        show(UtilsBridge.getString(i), 1, DEFAULT_MAKER);
    }

    public static void showLong(CharSequence charSequence) {
        show(charSequence, 1, DEFAULT_MAKER);
    }

    public static void showLong(String str, Object... objArr) {
        show(UtilsBridge.format(str, objArr), 1, DEFAULT_MAKER);
    }

    public static void showShort(int i) {
        show(UtilsBridge.getString(i), 0, DEFAULT_MAKER);
    }

    public static void showShort(int i, Object... objArr) {
        show(UtilsBridge.getString(i, objArr), 0, DEFAULT_MAKER);
    }

    public static void showShort(CharSequence charSequence) {
        show(charSequence, 0, DEFAULT_MAKER);
    }

    public static void showShort(String str, Object... objArr) {
        show(UtilsBridge.format(str, objArr), 0, DEFAULT_MAKER);
    }

    public View tryApplyUtilsToastView(CharSequence charSequence) {
        if (!MODE.DARK.equals(this.mMode) && !MODE.LIGHT.equals(this.mMode)) {
            Drawable[] drawableArr = this.mIcons;
            if (drawableArr[0] == null && drawableArr[1] == null && drawableArr[2] == null && drawableArr[3] == null) {
                return null;
            }
        }
        View viewLayoutId2View = UtilsBridge.layoutId2View(ResourceUtils.getLayoutIdByName("utils_toast_view"));
        TextView textView = (TextView) viewLayoutId2View.findViewById(R.id.message);
        if (MODE.DARK.equals(this.mMode)) {
            ((GradientDrawable) viewLayoutId2View.getBackground().mutate()).setColor(Color.parseColor("#BB000000"));
            textView.setTextColor(-1);
        }
        textView.setText(charSequence);
        if (this.mIcons[0] != null) {
            View viewFindViewById = viewLayoutId2View.findViewById(ResourceUtils.getIdByName("utvLeftIconView"));
            ViewCompat.setBackground(viewFindViewById, this.mIcons[0]);
            viewFindViewById.setVisibility(0);
        }
        if (this.mIcons[1] != null) {
            View viewFindViewById2 = viewLayoutId2View.findViewById(ResourceUtils.getIdByName("utvTopIconView"));
            ViewCompat.setBackground(viewFindViewById2, this.mIcons[1]);
            viewFindViewById2.setVisibility(0);
        }
        if (this.mIcons[2] != null) {
            View viewFindViewById3 = viewLayoutId2View.findViewById(ResourceUtils.getIdByName("utvRightIconView"));
            ViewCompat.setBackground(viewFindViewById3, this.mIcons[2]);
            viewFindViewById3.setVisibility(0);
        }
        if (this.mIcons[3] != null) {
            View viewFindViewById4 = viewLayoutId2View.findViewById(ResourceUtils.getIdByName("utvBottomIconView"));
            ViewCompat.setBackground(viewFindViewById4, this.mIcons[3]);
            viewFindViewById4.setVisibility(0);
        }
        return viewLayoutId2View;
    }

    public final ToastUtils setBgColor(int i) {
        this.mBgColor = i;
        return this;
    }

    public final ToastUtils setBgResource(int i) {
        this.mBgResource = i;
        return this;
    }

    public final ToastUtils setBottomIcon(int i) {
        return setBottomIcon(ContextCompat.getDrawable(Utils.getApp(), i));
    }

    public final ToastUtils setBottomIcon(Drawable drawable) {
        this.mIcons[3] = drawable;
        return this;
    }

    public final ToastUtils setDurationIsLong(boolean z) {
        this.isLong = z;
        return this;
    }

    public final ToastUtils setGravity(int i, int i2, int i3) {
        this.mGravity = i;
        this.mXOffset = i2;
        this.mYOffset = i3;
        return this;
    }

    public final ToastUtils setLeftIcon(int i) {
        return setLeftIcon(ContextCompat.getDrawable(Utils.getApp(), i));
    }

    public final ToastUtils setLeftIcon(Drawable drawable) {
        this.mIcons[0] = drawable;
        return this;
    }

    public final ToastUtils setMode(String str) {
        this.mMode = str;
        return this;
    }

    public final ToastUtils setNotUseSystemToast() {
        this.isNotUseSystemToast = true;
        return this;
    }

    public final ToastUtils setRightIcon(int i) {
        return setRightIcon(ContextCompat.getDrawable(Utils.getApp(), i));
    }

    public final ToastUtils setRightIcon(Drawable drawable) {
        this.mIcons[2] = drawable;
        return this;
    }

    public final ToastUtils setTextColor(int i) {
        this.mTextColor = i;
        return this;
    }

    public final ToastUtils setTextSize(int i) {
        this.mTextSize = i;
        return this;
    }

    public final ToastUtils setTopIcon(int i) {
        return setTopIcon(ContextCompat.getDrawable(Utils.getApp(), i));
    }

    public final ToastUtils setTopIcon(Drawable drawable) {
        this.mIcons[1] = drawable;
        return this;
    }

    public final void show(int i) {
        show(UtilsBridge.getString(i), getDuration(), this);
    }

    public final void show(int i, Object... objArr) {
        show(UtilsBridge.getString(i, objArr), getDuration(), this);
    }

    public final void show(View view) {
        show(view, getDuration(), this);
    }

    public final void show(CharSequence charSequence) {
        show(charSequence, getDuration(), this);
    }

    public final void show(String str, Object... objArr) {
        show(UtilsBridge.format(str, objArr), getDuration(), this);
    }
}
