package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class h implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.content.Context FH;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.h.class, -3499094272017024501L, -3746680754669148701L);
    }

    h(android.content.Context r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -93043306573545592L)
    public void run() {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -2487501988396112309L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L22;
        abcd.wu.j6(-2487501988396112309L, this);     // Catch: java.lang.Throwable -> L14
    L22:
        java.io.BufferedReader r3 = new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.Runtime.getRuntime().exec("logcat -v threadtime").getInputStream()), 20);     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L14
    L7:
        java.lang.String r2 = r3.readLine();     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L14
        if (r2 == null) goto L31;
        if (r2.contains("console.log") == false) goto L7;
        android.content.Intent r4 = new android.content.Intent();     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L14
        r4.setPackage("com.aide.ui");     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L14
        r4.setAction("com.aide.runtime.VIEW_LOGCAT_ENTRY");     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L14
        r4.putExtra("lines", new java.lang.String[]{r2});     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L14
        this.FH.sendBroadcast(r4);     // Catch: java.io.IOException -> L21 java.lang.Throwable -> L14
    L31:
        return;
    }
}
