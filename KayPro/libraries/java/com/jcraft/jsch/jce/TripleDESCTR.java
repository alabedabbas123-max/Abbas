package com.jcraft.jsch.jce;

public class TripleDESCTR implements com.jcraft.jsch.Cipher {
    private javax.crypto.Cipher j6;

    public TripleDESCTR() {
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
        return 24;
    }

    @Override
    public void j6(int r5, byte[] r6, byte[] r7) {
        if (r7.length <= 8) goto L6;
        byte[] r1 = new byte[8];
        java.lang.System.arraycopy(r7, 0, r1, 0, r1.length);
        r7 = r1;
    L6:
        if (r6.length <= 24) goto L25;
        byte[] r2 = new byte[24];
        java.lang.System.arraycopy(r6, 0, r2, 0, r2.length);
        r6 = r2;
    L25:
        this.j6 = javax.crypto.Cipher.getInstance("DESede/CTR/NoPadding");     // Catch: java.lang.Exception -> L20
        javax.crypto.SecretKey r8 = javax.crypto.SecretKeyFactory.getInstance("DESede").generateSecret(new javax.crypto.spec.DESedeKeySpec(r6));     // Catch: java.lang.Exception -> L20
        monitor-enter(javax.crypto.Cipher.class);     // Catch: java.lang.Exception -> L20
        javax.crypto.Cipher r3 = this.j6;     // Catch: java.lang.Throwable -> L17
        if (r5 != 0) goto L13;
        int r9 = 1;
    L14:
        r3.init(r9, r8, new javax.crypto.spec.IvParameterSpec(r7));     // Catch: java.lang.Throwable -> L17
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
