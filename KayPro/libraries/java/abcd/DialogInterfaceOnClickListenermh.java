package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenermh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.rh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenermh.class, 570958555126909067L, -1001231289257012165L);
    }

    DialogInterfaceOnClickListenermh(abcd.rh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -643073885385984712L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -4430016259632820416L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4430016259632820416L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        android.app.AlertDialog r0 = (android.app.AlertDialog) r8;     // Catch: java.lang.Throwable -> L7
        abcd.rh.j6(this.FH, r0);     // Catch: java.lang.Throwable -> L7
        r0.dismiss();     // Catch: java.lang.Throwable -> L7
        abcd.rh.DW(this.FH, r0);     // Catch: java.lang.Throwable -> L7
    }
}
