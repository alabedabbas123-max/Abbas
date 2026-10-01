package com.aide.ui.htmluidesigner;

@abcd.Interfacexu
class a implements abcd.G {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.htmluidesigner.PhonegapDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.htmluidesigner.a.class, -3819489023773623435L, 435155823991944384L);
    }

    a(com.aide.ui.htmluidesigner.PhonegapDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -461269356162505048L)
    public boolean j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1844470723134245824L, this);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1844470723134245824L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return com.aide.ui.aa.DW(this.FH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
