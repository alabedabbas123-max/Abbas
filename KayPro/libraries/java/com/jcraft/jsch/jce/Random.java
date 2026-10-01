package com.jcraft.jsch.jce;

public class Random implements com.jcraft.jsch.Random {
    private java.security.SecureRandom DW;
    private byte[] j6;

    public Random() {
        this.j6 = new byte[16];
        this.DW = null;
        this.DW = new java.security.SecureRandom();
    }

    @Override
    public void j6(byte[] r3, int r4, int r5) {
        if (r5 <= this.j6.length) goto L5;
        this.j6 = new byte[r5];
    L5:
        this.DW.nextBytes(this.j6);
        java.lang.System.arraycopy(this.j6, 0, r3, r4, r5);
    }
}
