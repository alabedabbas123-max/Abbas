package abcd;

public class TN extends abcd.QP {
    public TN(java.util.Collection r1) {
        super(j6(r1));
    }

    private static java.util.Collection j6(java.util.Collection r3) {
        java.util.ArrayList r0 = new java.util.ArrayList(r3.size());
        java.util.Iterator r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L5;
        java.lang.Object r1 = r4.next();
        if ((r1 instanceof java.security.cert.X509Certificate) == true) goto L15;
        r0.add((abcd.SN) r1);
        goto L4
    L15:
        r0.add(new abcd.SN(((java.security.cert.X509Certificate) r1).getEncoded()));     // Catch: java.io.IOException -> L11
    L11:
        e = move-exception;
        throw new java.security.cert.CertificateEncodingException("unable to read encoding: " + e.getMessage());
    L5:
        return r0;
    }
}
