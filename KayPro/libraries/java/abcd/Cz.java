package abcd;

final class Cz {
    private static boolean j6(java.security.cert.X509Certificate r2, java.security.cert.X509Certificate r3) {
        if (r2.getSubjectX500Principal().equals(r3.getIssuerX500Principal()) == true) goto L9;
        return false;
    L9:
        r3.verify(r2.getPublicKey());     // Catch: java.security.GeneralSecurityException -> L8
        return true;
    L8:
        return false;
    }

    public static java.security.cert.X509Certificate[] j6(java.security.cert.X509Certificate[] r6, abcd.Nz r7) {
        java.util.LinkedList r0 = new java.util.LinkedList();
        boolean r2 = r7.DW(r6[0]);
        r0.add(r6[0]);
        boolean r1 = true;
        boolean r3 = r2;
        int r4 = 1;
    L4:
        if (r4 >= r6.length) goto L11;
        if (r7.DW(r6[r4]) == false) goto L9;
        r3 = true;
    L9:
        if (j6(r6[r4], r6[r4 - 1]) == false) goto L11;
        r0.add(r6[r4]);
        r4 = r4 + 1;
    L11:
        java.security.cert.X509Certificate r8 = r7.j6(r6[r4 - 1]);
        if (r8 == null) goto L14;
        r0.add(r8);
    L15:
        if (r1 == false) goto L19;
        return (java.security.cert.X509Certificate[]) r0.toArray(new java.security.cert.X509Certificate[r0.size()]);
    L19:
        throw new java.security.cert.CertificateException("Didn't find a trust anchor in chain cleanup!");
    L14:
        r1 = r3;
        goto L15
    }
}
