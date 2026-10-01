package abcd;

@abcd.Interfacexu
public class yc {

    @abcd.Interfaceru(field = 1851604470520814949L)
    private static java.lang.Object DW;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 1863575866833605661L)
    private static long j6;

    static {
        abcd.wu.j6(abcd.yc.class, -431451251040535232L, -431451251040535232L);     // Catch: java.lang.Throwable -> L8
        if (FH == false) goto L6;
        abcd.wu.j6(1505740036645125567L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        DW = new java.lang.Object();     // Catch: java.lang.Throwable -> L8
        abcd.xc r3 = new abcd.xc("Time getter");     // Catch: java.lang.Throwable -> L8
        r3.setPriority(1);     // Catch: java.lang.Throwable -> L8
        r3.start();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1505740036645125567L, null);
    L12:
        throw th;
    }

    public yc() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -3510476266293760201L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-3510476266293760201L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static long DW() {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, -668219584164888381L, null);
    L18:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-668219584164888381L, null);     // Catch: java.lang.Throwable -> L14
    L6:
        java.lang.Object r3 = DW;     // Catch: java.lang.Throwable -> L14
        monitor-enter(r3);     // Catch: java.lang.Throwable -> L14
        long r4 = j6;     // Catch: java.lang.Throwable -> L11
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L11
        return r4;
    L11:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L14
    }

    static long j6(long r0) {
        j6 = r0;
        return r0;
    }

    static java.lang.Object j6() {
        return DW;
    }
}
