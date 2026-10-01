package com.aide.ui.views.editor;

@abcd.Interfacexu
class C extends com.aide.ui.views.editor.AbstractRunnablei {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfacevu
    final com.aide.ui.views.editor.OConsole gn;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.C.class, -262237004818676723L, 3467463094141910441L);
    }

    C(com.aide.ui.views.editor.OConsole r1) {
        this.gn = r1;
    }

    @Override
    @abcd.Interfacesu(method = -3562769134176603780L)
    public void FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -5841609702304843251L, this);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-5841609702304843251L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.gn.Zo();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
