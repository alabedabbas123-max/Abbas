package org.spongycastle.jcajce.provider.asymmetric.dh;

public class AlgorithmParameterGeneratorSpi extends java.security.AlgorithmParameterGeneratorSpi {
    protected int DW;
    private int FH;
    protected java.security.SecureRandom j6;

    public AlgorithmParameterGeneratorSpi() {
        this.DW = 1024;
        this.FH = 0;
    }

    @Override
    protected java.security.AlgorithmParameters engineGenerateParameters() {
        abcd.NO r0 = null;
        java.security.SecureRandom r1 = null;
        abcd.TO r2 = null;
        java.security.AlgorithmParameters r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new abcd.NO();
                    r1 = this.j6;
                    if (r1 == null) { $pc0 = 5; continue $sw0; }
                    r0.j6(this.DW, 20, r1);
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r2 = r0.j6();
                    try {
                        r3 = java.security.AlgorithmParameters.getInstance("DH", abcd.pP.DW);
                        r3.init(new javax.crypto.spec.DHParameterSpec(r2.Hw(), r2.j6(), this.FH));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r3;
                }
                case 9: {
                    e = $ex0;
                    throw new java.lang.RuntimeException(e.getMessage());
                }
                case 5: {
                    r0.j6(this.DW, 20, new java.security.SecureRandom());
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void engineInit(int r1, java.security.SecureRandom r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    protected void engineInit(java.security.spec.AlgorithmParameterSpec r2, java.security.SecureRandom r3) {
        javax.crypto.spec.DHGenParameterSpec r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r2 instanceof javax.crypto.spec.DHGenParameterSpec) == false) { $pc1 = 7; continue $sw1; }
                    r4 = (javax.crypto.spec.DHGenParameterSpec) r2;
                    this.DW = r4.getPrimeSize();
                    this.FH = r4.getExponentSize();
                    this.j6 = r3;
                    return;
                }
                case 7: {
                    throw new java.security.InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
