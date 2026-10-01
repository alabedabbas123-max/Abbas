package abcd;

public class sw {
    private static final java.lang.Object DW = null;
    private static java.lang.Boolean j6;

    static {
        DW = new java.lang.Object();
    }

    public static void DW() {
        java.lang.Object r0 = DW;
        monitor-enter(r0);
        j6 = null;     // Catch: java.lang.Throwable -> L8
        j6();     // Catch: java.lang.Throwable -> L8
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    private static boolean FH() {
        return "true".equals(j6("debug.backbone"));
    }

    private static java.lang.String j6(java.lang.String r7) {
        return (java.lang.String) java.lang.Class.forName("android.os.SystemProperties").getMethod("get", new java.lang.Class[]{java.lang.String.class}).invoke(null, new java.lang.Object[]{r7});
    L5:
        return null;
    }

    public static boolean j6() {
        java.lang.Object r0 = DW;
        monitor-enter(r0);
    L18:
        th = move-exception;
        throw th;
    L5:
        if (j6 == null) goto L9;
        boolean r1 = j6.booleanValue();     // Catch: java.lang.Throwable -> L18
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L18
        return r1;
    L9:
        j6 = java.lang.Boolean.valueOf(FH());     // Catch: java.lang.Throwable -> L18
        boolean r2 = abcd.rw.v5();     // Catch: java.lang.Throwable -> L18
        abcd.rw.j6(j6.booleanValue());     // Catch: java.lang.Throwable -> L18
        if (r2 != j6.booleanValue()) goto L12;
    L15:
        boolean r3 = j6.booleanValue();     // Catch: java.lang.Throwable -> L18
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L18
        return r3;
    L12:
        if (j6.booleanValue() == false) goto L14;
        abcd.xw.j6(694086856, 17301629, "backbone developer mode enabled");     // Catch: java.lang.Throwable -> L18
        goto L15
    L14:
        abcd.xw.j6(694086856, 17301642, "backbone developer mode disabled");     // Catch: java.lang.Throwable -> L18
        goto L15
    }
}
