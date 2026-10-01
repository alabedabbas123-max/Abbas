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
        if (this.gn.get() == true) goto L6;
        this.DW.add(r2);
        return;
    }

    @Override
    public void j6(java.lang.String r4) {
        new java.lang.Thread(new abcd.Runnablecw(this), "a4backbone disk writer").start();
        new java.lang.Thread(new abcd.Runnabledw(this, r4), "a4backbone networking").start();
        abcd.vw.j6(new abcd.ew(this));
    }

    @Override
    public boolean j6(long r9) {
        this.v5.lock();     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L16
        this.DW.add(j6);     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L16
        if (r9 <= 0) goto L7;
        long r4 = java.lang.System.currentTimeMillis();     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L16
        abcd.yw.j6("Flush", "Waiting for all events written to disk.");     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L16
        if (this.Zo.await(r9, java.util.concurrent.TimeUnit.MILLISECONDS) == false) goto L7;
        long r10 = r9 - (java.lang.System.currentTimeMillis() - r4);     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L16
        if (r10 <= 0) goto L7;
        abcd.yw.j6("Flush", "Waiting for all files reported.");     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L16
        boolean r11 = this.VH.await(r10, java.util.concurrent.TimeUnit.MILLISECONDS);     // Catch: java.lang.Throwable -> L14 java.lang.InterruptedException -> L16
        this.v5.unlock();
        return r11;
    L7:
        this.v5.unlock();
        return false;
    L16:
        e = move-exception;
        abcd.yw.j6("Flush", "Unexpected InterruptedException", e);     // Catch: java.lang.Throwable -> L14
    L14:
        th = move-exception;
        this.v5.unlock();
        throw th;
    }
}
