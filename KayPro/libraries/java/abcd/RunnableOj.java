package abcd;

@abcd.Interfacexu
class RunnableOj implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final abcd.Kj.d FH;

    static {
        abcd.wu.j6(abcd.RunnableOj.class, 5884104101721941200L, 303068683987507281L);
    }

    RunnableOj(abcd.Kj.d r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 2518656817458446949L)
    public void run() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2974048390518603420L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2974048390518603420L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (abcd.Kj.DW(this.FH.Hw) != this.FH) goto L17;
        abcd.Kj.j6(this.FH.Hw);     // Catch: java.lang.Throwable -> L10
        abcd.Kj.j6(this.FH.Hw, null);     // Catch: java.lang.Throwable -> L10
        return;
    }
}
