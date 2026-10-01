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
        if (this.Zo != null) goto L6;
        java.security.PublicKey r0 = java.security.KeyFactory.getInstance("DH").generatePublic(new javax.crypto.spec.DHPublicKeySpec(this.v5, this.j6, this.DW));
        this.u7.doPhase(r0, true);
        byte[] r1 = this.u7.generateSecret();
        this.Zo = new java.math.BigInteger(r1);
        this.VH = this.Zo.toByteArray();
        this.VH = r1;
    L6:
        return this.VH;
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
        if (this.FH != null) goto L6;
        javax.crypto.spec.DHParameterSpec r0 = new javax.crypto.spec.DHParameterSpec(this.j6, this.DW);
        this.gn.initialize(r0);
        java.security.KeyPair r1 = this.gn.generateKeyPair();
        this.u7.init(r1.getPrivate());
        r1.getPublic().getEncoded();
        this.FH = ((javax.crypto.interfaces.DHPublicKey) r1.getPublic()).getY();
        this.Hw = this.FH.toByteArray();
    L6:
        return this.Hw;
    }
}
