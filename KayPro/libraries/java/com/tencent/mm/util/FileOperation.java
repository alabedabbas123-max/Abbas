package com.tencent.mm.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class FileOperation {
    private static final int BUFFER = 8192;

    public static boolean checkDirectory(String str) {
        File file = new File(str);
        deleteDir(file);
        if (file.exists()) {
            return true;
        }
        file.mkdirs();
        return true;
    }

    public static File checkFile(String str) {
        deleteFile(str);
        File file = new File(str);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static void copyFileUsingStream(File file, File file2) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = (FileInputStream) null;
        FileOutputStream fileOutputStream = (FileOutputStream) null;
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2, false);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        } else {
                            fileOutputStream2.write(bArr, 0, i);
                        }
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream == null) {
                        throw th;
                    }
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = fileInputStream2;
        }
    }

    public static boolean deleteDir(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            file.delete();
        } else if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteDir(file2);
            }
        }
        file.delete();
        return true;
    }

    public static boolean deleteFile(String str) {
        if (str == null) {
            return true;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    public static boolean fileExists(String str) {
        return str != null && new File(str).exists();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static long getFileSizes(File file) throws Throwable {
        FileInputStream fileInputStream;
        long jAvailable;
        long j = 0;
        if (!file.exists() || !file.isFile()) {
            return j;
        }
        FileInputStream fileInputStream2 = (FileInputStream) null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    jAvailable = fileInputStream.available();
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    jAvailable = j;
                }
            } catch (Throwable th) {
                th = th;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            fileInputStream = fileInputStream2;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
        if (fileInputStream == null) {
            return jAvailable;
        }
        try {
            fileInputStream.close();
            return jAvailable;
        } catch (IOException e4) {
            e4.printStackTrace();
            return jAvailable;
        }
    }

    public static long getlist(File file) {
        if (file == null || !file.exists()) {
            return 0;
        }
        if (!file.isDirectory()) {
            return 1;
        }
        File[] fileArrListFiles = file.listFiles();
        long length = fileArrListFiles.length;
        for (int i = 0; i < fileArrListFiles.length; i++) {
            if (fileArrListFiles[i].isDirectory()) {
                length = (length + getlist(fileArrListFiles[i])) - 1;
            }
        }
        return length;
    }

    private static byte[] readContents(File file) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            byte[] bArr = new byte[4096];
            while (true) {
                int i = bufferedInputStream.read(bArr, 0, 4096);
                if (i == -1) {
                    bufferedInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                byteArrayOutputStream.write(bArr2);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @SuppressWarnings("rawtypes")
    public static HashMap<String, Integer> unZipAPk(String str, String str2) throws IOException {
        checkDirectory(str2);
        ZipFile zipFile = new ZipFile(str);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        HashMap<String, Integer> map = new HashMap<>();
        while (enumerationEntries.hasMoreElements()) {
            try {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (zipEntryNextElement.isDirectory()) {
                    new File(str2, zipEntryNextElement.getName()).mkdirs();
                } else {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntryNextElement));
                    File file = new File(new StringBuffer().append(new StringBuffer().append(str2).append(File.separator).toString()).append(zipEntryNextElement.getName()).toString());
                    File parentFile = file.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    String name = zipEntryNextElement.getName();
                    if (name.contains("\\")) {
                        name = name.replace("\\", "/");
                    }
                    map.put(name, new Integer(zipEntryNextElement.getMethod()));
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 8192);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = bufferedInputStream.read(bArr, 0, 8192);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                }
            } catch (Throwable th) {
                zipFile.close();
                throw th;
            }
        }
        zipFile.close();
        return map;
    }

    private static void zipFile(File file, ZipOutputStream zipOutputStream, String str, HashMap<String, Integer> map) throws IOException {
        String string = new StringBuffer().append(new StringBuffer().append(str).append(str.trim().length() == 0 ? "" : File.separator).toString()).append(file.getName()).toString();
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                zipFile(file2, zipOutputStream, string, map);
            }
            return;
        }
        byte[] contents = readContents(file);
        if (string.contains("\\")) {
            string = string.replace("\\", "/");
        }
        if (!map.containsKey(string)) {
            System.err.printf(String.format("do not have the compress data path =%s in resource.asrc\n", string), new Object[0]);
            return;
        }
        int iIntValue = map.get(string).intValue();
        ZipEntry zipEntry = new ZipEntry(string);
        if (iIntValue == 8) {
            zipEntry.setMethod(8);
        } else {
            zipEntry.setMethod(0);
            zipEntry.setSize(contents.length);
            CRC32 crc32 = new CRC32();
            crc32.update(contents);
            zipEntry.setCrc(crc32.getValue());
        }
        zipOutputStream.putNextEntry(zipEntry);
        zipOutputStream.write(contents);
        zipOutputStream.flush();
        zipOutputStream.closeEntry();
    }

    public static void zipFiles(Collection<File> collection, File file, File file2, HashMap<String, Integer> map) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file2), 8192));
        for (File file3 : collection) {
            if (file3.exists()) {
                if (file3.getAbsolutePath().contains(file.getAbsolutePath())) {
                    String path = file.toURI().relativize(file3.getParentFile().toURI()).getPath();
                    zipFile(file3, zipOutputStream, path.length() > 1 ? path.substring(0, path.length() - 1) : "", map);
                } else {
                    zipFile(file3, zipOutputStream, "", map);
                }
            }
        }
        zipOutputStream.close();
    }
}
