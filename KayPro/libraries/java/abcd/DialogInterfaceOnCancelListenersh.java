package abcd;

@abcd.Interfacexu
class DialogInterfaceOnCancelListenersh implements android.content.DialogInterface.OnCancelListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.uh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnCancelListenersh.class, -465475316197143384L, 1201128321250378793L);
    }

    DialogInterfaceOnCancelListenersh(abcd.uh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 868672808753753157L)
    public void onCancel(android.content.DialogInterface r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -8030713740123151297L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-8030713740123151297L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.uh.j6(this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
