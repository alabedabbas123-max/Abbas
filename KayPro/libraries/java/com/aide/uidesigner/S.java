package com.aide.uidesigner;

@abcd.Interfacexu
class S implements com.aide.common.ab<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final com.aide.uidesigner.ClassA Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.S.class, 2051778340695604592L, -3476984894654757304L);
    }

    S(com.aide.uidesigner.ClassS r1, com.aide.uidesigner.ClassA r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    public void j6(java.lang.String r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = -7767341536031030973L)
    public void j62(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, 3654192249247646700L, this, r5);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(3654192249247646700L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r5.length() != 0) { $pc0 = 9; continue $sw0; }
                    r5 = null;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    try {
                        this.FH.j6(this.Hw, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
