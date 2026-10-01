package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class i extends android.webkit.WebView {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.htmluidesigner.WebDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.i.class, -3499094272017024501L, -3746765292644294208L);
    }

    i(com.aide.ui.htmluidesigner.WebDesignActivity r1, android.content.Context r2) {
        this.FH = r1;
        super(r2);
    }

    @Override
    @abcd.Interfacesu(method = -657611775461375628L)
    protected void onScrollChanged(int r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 16; continue $sw0; }
                    abcd.wu.j6(th, 4155292460117247545L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(4155292460117247545L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        super.onScrollChanged(r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    if (r11 != 0) { $pc0 = 9; continue $sw0; }
                    if (r13 <= 0) { $pc0 = 9; continue $sw0; }
                    try {
                        com.aide.ui.htmluidesigner.WebDesignActivity.DW(this.FH).j6(true);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                case 9: {
                    if (r11 <= 0) { $pc0 = 19; continue $sw0; }
                    try {
                        com.aide.ui.htmluidesigner.WebDesignActivity.DW(this.FH).j6(false);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
