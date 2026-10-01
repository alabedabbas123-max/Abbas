package com.github.megatronking.stringfog.plugin.utils;

import java.security.MessageDigest;

public class MD5 {
    MD5() {
    }

    public static String getMessageDigest(byte[] bArr) {
        int i = 0;
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i2 = 0;
            while (true) {
                int i3 = i;
                if (i2 >= bArrDigest.length) {
                    return new String(cArr2);
                }
                byte b = bArrDigest[i2];
                int i4 = i3 + 1;
                cArr2[i3] = cArr[(b >>> 4) & 15];
                i = i4 + 1;
                cArr2[i4] = cArr[b & 15];
                i2++;
            }
        } catch (Exception e) {
            return (String) null;
        }
    }
}
