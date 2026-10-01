package abcd;

@abcd.Interfacexu
class xc extends java.lang.Thread {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.xc.class, -431451251040535232L, -570162030021418635L);
    }

    xc(java.lang.String r1) {
        super(r1);
    }

    @Override
    @abcd.Interfacesu(method = -505839303755303875L)
    public void run() {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -618672674677122000L, this);
    L24:
        throw th;
    L4:
        if (j6 == false) goto L29;
        abcd.wu.j6(-618672674677122000L, this);     // Catch: java.lang.Throwable -> L19
    L29:
        if (isInterrupted() == true) goto L34;
        java.lang.Object r2 = abcd.yc.j6();     // Catch: java.lang.InterruptedException -> L26 java.lang.Throwable -> L19
        monitor-enter(r2);     // Catch: java.lang.InterruptedException -> L26 java.lang.Throwable -> L19
        abcd.yc.j6(java.lang.System.currentTimeMillis());     // Catch: java.lang.Throwable -> L15
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L15
        java.lang.Thread.sleep(100);     // Catch: java.lang.InterruptedException -> L26 java.lang.Throwable -> L19
    L15:
        th = move-exception;
        throw th;     // Catch: java.lang.InterruptedException -> L26 java.lang.Throwable -> L19
        goto L18
    L34:
        return;
    }
}
