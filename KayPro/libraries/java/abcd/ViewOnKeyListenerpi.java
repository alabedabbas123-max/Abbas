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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 13: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 17; continue $sw0; }
                    abcd.wu.j6(th, -1313807391005268768L, this, r9, new java.lang.Integer(r10), r11);
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1313807391005268768L, this, r9, new java.lang.Integer(r10), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r11.getAction() == 1) { $pc0 = 8; continue $sw0; }
                    return false;
                }
                case 8: {
                    if (r10 != 66) { $pc0 = 20; continue $sw0; }
                    try {
                        this.FH.selectAll();
                        this.FH.requestFocus();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    return true;
                }
                case 20: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
