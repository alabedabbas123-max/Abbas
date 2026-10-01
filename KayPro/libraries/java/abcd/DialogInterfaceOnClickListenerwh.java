package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerwh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Ch FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerwh.class, -6708075855096698041L, -290684639754567993L);
    }

    DialogInterfaceOnClickListenerwh(abcd.Ch r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -868422523987040843L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 5309248098472877240L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(5309248098472877240L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        android.app.AlertDialog r0 = (android.app.AlertDialog) r8;     // Catch: java.lang.Throwable -> L7
        abcd.Ch.j6(this.FH, r0);     // Catch: java.lang.Throwable -> L7
        r0.dismiss();     // Catch: java.lang.Throwable -> L7
        abcd.Ch.j6(this.FH, abcd.Ch.j6(this.FH), abcd.Ch.DW(this.FH, r0), abcd.Ch.FH(this.FH, r0), abcd.Ch.Hw(this.FH, r0));     // Catch: java.lang.Throwable -> L7
    }
}
