package abcd;

public abstract class AbstractdP extends java.security.KeyFactorySpi implements abcd.InterfacelP {
    public AbstractdP() {
    }

    @Override
    protected java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec r2) {
        if ((r2 instanceof java.security.spec.PKCS8EncodedKeySpec) == false) goto L9;
        return generatePrivate(abcd.mN.j6(((java.security.spec.PKCS8EncodedKeySpec) r2).getEncoded()));
    L7:
        throw new java.security.spec.InvalidKeySpecException("encoded key spec not recognised");
    L9:
        throw new java.security.spec.InvalidKeySpecException("key spec not recognised");
    }

    @Override
    protected java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec r2) {
        if ((r2 instanceof java.security.spec.X509EncodedKeySpec) == false) goto L9;
        return generatePublic(abcd.CN.j6(((java.security.spec.X509EncodedKeySpec) r2).getEncoded()));
    L7:
        throw new java.security.spec.InvalidKeySpecException("encoded key spec not recognised");
    L9:
        throw new java.security.spec.InvalidKeySpecException("key spec not recognised");
    }

    @Override
    protected java.security.spec.KeySpec engineGetKeySpec(java.security.Key r4, java.lang.Class r5) {
        if (r5.isAssignableFrom(java.security.spec.PKCS8EncodedKeySpec.class) == false) goto L9;
        if (r4.getFormat().equals("PKCS#8") == false) goto L9;
        return new java.security.spec.PKCS8EncodedKeySpec(r4.getEncoded());
    L9:
        if (r5.isAssignableFrom(java.security.spec.X509EncodedKeySpec.class) == false) goto L15;
        if (r4.getFormat().equals("X.509") == false) goto L15;
        return new java.security.spec.X509EncodedKeySpec(r4.getEncoded());
    L15:
        throw new java.security.spec.InvalidKeySpecException("not implemented yet " + r4 + " " + r5);
    }
}
