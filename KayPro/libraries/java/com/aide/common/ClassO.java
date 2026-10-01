package com.aide.common;

@abcd.Interfacexu
class ClassO implements com.aide.common.ColorPickerView.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.EditText FH;

    @abcd.Interfacevu
    final com.aide.common.ClassT Hw;

    static {
        abcd.wu.j6(com.aide.common.ClassO.class, 2649604467815608996L, 3887770723241029891L);
    }

    ClassO(com.aide.common.ClassT r1, android.widget.EditText r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3936204643325502720L)
    public void j6(int r8, java.lang.String r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, -5387899819455754440L, this, new java.lang.Integer(r8), r9);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-5387899819455754440L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (com.aide.common.ClassT.j6(this.Hw) == true) { $pc0 = 8; continue $sw0; }
                    try {
                        com.aide.common.ClassT.DW(this.Hw, true);
                        this.FH.setText(r9);
                        com.aide.common.ClassT.DW(this.Hw, false);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    try {
                        com.aide.common.ClassT.j6(this.Hw, r9);
                        com.aide.common.ClassT.j6(this.Hw, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
