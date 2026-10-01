package abcd;

@abcd.Interfacexu
public abstract class Abstractlc {

    @abcd.Interfaceru(field = -1866576513991797627L)
    private static abcd.Abstractlc DW;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 1775813849288939775L)
    private static java.lang.Object j6;

    static {
        abcd.wu.j6(abcd.Abstractlc.class, 1067082844909081120L, 1067082844909081120L);     // Catch: java.lang.Throwable -> L8
        if (FH == false) goto L6;
        abcd.wu.j6(3176102765441174928L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new java.lang.Object();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 3176102765441174928L, null);
    L12:
        throw th;
    }

    public Abstractlc() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 267002143026857037L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(267002143026857037L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static abcd.Abstractlc j6() {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, -1705772020450490709L, null);
    L18:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-1705772020450490709L, null);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.Object r3 = j6;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r3);     // Catch: java.lang.Throwable -> L14
        abcd.Abstractlc r4 = DW;     // Catch: java.lang.Throwable -> L11
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L11
        return r4;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public abstract boolean j6(java.io.File r1, long r2);
}
