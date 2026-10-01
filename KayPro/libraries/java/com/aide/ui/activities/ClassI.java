package com.aide.ui.activities;

@abcd.Interfacexu
class ClassI implements android.widget.AdapterView.OnItemClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.ListView FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.CommitActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.ClassI.class, -48774866763899575L, -801280346436386600L);
    }

    ClassI(com.aide.ui.activities.CommitActivity r1, android.widget.ListView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -573325990732142529L)
    public void onItemClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 553431604816403000L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(553431604816403000L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.FH.requestFocus();
                        com.aide.ui.activities.CommitActivity.j6(this.Hw, r12);
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
