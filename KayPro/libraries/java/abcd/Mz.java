package abcd;

class Mz implements javax.net.ssl.X509TrustManager {
    private static final java.security.cert.X509Certificate[] j6 = null;
    private final javax.net.ssl.TrustManager[] DW;
    private final abcd.Nz FH;
    private final long Hw;
    private final java.util.Set<java.security.cert.X509Certificate> Zo;
    private final java.util.List<byte[]> v5;

    static {
        j6 = new java.security.cert.X509Certificate[0];
    }

    public Mz(abcd.Nz r4, abcd.Lz r5) {
        java.lang.String[] r6 = null;
        int r7 = 0;
        int r0 = 0;
        java.lang.String r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.v5 = new java.util.LinkedList();
                    this.Zo = java.util.Collections.synchronizedSet(new java.util.HashSet());
                    this.DW = j6(r4);
                    this.FH = r4;
                    this.Hw = r5.Hw();
                    r6 = r5.FH();
                    r7 = r6.length;
                    r0 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 >= r7) { $pc0 = 5; continue $sw0; }
                    r1 = r6[r0];
                    this.v5.add(j6(r1));
                    r0 = r0 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.security.cert.X509Certificate[] r9) {
        java.security.cert.X509Certificate[] r10 = null;
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.Hw != (-1)) { $pc1 = 5; continue $sw1; }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r10 = abcd.Cz.j6(r9, this.FH);
                    r0 = r10.length;
                    r1 = 0;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (r1 >= r0) { $pc1 = 15; continue $sw1; }
                    if (j6(r10[r1]) == true) { $pc1 = 12; continue $sw1; }
                    r1 = r1 + 1;
                    { $pc1 = 9; continue $sw1; }
                }
                case 12: {
                    return;
                }
                case 15: {
                    throw new java.security.cert.CertificateException("No valid pins found in chain!");
                }
                case 5: {
                    if ((java.lang.System.currentTimeMillis() - this.Hw) <= 15552000000L) { $pc1 = 8; continue $sw1; }
                    io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Certificate pins are stale, (" + (java.lang.System.currentTimeMillis() - this.Hw) + " millis vs 15552000000 millis) falling back to system trust.");
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.security.cert.X509Certificate[] r5, java.lang.String r6) {
        javax.net.ssl.TrustManager[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.DW;
                    r1 = r0.length;
                    r2 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r2 >= r1) { $pc2 = 5; continue $sw2; }
                    ((javax.net.ssl.X509TrustManager) r0[r2]).checkServerTrusted(r5, r6);
                    r2 = r2 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(java.security.cert.X509Certificate r3) {
        byte[] r4 = null;
        java.util.Iterator<byte[]> r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        r4 = java.security.MessageDigest.getInstance("SHA1").digest(r3.getPublicKey().getEncoded());
                        r0 = this.v5.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc3 = 11; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc3 = 9; continue $sw3; }
                    if (java.util.Arrays.equals(r0.next(), r4) == false) { $pc3 = 4; continue $sw3; }
                    return true;
                }
                case 9: {
                    return false;
                }
                case 11: {
                    e = $ex3;
                    throw new java.security.cert.CertificateException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] j6(java.lang.String r8) {
        int r0 = 0;
        byte[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r8.length();
                    r1 = new byte[r0 / 2];
                    r2 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r2 >= r0) { $pc4 = 5; continue $sw4; }
                    r1[r2 / 2] = (byte) ((java.lang.Character.digit(r8.charAt(r2), 16) << 4) + java.lang.Character.digit(r8.charAt(r2 + 1), 16));
                    r2 = r2 + 2;
                    { $pc4 = 3; continue $sw4; }
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private javax.net.ssl.TrustManager[] j6(abcd.Nz r2) {
        javax.net.ssl.TrustManagerFactory r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    try {
                        r0 = javax.net.ssl.TrustManagerFactory.getInstance("X509");
                        r0.init(r2.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.security.KeyStoreException) { $pc5 = 4; continue $sw5; }
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc5 = 7; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0.getTrustManagers();
                }
                case 4: {
                    e = $ex5;
                    throw new java.lang.AssertionError(e);
                }
                case 7: {
                    e = $ex5;
                    throw new java.lang.AssertionError(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) {
        throw new java.security.cert.CertificateException("Client certificates not supported!");
    }

    @Override
    public void checkServerTrusted(java.security.cert.X509Certificate[] r4, java.lang.String r5) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.Zo.contains(r4[0]) == false) { $pc6 = 5; continue $sw6; }
                    return;
                }
                case 5: {
                    j6(r4, r5);
                    j6(r4);
                    this.Zo.add(r4[0]);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return j6;
    }
}
