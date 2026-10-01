package abcd;

@abcd.Interfacexu
class DialogInterfaceOnShowListenerhi implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.ii FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnShowListenerhi.class, 1005502431686740692L, 326135566158489412L);
    }

    DialogInterfaceOnShowListenerhi(abcd.ii r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 308349033742862541L)
    public void onShow(android.content.DialogInterface r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5829446943189782625L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5829446943189782625L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.ii.DW(this.FH, (android.app.AlertDialog) r5);     // Catch: java.lang.Throwable -> L8
    }
}
