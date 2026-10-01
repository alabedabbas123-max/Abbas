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
        this.v5 = new java.util.LinkedList();
        this.Zo = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.DW = j6(r4);
        this.FH = r4;
        this.Hw = r5.Hw();
        java.lang.String[] r6 = r5.FH();
        int r7 = r6.length;
        int r0 = 0;
    L3:
        if (r0 >= r7) goto L5;
        java.lang.String r1 = r6[r0];
        this.v5.add(j6(r1));
        r0 = r0 + 1;
        goto L3
    }

    private void j6(java.security.cert.X509Certificate[] r9) {
        if (this.Hw != (-1)) goto L5;
    L8:
        java.security.cert.X509Certificate[] r10 = abcd.Cz.j6(r9, this.FH);
        int r0 = r10.length;
        int r1 = 0;
    L9:
        if (r1 >= r0) goto L15;
        if (j6(r10[r1]) == true) goto L12;
        r1 = r1 + 1;
        goto L9
    L12:
        return;
    L15:
        throw new java.security.cert.CertificateException("No valid pins found in chain!");
    L5:
        if ((java.lang.System.currentTimeMillis() - this.Hw) <= 15552000000L) goto L8;
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Certificate pins are stale, (" + (java.lang.System.currentTimeMillis() - this.Hw) + " millis vs 15552000000 millis) falling back to system trust.");
    }

    private void j6(java.security.cert.X509Certificate[] r5, java.lang.String r6) {
        javax.net.ssl.TrustManager[] r0 = this.DW;
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        ((javax.net.ssl.X509TrustManager) r0[r2]).checkServerTrusted(r5, r6);
        r2 = r2 + 1;
        goto L3
    }

    private boolean j6(java.security.cert.X509Certificate r3) {
        byte[] r4 = java.security.MessageDigest.getInstance("SHA1").digest(r3.getPublicKey().getEncoded());     // Catch: java.security.NoSuchAlgorithmException -> L11
        java.util.Iterator<byte[]> r0 = this.v5.iterator();     // Catch: java.security.NoSuchAlgorithmException -> L11
    L4:
        if (r0.hasNext() == false) goto L9;
        if (java.util.Arrays.equals(r0.next(), r4) == false) goto L4;
        return true;
    L9:
        return false;
    L11:
        e = move-exception;
        throw new java.security.cert.CertificateException(e);
    }

    private byte[] j6(java.lang.String r8) {
        int r0 = r8.length();
        byte[] r1 = new byte[r0 / 2];
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        r1[r2 / 2] = (byte) ((java.lang.Character.digit(r8.charAt(r2), 16) << 4) + java.lang.Character.digit(r8.charAt(r2 + 1), 16));
        r2 = r2 + 2;
        goto L3
    L5:
        return r1;
    }

    private javax.net.ssl.TrustManager[] j6(abcd.Nz r2) {
        javax.net.ssl.TrustManagerFactory r0 = javax.net.ssl.TrustManagerFactory.getInstance("X509");     // Catch: java.security.KeyStoreException -> L4 java.security.NoSuchAlgorithmException -> L7
        r0.init(r2.j6);     // Catch: java.security.KeyStoreException -> L4 java.security.NoSuchAlgorithmException -> L7
        return r0.getTrustManagers();
    L4:
        e = move-exception;
        throw new java.lang.AssertionError(e);
    L7:
        e = move-exception;
        throw new java.lang.AssertionError(e);
    }

    @Override
    public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) {
        throw new java.security.cert.CertificateException("Client certificates not supported!");
    }

    @Override
    public void checkServerTrusted(java.security.cert.X509Certificate[] r4, java.lang.String r5) {
        if (this.Zo.contains(r4[0]) == false) goto L5;
        return;
    L5:
        j6(r4, r5);
        j6(r4);
        this.Zo.add(r4[0]);
    }

    @Override
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return j6;
    }
}
