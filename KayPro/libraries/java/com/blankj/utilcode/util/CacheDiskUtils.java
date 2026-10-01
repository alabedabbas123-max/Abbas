package com.blankj.utilcode.util;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.Log;
import com.blankj.utilcode.constant.CacheConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CacheDiskUtils implements CacheConstants {
    private static final Map<String, CacheDiskUtils> CACHE_MAP = new HashMap();
    private static final String CACHE_PREFIX = "cdu_";
    private static final int DEFAULT_MAX_COUNT = Integer.MAX_VALUE;
    private static final long DEFAULT_MAX_SIZE = Long.MAX_VALUE;
    private static final String TYPE_BITMAP = "bi_";
    private static final String TYPE_BYTE = "by_";
    private static final String TYPE_DRAWABLE = "dr_";
    private static final String TYPE_JSON_ARRAY = "ja_";
    private static final String TYPE_JSON_OBJECT = "jo_";
    private static final String TYPE_PARCELABLE = "pa_";
    private static final String TYPE_SERIALIZABLE = "se_";
    private static final String TYPE_STRING = "st_";
    private final File mCacheDir;
    private final String mCacheKey;
    private DiskCacheManager mDiskCacheManager;
    private final int mMaxCount;
    private final long mMaxSize;

    private static final class DiskCacheHelper {
        static final int TIME_INFO_LEN = 14;

        private DiskCacheHelper() {
        }

        private static byte[] copyOfRange(byte[] bArr, int i, int i2) {
            int i3 = i2 - i;
            if (i3 >= 0) {
                byte[] bArr2 = new byte[i3];
                System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, i3));
                return bArr2;
            }
            throw new IllegalArgumentException(i + " > " + i2);
        }

        private static String createDueTime(int i) {
            return String.format(Locale.getDefault(), "_$%010d$_", Long.valueOf((System.currentTimeMillis() / 1000) + ((long) i)));
        }

        public static byte[] getDataWithoutDueTime(byte[] bArr) {
            return hasTimeInfo(bArr) ? copyOfRange(bArr, 14, bArr.length) : bArr;
        }

        private static long getDueTime(byte[] bArr) {
            if (hasTimeInfo(bArr)) {
                try {
                    return Long.parseLong(new String(copyOfRange(bArr, 2, 12))) * 1000;
                } catch (NumberFormatException unused) {
                }
            }
            return -1L;
        }

        private static boolean hasTimeInfo(byte[] bArr) {
            return bArr != null && bArr.length >= 14 && bArr[0] == 95 && bArr[1] == 36 && bArr[12] == 36 && bArr[13] == 95;
        }

        public static boolean isDue(byte[] bArr) {
            long dueTime = getDueTime(bArr);
            return dueTime != -1 && System.currentTimeMillis() > dueTime;
        }

        public static byte[] newByteArrayWithTime(int i, byte[] bArr) {
            byte[] bytes = createDueTime(i).getBytes();
            byte[] bArr2 = new byte[bytes.length + bArr.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }
    }

    private static final class DiskCacheManager {
        private final AtomicInteger cacheCount;
        private final File cacheDir;
        private final AtomicLong cacheSize;
        private final int countLimit;
        private final Map<File, Long> lastUsageDates;
        private final Thread mThread;
        private final long sizeLimit;

        private DiskCacheManager(final File file, long j, int i) {
            this.lastUsageDates = Collections.synchronizedMap(new HashMap());
            this.cacheDir = file;
            this.sizeLimit = j;
            this.countLimit = i;
            this.cacheSize = new AtomicLong();
            this.cacheCount = new AtomicInteger();
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    File[] fileArrListFiles = file.listFiles(new FilenameFilter() {
                        @Override
                        public boolean accept(File file2, String str) {
                            return str.startsWith(CacheDiskUtils.CACHE_PREFIX);
                        }
                    });
                    if (fileArrListFiles != null) {
                        int length = 0;
                        int i2 = 0;
                        for (File file2 : fileArrListFiles) {
                            length = (int) (((long) length) + file2.length());
                            i2++;
                            DiskCacheManager.this.lastUsageDates.put(file2, Long.valueOf(file2.lastModified()));
                        }
                        DiskCacheManager.this.cacheSize.getAndAdd(length);
                        DiskCacheManager.this.cacheCount.getAndAdd(i2);
                    }
                }
            });
            this.mThread = thread;
            thread.start();
        }

        public boolean clear() {
            File[] fileArrListFiles = this.cacheDir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File file, String str) {
                    return str.startsWith(CacheDiskUtils.CACHE_PREFIX);
                }
            });
            boolean z = true;
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileArrListFiles) {
                    if (file.delete()) {
                        this.cacheSize.addAndGet(-file.length());
                        this.cacheCount.addAndGet(-1);
                        this.lastUsageDates.remove(file);
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    this.lastUsageDates.clear();
                    this.cacheSize.set(0L);
                    this.cacheCount.set(0);
                }
            }
            return z;
        }

        public int getCacheCount() {
            wait2InitOk();
            return this.cacheCount.get();
        }

        private String getCacheNameByKey(String str) {
            return CacheDiskUtils.CACHE_PREFIX + str.substring(0, 3) + str.substring(3).hashCode();
        }

        public long getCacheSize() {
            wait2InitOk();
            return this.cacheSize.get();
        }

        public File getFileBeforePut(String str) {
            wait2InitOk();
            File file = new File(this.cacheDir, getCacheNameByKey(str));
            if (file.exists()) {
                this.cacheCount.addAndGet(-1);
                this.cacheSize.addAndGet(-file.length());
            }
            return file;
        }

        public File getFileIfExists(String str) {
            File file = new File(this.cacheDir, getCacheNameByKey(str));
            if (file.exists()) {
                return file;
            }
            return null;
        }

        public void m6936put(File file) {
            this.cacheCount.addAndGet(1);
            this.cacheSize.addAndGet(file.length());
            while (true) {
                if (this.cacheCount.get() <= this.countLimit && this.cacheSize.get() <= this.sizeLimit) {
                    return;
                }
                this.cacheSize.addAndGet(-removeOldest());
                this.cacheCount.addAndGet(-1);
            }
        }

        public boolean removeByKey(String str) {
            File fileIfExists = getFileIfExists(str);
            if (fileIfExists == null) {
                return true;
            }
            if (!fileIfExists.delete()) {
                return false;
            }
            this.cacheSize.addAndGet(-fileIfExists.length());
            this.cacheCount.addAndGet(-1);
            this.lastUsageDates.remove(fileIfExists);
            return true;
        }

        private long removeOldest() {
            if (this.lastUsageDates.isEmpty()) {
                return 0L;
            }
            Long lValueOf = Long.valueOf(CacheDiskUtils.DEFAULT_MAX_SIZE);
            File key = null;
            Set<Map.Entry<File, Long>> setEntrySet = this.lastUsageDates.entrySet();
            synchronized (this.lastUsageDates) {
                for (Map.Entry<File, Long> entry : setEntrySet) {
                    Long value = entry.getValue();
                    if (value.longValue() < lValueOf.longValue()) {
                        key = entry.getKey();
                        lValueOf = value;
                    }
                }
            }
            if (key == null) {
                return 0L;
            }
            long length = key.length();
            if (!key.delete()) {
                return 0L;
            }
            this.lastUsageDates.remove(key);
            return length;
        }

        public void updateModify(File file) {
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            file.setLastModified(lValueOf.longValue());
            this.lastUsageDates.put(file, lValueOf);
        }

        private void wait2InitOk() {
            try {
                this.mThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private CacheDiskUtils(String str, File file, long j, int i) {
        this.mCacheKey = str;
        this.mCacheDir = file;
        this.mMaxSize = j;
        this.mMaxCount = i;
    }

    private DiskCacheManager getDiskCacheManager() {
        if (this.mCacheDir.exists()) {
            if (this.mDiskCacheManager == null) {
                this.mDiskCacheManager = new DiskCacheManager(this.mCacheDir, this.mMaxSize, this.mMaxCount);
            }
        } else if (this.mCacheDir.mkdirs()) {
            this.mDiskCacheManager = new DiskCacheManager(this.mCacheDir, this.mMaxSize, this.mMaxCount);
        } else {
            Log.e("CacheDiskUtils", "can't make dirs in " + this.mCacheDir.getAbsolutePath());
        }
        return this.mDiskCacheManager;
    }

    public static CacheDiskUtils getInstance() {
        return getInstance("", DEFAULT_MAX_SIZE, DEFAULT_MAX_COUNT);
    }

    public static CacheDiskUtils getInstance(long j, int i) {
        return getInstance("", j, i);
    }

    public static CacheDiskUtils getInstance(File file) {
        return getInstance(file, DEFAULT_MAX_SIZE, DEFAULT_MAX_COUNT);
    }

    public static CacheDiskUtils getInstance(File file, long j, int i) {
        String str = file.getAbsoluteFile() + "_" + j + "_" + i;
        CacheDiskUtils cacheDiskUtils = CACHE_MAP.get(str);
        if (cacheDiskUtils == null) {
            synchronized (CacheDiskUtils.class) {
                cacheDiskUtils = CACHE_MAP.get(str);
                if (cacheDiskUtils == null) {
                    cacheDiskUtils = new CacheDiskUtils(str, file, j, i);
                    CACHE_MAP.put(str, cacheDiskUtils);
                }
            }
        }
        return cacheDiskUtils;
    }

    public static CacheDiskUtils getInstance(String str) {
        return getInstance(str, DEFAULT_MAX_SIZE, DEFAULT_MAX_COUNT);
    }

    public static CacheDiskUtils getInstance(String str, long j, int i) {
        if (UtilsBridge.isSpace(str)) {
            str = "cacheUtils";
        }
        return getInstance(new File(Utils.getApp().getCacheDir(), str), j, i);
    }

    private byte[] realGetBytes(String str) {
        return realGetBytes(str, null);
    }

    private byte[] realGetBytes(String str, byte[] bArr) {
        File fileIfExists;
        DiskCacheManager diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null || (fileIfExists = diskCacheManager.getFileIfExists(str)) == null) {
            return bArr;
        }
        byte[] file2Bytes = UtilsBridge.readFile2Bytes(fileIfExists);
        if (DiskCacheHelper.isDue(file2Bytes)) {
            diskCacheManager.removeByKey(str);
            return bArr;
        }
        diskCacheManager.updateModify(fileIfExists);
        return DiskCacheHelper.getDataWithoutDueTime(file2Bytes);
    }

    private void realPutBytes(String str, byte[] bArr, int i) {
        DiskCacheManager diskCacheManager;
        if (bArr == null || (diskCacheManager = getDiskCacheManager()) == null) {
            return;
        }
        if (i >= 0) {
            bArr = DiskCacheHelper.newByteArrayWithTime(i, bArr);
        }
        File fileBeforePut = diskCacheManager.getFileBeforePut(str);
        UtilsBridge.writeFileFromBytes(fileBeforePut, bArr);
        diskCacheManager.updateModify(fileBeforePut);
        diskCacheManager.m6936put(fileBeforePut);
    }

    public boolean clear() {
        DiskCacheManager diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null) {
            return true;
        }
        return diskCacheManager.clear();
    }

    public Bitmap getBitmap(String str) {
        return getBitmap(str, null);
    }

    public Bitmap getBitmap(String str, Bitmap bitmap) {
        byte[] bArrRealGetBytes = realGetBytes(TYPE_BITMAP + str);
        return bArrRealGetBytes == null ? bitmap : UtilsBridge.bytes2Bitmap(bArrRealGetBytes);
    }

    public byte[] getBytes(String str) {
        return getBytes(str, null);
    }

    public byte[] getBytes(String str, byte[] bArr) {
        return realGetBytes(TYPE_BYTE + str, bArr);
    }

    public int getCacheCount() {
        DiskCacheManager diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null) {
            return 0;
        }
        return diskCacheManager.getCacheCount();
    }

    public long getCacheSize() {
        DiskCacheManager diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null) {
            return 0L;
        }
        return diskCacheManager.getCacheSize();
    }

    public Drawable getDrawable(String str) {
        return getDrawable(str, null);
    }

    public Drawable getDrawable(String str, Drawable drawable) {
        byte[] bArrRealGetBytes = realGetBytes(TYPE_DRAWABLE + str);
        return bArrRealGetBytes == null ? drawable : UtilsBridge.bytes2Drawable(bArrRealGetBytes);
    }

    public JSONArray getJSONArray(String str) {
        return getJSONArray(str, null);
    }

    public JSONArray getJSONArray(String str, JSONArray jSONArray) {
        byte[] bArrRealGetBytes = realGetBytes(TYPE_JSON_ARRAY + str);
        return bArrRealGetBytes == null ? jSONArray : UtilsBridge.bytes2JSONArray(bArrRealGetBytes);
    }

    public JSONObject getJSONObject(String str) {
        return getJSONObject(str, null);
    }

    public JSONObject getJSONObject(String str, JSONObject jSONObject) {
        byte[] bArrRealGetBytes = realGetBytes(TYPE_JSON_OBJECT + str);
        return bArrRealGetBytes == null ? jSONObject : UtilsBridge.bytes2JSONObject(bArrRealGetBytes);
    }

    public <T> T getParcelable(String str, Parcelable.Creator<T> creator) {
        return (T) getParcelable(str, creator, null);
    }

    public <T> T getParcelable(String str, Parcelable.Creator<T> creator, T t) {
        byte[] bArrRealGetBytes = realGetBytes(TYPE_PARCELABLE + str);
        return bArrRealGetBytes == null ? t : (T) UtilsBridge.bytes2Parcelable(bArrRealGetBytes, creator);
    }

    public Object getSerializable(String str) {
        return getSerializable(str, null);
    }

    public Object getSerializable(String str, Object obj) {
        byte[] bArrRealGetBytes = realGetBytes(TYPE_SERIALIZABLE + str);
        return bArrRealGetBytes == null ? obj : UtilsBridge.bytes2Object(bArrRealGetBytes);
    }

    public String getString(String str) {
        return getString(str, null);
    }

    public String getString(String str, String str2) {
        byte[] bArrRealGetBytes = realGetBytes(TYPE_STRING + str);
        return bArrRealGetBytes == null ? str2 : UtilsBridge.bytes2String(bArrRealGetBytes);
    }

    public void m6920put(String str, Bitmap bitmap) {
        m6921put(str, bitmap, -1);
    }

    public void m6921put(String str, Bitmap bitmap, int i) {
        realPutBytes(TYPE_BITMAP + str, UtilsBridge.bitmap2Bytes(bitmap), i);
    }

    public void m6922put(String str, Drawable drawable) {
        m6923put(str, drawable, -1);
    }

    public void m6923put(String str, Drawable drawable, int i) {
        realPutBytes(TYPE_DRAWABLE + str, UtilsBridge.drawable2Bytes(drawable), i);
    }

    public void m6924put(String str, Parcelable parcelable) {
        m6925put(str, parcelable, -1);
    }

    public void m6925put(String str, Parcelable parcelable, int i) {
        realPutBytes(TYPE_PARCELABLE + str, UtilsBridge.parcelable2Bytes(parcelable), i);
    }

    public void m6926put(String str, Serializable serializable) {
        m6927put(str, serializable, -1);
    }

    public void m6927put(String str, Serializable serializable, int i) {
        realPutBytes(TYPE_SERIALIZABLE + str, UtilsBridge.serializable2Bytes(serializable), i);
    }

    public void m6928put(String str, String str2) {
        m6929put(str, str2, -1);
    }

    public void m6929put(String str, String str2, int i) {
        realPutBytes(TYPE_STRING + str, UtilsBridge.string2Bytes(str2), i);
    }

    public void m6930put(String str, JSONArray jSONArray) {
        m6931put(str, jSONArray, -1);
    }

    public void m6931put(String str, JSONArray jSONArray, int i) {
        realPutBytes(TYPE_JSON_ARRAY + str, UtilsBridge.jsonArray2Bytes(jSONArray), i);
    }

    public void m6932put(String str, JSONObject jSONObject) {
        m6933put(str, jSONObject, -1);
    }

    public void m6933put(String str, JSONObject jSONObject, int i) {
        realPutBytes(TYPE_JSON_OBJECT + str, UtilsBridge.jsonObject2Bytes(jSONObject), i);
    }

    public void m6934put(String str, byte[] bArr) {
        m6935put(str, bArr, -1);
    }

    public void m6935put(String str, byte[] bArr, int i) {
        realPutBytes(TYPE_BYTE + str, bArr, i);
    }

    public boolean remove(String str) {
        DiskCacheManager diskCacheManager = getDiskCacheManager();
        if (diskCacheManager == null) {
            return true;
        }
        if (diskCacheManager.removeByKey(TYPE_BYTE + str)) {
            if (diskCacheManager.removeByKey(TYPE_STRING + str)) {
                if (diskCacheManager.removeByKey(TYPE_JSON_OBJECT + str)) {
                    if (diskCacheManager.removeByKey(TYPE_JSON_ARRAY + str)) {
                        if (diskCacheManager.removeByKey(TYPE_BITMAP + str)) {
                            if (diskCacheManager.removeByKey(TYPE_DRAWABLE + str)) {
                                if (diskCacheManager.removeByKey(TYPE_PARCELABLE + str)) {
                                    if (diskCacheManager.removeByKey(TYPE_SERIALIZABLE + str)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        return this.mCacheKey + "@" + Integer.toHexString(hashCode());
    }
}
