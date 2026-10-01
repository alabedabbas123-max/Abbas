package com.sun.tools.javac.file;

import com.sun.tools.javac.util.Context;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheFSInfo extends FSInfo {
    private Map<File, Entry> cache = new ConcurrentHashMap();

    public static void preRegister(Context context) {
        context.m505put(FSInfo.class, (Context.Factory) new Context.Factory<FSInfo>() {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public FSInfo make(Context c) {
                CacheFSInfo cacheFSInfo = new CacheFSInfo();
                c.m506put((Class<CacheFSInfo>) FSInfo.class, cacheFSInfo);
                return cacheFSInfo;
            }
        });
    }

    public void clearCache() {
        this.cache.clear();
    }

    @Override
    public File getCanonicalFile(File file) {
        Entry e = getEntry(file);
        return e.canonicalFile;
    }

    @Override
    public boolean exists(File file) {
        Entry e = getEntry(file);
        return e.exists;
    }

    @Override
    public boolean isDirectory(File file) {
        Entry e = getEntry(file);
        return e.isDirectory;
    }

    @Override
    public boolean isFile(File file) {
        Entry e = getEntry(file);
        return e.isFile;
    }

    @Override
    public List<File> getJarClassPath(File file) throws IOException {
        Entry e = getEntry(file);
        if (e.jarClassPath == null) {
            e.jarClassPath = super.getJarClassPath(file);
        }
        return e.jarClassPath;
    }

    private Entry getEntry(File file) {
        Entry e = this.cache.get(file);
        if (e == null) {
            Entry e2 = new Entry();
            e2.canonicalFile = super.getCanonicalFile(file);
            e2.exists = super.exists(file);
            e2.isDirectory = super.isDirectory(file);
            e2.isFile = super.isFile(file);
            this.cache.put(file, e2);
            return e2;
        }
        return e;
    }

    private static class Entry {
        File canonicalFile;
        boolean exists;
        boolean isDirectory;
        boolean isFile;
        List<File> jarClassPath;

        private Entry() {
        }
    }
}
