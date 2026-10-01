package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenervh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Ch FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenervh.class, -6708075855096698041L, -290547596187184592L);
    }

    DialogInterfaceOnClickListenervh(abcd.Ch r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -161262339737887481L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 4030826228596889831L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4030826228596889831L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.Ch.j6(this.FH, (android.app.AlertDialog) r8);     // Catch: java.lang.Throwable -> L7
        r8.cancel();     // Catch: java.lang.Throwable -> L7
    }
}
