package com.aide.uidesigner;

@abcd.Interfacexu
class fa implements com.aide.common.ab<java.lang.Integer> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.util.ArrayList FH;
    final com.aide.uidesigner.ClassS Hw;
    final java.lang.String[] Zo;
    final com.aide.uidesigner.ClassA v5;

    static {
        abcd.wu.j6(com.aide.uidesigner.fa.class, 2051778340695604592L, 2148774359431502901L);
    }

    fa(java.util.ArrayList r1, com.aide.uidesigner.ClassS r2, com.aide.uidesigner.ClassA r3, java.lang.String[] r4) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
        this.Zo = r4;
    }

    @abcd.Interfacesu(method = 863213966894867924L)
    public void j62(java.lang.Integer r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, -2933095158329763920L, this, r7);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(-2933095158329763920L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (((java.lang.String) this.FH.get(r7.intValue())).equals("none") == false) { $pc0 = 9; continue $sw0; }
                    try {
                        this.Hw.j6(this.v5, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    return;
                }
                case 9: {
                    try {
                        this.Hw.j6(this.v5, this.Zo[r7.intValue()]);
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

    @Override
    public void j6(java.lang.Integer r1) {
        j62(r1);
    }
}
