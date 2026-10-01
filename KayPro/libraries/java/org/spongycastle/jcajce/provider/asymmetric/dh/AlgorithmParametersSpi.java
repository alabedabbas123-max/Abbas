package org.spongycastle.jcajce.provider.asymmetric.dh;

public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    javax.crypto.spec.DHParameterSpec j6;

    public AlgorithmParametersSpi() {
    }

    @Override
    protected byte[] engineGetEncoded() {
        return new abcd.kN(this.j6.getP(), this.j6.getG(), this.j6.getL()).j6("DER");
    L6:
        throw new java.lang.RuntimeException("Error encoding DHParameters");
    }

    @Override
    protected byte[] engineGetEncoded(java.lang.String r1) {
        if (j6(r1) == true) goto L5;
        return null;
    L5:
        return engineGetEncoded();
    }

    @Override
    protected java.security.spec.AlgorithmParameterSpec engineGetParameterSpec(java.lang.Class r2) {
        if (r2 == null) goto L6;
        return j6(r2);
    L6:
        throw new java.lang.NullPointerException("argument to getParameterSpec must not be null");
    }

    @Override
    protected void engineInit(java.security.spec.AlgorithmParameterSpec r2) {
        if ((r2 instanceof javax.crypto.spec.DHParameterSpec) == false) goto L7;
        this.j6 = (javax.crypto.spec.DHParameterSpec) r2;
        return;
    L7:
        throw new java.security.spec.InvalidParameterSpecException("DHParameterSpec required to initialise a Diffie-Hellman algorithm parameters object");
    }

    @Override
    protected void engineInit(byte[] r5) {
        abcd.kN r6 = abcd.kN.j6(r5);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8 java.lang.ClassCastException -> L10
        if (r6.Zo() == null) goto L6;
        this.j6 = new javax.crypto.spec.DHParameterSpec(r6.VH(), r6.v5(), r6.Zo().intValue());     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8 java.lang.ClassCastException -> L10
        return;
    L6:
        this.j6 = new javax.crypto.spec.DHParameterSpec(r6.VH(), r6.v5());     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8 java.lang.ClassCastException -> L10
        return;
    L9:
        throw new java.io.IOException("Not a valid DH Parameter encoding.");
    L11:
        throw new java.io.IOException("Not a valid DH Parameter encoding.");
    }

    @Override
    protected void engineInit(byte[] r3, java.lang.String r4) {
        if (j6(r4) == false) goto L7;
        engineInit(r3);
        return;
    L7:
        throw new java.io.IOException("Unknown parameter format " + r4);
    }

    @Override
    protected java.lang.String engineToString() {
        return "Diffie-Hellman Parameters";
    }

    protected java.security.spec.AlgorithmParameterSpec j6(java.lang.Class r2) {
        if (r2 != javax.crypto.spec.DHParameterSpec.class) goto L7;
        return this.j6;
    L7:
        throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to DH parameters object.");
    }

    protected boolean j6(java.lang.String r2) {
        if (r2 != null) goto L4;
        return true;
    L4:
        if (r2.equals("ASN.1") == true) goto L9;
        return false;
    L9:
        return true;
    }
}
