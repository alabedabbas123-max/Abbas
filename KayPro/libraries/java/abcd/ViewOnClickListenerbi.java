package abcd;

@abcd.Interfacexu
class ViewOnClickListenerbi implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.AlertDialog FH;
    final abcd.DialogInterfaceOnShowListenerci Hw;

    static {
        abcd.wu.j6(abcd.ViewOnClickListenerbi.class, 294461532386472240L, -5390214936315638241L);
    }

    ViewOnClickListenerbi(abcd.DialogInterfaceOnShowListenerci r1, android.app.AlertDialog r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 396962515227020775L)
    public void onClick(android.view.View r9) {
    L26:
        th = move-exception;
        if (DW == false) goto L31;
        abcd.wu.j6(th, 6924461451797592976L, this, r9);
    L31:
        throw th;
    L4:
        if (j6 == false) goto L35;
        abcd.wu.j6(6924461451797592976L, this, r9);     // Catch: java.lang.Throwable -> L26
    L35:
        abcd.HJ r3 = new abcd.HJ(abcd.di.FH(this.Hw.Hw, this.FH));     // Catch: java.net.URISyntaxException -> L33 java.lang.Throwable -> L26
        java.util.Iterator<abcd.DJ> r4 = abcd.AbstractjJ.u7().iterator();     // Catch: java.net.URISyntaxException -> L33 java.lang.Throwable -> L26
    L8:
        if (r4.hasNext() == false) goto L19;
        abcd.DJ r5 = r4.next();     // Catch: java.net.URISyntaxException -> L33 java.lang.Throwable -> L26
        if (r5.DW().toUpperCase(java.util.Locale.US).contains("SSH") == false) goto L8;
        if (r5.j6(r3) == false) goto L8;
        if (r3.gn() == null) goto L17;
        if (r3.gn().trim().length() != 0) goto L8;
    L17:
        abcd.HJ r0 = r3.v5("user");     // Catch: java.net.URISyntaxException -> L33 java.lang.Throwable -> L26
        com.almlkaide.kaypro.util.Toasty.toast(this.Hw.FH, "You must specify a username in the URL in this form: " + r0.toString(), 1).show();     // Catch: java.net.URISyntaxException -> L33 java.lang.Throwable -> L26
        return;
    L19:
        java.lang.String r6 = r3.toString().toLowerCase(java.util.Locale.US);     // Catch: java.net.URISyntaxException -> L33 java.lang.Throwable -> L26
        if (r6.startsWith("https://github.com/") == false) goto L24;
        if (r6.endsWith(".git") == true) goto L24;
        abcd.di.Hw(this.Hw.Hw, this.FH).setText(r3.toString() + ".git");     // Catch: java.net.URISyntaxException -> L33 java.lang.Throwable -> L26
    L24:
        abcd.di.j6(this.Hw.Hw, this.FH);     // Catch: java.lang.Throwable -> L26
        this.FH.dismiss();     // Catch: java.lang.Throwable -> L26
        com.aide.ui.U.Ws().j6(abcd.di.j6(this.Hw.Hw), abcd.di.DW(this.Hw.Hw, this.FH), abcd.di.FH(this.Hw.Hw, this.FH));     // Catch: java.lang.Throwable -> L26
    }
}
