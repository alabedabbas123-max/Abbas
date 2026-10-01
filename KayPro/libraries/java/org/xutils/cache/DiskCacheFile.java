package org.xutils.cache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.xutils.common.util.IOUtil;
import org.xutils.common.util.ProcessLock;

public final class DiskCacheFile extends File implements Closeable {
    private final DiskCacheEntity cacheEntity;
    private final ProcessLock lock;

    DiskCacheFile(String str, DiskCacheEntity diskCacheEntity, ProcessLock processLock) {
        super(str);
        this.cacheEntity = diskCacheEntity;
        this.lock = processLock;
    }

    @Override
    public void close() throws IOException {
        IOUtil.closeQuietly(this.lock);
    }

    public DiskCacheFile commit() throws IOException {
        return getDiskCache().commitDiskCacheFile(this);
    }

    public LruDiskCache getDiskCache() {
        return LruDiskCache.getDiskCache(getParentFile().getName());
    }

    public DiskCacheEntity getCacheEntity() {
        return this.cacheEntity;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
