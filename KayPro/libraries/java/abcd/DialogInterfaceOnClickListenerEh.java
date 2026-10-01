package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerEh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.AbstractHh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerEh.class, 1036993532042931165L, 2744137600487339769L);
    }

    DialogInterfaceOnClickListenerEh(abcd.AbstractHh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -314247248302305681L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 937938650939185280L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(937938650939185280L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH.Zo();     // Catch: java.lang.Throwable -> L7
    }
}
