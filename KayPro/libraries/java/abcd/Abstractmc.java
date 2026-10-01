package abcd;

@abcd.Interfacexu
public abstract class Abstractmc {

    @abcd.Interfaceru(field = -523064720799552701L)
    private static abcd.Abstractmc DW;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 2296690719094790161L)
    private static java.lang.Object j6;

    static {
        abcd.wu.j6(abcd.Abstractmc.class, -763031331629171476L, -763031331629171476L);     // Catch: java.lang.Throwable -> L8
        if (FH == false) goto L6;
        abcd.wu.j6(1230057188939856771L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new java.lang.Object();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1230057188939856771L, null);
    L12:
        throw th;
    }

    public Abstractmc() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -2819042032058163600L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-2819042032058163600L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static abcd.Abstractmc j6() {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, -3787814060744596520L, null);
    L18:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-3787814060744596520L, null);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.Object r3 = j6;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r3);     // Catch: java.lang.Throwable -> L14
        abcd.Abstractmc r4 = DW;     // Catch: java.lang.Throwable -> L11
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L11
        return r4;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public abstract float j6(java.lang.String r1);
}
