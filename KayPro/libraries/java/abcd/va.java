package abcd;

@abcd.Interfacexu
public class va {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.util.Map<java.lang.String, java.util.Set<? extends abcd.Interfaceha>> EQ;
    public java.lang.String FH;
    public boolean Hw;
    public int VH;
    public boolean Zo;
    public boolean gn;
    public java.util.Map<java.lang.String, java.lang.Integer> tp;
    public int u7;
    public boolean v5;

    static {
        abcd.wu.j6(abcd.va.class, 764732373277793165L, 764732373277793165L);
    }

    public va() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1605090818776752120L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1605090818776752120L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.tp = new java.util.HashMap();
                        this.EQ = new java.util.HashMap();
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

    public int DW(abcd.Interfacena r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 12: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 16; continue $sw1; }
                    abcd.wu.j6(th, -6722079086152351488L, this, r5);
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(-6722079086152351488L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 12; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (this.tp.containsKey(r5.j6()) == false) { $pc1 = 10; continue $sw1; }
                    return this.tp.get(r5.j6()).intValue();
                }
                case 10: {
                    return 4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Set<? extends abcd.Interfaceha> j6(abcd.Interfacena r5) {
        java.util.Set<? extends abcd.Interfaceha> r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 13: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 17; continue $sw2; }
                    abcd.wu.j6(th, 414314539544980107L, this, r5);
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(414314539544980107L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (this.EQ.containsKey(r5.j6()) == true) { $pc2 = 19; continue $sw2; }
                    try {
                        r2 = r5.Zo();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    if (r2 == null) { $pc2 = 12; continue $sw2; }
                    return r2;
                }
                case 12: {
                    return java.util.Collections.EMPTY_SET;
                }
                case 19: {
                    return this.EQ.get(r5.j6());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
