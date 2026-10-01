package abcd;

@abcd.Interfacexu
class DialogInterfaceOnShowListeneroh implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.rh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnShowListeneroh.class, 570958555126909067L, -1001313000801674493L);
    }

    DialogInterfaceOnShowListeneroh(abcd.rh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -169254180579570520L)
    public void onShow(android.content.DialogInterface r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1632029268654760989L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1632029268654760989L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.j6((android.app.AlertDialog) r5);     // Catch: java.lang.Throwable -> L8
    }
}
