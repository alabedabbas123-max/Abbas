package com.crashlytics.android.core;

class La {
    private static final short[] DW = null;
    static final java.util.Map<java.lang.String, java.lang.String> j6 = null;
    private final java.lang.Object FH;
    private final com.crashlytics.android.core.Interfaceka Hw;
    private final com.crashlytics.android.core.La.b VH;
    private final com.crashlytics.android.core.La.c Zo;
    private java.lang.Thread gn;
    private final java.lang.String v5;

    static final class a implements com.crashlytics.android.core.La.d {
        a() {
        }

        @Override
        public boolean j6() {
            return true;
        }
    }

    interface b {
        boolean j6();
    }

    interface c {
        java.io.File[] DW();

        java.io.File[] FH();

        java.io.File[] j6();
    }

    interface d {
        boolean j6();
    }

    private class e extends io.fabric.sdk.android.services.common.g {
        private final com.crashlytics.android.core.La.d DW;
        final com.crashlytics.android.core.La FH;
        private final float j6;

        e(com.crashlytics.android.core.La r1, float r2, com.crashlytics.android.core.La.d r3) {
            this.FH = r1;
            this.j6 = r2;
            this.DW = r3;
        }

        private void DW() {
            float r0 = 0.0f;
            java.util.List<com.crashlytics.android.core.Ka> r1 = null;
            int r2 = 0;
            java.util.Iterator<com.crashlytics.android.core.Ka> r3 = null;
            int r4 = 0;
            long r5 = 0L;
            java.util.Iterator<com.crashlytics.android.core.Ka> r6 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Starting report processing in " + this.j6 + " second(s)...");
                        r0 = this.j6;
                        if (r0 > 0.0f) { $pc0 = 40; continue $sw0; }
                        $pc0 = 9; continue $sw0;
                    }
                    case 9: {
                        r1 = this.FH.DW();
                        if (com.crashlytics.android.core.La.j6(this.FH).j6() == false) { $pc0 = 13; continue $sw0; }
                        return;
                    }
                    case 13: {
                        if (r1.isEmpty() == false) { $pc0 = 15; continue $sw0; }
                        $pc0 = 21; continue $sw0;
                    }
                    case 21: {
                        r2 = 0;
                        $pc0 = 23; continue $sw0;
                    }
                    case 23: {
                        if (r1.isEmpty() == true) { $pc0 = 50; continue $sw0; }
                        if (com.crashlytics.android.core.La.j6(this.FH).j6() == true) { $pc0 = 26; continue $sw0; }
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Attempting to send " + r1.size() + " report(s)");
                        r3 = r1.iterator();
                        $pc0 = 29; continue $sw0;
                    }
                    case 29: {
                        if (r3.hasNext() == false) { $pc0 = 31; continue $sw0; }
                        this.FH.j6(r3.next());
                        { $pc0 = 29; continue $sw0; }
                    }
                    case 31: {
                        r1 = this.FH.DW();
                        if (r1.isEmpty() == true) { $pc0 = 23; continue $sw0; }
                        r4 = r2 + 1;
                        r5 = com.crashlytics.android.core.La.j6()[java.lang.Math.min(r2, com.crashlytics.android.core.La.j6().length - 1)];
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Report submisson: scheduling delayed retry in " + r5 + " seconds");
                        try {
                            java.lang.Thread.sleep(r5 * 1000);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 36; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        r2 = r4;
                        $pc0 = 36; continue $sw0;
                    }
                    case 36: {
                        java.lang.Thread.currentThread().interrupt();
                        return;
                    }
                    case 26: {
                        return;
                    }
                    case 50: {
                        return;
                    }
                    case 15: {
                        if (this.DW.j6() == true) { $pc0 = 21; continue $sw0; }
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "User declined to send. Removing " + r1.size() + " Report(s).");
                        r6 = r1.iterator();
                        $pc0 = 18; continue $sw0;
                    }
                    case 18: {
                        if (r6.hasNext() == false) { $pc0 = 20; continue $sw0; }
                        r6.next().remove();
                        { $pc0 = 18; continue $sw0; }
                    }
                    case 20: {
                        return;
                    }
                    case 40: {
                        try {
                            java.lang.Thread.sleep((long) (r0 * 1000.0f));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc0 = 7; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc0 = 7; continue $sw0;
                    }
                    case 7: {
                        java.lang.Thread.currentThread().interrupt();
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void j6() {
            java.lang.Throwable e = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        try {
                            DW();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Exception) { $pc1 = 4; continue $sw1; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        com.crashlytics.android.core.La.j6(this.FH, null);
                        return;
                    }
                    case 4: {
                        e = $ex1;
                        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", e);
                        { $pc1 = 6; continue $sw1; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        j6 = java.util.Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", "1");
        DW = new short[]{10, 20, 30, 60, 120, 300};
    }

    public La(java.lang.String r2, com.crashlytics.android.core.Interfaceka r3, com.crashlytics.android.core.La.c r4, com.crashlytics.android.core.La.b r5) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.FH = new java.lang.Object();
                    if (r3 == null) { $pc2 = 7; continue $sw2; }
                    this.Hw = r3;
                    this.v5 = r2;
                    this.Zo = r4;
                    this.VH = r5;
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("createReportCall must not be null.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.crashlytics.android.core.La.b j6(com.crashlytics.android.core.La r0) {
        return r0.VH;
    }

    static java.lang.Thread j6(com.crashlytics.android.core.La r0, java.lang.Thread r1) {
        r0.gn = r1;
        return r1;
    }

    static short[] j6() {
        return DW;
    }

    java.util.List<com.crashlytics.android.core.Ka> DW() {
        java.lang.Object r0 = null;
        java.io.File[] r1 = null;
        java.io.File[] r2 = null;
        java.io.File[] r3 = null;
        java.util.LinkedList r4 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        java.io.File r8 = null;
        java.util.HashMap r9 = null;
        int r10 = 0;
        int r11 = 0;
        java.io.File r12 = null;
        java.lang.String r13 = null;
        java.util.Iterator r14 = null;
        java.lang.String r15 = null;
        java.util.List r16 = null;
        int r17 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Checking for crash reports...");
                    r0 = this.FH;
                    monitor-enter(r0);
                    try {
                        r1 = this.Zo.FH();
                        r2 = this.Zo.DW();
                        r3 = this.Zo.j6();
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 31; continue $sw3;
                    }
                    r4 = new java.util.LinkedList();
                    r5 = 0;
                    if (r1 == null) { $pc3 = 11; continue $sw3; }
                    r6 = r1.length;
                    r7 = 0;
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    if (r7 >= r6) { $pc3 = 11; continue $sw3; }
                    r8 = r1[r7];
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Found crash report " + r8.getPath());
                    r4.add(new com.crashlytics.android.core.Oa(r8));
                    r7 = r7 + 1;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    r9 = new java.util.HashMap();
                    if (r2 == null) { $pc3 = 19; continue $sw3; }
                    r10 = r2.length;
                    r11 = 0;
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    if (r11 >= r10) { $pc3 = 19; continue $sw3; }
                    r12 = r2[r11];
                    r13 = com.crashlytics.android.core.W.j6(r12);
                    if (r9.containsKey(r13) == true) { $pc3 = 18; continue $sw3; }
                    r9.put(r13, new java.util.LinkedList());
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    ((java.util.List) r9.get(r13)).add(r12);
                    r11 = r11 + 1;
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    r14 = r9.keySet().iterator();
                    $pc3 = 21; continue $sw3;
                }
                case 21: {
                    if (r14.hasNext() == false) { $pc3 = 23; continue $sw3; }
                    r15 = (java.lang.String) r14.next();
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Found invalid session: " + r15);
                    r16 = (java.util.List) r9.get(r15);
                    r4.add(new com.crashlytics.android.core.sa(r15, (java.io.File[]) r16.toArray(new java.io.File[r16.size()])));
                    { $pc3 = 21; continue $sw3; }
                }
                case 23: {
                    if (r3 == null) { $pc3 = 28; continue $sw3; }
                    r17 = r3.length;
                    $pc3 = 25; continue $sw3;
                }
                case 25: {
                    if (r5 >= r17) { $pc3 = 28; continue $sw3; }
                    r4.add(new com.crashlytics.android.core.Ca(r3[r5]));
                    r5 = r5 + 1;
                    $pc3 = 28; continue $sw3;
                }
                case 28: {
                    if (r4.isEmpty() == false) { $pc3 = 30; continue $sw3; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "No reports found.");
                    $pc3 = 30; continue $sw3;
                }
                case 30: {
                    return r4;
                }
                case 31: {
                    th = $ex3;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public synchronized void j6(float r2, com.crashlytics.android.core.La.d r3) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    monitor-enter(this);
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    th = $ex4;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (this.gn == null) { $pc4 = 8; continue $sw4; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Report upload has already been started.");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    monitor-exit(this);
                    return;
                }
                case 8: {
                    try {
                        this.gn = new java.lang.Thread(new com.crashlytics.android.core.La.e(this, r2, r3), "Crashlytics Report Uploader");
                        this.gn.start();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 11; continue $sw4;
                    }
                    monitor-exit(this);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean j6(com.crashlytics.android.core.Ka r8) {
        java.lang.Object r0 = null;
        boolean r1 = false;
        boolean r2 = false;
        io.fabric.sdk.android.m r3 = null;
        java.lang.StringBuilder r5 = null;
        java.lang.String r6 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.FH;
                    monitor-enter(r0);
                    r1 = false;
                    try {
                        r2 = this.Hw.j6(new com.crashlytics.android.core.ja(this.v5, r8));
                        r3 = io.fabric.sdk.android.Fabric.getLogger();
                        r5 = new java.lang.StringBuilder();
                        r5.append("Crashlytics report upload ");
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 15; continue $sw5; }
                        $pc5 = 13; continue $sw5;
                    }
                    if (r2 == false) { $pc5 = 8; continue $sw5; }
                    r6 = "complete: ";
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    try {
                        r5.append(r6);
                        r5.append(r8.DW());
                        r3.v5("CrashlyticsCore", r5.toString());
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 15; continue $sw5; }
                        $pc5 = 13; continue $sw5;
                    }
                    if (r2 == false) { $pc5 = 17; continue $sw5; }
                    try {
                        r8.remove();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.Exception) { $pc5 = 15; continue $sw5; }
                        $pc5 = 13; continue $sw5;
                    }
                    r1 = true;
                    { $pc5 = 17; continue $sw5; }
                }
                case 17: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 13; continue $sw5;
                    }
                    return r1;
                }
                case 8: {
                    r6 = "FAILED: ";
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    th = $ex5;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 15: {
                    e = $ex5;
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error occurred sending report " + r8, e);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 13; continue $sw5;
                    }
                    { $pc5 = 17; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
