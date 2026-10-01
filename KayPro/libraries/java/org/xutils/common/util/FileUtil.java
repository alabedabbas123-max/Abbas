package org.xutils.common.util;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.baidu.mobstat.Config;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.xutils.x;

public class FileUtil {
    private FileUtil() {
    }

    public static File getCacheDir(String str) {
        File externalCacheDir;
        File file = (!isDiskAvailable() || (externalCacheDir = ClassX.m9074app().getExternalCacheDir()) == null) ? null : new File(externalCacheDir, str);
        if (file == null) {
            file = new File(ClassX.m9074app().getCacheDir(), str);
        }
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static boolean isDiskAvailable() {
        return getDiskAvailableSize() > Config.FULL_TRACE_LOG_LIMIT;
    }

    public static long getDiskAvailableSize() {
        long blockSize;
        long availableBlocks;
        if (!existsSdcard().booleanValue()) {
            return 0L;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 18) {
            blockSize = statFs.getBlockSizeLong();
            availableBlocks = statFs.getAvailableBlocksLong();
        } else {
            blockSize = statFs.getBlockSize();
            availableBlocks = statFs.getAvailableBlocks();
        }
        return availableBlocks * blockSize;
    }

    public static Boolean existsSdcard() {
        return Boolean.valueOf(Environment.getExternalStorageState().equals("mounted"));
    }

    public static long getFileOrDirSize(File file) {
        long fileOrDirSize = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        for (File file2 : fileArrListFiles) {
            fileOrDirSize += getFileOrDirSize(file2);
        }
        return fileOrDirSize;
    }

    public static boolean copy(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        File file2 = new File(str2);
        IOUtil.deleteFileOrDir(file2);
        File parentFile = file2.getParentFile();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            return false;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    try {
                        IOUtil.copy(fileInputStream, fileOutputStream);
                        IOUtil.closeQuietly(fileInputStream);
                        IOUtil.closeQuietly(fileOutputStream);
                        return true;
                    } catch (Throwable th) {
                        th = th;
                        LogUtil.m9044d(th.getMessage(), th);
                        IOUtil.closeQuietly(fileInputStream);
                        IOUtil.closeQuietly(fileOutputStream);
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    IOUtil.closeQuietly(fileInputStream);
                    IOUtil.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                IOUtil.closeQuietly(fileInputStream);
                IOUtil.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            fileInputStream = null;
        }
    }

    public static boolean deleteFileOrDir(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                deleteFileOrDir(file2);
            }
        }
        return file.delete();
    }
}
