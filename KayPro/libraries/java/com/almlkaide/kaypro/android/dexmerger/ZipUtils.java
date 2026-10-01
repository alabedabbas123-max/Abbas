package com.almlkaide.kaypro.android.dexmerger;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class ZipUtils {
    private static final int BUFFER_LEN = 81920;

    ZipUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean zipFiles(Collection<String> collection, String str) throws IOException {
        return zipFiles(collection, str, (String) null);
    }

    public static boolean zipFiles(Collection<String> collection, String str, String str2) throws Throwable {
        ZipOutputStream zipOutputStream;
        if (collection == null || str == null) {
            return false;
        }
        ZipOutputStream zipOutputStream2 = (ZipOutputStream) null;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str));
            try {
                Iterator<String> it = collection.iterator();
                while (it.hasNext()) {
                    if (!zipFile(getFileByPath(it.next()), "", zipOutputStream, str2)) {
                        if (zipOutputStream != null) {
                            zipOutputStream.finish();
                            zipOutputStream.close();
                        }
                        return false;
                    }
                }
                if (zipOutputStream == null) {
                    return true;
                }
                zipOutputStream.finish();
                zipOutputStream.close();
                return true;
            } catch (Throwable th) {
                th = th;
                if (zipOutputStream == null) {
                    throw th;
                }
                zipOutputStream.finish();
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream = zipOutputStream2;
        }
    }

    public static boolean zipFiles(Collection<File> collection, File file) throws IOException {
        return zipFiles(collection, file, (String) null);
    }

    public static boolean zipFiles(Collection<File> collection, File file, String str) throws Throwable {
        ZipOutputStream zipOutputStream;
        if (collection == null || file == null) {
            return false;
        }
        ZipOutputStream zipOutputStream2 = (ZipOutputStream) null;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
            try {
                Iterator<File> it = collection.iterator();
                while (it.hasNext()) {
                    if (!zipFile(it.next(), "", zipOutputStream, str)) {
                        if (zipOutputStream != null) {
                            zipOutputStream.finish();
                            zipOutputStream.close();
                        }
                        return false;
                    }
                }
                if (zipOutputStream == null) {
                    return true;
                }
                zipOutputStream.finish();
                zipOutputStream.close();
                return true;
            } catch (Throwable th) {
                th = th;
                if (zipOutputStream == null) {
                    throw th;
                }
                zipOutputStream.finish();
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream = zipOutputStream2;
        }
    }

    public static boolean zipFile(String str, String str2) throws IOException {
        return zipFile(getFileByPath(str), getFileByPath(str2), (String) null);
    }

    public static boolean zipFile(String str, String str2, String str3) throws IOException {
        return zipFile(getFileByPath(str), getFileByPath(str2), str3);
    }

    public static boolean zipFile(File file, File file2) throws IOException {
        return zipFile(file, file2, (String) null);
    }

    public static boolean zipFile(File file, File file2, String str) throws Throwable {
        ZipOutputStream zipOutputStream;
        if (file == null || file2 == null) {
            return false;
        }
        ZipOutputStream zipOutputStream2 = (ZipOutputStream) null;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
            try {
                boolean zZipFile = zipFile(file, "", zipOutputStream, str);
                if (zipOutputStream != null) {
                    zipOutputStream.close();
                    return zZipFile;
                }
                return zZipFile;
            } catch (Throwable th) {
                th = th;
                if (zipOutputStream == null) {
                    throw th;
                }
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream = zipOutputStream2;
        }
    }

    private static boolean zipFile(File file, String str, ZipOutputStream zipOutputStream, String str2) throws Throwable {
        InputStream bufferedInputStream;
        String string = new StringBuffer().append(new StringBuffer().append(str).append(isSpace(str) ? "" : File.separator).toString()).append(file.getName()).toString();
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                ZipEntry zipEntry = new ZipEntry(new StringBuffer().append(string).append('/').toString());
                zipEntry.setComment(str2);
                zipOutputStream.putNextEntry(zipEntry);
                zipOutputStream.closeEntry();
            } else {
                for (File file2 : fileArrListFiles) {
                    if (!zipFile(file2, string, zipOutputStream, str2)) {
                        return false;
                    }
                }
            }
        } else {
            InputStream inputStream = (InputStream) null;
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    ZipEntry zipEntry2 = new ZipEntry(string);
                    zipEntry2.setComment(str2);
                    zipOutputStream.putNextEntry(zipEntry2);
                    byte[] bArr = new byte[BUFFER_LEN];
                    while (true) {
                        int i = bufferedInputStream.read(bArr, 0, BUFFER_LEN);
                        if (i == -1) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, i);
                    }
                    zipOutputStream.closeEntry();
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (bufferedInputStream == null) {
                        throw th;
                    }
                    bufferedInputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = inputStream;
            }
        }
        return true;
    }

    public static List<File> unzipFile(String str, String str2) throws IOException {
        return unzipFileByKeyword(str, str2, (String) null);
    }

    public static List<File> unzipFile(File file, File file2) throws IOException {
        return unzipFileByKeyword(file, file2, (String) null);
    }

    public static List<File> unzipFileByKeyword(String str, String str2, String str3) throws IOException {
        return unzipFileByKeyword(getFileByPath(str), getFileByPath(str2), str3);
    }

    public static List<File> unzipFileByKeyword(File file, File file2, String str) throws IOException {
        if (file == null || file2 == null) {
            return (List) null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        try {
            if (isSpace(str)) {
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    String name = zipEntryNextElement.getName();
                    if (name.contains("../")) {
                        System.err.println(new StringBuffer().append(new StringBuffer().append("entryName: ").append(name).toString()).append(" is dangerous!").toString());
                    } else if (!unzipChildFile(file2, arrayList, zipFile, zipEntryNextElement, name)) {
                        zipFile.close();
                        return arrayList;
                    }
                }
            } else {
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement2 = enumerationEntries.nextElement();
                    String name2 = zipEntryNextElement2.getName();
                    if (name2.contains("../")) {
                        System.out.println(new StringBuffer().append(new StringBuffer().append("entryName: ").append(name2).toString()).append(" is dangerous!").toString());
                    } else if (name2.contains(str) && !unzipChildFile(file2, arrayList, zipFile, zipEntryNextElement2, name2)) {
                        zipFile.close();
                        return arrayList;
                    }
                }
            }
            zipFile.close();
            return arrayList;
        } catch (Throwable th) {
            zipFile.close();
            throw th;
        }
    }

    private static boolean unzipChildFile(File file, List<File> list, ZipFile zipFile, ZipEntry zipEntry, String str) throws Throwable {
        InputStream bufferedInputStream;
        File file2 = new File(file, str);
        list.add(file2);
        if (zipEntry.isDirectory()) {
            return createOrExistsDir(file2);
        }
        if (!createOrExistsFile(file2)) {
            return false;
        }
        InputStream inputStream = (InputStream) null;
        OutputStream outputStream = (OutputStream) null;
        try {
            bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    byte[] bArr = new byte[BUFFER_LEN];
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    return true;
                } catch (Throwable th) {
                    th = th;
                    outputStream = bufferedOutputStream;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (outputStream == null) {
                        throw th;
                    }
                    outputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = inputStream;
        }
    }

    public static List<String> getFilesPath(String str) throws IOException {
        return getFilesPath(getFileByPath(str));
    }

    public static List<String> getFilesPath(File file) throws IOException {
        if (file == null) {
            return (List) null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            String name = enumerationEntries.nextElement().getName();
            if (name.contains("../")) {
                System.out.println(new StringBuffer().append(new StringBuffer().append("entryName: ").append(name).toString()).append(" is dangerous!").toString());
                arrayList.add(name);
            } else {
                arrayList.add(name);
            }
        }
        zipFile.close();
        return arrayList;
    }

    public static List<String> getComments(String str) throws IOException {
        return getComments(getFileByPath(str));
    }

    public static List<String> getComments(File file) throws IOException {
        if (file == null) {
            return (List) null;
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        while (enumerationEntries.hasMoreElements()) {
            arrayList.add(enumerationEntries.nextElement().getComment());
        }
        zipFile.close();
        return arrayList;
    }

    private static boolean createOrExistsDir(File file) {
        return file != null && (!file.exists() ? !file.mkdirs() : !file.isDirectory());
    }

    private static boolean createOrExistsFile(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        if (!createOrExistsDir(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static File getFileByPath(String str) {
        return isSpace(str) ? (File) null : new File(str);
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
