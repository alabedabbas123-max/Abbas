package com.aide.uidesigner;

@abcd.Interfacexu
class Runnableq implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;

    @abcd.Interfacevu
    final com.aide.uidesigner.XmlLayoutDesignActivity Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.Runnableq.class, -2761603648942096159L, 1467973990371648240L);
    }

    Runnableq(com.aide.uidesigner.XmlLayoutDesignActivity r1, java.lang.String r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 2559221432572693504L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 14: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 18; continue $sw0; }
                    abcd.wu.j6(th, 429421949172340871L, this);
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(429421949172340871L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        new java.io.File(this.FH).delete();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    if (com.aide.uidesigner.XmlLayoutDesignActivity.tp(this.Hw).equals(this.FH) == false) { $pc0 = 12; continue $sw0; }
                    try {
                        com.aide.uidesigner.XmlLayoutDesignActivity.FH(this.Hw, com.aide.uidesigner.ClassE.j6(com.aide.uidesigner.XmlLayoutDesignActivity.FH(this.Hw)));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    if (com.aide.uidesigner.XmlLayoutDesignActivity.Hw(this.Hw) == false) { $pc0 = 11; continue $sw0; }
                    try {
                        com.aide.uidesigner.XmlLayoutDesignActivity.j6(this.Hw, com.aide.uidesigner.XmlLayoutDesignActivity.tp(this.Hw));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    try {
                        com.aide.uidesigner.XmlLayoutDesignActivity.v5(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return;
                }
                case 12: {
                    try {
                        com.aide.uidesigner.XmlLayoutDesignActivity.we(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 14; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
