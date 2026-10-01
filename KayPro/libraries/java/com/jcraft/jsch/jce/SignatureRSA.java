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
        int r3 = 0;
        int r2 = 0;
        int r1 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        byte[] r12 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r8[0] != 0) { $pc0 = 10; continue $sw0; }
                    if (r8[1] != 0) { $pc0 = 10; continue $sw0; }
                    if (r8[2] != 0) { $pc0 = 10; continue $sw0; }
                    r3 = (r8[0] << 24) & (-16777216);
                    r2 = 4 + (((((r8[1] << 16) & 16711680) | r3) | ((r8[2] << 8) & 65280)) | (r8[3] & 255));
                    r1 = r2 + 1;
                    r4 = (r8[r2] << 24) & (-16777216);
                    r5 = r1 + 1;
                    r6 = ((r8[r1] << 16) & 16711680) | r4;
                    r7 = r5 + 1;
                    r9 = r6 | ((r8[r5] << 8) & 65280);
                    r10 = r7 + 1;
                    r11 = r9 | (r8[r7] & 255);
                    r12 = new byte[r11];
                    java.lang.System.arraycopy(r8, r10, r12, 0, r11);
                    r8 = r12;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    return this.j6.verify(r8);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public byte[] j6() {
        return this.j6.sign();
    }
}
