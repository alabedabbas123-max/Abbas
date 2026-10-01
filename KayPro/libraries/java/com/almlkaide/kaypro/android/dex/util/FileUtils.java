package com.almlkaide.kaypro.android.dex.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class FileUtils {
    FileUtils() {
    }

    public static byte[] readFile(String str) {
        return readFile(new File(str));
    }

    public static byte[] readFile(File file) {
        if (!file.exists()) {
            throw new RuntimeException(new StringBuffer().append(file).append(": file not found").toString());
        }
        if (!file.isFile()) {
            throw new RuntimeException(new StringBuffer().append(file).append(": not a file").toString());
        }
        if (!file.canRead()) {
            throw new RuntimeException(new StringBuffer().append(file).append(": file not readable").toString());
        }
        long length = file.length();
        int i = (int) length;
        if (i != length) {
            throw new RuntimeException(new StringBuffer().append(file).append(": file too long").toString());
        }
        byte[] bArr = new byte[i];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i2 = 0;
            while (i > 0) {
                int i3 = fileInputStream.read(bArr, i2, i);
                if (i3 == -1) {
                    throw new RuntimeException(new StringBuffer().append(file).append(": unexpected EOF").toString());
                }
                i2 += i3;
                i -= i3;
            }
            fileInputStream.close();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(new StringBuffer().append(file).append(": trouble reading").toString(), e);
        }
    }

    public static boolean hasArchiveSuffix(String str) {
        return str.endsWith(".zip") || str.endsWith(".jar") || str.endsWith(".apk");
    }
}
