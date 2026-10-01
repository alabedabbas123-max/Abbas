package org.spongycastle.jcajce.provider.asymmetric.dh;

public class KeyPairGeneratorSpi extends java.security.KeyPairGenerator {
    private static java.util.Hashtable j6;
    abcd.RO DW;
    abcd.LO FH;
    int Hw;
    boolean VH;
    java.security.SecureRandom Zo;
    int v5;

    static {
        j6 = new java.util.Hashtable();
    }

    public KeyPairGeneratorSpi() {
        super("DH");
        this.FH = new abcd.LO();
        this.Hw = 1024;
        this.v5 = 20;
        this.Zo = new java.security.SecureRandom();
        this.VH = false;
    }

    @Override
    public java.security.KeyPair generateKeyPair() {
        if (this.VH == true) goto L14;
        java.lang.Integer r0 = new java.lang.Integer(this.Hw);
        if (j6.containsKey(r0) == false) goto L7;
        this.DW = (abcd.RO) j6.get(r0);
    L13:
        this.FH.j6(this.DW);
        this.VH = true;
        goto L14
    L7:
        javax.crypto.spec.DHParameterSpec r1 = abcd.pP.FH.j6();
        if (r1 != null) goto L10;
    L12:
        abcd.NO r2 = new abcd.NO();
        r2.j6(this.Hw, this.v5, this.Zo);
        this.DW = new abcd.RO(this.Zo, r2.j6());
        j6.put(r0, this.DW);
        goto L13
    L10:
        if (r1.getP().bitLength() != this.Hw) goto L12;
        this.DW = new abcd.RO(this.Zo, new abcd.TO(r1.getP(), r1.getG(), null, r1.getL()));
    L14:
        abcd.oO r3 = this.FH.j6();
        abcd.VO r4 = (abcd.VO) r3.DW();
        abcd.UO r5 = (abcd.UO) r3.j6();
        return new java.security.KeyPair(new org.spongycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey(r4), new org.spongycastle.jcajce.provider.asymmetric.dh.BCDHPrivateKey(r5));
    }

    @Override
    public void initialize(int r1, java.security.SecureRandom r2) {
        this.Hw = r1;
        this.Zo = r2;
    }

    @Override
    public void initialize(java.security.spec.AlgorithmParameterSpec r6, java.security.SecureRandom r7) {
        if ((r6 instanceof javax.crypto.spec.DHParameterSpec) == false) goto L7;
        javax.crypto.spec.DHParameterSpec r8 = (javax.crypto.spec.DHParameterSpec) r6;
        this.DW = new abcd.RO(r7, new abcd.TO(r8.getP(), r8.getG(), null, r8.getL()));
        this.FH.j6(this.DW);
        this.VH = true;
        return;
    L7:
        throw new java.security.InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
    }
}
