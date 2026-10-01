package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListeneroi implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.ui FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListeneroi.class, -4195144536276187105L, 7773698686079100175L);
    }

    DialogInterfaceOnClickListeneroi(abcd.ui r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 788199361031435844L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5311007677978911035L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5311007677978911035L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        android.app.AlertDialog r0 = (android.app.AlertDialog) r8;     // Catch: java.lang.Throwable -> L7
        abcd.ui.j6(this.FH, r0);     // Catch: java.lang.Throwable -> L7
        r0.dismiss();     // Catch: java.lang.Throwable -> L7
        this.FH.j6(r0);     // Catch: java.lang.Throwable -> L7
    }
}
