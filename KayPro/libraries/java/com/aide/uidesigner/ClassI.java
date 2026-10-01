package com.aide.uidesigner;

@abcd.Interfacexu
class ClassI implements android.app.ActionBar.OnNavigationListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.uidesigner.XmlLayoutDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassI.class, -2761603648942096159L, 1467720459875724997L);
    }

    ClassI(com.aide.uidesigner.XmlLayoutDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 7734759995625000663L)
    public boolean onNavigationItemSelected(int r8, long r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 16; continue $sw0; }
                    abcd.wu.j6(th, 329726655247481905L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(329726655247481905L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (com.aide.uidesigner.XmlLayoutDesignActivity.j6(this.FH) == true) { $pc0 = 8; continue $sw0; }
                    return true;
                }
                case 8: {
                    if (r8 == com.aide.uidesigner.XmlLayoutDesignActivity.DW(this.FH)) { $pc0 = 20; continue $sw0; }
                    try {
                        com.aide.uidesigner.XmlLayoutDesignActivity.j6(this.FH, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return true;
                }
                case 20: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
