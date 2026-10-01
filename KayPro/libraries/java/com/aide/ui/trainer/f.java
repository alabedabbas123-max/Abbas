package com.aide.ui.trainer;

@abcd.Interfacexu
class f implements java.util.Comparator<com.aide.ui.trainer.g.a> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.trainer.g FH;

    static {
        abcd.wu.j6(com.aide.ui.trainer.f.class, -993302590746004176L, -1402165132050376295L);
    }

    f(com.aide.ui.trainer.g r1) {
        this.FH = r1;
    }

    @Override
    public int compare(com.aide.ui.trainer.g.a r1, com.aide.ui.trainer.g.a r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 358588286953115584L)
    public int j6(com.aide.ui.trainer.g.a r8, com.aide.ui.trainer.g.a r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 889594008419192700L, this, r8, r9);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(889594008419192700L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    return r8.u7() - r9.u7();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
