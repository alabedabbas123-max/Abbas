package abcd;

final class Cz {
    private static boolean j6(java.security.cert.X509Certificate r2, java.security.cert.X509Certificate r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2.getSubjectX500Principal().equals(r3.getIssuerX500Principal()) == true) { $pc0 = 9; continue $sw0; }
                    return false;
                }
                case 9: {
                    try {
                        r3.verify(r2.getPublicKey());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.security.GeneralSecurityException) { $pc0 = 8; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return true;
                }
                case 8: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.security.cert.X509Certificate[] j6(java.security.cert.X509Certificate[] r6, abcd.Nz r7) {
        java.util.LinkedList r0 = null;
        boolean r2 = false;
        boolean r1 = false;
        boolean r3 = false;
        int r4 = 0;
        java.security.cert.X509Certificate r8 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.util.LinkedList();
                    r2 = r7.DW(r6[0]);
                    r0.add(r6[0]);
                    r1 = true;
                    r3 = r2;
                    r4 = 1;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r4 >= r6.length) { $pc1 = 11; continue $sw1; }
                    if (r7.DW(r6[r4]) == false) { $pc1 = 9; continue $sw1; }
                    r3 = true;
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    if (j6(r6[r4], r6[r4 - 1]) == false) { $pc1 = 11; continue $sw1; }
                    r0.add(r6[r4]);
                    r4 = r4 + 1;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    r8 = r7.j6(r6[r4 - 1]);
                    if (r8 == null) { $pc1 = 14; continue $sw1; }
                    r0.add(r8);
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    if (r1 == false) { $pc1 = 19; continue $sw1; }
                    return (java.security.cert.X509Certificate[]) r0.toArray(new java.security.cert.X509Certificate[r0.size()]);
                }
                case 19: {
                    throw new java.security.cert.CertificateException("Didn't find a trust anchor in chain cleanup!");
                }
                case 14: {
                    r1 = r3;
                    { $pc1 = 15; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
