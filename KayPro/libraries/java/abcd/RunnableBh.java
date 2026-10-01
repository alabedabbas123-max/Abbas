package abcd;

@abcd.Interfacexu
class RunnableBh implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;
    final java.lang.String Hw;

    @abcd.Interfacevu
    final abcd.Ch VH;
    final abcd.Sk.a Zo;
    final java.lang.String v5;

    static {
        abcd.wu.j6(abcd.RunnableBh.class, -6708075855096698041L, -291095770432338432L);
    }

    RunnableBh(abcd.Ch r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, abcd.Sk.a r5) {
        this.VH = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
        this.Zo = r5;
    }

    @Override
    @abcd.Interfacesu(method = -2494128121454285757L)
    public void run() {
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 6588941484516348711L, this);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(6588941484516348711L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = com.aide.ui.U.gW().j6(this.FH, this.Hw);
                        com.aide.ui.U.j6(new abcd.RunnableAh(this, com.aide.ui.U.gW().j6(this.FH, this.Hw, this.v5, "", this.Zo), r2));
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
