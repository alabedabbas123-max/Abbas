package abcd;

@abcd.Interfacexu
class DialogInterfaceOnShowListenerLh implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Oh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnShowListenerLh.class, -2572685827865588271L, 2193403255567375865L);
    }

    DialogInterfaceOnShowListenerLh(abcd.Oh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 66569645168422633L)
    public void onShow(android.content.DialogInterface r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4292483544503373907L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4292483544503373907L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        android.app.AlertDialog r2 = (android.app.AlertDialog) r5;     // Catch: java.lang.Throwable -> L8
        abcd.Oh.j6(this.FH, r2);     // Catch: java.lang.Throwable -> L8
        abcd.Oh.DW(this.FH, r2);     // Catch: java.lang.Throwable -> L8
    }
}
