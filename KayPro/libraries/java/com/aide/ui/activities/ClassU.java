package com.aide.ui.activities;

@abcd.Interfacexu
class ClassU implements android.widget.CompoundButton.OnCheckedChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.activities.GotoBrowserActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.ClassU.class, -667729815873843261L, 3104938722259391412L);
    }

    ClassU(com.aide.ui.activities.GotoBrowserActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 393531572825580672L)
    public void onCheckedChanged(android.widget.CompoundButton r8, boolean r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 3468038664918372864L, this, r8, new java.lang.Boolean(r9));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(3468038664918372864L, this, r8, new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        com.aide.ui.activities.GotoBrowserActivity.DW(this.FH);
                        com.aide.ui.activities.GotoBrowserActivity.j6(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
