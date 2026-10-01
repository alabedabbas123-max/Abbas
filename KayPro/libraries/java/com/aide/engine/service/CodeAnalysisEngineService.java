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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -741790584612676469L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-741790584612676469L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.gn = new com.aide.engine.service.l(this);
                        this.FH = new com.aide.engine.C1712c(new com.aide.engine.service.c(this));
                        this.FH.j6(new com.aide.engine.service.d(this));
                        this.FH.j6(new com.aide.engine.service.e(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-6021532779299917777L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        com.aide.common.ClassH.FH("Engine service bound - pid " + android.os.Process.myPid() + " id " + java.lang.System.identityHashCode(this));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    if (android.os.Build.VERSION.RELEASE.startsWith("4.4.") == false) { $pc1 = 9; continue $sw1; }
                    try {
                        j6(this, 9973, new android.support.v4.app.NotificationCompat.Builder(this, "engine").j6(java.lang.System.currentTimeMillis()).Hw(17301625).FH("Code Analysis").DW("Code analysis engine is active").j6(com.aide.ui.MainActivity.DW(this)).FH(-2).j6());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    try {
                        abcd.Abstractqc.j6(new com.aide.engine.service.b(this));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    return this.gn;
                }
                case 11: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 15; continue $sw1; }
                    abcd.wu.j6(th, -6021532779299917777L, this, r10);
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onCreate() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-1392779776942266704L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        super.onCreate();
                        com.aide.engine.service.Native.j6.init(this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return;
                }
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -1392779776942266704L, this);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onDestroy() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -3655387390142169280L, this);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-3655387390142169280L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        com.aide.common.ClassH.FH("Engine service destroyed - pid " + android.os.Process.myPid() + " id " + java.lang.System.identityHashCode(this));
                        this.FH.VH();
                        this.FH = null;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onTrimMemory(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -1065783692561423600L, this, new java.lang.Integer(r5));
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-1065783692561423600L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        super.onTrimMemory(r5);
                        com.aide.common.ClassH.FH("onTrimMemory - level: " + r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
