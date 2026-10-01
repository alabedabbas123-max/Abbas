package abcd;

@abcd.Interfacexu
public class Rl {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.Rl.class, -308329056398801275L, -308329056398801275L);
    }

    public Rl() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 4489823954854448053L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(4489823954854448053L, null);
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

    public static abcd.InterfacePl j6(java.util.List<java.lang.String> r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, boolean r9, java.io.OutputStream r10, byte[] r11) {
        java.lang.String[] r0 = null;
        abcd.Ol r12 = null;
        java.io.ByteArrayOutputStream r13 = null;
        java.io.ByteArrayOutputStream r14 = null;
        java.io.OutputStream r15 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    abcd.wu.j6(4958579833176135095L, null, new java.lang.Object[]{r6, r7, r8, new java.lang.Boolean(r9), r10, r11});
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r0 = new java.lang.String[r6.size()];
                    r6.toArray(r0);
                    r12 = new abcd.Ol(r0, r8, r7, r9);
                    r13 = new java.io.ByteArrayOutputStream();
                    r14 = new java.io.ByteArrayOutputStream();
                    r12.DW(new abcd.Kl(r13, r10));
                    r12.j6(new abcd.Kl(r14, r10));
                    r15 = r12.FH();
                    if (r15 == null) { $pc1 = 22; continue $sw1; }
                    if (r11 != null) { $pc1 = 9; continue $sw1; }
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    r15.close();
                    { $pc1 = 22; continue $sw1; }
                }
                case 9: {
                    if (r11.length == 0) { $pc1 = 12; continue $sw1; }
                    try {
                        r15.write(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.InterruptedIOException) { $pc1 = 19; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    r15.flush();
                    $pc1 = 22; continue $sw1;
                }
                case 22: {
                    try {
                        r12.Hw();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc1 = 16; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return new abcd.Ql(r12, r13, r14);
                }
                case 16: {
                    e = $ex1;
                    r12.DW();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 19: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
