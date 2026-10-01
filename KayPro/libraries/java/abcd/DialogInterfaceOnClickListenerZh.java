package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerZh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.di FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerZh.class, 294461532386472240L, -2596368357752936121L);
    }

    DialogInterfaceOnClickListenerZh(abcd.di r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 792134571568303152L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -11430350214044300L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-11430350214044300L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.di.j6(this.FH, (android.app.AlertDialog) r8);     // Catch: java.lang.Throwable -> L7
        r8.cancel();     // Catch: java.lang.Throwable -> L7
    }
}
