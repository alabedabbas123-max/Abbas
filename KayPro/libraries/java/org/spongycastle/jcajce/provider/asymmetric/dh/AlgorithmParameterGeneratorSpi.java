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
        abcd.NO r0 = new abcd.NO();
        java.security.SecureRandom r1 = this.j6;
        if (r1 == null) goto L5;
        r0.j6(this.DW, 20, r1);
    L6:
        abcd.TO r2 = r0.j6();
        java.security.AlgorithmParameters r3 = java.security.AlgorithmParameters.getInstance("DH", abcd.pP.DW);     // Catch: java.lang.Exception -> L9
        r3.init(new javax.crypto.spec.DHParameterSpec(r2.Hw(), r2.j6(), this.FH));     // Catch: java.lang.Exception -> L9
        return r3;
    L9:
        e = move-exception;
        throw new java.lang.RuntimeException(e.getMessage());
    L5:
        r0.j6(this.DW, 20, new java.security.SecureRandom());
        goto L6
    }

    @Override
    protected void engineInit(int r1, java.security.SecureRandom r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    protected void engineInit(java.security.spec.AlgorithmParameterSpec r2, java.security.SecureRandom r3) {
        if ((r2 instanceof javax.crypto.spec.DHGenParameterSpec) == false) goto L7;
        javax.crypto.spec.DHGenParameterSpec r4 = (javax.crypto.spec.DHGenParameterSpec) r2;
        this.DW = r4.getPrimeSize();
        this.FH = r4.getExponentSize();
        this.j6 = r3;
        return;
    L7:
        throw new java.security.InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
    }
}
