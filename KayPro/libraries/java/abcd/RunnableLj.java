package abcd;

@abcd.Interfacexu
class RunnableLj implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final boolean FH;
    final abcd.Kj.b Hw;

    static {
        abcd.wu.j6(abcd.RunnableLj.class, 1775716618827084105L, -702714954996477192L);
    }

    RunnableLj(abcd.Kj.b r1, boolean r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 194803595361618025L)
    public void run() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 3576049162732019421L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3576049162732019421L, this);     // Catch: java.lang.Throwable -> L10
    L6:
        abcd.Kj.j6(this.Hw.VH);     // Catch: java.lang.Throwable -> L10
        if (this.FH == false) goto L17;
        abcd.Kj.b.j6(this.Hw).run();     // Catch: java.lang.Throwable -> L10
        return;
    }
}
