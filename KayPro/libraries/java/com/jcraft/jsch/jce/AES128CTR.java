package com.jcraft.jsch.jce;

public class AES128CTR implements com.jcraft.jsch.Cipher {
    private javax.crypto.Cipher j6;

    public AES128CTR() {
    }

    @Override
    public boolean DW() {
        return false;
    }

    @Override
    public int FH() {
        return 16;
    }

    @Override
    public int j6() {
        return 16;
    }

    @Override
    public void j6(int r6, byte[] r7, byte[] r8) {
        if (r8.length <= 16) goto L6;
        byte[] r1 = new byte[16];
        java.lang.System.arraycopy(r8, 0, r1, 0, r1.length);
        r8 = r1;
    L6:
        if (r7.length <= 16) goto L23;
        byte[] r2 = new byte[16];
        java.lang.System.arraycopy(r7, 0, r2, 0, r2.length);
        r7 = r2;
    L23:
        javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec(r7, "AES");     // Catch: java.lang.Exception -> L20
        this.j6 = javax.crypto.Cipher.getInstance("AES/CTR/NoPadding");     // Catch: java.lang.Exception -> L20
        monitor-enter(javax.crypto.Cipher.class);     // Catch: java.lang.Exception -> L20
        javax.crypto.Cipher r0 = this.j6;     // Catch: java.lang.Throwable -> L17
        if (r6 != 0) goto L13;
        int r9 = 1;
    L14:
        r0.init(r9, r3, new javax.crypto.spec.IvParameterSpec(r8));     // Catch: java.lang.Throwable -> L17
        monitor-exit(javax.crypto.Cipher.class);     // Catch: java.lang.Throwable -> L17
        return;
    L13:
        r9 = 2;
    L17:
        th = move-exception;
        throw th;     // Catch: java.lang.Exception -> L20
    L20:
        e = move-exception;
        this.j6 = null;
        throw e;
    }

    @Override
    public void j6(byte[] r7, int r8, int r9, byte[] r10, int r11) {
        this.j6.update(r7, r8, r9, r10, r11);
    }
}
