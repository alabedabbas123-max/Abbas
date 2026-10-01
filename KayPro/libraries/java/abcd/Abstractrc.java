package abcd;

@abcd.Interfacexu
public abstract class Abstractrc {

    @abcd.Interfaceru(field = 3743171931245145259L)
    private static abcd.Abstractrc DW;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 1035069477755027961L)
    private static java.lang.Object j6;

    static {
        abcd.wu.j6(abcd.Abstractrc.class, 3508908880632874191L, 3508908880632874191L);     // Catch: java.lang.Throwable -> L8
        if (FH == false) goto L6;
        abcd.wu.j6(1759397294414490576L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new java.lang.Object();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1759397294414490576L, null);
    L12:
        throw th;
    }

    public Abstractrc() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 4744417128173355776L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(4744417128173355776L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static abcd.Abstractrc j6() {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, -3631764667306789755L, null);
    L18:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-3631764667306789755L, null);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.Object r3 = j6;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r3);     // Catch: java.lang.Throwable -> L14
        abcd.Abstractrc r4 = DW;     // Catch: java.lang.Throwable -> L11
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L11
        return r4;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public abstract java.lang.Thread j6(java.lang.ThreadGroup r1, java.lang.Runnable r2, java.lang.String r3, long r4);
}
