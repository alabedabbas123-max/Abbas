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
        java.lang.Integer r0 = null;
        javax.crypto.spec.DHParameterSpec r1 = null;
        abcd.NO r2 = null;
        abcd.oO r3 = null;
        abcd.VO r4 = null;
        abcd.UO r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.VH == true) { $pc0 = 14; continue $sw0; }
                    r0 = new java.lang.Integer(this.Hw);
                    if (j6.containsKey(r0) == false) { $pc0 = 7; continue $sw0; }
                    this.DW = (abcd.RO) j6.get(r0);
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    this.FH.j6(this.DW);
                    this.VH = true;
                    { $pc0 = 14; continue $sw0; }
                }
                case 7: {
                    r1 = abcd.pP.FH.j6();
                    if (r1 != null) { $pc0 = 10; continue $sw0; }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r2 = new abcd.NO();
                    r2.j6(this.Hw, this.v5, this.Zo);
                    this.DW = new abcd.RO(this.Zo, r2.j6());
                    j6.put(r0, this.DW);
                    { $pc0 = 13; continue $sw0; }
                }
                case 10: {
                    if (r1.getP().bitLength() != this.Hw) { $pc0 = 12; continue $sw0; }
                    this.DW = new abcd.RO(this.Zo, new abcd.TO(r1.getP(), r1.getG(), null, r1.getL()));
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    r3 = this.FH.j6();
                    r4 = (abcd.VO) r3.DW();
                    r5 = (abcd.UO) r3.j6();
                    return new java.security.KeyPair(new org.spongycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey(r4), new org.spongycastle.jcajce.provider.asymmetric.dh.BCDHPrivateKey(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void initialize(int r1, java.security.SecureRandom r2) {
        this.Hw = r1;
        this.Zo = r2;
    }

    @Override
    public void initialize(java.security.spec.AlgorithmParameterSpec r6, java.security.SecureRandom r7) {
        javax.crypto.spec.DHParameterSpec r8 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r6 instanceof javax.crypto.spec.DHParameterSpec) == false) { $pc1 = 7; continue $sw1; }
                    r8 = (javax.crypto.spec.DHParameterSpec) r6;
                    this.DW = new abcd.RO(r7, new abcd.TO(r8.getP(), r8.getG(), null, r8.getL()));
                    this.FH.j6(this.DW);
                    this.VH = true;
                    return;
                }
                case 7: {
                    throw new java.security.InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
