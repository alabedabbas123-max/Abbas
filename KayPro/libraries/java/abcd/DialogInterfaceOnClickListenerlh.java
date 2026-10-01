package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerlh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.rh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerlh.class, 570958555126909067L, -1001190433478586060L);
    }

    DialogInterfaceOnClickListenerlh(abcd.rh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 1166013514265621792L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 4496062484576932245L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4496062484576932245L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.rh.j6(this.FH, (android.app.AlertDialog) r8);     // Catch: java.lang.Throwable -> L7
        r8.cancel();     // Catch: java.lang.Throwable -> L7
    }
}
