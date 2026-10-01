package abcd;

public class tE {
    private static int DW;
    private static final java.util.zip.Inflater[] j6 = null;

    static {
        j6 = new java.util.zip.Inflater[4];
    }

    private static synchronized java.util.zip.Inflater DW() {
        monitor-enter(abcd.tE.class);
    L11:
        th = move-exception;
        throw th;
    L5:
        if (DW <= 0) goto L9;
        java.util.zip.Inflater[] r1 = j6;     // Catch: java.lang.Throwable -> L11
        int r3 = DW - 1;     // Catch: java.lang.Throwable -> L11
        DW = r3;     // Catch: java.lang.Throwable -> L11
        java.util.zip.Inflater r2 = r1[r3];     // Catch: java.lang.Throwable -> L11
        j6[DW] = null;     // Catch: java.lang.Throwable -> L11
        monitor-exit(abcd.tE.class);
        return r2;
    L9:
        monitor-exit(abcd.tE.class);
        return null;
    }

    private static synchronized boolean DW(java.util.zip.Inflater r4) {
        monitor-enter(abcd.tE.class);
    L13:
        th = move-exception;
        throw th;
    L5:
        if (DW >= 4) goto L10;
        java.util.zip.Inflater[] r1 = j6;     // Catch: java.lang.Throwable -> L13
        int r2 = DW;     // Catch: java.lang.Throwable -> L13
        DW = r2 + 1;     // Catch: java.lang.Throwable -> L13
        r1[r2] = r4;     // Catch: java.lang.Throwable -> L13
        monitor-exit(abcd.tE.class);
        return false;
    L10:
        monitor-exit(abcd.tE.class);
        return true;
    }

    public static java.util.zip.Inflater j6() {
        java.util.zip.Inflater r0 = DW();
        if (r0 == null) goto L6;
        return r0;
    L6:
        return new abcd.XD();
    }

    public static void j6(java.util.zip.Inflater r1) {
        if (r1 == null) goto L7;
        r1.reset();
        if (DW(r1) == false) goto L8;
        ((abcd.XD) r1).j6();
        return;
    L8:
        return;
    }
}
