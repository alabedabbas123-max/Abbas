package abcd;

@abcd.Interfacexu
class DialogInterfaceOnShowListenerci implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    @abcd.Interfacevu
    final abcd.di Hw;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnShowListenerci.class, 294461532386472240L, -2596550313759284976L);
    }

    DialogInterfaceOnShowListenerci(abcd.di r1, android.app.Activity r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 314332769516968800L)
    public void onShow(android.content.DialogInterface r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 765323470542911712L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(765323470542911712L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        android.app.AlertDialog r2 = (android.app.AlertDialog) r6;     // Catch: java.lang.Throwable -> L8
        this.Hw.j6(r2);     // Catch: java.lang.Throwable -> L8
        r2.getButton(-1).setOnClickListener(new abcd.ViewOnClickListenerbi(this, r2));     // Catch: java.lang.Throwable -> L8
    }
}
