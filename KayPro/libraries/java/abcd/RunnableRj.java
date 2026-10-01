package abcd;

@abcd.Interfacexu
class RunnableRj implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final abcd.Kj.d FH;

    static {
        abcd.wu.j6(abcd.RunnableRj.class, 5884104101721941200L, 303448477634184960L);
    }

    RunnableRj(abcd.Kj.d r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2191758840502088329L)
    public void run() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2968679498702388471L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2968679498702388471L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (abcd.Kj.DW(this.FH.Hw) != this.FH) goto L17;
        abcd.Kj.j6(this.FH.Hw);     // Catch: java.lang.Throwable -> L10
        abcd.Kj.j6(this.FH.Hw, null);     // Catch: java.lang.Throwable -> L10
        return;
    }
}
