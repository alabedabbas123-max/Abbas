package abcd;

@abcd.Interfacexu
class Rk implements java.util.Comparator<abcd.Sk.a> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Sk FH;

    static {
        abcd.wu.j6(abcd.Rk.class, -510280536001576560L, -4040728634786110904L);
    }

    Rk(abcd.Sk r1) {
        this.FH = r1;
    }

    @Override
    public int compare(abcd.Sk.a r1, abcd.Sk.a r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 778114950652043056L)
    public int j6(abcd.Sk.a r8, abcd.Sk.a r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 5108201626007046819L, this, r8, r9);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(5108201626007046819L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    return r8.VH.EQ - r9.VH.EQ;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
