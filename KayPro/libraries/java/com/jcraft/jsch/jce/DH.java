package com.jcraft.jsch.jce;

public class DH implements com.jcraft.jsch.DH {
    java.math.BigInteger DW;
    java.math.BigInteger FH;
    byte[] Hw;
    byte[] VH;
    java.math.BigInteger Zo;
    private java.security.KeyPairGenerator gn;
    java.math.BigInteger j6;
    private javax.crypto.KeyAgreement u7;
    java.math.BigInteger v5;

    public DH() {
    }

    @Override
    public void DW() {
        java.security.Security.addProvider(new abcd.pP());
        this.gn = java.security.KeyPairGenerator.getInstance("DH", "SC");
        this.u7 = javax.crypto.KeyAgreement.getInstance("DH", "SC");
    }

    void DW(java.math.BigInteger r1) {
        this.DW = r1;
    }

    @Override
    public void DW(byte[] r2) {
        j6(new java.math.BigInteger(r2));
    }

    void FH(java.math.BigInteger r1) {
        this.j6 = r1;
    }

    @Override
    public void FH(byte[] r2) {
        FH(new java.math.BigInteger(r2));
    }

    @Override
    public byte[] FH() {
        java.security.PublicKey r0 = null;
        byte[] r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.Zo != null) { $pc0 = 6; continue $sw0; }
                    r0 = java.security.KeyFactory.getInstance("DH").generatePublic(new javax.crypto.spec.DHPublicKeySpec(this.v5, this.j6, this.DW));
                    this.u7.doPhase(r0, true);
                    r1 = this.u7.generateSecret();
                    this.Zo = new java.math.BigInteger(r1);
                    this.VH = this.Zo.toByteArray();
                    this.VH = r1;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return this.VH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(java.math.BigInteger r1) {
        this.v5 = r1;
    }

    @Override
    public void j6(byte[] r2) {
        DW(new java.math.BigInteger(r2));
    }

    @Override
    public byte[] j6() {
        javax.crypto.spec.DHParameterSpec r0 = null;
        java.security.KeyPair r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.FH != null) { $pc1 = 6; continue $sw1; }
                    r0 = new javax.crypto.spec.DHParameterSpec(this.j6, this.DW);
                    this.gn.initialize(r0);
                    r1 = this.gn.generateKeyPair();
                    this.u7.init(r1.getPrivate());
                    r1.getPublic().getEncoded();
                    this.FH = ((javax.crypto.interfaces.DHPublicKey) r1.getPublic()).getY();
                    this.Hw = this.FH.toByteArray();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
