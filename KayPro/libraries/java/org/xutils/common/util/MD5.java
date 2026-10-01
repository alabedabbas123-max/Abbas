package org.xutils.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class MD5 {
    private static final char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private MD5() {
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(hexDigits[(b >> 4) & 15]);
            sb.append(hexDigits[b & 15]);
        }
        return sb.toString();
    }

    public static String m9057md5(File file) throws Throwable {
        Throwable th;
        FileChannel fileChannel;
        FileInputStream fileInputStream;
        NoSuchAlgorithmException e;
        FileInputStream fileInputStream2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                try {
                    messageDigest.update(channel.map(FileChannel.MapMode.READ_ONLY, 0L, file.length()));
                    byte[] bArrDigest = messageDigest.digest();
                    IOUtil.closeQuietly(fileInputStream);
                    IOUtil.closeQuietly(channel);
                    return toHexString(bArrDigest);
                } catch (NoSuchAlgorithmException e2) {
                    e = e2;
                    fileChannel = channel;
                    fileInputStream2 = fileInputStream;
                    try {
                        throw new RuntimeException(e);
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        IOUtil.closeQuietly(fileInputStream);
                        IOUtil.closeQuietly(fileChannel);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileChannel = channel;
                    IOUtil.closeQuietly(fileInputStream);
                    IOUtil.closeQuietly(fileChannel);
                    throw th;
                }
            } catch (NoSuchAlgorithmException e3) {
                e = e3;
                fileChannel = null;
                fileInputStream2 = fileInputStream;
            } catch (Throwable th4) {
                th = th4;
                fileChannel = null;
            }
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            fileChannel = null;
            fileInputStream2 = null;
        } catch (Throwable th5) {
            th = th5;
            fileChannel = null;
            fileInputStream = null;
        }
    }

    public static String m9058md5(String str) {
        try {
            return toHexString(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
