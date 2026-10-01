package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerei implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.ii FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerei.class, 1005502431686740692L, 326086491604929595L);
    }

    DialogInterfaceOnClickListenerei(abcd.ii r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -503776136178890013L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -3573197227653012369L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3573197227653012369L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.ii.j6(this.FH, (android.app.AlertDialog) r8);     // Catch: java.lang.Throwable -> L7
        r8.cancel();     // Catch: java.lang.Throwable -> L7
    }
}
