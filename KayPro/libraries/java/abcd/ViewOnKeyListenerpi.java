package abcd;

@abcd.Interfacexu
class ViewOnKeyListenerpi implements android.view.View.OnKeyListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.EditText FH;

    @abcd.Interfacevu
    final abcd.ui Hw;

    static {
        abcd.wu.j6(abcd.ViewOnKeyListenerpi.class, -4195144536276187105L, 7773822394056428124L);
    }

    ViewOnKeyListenerpi(abcd.ui r1, android.widget.EditText r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 5564003378695405L)
    public boolean onKey(android.view.View r9, int r10, android.view.KeyEvent r11) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -1313807391005268768L, this, r9, new java.lang.Integer(r10), r11);
    L17:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1313807391005268768L, this, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L13
    L6:
        if (r11.getAction() == 1) goto L8;
        return false;
    L8:
        if (r10 != 66) goto L20;
        this.FH.selectAll();     // Catch: java.lang.Throwable -> L13
        this.FH.requestFocus();     // Catch: java.lang.Throwable -> L13
        return true;
    L20:
        return false;
    }
}
