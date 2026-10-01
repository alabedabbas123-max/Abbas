package com.baidu.android.common.security;

import com.baidu.android.common.util.DeviceId;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class MD5Util {
    private MD5Util() {
    }

    public static String toMd5(byte[] bArr, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(bArr);
            return toHexString(messageDigest.digest(), "", z);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toHexString(byte[] bArr, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (z) {
                hexString = hexString.toUpperCase();
            }
            if (hexString.length() == 1) {
                sb.append(DeviceId.CUIDInfo.I_EMPTY);
            }
            sb.append(hexString).append(str);
        }
        return sb.toString();
    }
}
