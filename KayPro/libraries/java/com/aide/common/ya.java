package com.aide.common;

@abcd.Interfacexu
class ya implements android.text.TextWatcher {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.SeekBar FH;
    final android.widget.EditText Hw;

    @abcd.Interfacevu
    final com.aide.common.Fa v5;

    static {
        abcd.wu.j6(com.aide.common.ya.class, -6420951009284476296L, 7362391223106751152L);
    }

    ya(com.aide.common.Fa r1, android.widget.SeekBar r2, android.widget.EditText r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = 4568724083502597700L)
    public void afterTextChanged(android.text.Editable r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -4737701181732788500L, this, r5);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 14; continue $sw0; }
                    try {
                        abcd.wu.j6(-4737701181732788500L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 3764571094947455363L)
    public void beforeTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 6: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 10; continue $sw1; }
                    abcd.wu.j6(th, -1233092246697293477L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 13; continue $sw1; }
                    try {
                        abcd.wu.j6(-1233092246697293477L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
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
    @abcd.Interfacesu(method = -1402329216411462903L)
    public void onTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, 107688213966559649L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(107688213966559649L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        com.aide.common.Fa.j6(this.v5, true);
                        com.aide.common.Fa.DW(this.v5, this.FH, this.Hw.getText().toString());
                        com.aide.common.Fa.j6(this.v5, false);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
