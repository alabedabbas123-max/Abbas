package org.xutils.image;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.widget.ImageView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.xutils.x;
import org.xutils.cache.LruCache;
import org.xutils.cache.LruDiskCache;
import org.xutils.common.Callback;
import org.xutils.common.task.Priority;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.http.RequestParams;
import org.xutils.ex.FileLockedException;

final class ImageLoader implements Callback.PrepareCallback<File, Drawable>, Callback.CacheCallback<Drawable>, Callback.ProgressCallback<Drawable>, Callback.TypedCallback<Drawable>, Callback.Cancelable {
    private static final String DISK_CACHE_DIR_NAME = "xUtils_img";
    private static final HashMap<String, FakeImageView> FAKE_IMG_MAP;
    private static final int MEM_CACHE_MIN_SIZE = 4194304;
    private static final Type loadType;
    private Callback.CacheCallback<Drawable> cacheCallback;
    private Callback.CommonCallback<Drawable> callback;
    private Callback.Cancelable httpCancelable;

    private MemCacheKey f6735key;
    private ImageOptions options;
    private Callback.PrepareCallback<File, Drawable> prepareCallback;
    private Callback.ProgressCallback<Drawable> progressCallback;
    private WeakReference<ImageView> viewRef;
    private static final AtomicLong SEQ_SEEK = new AtomicLong(0);
    private static final Executor EXECUTOR = new PriorityExecutor(10, false);
    private static final LruCache<MemCacheKey, Drawable> MEM_CACHE = new LruCache<MemCacheKey, Drawable>(4194304) {
        private boolean deepClear = false;

        @Override
        public int sizeOf(MemCacheKey memCacheKey, Drawable drawable) {
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap == null) {
                    return 0;
                }
                return bitmap.getByteCount();
            }
            if (drawable instanceof GifDrawable) {
                return ((GifDrawable) drawable).getByteCount();
            }
            return super.sizeOf(memCacheKey, drawable);
        }

        @Override
        public void trimToSize(int i) {
            if (i < 0) {
                this.deepClear = true;
            }
            super.trimToSize(i);
            this.deepClear = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override
        public void entryRemoved(boolean z, MemCacheKey memCacheKey, Drawable drawable, Drawable drawable2) {
            super.entryRemoved(z, memCacheKey, drawable, drawable2);
            if (z && this.deepClear && (drawable instanceof ReusableDrawable)) {
                ((ReusableDrawable) drawable).setMemCacheKey(null);
            }
        }
    };
    private int fileLockedExceptionRetryCount = 0;

    private final long f6736seq = SEQ_SEEK.incrementAndGet();
    private volatile boolean stopped = false;
    private volatile boolean cancelled = false;
    private volatile boolean skipOnWaitingCallback = false;
    private volatile boolean skipOnFinishedCallback = false;
    private boolean hasCache = false;

    static {
        int memoryClass = (((ActivityManager) ClassX.m9074app().getSystemService("activity")).getMemoryClass() * 1048576) / 8;
        if (memoryClass < 4194304) {
            memoryClass = 4194304;
        }
        MEM_CACHE.resize(memoryClass);
        FAKE_IMG_MAP = new HashMap<>();
        loadType = File.class;
    }

    private ImageLoader() {
    }

    static void clearMemCache() {
        MEM_CACHE.evictAll();
    }

    static void clearCacheFiles() {
        LruDiskCache.getDiskCache(DISK_CACHE_DIR_NAME).clearCacheFiles();
    }

    static Callback.Cancelable doLoadDrawable(String str, ImageOptions imageOptions, Callback.CommonCallback<Drawable> commonCallback) {
        if (TextUtils.isEmpty(str)) {
            postArgsException(null, imageOptions, "url is null", commonCallback);
            return null;
        }
        return doBind(new FakeImageView(), str, imageOptions, 0, commonCallback);
    }

    static Callback.Cancelable doLoadFile(String str, ImageOptions imageOptions, Callback.CacheCallback<File> cacheCallback) {
        if (TextUtils.isEmpty(str)) {
            postArgsException(null, imageOptions, "url is null", cacheCallback);
            return null;
        }
        return ClassX.http().mo9034get(createRequestParams(null, str, imageOptions), cacheCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.$r8$lambda$3Jn-YhBaujEHu2U7RtYHYfrstds(FixTypesVisitor.java:0)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor$$ExternalSyntheticLambda8.apply(D8$$SyntheticClass:0)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static Callback.Cancelable doBind(ImageView imageView, String str, ImageOptions imageOptions, int i, Callback.CommonCallback<Drawable> commonCallback) {
        boolean z;
        MemCacheKey memCacheKey;
        boolean zEquals;
        java.lang.Object r2;
        Drawable drawable;
        java.lang.Object r3;
        boolean zOnCache;
        boolean z2;
        Bitmap bitmap;
        java.lang.Object r4;
        boolean zIsRecycled;
        boolean z3;
        java.lang.Object r5 = 0;
        if (imageView == null) {
            postArgsException(null, imageOptions, "view is null", commonCallback);
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            postArgsException(imageView, imageOptions, "url is null", commonCallback);
            return null;
        }
        if (imageOptions == null) {
            imageOptions = ImageOptions.DEFAULT;
        }
        imageOptions.optimizeMaxSize(imageView);
        MemCacheKey memCacheKey2 = new MemCacheKey(str, imageOptions);
        Object drawable2 = imageView.getDrawable();
        boolean z4 = drawable2 instanceof AsyncDrawable;
        if (z4) {
            ImageLoader imageLoader = ((AsyncDrawable) drawable2).getImageLoader();
            if (imageLoader != null && !(z3 = imageLoader.stopped)) {
                boolean zEquals2 = memCacheKey2.equals(imageLoader.f6735key);
                if (zEquals2) {
                    r2 = z4;
                    r2 = z3;
                    return null;
                }
                r2 = z4;
                r2 = z3;
                imageLoader.cancel();
                r2 = zEquals2;
            }
        } else {
            z = drawable2 instanceof ReusableDrawable;
            if (z && (memCacheKey = ((ReusableDrawable) drawable2).getMemCacheKey()) != null && (zEquals = memCacheKey.equals(memCacheKey2))) {
                r2 = z;
                r2 = memCacheKey;
                r2 = zEquals;
                LruCache lruCache = MEM_CACHE;
                lruCache.m9036put(memCacheKey2, drawable2);
                r2 = lruCache;
            }
        }
        r2 = z;
        r2 = memCacheKey;
        r2 = zEquals;
        r2 = z;
        r2 = memCacheKey;
        r2 = z;
        r2 = z4;
        r2 = z3;
        r2 = z4;
        if (imageOptions.isUseMemCache()) {
            Drawable drawableM9035get = MEM_CACHE.m9035get(memCacheKey2);
            boolean z5 = drawableM9035get instanceof BitmapDrawable;
            if (z5 && ((bitmap = ((BitmapDrawable) drawableM9035get).getBitmap()) == null || (zIsRecycled = bitmap.isRecycled()))) {
                z2 = z5;
                r4 = bitmap;
                r4 = zIsRecycled;
                z2 = zIsRecycled;
                z2 = z5;
                r4 = bitmap;
                drawable = null;
                r3 = r4;
            } else {
                z2 = z5;
                r4 = bitmap;
                r4 = zIsRecycled;
                z2 = zIsRecycled;
                z2 = z5;
                drawable = drawableM9035get;
                r3 = z2;
            }
        } else {
            drawable = null;
            r3 = r2;
        }
        try {
            try {
                if (drawable == null) {
                    ImageLoader imageLoader2 = new ImageLoader();
                    imageLoader2.fileLockedExceptionRetryCount = i;
                    return imageLoader2.doLoadRequest(imageView, str, imageOptions, commonCallback);
                }
                try {
                    if (commonCallback instanceof Callback.ProgressCallback) {
                        try {
                            ((Callback.ProgressCallback) commonCallback).onWaiting();
                        } catch (Throwable th) {
                            LogUtil.m9046e(th.getMessage(), th);
                        }
                    }
                    if (commonCallback instanceof Callback.CacheCallback) {
                        try {
                            zOnCache = ((Callback.CacheCallback) commonCallback).onCache(drawable);
                        } catch (Throwable th2) {
                            LogUtil.m9046e(th2.getMessage(), th2);
                            zOnCache = false;
                        }
                    } else {
                        zOnCache = true;
                    }
                    try {
                        if (zOnCache) {
                            imageView.setScaleType(imageOptions.getImageScaleType());
                            imageView.setImageDrawable(drawable);
                            if (commonCallback != null) {
                                try {
                                    commonCallback.onSuccess(drawable);
                                } catch (Throwable th3) {
                                    commonCallback.onError(th3, true);
                                }
                            }
                            if (zOnCache && commonCallback != null) {
                                try {
                                    commonCallback.onFinished();
                                } catch (Throwable th4) {
                                    LogUtil.m9046e(th4.getMessage(), th4);
                                }
                            }
                            return null;
                        }
                        ImageLoader imageLoader3 = new ImageLoader();
                        imageLoader3.fileLockedExceptionRetryCount = i;
                        imageLoader3.skipOnWaitingCallback = true;
                        Callback.Cancelable cancelableDoLoadRequest = imageLoader3.doLoadRequest(imageView, str, imageOptions, commonCallback);
                        if (!zOnCache || commonCallback == null) {
                            return cancelableDoLoadRequest;
                        }
                        try {
                            commonCallback.onFinished();
                            return cancelableDoLoadRequest;
                        } catch (Throwable th5) {
                            LogUtil.m9046e(th5.getMessage(), th5);
                            return cancelableDoLoadRequest;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        LogUtil.m9046e(th.getMessage(), th);
                        ImageLoader imageLoader4 = new ImageLoader();
                        imageLoader4.fileLockedExceptionRetryCount = i;
                        imageLoader4.skipOnWaitingCallback = true;
                        return imageLoader4.doLoadRequest(imageView, str, imageOptions, commonCallback);
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } catch (Throwable th8) {
                th = th8;
                r5 = r3;
                if (r5 != 0 && commonCallback != null) {
                    try {
                        commonCallback.onFinished();
                    } catch (Throwable th9) {
                        LogUtil.m9046e(th9.getMessage(), th9);
                    }
                }
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            if (r5 != 0) {
                commonCallback.onFinished();
            }
            throw th;
        }
    }

    private Callback.Cancelable doLoadRequest(ImageView imageView, String str, ImageOptions imageOptions, Callback.CommonCallback<Drawable> commonCallback) {
        this.viewRef = new WeakReference<>(imageView);
        this.options = imageOptions;
        this.f6735key = new MemCacheKey(str, imageOptions);
        this.callback = commonCallback;
        if (commonCallback instanceof Callback.ProgressCallback) {
            this.progressCallback = (Callback.ProgressCallback) commonCallback;
        }
        if (commonCallback instanceof Callback.PrepareCallback) {
            this.prepareCallback = (Callback.PrepareCallback) commonCallback;
        }
        if (commonCallback instanceof Callback.CacheCallback) {
            this.cacheCallback = (Callback.CacheCallback) commonCallback;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable == null || imageOptions.isForceLoadingDrawable()) {
            drawable = imageOptions.getLoadingDrawable(imageView);
            imageView.setScaleType(imageOptions.getPlaceholderScaleType());
        }
        imageView.setImageDrawable(new AsyncDrawable(this, drawable));
        RequestParams requestParamsCreateRequestParams = createRequestParams(imageView.getContext(), str, imageOptions);
        if (imageView instanceof FakeImageView) {
            synchronized (FAKE_IMG_MAP) {
                FAKE_IMG_MAP.put(imageView.hashCode() + str, (FakeImageView) imageView);
            }
        }
        Callback.Cancelable cancelableMo9034get = ClassX.http().mo9034get(requestParamsCreateRequestParams, this);
        this.httpCancelable = cancelableMo9034get;
        return cancelableMo9034get;
    }

    @Override
    public void cancel() {
        this.stopped = true;
        this.cancelled = true;
        if (this.httpCancelable != null) {
            this.httpCancelable.cancel();
        }
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled || !validView4Callback(false);
    }

    @Override
    public void onWaiting() {
        if (!this.skipOnWaitingCallback && this.progressCallback != null) {
            this.progressCallback.onWaiting();
        }
    }

    @Override
    public void onStarted() {
        if (validView4Callback(true) && this.progressCallback != null) {
            this.progressCallback.onStarted();
        }
    }

    @Override
    public void onLoading(long j, long j2, boolean z) {
        if (validView4Callback(true) && this.progressCallback != null) {
            this.progressCallback.onLoading(j, j2, z);
        }
    }

    @Override
    public Type getLoadType() {
        return loadType;
    }

    @Override
    public Drawable prepare(File file) throws Throwable {
        Drawable drawablePrepare = null;
        if (validView4Callback(true)) {
            if (!file.exists()) {
                throw new FileNotFoundException(file.getAbsolutePath());
            }
            try {
                drawablePrepare = this.prepareCallback != null ? this.prepareCallback.prepare(file) : null;
                if (drawablePrepare == null) {
                    drawablePrepare = ImageDecoder.decodeFileWithLock(file, this.options, this);
                }
                if (drawablePrepare != null && (drawablePrepare instanceof ReusableDrawable)) {
                    ((ReusableDrawable) drawablePrepare).setMemCacheKey(this.f6735key);
                    MEM_CACHE.m9036put(this.f6735key, drawablePrepare);
                }
            } catch (IOException e) {
                IOUtil.deleteFileOrDir(file);
                throw e;
            }
        }
        return drawablePrepare;
    }

    @Override
    public boolean onCache(Drawable drawable) {
        if (!validView4Callback(true) || drawable == null) {
            return false;
        }
        this.hasCache = true;
        setSuccessDrawable4Callback(drawable);
        if (this.cacheCallback != null) {
            return this.cacheCallback.onCache(drawable);
        }
        if (this.callback == null) {
            return true;
        }
        this.callback.onSuccess(drawable);
        return true;
    }

    @Override
    public void onSuccess(Drawable drawable) {
        if (validView4Callback(!this.hasCache) && drawable != null) {
            setSuccessDrawable4Callback(drawable);
            if (this.callback != null) {
                this.callback.onSuccess(drawable);
            }
        }
    }

    @Override
    public void onError(Throwable th, boolean z) {
        this.stopped = true;
        if (validView4Callback(false)) {
            this.fileLockedExceptionRetryCount++;
            if ((th instanceof FileLockedException) && this.fileLockedExceptionRetryCount < 1000) {
                LogUtil.m9043d("ImageFileLocked: " + this.f6735key.f6737url);
                ClassX.task().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ImageView imageView = (ImageView) ImageLoader.this.viewRef.get();
                        if (imageView != null) {
                            ImageLoader.doBind(imageView, ImageLoader.this.f6735key.f6737url, ImageLoader.this.options, ImageLoader.this.fileLockedExceptionRetryCount, ImageLoader.this.callback);
                        } else {
                            ImageLoader.this.onFinished();
                        }
                    }
                }, 10L);
                this.skipOnFinishedCallback = true;
            } else {
                LogUtil.m9046e(this.f6735key.f6737url, th);
                setErrorDrawable4Callback();
                if (this.callback != null) {
                    this.callback.onError(th, z);
                }
            }
        }
    }

    @Override
    public void onCancelled(Callback.CancelledException cancelledException) {
        this.stopped = true;
        if (validView4Callback(false) && this.callback != null) {
            this.callback.onCancelled(cancelledException);
        }
    }

    @Override
    public void onFinished() {
        this.stopped = true;
        if (!this.skipOnFinishedCallback) {
            ImageView imageView = this.viewRef.get();
            if (imageView instanceof FakeImageView) {
                synchronized (FAKE_IMG_MAP) {
                    FAKE_IMG_MAP.remove(imageView.hashCode() + this.f6735key.f6737url);
                }
            }
            if (this.callback != null) {
                this.callback.onFinished();
            }
        }
    }

    private static RequestParams createRequestParams(Context context, String str, ImageOptions imageOptions) {
        ImageOptions.ParamsBuilder paramsBuilder;
        RequestParams requestParams = new RequestParams(str);
        if (context != null) {
            requestParams.setContext(context);
        }
        requestParams.setCacheDirName(DISK_CACHE_DIR_NAME);
        requestParams.setConnectTimeout(8000);
        requestParams.setPriority(Priority.BG_LOW);
        requestParams.setExecutor(EXECUTOR);
        requestParams.setCancelFast(true);
        requestParams.setUseCookie(false);
        if (imageOptions != null && (paramsBuilder = imageOptions.getParamsBuilder()) != null) {
            return paramsBuilder.buildParams(requestParams, imageOptions);
        }
        return requestParams;
    }

    private boolean validView4Callback(boolean z) {
        ImageView imageView = this.viewRef.get();
        if (imageView == null) {
            return false;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AsyncDrawable) {
            ImageLoader imageLoader = ((AsyncDrawable) drawable).getImageLoader();
            if (imageLoader != null) {
                if (imageLoader == this) {
                    return true;
                }
                if (this.f6736seq > imageLoader.f6736seq) {
                    imageLoader.cancel();
                    return true;
                }
                cancel();
                return false;
            }
        } else if (z) {
            cancel();
            return false;
        }
        return true;
    }

    private void setSuccessDrawable4Callback(Drawable drawable) {
        ImageView imageView = this.viewRef.get();
        if (imageView != null) {
            imageView.setScaleType(this.options.getImageScaleType());
            if (drawable instanceof GifDrawable) {
                if (imageView.getScaleType() == ImageView.ScaleType.CENTER) {
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                }
                imageView.setLayerType(1, null);
            }
            if (this.options.getAnimation() != null) {
                ImageAnimationHelper.animationDisplay(imageView, drawable, this.options.getAnimation());
            } else if (this.options.isFadeIn()) {
                ImageAnimationHelper.fadeInDisplay(imageView, drawable);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }
    }

    private void setErrorDrawable4Callback() {
        ImageView imageView = this.viewRef.get();
        if (imageView != null) {
            Drawable failureDrawable = this.options.getFailureDrawable(imageView);
            imageView.setScaleType(this.options.getPlaceholderScaleType());
            imageView.setImageDrawable(failureDrawable);
        }
    }

    private static void postArgsException(final ImageView imageView, final ImageOptions imageOptions, final String str, final Callback.CommonCallback<?> commonCallback) {
        ClassX.task().autoPost(new Runnable() {
            @Override
            public void run() {
                Callback.CommonCallback commonCallback2;
                try {
                    if (commonCallback instanceof Callback.ProgressCallback) {
                        ((Callback.ProgressCallback) commonCallback).onWaiting();
                    }
                    if (imageView != null && imageOptions != null) {
                        imageView.setScaleType(imageOptions.getPlaceholderScaleType());
                        imageView.setImageDrawable(imageOptions.getFailureDrawable(imageView));
                    }
                    if (commonCallback != null) {
                        commonCallback.onError(new IllegalArgumentException(str), false);
                    }
                    if (commonCallback2 != null) {
                        try {
                            return;
                        } catch (Throwable th) {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (commonCallback != null) {
                        commonCallback.onError(th2, true);
                    }
                } finally {
                    if (commonCallback != null) {
                        try {
                            commonCallback.onFinished();
                        } catch (Throwable th3) {
                            LogUtil.m9046e(th3.getMessage(), th3);
                        }
                    }
                }
            }
        });
    }

    @SuppressLint({"ViewConstructor", "AppCompatCustomView"})
    private static final class FakeImageView extends ImageView {
        private static final AtomicInteger hashCodeSeed = new AtomicInteger(0);
        private Drawable drawable;
        private final int hashCode;

        public FakeImageView() {
            super(ClassX.m9074app());
            this.hashCode = hashCodeSeed.incrementAndGet();
        }

        public int hashCode() {
            return this.hashCode;
        }

        @Override
        public void setImageDrawable(Drawable drawable) {
            this.drawable = drawable;
        }

        @Override
        public Drawable getDrawable() {
            return this.drawable;
        }

        @Override
        public void setLayerType(int i, Paint paint) {
        }

        @Override
        public void setScaleType(ImageView.ScaleType scaleType) {
        }

        @Override
        public void startAnimation(Animation animation) {
        }
    }
}
