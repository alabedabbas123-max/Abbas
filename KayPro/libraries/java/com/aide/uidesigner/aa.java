package com.aide.uidesigner;

@abcd.Interfacexu
class aa implements com.aide.common.ab<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.content.Intent FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.aa.class, 2051778340695604592L, 2148565882117044501L);
    }

    aa(android.content.Intent r1) {
        this.FH = r1;
    }

    @Override
    public void j6(java.lang.String r1) {
        j62(r1);
    }

    @abcd.Interfacesu(method = 460387904875949040L)
    public void j62(java.lang.String r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 306635115026556288L, this, r7);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(306635115026556288L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.uidesigner.ka.j6().j6(r7, this.FH);
                        com.aide.uidesigner.ka.j6().j6(com.aide.uidesigner.ka.DW(), "@drawable/" + r7);
                        com.aide.uidesigner.ka.j6(null);
                        com.aide.uidesigner.ka.j6(null);
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
}
