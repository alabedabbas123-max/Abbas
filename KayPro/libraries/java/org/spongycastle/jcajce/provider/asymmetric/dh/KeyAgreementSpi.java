package org.spongycastle.jcajce.provider.asymmetric.dh;

public class KeyAgreementSpi extends javax.crypto.KeyAgreementSpi {
    private static final java.util.Hashtable j6 = null;
    private java.math.BigInteger DW;
    private java.math.BigInteger FH;
    private java.math.BigInteger Hw;
    private java.math.BigInteger v5;

    static {
        j6 = new java.util.Hashtable();
        java.lang.Integer r0 = new java.lang.Integer(64);
        java.lang.Integer r1 = new java.lang.Integer(192);
        java.lang.Integer r2 = new java.lang.Integer(128);
        java.lang.Integer r3 = new java.lang.Integer(256);
        j6.put("DES", r0);
        j6.put("DESEDE", r1);
        j6.put("BLOWFISH", r2);
        j6.put("AES", r3);
    }

    public KeyAgreementSpi() {
    }

    private byte[] j6(java.math.BigInteger r5) {
        byte[] r6 = r5.toByteArray();
        if (r6[0] != 0) goto L6;
        byte[] r1 = new byte[r6.length - 1];
        java.lang.System.arraycopy(r6, 1, r1, 0, r1.length);
        return r1;
    L6:
        return r6;
    }

    @Override
    protected java.security.Key engineDoPhase(java.security.Key r3, boolean r4) {
        if (this.DW == null) goto L20;
        if ((r3 instanceof javax.crypto.interfaces.DHPublicKey) == false) goto L18;
        javax.crypto.interfaces.DHPublicKey r5 = (javax.crypto.interfaces.DHPublicKey) r3;
        if (r5.getParams().getG().equals(this.Hw) == false) goto L16;
        if (r5.getParams().getP().equals(this.FH) == false) goto L16;
        if (r4 == false) goto L13;
        this.v5 = r5.getY().modPow(this.DW, this.FH);
        return null;
    L13:
        this.v5 = r5.getY().modPow(this.DW, this.FH);
        return new org.spongycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey(this.v5, r5.getParams());
    L16:
        throw new java.security.InvalidKeyException("DHPublicKey not for this KeyAgreement!");
    L18:
        throw new java.security.InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
    L20:
        throw new java.lang.IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override
    protected int engineGenerateSecret(byte[] r4, int r5) {
        if (this.DW == null) goto L11;
        byte[] r0 = j6(this.v5);
        if ((r4.length - r5) < r0.length) goto L9;
        java.lang.System.arraycopy(r0, 0, r4, r5, r0.length);
        return r0.length;
    L9:
        throw new javax.crypto.ShortBufferException("DHKeyAgreement - buffer too short");
    L11:
        throw new java.lang.IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override
    protected javax.crypto.SecretKey engineGenerateSecret(java.lang.String r6) {
        if (this.DW == null) goto L14;
        java.lang.String r0 = abcd.TP.FH(r6);
        byte[] r1 = j6(this.v5);
        if (j6.containsKey(r0) == false) goto L12;
        byte[] r2 = new byte[((java.lang.Integer) j6.get(r0)).intValue() / 8];
        java.lang.System.arraycopy(r1, 0, r2, 0, r2.length);
        if (r0.startsWith("DES") == false) goto L10;
        abcd.QO.j6(r2);
    L10:
        return new javax.crypto.spec.SecretKeySpec(r2, r6);
    L12:
        return new javax.crypto.spec.SecretKeySpec(r1, r6);
    L14:
        throw new java.lang.IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override
    protected byte[] engineGenerateSecret() {
        if (this.DW == null) goto L7;
        return j6(this.v5);
    L7:
        throw new java.lang.IllegalStateException("Diffie-Hellman not initialised.");
    }

    @Override
    protected void engineInit(java.security.Key r1, java.security.SecureRandom r2) {
        if ((r1 instanceof javax.crypto.interfaces.DHPrivateKey) == false) goto L7;
        javax.crypto.interfaces.DHPrivateKey r3 = (javax.crypto.interfaces.DHPrivateKey) r1;
        this.FH = r3.getParams().getP();
        this.Hw = r3.getParams().getG();
        java.math.BigInteger r4 = r3.getX();
        this.v5 = r4;
        this.DW = r4;
        return;
    L7:
        throw new java.security.InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
    }

    @Override
    protected void engineInit(java.security.Key r1, java.security.spec.AlgorithmParameterSpec r2, java.security.SecureRandom r3) {
        if ((r1 instanceof javax.crypto.interfaces.DHPrivateKey) == false) goto L15;
        javax.crypto.interfaces.DHPrivateKey r4 = (javax.crypto.interfaces.DHPrivateKey) r1;
        if (r2 != null) goto L7;
        this.FH = r4.getParams().getP();
        this.Hw = r4.getParams().getG();
    L12:
        java.math.BigInteger r5 = r4.getX();
        this.v5 = r5;
        this.DW = r5;
        return;
    L7:
        if ((r2 instanceof javax.crypto.spec.DHParameterSpec) == false) goto L10;
        javax.crypto.spec.DHParameterSpec r6 = (javax.crypto.spec.DHParameterSpec) r2;
        this.FH = r6.getP();
        this.Hw = r6.getG();
        goto L12
    L10:
        throw new java.security.InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
    L15:
        throw new java.security.InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
    }
}
