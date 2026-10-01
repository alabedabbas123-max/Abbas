package abcd;

@abcd.Interfacexu
class Nh implements android.widget.AdapterView.OnItemClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.AlertDialog FH;

    @abcd.Interfacevu
    final abcd.Oh Hw;

    static {
        abcd.wu.j6(abcd.Nh.class, -2572685827865588271L, 2193552410810966357L);
    }

    Nh(abcd.Oh r1, android.app.AlertDialog r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -786265504497768043L)
    public void onItemClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 802374041035027216L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(802374041035027216L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L17
    L5:
        java.lang.String r0 = (java.lang.String) r10.getItemAtPosition(r12);     // Catch: java.lang.Throwable -> L17
        if (r0.equals("..") == false) goto L12;
        abcd.Oh.j6(this.Hw, abcd.Oh.FH(this.Hw).substring(0, abcd.Oh.FH(this.Hw).lastIndexOf(47)));     // Catch: java.lang.Throwable -> L17
        if (abcd.Oh.FH(this.Hw).length() != 0) goto L15;
        abcd.Oh.j6(this.Hw, "/");     // Catch: java.lang.Throwable -> L17
    L15:
        abcd.Oh.DW(this.Hw, this.FH);     // Catch: java.lang.Throwable -> L17
        return;
    L12:
        if (abcd.Oh.FH(this.Hw).length() <= 1) goto L14;
        abcd.Oh.j6(this.Hw, abcd.Oh.FH(this.Hw) + "/");     // Catch: java.lang.Throwable -> L17
    L14:
        abcd.Oh.j6(this.Hw, abcd.Oh.FH(this.Hw) + r0);     // Catch: java.lang.Throwable -> L17
        goto L15
    }
}
