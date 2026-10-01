package com.tencent.mm.util;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.commons.io.FileUtils;

public class Md5Util {
    public static String bytesToHexString(byte[] bArr) {
        if (bArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String getMD5Str(File file) {
        if (!file.isFile()) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(FileUtils.readFileToByteArray(file));
            return bytesToHexString(messageDigest.digest());
        } catch (Exception e) {
            return "";
        }
    }

    public static String getMD5Str(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return bytesToHexString(messageDigest.digest());
        } catch (Exception e) {
            return "";
        }
    }
}
