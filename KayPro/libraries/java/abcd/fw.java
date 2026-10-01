package abcd;

public class fw implements abcd.Zv {
    private static final abcd._v j6 = null;
    private final java.util.concurrent.BlockingQueue<abcd._v> DW;
    private final java.lang.Object FH;
    private final java.lang.Object Hw;
    private final java.util.concurrent.locks.Condition VH;
    private final java.util.concurrent.locks.Condition Zo;
    private java.util.concurrent.atomic.AtomicBoolean gn;
    private final java.util.concurrent.locks.ReentrantLock v5;

    static {
        j6 = new abcd._v();
    }

    public fw() {
        this.gn = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.DW = new java.util.concurrent.LinkedBlockingQueue();
        this.FH = new java.lang.Object();
        this.Hw = new java.lang.Object();
        this.v5 = new java.util.concurrent.locks.ReentrantLock();
        this.Zo = this.v5.newCondition();
        this.VH = this.v5.newCondition();
    }

    private java.io.File DW() {
        return new java.io.File(abcd.uw.j6(abcd.wu.j6(), "logfiles-tmp"), java.util.UUID.randomUUID().toString() + ".json");
    }

    static java.util.concurrent.locks.ReentrantLock DW(abcd.fw r0) {
        return r0.v5;
    }

    static java.util.concurrent.locks.Condition EQ(abcd.fw r0) {
        return r0.VH;
    }

    static java.io.File FH(abcd.fw r0) {
        return r0.Hw();
    }

    private java.io.File[] FH() {
        return v5().listFiles(new abcd.bw(this));
    }

    private java.io.File Hw() {
        return new java.io.File(v5(), "networking.lock");
    }

    static java.lang.Object Hw(abcd.fw r0) {
        return r0.Hw;
    }

    static java.io.File VH(abcd.fw r0) {
        return r0.DW();
    }

    static java.util.concurrent.BlockingQueue Zo(abcd.fw r0) {
        return r0.DW;
    }

    static java.io.File gn(abcd.fw r0) {
        return r0.v5();
    }

    static abcd._v j6() {
        return j6;
    }

    static java.util.concurrent.atomic.AtomicBoolean j6(abcd.fw r0) {
        return r0.gn;
    }

    static java.io.File[] tp(abcd.fw r0) {
        return r0.FH();
    }

    static java.lang.Object u7(abcd.fw r0) {
        return r0.FH;
    }

    private java.io.File v5() {
        return abcd.uw.j6(abcd.wu.j6(), "logfiles-outgoing");
    }

    static java.util.concurrent.locks.Condition v5(abcd.fw r0) {
        return r0.Zo;
    }

    @Override
    public void j6(abcd._v r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.gn.get() == true) { $pc0 = 6; continue $sw0; }
                    this.DW.add(r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(java.lang.String r4) {
        new java.lang.Thread(new abcd.Runnablecw(this), "a4backbone disk writer").start();
        new java.lang.Thread(new abcd.Runnabledw(this, r4), "a4backbone networking").start();
        abcd.vw.j6(new abcd.ew(this));
    }

    @Override
    public boolean j6(long r9) {
        long r4 = 0L;
        long r10 = 0L;
        boolean r11 = false;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        this.v5.lock();
                        this.DW.add(j6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc1 = 16; continue $sw1; }
                        $pc1 = 14; continue $sw1;
                    }
                    if (r9 <= 0) { $pc1 = 7; continue $sw1; }
                    try {
                        r4 = java.lang.System.currentTimeMillis();
                        abcd.yw.j6("Flush", "Waiting for all events written to disk.");
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc1 = 16; continue $sw1; }
                        $pc1 = 14; continue $sw1;
                    }
                    if (this.Zo.await(r9, java.util.concurrent.TimeUnit.MILLISECONDS) == false) { $pc1 = 7; continue $sw1; }
                    try {
                        r10 = r9 - (java.lang.System.currentTimeMillis() - r4);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc1 = 16; continue $sw1; }
                        $pc1 = 14; continue $sw1;
                    }
                    if (r10 <= 0) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.yw.j6("Flush", "Waiting for all files reported.");
                        r11 = this.VH.await(r10, java.util.concurrent.TimeUnit.MILLISECONDS);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.InterruptedException) { $pc1 = 16; continue $sw1; }
                        $pc1 = 14; continue $sw1;
                    }
                    this.v5.unlock();
                    return r11;
                }
                case 7: {
                    this.v5.unlock();
                    return false;
                }
                case 16: {
                    e = $ex1;
                    try {
                        abcd.yw.j6("Flush", "Unexpected InterruptedException", e);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 14; continue $sw1;
                    }
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    th = $ex1;
                    this.v5.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
