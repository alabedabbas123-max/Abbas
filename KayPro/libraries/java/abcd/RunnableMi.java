package abcd;

@abcd.Interfacexu
class RunnableMi implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final abcd.AbstractOi.a FH;

    static {
        abcd.wu.j6(abcd.RunnableMi.class, 31530143936738400L, -2788257145366999605L);
    }

    RunnableMi(abcd.AbstractOi.a r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -813684774482221756L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5944773848613687327L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5944773848613687327L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.v5.j6("KEY_PACKAGE_REPLIED_NOT_VALID");     // Catch: java.lang.Throwable -> L8
    }
}
