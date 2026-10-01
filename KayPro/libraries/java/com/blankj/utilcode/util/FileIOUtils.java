package com.blankj.utilcode.util;

import android.util.Log;
import com.sun.tools.javac.util.Position;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

public final class FileIOUtils {
    private static int sBufferSize = 524288;

    public interface OnProgressUpdateListener {
        void onProgressUpdate(double d);
    }

    private FileIOUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] readFile2BytesByChannel(File file) throws Throwable {
        FileChannel channel;
        FileChannel fileChannel = 0;
        try {
            if (!UtilsBridge.isFileExists(file)) {
                return null;
            }
            try {
                channel = new RandomAccessFile(file, "r").getChannel();
                try {
                    if (channel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        byte[] bArr = new byte[0];
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        return bArr;
                    }
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) channel.size());
                    while (channel.read(byteBufferAllocate) > 0) {
                    }
                    byte[] bArrArray = byteBufferAllocate.array();
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    return bArrArray;
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException e5) {
                e = e5;
                channel = null;
            } catch (Throwable th) {
                th = th;
                if (fileChannel != 0) {
                    try {
                        fileChannel.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannel = file;
        }
    }

    public static byte[] readFile2BytesByChannel(String str) {
        return readFile2BytesByChannel(UtilsBridge.getFileByPath(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] readFile2BytesByMap(File file) throws Throwable {
        FileChannel channel;
        FileChannel fileChannel = 0;
        try {
            if (!UtilsBridge.isFileExists(file)) {
                return null;
            }
            try {
                channel = new RandomAccessFile(file, "r").getChannel();
                try {
                    if (channel == null) {
                        Log.e("FileIOUtils", "fc is null.");
                        byte[] bArr = new byte[0];
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        return bArr;
                    }
                    int size = (int) channel.size();
                    byte[] bArr2 = new byte[size];
                    channel.map(FileChannel.MapMode.READ_ONLY, 0L, size).load().get(bArr2, 0, size);
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    return bArr2;
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException e5) {
                e = e5;
                channel = null;
            } catch (Throwable th) {
                th = th;
                if (fileChannel != 0) {
                    try {
                        fileChannel.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannel = file;
        }
    }

    public static byte[] readFile2BytesByMap(String str) {
        return readFile2BytesByMap(UtilsBridge.getFileByPath(str));
    }

    public static byte[] readFile2BytesByStream(File file) {
        return readFile2BytesByStream(file, (OnProgressUpdateListener) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r10v5 */
    public static byte[] readFile2BytesByStream(File file, OnProgressUpdateListener onProgressUpdateListener) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ?? IsFileExists = UtilsBridge.isFileExists(file);
        if (IsFileExists == 0) {
            return null;
        }
        try {
            try {
                IsFileExists = new BufferedInputStream(new FileInputStream((File) file), sBufferSize);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[sBufferSize];
                        if (onProgressUpdateListener != null) {
                            double dAvailable = IsFileExists.available();
                            onProgressUpdateListener.onProgressUpdate(0.0d);
                            int i = 0;
                            while (true) {
                                int i2 = IsFileExists.read(bArr, 0, sBufferSize);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i2);
                                i += i2;
                                double d = i;
                                Double.isNaN(d);
                                Double.isNaN(dAvailable);
                                onProgressUpdateListener.onProgressUpdate(d / dAvailable);
                            }
                        } else {
                            while (true) {
                                int i3 = IsFileExists.read(bArr, 0, sBufferSize);
                                if (i3 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i3);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        try {
                            IsFileExists.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        return byteArray;
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                        try {
                            IsFileExists.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (IOException e6) {
                    e = e6;
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    file = 0;
                    try {
                        IsFileExists.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    if (file == 0) {
                        throw th;
                    }
                    try {
                        file.close();
                        throw th;
                    } catch (IOException e8) {
                        e8.printStackTrace();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e9) {
            e9.printStackTrace();
            return null;
        }
    }

    public static byte[] readFile2BytesByStream(String str) {
        return readFile2BytesByStream(UtilsBridge.getFileByPath(str), (OnProgressUpdateListener) null);
    }

    public static byte[] readFile2BytesByStream(String str, OnProgressUpdateListener onProgressUpdateListener) {
        return readFile2BytesByStream(UtilsBridge.getFileByPath(str), onProgressUpdateListener);
    }

    public static List<String> readFile2List(File file) {
        return readFile2List(file, 0, Position.MAXPOS, (String) null);
    }

    public static List<String> readFile2List(File file, int i, int i2) {
        return readFile2List(file, i, i2, (String) null);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static List<String> readFile2List(File file, int i, int i2, String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (!UtilsBridge.isFileExists(file) || i > i2) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int i3 = 1;
            bufferedReader = UtilsBridge.isSpace(str) ? new BufferedReader(new InputStreamReader(new FileInputStream(file))) : new BufferedReader(new InputStreamReader(new FileInputStream(file), str));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null || i3 > i2) {
                            break;
                            break;
                        }
                        if (i <= i3 && i3 <= i2) {
                            arrayList.add(line);
                        }
                        i3++;
                    } catch (IOException e) {
                        e = e;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            try {
                bufferedReader.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            return arrayList;
        } catch (IOException e5) {
            e = e5;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            throw th;
        }
    }

    public static List<String> readFile2List(File file, String str) {
        return readFile2List(file, 0, Position.MAXPOS, str);
    }

    public static List<String> readFile2List(String str) {
        return readFile2List(UtilsBridge.getFileByPath(str), (String) null);
    }

    public static List<String> readFile2List(String str, int i, int i2) {
        return readFile2List(UtilsBridge.getFileByPath(str), i, i2, (String) null);
    }

    public static List<String> readFile2List(String str, int i, int i2, String str2) {
        return readFile2List(UtilsBridge.getFileByPath(str), i, i2, str2);
    }

    public static List<String> readFile2List(String str, String str2) {
        return readFile2List(UtilsBridge.getFileByPath(str), str2);
    }

    public static String readFile2String(File file) {
        return readFile2String(file, (String) null);
    }

    public static String readFile2String(File file, String str) {
        byte[] file2BytesByStream = readFile2BytesByStream(file);
        if (file2BytesByStream == null) {
            return null;
        }
        if (UtilsBridge.isSpace(str)) {
            return new String(file2BytesByStream);
        }
        try {
            return new String(file2BytesByStream, str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String readFile2String(String str) {
        return readFile2String(UtilsBridge.getFileByPath(str), (String) null);
    }

    public static String readFile2String(String str, String str2) {
        return readFile2String(UtilsBridge.getFileByPath(str), str2);
    }

    public static void setBufferSize(int i) {
        sBufferSize = i;
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z) {
        return writeFileFromBytesByChannel(file, bArr, false, z);
    }

    public static boolean writeFileFromBytesByChannel(File file, byte[] bArr, boolean z, boolean z2) {
        if (bArr == null) {
            Log.e("FileIOUtils", "bytes is null.");
            return false;
        }
        if (!UtilsBridge.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        FileChannel fileChannel = null;
        try {
            try {
                FileChannel channel = new FileOutputStream(file, z).getChannel();
                if (channel == null) {
                    Log.e("FileIOUtils", "fc is null.");
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return false;
                }
                channel.position(channel.size());
                channel.write(ByteBuffer.wrap(bArr));
                if (z2) {
                    channel.force(true);
                }
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return true;
            } catch (IOException e3) {
                e3.printStackTrace();
                if (0 != 0) {
                    try {
                        fileChannel.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    fileChannel.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z) {
        return writeFileFromBytesByChannel(UtilsBridge.getFileByPath(str), bArr, false, z);
    }

    public static boolean writeFileFromBytesByChannel(String str, byte[] bArr, boolean z, boolean z2) {
        return writeFileFromBytesByChannel(UtilsBridge.getFileByPath(str), bArr, z, z2);
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z) {
        return writeFileFromBytesByMap(file, bArr, false, z);
    }

    public static boolean writeFileFromBytesByMap(File file, byte[] bArr, boolean z, boolean z2) {
        if (bArr == null || !UtilsBridge.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        FileChannel fileChannel = null;
        try {
            try {
                FileChannel channel = new FileOutputStream(file, z).getChannel();
                if (channel == null) {
                    Log.e("FileIOUtils", "fc is null.");
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return false;
                }
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, channel.size(), bArr.length);
                map.put(bArr);
                if (z2) {
                    map.force();
                }
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                return true;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        fileChannel.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
            if (0 != 0) {
                try {
                    fileChannel.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            return false;
        }
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z) {
        return writeFileFromBytesByMap(str, bArr, false, z);
    }

    public static boolean writeFileFromBytesByMap(String str, byte[] bArr, boolean z, boolean z2) {
        return writeFileFromBytesByMap(UtilsBridge.getFileByPath(str), bArr, z, z2);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr) {
        return writeFileFromBytesByStream(file, bArr, false, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromBytesByStream(file, bArr, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, boolean z) {
        return writeFileFromBytesByStream(file, bArr, z, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromBytesByStream(File file, byte[] bArr, boolean z, OnProgressUpdateListener onProgressUpdateListener) {
        if (bArr == null) {
            return false;
        }
        return writeFileFromIS(file, new ByteArrayInputStream(bArr), z, onProgressUpdateListener);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr) {
        return writeFileFromBytesByStream(UtilsBridge.getFileByPath(str), bArr, false, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromBytesByStream(UtilsBridge.getFileByPath(str), bArr, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, boolean z) {
        return writeFileFromBytesByStream(UtilsBridge.getFileByPath(str), bArr, z, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromBytesByStream(String str, byte[] bArr, boolean z, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromBytesByStream(UtilsBridge.getFileByPath(str), bArr, z, onProgressUpdateListener);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream) {
        return writeFileFromIS(file, inputStream, false, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromIS(file, inputStream, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, boolean z) {
        return writeFileFromIS(file, inputStream, z, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(File file, InputStream inputStream, boolean z, OnProgressUpdateListener onProgressUpdateListener) throws Throwable {
        if (inputStream == null || !UtilsBridge.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file, z), sBufferSize);
            try {
                if (onProgressUpdateListener != null) {
                    double dAvailable = inputStream.available();
                    onProgressUpdateListener.onProgressUpdate(0.0d);
                    byte[] bArr = new byte[sBufferSize];
                    int i = 0;
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        bufferedOutputStream2.write(bArr, 0, i2);
                        i += i2;
                        double d = i;
                        Double.isNaN(d);
                        Double.isNaN(dAvailable);
                        onProgressUpdateListener.onProgressUpdate(d / dAvailable);
                    }
                } else {
                    byte[] bArr2 = new byte[sBufferSize];
                    while (true) {
                        int i3 = inputStream.read(bArr2);
                        if (i3 == -1) {
                            break;
                        }
                        bufferedOutputStream2.write(bArr2, 0, i3);
                    }
                }
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return true;
            } catch (IOException e3) {
                e = e3;
                bufferedOutputStream = bufferedOutputStream2;
                e.printStackTrace();
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                if (bufferedOutputStream != null) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                if (bufferedOutputStream == null) {
                    throw th;
                }
                try {
                    bufferedOutputStream.close();
                    throw th;
                } catch (IOException e7) {
                    e7.printStackTrace();
                    throw th;
                }
            }
        } catch (IOException e8) {
            e = e8;
        }
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream) {
        return writeFileFromIS(UtilsBridge.getFileByPath(str), inputStream, false, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromIS(UtilsBridge.getFileByPath(str), inputStream, false, onProgressUpdateListener);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, boolean z) {
        return writeFileFromIS(UtilsBridge.getFileByPath(str), inputStream, z, (OnProgressUpdateListener) null);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream, boolean z, OnProgressUpdateListener onProgressUpdateListener) {
        return writeFileFromIS(UtilsBridge.getFileByPath(str), inputStream, z, onProgressUpdateListener);
    }

    public static boolean writeFileFromString(File file, String str) {
        return writeFileFromString(file, str, false);
    }

    public static boolean writeFileFromString(File file, String str, boolean z) throws Throwable {
        if (file == null || str == null) {
            return false;
        }
        if (!UtilsBridge.createOrExistsFile(file)) {
            Log.e("FileIOUtils", "create file <" + file + "> failed.");
            return false;
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, z));
                try {
                    bufferedWriter2.write(str);
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    e.printStackTrace();
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean writeFileFromString(String str, String str2) {
        return writeFileFromString(UtilsBridge.getFileByPath(str), str2, false);
    }

    public static boolean writeFileFromString(String str, String str2, boolean z) {
        return writeFileFromString(UtilsBridge.getFileByPath(str), str2, z);
    }
}
