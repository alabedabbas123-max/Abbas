package org.spongycastle.jcajce.provider.digest;

abstract class b extends abcd.AbstractjP {
    b() {
    }

    protected void j6(abcd.InterfacegP r3, java.lang.String r4, abcd.zL r5) {
        java.lang.String r6 = "HMAC" + r4;
        r3.j6("Alg.Alias.Mac." + r5, r6);
        r3.j6("Alg.Alias.KeyGenerator." + r5, r6);
    }

    protected void j6(abcd.InterfacegP r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        java.lang.String r0 = "HMAC" + r5;
        r4.j6("Mac." + r0, r6);
        r4.j6("Alg.Alias.Mac.HMAC-" + r5, r0);
        r4.j6("Alg.Alias.Mac.HMAC/" + r5, r0);
        r4.j6("KeyGenerator." + r0, r7);
        r4.j6("Alg.Alias.KeyGenerator.HMAC-" + r5, r0);
        r4.j6("Alg.Alias.KeyGenerator.HMAC/" + r5, r0);
    }
}
