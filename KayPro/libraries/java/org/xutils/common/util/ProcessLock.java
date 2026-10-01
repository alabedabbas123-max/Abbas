package org.xutils.common.util;

import android.text.TextUtils;
import com.baidu.android.common.util.DeviceId;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.xutils.x;

public final class ProcessLock implements Closeable {
    private static final DecimalFormat FORMAT;
    private static final String LOCK_FILE_DIR = "process_lock";
    private static final DoubleKeyValueMap<String, Integer, ProcessLock> LOCK_MAP = new DoubleKeyValueMap<>();
    private final File mFile;
    private final FileLock mFileLock;
    private final String mLockName;
    private final Closeable mStream;
    private final boolean mWriteMode;

    static {
        IOUtil.deleteFileOrDir(ClassX.m9074app().getDir(LOCK_FILE_DIR, 0));
        FORMAT = new DecimalFormat("0.##################");
    }

    private ProcessLock(String str, File file, FileLock fileLock, Closeable closeable, boolean z) {
        this.mLockName = str;
        this.mFileLock = fileLock;
        this.mFile = file;
        this.mStream = closeable;
        this.mWriteMode = z;
    }

    public static ProcessLock tryLock(String str, boolean z) {
        return tryLockInternal(str, customHash(str), z);
    }

    public static ProcessLock tryLock(String str, boolean z, long j) throws InterruptedException {
        ProcessLock processLockTryLockInternal = null;
        long jCurrentTimeMillis = System.currentTimeMillis() + j;
        String strCustomHash = customHash(str);
        synchronized (LOCK_MAP) {
            while (System.currentTimeMillis() < jCurrentTimeMillis && (processLockTryLockInternal = tryLockInternal(str, strCustomHash, z)) == null) {
                try {
                    try {
                        LOCK_MAP.wait(10L);
                    } catch (InterruptedException e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return processLockTryLockInternal;
    }

    public boolean isValid() {
        return isValid(this.mFileLock);
    }

    public void release() {
        release(this.mLockName, this.mFileLock, this.mFile, this.mStream);
    }

    @Override
    public void close() throws IOException {
        release();
    }

    private static boolean isValid(FileLock fileLock) {
        return fileLock != null && fileLock.isValid();
    }

    private static void release(String str, FileLock fileLock, File file, Closeable closeable) {
        synchronized (LOCK_MAP) {
            try {
                if (fileLock != null) {
                    try {
                        LOCK_MAP.remove(str, Integer.valueOf(fileLock.hashCode()));
                        ConcurrentHashMap<Integer, ProcessLock> concurrentHashMapM9041get = LOCK_MAP.m9041get(str);
                        if (concurrentHashMapM9041get == null || concurrentHashMapM9041get.isEmpty()) {
                            IOUtil.deleteFileOrDir(file);
                        }
                        if (fileLock.channel().isOpen()) {
                            fileLock.release();
                        }
                        IOUtil.closeQuietly(fileLock.channel());
                    } catch (Throwable th) {
                        LogUtil.m9046e(th.getMessage(), th);
                        IOUtil.closeQuietly(fileLock.channel());
                    }
                }
                IOUtil.closeQuietly(closeable);
                LOCK_MAP.notifyAll();
            } catch (Throwable th2) {
                IOUtil.closeQuietly(fileLock.channel());
                throw th2;
            }
        }
    }

    private static String customHash(String str) {
        if (TextUtils.isEmpty(str)) {
            return DeviceId.CUIDInfo.I_EMPTY;
        }
        double d = 0.0d;
        byte[] bytes = str.getBytes();
        for (int i = 0; i < str.length(); i++) {
            d = ((d * 255.0d) + ((double) bytes[i])) * 0.005d;
        }
        return FORMAT.format(d);
    }

    private static ProcessLock tryLockInternal(String str, String str2, boolean z) {
        Closeable closeable;
        FileChannel channel;
        Closeable closeable2;
        synchronized (LOCK_MAP) {
            ConcurrentHashMap<Integer, ProcessLock> concurrentHashMapM9041get = LOCK_MAP.m9041get(str);
            if (concurrentHashMapM9041get != null && !concurrentHashMapM9041get.isEmpty()) {
                Iterator<Map.Entry<Integer, ProcessLock>> it = concurrentHashMapM9041get.entrySet().iterator();
                while (it.hasNext()) {
                    ProcessLock value = it.next().getValue();
                    if (value != null) {
                        if (!value.isValid()) {
                            it.remove();
                        } else {
                            if (z) {
                                return null;
                            }
                            if (value.mWriteMode) {
                                return null;
                            }
                        }
                    } else {
                        it.remove();
                    }
                }
            }
            try {
                File file = new File(ClassX.m9074app().getDir(LOCK_FILE_DIR, 0), str2);
                if (file.exists() || file.createNewFile()) {
                    if (z) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                        channel = fileOutputStream.getChannel();
                        closeable2 = fileOutputStream;
                    } else {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        channel = fileInputStream.getChannel();
                        closeable2 = fileInputStream;
                    }
                    try {
                        if (channel != null) {
                            FileLock fileLockTryLock = channel.tryLock(0L, Long.MAX_VALUE, z ? false : true);
                            if (isValid(fileLockTryLock)) {
                                ProcessLock processLock = new ProcessLock(str, file, fileLockTryLock, closeable2, z);
                                LOCK_MAP.m9042put(str, Integer.valueOf(fileLockTryLock.hashCode()), processLock);
                                return processLock;
                            }
                            release(str, fileLockTryLock, file, closeable2);
                        } else {
                            throw new IOException("can not get file channel:" + file.getAbsolutePath());
                        }
                    } catch (Throwable th) {
                        th = th;
                        closeable = closeable2;
                        LogUtil.m9043d("tryLock: " + str + ", " + th.getMessage());
                        IOUtil.closeQuietly(closeable);
                        IOUtil.closeQuietly(channel);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                channel = null;
            }
            LOCK_MAP.notifyAll();
            return null;
        }
    }

    public String toString() {
        return this.mLockName + ": " + this.mFile.getName();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        release();
    }
}
