package org.spongycastle.jcajce.provider.asymmetric.dh;

public class BCDHPublicKey implements javax.crypto.interfaces.DHPublicKey {
    private transient javax.crypto.spec.DHParameterSpec DW;
    private transient abcd.CN FH;
    private java.math.BigInteger j6;

    public BCDHPublicKey(abcd.CN r4) {
        this.FH = r4;
        this.j6 = ((abcd.wL) r4.Zo()).tp();
        abcd.FL r0 = abcd.FL.j6(r4.v5().VH());
        abcd.zL r5 = r4.v5().v5();
        if (r5.equals(abcd.InterfacelN.XL) == false) goto L7;
    L14:
        abcd.kN r6 = abcd.kN.j6(r0);
        if (r6.Zo() == null) goto L17;
        this.DW = new javax.crypto.spec.DHParameterSpec(r6.VH(), r6.v5(), r6.Zo().intValue());
        return;
    L17:
        this.DW = new javax.crypto.spec.DHParameterSpec(r6.VH(), r6.v5());
        return;
    L7:
        if (j6(r0) == true) goto L14;
        if (r5.equals(abcd.QN.br) == false) goto L13;
        abcd.ON r7 = abcd.ON.j6(r0);
        this.DW = new javax.crypto.spec.DHParameterSpec(r7.Zo().tp(), r7.v5().tp());
        return;
    L13:
        throw new java.lang.IllegalArgumentException("unknown algorithm type: " + r5);
    L20:
        throw new java.lang.IllegalArgumentException("invalid info structure in DH public key");
    }

    BCDHPublicKey(abcd.VO r4) {
        this.j6 = r4.FH();
        this.DW = new javax.crypto.spec.DHParameterSpec(r4.DW().Hw(), r4.DW().j6(), r4.DW().DW());
    }

    BCDHPublicKey(java.math.BigInteger r1, javax.crypto.spec.DHParameterSpec r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    BCDHPublicKey(javax.crypto.interfaces.DHPublicKey r2) {
        this.j6 = r2.getY();
        this.DW = r2.getParams();
    }

    BCDHPublicKey(javax.crypto.spec.DHPublicKeySpec r3) {
        this.j6 = r3.getY();
        this.DW = new javax.crypto.spec.DHParameterSpec(r3.getP(), r3.getG());
    }

    private boolean j6(abcd.FL r6) {
        if (r6.tp() != 2) goto L6;
        return true;
    L6:
        if (r6.tp() <= 3) goto L9;
        return false;
    L9:
        if (abcd.lM.j6(r6.j6(2)).tp().compareTo(java.math.BigInteger.valueOf(abcd.lM.j6(r6.j6(0)).tp().bitLength())) <= 0) goto L11;
        return false;
    L11:
        return true;
    }

    public boolean equals(java.lang.Object r4) {
        if ((r4 instanceof javax.crypto.interfaces.DHPublicKey) == true) goto L5;
        return false;
    L5:
        javax.crypto.interfaces.DHPublicKey r5 = (javax.crypto.interfaces.DHPublicKey) r4;
        if (getY().equals(r5.getY()) == true) goto L8;
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

    @Override
    public byte[] getEncoded() {
        abcd.CN r0 = this.FH;
        if (r0 == null) goto L7;
        return abcd.eP.j6(r0);
    L7:
        return abcd.eP.j6(new abcd.wN(abcd.InterfacelN.XL, new abcd.kN(this.DW.getP(), this.DW.getG(), this.DW.getL()).DW()), new abcd.wL(this.j6));
    }

    @Override
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override
    public javax.crypto.spec.DHParameterSpec getParams() {
        return this.DW;
    }

    @Override
    public java.math.BigInteger getY() {
        return this.j6;
    }

    public int hashCode() {
        return ((getY().hashCode() ^ getParams().getG().hashCode()) ^ getParams().getP().hashCode()) ^ getParams().getL();
    }
}
