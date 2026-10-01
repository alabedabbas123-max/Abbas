package com.jcraft.jsch.jce;

public class SignatureDSA implements com.jcraft.jsch.SignatureDSA {
    java.security.KeyFactory DW;
    java.security.Signature j6;

    public SignatureDSA() {
    }

    @Override
    public void DW() {
        this.j6 = java.security.Signature.getInstance("SHA1withDSA");
        this.DW = java.security.KeyFactory.getInstance("DSA");
    }

    @Override
    public void DW(byte[] r2) {
        this.j6.update(r2);
    }

    @Override
    public void DW(byte[] r3, byte[] r4, byte[] r5, byte[] r6) {
        java.security.spec.DSAPublicKeySpec r0 = new java.security.spec.DSAPublicKeySpec(new java.math.BigInteger(r3), new java.math.BigInteger(r4), new java.math.BigInteger(r5), new java.math.BigInteger(r6));
        java.security.PublicKey r7 = this.DW.generatePublic(r0);
        this.j6.initVerify(r7);
    }

    @Override
    public void j6(byte[] r3, byte[] r4, byte[] r5, byte[] r6) {
        java.security.spec.DSAPrivateKeySpec r0 = new java.security.spec.DSAPrivateKeySpec(new java.math.BigInteger(r3), new java.math.BigInteger(r4), new java.math.BigInteger(r5), new java.math.BigInteger(r6));
        java.security.PrivateKey r7 = this.DW.generatePrivate(r0);
        this.j6.initSign(r7);
    }

    @Override
    public boolean j6(byte[] r11) {
        if (r11[0] != 0) goto L10;
        if (r11[1] != 0) goto L10;
        if (r11[2] != 0) goto L10;
        int r1 = (((((r11[0] << 24) & (-16777216)) | ((r11[1] << 16) & 16711680)) | ((r11[2] << 8) & 65280)) | (r11[3] & 255)) + 4;
        int r7 = r1 + 1;
        int r6 = r7 + 1;
        int r2 = ((r11[r1] << 24) & (-16777216)) | ((r11[r7] << 16) & 16711680);
        int r8 = r6 + 1;
        int r3 = r2 | ((r11[r6] << 8) & 65280);
        int r9 = r8 + 1;
        int r4 = r3 | (r11[r8] & 255);
        byte[] r10 = new byte[r4];
        java.lang.System.arraycopy(r11, r9, r10, 0, r4);
        r11 = r10;
    L10:
        if ((r11[0] & 128) == 0) goto L12;
        byte r5 = 1;
    L14:
        if ((r11[20] & 128) == 0) goto L16;
        byte r12 = 1;
    L17:
        byte[] r13 = new byte[((r11.length + 6) + r5) + r12];
        r13[0] = 48;
        r13[1] = 44;
        r13[1] = (byte) (r13[1] + r5);
        r13[1] = (byte) (r13[1] + r12);
        r13[2] = 2;
        r13[3] = 20;
        r13[3] = (byte) (r13[3] + r5);
        java.lang.System.arraycopy(r11, 0, r13, r5 + 4, 20);
        r13[r13[3] + 4] = 2;
        r13[r13[3] + 5] = 20;
        int r0 = r13[3] + 5;
        r13[r0] = (byte) (r13[r0] + r12);
        java.lang.System.arraycopy(r11, 20, r13, (r13[3] + 6) + r12, 20);
        return this.j6.verify(r13);
    L16:
        r12 = 0;
        goto L17
    L12:
        r5 = 0;
        goto L14
    }

    @Override
    public byte[] j6() {
        byte[] r0 = this.j6.sign();
        int r1 = r0[3] & 255;
        byte[] r2 = new byte[r1];
        java.lang.System.arraycopy(r0, 4, r2, 0, r2.length);
        int r5 = 4 + r1;
        int r3 = 1;
        int r6 = r5 + 1;
        int r4 = r6 + 1;
        byte[] r7 = new byte[r0[r6] & 255];
        java.lang.System.arraycopy(r0, r4, r7, 0, r7.length);
        byte[] r8 = new byte[40];
        int r9 = 20;
        if (r2.length <= 20) goto L5;
        int r10 = 1;
    L7:
        if (r2.length <= 20) goto L9;
        int r11 = 0;
    L11:
        if (r2.length <= 20) goto L13;
        int r12 = 20;
    L14:
        java.lang.System.arraycopy(r2, r10, r8, r11, r12);
        if (r7.length > 20) goto L19;
        r3 = 0;
    L19:
        if (r7.length <= 20) goto L21;
        int r13 = 20;
    L23:
        if (r7.length > 20) goto L26;
        r9 = r7.length;
    L26:
        java.lang.System.arraycopy(r7, r3, r8, r13, r9);
        return r8;
    L21:
        r13 = 40 - r7.length;
        goto L23
    L13:
        r12 = r2.length;
        goto L14
    L9:
        r11 = 20 - r2.length;
        goto L11
    L5:
        r10 = 0;
        goto L7
    }
}
