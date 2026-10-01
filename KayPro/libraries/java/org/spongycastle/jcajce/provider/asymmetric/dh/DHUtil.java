package org.spongycastle.jcajce.provider.asymmetric.dh;

public class DHUtil {
    public DHUtil() {
    }

    public static abcd.PO generatePrivateKeyParameter(java.security.PrivateKey r6) {
        javax.crypto.interfaces.DHPrivateKey r7 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r6 instanceof javax.crypto.interfaces.DHPrivateKey) == false) { $pc0 = 7; continue $sw0; }
                    r7 = (javax.crypto.interfaces.DHPrivateKey) r6;
                    return new abcd.UO(r7.getX(), new abcd.TO(r7.getParams().getP(), r7.getParams().getG(), null, r7.getParams().getL()));
                }
                case 7: {
                    throw new java.security.InvalidKeyException("can't identify DH private key.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.PO generatePublicKeyParameter(java.security.PublicKey r6) {
        javax.crypto.interfaces.DHPublicKey r7 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r6 instanceof javax.crypto.interfaces.DHPublicKey) == false) { $pc1 = 7; continue $sw1; }
                    r7 = (javax.crypto.interfaces.DHPublicKey) r6;
                    return new abcd.VO(r7.getY(), new abcd.TO(r7.getParams().getP(), r7.getParams().getG(), null, r7.getParams().getL()));
                }
                case 7: {
                    throw new java.security.InvalidKeyException("can't identify DH public key.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
