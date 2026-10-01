package abcd;

class oK extends java.lang.Thread {
    private final boolean DW;
    private final java.util.concurrent.atomic.AtomicBoolean FH;
    private final java.lang.Process j6;

    oK(java.lang.Process r1, boolean r2, java.util.concurrent.atomic.AtomicBoolean r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    @Override
    public void run() {
        java.io.InputStream r0 = null;
        int r2 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.j6.getErrorStream();
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    e = $ex0;
                    if (this.DW == false) { $pc0 = 16; continue $sw0; }
                    e.printStackTrace(java.lang.System.err);
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    this.FH.set(true);
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 19; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 19: {
                    e = $ex0;
                    if (this.DW == false) { $pc0 = 23; continue $sw0; }
                    e.printStackTrace(java.lang.System.err);
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    this.FH.set(true);
                    return;
                }
                case 4: {
                    if (this.DW == false) { $pc0 = 10; continue $sw0; }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r2 = r0.read();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 == (-1)) { $pc0 = 25; continue $sw0; }
                    try {
                        java.lang.System.err.print((char) r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if (r0.read() != (-1)) { $pc0 = 10; continue $sw0; }
                    { $pc0 = 25; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
