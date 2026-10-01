package com.aide.uidesigner;

@abcd.Interfacexu
class Ma extends com.aide.common.ClassN {

    @abcd.Interfacetu
    private static boolean gn;

    @abcd.Interfaceuu
    private static boolean u7;

    @abcd.Interfacevu
    final com.aide.uidesigner.Pa tp;

    static {
        abcd.wu.j6(com.aide.uidesigner.Ma.class, -1505387028266607057L, 1578043037330491600L);
    }

    Ma(com.aide.uidesigner.Pa r1, android.content.Context r2, android.view.View r3) {
        this.tp = r1;
        super(r2, r3);
    }

    @Override
    @abcd.Interfacesu(method = 3403041409525994265L)
    protected void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    th = $ex0;
                    if (u7 == false) { $pc0 = 16; continue $sw0; }
                    abcd.wu.j6(th, 3208516725554976792L, this);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (gn == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(3208516725554976792L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (com.aide.uidesigner.Pa.j6(this.tp) == true) { $pc0 = 9; continue $sw0; }
                    return;
                }
                case 9: {
                    if (this.tp.tp() == true) { $pc0 = 20; continue $sw0; }
                    try {
                        this.tp.we();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
