package com.aide.engine.service;

@abcd.Interfacexu
class d implements com.aide.engine.Interfaced {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.engine.service.CodeAnalysisEngineService FH;

    static {
        abcd.wu.j6(com.aide.engine.service.d.class, 2006115082471780797L, -146508955040731664L);
    }

    d(com.aide.engine.service.CodeAnalysisEngineService r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -5871885491971028448L)
    public void aj() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -671623290527996957L, this);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-671623290527996957L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.common.ClassH.j6("Engine process killed after shutdown");
                        android.os.Process.killProcess(android.os.Process.myPid());
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

    @Override
    @abcd.Interfacesu(method = 3430457549353526812L)
    public void j6(java.lang.Throwable r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 12: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 16; continue $sw1; }
                    abcd.wu.j6(th, 5233835764199973167L, this, r5);
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(5233835764199973167L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        com.aide.common.ClassH.DW(r5);
                        com.crashlytics.android.Crashlytics.logException(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    if (com.aide.engine.service.CodeAnalysisEngineService.j6(this.FH) == null) { $pc1 = 21; continue $sw1; }
                    try {
                        com.aide.engine.service.CodeAnalysisEngineService.j6(this.FH).jO();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof android.os.RemoteException) { $pc1 = 10; continue $sw1; }
                        $pc1 = 12; continue $sw1;
                    }
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    return;
                }
                case 10: {
                    try {
                        com.aide.common.ClassH.DW(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    return;
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 3523232398162695140L)
    public void sy() {
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 14: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 18; continue $sw2; }
                    abcd.wu.j6(th, -2147258966725242565L, this);
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-2147258966725242565L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        com.aide.common.ClassH.DW("Engine process killed after OOM");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    if (com.aide.engine.service.CodeAnalysisEngineService.j6(this.FH) != null) { $pc2 = 19; continue $sw2; }
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    try {
                        android.os.Process.killProcess(android.os.Process.myPid());
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    return;
                }
                case 19: {
                    try {
                        com.aide.engine.service.CodeAnalysisEngineService.j6(this.FH).sy();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof android.os.RemoteException) { $pc2 = 10; continue $sw2; }
                        $pc2 = 14; continue $sw2;
                    }
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    e = $ex2;
                    try {
                        com.aide.common.ClassH.DW(e);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    { $pc2 = 12; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
