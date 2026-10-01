package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerli implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.mi FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerli.class, 1714930153382168671L, 5124860084485846799L);
    }

    DialogInterfaceOnClickListenerli(abcd.mi r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -734790114215991427L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -3211341477829096855L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3211341477829096855L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        r8.dismiss();     // Catch: java.lang.Throwable -> L7
    }
}
