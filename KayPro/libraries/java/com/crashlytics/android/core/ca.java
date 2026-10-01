package com.crashlytics.android.core;

@abcd.Interfacebz({com.crashlytics.android.core.Interfacega.class})
public class ca extends io.fabric.sdk.android.Kit<java.lang.Void> {
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> DW;
    private boolean EQ;
    private com.crashlytics.android.core.da FH;
    private com.crashlytics.android.core.da Hw;
    private abcd.Jz J0;
    private com.crashlytics.android.core.r J8;
    private java.lang.String VH;
    private com.crashlytics.android.core.Interfacega Ws;
    private com.crashlytics.android.core.W Zo;
    private java.lang.String gn;
    private final long j6;
    private float tp;
    private java.lang.String u7;
    private com.crashlytics.android.core.Interfaceea v5;
    private final com.crashlytics.android.core.Da we;

    private static final class a implements java.util.concurrent.Callable<java.lang.Boolean> {
        private final com.crashlytics.android.core.da j6;

        public a(com.crashlytics.android.core.da r1) {
            this.j6 = r1;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public java.lang.Boolean call() {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.j6.DW() == false) { $pc0 = 5; continue $sw0; }
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Found previous crash marker.");
                        this.j6.FH();
                        return java.lang.Boolean.TRUE;
                    }
                    case 5: {
                        return java.lang.Boolean.FALSE;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public java.lang.Boolean call() {
            return call();
        }
    }

    private static final class b implements com.crashlytics.android.core.Interfaceea {
        private b() {
        }

        b(com.crashlytics.android.core.Z r1) {
            this();
        }

        @Override
        public void j6() {
        }
    }

    public ca() {
        this(1.0f, null, null, false);
    }

    ca(float r8, com.crashlytics.android.core.Interfaceea r9, com.crashlytics.android.core.Da r10, boolean r11) {
        this(r8, r9, r10, r11, io.fabric.sdk.android.services.common.r.j6("Crashlytics Exception Handler"));
    }

    ca(float r2, com.crashlytics.android.core.Interfaceea r3, com.crashlytics.android.core.Da r4, boolean r5, java.util.concurrent.ExecutorService r6) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.VH = null;
                    this.gn = null;
                    this.u7 = null;
                    this.tp = r2;
                    if (r3 != null) { $pc1 = 6; continue $sw1; }
                    r3 = new com.crashlytics.android.core.ca.b(null);
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    this.v5 = r3;
                    this.we = r4;
                    this.EQ = r5;
                    this.J8 = new com.crashlytics.android.core.r(r6);
                    this.DW = new java.util.concurrent.ConcurrentHashMap();
                    this.j6 = java.lang.System.currentTimeMillis();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String DW(int r1, java.lang.String r2, java.lang.String r3) {
        return io.fabric.sdk.android.services.common.i.j6(r1) + "/" + r2 + " " + r3;
    }

