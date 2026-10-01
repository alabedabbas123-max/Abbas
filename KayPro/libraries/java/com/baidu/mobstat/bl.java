package com.baidu.mobstat;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class bl {

    public static class b {
        public static byte[] m6441a(int i, byte[] bArr) throws Exception {
            int i2 = i - 1;
            if (i2 < 0 || bq.f4367a.length <= i2) {
                return new byte[0];
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bq.f4367a[i2].getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            return cipher.doFinal(bArr);
        }

        public static byte[] m6442b(int i, byte[] bArr) throws Exception {
            int i2 = i - 1;
            if (i2 < 0 || bq.f4367a.length <= i2) {
                return new byte[0];
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bq.f4367a[i2].getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(2, secretKeySpec);
            return cipher.doFinal(bArr);
        }

        public static String m6443c(int i, byte[] bArr) {
            try {
                return bo.m6465b(m6441a(i, bArr));
            } catch (Exception e) {
                return "";
            }
        }

        public static String m6444d(int i, byte[] bArr) {
            String strM6443c = m6443c(i, bArr);
            return TextUtils.isEmpty(strM6443c) ? "" : strM6443c + "|" + i;
        }
    }

    public static class a {
        @SuppressLint({"TrulyRandom"})
        public static byte[] m6438a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr3);
        }

        public static byte[] m6437a() throws Exception {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, new SecureRandom());
            return keyGenerator.generateKey().getEncoded();
        }

        public static byte[] m6440b() {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            return bArr;
        }

        public static String m6436a(byte[] bArr) {
            try {
                return m6439b(m6437a(), m6440b(), bArr);
            } catch (Exception e) {
                return "";
            }
        }

        public static String m6439b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            try {
                return bo.m6465b(m6438a(bArr, bArr2, br.m6513a(bArr3))) + "|" + bv.m6533a(bArr) + "|" + bv.m6533a(bArr2);
            } catch (Exception e) {
                return "";
            }
        }
    }
}
