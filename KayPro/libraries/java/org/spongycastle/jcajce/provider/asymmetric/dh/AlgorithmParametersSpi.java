package org.spongycastle.jcajce.provider.asymmetric.dh;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    javax.crypto.spec.DHParameterSpec j6;

    public AlgorithmParametersSpi() {
    }

    @Override
    protected byte[] engineGetEncoded() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return new abcd.kN(this.j6.getP(), this.j6.getG(), this.j6.getL()).j6("DER");
                }
                case 6: {
                    throw new java.lang.RuntimeException("Error encoding DHParameters");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected byte[] engineGetEncoded(java.lang.String r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (j6(r1) == true) { $pc1 = 5; continue $sw1; }
                    return null;
                }
                case 5: {
                    return engineGetEncoded();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected java.security.spec.AlgorithmParameterSpec engineGetParameterSpec(java.lang.Class r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 == null) { $pc2 = 6; continue $sw2; }
                    return j6(r2);
                }
                case 6: {
                    throw new java.lang.NullPointerException("argument to getParameterSpec must not be null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void engineInit(java.security.spec.AlgorithmParameterSpec r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((r2 instanceof javax.crypto.spec.DHParameterSpec) == false) { $pc3 = 7; continue $sw3; }
                    this.j6 = (javax.crypto.spec.DHParameterSpec) r2;
                    return;
                }
                case 7: {
                    throw new java.security.spec.InvalidParameterSpecException("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void engineInit(byte[] r5) {
        abcd.kN r6 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    try {
                        r6 = abcd.kN.j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc4 = 8; continue $sw4; }
                        if ($t instanceof java.lang.ClassCastException) { $pc4 = 10; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r6.Zo() == null) { $pc4 = 6; continue $sw4; }
                    try {
                        this.j6 = new javax.crypto.spec.DHParameterSpec(r6.VH(), r6.v5(), r6.Zo().intValue());
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc4 = 8; continue $sw4; }
                        if ($t instanceof java.lang.ClassCastException) { $pc4 = 10; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 6: {
                    try {
                        this.j6 = new javax.crypto.spec.DHParameterSpec(r6.VH(), r6.v5());
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.ArrayIndexOutOfBoundsException) { $pc4 = 8; continue $sw4; }
                        if ($t instanceof java.lang.ClassCastException) { $pc4 = 10; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 9: {
                    throw new java.io.IOException("Not a valid DH Parameter encoding.");
                }
                case 11: {
                    throw new java.io.IOException("Not a valid DH Parameter encoding.");
                }
                case 8: {
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void engineInit(byte[] r3, java.lang.String r4) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (j6(r4) == false) { $pc5 = 7; continue $sw5; }
                    engineInit(r3);
                    return;
                }
                case 7: {
                    throw new java.io.IOException("Unknown parameter format " + r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected java.lang.String engineToString() {
        return "Diffie-Hellman Parameters";
    }

    protected java.security.spec.AlgorithmParameterSpec j6(java.lang.Class r2) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r2 != javax.crypto.spec.DHParameterSpec.class) { $pc6 = 7; continue $sw6; }
                    return this.j6;
                }
                case 7: {
                    throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to DH parameters object.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected boolean j6(java.lang.String r2) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r2 != null) { $pc7 = 4; continue $sw7; }
                    return true;
                }
                case 4: {
                    if (r2.equals("ASN.1") == true) { $pc7 = 9; continue $sw7; }
                    return false;
                }
                case 9: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
