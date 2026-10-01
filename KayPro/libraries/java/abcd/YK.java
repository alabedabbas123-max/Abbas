package abcd;

public class YK extends java.lang.Thread {
    private final java.io.OutputStream DW;
    private volatile boolean FH;
    private final java.io.InputStream j6;

    public YK(java.io.InputStream r3, java.io.OutputStream r4) {
        setName(java.lang.String.valueOf(java.lang.Thread.currentThread().getName()) + "-StreamCopy");
        this.j6 = r3;
        this.DW = r4;
    }

    public void DW() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = 2;
        $sw0: while (true) {
            switch ($pc0) {
                case 2: {
                    join(250);
                    if (isAlive() == false) { $pc0 = 5; continue $sw0; }
                    this.FH = true;
                    interrupt();
                    { $pc0 = 2; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        interrupt();
    }

    @Override
    public void run() {
        byte[] r0 = null;
        int r2 = 0;
        int r3 = 0;
        boolean r4 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        r0 = new byte[1024];
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 23; continue $sw1;
                    }
                    r2 = 0;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    if (r2 <= 0) { $pc1 = 8; continue $sw1; }
                    try {
                        this.DW.flush();
                        r2 = r2 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 29; continue $sw1; }
                        $pc1 = 23; continue $sw1;
                    }
                    $pc1 = 36; continue $sw1;
                }
                case 36: {
                    try {
                        this.j6.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 30; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 34; continue $sw1;
                }
                case 34: {
                    try {
                        this.DW.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 31; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 56: {
                    return;
                }
                case 8: {
                    if (this.FH == true) { $pc1 = 36; continue $sw1; }
                    try {
                        r3 = this.j6.read(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.InterruptedIOException) { $pc1 = 19; continue $sw1; }
                        if ($t instanceof java.io.IOException) { $pc1 = 29; continue $sw1; }
                        $pc1 = 23; continue $sw1;
                    }
                    if (r3 < 0) { $pc1 = 36; continue $sw1; }
                    r4 = false;
                    $pc1 = 44; continue $sw1;
                }
                case 44: {
                    try {
                        this.DW.write(r0, 0, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.InterruptedIOException) { $pc1 = 18; continue $sw1; }
                        if ($t instanceof java.io.IOException) { $pc1 = 29; continue $sw1; }
                        $pc1 = 23; continue $sw1;
                    }
                    if (r4 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        interrupt();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 29; continue $sw1; }
                        $pc1 = 23; continue $sw1;
                    }
                    $pc1 = 38; continue $sw1;
                }
                case 18: {
                    r4 = true;
                    $pc1 = 38; continue $sw1;
                }
                case 19: {
                    r2 = r2 + 1;
                    $pc1 = 38; continue $sw1;
                }
                case 23: {
                    th = $ex1;
                    try {
                        this.j6.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 32; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 38; continue $sw1;
                }
                case 38: {
                    try {
                        this.DW.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 33; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 29: {
                    return;
                }
                case 30: {
                    return;
                }
                case 31: {
                    return;
                }
                case 32: {
                    return;
                }
                case 33: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
