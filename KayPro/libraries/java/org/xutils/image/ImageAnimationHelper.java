package org.xutils.image;

import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import java.lang.reflect.Method;
import org.xutils.common.util.LogUtil;

public final class ImageAnimationHelper {
    private static final Method cloneMethod;

    static {
        Method declaredMethod;
        try {
            declaredMethod = Animation.class.getDeclaredMethod("clone", new Class[0]);
            declaredMethod.setAccessible(true);
        } catch (Throwable th) {
            declaredMethod = null;
            LogUtil.m9052w(th.getMessage(), th);
        }
        cloneMethod = declaredMethod;
    }

    private ImageAnimationHelper() {
    }

    public static void fadeInDisplay(ImageView imageView, Drawable drawable) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        imageView.setImageDrawable(drawable);
        imageView.startAnimation(alphaAnimation);
    }

    public static void animationDisplay(ImageView imageView, Drawable drawable, Animation animation) {
        imageView.setImageDrawable(drawable);
        if (cloneMethod != null && animation != null) {
            try {
                imageView.startAnimation((Animation) cloneMethod.invoke(animation, new Object[0]));
                return;
            } catch (Throwable th) {
                imageView.startAnimation(animation);
                return;
            }
        }
        imageView.startAnimation(animation);
    }
}
