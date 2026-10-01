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
        abcd.HJ r3 = null;
        java.util.Iterator<abcd.DJ> r4 = null;
        abcd.DJ r5 = null;
        abcd.HJ r0 = null;
        java.lang.String r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 26: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 31; continue $sw0; }
                    abcd.wu.j6(th, 6924461451797592976L, this, r9);
                    $pc0 = 31; continue $sw0;
                }
                case 31: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 35; continue $sw0; }
                    try {
                        abcd.wu.j6(6924461451797592976L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    $pc0 = 35; continue $sw0;
                }
                case 35: {
                    try {
                        r3 = new abcd.HJ(abcd.di.FH(this.Hw.Hw, this.FH));
                        r4 = abcd.AbstractjJ.u7().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.net.URISyntaxException) { $pc0 = 33; continue $sw0; }
                        $pc0 = 26; continue $sw0;
                    }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r4.hasNext() == false) { $pc0 = 19; continue $sw0; }
                    try {
                        r5 = r4.next();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.net.URISyntaxException) { $pc0 = 33; continue $sw0; }
                        $pc0 = 26; continue $sw0;
                    }
                    if (r5.DW().toUpperCase(java.util.Locale.US).contains("SSH") == false) { $pc0 = 8; continue $sw0; }
                    if (r5.j6(r3) == false) { $pc0 = 8; continue $sw0; }
                    if (r3.gn() == null) { $pc0 = 17; continue $sw0; }
                    if (r3.gn().trim().length() != 0) { $pc0 = 8; continue $sw0; }
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    try {
                        r0 = r3.v5("user");
                        com.almlkaide.kaypro.util.Toasty.toast(this.Hw.FH, "You must specify a username in the URL in this form: " + r0.toString(), 1).show();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.net.URISyntaxException) { $pc0 = 33; continue $sw0; }
                        $pc0 = 26; continue $sw0;
                    }
                    return;
                }
                case 19: {
                    try {
                        r6 = r3.toString().toLowerCase(java.util.Locale.US);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.net.URISyntaxException) { $pc0 = 33; continue $sw0; }
                        $pc0 = 26; continue $sw0;
                    }
                    if (r6.startsWith("https://github.com/") == false) { $pc0 = 24; continue $sw0; }
                    if (r6.endsWith(".git") == true) { $pc0 = 24; continue $sw0; }
                    try {
                        abcd.di.Hw(this.Hw.Hw, this.FH).setText(r3.toString() + ".git");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.net.URISyntaxException) { $pc0 = 33; continue $sw0; }
                        $pc0 = 26; continue $sw0;
                    }
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    try {
                        abcd.di.j6(this.Hw.Hw, this.FH);
                        this.FH.dismiss();
                        com.aide.ui.U.Ws().j6(abcd.di.j6(this.Hw.Hw), abcd.di.DW(this.Hw.Hw, this.FH), abcd.di.FH(this.Hw.Hw, this.FH));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 26; continue $sw0;
                    }
                    return;
                }
                case 33: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
