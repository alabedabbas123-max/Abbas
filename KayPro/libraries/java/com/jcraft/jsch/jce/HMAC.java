package com.jcraft.jsch.jce;

abstract class HMAC implements com.jcraft.jsch.MAC {
    protected int DW;
    protected java.lang.String FH;
    private javax.crypto.Mac Hw;
    protected java.lang.String j6;
    private final byte[] v5;

    HMAC() {
        this.v5 = new byte[4];
    }

    @Override
    public int j6() {
        return this.DW;
    }

    @Override
    public void j6(byte[] r4) {
        int r0 = r4.length;
        int r1 = this.DW;
        if (r0 <= r1) goto L5;
        byte[] r2 = new byte[r1];
        java.lang.System.arraycopy(r4, 0, r2, 0, r1);
        r4 = r2;
    L5:
        javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec(r4, this.FH);
        this.Hw = javax.crypto.Mac.getInstance(this.FH);
        this.Hw.init(r3);
    }

    @Override
    public void j6(byte[] r2, int r3) {
        this.Hw.doFinal(r2, r3);     // Catch: javax.crypto.ShortBufferException -> L4
        return;
    L4:
        e = move-exception;
        java.lang.System.err.println(e);
    }

    @Override
    public void update(int r5) {
        byte[] r0 = this.v5;
        r0[0] = (byte) (r5 >>> 24);
        r0[1] = (byte) (r5 >>> 16);
        r0[2] = (byte) (r5 >>> 8);
        r0[3] = (byte) r5;
        update(r0, 0, 4);
    }

    @Override
    public void update(byte[] r2, int r3, int r4) {
        this.Hw.update(r2, r3, r4);
    }
}
