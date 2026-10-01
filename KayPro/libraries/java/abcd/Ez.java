package abcd;

public class Ez implements abcd.Jz {
    private abcd.Lz DW;
    private javax.net.ssl.SSLSocketFactory FH;
    private boolean Hw;
    private final io.fabric.sdk.android.m j6;

    public Ez() {
        this(new io.fabric.sdk.android.b());
    }

    public Ez(io.fabric.sdk.android.m r1) {
        this.j6 = r1;
    }

    private synchronized javax.net.ssl.SSLSocketFactory DW() {
        monitor-enter(this);
        this.Hw = true;     // Catch: java.lang.Throwable -> L13
        javax.net.ssl.SSLSocketFactory r0 = abcd.Kz.j6(this.DW);     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> L13
        this.j6.Hw("Fabric", "Custom SSL pinning enabled");     // Catch: java.lang.Exception -> L8 java.lang.Throwable -> L13
        monitor-exit(this);
        return r0;
    L8:
        e = move-exception;
        this.j6.FH("Fabric", "Exception while validating pinned certs", e);     // Catch: java.lang.Throwable -> L13
        return null;
    L13:
        th = move-exception;
        throw th;
    }

    private synchronized void FH() {
        monitor-enter(this);
        this.Hw = false;     // Catch: java.lang.Throwable -> L7
        this.FH = null;     // Catch: java.lang.Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    private synchronized javax.net.ssl.SSLSocketFactory j6() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.FH == null) goto L6;
    L8:
        javax.net.ssl.SSLSocketFactory r0 = this.FH;     // Catch: java.lang.Throwable -> L11
        monitor-exit(this);
        return r0;
    L6:
        if (this.Hw == true) goto L8;
        this.FH = DW();     // Catch: java.lang.Throwable -> L11
        goto L8
    }

    private boolean j6(java.lang.String r2) {
        if (r2 != null) goto L4;
    L6:
        return false;
    L4:
        if (r2.toLowerCase(java.util.Locale.US).startsWith("https") == false) goto L6;
        return true;
    }

    @Override
    public abcd.Hz j6(abcd.Fz r2, java.lang.String r3) {
        return j6(r2, r3, java.util.Collections.emptyMap());
    }

    @Override
    public abcd.Hz j6(abcd.Fz r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        int r6 = abcd.Dz.j6[r3.ordinal()];
        if (r6 != 1) goto L5;
        abcd.Hz r7 = abcd.Hz.j6(r4, r5, true);
    L17:
        if (j6(r4) == true) goto L19;
    L23:
        return r7;
    L19:
        if (this.DW == null) goto L23;
        javax.net.ssl.SSLSocketFactory r8 = j6();
        if (r8 == null) goto L23;
        ((javax.net.ssl.HttpsURLConnection) r7.tp()).setSSLSocketFactory(r8);
        goto L23
    L5:
        if (r6 != 2) goto L7;
        r7 = abcd.Hz.DW(r4, r5, true);
        goto L17
    L7:
        if (r6 != 3) goto L9;
        r7 = abcd.Hz.v5(r4);
        goto L17
    L9:
        if (r6 != 4) goto L12;
        r7 = abcd.Hz.j6(r4);
        goto L17
    L12:
        throw new java.lang.IllegalArgumentException("Unsupported HTTP method!");
    }

    @Override
    public void j6(abcd.Lz r2) {
        if (this.DW == r2) goto L6;
        this.DW = r2;
        FH();
        return;
    }
}
