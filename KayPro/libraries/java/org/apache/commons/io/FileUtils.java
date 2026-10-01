package org.apache.commons.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.io.output.NullOutputStream;

public class FileUtils {
    private static final long FILE_COPY_BUFFER_SIZE = 31457280;
    public static final long ONE_GB = 1073741824;
    public static final long ONE_KB = 1024;
    public static final long ONE_MB = 1048576;
    public static final long ONE_PB = 1125899906842624L;
    public static final long ONE_TB = 1099511627776L;
    public static final BigInteger ONE_KB_BI = BigInteger.valueOf(1024);
    public static final BigInteger ONE_MB_BI = ONE_KB_BI.multiply(ONE_KB_BI);
    public static final BigInteger ONE_GB_BI = ONE_KB_BI.multiply(ONE_MB_BI);
    public static final BigInteger ONE_TB_BI = ONE_KB_BI.multiply(ONE_GB_BI);
    public static final BigInteger ONE_PB_BI = ONE_KB_BI.multiply(ONE_TB_BI);
    public static final BigInteger ONE_EB_BI = ONE_KB_BI.multiply(ONE_PB_BI);
    public static final long ONE_EB = 1152921504606846976L;
    public static final BigInteger ONE_ZB = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(ONE_EB));
    public static final BigInteger ONE_YB = ONE_KB_BI.multiply(ONE_ZB);
    public static final File[] EMPTY_FILE_ARRAY = new File[0];

    public static String byteCountToDisplaySize(long j) {
        return byteCountToDisplaySize(BigInteger.valueOf(j));
    }

    public static String byteCountToDisplaySize(BigInteger bigInteger) {
        if (bigInteger.divide(ONE_EB_BI).compareTo(BigInteger.ZERO) > 0) {
            return String.valueOf(bigInteger.divide(ONE_EB_BI)) + " EB";
        }
        if (bigInteger.divide(ONE_PB_BI).compareTo(BigInteger.ZERO) > 0) {
            return String.valueOf(bigInteger.divide(ONE_PB_BI)) + " PB";
        }
        if (bigInteger.divide(ONE_TB_BI).compareTo(BigInteger.ZERO) > 0) {
            return String.valueOf(bigInteger.divide(ONE_TB_BI)) + " TB";
        }
        if (bigInteger.divide(ONE_GB_BI).compareTo(BigInteger.ZERO) > 0) {
            return String.valueOf(bigInteger.divide(ONE_GB_BI)) + " GB";
        }
        if (bigInteger.divide(ONE_MB_BI).compareTo(BigInteger.ZERO) > 0) {
            return String.valueOf(bigInteger.divide(ONE_MB_BI)) + " MB";
        }
        return bigInteger.divide(ONE_KB_BI).compareTo(BigInteger.ZERO) > 0 ? String.valueOf(bigInteger.divide(ONE_KB_BI)) + " KB" : String.valueOf(bigInteger) + " bytes";
    }

    private static void checkDirectory(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    private static void checkFileRequirements(File file, File file2) throws FileNotFoundException {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:24:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Checksum checksum(File file, Checksum checksum) throws Throwable {
        if (file.isDirectory()) {
            throw new IllegalArgumentException("Checksums can't be computed on directories");
        }
        CheckedInputStream checkedInputStream = new CheckedInputStream(new FileInputStream(file), checksum);
        Throwable th = null;
        try {
            IOUtils.copy(checkedInputStream, new NullOutputStream());
            if (checkedInputStream != null) {
                checkedInputStream.close();
            }
            return checksum;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                th = th3;
                th = th2;
                if (checkedInputStream != null) {
                    if (th != null) {
                        checkedInputStream.close();
                    } else {
                        checkedInputStream.close();
                    }
                }
                throw th;
            }
        }
    }

    public static long checksumCRC32(File file) throws Throwable {
        CRC32 crc32 = new CRC32();
        checksum(file, crc32);
        return crc32.getValue();
    }

    public static void cleanDirectory(File file) throws IOException {
        IOException e = null;
        for (File file2 : verifiedListFiles(file)) {
            try {
                forceDelete(file2);
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    private static void cleanDirectoryOnExit(File file) throws IOException {
        IOException e = null;
        for (File file2 : verifiedListFiles(file)) {
            try {
                forceDeleteOnExit(file2);
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0077 A[Catch: Throwable -> 0x0058, all -> 0x0064, TRY_LEAVE, TryCatch #2 {all -> 0x0064, blocks: (B:18:0x0044, B:21:0x004f, B:39:0x006e, B:43:0x0077, B:42:0x0073, B:40:0x0071), top: B:52:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean contentEquals(File file, File file2) throws Throwable {
        Throwable th = null;
        boolean zExists = file.exists();
        if (zExists == file2.exists()) {
            if (!zExists) {
                return true;
            }
            if (file.isDirectory() || file2.isDirectory()) {
                throw new IOException("Can't compare directories, only files");
            }
            if (file.length() == file2.length()) {
                if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
                    return true;
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file2);
                        try {
                            boolean zContentEquals = IOUtils.contentEquals(fileInputStream, fileInputStream2);
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileInputStream == null) {
                                return zContentEquals;
                            }
                            fileInputStream.close();
                            return zContentEquals;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileInputStream2 != null) {
                                    if (th != null) {
                                        fileInputStream2.close();
                                    } else {
                                        fileInputStream2.close();
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (fileInputStream != null) {
                            if (th != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable th5) {
                                    th.addSuppressed(th5);
                                }
                            } else {
                                fileInputStream.close();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        th = th7;
                        th = th6;
                        if (fileInputStream != null) {
                            if (th != null) {
                                fileInputStream.close();
                            } else {
                                fileInputStream.close();
                            }
                        }
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x009a A[Catch: Throwable -> 0x007b, all -> 0x0087, TRY_LEAVE, TryCatch #0 {Throwable -> 0x007b, blocks: (B:18:0x0045, B:22:0x005a, B:47:0x009a, B:46:0x0096, B:44:0x0094, B:26:0x006f), top: B:54:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean contentEqualsIgnoreEOL(File file, File file2, String str) throws Throwable {
        Throwable th;
        Throwable th2;
        Throwable th3 = null;
        boolean zExists = file.exists();
        if (zExists != file2.exists()) {
            return false;
        }
        if (!zExists) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IOException("Can't compare directories, only files");
        }
        if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        }
        InputStreamReader inputStreamReader = str == null ? new InputStreamReader(new FileInputStream(file), Charset.defaultCharset()) : new InputStreamReader(new FileInputStream(file), str);
        try {
            try {
                InputStreamReader inputStreamReader2 = str == null ? new InputStreamReader(new FileInputStream(file2), Charset.defaultCharset()) : new InputStreamReader(new FileInputStream(file2), str);
                try {
                    boolean zContentEqualsIgnoreEOL = IOUtils.contentEqualsIgnoreEOL(inputStreamReader, inputStreamReader2);
                    if (inputStreamReader2 != null) {
                        inputStreamReader2.close();
                    }
                    if (inputStreamReader == null) {
                        return zContentEqualsIgnoreEOL;
                    }
                    inputStreamReader.close();
                    return zContentEqualsIgnoreEOL;
                } catch (Throwable th4) {
                    th = th4;
                    th2 = null;
                    if (inputStreamReader2 != null) {
                        if (th2 != null) {
                            inputStreamReader2.close();
                        } else {
                            inputStreamReader2.close();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    th = th6;
                    th3 = th5;
                    if (inputStreamReader != null) {
                        if (th3 != null) {
                            try {
                                inputStreamReader.close();
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                            }
                        } else {
                            inputStreamReader.close();
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th8) {
            th = th8;
            if (inputStreamReader != null) {
                if (th3 != null) {
                    inputStreamReader.close();
                } else {
                    inputStreamReader.close();
                }
            }
            throw th;
        }
    }

    public static File[] convertFileCollectionToFileArray(Collection<File> collection) {
        return (File[]) collection.toArray(new File[collection.size()]);
    }

    public static void copyDirectory(File file, File file2) throws Throwable {
        copyDirectory(file, file2, true);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter) throws Throwable {
        copyDirectory(file, file2, fileFilter, true);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter, boolean z) throws Throwable {
        checkFileRequirements(file, file2);
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        ArrayList arrayList = null;
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            File[] fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                arrayList = new ArrayList(fileArrListFiles.length);
                for (File file3 : fileArrListFiles) {
                    arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                }
            }
        }
        doCopyDirectory(file, file2, fileFilter, z, arrayList);
    }

    public static void copyDirectory(File file, File file2, boolean z) throws Throwable {
        copyDirectory(file, file2, null, z);
    }

    public static void copyDirectoryToDirectory(File file, File file2) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file.exists() && !file.isDirectory()) {
            throw new IllegalArgumentException("Source '" + file2 + "' is not a directory");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file2.exists() && !file2.isDirectory()) {
            throw new IllegalArgumentException("Destination '" + file2 + "' is not a directory");
        }
        copyDirectory(file, new File(file2, file.getName()), true);
    }

    public static long copyFile(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        Throwable th = null;
        try {
            long jCopyLarge = IOUtils.copyLarge(fileInputStream, outputStream);
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return jCopyLarge;
        } catch (Throwable th2) {
            if (fileInputStream != null) {
                if (0 != 0) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    fileInputStream.close();
                }
            }
            throw th2;
        }
    }

    public static void copyFile(File file, File file2) throws Throwable {
        copyFile(file, file2, true);
    }

    public static void copyFile(File file, File file2, boolean z) throws Throwable {
        checkFileRequirements(file, file2);
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException("Destination '" + parentFile + "' directory cannot be created");
        }
        if (file2.exists() && !file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' exists but is read-only");
        }
        doCopyFile(file, file2, z);
    }

    public static void copyFileToDirectory(File file, File file2) throws Throwable {
        copyFileToDirectory(file, file2, true);
    }

    public static void copyFileToDirectory(File file, File file2, boolean z) throws Throwable {
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (file2.exists() && !file2.isDirectory()) {
            throw new IllegalArgumentException("Destination '" + file2 + "' is not a directory");
        }
        copyFile(file, new File(file2, file.getName()), z);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void copyInputStreamToFile(InputStream inputStream, File file) throws IOException {
        Throwable th = null;
        try {
            copyToFile(inputStream, file);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public static void copyToDirectory(File file, File file2) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file.isFile()) {
            copyFileToDirectory(file, file2);
        } else {
            if (!file.isDirectory()) {
                throw new IOException("The source " + file + " does not exist");
            }
            copyDirectoryToDirectory(file, file2);
        }
    }

    public static void copyToDirectory(Iterable<File> iterable, File file) throws Throwable {
        if (iterable == null) {
            throw new NullPointerException("Sources must not be null");
        }
        Iterator<File> it = iterable.iterator();
        while (it.hasNext()) {
            copyFileToDirectory(it.next(), file);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0027 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0032 A[Catch: Throwable -> 0x0013, all -> 0x001f, TRY_LEAVE, TryCatch #3 {Throwable -> 0x0013, blocks: (B:3:0x0001, B:6:0x000a, B:29:0x0032, B:28:0x002e, B:26:0x002c), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x003b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void copyToFile(InputStream inputStream, File file) throws Throwable {
        Throwable th;
        Throwable th2;
        Throwable th3 = null;
        try {
            try {
                FileOutputStream fileOutputStreamOpenOutputStream = openOutputStream(file);
                try {
                    IOUtils.copy(inputStream, fileOutputStreamOpenOutputStream);
                    if (fileOutputStreamOpenOutputStream != null) {
                        fileOutputStreamOpenOutputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = null;
                    if (fileOutputStreamOpenOutputStream != null) {
                        if (th2 != null) {
                            fileOutputStreamOpenOutputStream.close();
                        } else {
                            fileOutputStreamOpenOutputStream.close();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    th = th6;
                    th3 = th5;
                    if (inputStream != null) {
                        if (th3 != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                            }
                        } else {
                            inputStream.close();
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th8) {
            th = th8;
            if (inputStream != null) {
                if (th3 != null) {
                    inputStream.close();
                } else {
                    inputStream.close();
                }
            }
            throw th;
        }
    }

    public static void copyURLToFile(URL url, File file) throws IOException {
        copyInputStreamToFile(url.openStream(), file);
    }

    public static void copyURLToFile(URL url, File file, int i, int i2) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        uRLConnectionOpenConnection.setConnectTimeout(i);
        uRLConnectionOpenConnection.setReadTimeout(i2);
        copyInputStreamToFile(uRLConnectionOpenConnection.getInputStream(), file);
    }

    static String decodeUrl(String str) {
        if (str == null || str.indexOf(37) < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        int i = 0;
        while (i < length) {
            if (str.charAt(i) == '%') {
                do {
                    try {
                        byteBufferAllocate.put((byte) Integer.parseInt(str.substring(i + 1, i + 3), 16));
                        i += 3;
                        if (i >= length) {
                            break;
                        }
                    } catch (RuntimeException e) {
                        if (byteBufferAllocate.position() > 0) {
                            byteBufferAllocate.flip();
                            sb.append(StandardCharsets.UTF_8.decode(byteBufferAllocate).toString());
                            byteBufferAllocate.clear();
                        }
                        sb.append(str.charAt(i));
                        i++;
                    } catch (Throwable th) {
                        if (byteBufferAllocate.position() > 0) {
                            byteBufferAllocate.flip();
                            sb.append(StandardCharsets.UTF_8.decode(byteBufferAllocate).toString());
                            byteBufferAllocate.clear();
                        }
                        throw th;
                    }
                } while (str.charAt(i) == '%');
                if (byteBufferAllocate.position() > 0) {
                    byteBufferAllocate.flip();
                    sb.append(StandardCharsets.UTF_8.decode(byteBufferAllocate).toString());
                    byteBufferAllocate.clear();
                }
            }
            sb.append(str.charAt(i));
            i++;
        }
        return sb.toString();
    }

    public static void deleteDirectory(File file) throws IOException {
        if (file.exists()) {
            if (!isSymlink(file)) {
                cleanDirectory(file);
            }
            if (!file.delete()) {
                throw new IOException("Unable to delete directory " + file + ".");
            }
        }
    }

    private static void deleteDirectoryOnExit(File file) throws IOException {
        if (file.exists()) {
            file.deleteOnExit();
            if (isSymlink(file)) {
                return;
            }
            cleanDirectoryOnExit(file);
        }
    }

    public static boolean deleteQuietly(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                cleanDirectory(file);
            }
        } catch (Exception e) {
        }
        try {
            return file.delete();
        } catch (Exception e2) {
            return false;
        }
    }

    public static boolean directoryContains(File file, File file2) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Not a directory: " + file);
        }
        if (file2 != null && file.exists() && file2.exists()) {
            return FilenameUtils.directoryContains(file.getCanonicalPath(), file2.getCanonicalPath());
        }
        return false;
    }

    private static void doCopyDirectory(File file, File file2, FileFilter fileFilter, boolean z, List<String> list) throws Throwable {
        File[] fileArrListFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (fileArrListFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' exists but is not a directory");
            }
        } else if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' directory cannot be created");
        }
        if (!file2.canWrite()) {
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        for (File file3 : fileArrListFiles) {
            File file4 = new File(file2, file3.getName());
            if (list == null || !list.contains(file3.getCanonicalPath())) {
                if (file3.isDirectory()) {
                    doCopyDirectory(file3, file4, fileFilter, z, list);
                } else {
                    doCopyFile(file3, file4, z);
                }
            }
        }
        if (z) {
            file2.setLastModified(file.lastModified());
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ef A[Catch: Throwable -> 0x00b6, all -> 0x00da, TRY_LEAVE, TryCatch #13 {all -> 0x00da, blocks: (B:11:0x0039, B:22:0x005f, B:66:0x00e6, B:70:0x00ef, B:69:0x00eb, B:67:0x00e9), top: B:108:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00fc A[Catch: Throwable -> 0x00c2, all -> 0x00f3, TRY_LEAVE, TryCatch #5 {Throwable -> 0x00c2, blocks: (B:10:0x0034, B:24:0x0064, B:76:0x00fc, B:75:0x00f8, B:41:0x00c1), top: B:97:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0109 A[Catch: Throwable -> 0x00ce, all -> 0x0100, TRY_LEAVE, TryCatch #2 {all -> 0x0100, blocks: (B:9:0x0030, B:26:0x0069, B:48:0x00ca, B:82:0x0109, B:81:0x0105, B:49:0x00cd), top: B:94:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static void doCopyFile(File file, File file2, boolean z) throws Throwable {
        Throwable th;
        Throwable th2;
        Throwable th3;
        Throwable th4;
        Throwable th5;
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                FileChannel channel = fileInputStream.getChannel();
                try {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            try {
                                FileChannel channel2 = fileOutputStream.getChannel();
                                try {
                                    long size = channel.size();
                                    long j = 0;
                                    while (j < size) {
                                        long j2 = size - j;
                                        if (j2 > FILE_COPY_BUFFER_SIZE) {
                                            j2 = FILE_COPY_BUFFER_SIZE;
                                        }
                                        long jTransferFrom = channel2.transferFrom(channel, j, j2);
                                        if (jTransferFrom == 0) {
                                            break;
                                        } else {
                                            j += jTransferFrom;
                                        }
                                    }
                                    if (channel2 != null) {
                                        channel2.close();
                                    }
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (channel != null) {
                                        channel.close();
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    long length = file.length();
                                    long length2 = file2.length();
                                    if (length != length2) {
                                        throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
                                    }
                                    if (z) {
                                        file2.setLastModified(file.lastModified());
                                    }
                                } catch (Throwable th6) {
                                    try {
                                        throw th6;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        th5 = th6;
                                        if (channel2 != null) {
                                            if (th5 != null) {
                                                channel2.close();
                                            } else {
                                                channel2.close();
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th8) {
                                th4 = null;
                                th = th8;
                                if (fileOutputStream != null) {
                                    if (th4 != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (Throwable th9) {
                                            th4.addSuppressed(th9);
                                        }
                                    } else {
                                        fileOutputStream.close();
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            try {
                                throw th10;
                            } catch (Throwable th11) {
                                th = th11;
                                th4 = th10;
                                if (fileOutputStream != null) {
                                    if (th4 != null) {
                                        fileOutputStream.close();
                                    } else {
                                        fileOutputStream.close();
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th12) {
                        try {
                            throw th12;
                        } catch (Throwable th13) {
                            th3 = th13;
                            th2 = th12;
                            if (channel != null) {
                                if (th2 != null) {
                                    try {
                                        channel.close();
                                    } catch (Throwable th14) {
                                        th2.addSuppressed(th14);
                                    }
                                } else {
                                    channel.close();
                                }
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th15) {
                    th2 = null;
                    th3 = th15;
                    if (channel != null) {
                        if (th2 != null) {
                            channel.close();
                        } else {
                            channel.close();
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th16) {
                th = null;
                th = th16;
                if (fileInputStream != null) {
                    if (th != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th17) {
                            th.addSuppressed(th17);
                        }
                    } else {
                        fileInputStream.close();
                    }
                }
                throw th;
            }
        } catch (Throwable th18) {
            try {
                throw th18;
            } catch (Throwable th19) {
                th = th19;
                th = th18;
                if (fileInputStream != null) {
                    if (th != null) {
                        fileInputStream.close();
                    } else {
                        fileInputStream.close();
                    }
                }
                throw th;
            }
        }
    }

    public static void forceDelete(File file) throws IOException {
        if (file.isDirectory()) {
            deleteDirectory(file);
            return;
        }
        boolean zExists = file.exists();
        if (file.delete()) {
            return;
        }
        if (!zExists) {
            throw new FileNotFoundException("File does not exist: " + file);
        }
        throw new IOException("Unable to delete file: " + file);
    }

    public static void forceDeleteOnExit(File file) throws IOException {
        if (file.isDirectory()) {
            deleteDirectoryOnExit(file);
        } else {
            file.deleteOnExit();
        }
    }

    public static void forceMkdir(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("File " + file + " exists and is not a directory. Unable to create directory.");
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Unable to create directory " + file);
        }
    }

    public static void forceMkdirParent(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        forceMkdir(parentFile);
    }

    public static File getFile(File file, String... strArr) {
        if (file == null) {
            throw new NullPointerException("directory must not be null");
        }
        if (strArr == null) {
            throw new NullPointerException("names must not be null");
        }
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            File file2 = new File(file, strArr[i]);
            i++;
            file = file2;
        }
        return file;
    }

    public static File getFile(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("names must not be null");
        }
        File file = null;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            file = file == null ? new File(str) : new File(file, str);
        }
        return file;
    }

    public static File getTempDirectory() {
        return new File(getTempDirectoryPath());
    }

    public static String getTempDirectoryPath() {
        return System.getProperty("java.io.tmpdir");
    }

    public static File getUserDirectory() {
        return new File(getUserDirectoryPath());
    }

    public static String getUserDirectoryPath() {
        return System.getProperty("user.home");
    }

    private static void innerListFiles(Collection<File> collection, File file, IOFileFilter iOFileFilter, boolean z) {
        File[] fileArrListFiles = file.listFiles((FileFilter) iOFileFilter);
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    if (z) {
                        collection.add(file2);
                    }
                    innerListFiles(collection, file2, iOFileFilter, z);
                } else {
                    collection.add(file2);
                }
            }
        }
    }

    public static boolean isFileNewer(File file, long j) {
        if (file == null) {
            throw new IllegalArgumentException("No specified file");
        }
        return file.exists() && file.lastModified() > j;
    }

    public static boolean isFileNewer(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException("No specified reference file");
        }
        if (file2.exists()) {
            return isFileNewer(file, file2.lastModified());
        }
        throw new IllegalArgumentException("The reference file '" + file2 + "' doesn't exist");
    }

    public static boolean isFileNewer(File file, Date date) {
        if (date == null) {
            throw new IllegalArgumentException("No specified date");
        }
        return isFileNewer(file, date.getTime());
    }

    public static boolean isFileOlder(File file, long j) {
        if (file == null) {
            throw new IllegalArgumentException("No specified file");
        }
        return file.exists() && file.lastModified() < j;
    }

    public static boolean isFileOlder(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException("No specified reference file");
        }
        if (file2.exists()) {
            return isFileOlder(file, file2.lastModified());
        }
        throw new IllegalArgumentException("The reference file '" + file2 + "' doesn't exist");
    }

    public static boolean isFileOlder(File file, Date date) {
        if (date == null) {
            throw new IllegalArgumentException("No specified date");
        }
        return isFileOlder(file, date.getTime());
    }

    public static boolean isSymlink(File file) throws IOException {
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        return Files.isSymbolicLink(file.toPath());
    }

    public static Iterator<File> iterateFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return listFiles(file, iOFileFilter, iOFileFilter2).iterator();
    }

    public static Iterator<File> iterateFiles(File file, String[] strArr, boolean z) {
        return listFiles(file, strArr, z).iterator();
    }

    public static Iterator<File> iterateFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return listFilesAndDirs(file, iOFileFilter, iOFileFilter2).iterator();
    }

    public static LineIterator lineIterator(File file) throws IOException {
        return lineIterator(file, null);
    }

    public static LineIterator lineIterator(File file, String str) throws Exception {
        FileInputStream fileInputStreamOpenInputStream = null;
        try {
            fileInputStreamOpenInputStream = openInputStream(file);
            return IOUtils.lineIterator(fileInputStreamOpenInputStream, str);
        } catch (IOException | RuntimeException e) {
            if (fileInputStreamOpenInputStream != null) {
                try {
                    fileInputStreamOpenInputStream.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
            }
            throw e;
        }
    }

    public static Collection<File> listFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        validateListFilesParameters(file, iOFileFilter);
        IOFileFilter upEffectiveFileFilter = setUpEffectiveFileFilter(iOFileFilter);
        IOFileFilter upEffectiveDirFilter = setUpEffectiveDirFilter(iOFileFilter2);
        LinkedList linkedList = new LinkedList();
        innerListFiles(linkedList, file, FileFilterUtils.m7499or(upEffectiveFileFilter, upEffectiveDirFilter), false);
        return linkedList;
    }

    public static Collection<File> listFiles(File file, String[] strArr, boolean z) {
        return listFiles(file, strArr == null ? TrueFileFilter.INSTANCE : new SuffixFileFilter(toSuffixes(strArr)), z ? TrueFileFilter.INSTANCE : FalseFileFilter.INSTANCE);
    }

    public static Collection<File> listFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        validateListFilesParameters(file, iOFileFilter);
        IOFileFilter upEffectiveFileFilter = setUpEffectiveFileFilter(iOFileFilter);
        IOFileFilter upEffectiveDirFilter = setUpEffectiveDirFilter(iOFileFilter2);
        LinkedList linkedList = new LinkedList();
        if (file.isDirectory()) {
            linkedList.add(file);
        }
        innerListFiles(linkedList, file, FileFilterUtils.m7499or(upEffectiveFileFilter, upEffectiveDirFilter), true);
        return linkedList;
    }

    public static void moveDirectory(File file, File file2) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' is not a directory");
        }
        if (file2.exists()) {
            throw new FileExistsException("Destination '" + file2 + "' already exists");
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath() + File.separator)) {
            throw new IOException("Cannot move directory: " + file + " to a subdirectory of itself: " + file2);
        }
        copyDirectory(file, file2);
        deleteDirectory(file);
        if (file.exists()) {
            throw new IOException("Failed to delete original directory '" + file + "' after copy to '" + file2 + "'");
        }
    }

    public static void moveDirectoryToDirectory(File file, File file2, boolean z) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file2.exists() && z) {
            file2.mkdirs();
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z + "]");
        }
        if (!file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' is not a directory");
        }
        moveDirectory(file, new File(file2, file.getName()));
    }

    public static void moveFile(File file, File file2) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' is a directory");
        }
        if (file2.exists()) {
            throw new FileExistsException("Destination '" + file2 + "' already exists");
        }
        if (file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' is a directory");
        }
        if (file.renameTo(file2)) {
            return;
        }
        copyFile(file, file2);
        if (file.delete()) {
            return;
        }
        deleteQuietly(file2);
        throw new IOException("Failed to delete original file '" + file + "' after copy to '" + file2 + "'");
    }

    public static void moveFileToDirectory(File file, File file2, boolean z) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination directory must not be null");
        }
        if (!file2.exists() && z) {
            file2.mkdirs();
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z + "]");
        }
        if (!file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' is not a directory");
        }
        moveFile(file, new File(file2, file.getName()));
    }

    public static void moveToDirectory(File file, File file2, boolean z) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            moveDirectoryToDirectory(file, file2, z);
        } else {
            moveFileToDirectory(file, file2, z);
        }
    }

    public static FileInputStream openInputStream(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        }
        if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        }
        if (file.canRead()) {
            return new FileInputStream(file);
        }
        throw new IOException("File '" + file + "' cannot be read");
    }

    public static FileOutputStream openOutputStream(File file) throws IOException {
        return openOutputStream(file, false);
    }

    public static FileOutputStream openOutputStream(File file, boolean z) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Directory '" + parentFile + "' could not be created");
            }
        } else {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canWrite()) {
                throw new IOException("File '" + file + "' cannot be written to");
            }
        }
        return new FileOutputStream(file, z);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0024 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static byte[] readFileToByteArray(File file) throws Throwable {
        FileInputStream fileInputStreamOpenInputStream = openInputStream(file);
        Throwable th = null;
        try {
            long length = file.length();
            byte[] byteArray = length > 0 ? IOUtils.toByteArray(fileInputStreamOpenInputStream, length) : IOUtils.toByteArray(fileInputStreamOpenInputStream);
            if (fileInputStreamOpenInputStream != null) {
                fileInputStreamOpenInputStream.close();
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                th = th3;
                th = th2;
                if (fileInputStreamOpenInputStream != null) {
                    if (th != null) {
                        fileInputStreamOpenInputStream.close();
                    } else {
                        fileInputStreamOpenInputStream.close();
                    }
                }
                throw th;
            }
        }
    }

    @Deprecated
    public static String readFileToString(File file) throws IOException {
        return readFileToString(file, Charset.defaultCharset());
    }

    public static String readFileToString(File file, String str) throws IOException {
        return readFileToString(file, Charsets.toCharset(str));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Code duplicated, block: B:20:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String readFileToString(File file, Charset charset) throws Throwable {
        FileInputStream fileInputStreamOpenInputStream = openInputStream(file);
        Throwable th = null;
        try {
            String string = IOUtils.toString(fileInputStreamOpenInputStream, Charsets.toCharset(charset));
            if (fileInputStreamOpenInputStream != null) {
                fileInputStreamOpenInputStream.close();
            }
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                th = th3;
                th = th2;
                if (fileInputStreamOpenInputStream != null) {
                    if (th != null) {
                        fileInputStreamOpenInputStream.close();
                    } else {
                        fileInputStreamOpenInputStream.close();
                    }
                }
                throw th;
            }
        }
    }

    @Deprecated
    public static List<String> readLines(File file) throws IOException {
        return readLines(file, Charset.defaultCharset());
    }

    public static List<String> readLines(File file, String str) throws IOException {
        return readLines(file, Charsets.toCharset(str));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0024  */
    /* JADX WARN: Code duplicated, block: B:20:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static List<String> readLines(File file, Charset charset) throws Throwable {
        FileInputStream fileInputStreamOpenInputStream = openInputStream(file);
        Throwable th = null;
        try {
            List<String> lines = IOUtils.readLines(fileInputStreamOpenInputStream, Charsets.toCharset(charset));
            if (fileInputStreamOpenInputStream != null) {
                fileInputStreamOpenInputStream.close();
            }
            return lines;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                th = th3;
                th = th2;
                if (fileInputStreamOpenInputStream != null) {
                    if (th != null) {
                        fileInputStreamOpenInputStream.close();
                    } else {
                        fileInputStreamOpenInputStream.close();
                    }
                }
                throw th;
            }
        }
    }

    private static IOFileFilter setUpEffectiveDirFilter(IOFileFilter iOFileFilter) {
        return iOFileFilter == null ? FalseFileFilter.INSTANCE : FileFilterUtils.m7498and(iOFileFilter, DirectoryFileFilter.INSTANCE);
    }

    private static IOFileFilter setUpEffectiveFileFilter(IOFileFilter iOFileFilter) {
        return FileFilterUtils.m7498and(iOFileFilter, FileFilterUtils.notFileFilter(DirectoryFileFilter.INSTANCE));
    }

    public static long sizeOf(File file) {
        if (file.exists()) {
            return file.isDirectory() ? sizeOfDirectory0(file) : file.length();
        }
        throw new IllegalArgumentException(file + " does not exist");
    }

    private static long sizeOf0(File file) {
        return file.isDirectory() ? sizeOfDirectory0(file) : file.length();
    }

    public static BigInteger sizeOfAsBigInteger(File file) {
        if (file.exists()) {
            return file.isDirectory() ? sizeOfDirectoryBig0(file) : BigInteger.valueOf(file.length());
        }
        throw new IllegalArgumentException(file + " does not exist");
    }

    private static BigInteger sizeOfBig0(File file) {
        return file.isDirectory() ? sizeOfDirectoryBig0(file) : BigInteger.valueOf(file.length());
    }

    public static long sizeOfDirectory(File file) {
        checkDirectory(file);
        return sizeOfDirectory0(file);
    }

    private static long sizeOfDirectory0(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        long jSizeOf0 = 0;
        for (File file2 : fileArrListFiles) {
            try {
                if (!isSymlink(file2)) {
                    jSizeOf0 += sizeOf0(file2);
                    if (jSizeOf0 < 0) {
                        break;
                    }
                } else {
                    continue;
                }
            } catch (IOException e) {
            }
        }
        return jSizeOf0;
    }

    public static BigInteger sizeOfDirectoryAsBigInteger(File file) {
        checkDirectory(file);
        return sizeOfDirectoryBig0(file);
    }

    private static BigInteger sizeOfDirectoryBig0(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return BigInteger.ZERO;
        }
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (File file2 : fileArrListFiles) {
            try {
                if (!isSymlink(file2)) {
                    bigIntegerAdd = bigIntegerAdd.add(sizeOfBig0(file2));
                }
            } catch (IOException e) {
            }
        }
        return bigIntegerAdd;
    }

    public static File toFile(URL url) {
        if (url == null || !"file".equalsIgnoreCase(url.getProtocol())) {
            return null;
        }
        return new File(decodeUrl(url.getFile().replace('/', File.separatorChar)));
    }

    public static File[] toFiles(URL[] urlArr) {
        if (urlArr == null || urlArr.length == 0) {
            return EMPTY_FILE_ARRAY;
        }
        File[] fileArr = new File[urlArr.length];
        for (int i = 0; i < urlArr.length; i++) {
            URL url = urlArr[i];
            if (url != null) {
                if (!url.getProtocol().equals("file")) {
                    throw new IllegalArgumentException("URL could not be converted to a File: " + url);
                }
                fileArr[i] = toFile(url);
            }
        }
        return fileArr;
    }

    private static String[] toSuffixes(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = "." + strArr[i];
        }
        return strArr2;
    }

    public static URL[] toURLs(File[] fileArr) throws IOException {
        URL[] urlArr = new URL[fileArr.length];
        for (int i = 0; i < urlArr.length; i++) {
            urlArr[i] = fileArr[i].toURI().toURL();
        }
        return urlArr;
    }

    public static void touch(File file) throws IOException {
        if (!file.exists()) {
            openOutputStream(file).close();
        }
        if (!file.setLastModified(System.currentTimeMillis())) {
            throw new IOException("Unable to set the last modification time for " + file);
        }
    }

    private static void validateListFilesParameters(File file, IOFileFilter iOFileFilter) {
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("Parameter 'directory' is not a directory: " + file);
        }
        if (iOFileFilter == null) {
            throw new NullPointerException("Parameter 'fileFilter' is null");
        }
    }

    private static File[] verifiedListFiles(File file) throws IOException {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        return fileArrListFiles;
    }

    public static boolean waitFor(File file, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = i;
        boolean z = false;
        while (!file.exists()) {
            try {
                long jCurrentTimeMillis2 = ((1000 * j) + jCurrentTimeMillis) - System.currentTimeMillis();
                if (jCurrentTimeMillis2 < 0) {
                    if (!z) {
                        return false;
                    }
                    Thread.currentThread().interrupt();
                    return false;
                }
                try {
                    Thread.sleep(Math.min(100L, jCurrentTimeMillis2));
                } catch (InterruptedException e) {
                    z = true;
                } catch (Exception e2) {
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (!z) {
            return true;
        }
        Thread.currentThread().interrupt();
        return true;
    }

    @Deprecated
    public static void write(File file, CharSequence charSequence) throws IOException {
        write(file, charSequence, Charset.defaultCharset(), false);
    }

    public static void write(File file, CharSequence charSequence, String str) throws IOException {
        write(file, charSequence, str, false);
    }

    public static void write(File file, CharSequence charSequence, String str, boolean z) throws IOException {
        write(file, charSequence, Charsets.toCharset(str), z);
    }

    public static void write(File file, CharSequence charSequence, Charset charset) throws IOException {
        write(file, charSequence, charset, false);
    }

    public static void write(File file, CharSequence charSequence, Charset charset, boolean z) throws IOException {
        writeStringToFile(file, charSequence == null ? null : charSequence.toString(), charset, z);
    }

    @Deprecated
    public static void write(File file, CharSequence charSequence, boolean z) throws IOException {
        write(file, charSequence, Charset.defaultCharset(), z);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr) throws IOException {
        writeByteArrayToFile(file, bArr, false);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, int i, int i2) throws IOException {
        writeByteArrayToFile(file, bArr, i, i2, false);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, int i, int i2, boolean z) throws IOException {
        FileOutputStream fileOutputStreamOpenOutputStream = openOutputStream(file, z);
        Throwable th = null;
        try {
            fileOutputStreamOpenOutputStream.write(bArr, i, i2);
            if (fileOutputStreamOpenOutputStream != null) {
                fileOutputStreamOpenOutputStream.close();
            }
        } catch (Throwable th2) {
            if (fileOutputStreamOpenOutputStream != null) {
                if (0 != 0) {
                    try {
                        fileOutputStreamOpenOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    fileOutputStreamOpenOutputStream.close();
                }
            }
            throw th2;
        }
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, boolean z) throws IOException {
        writeByteArrayToFile(file, bArr, 0, bArr.length, z);
    }

    public static void writeLines(File file, String str, Collection<?> collection) throws IOException {
        writeLines(file, str, collection, null, false);
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2) throws IOException {
        writeLines(file, str, collection, str2, false);
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2, boolean z) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(openOutputStream(file, z));
        Throwable th = null;
        try {
            IOUtils.writeLines(collection, str2, bufferedOutputStream, str);
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
        } catch (Throwable th2) {
            if (bufferedOutputStream != null) {
                if (0 != 0) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    bufferedOutputStream.close();
                }
            }
            throw th2;
        }
    }

    public static void writeLines(File file, String str, Collection<?> collection, boolean z) throws IOException {
        writeLines(file, str, collection, null, z);
    }

    public static void writeLines(File file, Collection<?> collection) throws IOException {
        writeLines(file, null, collection, null, false);
    }

    public static void writeLines(File file, Collection<?> collection, String str) throws IOException {
        writeLines(file, null, collection, str, false);
    }

    public static void writeLines(File file, Collection<?> collection, String str, boolean z) throws IOException {
        writeLines(file, null, collection, str, z);
    }

    public static void writeLines(File file, Collection<?> collection, boolean z) throws IOException {
        writeLines(file, null, collection, null, z);
    }

    @Deprecated
    public static void writeStringToFile(File file, String str) throws IOException {
        writeStringToFile(file, str, Charset.defaultCharset(), false);
    }

    public static void writeStringToFile(File file, String str, String str2) throws IOException {
        writeStringToFile(file, str, str2, false);
    }

    public static void writeStringToFile(File file, String str, String str2, boolean z) throws IOException {
        writeStringToFile(file, str, Charsets.toCharset(str2), z);
    }

    public static void writeStringToFile(File file, String str, Charset charset) throws IOException {
        writeStringToFile(file, str, charset, false);
    }

    public static void writeStringToFile(File file, String str, Charset charset, boolean z) throws IOException {
        FileOutputStream fileOutputStreamOpenOutputStream = openOutputStream(file, z);
        Throwable th = null;
        try {
            IOUtils.write(str, (OutputStream) fileOutputStreamOpenOutputStream, charset);
            if (fileOutputStreamOpenOutputStream != null) {
                fileOutputStreamOpenOutputStream.close();
            }
        } catch (Throwable th2) {
            if (fileOutputStreamOpenOutputStream != null) {
                if (0 != 0) {
                    try {
                        fileOutputStreamOpenOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    fileOutputStreamOpenOutputStream.close();
                }
            }
            throw th2;
        }
    }

    @Deprecated
    public static void writeStringToFile(File file, String str, boolean z) throws IOException {
        writeStringToFile(file, str, Charset.defaultCharset(), z);
    }
}
