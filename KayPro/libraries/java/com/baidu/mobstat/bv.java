package com.baidu.mobstat;

import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class bv {
    public static String m6533a(byte[] bArr) throws Exception {
        try {
            return bo.m6465b(m6536a(false, bq.m6512a(), bArr));
        } catch (Exception e) {
            return "";
        }
    }

    public static byte[] m6536a(boolean z, byte[] bArr, byte[] bArr2) throws Exception {
        RSAKey rSAKeyM6534a = m6534a(z, bArr);
        return m6535a(1, (Key) rSAKeyM6534a, ((rSAKeyM6534a.getModulus().bitLength() + 1) / 8) - 11, bArr2);
    }

    public static byte[] m6537b(boolean z, byte[] bArr, byte[] bArr2) throws Exception {
        RSAKey rSAKeyM6534a = m6534a(z, bArr);
        return m6535a(2, (Key) rSAKeyM6534a, (rSAKeyM6534a.getModulus().bitLength() + 1) / 8, bArr2);
    }

    private static RSAKey m6534a(boolean z, byte[] bArr) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return z ? (RSAPrivateKey) keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr)) : (RSAPublicKey) keyFactory.generatePublic(new X509EncodedKeySpec(bArr));
    }

    private static byte[] m6535a(int i, Key key, int i2, byte[] bArr) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(i, key);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = 0;
        while (i3 < bArr.length) {
            int length = bArr.length - i3;
            if (length > i2) {
                length = i2;
            }
            byteArrayOutputStream.write(cipher.doFinal(bArr, i3, length));
            i3 += i2;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
