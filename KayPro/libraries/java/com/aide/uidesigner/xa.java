package com.aide.uidesigner;

@abcd.Interfacexu
class xa implements com.aide.uidesigner.Ka.c {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.xa.class, -6184905212679667120L, 70738947407540920L);
    }

    xa() {
    }

    @Override
    @abcd.Interfacesu(method = 341551857100036317L)
    public android.view.View j6(android.content.Context r5) {
        android.widget.ImageView r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -777046008166010200L, this, r5);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-777046008166010200L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.widget.ImageView(r5);
                        r2.setImageResource(17301533);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
