package org.xutils.image;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.io.File;
import org.xutils.x;
import org.xutils.ImageManager;
import org.xutils.common.Callback;

public final class ImageManagerImpl implements ImageManager {
    private static volatile ImageManagerImpl instance;
    private static final Object lock = new Object();

    private ImageManagerImpl() {
    }

    public static void registerInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new ImageManagerImpl();
                }
            }
        }
        ClassX.Ext.setImageManager(instance);
    }

    @Override
    public void bind(final ImageView imageView, final String str) {
        ClassX.task().autoPost(new Runnable() {
            @Override
            public void run() {
                ImageLoader.doBind(imageView, str, null, 0, null);
            }
        });
    }

    @Override
    public void bind(final ImageView imageView, final String str, final ImageOptions imageOptions) {
        ClassX.task().autoPost(new Runnable() {
            @Override
            public void run() {
                ImageLoader.doBind(imageView, str, imageOptions, 0, null);
            }
        });
    }

    @Override
    public void bind(final ImageView imageView, final String str, final Callback.CommonCallback<Drawable> commonCallback) {
        ClassX.task().autoPost(new Runnable() {
            @Override
            public void run() {
                ImageLoader.doBind(imageView, str, null, 0, commonCallback);
            }
        });
    }

    @Override
    public void bind(final ImageView imageView, final String str, final ImageOptions imageOptions, final Callback.CommonCallback<Drawable> commonCallback) {
        ClassX.task().autoPost(new Runnable() {
            @Override
            public void run() {
                ImageLoader.doBind(imageView, str, imageOptions, 0, commonCallback);
            }
        });
    }

    @Override
    public Callback.Cancelable loadDrawable(String str, ImageOptions imageOptions, Callback.CommonCallback<Drawable> commonCallback) {
        return ImageLoader.doLoadDrawable(str, imageOptions, commonCallback);
    }

    @Override
    public Callback.Cancelable loadFile(String str, ImageOptions imageOptions, Callback.CacheCallback<File> cacheCallback) {
        return ImageLoader.doLoadFile(str, imageOptions, cacheCallback);
    }

    @Override
    public void clearMemCache() {
        ImageLoader.clearMemCache();
    }

    @Override
    public void clearCacheFiles() {
        ImageLoader.clearCacheFiles();
        ImageDecoder.clearCacheFiles();
    }
}
