package com.sun.tools.javac.file;

import com.sun.tools.javac.util.Context;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZipFileIndexCache {
    private static ZipFileIndexCache sharedInstance;

    private final Map<File, ZipFileIndex> f400map = new HashMap();

    public static synchronized ZipFileIndexCache getSharedInstance() {
        if (sharedInstance == null) {
            sharedInstance = new ZipFileIndexCache();
        }
        return sharedInstance;
    }

    public static ZipFileIndexCache instance(Context context) {
        ZipFileIndexCache instance = (ZipFileIndexCache) context.m502get(ZipFileIndexCache.class);
        if (instance == null) {
            ZipFileIndexCache instance2 = new ZipFileIndexCache();
            context.m506put((Class<ZipFileIndexCache>) ZipFileIndexCache.class, instance2);
            return instance2;
        }
        return instance;
    }

    public List<ZipFileIndex> getZipFileIndexes() {
        return getZipFileIndexes(false);
    }

    public synchronized List<ZipFileIndex> getZipFileIndexes(boolean openedOnly) {
        List<ZipFileIndex> zipFileIndexes;
        zipFileIndexes = new ArrayList<>();
        zipFileIndexes.addAll(this.f400map.values());
        if (openedOnly) {
            for (ZipFileIndex elem : zipFileIndexes) {
                if (!elem.isOpen()) {
                    zipFileIndexes.remove(elem);
                }
            }
        }
        return zipFileIndexes;
    }

    public synchronized ZipFileIndex getZipFileIndex(File zipFile, RelativePath.RelativeDirectory symbolFilePrefix, boolean useCache, String cacheLocation, boolean writeIndex) throws IOException {
        ZipFileIndex zi;
        zi = getExistingZipIndex(zipFile);
        if (zi == null || (zi != null && zipFile.lastModified() != zi.zipFileLastModified)) {
            zi = new ZipFileIndex(zipFile, symbolFilePrefix, writeIndex, useCache, cacheLocation);
            this.f400map.put(zipFile, zi);
        }
        return zi;
    }

    public synchronized ZipFileIndex getExistingZipIndex(File zipFile) {
        return this.f400map.get(zipFile);
    }

    public synchronized void clearCache() {
        this.f400map.clear();
    }

    public synchronized void clearCache(long timeNotUsed) {
        for (File cachedFile : this.f400map.keySet()) {
            ZipFileIndex cachedZipIndex = this.f400map.get(cachedFile);
            if (cachedZipIndex != null) {
                long timeToTest = cachedZipIndex.lastReferenceTimeStamp + timeNotUsed;
                if (timeToTest < cachedZipIndex.lastReferenceTimeStamp || System.currentTimeMillis() > timeToTest) {
                    this.f400map.remove(cachedFile);
                }
            }
        }
    }

    public synchronized void removeFromCache(File file) {
        this.f400map.remove(file);
    }

    public synchronized void setOpenedIndexes(List<ZipFileIndex> indexes) throws IllegalStateException {
        if (this.f400map.isEmpty()) {
            throw new IllegalStateException("Setting opened indexes should be called only when the ZipFileCache is empty. Call JavacFileManager.flush() before calling this method.");
        }
        for (ZipFileIndex zfi : indexes) {
            this.f400map.put(zfi.zipFile, zfi);
        }
    }
}
