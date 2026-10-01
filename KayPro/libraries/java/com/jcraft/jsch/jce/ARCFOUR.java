package com.jcraft.jsch.jce;

public class ARCFOUR implements com.jcraft.jsch.Cipher {
    private javax.crypto.Cipher j6;

    public ARCFOUR() {
    }

    @Override
    public boolean DW() {
        return false;
    }

    @Override
    public int FH() {
        return 8;
    }

    @Override
    public int j6() {
        return 16;
    }

    @Override
    public void j6(int r3, byte[] r4, byte[] r5) {
        if (r4.length <= 16) goto L20;
        byte[] r6 = new byte[16];
        java.lang.System.arraycopy(r4, 0, r6, 0, r6.length);
        r4 = r6;
    L20:
        this.j6 = javax.crypto.Cipher.getInstance("RC4");     // Catch: java.lang.Exception -> L17
        javax.crypto.spec.SecretKeySpec r7 = new javax.crypto.spec.SecretKeySpec(r4, "RC4");     // Catch: java.lang.Exception -> L17
        monitor-enter(javax.crypto.Cipher.class);     // Catch: java.lang.Exception -> L17
        javax.crypto.Cipher r0 = this.j6;     // Catch: java.lang.Throwable -> L14
        if (r3 != 0) goto L10;
        int r8 = 1;
    L11:
        r0.init(r8, r7);     // Catch: java.lang.Throwable -> L14
        monitor-exit(javax.crypto.Cipher.class);     // Catch: java.lang.Throwable -> L14
        return;
    L10:
        r8 = 2;
    L14:
        th = move-exception;
        throw th;     // Catch: java.lang.Exception -> L17
    L17:
        e = move-exception;
        this.j6 = null;
        throw e;
    }

    @Override
    public void j6(byte[] r7, int r8, int r9, byte[] r10, int r11) {
        this.j6.update(r7, r8, r9, r10, r11);
    }
}
