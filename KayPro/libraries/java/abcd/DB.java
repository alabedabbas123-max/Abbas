package abcd;

public class DB extends dB<java.util.Collection<java.lang.String>> {
    private final java.util.Collection<java.lang.String> FH;

    public DB(abcd.UE r1) {
        super(r1);
        this.FH = new java.util.ArrayList();
    }

    public java.lang.Object call() {
        return m3call();
    }

    public java.util.Collection<java.lang.String> m3call() {
        abcd.YH r0 = null;
        abcd.AbstractjF r1 = null;
        java.util.ArrayList r2 = null;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        java.lang.String r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    j6();
                    try {
                        r0 = abcd.YH.j6(this.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.XC) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof java.io.IOException) { $pc0 = 29; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.FH.isEmpty() == true) { $pc0 = 6; continue $sw0; }
                    try {
                        r0.j6(abcd.hK.DW(this.FH));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.XC) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof java.io.IOException) { $pc0 = 29; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r1 = this.j6.Zo();
                        r2 = new java.util.ArrayList();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.XC) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof java.io.IOException) { $pc0 = 29; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r0.EQ() == false) { $pc0 = 10; continue $sw0; }
                    if (r0.DW() != null) { $pc0 = 8; continue $sw0; }
                    try {
                        r3 = r0.gn();
                        r4 = r0.u7();
                        r5 = r0.v5();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.XC) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof java.io.IOException) { $pc0 = 29; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 == null) { $pc0 = 20; continue $sw0; }
                    try {
                        r1.j6("submodule", r3, "url", r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.XC) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof java.io.IOException) { $pc0 = 29; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    if (r5 == null) { $pc0 = 22; continue $sw0; }
                    try {
                        r1.j6("submodule", r3, "update", r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.XC) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof java.io.IOException) { $pc0 = 29; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    if (r4 != null) { $pc0 = 24; continue $sw0; }
                    if (r5 == null) { $pc0 = 8; continue $sw0; }
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    try {
                        r2.add(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.XC) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof java.io.IOException) { $pc0 = 29; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc0 = 8; continue $sw0; }
                }
                case 10: {
                    if (r2.isEmpty() == true) { $pc0 = 12; continue $sw0; }
                    try {
                        r1.v5();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.XC) { $pc0 = 26; continue $sw0; }
                        if ($t instanceof java.io.IOException) { $pc0 = 29; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    return r2;
                }
                case 26: {
                    e = $ex0;
                    throw new abcd.SB(e.getMessage(), e);
                }
                case 29: {
                    e = $ex0;
                    throw new abcd.SB(e.getMessage(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
