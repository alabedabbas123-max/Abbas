package com.aide.common;

@abcd.Interfacexu
class G implements android.widget.TextView.OnEditorActionListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final android.widget.EditText Hw;

    @abcd.Interfacevu
    final com.aide.common.H Zo;
    final android.app.AlertDialog[] v5;

    static {
        abcd.wu.j6(com.aide.common.G.class, 5024868934807443193L, -5839023809280946272L);
    }

    G(com.aide.common.H r1, android.app.Activity r2, android.widget.EditText r3, android.app.AlertDialog[] r4) {
        this.Zo = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
    }

    @Override
    @abcd.Interfacesu(method = 424286445554509608L)
    public boolean onEditorAction(android.widget.TextView r9, int r10, android.view.KeyEvent r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 9: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 13; continue $sw0; }
                    abcd.wu.j6(th, -3840513526520815705L, this, r9, new java.lang.Integer(r10), r11);
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-3840513526520815705L, this, r9, new java.lang.Integer(r10), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r10 != 6) { $pc0 = 8; continue $sw0; }
                    try {
                        ((android.view.inputmethod.InputMethodManager) this.FH.getSystemService("input_method")).hideSoftInputFromWindow(this.Hw.getWindowToken(), 0);
                        this.v5[0].dismiss();
                        this.Zo.gn.j6(this.Hw.getText().toString().trim());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
