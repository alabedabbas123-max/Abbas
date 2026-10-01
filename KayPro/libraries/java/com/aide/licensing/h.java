package com.aide.licensing;

@abcd.Interfacexu
class h implements java.util.Comparator<android.accounts.Account> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.licensing.h.class, 5040490317030669360L, 3745435933143277831L);
    }

    h() {
    }

    @Override
    public int compare(android.accounts.Account r1, android.accounts.Account r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 1219894917722413947L)
    public int j6(android.accounts.Account r8, android.accounts.Account r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 7010002508793731072L, this, r8, r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(7010002508793731072L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    return com.aide.licensing.i.j6(r8.name).compareTo(com.aide.licensing.i.j6(r9.name));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
