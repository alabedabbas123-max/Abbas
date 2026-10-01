package abcd;

@abcd.Interfacexu
public final class Enumle extends com.almlkaide.kaypro.internal.EnumBase implements abcd.Interfaceha {
    public static final abcd.Enumle DW = null;
    public static final abcd.Enumle FH = null;
    public static final abcd.Enumle Hw = null;

    @abcd.Interfacetu
    private static boolean VH;
    private static final abcd.Enumle[] Zo = null;

    @abcd.Interfaceuu
    private static boolean gn;
    public static final abcd.Enumle j6 = null;
    public static final abcd.Enumle v5 = null;

    @abcd.Interfaceru(field = -3483621873875142167L)
    private final java.lang.String EQ;

    @abcd.Interfaceru(field = -1555401688879314255L)
    private final java.lang.String tp;

    @abcd.Interfaceru(field = -3028758154474971432L)
    private final java.lang.String u7;

    @abcd.Interfaceru(field = -3483755172161955240L)
    private final java.lang.String we;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(abcd.Enumle.class, -952426915378518400L, -952426915378518400L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (VH == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2116191561145592000L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = new abcd.Enumle("ADJUST_NEWLINES", 0, "General", "Adjust lines on autoformat", "", "");
                        DW = new abcd.Enumle("ADJUST_SPACES", 1, "General", "Adjust spaces on autoformat", "", "");
                        FH = new abcd.Enumle("FORMAT_ONPASTE", 2, "General", "Autoformat pasted code", "", "");
                        Hw = new abcd.Enumle("INDENT_ONTYPE", 3, "General", "Adjust indentation while typing", "", "");
                        v5 = new abcd.Enumle("AUTO_INSERT_CLOSING_BRACE_ONTYPE", 4, "General", "Automatically insert closing tag", "", "");
                        Zo = new abcd.Enumle[]{j6, DW, FH, Hw, v5};
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (gn == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 2116191561145592000L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 164077573377214160L)
    private Enumle(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (VH == false) { $pc1 = 5; continue $sw1; }
                    abcd.wu.j6(51127235224603272L, null, new java.lang.Object[]{r7, new java.lang.Integer(r8), r9, r10, r11, r12});
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    super(r7, r8);
                    this.u7 = r9;
                    this.tp = r10;
                    this.EQ = r11;
                    this.we = r12;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.util.Set<abcd.Enumle> j6(boolean r5) {
        java.util.HashSet r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (gn == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 5759115931838832364L, null, new java.lang.Boolean(r5));
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (VH == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(5759115931838832364L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r3 = new java.util.HashSet();
                        r3.add(DW);
                        r3.add(FH);
                        r3.add(Hw);
                        r3.add(v5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Enumle valueOf(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (gn == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 474250725726121968L, null, r5);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (VH == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(474250725726121968L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return (abcd.Enumle) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Enumle.values(), r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Enumle[] values() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (gn == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -2275621586940712980L, null);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (VH == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-2275621586940712980L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return (abcd.Enumle[]) Zo.clone();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String getName() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (gn == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -1039440780138745413L, this);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (VH == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-1039440780138745413L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return this.tp;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
