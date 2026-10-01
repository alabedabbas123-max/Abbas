package com.aide.common;

@abcd.Interfacexu
class ClassP implements android.text.TextWatcher {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.common.ColorPickerView FH;

    @abcd.Interfacevu
    final com.aide.common.ClassT Hw;

    static {
        abcd.wu.j6(com.aide.common.ClassP.class, 2649604467815608996L, 3887831664087072096L);
    }

    ClassP(com.aide.common.ClassT r1, com.aide.common.ColorPickerView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 4810235020329635935L)
    public void afterTextChanged(android.text.Editable r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 3638906623784591393L, this, r5);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 14; continue $sw0; }
                    try {
                        abcd.wu.j6(3638906623784591393L, this, r5);
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
    @abcd.Interfacesu(method = 1187401018499193468L)
    public void beforeTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 6: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 10; continue $sw1; }
                    abcd.wu.j6(th, 1830596934681658528L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 13; continue $sw1; }
                    try {
                        abcd.wu.j6(1830596934681658528L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
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
    @abcd.Interfacesu(method = -4595652138330262112L)
    public void onTextChanged(java.lang.CharSequence r10, int r11, int r12, int r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 9: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 13; continue $sw2; }
                    abcd.wu.j6(th, -2729822879843132820L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-2729822879843132820L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (com.aide.common.ClassT.DW(this.Hw) == true) { $pc2 = 16; continue $sw2; }
                    try {
                        com.aide.common.ClassT.j6(this.Hw, true);
                        this.FH.setCurrentColor(r10.toString());
                        com.aide.common.ClassT.j6(this.Hw, false);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
