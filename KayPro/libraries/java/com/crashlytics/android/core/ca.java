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
            if (this.j6.DW() == false) goto L5;
            io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Found previous crash marker.");
            this.j6.FH();
            return java.lang.Boolean.TRUE;
        L5:
            return java.lang.Boolean.FALSE;
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
        this.VH = null;
        this.gn = null;
        this.u7 = null;
        this.tp = r2;
        if (r3 != null) goto L6;
        r3 = new com.crashlytics.android.core.ca.b(null);
    L6:
        this.v5 = r3;
        this.we = r4;
        this.EQ = r5;
        this.J8 = new com.crashlytics.android.core.r(r6);
        this.DW = new java.util.concurrent.ConcurrentHashMap();
        this.j6 = java.lang.System.currentTimeMillis();
    }

    private static java.lang.String DW(int r1, java.lang.String r2, java.lang.String r3) {
        return io.fabric.sdk.android.services.common.i.j6(r1) + "/" + r2 + " " + r3;
    }

    private static java.lang.String DW(java.lang.String r2) {
        if (r2 == null) goto L7;
        java.lang.String r3 = r2.trim();
        if (r3.length() > 1024) goto L6;
        return r3;
    L6:
        return r3.substring(0, 1024);
    L7:
        return r2;
    }

    private void a8() {
        java.lang.Boolean r0 = (java.lang.Boolean) this.J8.DW(new com.crashlytics.android.core.ca.a(this.Hw));
        if (java.lang.Boolean.TRUE.equals(r0) == true) goto L10;
        return;
    L10:
        this.v5.j6();     // Catch: java.lang.Exception -> L7
        return;
    L7:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
    }

    public static com.crashlytics.android.core.ca getInstance() {
        return (com.crashlytics.android.core.ca) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.core.ca.class);
    }

    static com.crashlytics.android.core.da j6(com.crashlytics.android.core.ca r0) {
        return r0.FH;
    }

    private void j6(int r5, java.lang.String r6, java.lang.String r7) {
        if (this.EQ == false) goto L6;
        return;
    L6:
        if (j6("prior to logging messages.") == true) goto L8;
        return;
    L8:
        long r0 = java.lang.System.currentTimeMillis() - this.j6;
        this.Zo.j6(r0, DW(r5, r6, r7));
    }

    private static boolean j6(java.lang.String r3) {
        com.crashlytics.android.core.ca r0 = getInstance();
        if (r0 != null) goto L5;
    L9:
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Crashlytics must be initialized by calling Fabric.with(Context) " + r3, null);
        return false;
    L5:
        if (r0.Zo == null) goto L9;
        return true;
    }

    static boolean j6(java.lang.String r2, boolean r3) {
        if (r3 == true) goto L7;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Configured not to require a build ID.");
        return true;
    L7:
        if (io.fabric.sdk.android.services.common.i.DW(r2) == true) goto L9;
        return true;
    L9:
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

    private void lg() {
        com.crashlytics.android.core.Z r0 = new com.crashlytics.android.core.Z(this);
        java.util.Iterator<abcd.Interfacelz> r1 = getDependencies().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r0.j6(r1.next());
        goto L4
    L6:
        java.util.concurrent.Future r2 = getFabric().getExecutorService().submit(r0);
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        r2.get(4, java.util.concurrent.TimeUnit.SECONDS);     // Catch: java.util.concurrent.TimeoutException -> L9 java.util.concurrent.ExecutionException -> L11 java.lang.InterruptedException -> L13
    L21:
        return;
    L13:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Crashlytics was interrupted during initialization.", e);
        return;
    L11:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Problem encountered during Crashlytics initialization.", e);
        return;
    L9:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Crashlytics timed out during initialization.", e);
    }

    com.crashlytics.android.core.fa J8() {
        com.crashlytics.android.core.Interfacega r0 = this.Ws;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.j6();
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
        if (getIdManager().j6() == true) goto L7;
        return null;
    L7:
        return this.gn;
    }

    void Zo() {
        this.Hw.j6();
    }

    java.lang.String aM() {
        if (getIdManager().j6() == true) goto L7;
        return null;
    L7:
        return this.VH;
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
        U2();
        this.Zo.DW();
        this.Zo.we();     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L30
        abcd.mA r2 = abcd.C0895jA.DW().j6();     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L30
        if (r2 != null) goto L8;
        io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Received null settings, skipping report submission!");     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L30
        Mr();
        return null;
    L8:
        this.Zo.j6(r2);     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L30
        if (r2.Hw.FH == true) goto L14;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Collection of crash reports disabled in Crashlytics settings.");     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L30
        Mr();
        return null;
    L14:
        if (io.fabric.sdk.android.services.common.l.j6(getContext()).j6() == true) goto L18;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Automatic collection of crash reports disabled by Firebase settings.");     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L30
        Mr();
        return null;
    L18:
        com.crashlytics.android.core.fa r3 = J8();     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L30
        if (r3 == null) goto L24;
        if (this.Zo.j6(r3) == true) goto L24;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Could not finalize previous NDK sessions.");     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L30
    L24:
        if (this.Zo.DW(r2.DW) == true) goto L26;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Could not finalize previous sessions.");     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L30
    L26:
        this.Zo.j6(this.tp, r2);     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L30
    L32:
        Mr();
        return null;
    L30:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Crashlytics encountered a problem during asynchronous initialization.", e);     // Catch: java.lang.Throwable -> L28
    L28:
        th = move-exception;
        Mr();
        throw th;
    }

    @Override
    public java.lang.String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public com.crashlytics.android.core.Da getPinningInfoProvider() {
        if (this.EQ == false) goto L7;
        return null;
    L7:
        return this.we;
    }

    @Override
    public java.lang.String getVersion() {
        return "2.7.0.33";
    }

    java.lang.String j3() {
        if (getIdManager().j6() == true) goto L7;
        return null;
    L7:
        return this.u7;
    }

    boolean j6(android.content.Context r19) {
        if (io.fabric.sdk.android.services.common.l.j6(r19).j6() == true) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Crashlytics is disabled, because data collection is disabled by Firebase.");
        this.EQ = true;
    L6:
        if (this.EQ == false) goto L8;
        return false;
    L8:
        java.lang.String r1 = new io.fabric.sdk.android.services.common.f().Hw(r19);
        if (r1 != null) goto L11;
        return false;
    L11:
        java.lang.String r2 = io.fabric.sdk.android.services.common.i.J8(r19);
        if (j6(r2, io.fabric.sdk.android.services.common.i.j6(r19, "com.crashlytics.RequireBuildId", true)) == false) goto L30;
        io.fabric.sdk.android.Fabric.getLogger().v5("CrashlyticsCore", "Initializing Crashlytics Core " + getVersion());     // Catch: java.lang.Exception -> L26
        abcd.Pz r7 = new abcd.Pz(this);     // Catch: java.lang.Exception -> L26
        this.Hw = new com.crashlytics.android.core.da("crash_marker", r7);     // Catch: java.lang.Exception -> L26
        this.FH = new com.crashlytics.android.core.da("initialization_marker", r7);     // Catch: java.lang.Exception -> L26
        com.crashlytics.android.core.Ea r6 = com.crashlytics.android.core.Ea.j6(new abcd.Rz(getContext(), "com.crashlytics.android.core.CrashlyticsCore"), this);     // Catch: java.lang.Exception -> L26
        if (this.we == null) goto L17;
        com.crashlytics.android.core.ha r3 = new com.crashlytics.android.core.ha(this.we);     // Catch: java.lang.Exception -> L26
    L18:
        this.J0 = new abcd.Ez(io.fabric.sdk.android.Fabric.getLogger());     // Catch: java.lang.Exception -> L26
        this.J0.j6(r3);     // Catch: java.lang.Exception -> L26
        io.fabric.sdk.android.services.common.v r5 = getIdManager();     // Catch: java.lang.Exception -> L26
        com.crashlytics.android.core.ClassA r8 = com.crashlytics.android.core.ClassA.j6(r19, r5, r1, r2);     // Catch: java.lang.Exception -> L26
        this.Zo = new com.crashlytics.android.core.W(this, this.J8, this.J0, r5, r6, r7, r8, new com.crashlytics.android.core.Ma(r19, new com.crashlytics.android.core.va(r19, r8.Hw)), new com.crashlytics.android.core.ma(this), com.crashlytics.android.answers.o.j6(r19));     // Catch: java.lang.Exception -> L26
        boolean r4 = VH();     // Catch: java.lang.Exception -> L26
        a8();     // Catch: java.lang.Exception -> L26
        this.Zo.j6(java.lang.Thread.getDefaultUncaughtExceptionHandler(), new io.fabric.sdk.android.services.common.u().v5(r19));     // Catch: java.lang.Exception -> L26
        if (r4 == true) goto L21;
    L24:
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Exception handling initialization successful");
        return true;
    L21:
        if (io.fabric.sdk.android.services.common.i.DW(r19) == false) goto L24;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Crashlytics did not finish previous background initialization. Initializing synchronously.");     // Catch: java.lang.Exception -> L26
        lg();     // Catch: java.lang.Exception -> L26
        return false;
    L17:
        r3 = null;
    L26:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", e);
        this.Zo = null;
        return false;
    L30:
        throw new abcd.mz("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
    }

    boolean j6(java.net.URL r4) {
        if (getPinningInfoProvider() == null) goto L6;
        abcd.Hz r5 = this.J0.j6(abcd.Fz.j6, r4.toString());
        ((javax.net.ssl.HttpsURLConnection) r5.tp()).setInstanceFollowRedirects(false);
        r5.VH();
        return true;
    L6:
        return false;
    }

    public void log(int r4, java.lang.String r5, java.lang.String r6) {
        j6(r4, r5, r6);
        io.fabric.sdk.android.Fabric.getLogger().j6(r4, "" + r5, "" + r6, true);
    }

    public void log(java.lang.String r3) {
        j6(3, "CrashlyticsCore", r3);
    }

    public void logException(java.lang.Throwable r4) {
        if (this.EQ == false) goto L6;
        return;
    L6:
        if (j6("prior to logging exceptions.") == true) goto L8;
        return;
    L8:
        if (r4 != null) goto L11;
        io.fabric.sdk.android.Fabric.getLogger().j6(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
        return;
    L11:
        this.Zo.j6(java.lang.Thread.currentThread(), r4);
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
        monitor-enter(this);
        io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Use of setListener is deprecated.");     // Catch: java.lang.Throwable -> L10
        if (r4 == null) goto L9;
        this.v5 = r4;     // Catch: java.lang.Throwable -> L10
        monitor-exit(this);
        return;
    L9:
        throw new java.lang.IllegalArgumentException("listener must not be null.");     // Catch: java.lang.Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    public void setLong(java.lang.String r1, long r2) {
        setString(r1, java.lang.Long.toString(r2));
    }

    public void setString(java.lang.String r4, java.lang.String r5) {
        if (this.EQ == false) goto L6;
        return;
    L6:
        if (j6("prior to setting keys.") == true) goto L9;
        return;
    L9:
        if (r4 != null) goto L19;
        android.content.Context r6 = getContext();
        if (r6 != null) goto L13;
    L17:
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Attempting to set custom attribute with null key, ignoring.", null);
        return;
    L13:
        if (io.fabric.sdk.android.services.common.i.tp(r6) == false) goto L17;
        throw new java.lang.IllegalArgumentException("Custom attribute key must not be null.");
    L19:
        java.lang.String r7 = DW(r4);
        if (this.DW.size() >= 64) goto L22;
    L25:
        if (r5 != null) goto L27;
        java.lang.String r8 = "";
    L28:
        this.DW.put(r7, r8);
        this.Zo.j6(this.DW);
        return;
    L27:
        r8 = DW(r5);
        goto L28
    L22:
        if (this.DW.containsKey(r7) == true) goto L25;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Exceeded maximum number of custom attributes (64)");
    }

    public void setUserEmail(java.lang.String r4) {
        if (this.EQ == false) goto L6;
        return;
    L6:
        if (j6("prior to setting user data.") == true) goto L8;
        return;
    L8:
        this.gn = DW(r4);
        this.Zo.j6(this.VH, this.u7, this.gn);
    }

    public void setUserIdentifier(java.lang.String r4) {
        if (this.EQ == false) goto L6;
        return;
    L6:
        if (j6("prior to setting user data.") == true) goto L8;
        return;
    L8:
        this.VH = DW(r4);
        this.Zo.j6(this.VH, this.u7, this.gn);
    }

    public void setUserName(java.lang.String r4) {
        if (this.EQ == false) goto L6;
        return;
    L6:
        if (j6("prior to setting user data.") == true) goto L8;
        return;
    L8:
        this.u7 = DW(r4);
        this.Zo.j6(this.VH, this.u7, this.gn);
    }

    public boolean verifyPinning(java.net.URL r4) {
        return j6(r4);
    L4:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Could not verify SSL pinning", e);
        return false;
    }

    java.util.Map<java.lang.String, java.lang.String> we() {
        return java.util.Collections.unmodifiableMap(this.DW);
    }
}
