package com.jcraft.jsch.jce;

public class SHA1 implements com.jcraft.jsch.HASH {
    java.security.MessageDigest j6;

    public SHA1() {
    }

    @Override
    public void DW() {
        this.j6 = java.security.MessageDigest.getInstance("SHA-1");     // Catch: java.lang.Exception -> L4
        return;
    L4:
        e = move-exception;
        java.lang.System.err.println(e);
    }

    @Override
    public byte[] FH() {
        return this.j6.digest();
    }

    @Override
    public int j6() {
        return 20;
    }

    @Override
    public void update(byte[] r2, int r3, int r4) {
        this.j6.update(r2, r3, r4);
    }
}
