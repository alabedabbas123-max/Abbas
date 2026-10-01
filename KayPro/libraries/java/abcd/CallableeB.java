package abcd;

public class CallableeB implements java.util.concurrent.Callable<abcd.cB> {
    private boolean DW;
    private java.io.File j6;

    public CallableeB() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public abcd.cB call() {
        abcd.VE r0 = null;
        java.io.File r1 = null;
        abcd.UE r2 = null;
        java.io.File r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r0 = new abcd.VE();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 26; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.DW == false) { $pc0 = 5; continue $sw0; }
                    try {
                        r0.QX();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 26; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0.we();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 26; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.j6 == null) { $pc0 = 13; continue $sw0; }
                    try {
                        r1 = this.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 26; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.DW == true) { $pc0 = 11; continue $sw0; }
                    try {
                        r1 = new java.io.File(r1, ".git");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 26; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    try {
                        r0.FH(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 26; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    try {
                        r2 = r0.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 26; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2.EQ().DW() == true) { $pc0 = 24; continue $sw0; }
                    try {
                        r2.j6(this.DW);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 26; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    return new abcd.cB(r2);
                }
                case 13: {
                    if (r0.v5() != null) { $pc0 = 21; continue $sw0; }
                    try {
                        r3 = new java.io.File(".");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 26; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3.getParentFile() == null) { $pc0 = 18; continue $sw0; }
                    try {
                        r3 = r3.getParentFile();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 26; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    if (this.DW == true) { $pc0 = 20; continue $sw0; }
                    try {
                        r3 = new java.io.File(r3, ".git");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 26; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    try {
                        r0.FH(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 26; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    e = $ex0;
                    throw new abcd.SB(e.getMessage(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.cB call() {
        return call();
    }

    public abcd.CallableeB j6(java.io.File r1) {
        this.j6 = r1;
        return this;
    }

    public abcd.CallableeB j6(boolean r1) {
        this.DW = r1;
        return this;
    }
}
