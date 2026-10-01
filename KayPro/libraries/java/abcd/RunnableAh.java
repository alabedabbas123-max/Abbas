package abcd;

@abcd.Interfacexu
class RunnableAh implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.List FH;
    final java.lang.String Hw;
    final abcd.RunnableBh v5;

    static {
        abcd.wu.j6(abcd.RunnableAh.class, -6708075855096698041L, 361117421082573375L);
    }

    RunnableAh(abcd.RunnableBh r1, java.util.List r2, java.lang.String r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 2020553949778599060L)
    public void run() {
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 29: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 33; continue $sw0; }
                    abcd.wu.j6(th, 6593264978836293168L, this);
                    $pc0 = 33; continue $sw0;
                }
                case 33: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(6593264978836293168L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (this.v5.Zo.VH.gn == false) { $pc0 = 15; continue $sw0; }
                    try {
                        com.aide.ui.U.er().j6(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    if (this.Hw == null) { $pc0 = 12; continue $sw0; }
                    try {
                        com.aide.ui.U.J8().j6(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (abcd.Ch.DW(this.v5.VH) == null) { $pc0 = 35; continue $sw0; }
                    try {
                        abcd.Ch.DW(this.v5.VH).j6(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    return;
                }
                case 35: {
                    return;
                }
                case 15: {
                    if (this.v5.Zo.v5 != null) { $pc0 = 17; continue $sw0; }
                    try {
                        r2 = this.Hw;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    if (r2 == null) { $pc0 = 20; continue $sw0; }
                    try {
                        com.aide.ui.U.J8().j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    try {
                        com.aide.ui.U.lg().FH(false);
                        com.aide.ui.U.vy().rN(r2);
                        com.aide.ui.U.vy().U2("created");
                        com.aide.ui.U.er().j6(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    if (com.aide.ui.U.Ws().Hw(this.Hw) == true) { $pc0 = 26; continue $sw0; }
                    if (com.aide.ui.aa.gn() == false) { $pc0 = 26; continue $sw0; }
                    try {
                        com.aide.ui.U.Ws().j6(this.Hw, "Initial commit", java.util.Arrays.asList(new java.lang.String[]{"bin/", "gen/", "obj/", "libs/*/*.so", ""}), new abcd.Runnablezh(this));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    return;
                }
                case 26: {
                    if (abcd.Ch.DW(this.v5.VH) == null) { $pc0 = 38; continue $sw0; }
                    try {
                        abcd.Ch.DW(this.v5.VH).j6(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    return;
                }
                case 38: {
                    return;
                }
                case 17: {
                    try {
                        r2 = this.Hw + "/" + this.v5.Zo.v5;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 29; continue $sw0;
                    }
                    { $pc0 = 18; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
