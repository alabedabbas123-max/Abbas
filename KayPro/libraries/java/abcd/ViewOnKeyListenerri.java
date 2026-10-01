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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 15: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 19; continue $sw0; }
                    abcd.wu.j6(th, -921827847663309887L, this, r9, new java.lang.Integer(r10), r11);
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-921827847663309887L, this, r9, new java.lang.Integer(r10), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r11.getAction() == 1) { $pc0 = 8; continue $sw0; }
                    return false;
                }
                case 8: {
                    if (r10 == 66) { $pc0 = 10; continue $sw0; }
                    return false;
                }
                case 10: {
                    if (abcd.ui.DW(this.Hw, this.FH) == false) { $pc0 = 12; continue $sw0; }
                    try {
                        abcd.ui.j6(this.Hw, this.FH);
                        this.FH.dismiss();
                        this.Hw.j6(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
