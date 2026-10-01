package com.tencent.mm.directory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipRODirectory extends AbstractDirectory {
    private String mPath;
    private ZipFile mZipFile;

    public ZipRODirectory(File file) throws DirectoryException {
        this(file, "");
    }

    public ZipRODirectory(File file, String str) throws DirectoryException {
        try {
            this.mZipFile = new ZipFile(file);
            this.mPath = str;
        } catch (IOException e) {
            throw new DirectoryException(e);
        }
    }

    public ZipRODirectory(String str) throws DirectoryException {
        this(str, "");
    }

    public ZipRODirectory(String str, String str2) throws DirectoryException {
        this(new File(str), str2);
    }

    public ZipRODirectory(ZipFile zipFile) {
        this(zipFile, "");
    }

    public ZipRODirectory(ZipFile zipFile, String str) {
        this.mZipFile = zipFile;
        this.mPath = str;
    }

    private String getPath() {
        return this.mPath;
    }

    private ZipFile getZipFile() {
        return this.mZipFile;
    }

    private void loadAll() {
        String strSubstring;
        this.mFiles = new LinkedHashSet();
        this.mDirs = new LinkedHashMap();
        int length = getPath().length();
        Enumeration<? extends ZipEntry> enumerationEntries = getZipFile().entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            String name = zipEntryNextElement.getName();
            if (!name.equals(getPath()) && name.startsWith(getPath())) {
                String strSubstring2 = name.substring(length);
                int iIndexOf = strSubstring2.indexOf(47);
                if (iIndexOf != -1) {
                    strSubstring = strSubstring2.substring(0, iIndexOf);
                } else if (zipEntryNextElement.isDirectory()) {
                    strSubstring = strSubstring2;
                } else {
                    this.mFiles.add(strSubstring2);
                }
                if (!this.mDirs.containsKey(strSubstring)) {
                    this.mDirs.put(strSubstring, new ZipRODirectory(getZipFile(), new StringBuffer().append(new StringBuffer().append(getPath()).append(strSubstring).toString()).append('/').toString()));
                }
            }
        }
    }

    @Override
    protected AbstractDirectory createDirLocal(String str) throws DirectoryException {
        throw new UnsupportedOperationException();
    }

    @Override
    protected InputStream getFileInputLocal(String str) throws DirectoryException {
        try {
            return getZipFile().getInputStream(new ZipEntry(new StringBuffer().append(getPath()).append(str).toString()));
        } catch (IOException e) {
            throw new PathNotExist(str, e);
        }
    }

    @Override
    protected OutputStream getFileOutputLocal(String str) throws DirectoryException {
        throw new UnsupportedOperationException();
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
        throw new UnsupportedOperationException();
    }
}
