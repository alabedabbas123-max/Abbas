package abcd;

@abcd.Interfacexu
class DialogInterfaceOnDismissListenerFh implements android.content.DialogInterface.OnDismissListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.AbstractHh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnDismissListenerFh.class, 1036993532042931165L, 2744244746393978072L);
    }

    DialogInterfaceOnDismissListenerFh(abcd.AbstractHh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 870526715195998315L)
    public void onDismiss(android.content.DialogInterface r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -609637873835135541L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-609637873835135541L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.J0();     // Catch: java.lang.Throwable -> L8
    }
}
