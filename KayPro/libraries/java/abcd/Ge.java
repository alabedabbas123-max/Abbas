package abcd;

@abcd.Interfacexu
class Ge implements java.util.Comparator<java.lang.String> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.Ge.class, 489031357727148317L, 101096709074197056L);
    }

    Ge() {
    }

    @Override
    public int compare(java.lang.String r1, java.lang.String r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 41629455449787292L)
    public int j6(java.lang.String r8, java.lang.String r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -2373862820587215395L, this, r8, r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-2373862820587215395L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    return abcd.Fe.j6(r8, r9);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
