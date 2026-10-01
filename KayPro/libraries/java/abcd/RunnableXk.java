package abcd;

@abcd.Interfacexu
class RunnableXk implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Zk FH;

    static {
        abcd.wu.j6(abcd.RunnableXk.class, -8061245974084835088L, 760219282811510137L);
    }

    RunnableXk(abcd.Zk r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1910749845844493424L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 25172049163842875L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(25172049163842875L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.Zk.j6(this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
