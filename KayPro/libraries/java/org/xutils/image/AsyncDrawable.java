package org.xutils.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

public final class AsyncDrawable extends Drawable {
    private Drawable baseDrawable;
    private final WeakReference<ImageLoader> imageLoaderReference;

    public AsyncDrawable(ImageLoader imageLoader, Drawable drawable) {
        if (imageLoader == null) {
            throw new IllegalArgumentException("imageLoader may not be null");
        }
        this.baseDrawable = drawable;
        while (this.baseDrawable instanceof AsyncDrawable) {
            this.baseDrawable = ((AsyncDrawable) this.baseDrawable).baseDrawable;
        }
        this.imageLoaderReference = new WeakReference<>(imageLoader);
    }

    public ImageLoader getImageLoader() {
        return this.imageLoaderReference.get();
    }

    public void setBaseDrawable(Drawable drawable) {
        this.baseDrawable = drawable;
    }

    public Drawable getBaseDrawable() {
        return this.baseDrawable;
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.baseDrawable != null) {
            this.baseDrawable.draw(canvas);
        }
    }

    @Override
    public void setAlpha(int i) {
        if (this.baseDrawable != null) {
            this.baseDrawable.setAlpha(i);
        }
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.baseDrawable != null) {
            this.baseDrawable.setColorFilter(colorFilter);
        }
    }

    @Override
    public int getOpacity() {
        if (this.baseDrawable == null) {
            return -3;
        }
        return this.baseDrawable.getOpacity();
    }

    @Override
    public void setBounds(int i, int i2, int i3, int i4) {
        if (this.baseDrawable != null) {
            this.baseDrawable.setBounds(i, i2, i3, i4);
        }
    }

    @Override
    public void setBounds(Rect rect) {
        if (this.baseDrawable != null) {
            this.baseDrawable.setBounds(rect);
        }
    }

    @Override
    public void setChangingConfigurations(int i) {
        if (this.baseDrawable != null) {
            this.baseDrawable.setChangingConfigurations(i);
        }
    }

    @Override
    public int getChangingConfigurations() {
        if (this.baseDrawable == null) {
            return 0;
        }
        return this.baseDrawable.getChangingConfigurations();
    }

    @Override
    public void setDither(boolean z) {
        if (this.baseDrawable != null) {
            this.baseDrawable.setDither(z);
        }
    }

    @Override
    public void setFilterBitmap(boolean z) {
        if (this.baseDrawable != null) {
            this.baseDrawable.setFilterBitmap(z);
        }
    }

    @Override
    public void invalidateSelf() {
        if (this.baseDrawable != null) {
            this.baseDrawable.invalidateSelf();
        }
    }

    @Override
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.baseDrawable != null) {
            this.baseDrawable.scheduleSelf(runnable, j);
        }
    }

    @Override
    public void unscheduleSelf(Runnable runnable) {
        if (this.baseDrawable != null) {
            this.baseDrawable.unscheduleSelf(runnable);
        }
    }

    @Override
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        if (this.baseDrawable != null) {
            this.baseDrawable.setColorFilter(i, mode);
        }
    }

    @Override
    public void clearColorFilter() {
        if (this.baseDrawable != null) {
            this.baseDrawable.clearColorFilter();
        }
    }

    @Override
    public boolean isStateful() {
        return this.baseDrawable != null && this.baseDrawable.isStateful();
    }

    @Override
    public boolean setState(int[] iArr) {
        return this.baseDrawable != null && this.baseDrawable.setState(iArr);
    }

    @Override
    public int[] getState() {
        if (this.baseDrawable == null) {
            return null;
        }
        return this.baseDrawable.getState();
    }

    @Override
    public Drawable getCurrent() {
        if (this.baseDrawable == null) {
            return null;
        }
        return this.baseDrawable.getCurrent();
    }

    @Override
    public boolean setVisible(boolean z, boolean z2) {
        return this.baseDrawable != null && this.baseDrawable.setVisible(z, z2);
    }

    @Override
    public Region getTransparentRegion() {
        if (this.baseDrawable == null) {
            return null;
        }
        return this.baseDrawable.getTransparentRegion();
    }

    @Override
    public int getIntrinsicWidth() {
        if (this.baseDrawable == null) {
            return 0;
        }
        return this.baseDrawable.getIntrinsicWidth();
    }

    @Override
    public int getIntrinsicHeight() {
        if (this.baseDrawable == null) {
            return 0;
        }
        return this.baseDrawable.getIntrinsicHeight();
    }

    @Override
    public int getMinimumWidth() {
        if (this.baseDrawable == null) {
            return 0;
        }
        return this.baseDrawable.getMinimumWidth();
    }

    @Override
    public int getMinimumHeight() {
        if (this.baseDrawable == null) {
            return 0;
        }
        return this.baseDrawable.getMinimumHeight();
    }

    @Override
    public boolean getPadding(Rect rect) {
        return this.baseDrawable != null && this.baseDrawable.getPadding(rect);
    }

    @Override
    public Drawable mutate() {
        if (this.baseDrawable == null) {
            return null;
        }
        return this.baseDrawable.mutate();
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        if (this.baseDrawable == null) {
            return null;
        }
        return this.baseDrawable.getConstantState();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        ImageLoader imageLoader = getImageLoader();
        if (imageLoader != null) {
            imageLoader.cancel();
        }
    }
}
