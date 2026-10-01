package com.aide.ui.debugger;

@abcd.Interfacexu
class e implements java.util.Comparator<com.aide.ui.debugger.Debugger.a> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.debugger.Debugger FH;

    static {
        abcd.wu.j6(com.aide.ui.debugger.e.class, 1693385072073297168L, -1681562570888520328L);
    }

    e(com.aide.ui.debugger.Debugger r1) {
        this.FH = r1;
    }

    @Override
    public int compare(com.aide.ui.debugger.Debugger.a r1, com.aide.ui.debugger.Debugger.a r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 60290718605040000L)
    public int j6(com.aide.ui.debugger.Debugger.a r8, com.aide.ui.debugger.Debugger.a r9) {
        int r0 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, -911111694508386428L, this, r8, r9);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-911111694508386428L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0 = r8.Hw.compareTo(r9.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    if (r0 == 0) { $pc0 = 8; continue $sw0; }
                    return r0;
                }
                case 8: {
                    return r8.v5 - r9.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
