package abcd;

public abstract class AbstractdP extends java.security.KeyFactorySpi implements abcd.InterfacelP {
    public AbstractdP() {
    }

    @Override
    protected java.security.PrivateKey engineGeneratePrivate(java.security.spec.KeySpec r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r2 instanceof java.security.spec.PKCS8EncodedKeySpec) == false) { $pc0 = 9; continue $sw0; }
                    return generatePrivate(abcd.mN.j6(((java.security.spec.PKCS8EncodedKeySpec) r2).getEncoded()));
                }
                case 7: {
                    throw new java.security.spec.InvalidKeySpecException("encoded key spec not recognised");
                }
                case 9: {
                    throw new java.security.spec.InvalidKeySpecException("key spec not recognised");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected java.security.PublicKey engineGeneratePublic(java.security.spec.KeySpec r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r2 instanceof java.security.spec.X509EncodedKeySpec) == false) { $pc1 = 9; continue $sw1; }
                    return generatePublic(abcd.CN.j6(((java.security.spec.X509EncodedKeySpec) r2).getEncoded()));
                }
                case 7: {
                    throw new java.security.spec.InvalidKeySpecException("encoded key spec not recognised");
                }
                case 9: {
                    throw new java.security.spec.InvalidKeySpecException("key spec not recognised");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected java.security.spec.KeySpec engineGetKeySpec(java.security.Key r4, java.lang.Class r5) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5.isAssignableFrom(java.security.spec.PKCS8EncodedKeySpec.class) == false) { $pc2 = 9; continue $sw2; }
                    if (r4.getFormat().equals("PKCS#8") == false) { $pc2 = 9; continue $sw2; }
                    return new java.security.spec.PKCS8EncodedKeySpec(r4.getEncoded());
                }
                case 9: {
                    if (r5.isAssignableFrom(java.security.spec.X509EncodedKeySpec.class) == false) { $pc2 = 15; continue $sw2; }
                    if (r4.getFormat().equals("X.509") == false) { $pc2 = 15; continue $sw2; }
                    return new java.security.spec.X509EncodedKeySpec(r4.getEncoded());
                }
                case 15: {
                    throw new java.security.spec.InvalidKeySpecException("not implemented yet " + r4 + " " + r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
