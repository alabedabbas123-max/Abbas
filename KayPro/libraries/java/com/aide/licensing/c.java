package com.aide.licensing;

@abcd.Interfacexu
class c implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final int FH;
    final java.lang.String Hw;
    final com.aide.licensing.d.a Zo;
    final java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.licensing.c.class, -90332927685326755L, 684254400747100216L);
    }

    c(com.aide.licensing.d.a r1, int r2, java.lang.String r3, java.lang.String r4) {
        this.Zo = r1;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = r4;
    }

    @Override
    @abcd.Interfacesu(method = -944092842990203347L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 4328069808734210520L, this);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(4328069808734210520L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.licensing.d.j6(this.Zo.Zo, 0);
                        com.aide.licensing.d.j6(this.Zo.Zo, com.aide.licensing.d.a.j6(this.Zo), this.FH, this.Hw, this.v5);
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
