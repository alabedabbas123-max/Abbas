package com.aide.ui.activities;

@abcd.Interfacexu
class ClassT implements android.text.TextWatcher {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.activities.GotoBrowserActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.ClassT.class, -667729815873843261L, 3104849988059666299L);
    }

    ClassT(com.aide.ui.activities.GotoBrowserActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 2263546112082843112L)
    public void afterTextChanged(android.text.Editable r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 938085558238178784L, this, r5);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(938085558238178784L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.ui.activities.GotoBrowserActivity.j6(this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 4671818912845994445L)
    public void beforeTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 6: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 10; continue $sw1; }
                    abcd.wu.j6(th, 597121357674996413L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 13; continue $sw1; }
                    try {
                        abcd.wu.j6(597121357674996413L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 6; continue $sw1;
                    }
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -5884923258679252593L)
    public void onTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 6: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 10; continue $sw2; }
                    abcd.wu.j6(th, 3457549426678799915L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 13; continue $sw2; }
                    try {
                        abcd.wu.j6(3457549426678799915L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 6; continue $sw2;
                    }
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
