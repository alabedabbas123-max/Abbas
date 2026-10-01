package com.jcraft.jsch.jce;

public class SignatureRSA implements com.jcraft.jsch.SignatureRSA {
    java.security.KeyFactory DW;
    java.security.Signature j6;

    public SignatureRSA() {
    }

    @Override
    public void DW() {
        this.j6 = java.security.Signature.getInstance("SHA1withRSA");
        this.DW = java.security.KeyFactory.getInstance("RSA");
    }

    @Override
    public void DW(byte[] r2) {
        this.j6.update(r2);
    }

    @Override
    public void DW(byte[] r3, byte[] r4) {
        java.security.spec.RSAPrivateKeySpec r0 = new java.security.spec.RSAPrivateKeySpec(new java.math.BigInteger(r4), new java.math.BigInteger(r3));
        java.security.PrivateKey r5 = this.DW.generatePrivate(r0);
        this.j6.initSign(r5);
    }

    @Override
    public void j6(byte[] r3, byte[] r4) {
        java.security.spec.RSAPublicKeySpec r0 = new java.security.spec.RSAPublicKeySpec(new java.math.BigInteger(r4), new java.math.BigInteger(r3));
        java.security.PublicKey r5 = this.DW.generatePublic(r0);
        this.j6.initVerify(r5);
    }

    @Override
    public boolean j6(byte[] r8) {
        if (r8[0] != 0) goto L10;
        if (r8[1] != 0) goto L10;
        if (r8[2] != 0) goto L10;
        int r3 = (r8[0] << 24) & (-16777216);
        int r2 = 4 + (((((r8[1] << 16) & 16711680) | r3) | ((r8[2] << 8) & 65280)) | (r8[3] & 255));
        int r1 = r2 + 1;
        int r4 = (r8[r2] << 24) & (-16777216);
        int r5 = r1 + 1;
        int r6 = ((r8[r1] << 16) & 16711680) | r4;
        int r7 = r5 + 1;
        int r9 = r6 | ((r8[r5] << 8) & 65280);
        int r10 = r7 + 1;
        int r11 = r9 | (r8[r7] & 255);
        byte[] r12 = new byte[r11];
        java.lang.System.arraycopy(r8, r10, r12, 0, r11);
        r8 = r12;
    L10:
        return this.j6.verify(r8);
    }

    @Override
    public byte[] j6() {
        return this.j6.sign();
    }
}
