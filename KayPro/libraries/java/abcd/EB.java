package abcd;

public class EB extends dB<java.util.Map<java.lang.String, abcd.WH>> {
    private final java.util.Collection<java.lang.String> FH;

    public EB(abcd.UE r1) {
        super(r1);
        this.FH = new java.util.ArrayList();
    }

    private abcd.WH j6(abcd.YH r5) {
        abcd.yE r0 = null;
        java.lang.String r1 = null;
        abcd.UE r6 = null;
        abcd.yE r7 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5.VH();
                    r1 = r5.gn();
                    if (r5.Hw() != null) { $pc0 = 7; continue $sw0; }
                    return new abcd.WH(abcd.XH.j6, r1, r0);
                }
                case 7: {
                    if (r5.DW() == null) { $pc0 = 9; continue $sw0; }
                    r6 = r5.tp();
                    if (r6 == null) { $pc0 = 13; continue $sw0; }
                    r7 = r6.FH("HEAD");
                    if (r7 != null) { $pc0 = 19; continue $sw0; }
                    return new abcd.WH(abcd.XH.DW, r1, r0, r7);
                }
                case 19: {
                    if (r7.DW(r0) == true) { $pc0 = 23; continue $sw0; }
                    return new abcd.WH(abcd.XH.Hw, r1, r0, r7);
                }
                case 23: {
                    return new abcd.WH(abcd.XH.FH, r1, r0, r7);
                }
                case 13: {
                    return new abcd.WH(abcd.XH.DW, r1, r0);
                }
                case 9: {
                    return new abcd.WH(abcd.XH.DW, r1, r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.Object call() {
        return m4call();
    }

    public java.util.Map<java.lang.String, abcd.WH> m4call() {
        abcd.YH r0 = null;
        java.util.HashMap r1 = null;
        abcd.WH r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    j6();
                    try {
                        r0 = abcd.YH.j6(this.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof abcd.XC) { $pc1 = 12; continue $sw1; }
                        if ($t instanceof java.io.IOException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.FH.isEmpty() == true) { $pc1 = 6; continue $sw1; }
                    try {
                        r0.j6(abcd.hK.DW(this.FH));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof abcd.XC) { $pc1 = 12; continue $sw1; }
                        if ($t instanceof java.io.IOException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r1 = new java.util.HashMap();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof abcd.XC) { $pc1 = 12; continue $sw1; }
                        if ($t instanceof java.io.IOException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r0.EQ() == false) { $pc1 = 9; continue $sw1; }
                    try {
                        r2 = j6(r0);
                        r1.put(r2.j6(), r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof abcd.XC) { $pc1 = 12; continue $sw1; }
                        if ($t instanceof java.io.IOException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc1 = 7; continue $sw1; }
                }
                case 9: {
                    return r1;
                }
                case 12: {
                    e = $ex1;
                    throw new abcd.SB(e.getMessage(), e);
                }
                case 15: {
                    e = $ex1;
                    throw new abcd.SB(e.getMessage(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
