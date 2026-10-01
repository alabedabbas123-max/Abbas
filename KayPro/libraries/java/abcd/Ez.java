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
        javax.net.ssl.SSLSocketFactory r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    monitor-enter(this);
                    try {
                        this.Hw = true;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    try {
                        r0 = abcd.Kz.j6(this.DW);
                        this.j6.Hw("Fabric", "Custom SSL pinning enabled");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 8; continue $sw0; }
                        $pc0 = 13; continue $sw0;
                    }
                    monitor-exit(this);
                    return r0;
                }
                case 8: {
                    e = $ex0;
                    try {
                        this.j6.FH("Fabric", "Exception while validating pinned certs", e);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    return null;
                }
                case 13: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private synchronized void FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    monitor-enter(this);
                    try {
                        this.Hw = false;
                        this.FH = null;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    monitor-exit(this);
                    return;
                }
                case 7: {
                    th = $ex1;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private synchronized javax.net.ssl.SSLSocketFactory j6() {
        javax.net.ssl.SSLSocketFactory r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    monitor-enter(this);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    th = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (this.FH == null) { $pc2 = 6; continue $sw2; }
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    try {
                        r0 = this.FH;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    monitor-exit(this);
                    return r0;
                }
                case 6: {
                    if (this.Hw == true) { $pc2 = 8; continue $sw2; }
                    try {
                        this.FH = DW();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 11; continue $sw2;
                    }
                    { $pc2 = 8; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(java.lang.String r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r2 != null) { $pc3 = 4; continue $sw3; }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return false;
                }
                case 4: {
                    if (r2.toLowerCase(java.util.Locale.US).startsWith("https") == false) { $pc3 = 6; continue $sw3; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Hz j6(abcd.Fz r2, java.lang.String r3) {
        return j6(r2, r3, java.util.Collections.emptyMap());
    }

    @Override
    public abcd.Hz j6(abcd.Fz r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        int r6 = 0;
        abcd.Hz r7 = null;
        javax.net.ssl.SSLSocketFactory r8 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r6 = abcd.Dz.j6[r3.ordinal()];
                    if (r6 != 1) { $pc4 = 5; continue $sw4; }
                    r7 = abcd.Hz.j6(r4, r5, true);
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    if (j6(r4) == true) { $pc4 = 19; continue $sw4; }
                    $pc4 = 23; continue $sw4;
                }
                case 23: {
                    return r7;
                }
                case 19: {
                    if (this.DW == null) { $pc4 = 23; continue $sw4; }
                    r8 = j6();
                    if (r8 == null) { $pc4 = 23; continue $sw4; }
                    ((javax.net.ssl.HttpsURLConnection) r7.tp()).setSSLSocketFactory(r8);
                    { $pc4 = 23; continue $sw4; }
                }
                case 5: {
                    if (r6 != 2) { $pc4 = 7; continue $sw4; }
                    r7 = abcd.Hz.DW(r4, r5, true);
                    { $pc4 = 17; continue $sw4; }
                }
                case 7: {
                    if (r6 != 3) { $pc4 = 9; continue $sw4; }
                    r7 = abcd.Hz.v5(r4);
                    { $pc4 = 17; continue $sw4; }
                }
                case 9: {
                    if (r6 != 4) { $pc4 = 12; continue $sw4; }
                    r7 = abcd.Hz.j6(r4);
                    { $pc4 = 17; continue $sw4; }
                }
                case 12: {
                    throw new java.lang.IllegalArgumentException("Unsupported HTTP method!");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Lz r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.DW == r2) { $pc5 = 6; continue $sw5; }
                    this.DW = r2;
                    FH();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
