package abcd;

@abcd.Interfacexu
public abstract class Abstractpc {

    @abcd.Interfaceru(field = -3872150778830458320L)
    private static abcd.Abstractpc DW;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = -822963041728163184L)
    private static java.lang.Object j6;

    static {
        abcd.wu.j6(abcd.Abstractpc.class, 6961425216133458609L, 6961425216133458609L);     // Catch: java.lang.Throwable -> L8
        if (FH == false) goto L6;
        abcd.wu.j6(-1279487899409338355L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new java.lang.Object();     // Catch: java.lang.Throwable -> L8
        DW = new abcd.oc();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -1279487899409338355L, null);
    L12:
        throw th;
    }

    public Abstractpc() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -3252117149220783907L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-3252117149220783907L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static abcd.Abstractpc j6() {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, 3836405997313653904L, null);
    L18:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(3836405997313653904L, null);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.Object r3 = j6;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r3);     // Catch: java.lang.Throwable -> L14
        abcd.Abstractpc r4 = DW;     // Catch: java.lang.Throwable -> L11
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L11
        return r4;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public abstract boolean j6(java.lang.String r1, java.lang.String r2);
}
