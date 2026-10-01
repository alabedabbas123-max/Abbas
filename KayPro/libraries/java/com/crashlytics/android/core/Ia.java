package com.crashlytics.android.core;

class Ia implements com.crashlytics.android.core.Interfacera {
    private final int DW;
    private io.fabric.sdk.android.services.common.z FH;
    private final java.io.File j6;

    public class a {
        public final int DW;
        final com.crashlytics.android.core.Ia FH;
        public final byte[] j6;

        public a(com.crashlytics.android.core.Ia r1, byte[] r2, int r3) {
            this.FH = r1;
            this.j6 = r2;
            this.DW = r3;
        }
    }

    public Ia(java.io.File r1, int r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    private void DW(long r5, java.lang.String r7) {
        int r1 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.FH != null) { $pc0 = 5; continue $sw0; }
                    return;
                }
                case 5: {
                    if (r7 != null) { $pc0 = 20; continue $sw0; }
                    r7 = "null";
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    try {
                        r1 = this.DW / 4;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r7.length() <= r1) { $pc0 = 10; continue $sw0; }
                    try {
                        r7 = "..." + r7.substring(r7.length() - r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    try {
                        this.FH.j6(java.lang.String.format(java.util.Locale.US, "%d %s%n", new java.lang.Object[]{java.lang.Long.valueOf(r5), r7.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes("UTF-8"));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    if (this.FH.DW() == true) { $pc0 = 24; continue $sw0; }
                    if (this.FH.Hw() <= this.DW) { $pc0 = 25; continue $sw0; }
                    try {
                        this.FH.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 11; continue $sw0; }
                }
                case 25: {
                    return;
                }
                case 24: {
                    return;
                }
                case 17: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Zo() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.FH != null) { $pc1 = 11; continue $sw1; }
                    try {
                        this.FH = new io.fabric.sdk.android.services.common.z(this.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 6; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 6: {
                    e = $ex1;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Could not open log file: " + this.j6, e);
                    return;
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private com.crashlytics.android.core.Ia.a v5() {
        io.fabric.sdk.android.services.common.z r0 = null;
        int[] r1 = null;
        byte[] r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.j6.exists() == true) { $pc2 = 5; continue $sw2; }
                    return null;
                }
                case 5: {
                    Zo();
                    r0 = this.FH;
                    if (r0 != null) { $pc2 = 8; continue $sw2; }
                    return null;
                }
                case 8: {
                    r1 = new int[]{0};
                    r2 = new byte[r0.Hw()];
                    try {
                        this.FH.j6(new com.crashlytics.android.core.Ha(this, r2, r1));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 11; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    return new com.crashlytics.android.core.Ia.a(this, r2, r1[0]);
                }
                case 11: {
                    e = $ex2;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", e);
                    { $pc2 = 14; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public com.crashlytics.android.core.ClassD DW() {
        com.crashlytics.android.core.Ia.a r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = v5();
                    if (r0 != null) { $pc3 = 6; continue $sw3; }
                    return null;
                }
                case 6: {
                    return com.crashlytics.android.core.ClassD.j6(r0.j6, 0, r0.DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public byte[] FH() {
        com.crashlytics.android.core.Ia.a r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = v5();
                    if (r0 != null) { $pc4 = 6; continue $sw4; }
                    return null;
                }
                case 6: {
                    return r0.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void Hw() {
        j6();
        this.j6.delete();
    }

    @Override
    public void j6() {
        io.fabric.sdk.android.services.common.i.j6(this.FH, "There was a problem closing the Crashlytics log file.");
        this.FH = null;
    }

    @Override
    public void j6(long r1, java.lang.String r3) {
        Zo();
        DW(r1, r3);
    }
}
