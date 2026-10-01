package abcd;

@abcd.Interfacexu
public abstract class Abstractqc {

    @abcd.Interfaceru(field = -1553044775777438591L)
    private static abcd.Abstractqc DW;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = -236272350937648905L)
    private static java.lang.Object j6;

    static {
        abcd.wu.j6(abcd.Abstractqc.class, 356450621187126592L, 356450621187126592L);     // Catch: java.lang.Throwable -> L8
        if (FH == false) goto L6;
        abcd.wu.j6(-2722941559058630525L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new java.lang.Object();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -2722941559058630525L, null);
    L12:
        throw th;
    }

    public Abstractqc() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1637704114296172384L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(1637704114296172384L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static abcd.Abstractqc DW() {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, 2513231065445158872L, null);
    L18:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(2513231065445158872L, null);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.Object r3 = j6;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r3);     // Catch: java.lang.Throwable -> L14
        abcd.Abstractqc r4 = DW;     // Catch: java.lang.Throwable -> L11
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L11
        return r4;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public static void j6(abcd.Abstractqc r5) {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, -807780477067940745L, null, r5);
    L18:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-807780477067940745L, null, r5);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.Object r3 = j6;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r3);     // Catch: java.lang.Throwable -> L14
        DW = r5;     // Catch: java.lang.Throwable -> L11
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    public abstract java.io.InputStream j6(java.lang.String r1);

    public abstract java.lang.String j6();
}
