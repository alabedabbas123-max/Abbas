package abcd;

@abcd.Interfacexu
class BinderLk extends com.aide.engine.service.s.a {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfacevu
    final abcd.Nk v5;

    static {
        abcd.wu.j6(abcd.BinderLk.class, -87904726456966265L, 554937690635364480L);
    }

    BinderLk(abcd.Nk r1) {
        this.v5 = r1;
    }

    @Override
    @abcd.Interfacesu(method = 792450795134967057L)
    public void DW(com.aide.engine.FileHighlightings r5) {
        abcd.Nk.a r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 10: {
                    th = $ex0;
                    if (Hw == false) { $pc0 = 14; continue $sw0; }
                    abcd.wu.j6(th, 5853831219500207107L, this, r5);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(5853831219500207107L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = this.v5.DW(r5.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    if (r2 == null) { $pc0 = 17; continue $sw0; }
                    try {
                        r2.DW(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 2297041829484256296L)
    public void j6(com.aide.engine.FileHighlightings r5) {
        java.util.Iterator r2 = null;
        abcd.Nk.a r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 16: {
                    th = $ex1;
                    if (Hw == false) { $pc1 = 21; continue $sw1; }
                    abcd.wu.j6(th, -1837750657338508176L, this, r5);
                    $pc1 = 21; continue $sw1;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(-1837750657338508176L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 16; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r5.tp <= 0) { $pc1 = 12; continue $sw1; }
                    try {
                        r2 = abcd.Nk.j6(this.v5).iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 16; continue $sw1;
                    }
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (r2.hasNext() == false) { $pc1 = 26; continue $sw1; }
                    try {
                        ((abcd.Nk.c) r2.next()).j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 16; continue $sw1;
                    }
                    { $pc1 = 10; continue $sw1; }
                }
                case 26: {
                    return;
                }
                case 12: {
                    try {
                        r3 = this.v5.DW(r5.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 16; continue $sw1;
                    }
                    if (r3 == null) { $pc1 = 25; continue $sw1; }
                    try {
                        r3.j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 16; continue $sw1;
                    }
                    return;
                }
                case 25: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
