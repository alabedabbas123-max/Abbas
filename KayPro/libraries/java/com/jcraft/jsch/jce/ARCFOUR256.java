package com.jcraft.jsch.jce;

public class ARCFOUR256 implements com.jcraft.jsch.Cipher {
    private javax.crypto.Cipher j6;

    public ARCFOUR256() {
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
        return 32;
    }

    @Override
    public void j6(int r10, byte[] r11, byte[] r12) {
        int r1 = 0;
        if (r11.length <= 32) goto L26;
        byte[] r13 = new byte[32];
        java.lang.System.arraycopy(r11, 0, r13, 0, r13.length);
        r11 = r13;
    L26:
        this.j6 = javax.crypto.Cipher.getInstance("RC4");     // Catch: java.lang.Exception -> L22
        javax.crypto.spec.SecretKeySpec r14 = new javax.crypto.spec.SecretKeySpec(r11, "RC4");     // Catch: java.lang.Exception -> L22
        monitor-enter(javax.crypto.Cipher.class);     // Catch: java.lang.Exception -> L22
        javax.crypto.Cipher r0 = this.j6;     // Catch: java.lang.Throwable -> L19
        if (r10 != 0) goto L10;
        int r15 = 1;
    L11:
        r0.init(r15, r14);     // Catch: java.lang.Throwable -> L19
        monitor-exit(javax.crypto.Cipher.class);     // Catch: java.lang.Throwable -> L19
        byte[] r16 = new byte[1];     // Catch: java.lang.Exception -> L22
    L15:
        if (r1 >= 1536) goto L16;
        this.j6.update(r16, 0, 1, r16, 0);     // Catch: java.lang.Exception -> L22
        r1 = r1 + 1;
        goto L15
    L16:
        return;
    L10:
        r15 = 2;
    L19:
        th = move-exception;
        throw th;     // Catch: java.lang.Exception -> L22
    L22:
        e = move-exception;
        this.j6 = null;
        throw e;
    }

    @Override
    public void j6(byte[] r7, int r8, int r9, byte[] r10, int r11) {
        this.j6.update(r7, r8, r9, r10, r11);
    }
}
