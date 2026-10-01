package abcd;

class Nz {
    private final java.util.HashMap<java.security.Principal, java.security.cert.X509Certificate> DW;
    final java.security.KeyStore j6;

    public Nz(java.io.InputStream r1, java.lang.String r2) {
        java.security.KeyStore r3 = j6(r1, r2);
        this.DW = j6(r3);
        this.j6 = r3;
    }

    private java.security.KeyStore j6(java.io.InputStream r3, java.lang.String r4) {
        java.security.KeyStore r0 = java.security.KeyStore.getInstance("BKS");     // Catch: java.io.IOException -> L9 java.security.cert.CertificateException -> L12 java.security.NoSuchAlgorithmException -> L15 java.security.KeyStoreException -> L18
        java.io.BufferedInputStream r1 = new java.io.BufferedInputStream(r3);     // Catch: java.io.IOException -> L9 java.security.cert.CertificateException -> L12 java.security.NoSuchAlgorithmException -> L15 java.security.KeyStoreException -> L18
        r0.load(r1, r4.toCharArray());     // Catch: java.lang.Throwable -> L6
        r1.close();     // Catch: java.io.IOException -> L9 java.security.cert.CertificateException -> L12 java.security.NoSuchAlgorithmException -> L15 java.security.KeyStoreException -> L18
        return r0;
    L6:
        th = move-exception;
        r1.close();     // Catch: java.io.IOException -> L9 java.security.cert.CertificateException -> L12 java.security.NoSuchAlgorithmException -> L15 java.security.KeyStoreException -> L18
        throw th;     // Catch: java.io.IOException -> L9 java.security.cert.CertificateException -> L12 java.security.NoSuchAlgorithmException -> L15 java.security.KeyStoreException -> L18
    L9:
        e = move-exception;
        throw new java.lang.AssertionError(e);
    L18:
        e = move-exception;
        throw new java.lang.AssertionError(e);
    L15:
        e = move-exception;
        throw new java.lang.AssertionError(e);
    L12:
        e = move-exception;
        throw new java.lang.AssertionError(e);
    }

    private java.util.HashMap<java.security.Principal, java.security.cert.X509Certificate> j6(java.security.KeyStore r5) {
        java.util.HashMap<java.security.Principal, java.security.cert.X509Certificate> r0 = new java.util.HashMap();     // Catch: java.security.KeyStoreException -> L10
        java.util.Enumeration<java.lang.String> r1 = r5.aliases();     // Catch: java.security.KeyStoreException -> L10
    L4:
        if (r1.hasMoreElements() == false) goto L9;
        java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r5.getCertificate(r1.nextElement());     // Catch: java.security.KeyStoreException -> L10
        if (r2 == null) goto L4;
        r0.put(r2.getSubjectX500Principal(), r2);     // Catch: java.security.KeyStoreException -> L10
        goto L4
    L9:
        return r0;
    L10:
        e = move-exception;
        throw new java.lang.AssertionError(e);
    }

    public boolean DW(java.security.cert.X509Certificate r3) {
        java.security.cert.X509Certificate r0 = this.DW.get(r3.getSubjectX500Principal());
        if (r0 != null) goto L5;
    L7:
        return false;
    L5:
        if (r0.getPublicKey().equals(r3.getPublicKey()) == false) goto L7;
        return true;
    }

    public java.security.cert.X509Certificate j6(java.security.cert.X509Certificate r5) {
        java.security.cert.X509Certificate r0 = this.DW.get(r5.getIssuerX500Principal());
        if (r0 != null) goto L6;
        return null;
    L6:
        if (r0.getSubjectX500Principal().equals(r5.getSubjectX500Principal()) == false) goto L11;
        return null;
    L11:
        r5.verify(r0.getPublicKey());     // Catch: java.security.GeneralSecurityException -> L10
        return r0;
    L10:
        return null;
    }
}
