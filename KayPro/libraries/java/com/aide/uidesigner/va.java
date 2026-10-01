package com.aide.uidesigner;

@abcd.Interfacexu
class va extends android.view.View {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.content.Context FH;

    @abcd.Interfacevu
    final com.aide.uidesigner.wa Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.va.class, -6184905212679667120L, 9248857349345616L);
    }

    va(com.aide.uidesigner.wa r1, android.content.Context r2, android.content.Context r3) {
        this.Hw = r1;
        this.FH = r3;
        super(r2);
    }

    @Override
    @abcd.Interfacesu(method = -615240280409297928L)
    protected void onMeasure(int r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -161412211736949840L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-161412211736949840L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        setMeasuredDimension((int) (this.FH.getResources().getDisplayMetrics().density * 1.0f), (int) (this.FH.getResources().getDisplayMetrics().density * 30.0f));
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
