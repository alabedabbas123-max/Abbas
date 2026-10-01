package abcd;

@abcd.Interfacexu
public class ve {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.ve.class, -928767759730210080L, -928767759730210080L);
    }

    public ve() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 2143294532172941568L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2143294532172941568L, null);
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

    public static void j6(java.io.Reader r7, java.io.Writer r8) {
        char[] r0 = null;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 19: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 24; continue $sw1; }
                    abcd.wu.j6(th, -7490126094935077683L, null, r7, r8);
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-7490126094935077683L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        r0 = new char[4096];
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    try {
                        r1 = r7.read(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 13; continue $sw1;
                    }
                    if (r1 == (-1)) { $pc1 = 10; continue $sw1; }
                    try {
                        r8.write(r0, 0, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 13; continue $sw1;
                    }
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    try {
                        r7.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 16; continue $sw1;
                    }
                    try {
                        r8.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                    return;
                }
                case 13: {
                    th = $ex1;
                    try {
                        r7.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 16; continue $sw1;
                    }
                }
                case 16: {
                    th = $ex1;
                    try {
                        r8.close();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 19; continue $sw1;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
