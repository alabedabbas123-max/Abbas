package com.aide.ui.activities;

@abcd.Interfacexu
class ClassN implements android.widget.CompoundButton.OnCheckedChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final int FH;
    final com.aide.ui.activities.CommitActivity.b Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.ClassN.class, -101481753451122000L, -2184792901713797283L);
    }

    ClassN(com.aide.ui.activities.CommitActivity.b r1, int r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -3259309804493606425L)
    public void onCheckedChanged(android.widget.CompoundButton r8, boolean r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 1811205192841172300L, this, r8, new java.lang.Boolean(r9));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(1811205192841172300L, this, r8, new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        com.aide.ui.activities.CommitActivity.v5(this.Hw.FH).set(this.FH, r9);
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
