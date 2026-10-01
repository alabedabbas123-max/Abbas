package com.aide.ui.trainer;

@abcd.Interfacexu
class c extends android.os.CountDownTimer {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.trainer.e FH;

    static {
        abcd.wu.j6(com.aide.ui.trainer.c.class, 221157201561947787L, -394521467029321005L);
    }

    c(com.aide.ui.trainer.e r1, long r2, long r4) {
        this.FH = r1;
        super(r2, r4);
    }

    @Override
    @abcd.Interfacesu(method = 1577978769006587560L)
    public void onFinish() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 775587791141888543L, this);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 14; continue $sw0; }
                    try {
                        abcd.wu.j6(775587791141888543L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 37205383691188471L)
    public void onTick(long r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 11: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 15; continue $sw1; }
                    abcd.wu.j6(th, 6665312108696838696L, this, new java.lang.Long(r5));
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(6665312108696838696L, this, new java.lang.Long(r5));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (com.aide.ui.trainer.e.j6(this.FH) != null) { $pc1 = 9; continue $sw1; }
                    try {
                        cancel();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    return;
                }
                case 9: {
                    try {
                        com.aide.ui.trainer.e.j6(this.FH).show();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 11; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
