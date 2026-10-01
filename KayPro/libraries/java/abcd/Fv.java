package abcd;

class Fv implements java.lang.Runnable {
    Fv() {
    }

    @Override
    public void run() {
        abcd.Hv.j6();     // Catch: java.lang.Throwable -> L4
        abcd.Hv.DW();     // Catch: java.lang.Throwable -> L4
    L6:
        android.os.Handler r0 = abcd.Hv.v5();
        java.lang.Runnable r1 = abcd.Hv.FH();
        if (abcd.Hv.Hw().size() != 0) goto L9;
        long r2 = 1000;
    L10:
        r0.postDelayed(r1, r2);
        return;
    L9:
        r2 = 10;
    L4:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
        goto L6
    }
}
