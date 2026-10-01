package com.github.megatronking.svg.generator.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class FileUtils {
    public static boolean createFolders(File file) {
        return file.mkdirs();
    }

    public static String noExtensionFullName(File file) {
        return noExtensionName(file.getPath());
    }

    public static String noExtensionLastName(File file) {
        return noExtensionName(file.getName());
    }

    public static String noExtensionName(String str) {
        return str.substring(0, str.lastIndexOf("."));
    }

    public static boolean saveFile(String str, String str2, String str3) {
        return saveFile(str, str2, str3, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static boolean saveFile(String str, String str2, String str3, boolean z, boolean z2) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean z3;
        File file = new File(str);
        if (!file.exists()) {
            if (!z) {
                return false;
            }
            createFolders(file);
        }
        FileOutputStream fileOutputStream2 = (FileOutputStream) null;
        try {
            try {
                fileOutputStream = new FileOutputStream(new File(str, str2), z2);
                try {
                    fileOutputStream.write(str3.getBytes());
                    fileOutputStream.flush();
                    z3 = true;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    z3 = false;
                }
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream = fileOutputStream2;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
        return z3;
    }

    public static void unZipGzipFile(File file, File file2) throws IOException {
        if (!file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr, 0, 1024);
            if (i == -1) {
                gZIPInputStream.close();
                fileInputStream.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }
}
