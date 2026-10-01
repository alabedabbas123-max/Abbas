package com.tencent.mm.directory;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractDirectory implements Directory {
    protected Map<String, AbstractDirectory> mDirs;
    protected Set<String> mFiles;

    private class ParsedPath {

        public String f5102dir;
        public String subpath;
        private final AbstractDirectory this$0;

        public ParsedPath(AbstractDirectory abstractDirectory, String str, String str2) {
            this.this$0 = abstractDirectory;
            this.f5102dir = str;
            this.subpath = str2;
        }
    }

    private class SubPath {

        public AbstractDirectory f5103dir;
        public String path;
        private final AbstractDirectory this$0;

        public SubPath(AbstractDirectory abstractDirectory, AbstractDirectory abstractDirectory2, String str) {
            this.this$0 = abstractDirectory;
            this.f5103dir = abstractDirectory2;
            this.path = str;
        }
    }

    private SubPath getSubPath(String str) throws PathNotExist {
        ParsedPath path = parsePath(str);
        if (path.f5102dir == null) {
            return new SubPath(this, (AbstractDirectory) null, path.subpath);
        }
        if (getAbstractDirs().containsKey(path.f5102dir)) {
            return new SubPath(this, getAbstractDirs().get(path.f5102dir), path.subpath);
        }
        throw new PathNotExist(str);
    }

    private ParsedPath parsePath(String str) {
        int iIndexOf = str.indexOf(47);
        return iIndexOf == -1 ? new ParsedPath(this, (String) null, str) : new ParsedPath(this, str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
    }

    @Override
    public boolean containsDir(String str) {
        try {
            SubPath subPath = getSubPath(str);
            return subPath.f5103dir != null ? subPath.f5103dir.containsDir(subPath.path) : getAbstractDirs().containsKey(subPath.path);
        } catch (PathNotExist e) {
            return false;
        }
    }

    @Override
    public boolean containsFile(String str) {
        try {
            SubPath subPath = getSubPath(str);
            return subPath.f5103dir != null ? subPath.f5103dir.containsFile(subPath.path) : getFiles().contains(subPath.path);
        } catch (PathNotExist e) {
            return false;
        }
    }

    @Override
    public Directory createDir(String str) throws DirectoryException {
        AbstractDirectory abstractDirectoryCreateDirLocal;
        ParsedPath path = parsePath(str);
        if (path.f5102dir == null) {
            if (getAbstractDirs().containsKey(path.subpath)) {
                throw new PathAlreadyExists(str);
            }
            AbstractDirectory abstractDirectoryCreateDirLocal2 = createDirLocal(path.subpath);
            getAbstractDirs().put(path.subpath, abstractDirectoryCreateDirLocal2);
            return abstractDirectoryCreateDirLocal2;
        }
        if (getAbstractDirs().containsKey(path.f5102dir)) {
            abstractDirectoryCreateDirLocal = getAbstractDirs().get(path.f5102dir);
        } else {
            abstractDirectoryCreateDirLocal = createDirLocal(path.f5102dir);
            getAbstractDirs().put(path.f5102dir, abstractDirectoryCreateDirLocal);
        }
        return abstractDirectoryCreateDirLocal.createDir(path.subpath);
    }

    protected abstract AbstractDirectory createDirLocal(String str) throws DirectoryException;

    protected Map<String, AbstractDirectory> getAbstractDirs() {
        return getAbstractDirs(false);
    }

    protected Map<String, AbstractDirectory> getAbstractDirs(boolean z) {
        if (this.mDirs == null) {
            loadDirs();
        }
        if (!z) {
            return this.mDirs;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.mDirs);
        for (Map.Entry<String, AbstractDirectory> entry : getAbstractDirs().entrySet()) {
            for (Map.Entry<String, AbstractDirectory> entry2 : entry.getValue().getAbstractDirs(true).entrySet()) {
                linkedHashMap.put(new StringBuffer().append(new StringBuffer().append(entry.getKey()).append('/').toString()).append(entry2.getKey()).toString(), entry2.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override
    public Directory getDir(String str) throws PathNotExist {
        SubPath subPath = getSubPath(str);
        if (subPath.f5103dir != null) {
            return subPath.f5103dir.getDir(subPath.path);
        }
        if (getAbstractDirs().containsKey(subPath.path)) {
            return getAbstractDirs().get(subPath.path);
        }
        throw new PathNotExist(str);
    }

    @Override
    public Map<String, Directory> getDirs() {
        return getDirs(false);
    }

    @Override
    public Map<String, Directory> getDirs(boolean z) {
        return new LinkedHashMap(getAbstractDirs(z));
    }

    @Override
    public InputStream getFileInput(String str) throws DirectoryException {
        SubPath subPath = getSubPath(str);
        if (subPath.f5103dir != null) {
            return subPath.f5103dir.getFileInput(subPath.path);
        }
        if (getFiles().contains(subPath.path)) {
            return getFileInputLocal(subPath.path);
        }
        throw new PathNotExist(str);
    }

    protected abstract InputStream getFileInputLocal(String str) throws DirectoryException;

    @Override
    public OutputStream getFileOutput(String str) throws DirectoryException {
        AbstractDirectory abstractDirectoryCreateDir;
        ParsedPath path = parsePath(str);
        if (path.f5102dir == null) {
            getFiles().add(path.subpath);
            return getFileOutputLocal(path.subpath);
        }
        try {
            abstractDirectoryCreateDir = createDir(path.f5102dir);
        } catch (PathAlreadyExists e) {
            abstractDirectoryCreateDir = getAbstractDirs().get(path.f5102dir);
        }
        return abstractDirectoryCreateDir.getFileOutput(path.subpath);
    }

    protected abstract OutputStream getFileOutputLocal(String str) throws DirectoryException;

    @Override
    public Set<String> getFiles() {
        return getFiles(false);
    }

    @Override
    public Set<String> getFiles(boolean z) {
        if (this.mFiles == null) {
            loadFiles();
        }
        if (!z) {
            return this.mFiles;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.mFiles);
        for (Map.Entry<String, AbstractDirectory> entry : getAbstractDirs().entrySet()) {
            Iterator<String> it = entry.getValue().getFiles(true).iterator();
            while (it.hasNext()) {
                linkedHashSet.add(new StringBuffer().append(new StringBuffer().append(entry.getKey()).append('/').toString()).append(it.next()).toString());
            }
        }
        return linkedHashSet;
    }

    protected abstract void loadDirs();

    protected abstract void loadFiles();

    @Override
    public boolean removeFile(String str) {
        try {
            SubPath subPath = getSubPath(str);
            if (subPath.f5103dir != null) {
                return subPath.f5103dir.removeFile(subPath.path);
            }
            if (!getFiles().contains(subPath.path)) {
                return false;
            }
            removeFileLocal(subPath.path);
            getFiles().remove(subPath.path);
            return true;
        } catch (PathNotExist e) {
            return false;
        }
    }

    protected abstract void removeFileLocal(String str);
}
