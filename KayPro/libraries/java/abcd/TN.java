package abcd;

public class TN extends abcd.QP {
    public TN(java.util.Collection r1) {
        super(j6(r1));
    }

    private static java.util.Collection j6(java.util.Collection r3) {
        java.util.ArrayList r0 = null;
        java.util.Iterator r4 = null;
        java.lang.Object r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.ArrayList(r3.size());
                    r4 = r3.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc0 = 5; continue $sw0; }
                    r1 = r4.next();
                    if ((r1 instanceof java.security.cert.X509Certificate) == true) { $pc0 = 15; continue $sw0; }
                    r0.add((abcd.SN) r1);
                    { $pc0 = 4; continue $sw0; }
                }
                case 15: {
                    try {
                        r0.add(new abcd.SN(((java.security.cert.X509Certificate) r1).getEncoded()));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 11; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 11: {
                    e = $ex0;
                    throw new java.security.cert.CertificateEncodingException("unable to read encoding: " + e.getMessage());
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
