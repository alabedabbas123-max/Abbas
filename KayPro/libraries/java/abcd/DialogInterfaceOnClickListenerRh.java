package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerRh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Yh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerRh.class, 4518137094473097045L, 275001021024250136L);
    }

    DialogInterfaceOnClickListenerRh(abcd.Yh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -277856506411452360L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 4539968155737117075L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4539968155737117075L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.Yh.j6(this.FH, (android.app.AlertDialog) r8);     // Catch: java.lang.Throwable -> L7
        r8.cancel();     // Catch: java.lang.Throwable -> L7
    }
}
