package com.aide.uidesigner;

@abcd.Interfacexu
class ClassG implements com.aide.common.ab<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.uidesigner.XmlLayoutDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassG.class, -2761603648942096159L, -257359381788677516L);
    }

    ClassG(com.aide.uidesigner.XmlLayoutDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    public void j6(java.lang.String r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = -6137843004889815037L)
    public void j62(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, 437882248377325944L, this, r5);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(437882248377325944L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.uidesigner.XmlLayoutDesignActivity.j6(this.FH, true);
                        com.aide.uidesigner.XmlLayoutDesignActivity.FH(this.FH, com.aide.uidesigner.ClassE.j6(com.aide.uidesigner.XmlLayoutDesignActivity.FH(this.FH), r5));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    if (com.aide.uidesigner.XmlLayoutDesignActivity.Hw(this.FH) == false) { $pc0 = 9; continue $sw0; }
                    try {
                        com.aide.uidesigner.XmlLayoutDesignActivity.j6(this.FH, com.aide.uidesigner.XmlLayoutDesignActivity.tp(this.FH));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    try {
                        com.aide.uidesigner.XmlLayoutDesignActivity.v5(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
