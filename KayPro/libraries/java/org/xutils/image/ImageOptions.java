package org.xutils.image;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import org.xutils.common.util.DensityUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;

public class ImageOptions {
    public static final ImageOptions DEFAULT = new ImageOptions();
    private ParamsBuilder paramsBuilder;
    private int maxWidth = 0;
    private int maxHeight = 0;
    private int width = 0;
    private int height = 0;
    private boolean crop = false;
    private int radius = 0;
    private boolean square = false;
    private boolean circular = false;
    private boolean autoRotate = false;
    private boolean compress = true;
    private Bitmap.Config config = Bitmap.Config.RGB_565;
    private boolean ignoreGif = true;
    private int gifRate = 100;
    private int loadingDrawableId = 0;
    private int failureDrawableId = 0;
    private Drawable loadingDrawable = null;
    private Drawable failureDrawable = null;
    private boolean forceLoadingDrawable = true;
    private ImageView.ScaleType placeholderScaleType = ImageView.ScaleType.CENTER_INSIDE;
    private ImageView.ScaleType imageScaleType = ImageView.ScaleType.CENTER_CROP;
    private boolean fadeIn = false;
    private Animation animation = null;
    private boolean useMemCache = true;

    public interface ParamsBuilder {
        RequestParams buildParams(RequestParams requestParams, ImageOptions imageOptions);
    }

    protected ImageOptions() {
    }

