package abcd;

@abcd.Interfacexu
class RunnableFk implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Gk FH;

    static {
        abcd.wu.j6(abcd.RunnableFk.class, 5827383158220726803L, -33568508796781632L);
    }

    RunnableFk(abcd.Gk r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2268433727670628820L)
    public void run() {
    L27:
        th = move-exception;
        if (DW == false) goto L32;
        abcd.wu.j6(th, -6601447001292854932L, this);
    L32:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6601447001292854932L, this);     // Catch: java.lang.Throwable -> L27
    L6:
        int r2 = 0;
    L8:
        if (r2 >= abcd.Gk.j6().Hw()) goto L10;
        abcd.Gk.j6((java.lang.String) abcd.Gk.j6().j6(r2));     // Catch: java.lang.Throwable -> L27
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L27
        goto L8
    L10:
        abcd.Gk.j6().j6();     // Catch: java.lang.Throwable -> L27
        abcd.Gk r3 = this.FH;     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L27
        r3.u7 = abcd.Gk.j6(this.FH, "logcat -v threadtime");     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L27
        java.io.BufferedReader r4 = new java.io.BufferedReader(new java.io.InputStreamReader(this.FH.u7.getInputStream()), 20);     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L27
    L12:
        java.lang.String r5 = r4.readLine();     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L27
        if (r5 == null) goto L48;
        java.lang.Object r6 = abcd.Gk.j6(this.FH);     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L27
        monitor-enter(r6);     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L27
    L39:
        if (abcd.Gk.DW(this.FH) == false) goto L20;
        abcd.Gk.j6(this.FH).wait(1000);     // Catch: java.lang.InterruptedException -> L34 java.lang.Throwable -> L23
        goto L39
    L20:
        monitor-exit(r6);     // Catch: java.lang.Throwable -> L23
        abcd.Gk.DW(this.FH, r5);     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L27
    L23:
        th = move-exception;
        throw th;     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L27
        goto L26
    L48:
        return;
    }
}
