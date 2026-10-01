package com.tencent.mm.directory;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Set;

public interface Directory {
    public static final char separator = '/';

    boolean containsDir(String str);

    boolean containsFile(String str);

    Directory createDir(String str) throws DirectoryException;

    Directory getDir(String str) throws PathNotExist;

    Map<String, Directory> getDirs();

    Map<String, Directory> getDirs(boolean z);

    InputStream getFileInput(String str) throws DirectoryException;

    OutputStream getFileOutput(String str) throws DirectoryException;

    Set<String> getFiles();

    Set<String> getFiles(boolean z);

    boolean removeFile(String str);
}