    final void optimizeMaxSize(ImageView imageView) {
        if (this.width > 0 && this.height > 0) {
            this.maxWidth = this.width;
            this.maxHeight = this.height;
            return;
        }
        int screenWidth = DensityUtil.getScreenWidth();
        int screenHeight = DensityUtil.getScreenHeight();
        if (this == DEFAULT) {
            int i = (screenWidth * 3) / 2;
            this.width = i;
            this.maxWidth = i;
            int i2 = (screenHeight * 3) / 2;
            this.height = i2;
            this.maxHeight = i2;
            return;
        }
        if (this.width < 0) {
            this.maxWidth = (screenWidth * 3) / 2;
            this.compress = false;
        }
        if (this.height < 0) {
            this.maxHeight = (screenHeight * 3) / 2;
            this.compress = false;
        }
        if (imageView == null && this.maxWidth <= 0 && this.maxHeight <= 0) {
            this.maxWidth = screenWidth;
            this.maxHeight = screenHeight;
            return;
        }
        int maxWidth = this.maxWidth;
        int maxHeight = this.maxHeight;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                if (maxWidth <= 0) {
                    if (layoutParams.width > 0) {
                        maxWidth = layoutParams.width;
                        if (this.width <= 0) {
                            this.width = maxWidth;
                        }
                    } else if (layoutParams.width != -2) {
                        maxWidth = imageView.getWidth();
                    }
                }
                if (maxHeight <= 0) {
                    if (layoutParams.height > 0) {
                        maxHeight = layoutParams.height;
                        if (this.height <= 0) {
                            this.height = maxHeight;
                        }
                    } else if (layoutParams.height != -2) {
                        maxHeight = imageView.getHeight();
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 16) {
                if (maxWidth <= 0) {
                    maxWidth = imageView.getMaxWidth();
                }
                if (maxHeight <= 0) {
                    maxHeight = imageView.getMaxHeight();
                }
            }
        }
        if (maxWidth <= 0) {
            maxWidth = screenWidth;
        }
        if (maxHeight <= 0) {
            maxHeight = screenHeight;
        }
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean isCrop() {
        return this.crop;
    }

    public int getRadius() {
        return this.radius;
    }

    public boolean isSquare() {
        return this.square;
    }

    public boolean isCircular() {
        return this.circular;
    }

    public boolean isIgnoreGif() {
        return this.ignoreGif;
    }

    public int getGifRate() {
        return this.gifRate;
    }

    public boolean isAutoRotate() {
        return this.autoRotate;
    }

    public boolean isCompress() {
        return this.compress;
    }

    public Bitmap.Config getConfig() {
        return this.config;
    }

    public Drawable getLoadingDrawable(ImageView imageView) {
        if (this.loadingDrawable == null && this.loadingDrawableId > 0 && imageView != null) {
            try {
                this.loadingDrawable = imageView.getResources().getDrawable(this.loadingDrawableId);
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
            }
        }
        return this.loadingDrawable;
    }

    public Drawable getFailureDrawable(ImageView imageView) {
        if (this.failureDrawable == null && this.failureDrawableId > 0 && imageView != null) {
            try {
                this.failureDrawable = imageView.getResources().getDrawable(this.failureDrawableId);
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
            }
        }
        return this.failureDrawable;
    }

    public boolean isFadeIn() {
        return this.fadeIn;
    }

    public Animation getAnimation() {
        return this.animation;
    }

    public ImageView.ScaleType getPlaceholderScaleType() {
        return this.placeholderScaleType;
    }

    public ImageView.ScaleType getImageScaleType() {
        return this.imageScaleType;
    }

    public boolean isForceLoadingDrawable() {
        return this.forceLoadingDrawable;
    }

    public boolean isUseMemCache() {
        return this.useMemCache;
    }

    public ParamsBuilder getParamsBuilder() {
        return this.paramsBuilder;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageOptions imageOptions = (ImageOptions) obj;
        if (this.maxWidth == imageOptions.maxWidth && this.maxHeight == imageOptions.maxHeight && this.width == imageOptions.width && this.height == imageOptions.height && this.crop == imageOptions.crop && this.radius == imageOptions.radius && this.square == imageOptions.square && this.circular == imageOptions.circular && this.autoRotate == imageOptions.autoRotate && this.compress == imageOptions.compress) {
            return this.config == imageOptions.config;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.autoRotate ? 1 : 0) + (((this.circular ? 1 : 0) + (((this.square ? 1 : 0) + (((((this.crop ? 1 : 0) + (((((((this.maxWidth * 31) + this.maxHeight) * 31) + this.width) * 31) + this.height) * 31)) * 31) + this.radius) * 31)) * 31)) * 31)) * 31) + (this.compress ? 1 : 0)) * 31) + (this.config != null ? this.config.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("_");
        sb.append(this.maxWidth).append("_");
        sb.append(this.maxHeight).append("_");
        sb.append(this.width).append("_");
        sb.append(this.height).append("_");
        sb.append(this.radius).append("_");
        sb.append(this.config).append("_");
        sb.append(this.crop ? 1 : 0).append(this.square ? 1 : 0).append(this.circular ? 1 : 0);
        sb.append(this.autoRotate ? 1 : 0).append(this.compress ? 1 : 0);
        return sb.toString();
    }

    public static class Builder {
        protected ImageOptions options;

        public Builder() {
            newImageOptions();
        }

        protected void newImageOptions() {
            this.options = new ImageOptions();
        }

        public ImageOptions build() {
            return this.options;
        }

        public Builder setSize(int i, int i2) {
            this.options.width = i;
            this.options.height = i2;
            return this;
        }

        public Builder setCrop(boolean z) {
            this.options.crop = z;
            return this;
        }

        public Builder setRadius(int i) {
            this.options.radius = i;
            return this;
        }

        public Builder setSquare(boolean z) {
            this.options.square = z;
            return this;
        }

        public Builder setCircular(boolean z) {
            this.options.circular = z;
            return this;
        }

        public Builder setAutoRotate(boolean z) {
            this.options.autoRotate = z;
            return this;
        }

        public Builder setConfig(Bitmap.Config config) {
            this.options.config = config;
            return this;
        }

        public Builder setIgnoreGif(boolean z) {
            this.options.ignoreGif = z;
            return this;
        }

        public Builder setGifRate(int i) {
            this.options.gifRate = i;
            return this;
        }

        public Builder setLoadingDrawableId(int i) {
            this.options.loadingDrawableId = i;
            return this;
        }

        public Builder setLoadingDrawable(Drawable drawable) {
            this.options.loadingDrawable = drawable;
            return this;
        }

        public Builder setFailureDrawableId(int i) {
            this.options.failureDrawableId = i;
            return this;
        }

        public Builder setFailureDrawable(Drawable drawable) {
            this.options.failureDrawable = drawable;
            return this;
        }

        public Builder setFadeIn(boolean z) {
            this.options.fadeIn = z;
            return this;
        }

        public Builder setAnimation(Animation animation) {
            this.options.animation = animation;
            return this;
        }

        public Builder setPlaceholderScaleType(ImageView.ScaleType scaleType) {
            this.options.placeholderScaleType = scaleType;
            return this;
        }

        public Builder setImageScaleType(ImageView.ScaleType scaleType) {
            this.options.imageScaleType = scaleType;
            return this;
        }

        public Builder setForceLoadingDrawable(boolean z) {
            this.options.forceLoadingDrawable = z;
            return this;
        }

        public Builder setUseMemCache(boolean z) {
            this.options.useMemCache = z;
            return this;
        }

        public Builder setParamsBuilder(ParamsBuilder paramsBuilder) {
            this.options.paramsBuilder = paramsBuilder;
            return this;
        }
    }
}
