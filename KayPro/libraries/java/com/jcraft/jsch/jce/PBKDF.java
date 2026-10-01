package com.jcraft.jsch.jce;

public class PBKDF implements com.jcraft.jsch.PBKDF {
    public PBKDF() {
    }

    @Override
    public byte[] j6(byte[] r4, byte[] r5, int r6, int r7) {
        char[] r0 = new char[r4.length];
        int r1 = 0;
    L4:
        if (r1 >= r4.length) goto L10;
        r0[r1] = (char) (r4[r1] & 255);
        r1 = r1 + 1;
        goto L4
    L10:
        javax.crypto.spec.PBEKeySpec r8 = new javax.crypto.spec.PBEKeySpec(r0, r5, r6, r7 * 8);     // Catch: java.lang.Throwable -> L7
        return javax.crypto.SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(r8).getEncoded();
    L7:
        return null;
    }
}
