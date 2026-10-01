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
        java.lang.String r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 17: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 21; continue $sw0; }
                    abcd.wu.j6(th, 802374041035027216L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(802374041035027216L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0 = (java.lang.String) r10.getItemAtPosition(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    if (r0.equals("..") == false) { $pc0 = 12; continue $sw0; }
                    try {
                        abcd.Oh.j6(this.Hw, abcd.Oh.FH(this.Hw).substring(0, abcd.Oh.FH(this.Hw).lastIndexOf(47)));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    if (abcd.Oh.FH(this.Hw).length() != 0) { $pc0 = 15; continue $sw0; }
                    try {
                        abcd.Oh.j6(this.Hw, "/");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    try {
                        abcd.Oh.DW(this.Hw, this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    return;
                }
                case 12: {
                    if (abcd.Oh.FH(this.Hw).length() <= 1) { $pc0 = 14; continue $sw0; }
                    try {
                        abcd.Oh.j6(this.Hw, abcd.Oh.FH(this.Hw) + "/");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    try {
                        abcd.Oh.j6(this.Hw, abcd.Oh.FH(this.Hw) + r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    { $pc0 = 15; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
