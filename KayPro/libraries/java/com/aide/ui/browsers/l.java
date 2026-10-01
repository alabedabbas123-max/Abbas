package com.aide.ui.browsers;

@abcd.Interfacexu
class l implements java.util.Comparator<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.browsers.FileBrowser FH;

    static {
        abcd.wu.j6(com.aide.ui.browsers.l.class, 5630979006676181253L, 974208454526411937L);
    }

    l(com.aide.ui.browsers.FileBrowser r1) {
        this.FH = r1;
    }

    @Override
    public int compare(java.lang.String r1, java.lang.String r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = -174904292936851685L)
    public int j6(java.lang.String r8, java.lang.String r9) {
        boolean r1 = false;
        boolean r2 = false;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        boolean r0 = false;
        boolean r5 = false;
        int r6 = 0;
        java.lang.String r7 = null;
        java.lang.String r10 = null;
        int r11 = 0;
        int r12 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 38: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 42; continue $sw0; }
                    abcd.wu.j6(th, -1793199605573821267L, this, r8, r9);
                    $pc0 = 42; continue $sw0;
                }
                case 42: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1793199605573821267L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 38; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r1 = abcd.Vl.J0(r8);
                        r2 = abcd.Vl.J0(r9);
                        r3 = abcd.Vl.tp(r8).toLowerCase();
                        r4 = abcd.Vl.tp(r9).toLowerCase();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 38; continue $sw0;
                    }
                    if (r1 == false) { $pc0 = 11; continue $sw0; }
                    if (r2 == true) { $pc0 = 11; continue $sw0; }
                    return -1;
                }
                case 11: {
                    if (r1 == true) { $pc0 = 14; continue $sw0; }
                    if (r2 == false) { $pc0 = 14; continue $sw0; }
                    return 1;
                }
                case 14: {
                    if (r1 == false) { $pc0 = 25; continue $sw0; }
                    if (r2 == false) { $pc0 = 25; continue $sw0; }
                    try {
                        r0 = com.aide.ui.browsers.FileBrowser.j6(r3);
                        r5 = com.aide.ui.browsers.FileBrowser.j6(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 38; continue $sw0;
                    }
                    if (r0 == false) { $pc0 = 20; continue $sw0; }
                    if (r5 == true) { $pc0 = 20; continue $sw0; }
                    return 1;
                }
                case 20: {
                    if (r0 == true) { $pc0 = 24; continue $sw0; }
                    if (r5 == false) { $pc0 = 24; continue $sw0; }
                    return -1;
                }
                case 24: {
                    return r3.compareTo(r4);
                }
                case 25: {
                    try {
                        r6 = r3.lastIndexOf(".");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 38; continue $sw0;
                    }
                    r7 = "";
                    if (r6 <= 0) { $pc0 = 29; continue $sw0; }
                    try {
                        r10 = r3.substring(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 38; continue $sw0;
                    }
                    $pc0 = 30; continue $sw0;
                }
                case 30: {
                    try {
                        r11 = r4.lastIndexOf(".");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 38; continue $sw0;
                    }
                    if (r11 <= 0) { $pc0 = 33; continue $sw0; }
                    try {
                        r7 = r4.substring(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 38; continue $sw0;
                    }
                    $pc0 = 33; continue $sw0;
                }
                case 33: {
                    try {
                        r12 = r10.compareTo(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 38; continue $sw0;
                    }
                    if (r12 == 0) { $pc0 = 37; continue $sw0; }
                    return r12;
                }
                case 37: {
                    return r3.compareTo(r4);
                }
                case 29: {
                    r10 = "";
                    { $pc0 = 30; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
