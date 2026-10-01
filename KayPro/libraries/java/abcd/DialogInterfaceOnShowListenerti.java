package abcd;

@abcd.Interfacexu
class DialogInterfaceOnShowListenerti implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.EditText FH;

    @abcd.Interfacevu
    final abcd.ui Hw;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnShowListenerti.class, -4195144536276187105L, 7774317226006372860L);
    }

    DialogInterfaceOnShowListenerti(abcd.ui r1, android.widget.EditText r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -113792467494429968L)
    public void onShow(android.content.DialogInterface r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -7888023750507210080L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-7888023750507210080L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.DW((android.app.AlertDialog) r5);     // Catch: java.lang.Throwable -> L8
        this.FH.selectAll();     // Catch: java.lang.Throwable -> L8
    }
}
