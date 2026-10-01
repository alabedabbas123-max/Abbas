package abcd;

@abcd.Interfacexu
class RunnableBl implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Cl FH;

    static {
        abcd.wu.j6(abcd.RunnableBl.class, -2365206608828434332L, 335515349462864064L);
    }

    RunnableBl(abcd.Cl r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 1599658244264165580L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 755635411937028000L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(755635411937028000L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.nw();     // Catch: java.lang.Throwable -> L8
    }
}