    private static java.lang.String DW(java.lang.String r2) {
        java.lang.String r3 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 == null) { $pc2 = 7; continue $sw2; }
                    r3 = r2.trim();
                    if (r3.length() > 1024) { $pc2 = 6; continue $sw2; }
                    return r3;
                }
                case 6: {
                    return r3.substring(0, 1024);
                }
                case 7: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void a8() {
        java.lang.Boolean r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = (java.lang.Boolean) this.J8.DW(new com.crashlytics.android.core.ca.a(this.Hw));
                    if (java.lang.Boolean.TRUE.equals(r0) == true) { $pc3 = 10; continue $sw3; }
                    return;
                }
                case 10: {
                    try {
                        this.v5.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 7; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 7: {
                    e = $ex3;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static com.crashlytics.android.core.ca getInstance() {
        return (com.crashlytics.android.core.ca) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.core.ca.class);
    }

    static com.crashlytics.android.core.da j6(com.crashlytics.android.core.ca r0) {
        return r0.FH;
    }

    private void j6(int r5, java.lang.String r6, java.lang.String r7) {
        long r0 = 0L;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.EQ == false) { $pc4 = 6; continue $sw4; }
                    return;
                }
                case 6: {
                    if (j6("prior to logging messages.") == true) { $pc4 = 8; continue $sw4; }
                    return;
                }
                case 8: {
                    r0 = java.lang.System.currentTimeMillis() - this.j6;
                    this.Zo.j6(r0, DW(r5, r6, r7));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(java.lang.String r3) {
        com.crashlytics.android.core.ca r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = getInstance();
                    if (r0 != null) { $pc5 = 5; continue $sw5; }
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Crashlytics must be initialized by calling Fabric.with(Context) " + r3, null);
                    return false;
                }
                case 5: {
                    if (r0.Zo == null) { $pc5 = 9; continue $sw5; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(java.lang.String r2, boolean r3) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r3 == true) { $pc6 = 7; continue $sw6; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Configured not to require a build ID.");
                    return true;
                }
                case 7: {
                    if (io.fabric.sdk.android.services.common.i.DW(r2) == true) { $pc6 = 9; continue $sw6; }
                    return true;
                }
                case 9: {
                    android.util.Log.e("CrashlyticsCore", ".");
                    android.util.Log.e("CrashlyticsCore", ".     |  | ");
                    android.util.Log.e("CrashlyticsCore", ".     |  |");
                    android.util.Log.e("CrashlyticsCore", ".     |  |");
                    android.util.Log.e("CrashlyticsCore", ".   \\ |  | /");
                    android.util.Log.e("CrashlyticsCore", ".    \\    /");
                    android.util.Log.e("CrashlyticsCore", ".     \\  /");
                    android.util.Log.e("CrashlyticsCore", ".      \\/");
                    android.util.Log.e("CrashlyticsCore", ".");
                    android.util.Log.e("CrashlyticsCore", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                    android.util.Log.e("CrashlyticsCore", ".");
                    android.util.Log.e("CrashlyticsCore", ".      /\\");
                    android.util.Log.e("CrashlyticsCore", ".     /  \\");
                    android.util.Log.e("CrashlyticsCore", ".    /    \\");
                    android.util.Log.e("CrashlyticsCore", ".   / |  | \\");
                    android.util.Log.e("CrashlyticsCore", ".     |  |");
                    android.util.Log.e("CrashlyticsCore", ".     |  |");
                    android.util.Log.e("CrashlyticsCore", ".     |  |");
                    android.util.Log.e("CrashlyticsCore", ".");
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void lg() {
        com.crashlytics.android.core.Z r0 = null;
        java.util.Iterator<abcd.Interfacelz> r1 = null;
        java.util.concurrent.Future r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = new com.crashlytics.android.core.Z(this);
                    r1 = getDependencies().iterator();
                    $pc7 = 4; continue $sw7;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc7 = 6; continue $sw7; }
                    r0.j6(r1.next());
                    { $pc7 = 4; continue $sw7; }
                }
                case 6: {
                    r2 = getFabric().getExecutorService().submit(r0);
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
                    try {
                        r2.get(4, java.util.concurrent.TimeUnit.SECONDS);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.util.concurrent.TimeoutException) { $pc7 = 9; continue $sw7; }
                        if ($t instanceof java.util.concurrent.ExecutionException) { $pc7 = 11; continue $sw7; }
                        if ($t instanceof java.lang.InterruptedException) { $pc7 = 13; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc7 = 21; continue $sw7;
                }
                case 21: {
                    return;
                }
                case 13: {
                    e = $ex7;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Crashlytics was interrupted during initialization.", e);
                    return;
                }
                case 11: {
                    e = $ex7;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Problem encountered during Crashlytics initialization.", e);
                    return;
                }
                case 9: {
                    e = $ex7;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Crashlytics timed out during initialization.", e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    com.crashlytics.android.core.fa J8() {
        com.crashlytics.android.core.Interfacega r0 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.Ws;
                    if (r0 != null) { $pc8 = 5; continue $sw8; }
                    return null;
                }
                case 5: {
                    return r0.j6();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void Mr() {
        this.J8.j6(new com.crashlytics.android.core.Callableba(this));
    }

    void U2() {
        this.J8.DW(new com.crashlytics.android.core.Callableaa(this));
    }

    boolean VH() {
        return this.FH.DW();
    }

    java.lang.String Ws() {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (getIdManager().j6() == true) { $pc9 = 7; continue $sw9; }
                    return null;
                }
                case 7: {
                    return this.gn;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void Zo() {
        this.Hw.j6();
    }

    java.lang.String aM() {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (getIdManager().j6() == true) { $pc10 = 7; continue $sw10; }
                    return null;
                }
                case 7: {
                    return this.VH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void crash() {
        new com.crashlytics.android.core.ClassO().j6();
    }

    @Override
    protected java.lang.Void doInBackground() {
        return doInBackground2();
    }

    @Override
    protected java.lang.Void doInBackground2() {
        abcd.mA r2 = null;
        com.crashlytics.android.core.fa r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    U2();
                    this.Zo.DW();
                    try {
                        this.Zo.we();
                        r2 = abcd.C0895jA.DW().j6();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 30; continue $sw11; }
                        $pc11 = 28; continue $sw11;
                    }
                    if (r2 != null) { $pc11 = 8; continue $sw11; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Received null settings, skipping report submission!");
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 30; continue $sw11; }
                        $pc11 = 28; continue $sw11;
                    }
                    Mr();
                    return null;
                }
                case 8: {
                    try {
                        this.Zo.j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 30; continue $sw11; }
                        $pc11 = 28; continue $sw11;
                    }
                    if (r2.Hw.FH == true) { $pc11 = 14; continue $sw11; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Collection of crash reports disabled in Crashlytics settings.");
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 30; continue $sw11; }
                        $pc11 = 28; continue $sw11;
                    }
                    Mr();
                    return null;
                }
                case 14: {
                    if (io.fabric.sdk.android.services.common.l.j6(getContext()).j6() == true) { $pc11 = 18; continue $sw11; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Automatic collection of crash reports disabled by Firebase settings.");
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 30; continue $sw11; }
                        $pc11 = 28; continue $sw11;
                    }
                    Mr();
                    return null;
                }
                case 18: {
                    try {
                        r3 = J8();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 30; continue $sw11; }
                        $pc11 = 28; continue $sw11;
                    }
                    if (r3 == null) { $pc11 = 24; continue $sw11; }
                    if (this.Zo.j6(r3) == true) { $pc11 = 24; continue $sw11; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Could not finalize previous NDK sessions.");
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 30; continue $sw11; }
                        $pc11 = 28; continue $sw11;
                    }
                    $pc11 = 24; continue $sw11;
                }
                case 24: {
                    if (this.Zo.DW(r2.DW) == true) { $pc11 = 26; continue $sw11; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Could not finalize previous sessions.");
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 30; continue $sw11; }
                        $pc11 = 28; continue $sw11;
                    }
                    $pc11 = 26; continue $sw11;
                }
                case 26: {
                    try {
                        this.Zo.j6(this.tp, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.Exception) { $pc11 = 30; continue $sw11; }
                        $pc11 = 28; continue $sw11;
                    }
                    $pc11 = 32; continue $sw11;
                }
                case 32: {
                    Mr();
                    return null;
                }
                case 30: {
                    e = $ex11;
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Crashlytics encountered a problem during asynchronous initialization.", e);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 28; continue $sw11;
                    }
                    throw new java.lang.IllegalStateException();
                }
                case 28: {
                    th = $ex11;
                    Mr();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public com.crashlytics.android.core.Da getPinningInfoProvider() {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (this.EQ == false) { $pc12 = 7; continue $sw12; }
                    return null;
                }
                case 7: {
                    return this.we;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String getVersion() {
        return "2.7.0.33";
    }

    java.lang.String j3() {
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (getIdManager().j6() == true) { $pc13 = 7; continue $sw13; }
                    return null;
                }
                case 7: {
                    return this.u7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean j6(android.content.Context r19) {
        java.lang.String r1 = null;
        java.lang.String r2 = null;
        abcd.Pz r7 = null;
        com.crashlytics.android.core.Ea r6 = null;
        com.crashlytics.android.core.ha r3 = null;
        io.fabric.sdk.android.services.common.v r5 = null;
        com.crashlytics.android.core.ClassA r8 = null;
        boolean r4 = false;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (io.fabric.sdk.android.services.common.l.j6(r19).j6() == true) { $pc14 = 6; continue $sw14; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Crashlytics is disabled, because data collection is disabled by Firebase.");
                    this.EQ = true;
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    if (this.EQ == false) { $pc14 = 8; continue $sw14; }
                    return false;
                }
                case 8: {
                    r1 = new io.fabric.sdk.android.services.common.f().Hw(r19);
                    if (r1 != null) { $pc14 = 11; continue $sw14; }
                    return false;
                }
                case 11: {
                    r2 = io.fabric.sdk.android.services.common.i.J8(r19);
                    if (j6(r2, io.fabric.sdk.android.services.common.i.j6(r19, "com.crashlytics.RequireBuildId", true)) == false) { $pc14 = 30; continue $sw14; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().v5("CrashlyticsCore", "Initializing Crashlytics Core " + getVersion());
                        r7 = new abcd.Pz(this);
                        this.Hw = new com.crashlytics.android.core.da("crash_marker", r7);
                        this.FH = new com.crashlytics.android.core.da("initialization_marker", r7);
                        r6 = com.crashlytics.android.core.Ea.j6(new abcd.Rz(getContext(), "com.crashlytics.android.core.CrashlyticsCore"), this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        if ($t instanceof java.lang.Exception) { $pc14 = 26; continue $sw14; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.we == null) { $pc14 = 17; continue $sw14; }
                    try {
                        r3 = new com.crashlytics.android.core.ha(this.we);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        if ($t instanceof java.lang.Exception) { $pc14 = 26; continue $sw14; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc14 = 18; continue $sw14;
                }
                case 18: {
                    try {
                        this.J0 = new abcd.Ez(io.fabric.sdk.android.Fabric.getLogger());
                        this.J0.j6(r3);
                        r5 = getIdManager();
                        r8 = com.crashlytics.android.core.ClassA.j6(r19, r5, r1, r2);
                        this.Zo = new com.crashlytics.android.core.W(this, this.J8, this.J0, r5, r6, r7, r8, new com.crashlytics.android.core.Ma(r19, new com.crashlytics.android.core.va(r19, r8.Hw)), new com.crashlytics.android.core.ma(this), com.crashlytics.android.answers.o.j6(r19));
                        r4 = VH();
                        a8();
                        this.Zo.j6(java.lang.Thread.getDefaultUncaughtExceptionHandler(), new io.fabric.sdk.android.services.common.u().v5(r19));
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        if ($t instanceof java.lang.Exception) { $pc14 = 26; continue $sw14; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 == true) { $pc14 = 21; continue $sw14; }
                    $pc14 = 24; continue $sw14;
                }
                case 24: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Exception handling initialization successful");
                    return true;
                }
                case 21: {
                    if (io.fabric.sdk.android.services.common.i.DW(r19) == false) { $pc14 = 24; continue $sw14; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                        lg();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        if ($t instanceof java.lang.Exception) { $pc14 = 26; continue $sw14; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return false;
                }
                case 17: {
                    r3 = null;
                    $pc14 = 30; continue $sw14;
                }
                case 26: {
                    e = $ex14;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", e);
                    this.Zo = null;
                    return false;
                }
                case 30: {
                    throw new abcd.mz("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean j6(java.net.URL r4) {
        abcd.Hz r5 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (getPinningInfoProvider() == null) { $pc15 = 6; continue $sw15; }
                    r5 = this.J0.j6(abcd.Fz.j6, r4.toString());
                    ((javax.net.ssl.HttpsURLConnection) r5.tp()).setInstanceFollowRedirects(false);
                    r5.VH();
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void log(int r4, java.lang.String r5, java.lang.String r6) {
        j6(r4, r5, r6);
        io.fabric.sdk.android.Fabric.getLogger().j6(r4, "" + r5, "" + r6, true);
    }

    public void log(java.lang.String r3) {
        j6(3, "CrashlyticsCore", r3);
    }

    public void logException(java.lang.Throwable r4) {
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if (this.EQ == false) { $pc16 = 6; continue $sw16; }
                    return;
                }
                case 6: {
                    if (j6("prior to logging exceptions.") == true) { $pc16 = 8; continue $sw16; }
                    return;
                }
                case 8: {
                    if (r4 != null) { $pc16 = 11; continue $sw16; }
                    io.fabric.sdk.android.Fabric.getLogger().j6(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
                    return;
                }
                case 11: {
                    this.Zo.j6(java.lang.Thread.currentThread(), r4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected boolean onPreExecute() {
        return j6(super.getContext());
    }

    public void setBool(java.lang.String r1, boolean r2) {
        setString(r1, java.lang.Boolean.toString(r2));
    }

    public void setDouble(java.lang.String r1, double r2) {
        setString(r1, java.lang.Double.toString(r2));
    }

    public void setFloat(java.lang.String r1, float r2) {
        setString(r1, java.lang.Float.toString(r2));
    }

    public void setInt(java.lang.String r1, int r2) {
        setString(r1, java.lang.Integer.toString(r2));
    }

    @java.lang.Deprecated
    public synchronized void setListener(com.crashlytics.android.core.Interfaceea r4) {
        synchronized (this) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex17 = null;
            int $pc17 = -1;
            $sw17: while (true) {
                switch ($pc17) {
                    case -1: {
                        try {
                            io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Use of setListener is deprecated.");
                        } catch (java.lang.Throwable $t) {
                            $ex17 = $t;
                            $pc17 = 10; continue $sw17;
                        }
                        if (r4 == null) { $pc17 = 9; continue $sw17; }
                        try {
                            this.v5 = r4;
                        } catch (java.lang.Throwable $t) {
                            $ex17 = $t;
                            $pc17 = 10; continue $sw17;
                        }
                        return;
                    }
                    case 9: {
                        try {
                            throw new java.lang.IllegalArgumentException("listener must not be null.");
                        } catch (java.lang.Throwable $t) {
                            $ex17 = $t;
                            $pc17 = 10; continue $sw17;
                        }
                    }
                    case 10: {
                        th = $ex17;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public void setLong(java.lang.String r1, long r2) {
        setString(r1, java.lang.Long.toString(r2));
    }

    public void setString(java.lang.String r4, java.lang.String r5) {
        android.content.Context r6 = null;
        java.lang.String r7 = null;
        java.lang.String r8 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (this.EQ == false) { $pc18 = 6; continue $sw18; }
                    return;
                }
                case 6: {
                    if (j6("prior to setting keys.") == true) { $pc18 = 9; continue $sw18; }
                    return;
                }
                case 9: {
                    if (r4 != null) { $pc18 = 19; continue $sw18; }
                    r6 = getContext();
                    if (r6 != null) { $pc18 = 13; continue $sw18; }
                    $pc18 = 17; continue $sw18;
                }
                case 17: {
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
                case 13: {
                    if (io.fabric.sdk.android.services.common.i.tp(r6) == false) { $pc18 = 17; continue $sw18; }
                    throw new java.lang.IllegalArgumentException("Custom attribute key must not be null.");
                }
                case 19: {
                    r7 = DW(r4);
                    if (this.DW.size() >= 64) { $pc18 = 22; continue $sw18; }
                    $pc18 = 25; continue $sw18;
                }
                case 25: {
                    if (r5 != null) { $pc18 = 27; continue $sw18; }
                    r8 = "";
                    $pc18 = 28; continue $sw18;
                }
                case 28: {
                    this.DW.put(r7, r8);
                    this.Zo.j6(this.DW);
                    return;
                }
                case 27: {
                    r8 = DW(r5);
                    { $pc18 = 28; continue $sw18; }
                }
                case 22: {
                    if (this.DW.containsKey(r7) == true) { $pc18 = 25; continue $sw18; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Exceeded maximum number of custom attributes (64)");
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setUserEmail(java.lang.String r4) {
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    if (this.EQ == false) { $pc19 = 6; continue $sw19; }
                    return;
                }
                case 6: {
                    if (j6("prior to setting user data.") == true) { $pc19 = 8; continue $sw19; }
                    return;
                }
                case 8: {
                    this.gn = DW(r4);
                    this.Zo.j6(this.VH, this.u7, this.gn);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setUserIdentifier(java.lang.String r4) {
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (this.EQ == false) { $pc20 = 6; continue $sw20; }
                    return;
                }
                case 6: {
                    if (j6("prior to setting user data.") == true) { $pc20 = 8; continue $sw20; }
                    return;
                }
                case 8: {
                    this.VH = DW(r4);
                    this.Zo.j6(this.VH, this.u7, this.gn);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void setUserName(java.lang.String r4) {
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    if (this.EQ == false) { $pc21 = 6; continue $sw21; }
                    return;
                }
                case 6: {
                    if (j6("prior to setting user data.") == true) { $pc21 = 8; continue $sw21; }
                    return;
                }
                case 8: {
                    this.u7 = DW(r4);
                    this.Zo.j6(this.VH, this.u7, this.gn);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean verifyPinning(java.net.URL r4) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    return j6(r4);
                }
                case 4: {
                    e = $ex22;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Could not verify SSL pinning", e);
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    java.util.Map<java.lang.String, java.lang.String> we() {
        return java.util.Collections.unmodifiableMap(this.DW);
    }
}
