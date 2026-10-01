package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerni implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.ui FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerni.class, -4195144536276187105L, 7773574978105835520L);
    }

    DialogInterfaceOnClickListenerni(abcd.ui r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -39116608957793824L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 5409814189350356448L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(5409814189350356448L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.ui.j6(this.FH, (android.app.AlertDialog) r8);     // Catch: java.lang.Throwable -> L7
        r8.cancel();     // Catch: java.lang.Throwable -> L7
    }
}
