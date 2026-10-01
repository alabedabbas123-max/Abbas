package abcd;

public class tw {
    private final boolean DW;
    private java.io.RandomAccessFile FH;
    private java.nio.channels.FileLock Hw;
    private final java.io.File j6;

    public tw(java.io.File r1, boolean r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public void DW() {
        java.io.RandomAccessFile r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.FH;
                    if (r0 != null) { $pc0 = 12; continue $sw0; }
                    return;
                }
                case 12: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    this.FH = null;
                    this.Hw = null;
                    return;
                }
                case 9: {
                    th = $ex0;
                    this.FH = null;
                    this.Hw = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.Hw == null) { $pc1 = 5; continue $sw1; }
                    return;
                }
                case 5: {
                    this.FH = new java.io.RandomAccessFile(this.j6, "rw");
                    try {
                        this.Hw = this.FH.getChannel().lock(0, Long.MAX_VALUE, this.DW);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 8; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 8: {
                    e = $ex1;
                    try {
                        this.FH.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 12; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    this.FH = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
