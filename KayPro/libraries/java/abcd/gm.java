package abcd;

@abcd.Interfacexu
public class gm {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.gm.class, 1673775455607343752L, 1673775455607343752L);
    }

    public gm() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -8857958098107869195L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-8857958098107869195L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(int r9, int r10, int r11, int r12) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 10: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 14; continue $sw1; }
                    abcd.wu.j6(th, 7067605637110948352L, null, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12));
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(7067605637110948352L, null, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    if (r10 != r12) { $pc1 = 9; continue $sw1; }
                    return r9 - r11;
                }
                case 9: {
                    return r10 - r12;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
