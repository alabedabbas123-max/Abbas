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
        java.security.KeyStore r0 = null;
        java.io.BufferedInputStream r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r0 = java.security.KeyStore.getInstance("BKS");
                        r1 = new java.io.BufferedInputStream(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 9; continue $sw0; }
                        if ($t instanceof java.security.cert.CertificateException) { $pc0 = 12; continue $sw0; }
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc0 = 15; continue $sw0; }
                        if ($t instanceof java.security.KeyStoreException) { $pc0 = 18; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r0.load(r1, r4.toCharArray());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 6; continue $sw0;
                    }
                    try {
                        r1.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 9; continue $sw0; }
                        if ($t instanceof java.security.cert.CertificateException) { $pc0 = 12; continue $sw0; }
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc0 = 15; continue $sw0; }
                        if ($t instanceof java.security.KeyStoreException) { $pc0 = 18; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0;
                }
                case 6: {
                    th = $ex0;
                    try {
                        r1.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 9; continue $sw0; }
                        if ($t instanceof java.security.cert.CertificateException) { $pc0 = 12; continue $sw0; }
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc0 = 15; continue $sw0; }
                        if ($t instanceof java.security.KeyStoreException) { $pc0 = 18; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 9: {
                    e = $ex0;
                    throw new java.lang.AssertionError(e);
                }
                case 18: {
                    e = $ex0;
                    throw new java.lang.AssertionError(e);
                }
                case 15: {
                    e = $ex0;
                    throw new java.lang.AssertionError(e);
                }
                case 12: {
                    e = $ex0;
                    throw new java.lang.AssertionError(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.util.HashMap<java.security.Principal, java.security.cert.X509Certificate> j6(java.security.KeyStore r5) {
        java.util.HashMap<java.security.Principal, java.security.cert.X509Certificate> r0 = null;
        java.util.Enumeration<java.lang.String> r1 = null;
        java.security.cert.X509Certificate r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        r0 = new java.util.HashMap();
                        r1 = r5.aliases();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.security.KeyStoreException) { $pc1 = 10; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1.hasMoreElements() == false) { $pc1 = 9; continue $sw1; }
                    try {
                        r2 = (java.security.cert.X509Certificate) r5.getCertificate(r1.nextElement());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.security.KeyStoreException) { $pc1 = 10; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 == null) { $pc1 = 4; continue $sw1; }
                    try {
                        r0.put(r2.getSubjectX500Principal(), r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.security.KeyStoreException) { $pc1 = 10; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc1 = 4; continue $sw1; }
                }
                case 9: {
                    return r0;
                }
                case 10: {
                    e = $ex1;
                    throw new java.lang.AssertionError(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW(java.security.cert.X509Certificate r3) {
        java.security.cert.X509Certificate r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.DW.get(r3.getSubjectX500Principal());
                    if (r0 != null) { $pc2 = 5; continue $sw2; }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r0.getPublicKey().equals(r3.getPublicKey()) == false) { $pc2 = 7; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.security.cert.X509Certificate j6(java.security.cert.X509Certificate r5) {
        java.security.cert.X509Certificate r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.DW.get(r5.getIssuerX500Principal());
                    if (r0 != null) { $pc3 = 6; continue $sw3; }
                    return null;
                }
                case 6: {
                    if (r0.getSubjectX500Principal().equals(r5.getSubjectX500Principal()) == false) { $pc3 = 11; continue $sw3; }
                    return null;
                }
                case 11: {
                    try {
                        r5.verify(r0.getPublicKey());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.security.GeneralSecurityException) { $pc3 = 10; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0;
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
