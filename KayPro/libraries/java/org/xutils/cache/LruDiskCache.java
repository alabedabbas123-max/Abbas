package org.xutils.cache;

import android.text.TextUtils;
import com.baidu.mobstat.Config;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.xutils.x;
import org.xutils.DbManager;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.common.util.MD5;
import org.xutils.common.util.FileUtil;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.LogUtil;
import org.xutils.common.util.ProcessLock;
import org.xutils.config.DbConfigs;
import org.xutils.db.sqlite.WhereBuilder;
import org.xutils.ex.FileLockedException;

public final class LruDiskCache {
    private static final String CACHE_DIR_NAME = "xUtils_cache";
    private static final HashMap<String, LruDiskCache> DISK_CACHE_MAP = new HashMap<>(5);
    private static final int LIMIT_COUNT = 5000;
    private static final long LIMIT_SIZE = 104857600;
    private static final int LOCK_WAIT = 3000;
    private static final String TEMP_FILE_SUFFIX = ".tmp";
    private static final long TRIM_TIME_SPAN = 1000;
    private boolean available;
    private DbManager cacheDb;
    private File cacheDir;
    private long diskCacheSize = LIMIT_SIZE;
    private final Executor trimExecutor = new PriorityExecutor(1, true);
    private long lastTrimTime = 0;

    public static synchronized LruDiskCache getDiskCache(String str) {
        LruDiskCache lruDiskCache;
        if (TextUtils.isEmpty(str)) {
            str = CACHE_DIR_NAME;
        }
        lruDiskCache = DISK_CACHE_MAP.get(str);
        if (lruDiskCache == null) {
            lruDiskCache = new LruDiskCache(str);
            DISK_CACHE_MAP.put(str, lruDiskCache);
        }
        return lruDiskCache;
    }

    private LruDiskCache(String str) {
        this.available = false;
        try {
            this.cacheDir = FileUtil.getCacheDir(str);
            if (this.cacheDir != null && (this.cacheDir.exists() || this.cacheDir.mkdirs())) {
                this.available = true;
            }
            this.cacheDb = ClassX.getDb(DbConfigs.HTTP.getConfig());
        } catch (Throwable th) {
            this.available = false;
            LogUtil.m9046e(th.getMessage(), th);
        }
        deleteNoIndexFiles();
    }

    public LruDiskCache setMaxSize(long j) {
        if (j > 0) {
            long diskAvailableSize = FileUtil.getDiskAvailableSize();
            if (diskAvailableSize > j) {
                this.diskCacheSize = j;
            } else {
                this.diskCacheSize = diskAvailableSize;
            }
        }
        return this;
    }

    public DiskCacheEntity m9037get(String str) {
        final DiskCacheEntity diskCacheEntity;
        if (!this.available || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            diskCacheEntity = (DiskCacheEntity) this.cacheDb.selector(DiskCacheEntity.class).where("key", "=", str).findFirst();
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
            diskCacheEntity = null;
        }
        if (diskCacheEntity == null) {
            return diskCacheEntity;
        }
        if (diskCacheEntity.getExpires() < System.currentTimeMillis()) {
            return null;
        }
        this.trimExecutor.execute(new Runnable() {
            @Override
            public void run() {
                diskCacheEntity.setHits(diskCacheEntity.getHits() + 1);
                diskCacheEntity.setLastAccess(System.currentTimeMillis());
                try {
                    LruDiskCache.this.cacheDb.update(diskCacheEntity, "hits", "lastAccess");
                } catch (Throwable th2) {
                    LogUtil.m9046e(th2.getMessage(), th2);
                }
            }
        });
        return diskCacheEntity;
    }

    public void m9038put(DiskCacheEntity diskCacheEntity) {
        if (this.available && diskCacheEntity != null && !TextUtils.isEmpty(diskCacheEntity.getTextContent()) && diskCacheEntity.getExpires() >= System.currentTimeMillis()) {
            try {
                this.cacheDb.replace(diskCacheEntity);
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
            }
            trimSize();
        }
    }

    public DiskCacheFile getDiskCacheFile(String str) throws InterruptedException {
        DiskCacheEntity diskCacheEntityM9037get;
        ProcessLock processLockTryLock;
        if (!this.available || TextUtils.isEmpty(str) || (diskCacheEntityM9037get = m9037get(str)) == null || !new File(diskCacheEntityM9037get.getPath()).exists() || (processLockTryLock = ProcessLock.tryLock(diskCacheEntityM9037get.getPath(), false, 3000L)) == null || !processLockTryLock.isValid()) {
            return null;
        }
        DiskCacheFile diskCacheFile = new DiskCacheFile(diskCacheEntityM9037get.getPath(), diskCacheEntityM9037get, processLockTryLock);
        if (diskCacheFile.exists()) {
            return diskCacheFile;
        }
        try {
            this.cacheDb.delete(diskCacheEntityM9037get);
            return null;
        } catch (Throwable th) {
            LogUtil.m9046e(th.getMessage(), th);
            return null;
        }
    }

