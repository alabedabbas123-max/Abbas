package com.aide.ui.views;

@abcd.Interfacexu
class q implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.views.r FH;

    static {
        abcd.wu.j6(com.aide.ui.views.q.class, 786228931312646151L, -4332419942084826417L);
    }

    q(com.aide.ui.views.r r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 497031124202852932L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, 1575529387595675208L, this);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(1575529387595675208L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (com.aide.ui.views.SplitView.access$100(this.FH.FH) == null) { $pc0 = 17; continue $sw0; }
                    try {
                        com.aide.ui.views.SplitView.access$100(this.FH.FH).j6(com.aide.ui.views.SplitView.access$200(this.FH.FH));
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
