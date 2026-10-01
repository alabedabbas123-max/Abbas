package com.aide.common;

@abcd.Interfacexu
class A extends android.widget.EditText {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;
    final android.app.AlertDialog[] Hw;

    @abcd.Interfacevu
    final com.aide.common.H v5;

    static {
        abcd.wu.j6(com.aide.common.A.class, 5024868934807443193L, -5838321869418469980L);
    }

    A(com.aide.common.H r1, android.content.Context r2, android.app.Activity r3, android.app.AlertDialog[] r4) {
        this.v5 = r1;
        this.FH = r3;
        this.Hw = r4;
        super(r2);
    }

    @Override
    @abcd.Interfacesu(method = 901225170902436924L)
    public boolean onKeyDown(int r8, android.view.KeyEvent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, 980333327092953015L, this, new java.lang.Integer(r8), r9);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(980333327092953015L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r8 != 66) { $pc0 = 9; continue $sw0; }
                    return true;
                }
                case 9: {
                    return super.onKeyDown(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -318824384747203335L)
    public boolean onKeyUp(int r8, android.view.KeyEvent r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 11: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 15; continue $sw1; }
                    abcd.wu.j6(th, -429576779136611040L, this, new java.lang.Integer(r8), r9);
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-429576779136611040L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r8 != 66) { $pc1 = 10; continue $sw1; }
                    try {
                        ((android.view.inputmethod.InputMethodManager) this.FH.getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
                        this.Hw[0].dismiss();
                        this.v5.gn.j6(getText().toString().trim());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    return true;
                }
                case 10: {
                    return super.onKeyUp(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
