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
        byte[] r6 = null;
        byte[] r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r6 = r5.toByteArray();
                    if (r6[0] != 0) { $pc0 = 6; continue $sw0; }
                    r1 = new byte[r6.length - 1];
                    java.lang.System.arraycopy(r6, 1, r1, 0, r1.length);
                    return r1;
                }
                case 6: {
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected java.security.Key engineDoPhase(java.security.Key r3, boolean r4) {
        javax.crypto.interfaces.DHPublicKey r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.DW == null) { $pc1 = 20; continue $sw1; }
                    if ((r3 instanceof javax.crypto.interfaces.DHPublicKey) == false) { $pc1 = 18; continue $sw1; }
                    r5 = (javax.crypto.interfaces.DHPublicKey) r3;
                    if (r5.getParams().getG().equals(this.Hw) == false) { $pc1 = 16; continue $sw1; }
                    if (r5.getParams().getP().equals(this.FH) == false) { $pc1 = 16; continue $sw1; }
                    if (r4 == false) { $pc1 = 13; continue $sw1; }
                    this.v5 = r5.getY().modPow(this.DW, this.FH);
                    return null;
                }
                case 13: {
                    this.v5 = r5.getY().modPow(this.DW, this.FH);
                    return new org.spongycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey(this.v5, r5.getParams());
                }
                case 16: {
                    throw new java.security.InvalidKeyException("DHPublicKey not for this KeyAgreement!");
                }
                case 18: {
                    throw new java.security.InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
                }
                case 20: {
                    throw new java.lang.IllegalStateException("Diffie-Hellman not initialised.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected int engineGenerateSecret(byte[] r4, int r5) {
        byte[] r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.DW == null) { $pc2 = 11; continue $sw2; }
                    r0 = j6(this.v5);
                    if ((r4.length - r5) < r0.length) { $pc2 = 9; continue $sw2; }
                    java.lang.System.arraycopy(r0, 0, r4, r5, r0.length);
                    return r0.length;
                }
                case 9: {
                    throw new javax.crypto.ShortBufferException("DHKeyAgreement - buffer too short");
                }
                case 11: {
                    throw new java.lang.IllegalStateException("Diffie-Hellman not initialised.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected javax.crypto.SecretKey engineGenerateSecret(java.lang.String r6) {
        java.lang.String r0 = null;
        byte[] r1 = null;
        byte[] r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.DW == null) { $pc3 = 14; continue $sw3; }
                    r0 = abcd.TP.FH(r6);
                    r1 = j6(this.v5);
                    if (j6.containsKey(r0) == false) { $pc3 = 12; continue $sw3; }
                    r2 = new byte[((java.lang.Integer) j6.get(r0)).intValue() / 8];
                    java.lang.System.arraycopy(r1, 0, r2, 0, r2.length);
                    if (r0.startsWith("DES") == false) { $pc3 = 10; continue $sw3; }
                    abcd.QO.j6(r2);
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    return new javax.crypto.spec.SecretKeySpec(r2, r6);
                }
                case 12: {
                    return new javax.crypto.spec.SecretKeySpec(r1, r6);
                }
                case 14: {
                    throw new java.lang.IllegalStateException("Diffie-Hellman not initialised.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected byte[] engineGenerateSecret() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.DW == null) { $pc4 = 7; continue $sw4; }
                    return j6(this.v5);
                }
                case 7: {
                    throw new java.lang.IllegalStateException("Diffie-Hellman not initialised.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void engineInit(java.security.Key r1, java.security.SecureRandom r2) {
        javax.crypto.interfaces.DHPrivateKey r3 = null;
        java.math.BigInteger r4 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if ((r1 instanceof javax.crypto.interfaces.DHPrivateKey) == false) { $pc5 = 7; continue $sw5; }
                    r3 = (javax.crypto.interfaces.DHPrivateKey) r1;
                    this.FH = r3.getParams().getP();
                    this.Hw = r3.getParams().getG();
                    r4 = r3.getX();
                    this.v5 = r4;
                    this.DW = r4;
                    return;
                }
                case 7: {
                    throw new java.security.InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void engineInit(java.security.Key r1, java.security.spec.AlgorithmParameterSpec r2, java.security.SecureRandom r3) {
        javax.crypto.interfaces.DHPrivateKey r4 = null;
        java.math.BigInteger r5 = null;
        javax.crypto.spec.DHParameterSpec r6 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if ((r1 instanceof javax.crypto.interfaces.DHPrivateKey) == false) { $pc6 = 15; continue $sw6; }
                    r4 = (javax.crypto.interfaces.DHPrivateKey) r1;
                    if (r2 != null) { $pc6 = 7; continue $sw6; }
                    this.FH = r4.getParams().getP();
                    this.Hw = r4.getParams().getG();
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    r5 = r4.getX();
                    this.v5 = r5;
                    this.DW = r5;
                    return;
                }
                case 7: {
                    if ((r2 instanceof javax.crypto.spec.DHParameterSpec) == false) { $pc6 = 10; continue $sw6; }
                    r6 = (javax.crypto.spec.DHParameterSpec) r2;
                    this.FH = r6.getP();
                    this.Hw = r6.getG();
                    { $pc6 = 12; continue $sw6; }
                }
                case 10: {
                    throw new java.security.InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
                }
                case 15: {
                    throw new java.security.InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
