package abcd;

@abcd.Interfacexu
class ViewOnKeyListenerri implements android.view.View.OnKeyListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.AlertDialog FH;

    @abcd.Interfacevu
    final abcd.ui Hw;

    static {
        abcd.wu.j6(abcd.ViewOnKeyListenerri.class, -4195144536276187105L, 7774069810023273904L);
    }

    ViewOnKeyListenerri(abcd.ui r1, android.app.AlertDialog r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 99194815338936105L)
    public boolean onKey(android.view.View r9, int r10, android.view.KeyEvent r11) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -921827847663309887L, this, r9, new java.lang.Integer(r10), r11);
    L19:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-921827847663309887L, this, r9, new java.lang.Integer(r10), r11);     // Catch: java.lang.Throwable -> L15
    L6:
        if (r11.getAction() == 1) goto L8;
        return false;
    L8:
        if (r10 == 66) goto L10;
        return false;
    L10:
        if (abcd.ui.DW(this.Hw, this.FH) == false) goto L12;
        abcd.ui.j6(this.Hw, this.FH);     // Catch: java.lang.Throwable -> L15
        this.FH.dismiss();     // Catch: java.lang.Throwable -> L15
        this.Hw.j6(this.FH);     // Catch: java.lang.Throwable -> L15
    L12:
        return true;
    }
}
