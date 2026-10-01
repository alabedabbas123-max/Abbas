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
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -671623290527996957L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-671623290527996957L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.common.ClassH.j6("Engine process killed after shutdown");     // Catch: java.lang.Throwable -> L8
        android.os.Process.killProcess(android.os.Process.myPid());     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = 3430457549353526812L)
    public void j6(java.lang.Throwable r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 5233835764199973167L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5233835764199973167L, this, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        com.aide.common.ClassH.DW(r5);     // Catch: java.lang.Throwable -> L12
        com.crashlytics.android.Crashlytics.logException(r5);     // Catch: java.lang.Throwable -> L12
        if (com.aide.engine.service.CodeAnalysisEngineService.j6(this.FH) == null) goto L21;
        com.aide.engine.service.CodeAnalysisEngineService.j6(this.FH).jO();     // Catch: android.os.RemoteException -> L10 java.lang.Throwable -> L12
    L22:
        return;
    L10:
        com.aide.common.ClassH.DW(r5);     // Catch: java.lang.Throwable -> L12
        return;
    }

    @Override
    @abcd.Interfacesu(method = 3523232398162695140L)
    public void sy() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -2147258966725242565L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2147258966725242565L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        com.aide.common.ClassH.DW("Engine process killed after OOM");     // Catch: java.lang.Throwable -> L14
        if (com.aide.engine.service.CodeAnalysisEngineService.j6(this.FH) != null) goto L19;
    L12:
        android.os.Process.killProcess(android.os.Process.myPid());     // Catch: java.lang.Throwable -> L14
        return;
    L19:
        com.aide.engine.service.CodeAnalysisEngineService.j6(this.FH).sy();     // Catch: android.os.RemoteException -> L10 java.lang.Throwable -> L14
    L10:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L14
        goto L12
    }
}
