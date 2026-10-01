package abcd;

@abcd.Interfacexu
class ak implements java.util.Comparator<com.aide.engine.SyntaxError> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.ck FH;

    static {
        abcd.wu.j6(abcd.ak.class, 7280145652699390275L, 4898602193230268331L);
    }

    ak(abcd.ck r1) {
        this.FH = r1;
    }

    @Override
    public int compare(com.aide.engine.SyntaxError r1, com.aide.engine.SyntaxError r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = -1019004872127376969L)
    public int j6(com.aide.engine.SyntaxError r8, com.aide.engine.SyntaxError r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 2182834501697785472L, this, r8, r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(2182834501697785472L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    return abcd.ck.j6(this.FH, r8.v5, r8.Zo, r9.v5, r9.Zo);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
