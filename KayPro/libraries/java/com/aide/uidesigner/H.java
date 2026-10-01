package com.aide.uidesigner;

@abcd.Interfacexu
class H implements com.aide.common.ab<com.aide.uidesigner.ClassB> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.uidesigner.I FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.H.class, -2150908242116545680L, -111643805163778665L);
    }

    H(com.aide.uidesigner.I r1) {
        this.FH = r1;
    }

    @abcd.Interfacesu(method = -4502235806499031920L)
    public void j62(com.aide.uidesigner.ClassB r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 32588905129121223L, this, r5);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(32588905129121223L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH.FH.FH(r5);
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
    public void j6(com.aide.uidesigner.ClassB r1) {
        j62(r1);
    }
}
