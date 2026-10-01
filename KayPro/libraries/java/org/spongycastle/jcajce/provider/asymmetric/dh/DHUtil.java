package org.spongycastle.jcajce.provider.asymmetric.dh;

public class DHUtil {
    public DHUtil() {
    }

    public static abcd.PO generatePrivateKeyParameter(java.security.PrivateKey r6) {
        if ((r6 instanceof javax.crypto.interfaces.DHPrivateKey) == false) goto L7;
        javax.crypto.interfaces.DHPrivateKey r7 = (javax.crypto.interfaces.DHPrivateKey) r6;
        return new abcd.UO(r7.getX(), new abcd.TO(r7.getParams().getP(), r7.getParams().getG(), null, r7.getParams().getL()));
    L7:
        throw new java.security.InvalidKeyException("can't identify DH private key.");
    }

    public static abcd.PO generatePublicKeyParameter(java.security.PublicKey r6) {
        if ((r6 instanceof javax.crypto.interfaces.DHPublicKey) == false) goto L7;
        javax.crypto.interfaces.DHPublicKey r7 = (javax.crypto.interfaces.DHPublicKey) r6;
        return new abcd.VO(r7.getY(), new abcd.TO(r7.getParams().getP(), r7.getParams().getG(), null, r7.getParams().getL()));
    L7:
        throw new java.security.InvalidKeyException("can't identify DH public key.");
    }
}