    public DiskCacheFile createDiskCacheFile(DiskCacheEntity diskCacheEntity) throws IOException {
        if (!this.available || diskCacheEntity == null) {
            return null;
        }
        diskCacheEntity.setPath(new File(this.cacheDir, MD5.m9058md5(diskCacheEntity.getKey())).getAbsolutePath());
        String str = diskCacheEntity.getPath() + TEMP_FILE_SUFFIX;
        ProcessLock processLockTryLock = ProcessLock.tryLock(str, true);
        if (processLockTryLock != null && processLockTryLock.isValid()) {
            DiskCacheFile diskCacheFile = new DiskCacheFile(str, diskCacheEntity, processLockTryLock);
            if (!diskCacheFile.getParentFile().exists()) {
                diskCacheFile.mkdirs();
                return diskCacheFile;
            }
            return diskCacheFile;
        }
        throw new FileLockedException(diskCacheEntity.getPath());
    }

    public void clearCacheFiles() {
        IOUtil.deleteFileOrDir(this.cacheDir);
    }

    DiskCacheFile commitDiskCacheFile(DiskCacheFile diskCacheFile) throws Throwable {
        Throwable th;
        DiskCacheFile diskCacheFile2;
        ProcessLock processLockTryLock;
        DiskCacheFile diskCacheFile3;
        InterruptedException e;
        if (!this.available || diskCacheFile == null) {
            return diskCacheFile;
        }
        DiskCacheEntity cacheEntity = diskCacheFile.getCacheEntity();
        if (!diskCacheFile.getName().endsWith(TEMP_FILE_SUFFIX)) {
            return diskCacheFile;
        }
        try {
            String path = cacheEntity.getPath();
            processLockTryLock = ProcessLock.tryLock(path, true, 3000L);
            if (processLockTryLock != null) {
                try {
                    if (processLockTryLock.isValid()) {
                        DiskCacheFile diskCacheFile4 = new DiskCacheFile(path, cacheEntity, processLockTryLock);
                        try {
                            try {
                                try {
                                    if (!diskCacheFile.renameTo(diskCacheFile4)) {
                                        throw new IOException("rename:" + diskCacheFile.getAbsolutePath());
                                    }
                                    try {
                                        this.cacheDb.replace(cacheEntity);
                                    } catch (Throwable th2) {
                                        LogUtil.m9046e(th2.getMessage(), th2);
                                    }
                                    trimSize();
                                    if (diskCacheFile4 != null) {
                                        IOUtil.closeQuietly(diskCacheFile);
                                        IOUtil.deleteFileOrDir(diskCacheFile);
                                        return diskCacheFile4;
                                    }
                                    IOUtil.closeQuietly(diskCacheFile4);
                                    IOUtil.closeQuietly(processLockTryLock);
                                    IOUtil.deleteFileOrDir(diskCacheFile4);
                                    return diskCacheFile;
                                } catch (Throwable th3) {
                                    th = th3;
                                    diskCacheFile2 = diskCacheFile4;
                                    diskCacheFile3 = diskCacheFile4;
                                }
                            } catch (InterruptedException e2) {
                                e = e2;
                                diskCacheFile2 = diskCacheFile4;
                                try {
                                    LogUtil.m9046e(e.getMessage(), e);
                                    if (diskCacheFile != null) {
                                        IOUtil.closeQuietly(diskCacheFile);
                                        IOUtil.deleteFileOrDir(diskCacheFile);
                                        return diskCacheFile;
                                    }
                                    IOUtil.closeQuietly(diskCacheFile2);
                                    IOUtil.closeQuietly(processLockTryLock);
                                    IOUtil.deleteFileOrDir(diskCacheFile2);
                                    return diskCacheFile;
                                } catch (Throwable th4) {
                                    th = th4;
                                    diskCacheFile3 = diskCacheFile;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            diskCacheFile2 = diskCacheFile4;
                            diskCacheFile3 = null;
                        }
                        if (diskCacheFile3 == null) {
                            IOUtil.closeQuietly(diskCacheFile2);
                            IOUtil.closeQuietly(processLockTryLock);
                            IOUtil.deleteFileOrDir(diskCacheFile2);
                        } else {
                            IOUtil.closeQuietly(diskCacheFile);
                            IOUtil.deleteFileOrDir(diskCacheFile);
                        }
                        throw th;
                    }
                } catch (InterruptedException e3) {
                    e = e3;
                    diskCacheFile2 = null;
                } catch (Throwable th6) {
                    th = th6;
                    diskCacheFile2 = null;
                    diskCacheFile3 = null;
                }
            }
            throw new FileLockedException(path);
        } catch (InterruptedException e4) {
            e = e4;
            diskCacheFile2 = null;
            processLockTryLock = null;
        } catch (Throwable th7) {
            th = th7;
            diskCacheFile2 = null;
            processLockTryLock = null;
            diskCacheFile3 = null;
        }
    }

    private void trimSize() {
        this.trimExecutor.execute(new Runnable() {
            @Override
            public void run() {
                List<DiskCacheEntity> listFindAll;
                if (LruDiskCache.this.available) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - LruDiskCache.this.lastTrimTime >= LruDiskCache.TRIM_TIME_SPAN) {
                        LruDiskCache.this.lastTrimTime = jCurrentTimeMillis;
                        LruDiskCache.this.deleteExpiry();
                        try {
                            int iCount = (int) LruDiskCache.this.cacheDb.selector(DiskCacheEntity.class).count();
                            if (iCount > 5010 && (listFindAll = LruDiskCache.this.cacheDb.selector(DiskCacheEntity.class).orderBy("lastAccess").orderBy("hits").limit(iCount - 5000).offset(0).findAll()) != null && listFindAll.size() > 0) {
                                for (DiskCacheEntity diskCacheEntity : listFindAll) {
                                    try {
                                        LruDiskCache.this.cacheDb.delete(diskCacheEntity);
                                        String path = diskCacheEntity.getPath();
                                        if (!TextUtils.isEmpty(path)) {
                                            LruDiskCache.this.deleteFileWithLock(path);
                                            LruDiskCache.this.deleteFileWithLock(path + LruDiskCache.TEMP_FILE_SUFFIX);
                                        }
                                    } catch (Throwable th) {
                                        LogUtil.m9046e(th.getMessage(), th);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            LogUtil.m9046e(th2.getMessage(), th2);
                        }
                        while (FileUtil.getFileOrDirSize(LruDiskCache.this.cacheDir) > LruDiskCache.this.diskCacheSize) {
                            try {
                                List<DiskCacheEntity> listFindAll2 = LruDiskCache.this.cacheDb.selector(DiskCacheEntity.class).orderBy("lastAccess").orderBy("hits").limit(10).offset(0).findAll();
                                if (listFindAll2 != null && listFindAll2.size() > 0) {
                                    for (DiskCacheEntity diskCacheEntity2 : listFindAll2) {
                                        try {
                                            LruDiskCache.this.cacheDb.delete(diskCacheEntity2);
                                            String path2 = diskCacheEntity2.getPath();
                                            if (!TextUtils.isEmpty(path2)) {
                                                LruDiskCache.this.deleteFileWithLock(path2);
                                                LruDiskCache.this.deleteFileWithLock(path2 + LruDiskCache.TEMP_FILE_SUFFIX);
                                            }
                                        } catch (Throwable th3) {
                                            LogUtil.m9046e(th3.getMessage(), th3);
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                LogUtil.m9046e(th4.getMessage(), th4);
                                return;
                            }
                        }
                    }
                }
            }
        });
    }

    public void deleteExpiry() {
        if (this.available) {
            try {
                WhereBuilder whereBuilderM9068b = WhereBuilder.m9068b("expires", "<", Long.valueOf(System.currentTimeMillis()));
                List listFindAll = this.cacheDb.selector(DiskCacheEntity.class).where(whereBuilderM9068b).findAll();
                this.cacheDb.delete(DiskCacheEntity.class, whereBuilderM9068b);
                if (listFindAll != null && listFindAll.size() > 0) {
                    Iterator it = listFindAll.iterator();
                    while (it.hasNext()) {
                        String path = ((DiskCacheEntity) it.next()).getPath();
                        if (!TextUtils.isEmpty(path)) {
                            deleteFileWithLock(path);
                        }
                    }
                }
            } catch (Throwable th) {
                LogUtil.m9046e(th.getMessage(), th);
            }
        }
    }

    private void deleteNoIndexFiles() {
        this.trimExecutor.execute(new Runnable() {
            @Override
            public void run() {
                if (LruDiskCache.this.available) {
                    try {
                        File[] fileArrListFiles = LruDiskCache.this.cacheDir.listFiles();
                        if (fileArrListFiles != null) {
                            for (File file : fileArrListFiles) {
                                try {
                                    if (LruDiskCache.this.cacheDb.selector(DiskCacheEntity.class).where(Config.FEED_LIST_ITEM_PATH, "=", file.getAbsolutePath()).count() < 1) {
                                        IOUtil.deleteFileOrDir(file);
                                    }
                                } catch (Throwable th) {
                                    LogUtil.m9046e(th.getMessage(), th);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        LogUtil.m9046e(th2.getMessage(), th2);
                    }
                }
            }
        });
    }

    public boolean deleteFileWithLock(String str) {
        ProcessLock processLockTryLock = null;
        try {
            processLockTryLock = ProcessLock.tryLock(str, true);
            if (processLockTryLock != null && processLockTryLock.isValid()) {
                return IOUtil.deleteFileOrDir(new File(str));
            }
            return false;
        } finally {
            IOUtil.closeQuietly(processLockTryLock);
        }
    }
}
