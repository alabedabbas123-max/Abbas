package abcd;

@abcd.Interfacexu
class DialogInterfaceOnShowListenerGh implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.AbstractHh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnShowListenerGh.class, 1036993532042931165L, 2744351892304679669L);
    }

    DialogInterfaceOnShowListenerGh(abcd.AbstractHh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 325787052919003000L)
    public void onShow(android.content.DialogInterface r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1571946128870473008L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1571946128870473008L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.J8();     // Catch: java.lang.Throwable -> L8
    }
}
