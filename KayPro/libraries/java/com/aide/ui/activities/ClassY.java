package com.aide.ui.activities;

@abcd.Interfacexu
class ClassY implements java.util.Comparator<com.aide.engine.SourceEntity> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.GotoBrowserActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.ClassY.class, -667729815873843261L, 3105293659098924804L);
    }

    ClassY(com.aide.ui.activities.GotoBrowserActivity r1, java.lang.String r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    public int compare(com.aide.engine.SourceEntity r1, com.aide.engine.SourceEntity r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = -660443805243094013L)
    public int j6(com.aide.engine.SourceEntity r8, com.aide.engine.SourceEntity r9) {
        boolean r0 = false;
        boolean r1 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 16: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 20; continue $sw0; }
                    abcd.wu.j6(th, 4531280680893049975L, this, r8, r9);
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(4531280680893049975L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0 = r8.we().toLowerCase().startsWith(this.FH.toLowerCase());
                        r1 = r9.we().toLowerCase().startsWith(this.FH.toLowerCase());
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    if (r0 == false) { $pc0 = 10; continue $sw0; }
                    if (r1 == true) { $pc0 = 10; continue $sw0; }
                    return -1;
                }
                case 10: {
                    if (r0 == true) { $pc0 = 14; continue $sw0; }
                    if (r1 == false) { $pc0 = 14; continue $sw0; }
                    return 1;
                }
                case 14: {
                    return r8.we().compareTo(r9.we());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
