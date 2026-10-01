package org.spongycastle.jcajce.provider.digest;

public class SHA1 {

    public static class Digest extends org.spongycastle.jcajce.provider.digest.a implements java.lang.Cloneable {
        public Digest() {
            super(new abcd.FO());
        }

        @Override
        public java.lang.Object clone() {
            org.spongycastle.jcajce.provider.digest.SHA1.Digest r0 = (org.spongycastle.jcajce.provider.digest.SHA1.Digest) super.clone();
            r0.j6 = new abcd.FO((abcd.FO) this.j6);
            return r0;
        }
    }

    public static class Mappings extends org.spongycastle.jcajce.provider.digest.b {
        private static final java.lang.String j6 = null;

        static {
            j6 = org.spongycastle.jcajce.provider.digest.SHA1.class.getName();
        }

        public Mappings() {
        }

        @Override
        public void configure(abcd.InterfacegP r4) {
            r4.j6("MessageDigest.SHA-1", java.lang.String.valueOf(j6) + "$Digest");
            r4.j6("Alg.Alias.MessageDigest.SHA1", "SHA-1");
            r4.j6("Alg.Alias.MessageDigest.SHA", "SHA-1");
            r4.j6("Alg.Alias.MessageDigest." + abcd.InterfacejN.u7, "SHA-1");
            j6(r4, "SHA1", java.lang.String.valueOf(j6) + "$HashMac", java.lang.String.valueOf(j6) + "$KeyGenerator");
            j6(r4, "SHA1", abcd.InterfacelN.KD);
            j6(r4, "SHA1", abcd.InterfacebN.FH);
        }
    }

    public SHA1() {
    }
}
