package abcd;

@abcd.Interfacexu
class Runnablegk implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.Runnable FH;
    final java.lang.Runnable Hw;

    @abcd.Interfacevu
    final abcd.lk v5;

    static {
        abcd.wu.j6(abcd.Runnablegk.class, -843596403928054707L, -460256628598712200L);
    }

    Runnablegk(abcd.lk r1, java.lang.Runnable r2, java.lang.Runnable r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 1405716372911714416L)
    public void run() {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -216758816745068085L, this);
    L22:
        throw th;
    L4:
        if (j6 == false) goto L25;
        abcd.wu.j6(-216758816745068085L, this);     // Catch: java.lang.Throwable -> L17
    L25:
        java.lang.Process r2 = java.lang.Runtime.getRuntime().exec("su");     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L14
        java.io.DataOutputStream r3 = new java.io.DataOutputStream(r2.getOutputStream());     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L14
        r3.writeBytes("echo hello\n");     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L14
        r3.writeBytes("exit\n");     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L14
        r3.flush();     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L14
        r2.waitFor();     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L14
        if (r2.exitValue() != 0) goto L9;
        abcd.lk.j6(this.v5, true);     // Catch: java.lang.Throwable -> L11 java.lang.Throwable -> L14
    L9:
        abcd.Runnablefk r4 = new abcd.Runnablefk(this);     // Catch: java.lang.Throwable -> L17
    L10:
        com.aide.ui.U.j6(r4);     // Catch: java.lang.Throwable -> L17
        return;
    L11:
        th = move-exception;
        com.aide.ui.U.j6(new abcd.Runnablefk(this));     // Catch: java.lang.Throwable -> L17
        throw th;     // Catch: java.lang.Throwable -> L17
    L14:
        r4 = new abcd.Runnablefk(this);     // Catch: java.lang.Throwable -> L17
        goto L10
    }
}
