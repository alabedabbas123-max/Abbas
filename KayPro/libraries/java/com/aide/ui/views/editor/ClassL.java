package com.aide.ui.views.editor;

@abcd.Interfacexu
class ClassL extends java.util.TimerTask {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.views.editor.ClassM FH;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ClassL.class, 108167760189617513L, 1091102422121593416L);
    }

    ClassL(com.aide.ui.views.editor.ClassM r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 2355089538838750640L)
    public void run() {
        com.aide.ui.views.editor.ClassM r2 = null;
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 14: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 18; continue $sw0; }
                    abcd.wu.j6(th, -934748103707175580L, this);
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(-934748103707175580L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (com.aide.ui.views.editor.ClassM.j6(this.FH) == false) { $pc0 = 21; continue $sw0; }
                    try {
                        r2 = this.FH;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    if (com.aide.ui.views.editor.ClassM.DW(this.FH) == true) { $pc0 = 11; continue $sw0; }
                    r3 = true;
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    try {
                        com.aide.ui.views.editor.ClassM.j6(r2, r3);
                        com.aide.ui.views.editor.ClassM.FH(this.FH).post(new com.aide.ui.views.editor.Runnablek(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return;
                }
                case 11: {
                    r3 = false;
                    { $pc0 = 12; continue $sw0; }
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
