package com.aide.common;

@abcd.Interfacexu
class Ea implements android.widget.TextView.OnEditorActionListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final android.widget.EditText Hw;

    @abcd.Interfacevu
    final com.aide.common.Fa v5;

    static {
        abcd.wu.j6(com.aide.common.Ea.class, -6420951009284476296L, 7363122391034149488L);
    }

    Ea(com.aide.common.Fa r1, android.app.Activity r2, android.widget.EditText r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 570657690056460832L)
    public boolean onEditorAction(android.widget.TextView r9, int r10, android.view.KeyEvent r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 9: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 13; continue $sw0; }
                    abcd.wu.j6(th, -6959638322589074139L, this, r9, new java.lang.Integer(r10), r11);
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-6959638322589074139L, this, r9, new java.lang.Integer(r10), r11);
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
                        com.aide.common.Fa.Hw(this.v5).dismiss();
                        com.aide.common.Fa.FH(this.v5).j6(this.Hw.getText().toString().trim());
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
