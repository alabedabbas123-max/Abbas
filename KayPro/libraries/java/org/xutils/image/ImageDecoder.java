package org.xutils.image;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.xutils.x;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.cache.DiskCacheFile;
import org.xutils.cache.LruDiskCache;
import org.xutils.common.Callback;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;

public final class ImageDecoder {
    private static final int BITMAP_DECODE_MAX_WORKER;
    private static final AtomicInteger bitmapDecodeWorker = new AtomicInteger(0);
    private static final Object bitmapDecodeLock = new Object();
    private static final Object gifDecodeLock = new Object();
    private static final byte[] GIF_HEADER = {71, 73, 70};
    private static final Executor THUMB_CACHE_EXECUTOR = new PriorityExecutor(1, true);
    private static final LruDiskCache THUMB_CACHE = LruDiskCache.getDiskCache("xUtils_img_thumb");

    static {
        BITMAP_DECODE_MAX_WORKER = Runtime.getRuntime().availableProcessors() > 4 ? 2 : 1;
    }

    private ImageDecoder() {
    }

    static void clearCacheFiles() {
        THUMB_CACHE.clearCacheFiles();
    }

    static Drawable decodeFileWithLock(final File file, final ImageOptions imageOptions, Callback.Cancelable cancelable) throws IOException {
        Movie movieDecodeGif;
        if (file == null || !file.exists() || file.length() < 1) {
            return null;
        }
        if (cancelable != null && cancelable.isCancelled()) {
            throw new Callback.CancelledException("cancelled during decode image");
        }
        if (!imageOptions.isIgnoreGif() && isGif(file)) {
            synchronized (gifDecodeLock) {
                movieDecodeGif = decodeGif(file, imageOptions, cancelable);
            }
            if (movieDecodeGif == null) {
                return null;
            }
            GifDrawable gifDrawable = new GifDrawable(movieDecodeGif, (int) file.length());
            gifDrawable.setRate(imageOptions.getGifRate());
            return gifDrawable;
        }
        try {
            synchronized (bitmapDecodeLock) {
                while (bitmapDecodeWorker.get() >= BITMAP_DECODE_MAX_WORKER && (cancelable == null || !cancelable.isCancelled())) {
                    try {
                        bitmapDecodeLock.wait();
                    } catch (InterruptedException e) {
                        throw new Callback.CancelledException("cancelled during decode image");
                    }
                }
            }
            if (cancelable != null && cancelable.isCancelled()) {
                throw new Callback.CancelledException("cancelled during decode image");
            }
            bitmapDecodeWorker.incrementAndGet();
            final Bitmap thumbCache = imageOptions.isCompress() ? getThumbCache(file, imageOptions) : null;
            if (thumbCache == null && (thumbCache = decodeBitmap(file, imageOptions, cancelable)) != null && imageOptions.isCompress()) {
                THUMB_CACHE_EXECUTOR.execute(new Runnable() {
                    @Override
                    public void run() throws Throwable {
                        ImageDecoder.saveThumbCache(file, imageOptions, thumbCache);
                    }
                });
            }
            bitmapDecodeWorker.decrementAndGet();
            synchronized (bitmapDecodeLock) {
                bitmapDecodeLock.notifyAll();
            }
            if (thumbCache != null) {
                return new ReusableBitmapDrawable(ClassX.m9074app().getResources(), thumbCache);
            }
            return null;
        } catch (Throwable th) {
            if (0 != 0) {
                bitmapDecodeWorker.decrementAndGet();
            }
            synchronized (bitmapDecodeLock) {
                bitmapDecodeLock.notifyAll();
                throw th;
            }
        }
    }

