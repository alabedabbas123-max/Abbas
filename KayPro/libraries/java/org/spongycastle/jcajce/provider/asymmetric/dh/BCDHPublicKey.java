package org.spongycastle.jcajce.provider.asymmetric.dh;

public class BCDHPublicKey implements javax.crypto.interfaces.DHPublicKey {
    private transient javax.crypto.spec.DHParameterSpec DW;
    private transient abcd.CN FH;
    private java.math.BigInteger j6;

    public BCDHPublicKey(abcd.CN r4) {
        abcd.FL r0 = null;
        abcd.zL r5 = null;
        abcd.kN r6 = null;
        abcd.ON r7 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.FH = r4;
                    this.j6 = ((abcd.wL) r4.Zo()).tp();
                    r0 = abcd.FL.j6(r4.v5().VH());
                    r5 = r4.v5().v5();
                    if (r5.equals(abcd.InterfacelN.XL) == false) { $pc0 = 7; continue $sw0; }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    r6 = abcd.kN.j6(r0);
                    if (r6.Zo() == null) { $pc0 = 17; continue $sw0; }
                    this.DW = new javax.crypto.spec.DHParameterSpec(r6.VH(), r6.v5(), r6.Zo().intValue());
                    return;
                }
                case 17: {
                    this.DW = new javax.crypto.spec.DHParameterSpec(r6.VH(), r6.v5());
                    return;
                }
                case 7: {
                    if (j6(r0) == true) { $pc0 = 14; continue $sw0; }
                    if (r5.equals(abcd.QN.br) == false) { $pc0 = 13; continue $sw0; }
                    r7 = abcd.ON.j6(r0);
                    this.DW = new javax.crypto.spec.DHParameterSpec(r7.Zo().tp(), r7.v5().tp());
                    return;
                }
                case 13: {
                    throw new java.lang.IllegalArgumentException("unknown algorithm type: " + r5);
                }
                case 20: {
                    throw new java.lang.IllegalArgumentException("invalid info structure in DH public key");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r6.tp() != 2) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    if (r6.tp() <= 3) { $pc1 = 9; continue $sw1; }
                    return false;
                }
                case 9: {
                    if (abcd.lM.j6(r6.j6(2)).tp().compareTo(java.math.BigInteger.valueOf(abcd.lM.j6(r6.j6(0)).tp().bitLength())) <= 0) { $pc1 = 11; continue $sw1; }
                    return false;
                }
                case 11: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r4) {
        javax.crypto.interfaces.DHPublicKey r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r4 instanceof javax.crypto.interfaces.DHPublicKey) == true) { $pc2 = 5; continue $sw2; }
                    return false;
                }
                case 5: {
                    r5 = (javax.crypto.interfaces.DHPublicKey) r4;
                    if (getY().equals(r5.getY()) == true) { $pc2 = 8; continue $sw2; }
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    return false;
                }
                case 8: {
                    if (getParams().getG().equals(r5.getParams().getG()) == false) { $pc2 = 15; continue $sw2; }
                    if (getParams().getP().equals(r5.getParams().getP()) == false) { $pc2 = 15; continue $sw2; }
                    if (getParams().getL() != r5.getParams().getL()) { $pc2 = 15; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String getAlgorithm() {
        return "DH";
    }

    @Override
    public byte[] getEncoded() {
        abcd.CN r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.FH;
                    if (r0 == null) { $pc3 = 7; continue $sw3; }
                    return abcd.eP.j6(r0);
                }
                case 7: {
                    return abcd.eP.j6(new abcd.wN(abcd.InterfacelN.XL, new abcd.kN(this.DW.getP(), this.DW.getG(), this.DW.getL()).DW()), new abcd.wL(this.j6));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
