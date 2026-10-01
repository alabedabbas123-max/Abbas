package abcd;

final class oy<TResult> {
    private java.util.Queue<ny<TResult>> DW;
    private boolean FH;
    private final java.lang.Object j6;

    oy() {
        this.j6 = new java.lang.Object();
    }

    public final void j6(Yx<TResult> r3) {
        java.lang.Object r0 = null;
        java.lang.Object r1 = null;
        abcd.Interfaceny r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.j6;
                    monitor-enter(r0);
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 5: {
                    if (this.DW != null) { $pc0 = 7; continue $sw0; }
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    try {
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 25; continue $sw0;
                    }
                    return;
                }
                case 7: {
                    if (this.FH == true) { $pc0 = 23; continue $sw0; }
                    try {
                        this.FH = true;
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 25; continue $sw0;
                    }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r1 = this.j6;
                    monitor-enter(r1);
                    try {
                        r2 = this.DW.poll();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 20; continue $sw0;
                    }
                    if (r2 == null) { $pc0 = 15; continue $sw0; }
                    try {
                        monitor-exit(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 20; continue $sw0;
                    }
                    r2.j6(r3);
                    { $pc0 = 11; continue $sw0; }
                }
                case 15: {
                    try {
                        this.FH = false;
                        monitor-exit(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 20; continue $sw0;
                    }
                    return;
                }
                case 20: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final void j6(ny<TResult> r3) {
        java.lang.Object r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6;
                    monitor-enter(r0);
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    th = $ex1;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 5: {
                    if (this.DW != null) { $pc1 = 7; continue $sw1; }
                    try {
                        this.DW = new java.util.ArrayDeque();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    try {
                        this.DW.add(r3);
                        monitor-exit(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
