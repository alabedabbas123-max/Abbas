package org.spongycastle.jcajce.provider.asymmetric.dh;

public class BCDHPrivateKey implements javax.crypto.interfaces.DHPrivateKey, abcd.InterfacenP {
    private transient javax.crypto.spec.DHParameterSpec DW;
    private transient abcd.mN FH;
    private transient abcd.fP Hw;
    private java.math.BigInteger j6;

    protected BCDHPrivateKey() {
        this.Hw = new abcd.fP();
    }

    BCDHPrivateKey(abcd.UO r4) {
        this.Hw = new abcd.fP();
        this.j6 = r4.FH();
        this.DW = new javax.crypto.spec.DHParameterSpec(r4.DW().Hw(), r4.DW().j6(), r4.DW().DW());
    }

    public BCDHPrivateKey(abcd.mN r4) {
        this.Hw = new abcd.fP();
        abcd.FL r0 = abcd.FL.j6(r4.v5().VH());
        abcd.wL r1 = (abcd.wL) r4.Zo();
        abcd.zL r2 = r4.v5().v5();
        this.FH = r4;
        this.j6 = r1.tp();
        if (r2.equals(abcd.InterfacelN.XL) == false) goto L9;
        abcd.kN r5 = abcd.kN.j6(r0);
        if (r5.Zo() == null) goto L7;
        this.DW = new javax.crypto.spec.DHParameterSpec(r5.VH(), r5.v5(), r5.Zo().intValue());
        return;
    L7:
        this.DW = new javax.crypto.spec.DHParameterSpec(r5.VH(), r5.v5());
        return;
    L9:
        if (r2.equals(abcd.QN.br) == false) goto L13;
        abcd.ON r6 = abcd.ON.j6(r0);
        this.DW = new javax.crypto.spec.DHParameterSpec(r6.Zo().tp(), r6.v5().tp());
        return;
    L13:
        throw new java.lang.IllegalArgumentException("unknown algorithm type: " + r2);
    }

    BCDHPrivateKey(javax.crypto.interfaces.DHPrivateKey r2) {
        this.Hw = new abcd.fP();
        this.j6 = r2.getX();
        this.DW = r2.getParams();
    }

    BCDHPrivateKey(javax.crypto.spec.DHPrivateKeySpec r3) {
        this.Hw = new abcd.fP();
        this.j6 = r3.getX();
        this.DW = new javax.crypto.spec.DHParameterSpec(r3.getP(), r3.getG());
    }

    public boolean equals(java.lang.Object r4) {
        if ((r4 instanceof javax.crypto.interfaces.DHPrivateKey) == true) goto L5;
        return false;
    L5:
        javax.crypto.interfaces.DHPrivateKey r5 = (javax.crypto.interfaces.DHPrivateKey) r4;
        if (getX().equals(r5.getX()) == true) goto L8;
    L15:
        return false;
    L8:
        if (getParams().getG().equals(r5.getParams().getG()) == false) goto L15;
        if (getParams().getP().equals(r5.getParams().getP()) == false) goto L15;
        if (getParams().getL() != r5.getParams().getL()) goto L15;
        return true;
    }

    @Override
    public java.lang.String getAlgorithm() {
        return "DH";
    }

    public abcd.InterfaceqL getBagAttribute(abcd.oM r2) {
        return this.Hw.j6(r2);
    }

    public java.util.Enumeration getBagAttributeKeys() {
        return this.Hw.j6();
    }

    @Override
    public byte[] getEncoded() {
    L9:
        return null;
    L4:
        if (this.FH == null) goto L8;
        return this.FH.j6("DER");
    L8:
        return new abcd.mN(new abcd.wN(abcd.InterfacelN.XL, new abcd.kN(this.DW.getP(), this.DW.getG(), this.DW.getL()).DW()), new abcd.wL(getX())).j6("DER");
    }

    @Override
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override
    public javax.crypto.spec.DHParameterSpec getParams() {
        return this.DW;
    }

    @Override
    public java.math.BigInteger getX() {
        return this.j6;
    }

    public int hashCode() {
        return ((getX().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }

    public void setBagAttribute(abcd.zL r2, abcd.InterfaceqL r3) {
        this.Hw.j6(r2, r3);
    }
}