    public static boolean isGif(File file) throws Throwable {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    boolean zEquals = Arrays.equals(GIF_HEADER, IOUtil.readBytes(fileInputStream, 0L, 3));
                    IOUtil.closeQuietly(fileInputStream);
                    return zEquals;
                } catch (Throwable th) {
                    th = th;
                    LogUtil.m9046e(th.getMessage(), th);
                    IOUtil.closeQuietly(fileInputStream);
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                IOUtil.closeQuietly(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    public static Bitmap decodeBitmap(File file, ImageOptions imageOptions, Callback.Cancelable cancelable) throws IOException {
        int rotateAngle = 0;
        if (file == null || !file.exists() || file.length() < 1) {
            return null;
        }
        if (imageOptions == null) {
            imageOptions = ImageOptions.DEFAULT;
        }
        if (imageOptions.getMaxWidth() <= 0 || imageOptions.getMaxHeight() <= 0) {
            imageOptions.optimizeMaxSize(null);
        }
        if (cancelable != null) {
            try {
                if (cancelable.isCancelled()) {
                    throw new Callback.CancelledException("cancelled during decode image");
                }
            } catch (IOException e) {
                throw e;
            } catch (Callback.CancelledException e2) {
                throw e2;
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
                return null;
            }
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPurgeable = true;
        options.inInputShareable = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = imageOptions.getConfig();
        int i = options.outWidth;
        int i2 = options.outHeight;
        int width = imageOptions.getWidth();
        int height = imageOptions.getHeight();
        if (imageOptions.isAutoRotate()) {
            rotateAngle = getRotateAngle(file.getAbsolutePath());
            if ((rotateAngle / 90) % 2 == 1) {
                i = options.outHeight;
                i2 = options.outWidth;
            }
        }
        if (!imageOptions.isCrop() && width > 0 && height > 0) {
            if ((rotateAngle / 90) % 2 == 1) {
                options.outWidth = height;
                options.outHeight = width;
            } else {
                options.outWidth = width;
                options.outHeight = height;
            }
        }
        options.inSampleSize = calculateSampleSize(i, i2, imageOptions.getMaxWidth(), imageOptions.getMaxHeight());
        if (cancelable != null && cancelable.isCancelled()) {
            throw new Callback.CancelledException("cancelled during decode image");
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (bitmapDecodeFile == null) {
            throw new IOException("decode image error");
        }
        if (cancelable != null && cancelable.isCancelled()) {
            throw new Callback.CancelledException("cancelled during decode image");
        }
        if (rotateAngle != 0) {
            bitmapDecodeFile = rotate(bitmapDecodeFile, rotateAngle, true);
        }
        if (cancelable != null && cancelable.isCancelled()) {
            throw new Callback.CancelledException("cancelled during decode image");
        }
        if (imageOptions.isCrop() && width > 0 && height > 0) {
            bitmapDecodeFile = cut2ScaleSize(bitmapDecodeFile, width, height, true);
        }
        if (bitmapDecodeFile == null) {
            throw new IOException("decode image error");
        }
        if (cancelable != null && cancelable.isCancelled()) {
            throw new Callback.CancelledException("cancelled during decode image");
        }
        if (imageOptions.isCircular()) {
            bitmapDecodeFile = cut2Circular(bitmapDecodeFile, true);
        } else if (imageOptions.getRadius() > 0) {
            bitmapDecodeFile = cut2RoundCorner(bitmapDecodeFile, imageOptions.getRadius(), imageOptions.isSquare(), true);
        } else if (imageOptions.isSquare()) {
            bitmapDecodeFile = cut2Square(bitmapDecodeFile, true);
        }
        if (bitmapDecodeFile == null) {
            throw new IOException("decode image error");
        }
        return bitmapDecodeFile;
    }

    public static Movie decodeGif(File file, ImageOptions imageOptions, Callback.Cancelable cancelable) throws IOException {
        if (file == null || !file.exists() || file.length() < 1) {
            return null;
        }
        if (cancelable != null) {
            try {
                if (cancelable.isCancelled()) {
                    throw new Callback.CancelledException("cancelled during decode image");
                }
            } catch (IOException e) {
                throw e;
            } catch (Callback.CancelledException e2) {
                throw e2;
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
                return null;
            }
        }
        Movie movieDecodeFile = Movie.decodeFile(file.getAbsolutePath());
        if (movieDecodeFile == null) {
            throw new IOException("decode image error");
        }
        return movieDecodeFile;
    }

    public static int calculateSampleSize(int i, int i2, int i3, int i4) {
        int iRound;
        int i5 = 1;
        if (i > i3 || i2 > i4) {
            if (i > i2) {
                iRound = Math.round(i2 / i4);
            } else {
                iRound = Math.round(i / i3);
            }
            i5 = iRound >= 1 ? iRound : 1;
            while ((i * i2) / (i5 * i5) > i3 * i4 * 2) {
                i5++;
            }
        }
        return i5;
    }

    public static Bitmap cut2Square(Bitmap bitmap, boolean z) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width != height) {
            int iMin = Math.min(width, height);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (width - iMin) / 2, (height - iMin) / 2, iMin, iMin);
            if (bitmapCreateBitmap != null) {
                if (!z || bitmapCreateBitmap == bitmap) {
                    return bitmapCreateBitmap;
                }
                bitmap.recycle();
                return bitmapCreateBitmap;
            }
            return bitmap;
        }
        return bitmap;
    }

    public static Bitmap cut2Circular(Bitmap bitmap, boolean z) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int iMin = Math.min(width, height);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawCircle(iMin / 2, iMin / 2, iMin / 2, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, (iMin - width) / 2, (iMin - height) / 2, paint);
            if (z) {
                bitmap.recycle();
            }
            return bitmapCreateBitmap;
        }
        return bitmap;
    }

    public static Bitmap cut2RoundCorner(Bitmap bitmap, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        if (i > 0) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (z) {
                int iMin = Math.min(width, height);
                i2 = iMin;
                i3 = iMin;
            } else {
                i2 = height;
                i3 = width;
            }
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
            if (bitmapCreateBitmap != null) {
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, i3, i2), i, i, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, (i3 - width) / 2, (i2 - height) / 2, paint);
                if (z2) {
                    bitmap.recycle();
                }
                return bitmapCreateBitmap;
            }
            return bitmap;
        }
        return bitmap;
    }

    public static Bitmap cut2ScaleSize(Bitmap bitmap, int i, int i2, boolean z) {
        int i3;
        float f;
        float f2;
        int i4;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width != i || height != i2) {
            Matrix matrix = new Matrix();
            float f3 = i / width;
            float f4 = i2 / height;
            if (f3 > f4) {
                i4 = (int) ((height - (i2 / f3)) / 2.0f);
                f = f3;
                f2 = f3;
                height = (int) ((height + (i2 / f3)) / 2.0f);
                i3 = 0;
            } else {
                i3 = (int) ((width - (i / f4)) / 2.0f);
                f = f4;
                f2 = f4;
                width = (int) ((width + (i / f4)) / 2.0f);
                i4 = 0;
            }
            matrix.setScale(f2, f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i3, i4, width - i3, height - i4, matrix, true);
            if (bitmapCreateBitmap != null) {
                if (!z || bitmapCreateBitmap == bitmap) {
                    return bitmapCreateBitmap;
                }
                bitmap.recycle();
                return bitmapCreateBitmap;
            }
            return bitmap;
        }
        return bitmap;
    }

    public static Bitmap rotate(Bitmap bitmap, int i, boolean z) {
        Bitmap bitmapCreateBitmap;
        if (i == 0) {
            bitmapCreateBitmap = null;
        } else {
            Matrix matrix = new Matrix();
            matrix.setRotate(i);
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
                bitmapCreateBitmap = null;
            }
        }
        if (bitmapCreateBitmap != null) {
            if (!z || bitmapCreateBitmap == bitmap) {
                return bitmapCreateBitmap;
            }
            bitmap.recycle();
            return bitmapCreateBitmap;
        }
        return bitmap;
    }

    @SuppressLint({"ExifInterface"})
    public static int getRotateAngle(String str) {
        try {
            switch (new ExifInterface(str).getAttributeInt("Orientation", 0)) {
                case 3:
                    return 180;
                case 4:
                case 5:
                case 7:
                default:
                    return 0;
                case 6:
                    return 90;
                case 8:
                    return 270;
            }
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
            return 0;
        }
    }

    public static void saveThumbCache(File file, ImageOptions imageOptions, Bitmap bitmap) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        DiskCacheFile diskCacheFileCreateDiskCacheFile;
        Throwable th2;
        FileOutputStream fileOutputStream2;
        DiskCacheEntity diskCacheEntity = new DiskCacheEntity();
        diskCacheEntity.setKey(file.getAbsolutePath() + "@" + file.lastModified() + imageOptions.toString());
        try {
            diskCacheFileCreateDiskCacheFile = THUMB_CACHE.createDiskCacheFile(diskCacheEntity);
            if (diskCacheFileCreateDiskCacheFile != null) {
                try {
                    fileOutputStream2 = new FileOutputStream(diskCacheFileCreateDiskCacheFile);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 80, fileOutputStream2);
                        fileOutputStream2.flush();
                        diskCacheFileCreateDiskCacheFile = diskCacheFileCreateDiskCacheFile.commit();
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        try {
                            IOUtil.deleteFileOrDir(diskCacheFileCreateDiskCacheFile);
                            LogUtil.m9052w(th.getMessage(), th);
                            IOUtil.closeQuietly(diskCacheFileCreateDiskCacheFile);
                            IOUtil.closeQuietly(fileOutputStream);
                            return;
                        } catch (Throwable th4) {
                            th2 = th4;
                            IOUtil.closeQuietly(diskCacheFileCreateDiskCacheFile);
                            IOUtil.closeQuietly(fileOutputStream);
                            throw th2;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    fileOutputStream = null;
                }
            } else {
                fileOutputStream2 = null;
            }
            IOUtil.closeQuietly(diskCacheFileCreateDiskCacheFile);
            IOUtil.closeQuietly(fileOutputStream2);
        } catch (Throwable th6) {
            th = th6;
            fileOutputStream = null;
            diskCacheFileCreateDiskCacheFile = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0054  */
    private static Bitmap getThumbCache(File file, ImageOptions imageOptions) throws Throwable {
        DiskCacheFile diskCacheFile;
        Bitmap bitmapDecodeFile = null;
        try {
            diskCacheFile = THUMB_CACHE.getDiskCacheFile(file.getAbsolutePath() + "@" + file.lastModified() + imageOptions.toString());
            if (diskCacheFile != null) {
                try {
                    try {
                        if (diskCacheFile.exists()) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = false;
                            options.inPurgeable = true;
                            options.inInputShareable = true;
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            bitmapDecodeFile = BitmapFactory.decodeFile(diskCacheFile.getAbsolutePath(), options);
                            IOUtil.closeQuietly(diskCacheFile);
                        } else {
                            IOUtil.closeQuietly(diskCacheFile);
                        }
                    } catch (Throwable th) {
                        th = th;
                        LogUtil.m9052w(th.getMessage(), th);
                        IOUtil.closeQuietly(diskCacheFile);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    IOUtil.closeQuietly(diskCacheFile);
                    throw th;
                }
            } else {
                IOUtil.closeQuietly(diskCacheFile);
            }
        } catch (Throwable th3) {
            th = th3;
            diskCacheFile = null;
        }
        return bitmapDecodeFile;
    }
}
