package com.aide.ui.views.editor;

@abcd.Interfacexu
class B extends com.aide.ui.views.editor.AbstractRunnablei {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfacevu
    final com.aide.ui.views.editor.OConsole gn;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.B.class, -262237004818676723L, 3467408212391585120L);
    }

    B(com.aide.ui.views.editor.OConsole r1) {
        this.gn = r1;
    }

    @Override
    @abcd.Interfacesu(method = -3331402596227700672L)
    public void FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, -5843900254386291200L, this);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(-5843900254386291200L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (this.gn.isShown() == false) { $pc0 = 17; continue $sw0; }
                    try {
                        this.gn.requestLayout();
                        com.aide.ui.views.editor.OConsole.j6(this.gn);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
