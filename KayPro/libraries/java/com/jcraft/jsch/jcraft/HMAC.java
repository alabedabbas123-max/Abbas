package com.jcraft.jsch.jcraft;

class HMAC {
    private byte[] DW;
    private java.security.MessageDigest FH;
    private int Hw;
    private byte[] j6;
    private final byte[] v5;

    HMAC() {
        this.j6 = null;
        this.DW = null;
        this.FH = null;
        this.Hw = 0;
        this.v5 = new byte[4];
    }

    public int j6() {
        return this.Hw;
    }

    protected void j6(java.security.MessageDigest r1) {
        this.FH = r1;
        this.Hw = r1.getDigestLength();
    }

    public void j6(byte[] r5) {
        this.FH.reset();
        int r0 = r5.length;
        int r1 = this.Hw;
        if (r0 <= r1) goto L6;
        byte[] r2 = new byte[r1];
        java.lang.System.arraycopy(r5, 0, r2, 0, r1);
        r5 = r2;
    L6:
        if (r5.length <= 64) goto L8;
        this.FH.update(r5, 0, r5.length);
        r5 = this.FH.digest();
    L8:
        this.j6 = new byte[64];
        java.lang.System.arraycopy(r5, 0, this.j6, 0, r5.length);
        this.DW = new byte[64];
        java.lang.System.arraycopy(r5, 0, this.DW, 0, r5.length);
        int r6 = 0;
    L9:
        if (r6 >= 64) goto L10;
        byte[] r3 = this.j6;
        r3[r6] = (byte) (r3[r6] ^ 54);
        byte[] r4 = this.DW;
        r4[r6] = (byte) (r4[r6] ^ 92);
        r6 = r6 + 1;
        goto L9
    L10:
        this.FH.update(this.j6, 0, 64);
    }

    public void j6(byte[] r6, int r7) {
        byte[] r0 = this.FH.digest();
        this.FH.update(this.DW, 0, 64);
        this.FH.update(r0, 0, this.Hw);
        this.FH.digest(r6, r7, this.Hw);     // Catch: java.lang.Exception -> L6
    L4:
        this.FH.update(this.j6, 0, 64);
    }

    public void update(int r5) {
        byte[] r0 = this.v5;
        r0[0] = (byte) (r5 >>> 24);
        r0[1] = (byte) (r5 >>> 16);
        r0[2] = (byte) (r5 >>> 8);
        r0[3] = (byte) r5;
        update(r0, 0, 4);
    }

    public void update(byte[] r2, int r3, int r4) {
        this.FH.update(r2, r3, r4);
    }
}
