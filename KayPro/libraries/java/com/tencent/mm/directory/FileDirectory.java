package com.tencent.mm.directory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class FileDirectory extends AbstractDirectory {
    private File mDir;

    public FileDirectory(File file) throws DirectoryException {
        if (!file.isDirectory()) {
            throw new DirectoryException(new StringBuffer().append("file must be a directory: ").append(file).toString());
        }
        this.mDir = file;
    }

    public FileDirectory(String str) throws DirectoryException {
        this(new File(str));
    }

    private String generatePath(String str) {
        return new StringBuffer().append(new StringBuffer().append(getDir().getPath()).append('/').toString()).append(str).toString();
    }

    private File getDir() {
        return this.mDir;
    }

    private void loadAll() {
        this.mFiles = new LinkedHashSet();
        this.mDirs = new LinkedHashMap();
        for (File file : getDir().listFiles()) {
            if (file.isFile()) {
                this.mFiles.add(file.getName());
            } else {
                try {
                    this.mDirs.put(file.getName(), new FileDirectory(file));
                } catch (DirectoryException e) {
                }
            }
        }
    }

    @Override
    protected AbstractDirectory createDirLocal(String str) throws DirectoryException {
        File file = new File(generatePath(str));
        file.mkdir();
        return new FileDirectory(file);
    }

    @Override
    protected InputStream getFileInputLocal(String str) throws DirectoryException {
        try {
            return new FileInputStream(generatePath(str));
        } catch (FileNotFoundException e) {
            throw new DirectoryException(e);
        }
    }

    @Override
    protected OutputStream getFileOutputLocal(String str) throws DirectoryException {
        try {
            return new FileOutputStream(generatePath(str));
        } catch (FileNotFoundException e) {
            throw new DirectoryException(e);
        }
    }

    @Override
    protected void loadDirs() {
        loadAll();
    }

    @Override
    protected void loadFiles() {
        loadAll();
    }

    @Override
    protected void removeFileLocal(String str) {
        new File(generatePath(str)).delete();
    }
}
