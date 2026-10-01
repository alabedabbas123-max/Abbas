package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerJh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Oh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerJh.class, -2572685827865588271L, 2193254100340038549L);
    }

    DialogInterfaceOnClickListenerJh(abcd.Oh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 739073827971205376L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -6175540661377982760L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-6175540661377982760L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        r8.cancel();     // Catch: java.lang.Throwable -> L7
    }
}
