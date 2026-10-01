package com.aide.ui.views;

@abcd.Interfacexu
class m implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.views.n FH;

    static {
        abcd.wu.j6(com.aide.ui.views.m.class, -40137164092015200L, 774387395373054276L);
    }

    m(com.aide.ui.views.n r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 616720526027729960L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -5479020585264629259L, this);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-5479020585264629259L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.ui.views.CodeEditTextScrollView.DragHandle.access$702(this.FH.FH, false);
                        com.aide.ui.views.CodeEditTextScrollView.DragHandle.access$802(this.FH.FH, false);
                        this.FH.FH.this$0.invalidate();
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
