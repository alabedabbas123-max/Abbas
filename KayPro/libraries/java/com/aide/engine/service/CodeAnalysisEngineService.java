package com.aide.engine.service;

@abcd.Interfacexu
public class CodeAnalysisEngineService extends android.app.Service {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 1489977092297266791L)
    private com.aide.engine.C1712c FH;

    @abcd.Interfaceru(field = -2277479150212039695L)
    private com.aide.engine.service.t Hw;

    @abcd.Interfaceru(field = -2457135731919236875L)
    private com.aide.engine.service.q VH;

    @abcd.Interfaceru(field = 77238123921954616L)
    private com.aide.engine.service.o Zo;

    @abcd.Interfaceru(field = -2790688513587208175L)
    private final com.aide.engine.service.n.a gn;

    @abcd.Interfaceru(field = 2196964607160776880L)
    private com.aide.engine.service.r v5;

    static {
        abcd.wu.j6(com.aide.engine.service.CodeAnalysisEngineService.class, 2006115082471780797L, 2006115082471780797L);
    }

    public CodeAnalysisEngineService() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -741790584612676469L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-741790584612676469L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.gn = new com.aide.engine.service.l(this);     // Catch: java.lang.Throwable -> L8
        this.FH = new com.aide.engine.C1712c(new com.aide.engine.service.c(this));     // Catch: java.lang.Throwable -> L8
        this.FH.j6(new com.aide.engine.service.d(this));     // Catch: java.lang.Throwable -> L8
        this.FH.j6(new com.aide.engine.service.e(this));     // Catch: java.lang.Throwable -> L8
    }

    static com.aide.engine.service.r DW(com.aide.engine.service.CodeAnalysisEngineService r0) {
        return r0.v5;
    }

    static com.aide.engine.service.t FH(com.aide.engine.service.CodeAnalysisEngineService r0) {
        return r0.Hw;
    }

    static com.aide.engine.service.o Hw(com.aide.engine.service.CodeAnalysisEngineService r0) {
        return r0.Zo;
    }

    static com.aide.engine.service.o j6(com.aide.engine.service.CodeAnalysisEngineService r0, com.aide.engine.service.o r1) {
        r0.Zo = r1;
        return r1;
    }

    static com.aide.engine.service.q j6(com.aide.engine.service.CodeAnalysisEngineService r0) {
        return r0.VH;
    }

    static com.aide.engine.service.q j6(com.aide.engine.service.CodeAnalysisEngineService r0, com.aide.engine.service.q r1) {
        r0.VH = r1;
        return r1;
    }

    static com.aide.engine.service.r j6(com.aide.engine.service.CodeAnalysisEngineService r0, com.aide.engine.service.r r1) {
        r0.v5 = r1;
        return r1;
    }

    static com.aide.engine.service.t j6(com.aide.engine.service.CodeAnalysisEngineService r0, com.aide.engine.service.t r1) {
        r0.Hw = r1;
        return r1;
    }

    private static void j6(java.lang.Object r1, int r2, android.app.Notification r3) {
        ((com.aide.engine.service.CodeAnalysisEngineService) r1).startForeground(r2, r3);
        abcd.wu.DW(r1, r2, r3);
    }

    static com.aide.engine.C1712c v5(com.aide.engine.service.CodeAnalysisEngineService r0) {
        return r0.FH;
    }

    @Override
    public android.os.IBinder onBind(android.content.Intent r10) {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L11
        if (j6 == false) goto L6;
        abcd.wu.j6(-6021532779299917777L, this, r10);     // Catch: java.lang.Throwable -> L11
    L6:
        com.aide.common.ClassH.FH("Engine service bound - pid " + android.os.Process.myPid() + " id " + java.lang.System.identityHashCode(this));     // Catch: java.lang.Throwable -> L11
        if (android.os.Build.VERSION.RELEASE.startsWith("4.4.") == false) goto L9;
        j6(this, 9973, new android.support.v4.app.NotificationCompat.Builder(this, "engine").j6(java.lang.System.currentTimeMillis()).Hw(17301625).FH("Code Analysis").DW("Code analysis engine is active").j6(com.aide.ui.MainActivity.DW(this)).FH(-2).j6());     // Catch: java.lang.Throwable -> L11
    L9:
        abcd.Abstractqc.j6(new com.aide.engine.service.b(this));     // Catch: java.lang.Throwable -> L11
        return this.gn;
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -6021532779299917777L, this, r10);
    L15:
        throw th;
    }

    @Override
    public void onCreate() {
        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(-1392779776942266704L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onCreate();     // Catch: java.lang.Throwable -> L8
        com.aide.engine.service.Native.j6.init(this);     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1392779776942266704L, this);
    L12:
        throw th;
    }

    @Override
    public void onDestroy() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3655387390142169280L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3655387390142169280L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.ClassH.FH("Engine service destroyed - pid " + android.os.Process.myPid() + " id " + java.lang.System.identityHashCode(this));     // Catch: java.lang.Throwable -> L8
        this.FH.VH();     // Catch: java.lang.Throwable -> L8
        this.FH = null;     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void onTrimMemory(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1065783692561423600L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1065783692561423600L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        super.onTrimMemory(r5);     // Catch: java.lang.Throwable -> L8
        com.aide.common.ClassH.FH("onTrimMemory - level: " + r5);     // Catch: java.lang.Throwable -> L8
    }
}
