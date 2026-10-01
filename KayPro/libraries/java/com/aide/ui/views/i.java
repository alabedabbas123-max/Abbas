package com.aide.ui.views;

@abcd.Interfacexu
class i implements com.aide.ui.views.editor.Interfacen {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.views.CodeEditTextScrollView FH;

    static {
        abcd.wu.j6(com.aide.ui.views.i.class, 1527178060401062972L, -2222785813308002900L);
    }

    i(com.aide.ui.views.CodeEditTextScrollView r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 356928418884268880L)
    public void j6(com.aide.ui.views.editor.OConsole r10, int r11, int r12, boolean r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 4979609908945788631L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Boolean(r13));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(4979609908945788631L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Boolean(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.FH.j6();
                        this.FH.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
