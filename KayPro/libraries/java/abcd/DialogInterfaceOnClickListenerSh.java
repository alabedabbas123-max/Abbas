package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerSh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    @abcd.Interfacevu
    final abcd.Yh Hw;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerSh.class, 4518137094473097045L, 275064306853505841L);
    }

    DialogInterfaceOnClickListenerSh(abcd.Yh r1, android.app.Activity r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -245041285058999904L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5273463928502553904L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5273463928502553904L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        android.app.AlertDialog r0 = (android.app.AlertDialog) r8;     // Catch: java.lang.Throwable -> L7
        abcd.Yh.j6(this.Hw, r0);     // Catch: java.lang.Throwable -> L7
        r0.dismiss();     // Catch: java.lang.Throwable -> L7
        abcd.Yh.j6(this.Hw, this.FH, abcd.Yh.DW(this.Hw, r0), abcd.Yh.FH(this.Hw, r0));     // Catch: java.lang.Throwable -> L7
    }
}
