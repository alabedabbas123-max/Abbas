package abcd;

@abcd.Interfacexu
class ya implements java.util.Comparator<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.za FH;

    static {
        abcd.wu.j6(abcd.ya.class, -138465097617559095L, -6266991932506816560L);
    }

    ya(abcd.za r1) {
        this.FH = r1;
    }

    @Override
    public int compare(java.lang.String r1, java.lang.String r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 949169310741728555L)
    public int j6(java.lang.String r11, java.lang.String r12) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r4 = 0;
        char r7 = 0;
        char r8 = 0;
        int r9 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 38: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 43; continue $sw0; }
                    abcd.wu.j6(th, -233427564669915015L, this, r11, r12);
                    $pc0 = 43; continue $sw0;
                }
                case 43: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-233427564669915015L, this, r11, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 38; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0 = r11.length() - 6;
                        r1 = r12.length() - 6;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 38; continue $sw0;
                    }
                    if (r0 >= r1) { $pc0 = 8; continue $sw0; }
                    r2 = r0;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    r4 = 0;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    if (r4 >= r2) { $pc0 = 33; continue $sw0; }
                    try {
                        r7 = r11.charAt(r4);
                        r8 = r12.charAt(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 38; continue $sw0;
                    }
                    if (r7 != '$') { $pc0 = 17; continue $sw0; }
                    if (r7 == r8) { $pc0 = 17; continue $sw0; }
                    return -1;
                }
                case 17: {
                    if (r8 != '$') { $pc0 = 21; continue $sw0; }
                    if (r7 == r8) { $pc0 = 21; continue $sw0; }
                    return 1;
                }
                case 21: {
                    if (r7 != '+') { $pc0 = 24; continue $sw0; }
                    if (r7 == r8) { $pc0 = 24; continue $sw0; }
                    return -1;
                }
                case 24: {
                    if (r8 != '+') { $pc0 = 27; continue $sw0; }
                    if (r7 == r8) { $pc0 = 27; continue $sw0; }
                    return 1;
                }
                case 27: {
                    r9 = r7 - r8;
                    if (r9 < 0) { $pc0 = 29; continue $sw0; }
                    if (r9 > 0) { $pc0 = 31; continue $sw0; }
                    r4 = r4 + 1;
                    { $pc0 = 11; continue $sw0; }
                }
                case 31: {
                    return 1;
                }
                case 29: {
                    return -1;
                }
                case 33: {
                    if (r0 >= r1) { $pc0 = 35; continue $sw0; }
                    return -1;
                }
                case 35: {
                    if (r0 <= r1) { $pc0 = 37; continue $sw0; }
                    return 1;
                }
                case 37: {
                    return 0;
                }
                case 8: {
                    r2 = r1;
                    { $pc0 = 9; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
