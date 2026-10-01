package abcd;

@abcd.Interfacexu
class DialogInterfaceOnShowListenerWh implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Yh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnShowListenerWh.class, 4518137094473097045L, 275317450211161601L);
    }

    DialogInterfaceOnShowListenerWh(abcd.Yh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -25301166104215848L)
    public void onShow(android.content.DialogInterface r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1783640495785088799L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1783640495785088799L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.j6((android.app.AlertDialog) r5);     // Catch: java.lang.Throwable -> L8
    }
}
