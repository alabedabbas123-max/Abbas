package com.aide.ui.activities;

@abcd.Interfacexu
class B implements android.app.ActionBar.OnNavigationListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.activities.HelpViewActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.B.class, 1721226910917733920L, 2633498567436976501L);
    }

    B(com.aide.ui.activities.HelpViewActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 5524384594919569775L)
    public boolean onNavigationItemSelected(int r8, long r9) {
        com.aide.ui.activities.Enumo r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, -526981627819788264L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-526981627819788264L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r8 == com.aide.ui.activities.HelpViewActivity.j6(this.FH)) { $pc0 = 17; continue $sw0; }
                    try {
                        com.aide.ui.activities.HelpViewActivity.j6(this.FH, r8);
                        r0 = com.aide.ui.activities.Enumo.Mr()[r8];
                        com.aide.ui.activities.HelpViewActivity.DW(this.FH).getSettings().setJavaScriptEnabled(r0.a8());
                        com.aide.ui.activities.HelpViewActivity.DW(this.FH).loadUrl(r0.j3());
                        com.aide.ui.activities.HelpViewActivity.DW(this.FH).clearHistory();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    return true;
                }
                case 17: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
