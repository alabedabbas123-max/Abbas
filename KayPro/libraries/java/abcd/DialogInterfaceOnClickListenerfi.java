package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerfi implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    @abcd.Interfacevu
    final abcd.ii Hw;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerfi.class, 1005502431686740692L, 326102849785386240L);
    }

    DialogInterfaceOnClickListenerfi(abcd.ii r1, android.app.Activity r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -601960220253853180L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2456518380198869192L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2456518380198869192L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        android.app.AlertDialog r0 = (android.app.AlertDialog) r8;     // Catch: java.lang.Throwable -> L7
        abcd.ii.j6(this.Hw, r0);     // Catch: java.lang.Throwable -> L7
        ((com.aide.ui.activities.CommitActivity) this.FH).DW(this.Hw.j6(r0));     // Catch: java.lang.Throwable -> L7
    }
}
