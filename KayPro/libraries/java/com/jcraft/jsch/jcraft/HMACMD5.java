package com.jcraft.jsch.jcraft;

public class HMACMD5 extends com.jcraft.jsch.jcraft.HMAC implements com.jcraft.jsch.MAC {
    public HMACMD5() {
        java.security.MessageDigest r0 = java.security.MessageDigest.getInstance("MD5");     // Catch: java.lang.Exception -> L5
    L7:
        j6(r0);
        return;
    L5:
        e = move-exception;
        java.lang.System.err.println(e);
        r0 = null;
        goto L7
    }

    @Override
    public int j6() {
        return super.j6();
    }

    @Override
    public void j6(byte[] r1) {
        super.j6(r1);
    }

    @Override
    public void j6(byte[] r1, int r2) {
        super.j6(r1, r2);
    }

    @Override
    public void update(int r1) {
        super.update(r1);
    }

    @Override
    public void update(byte[] r1, int r2, int r3) {
        super.update(r1, r2, r3);
    }
}
