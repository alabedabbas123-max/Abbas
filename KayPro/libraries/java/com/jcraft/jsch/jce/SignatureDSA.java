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
        int r1 = 0;
        int r7 = 0;
        int r6 = 0;
        int r2 = 0;
        int r8 = 0;
        int r3 = 0;
        int r9 = 0;
        int r4 = 0;
        byte[] r10 = null;
        byte r5 = 0;
        byte r12 = 0;
        byte[] r13 = null;
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r11[0] != 0) { $pc0 = 10; continue $sw0; }
                    if (r11[1] != 0) { $pc0 = 10; continue $sw0; }
                    if (r11[2] != 0) { $pc0 = 10; continue $sw0; }
                    r1 = (((((r11[0] << 24) & (-16777216)) | ((r11[1] << 16) & 16711680)) | ((r11[2] << 8) & 65280)) | (r11[3] & 255)) + 4;
                    r7 = r1 + 1;
                    r6 = r7 + 1;
                    r2 = ((r11[r1] << 24) & (-16777216)) | ((r11[r7] << 16) & 16711680);
                    r8 = r6 + 1;
                    r3 = r2 | ((r11[r6] << 8) & 65280);
                    r9 = r8 + 1;
                    r4 = r3 | (r11[r8] & 255);
                    r10 = new byte[r4];
                    java.lang.System.arraycopy(r11, r9, r10, 0, r4);
                    r11 = r10;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if ((r11[0] & 128) == 0) { $pc0 = 12; continue $sw0; }
                    r5 = 1;
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    if ((r11[20] & 128) == 0) { $pc0 = 16; continue $sw0; }
                    r12 = 1;
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    r13 = new byte[((r11.length + 6) + r5) + r12];
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
                    r0 = r13[3] + 5;
                    r13[r0] = (byte) (r13[r0] + r12);
                    java.lang.System.arraycopy(r11, 20, r13, (r13[3] + 6) + r12, 20);
                    return this.j6.verify(r13);
                }
                case 16: {
                    r12 = 0;
                    { $pc0 = 17; continue $sw0; }
                }
                case 12: {
                    r5 = 0;
                    { $pc0 = 14; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public byte[] j6() {
        byte[] r0 = null;
        int r1 = 0;
        byte[] r2 = null;
        int r5 = 0;
        int r3 = 0;
        int r6 = 0;
        int r4 = 0;
        byte[] r7 = null;
        byte[] r8 = null;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6.sign();
                    r1 = r0[3] & 255;
                    r2 = new byte[r1];
                    java.lang.System.arraycopy(r0, 4, r2, 0, r2.length);
                    r5 = 4 + r1;
                    r3 = 1;
                    r6 = r5 + 1;
                    r4 = r6 + 1;
                    r7 = new byte[r0[r6] & 255];
                    java.lang.System.arraycopy(r0, r4, r7, 0, r7.length);
                    r8 = new byte[40];
                    r9 = 20;
                    if (r2.length <= 20) { $pc1 = 5; continue $sw1; }
                    r10 = 1;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r2.length <= 20) { $pc1 = 9; continue $sw1; }
                    r11 = 0;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    if (r2.length <= 20) { $pc1 = 13; continue $sw1; }
                    r12 = 20;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    java.lang.System.arraycopy(r2, r10, r8, r11, r12);
                    if (r7.length > 20) { $pc1 = 19; continue $sw1; }
                    r3 = 0;
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    if (r7.length <= 20) { $pc1 = 21; continue $sw1; }
                    r13 = 20;
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    if (r7.length > 20) { $pc1 = 26; continue $sw1; }
                    r9 = r7.length;
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    java.lang.System.arraycopy(r7, r3, r8, r13, r9);
                    return r8;
                }
                case 21: {
                    r13 = 40 - r7.length;
                    { $pc1 = 23; continue $sw1; }
                }
                case 13: {
                    r12 = r2.length;
                    { $pc1 = 14; continue $sw1; }
                }
                case 9: {
                    r11 = 20 - r2.length;
                    { $pc1 = 11; continue $sw1; }
                }
                case 5: {
                    r10 = 0;
                    { $pc1 = 7; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
