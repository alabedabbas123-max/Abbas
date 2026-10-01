package com.aide.uidesigner;

@abcd.Interfacexu
class M implements java.util.Comparator<com.aide.uidesigner.N.a> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.M.class, -175704537702267603L, 2361452621816598336L);
    }

    M() {
    }

    @Override
    public int compare(com.aide.uidesigner.N.a r1, com.aide.uidesigner.N.a r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 3490068158378061936L)
    public int j6(com.aide.uidesigner.N.a r8, com.aide.uidesigner.N.a r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -5995427104692423916L, this, r8, r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-5995427104692423916L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    return r8.j6().compareTo(r9.j6());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
