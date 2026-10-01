package abcd;

public class lF implements abcd.LE {
    private final java.util.concurrent.locks.ReentrantLock DW;
    private final java.lang.Thread FH;
    private final java.util.concurrent.atomic.AtomicInteger Hw;
    private final java.util.concurrent.Semaphore Zo;
    private final abcd.LE j6;
    private final java.util.concurrent.atomic.AtomicInteger v5;

    public lF(abcd.LE r2) {
        this.j6 = r2;
        this.DW = new java.util.concurrent.locks.ReentrantLock();
        this.FH = java.lang.Thread.currentThread();
        this.Hw = new java.util.concurrent.atomic.AtomicInteger(0);
        this.v5 = new java.util.concurrent.atomic.AtomicInteger(0);
        this.Zo = new java.util.concurrent.Semaphore(0);
    }

    private void Hw() {
        int r0 = this.v5.getAndSet(0);
        if (r0 <= 0) goto L6;
        this.j6.update(r0);
        return;
    }

    private boolean v5() {
        if (java.lang.Thread.currentThread() != this.FH) goto L6;
        return true;
    L6:
        return false;
    }

    public void DW() {
        if (this.Hw.decrementAndGet() != 0) goto L6;
        this.Zo.release();
        return;
    }

    public void FH() {
    L3:
        if (this.Hw.get() <= 0) goto L4;
        Hw();
        this.Zo.acquire();
        goto L3
    L4:
        Hw();
    }

    @Override
    public boolean isCancelled() {
        this.DW.lock();
        boolean r0 = this.j6.isCancelled();     // Catch: java.lang.Throwable -> L6
        this.DW.unlock();
        return r0;
    L6:
        th = move-exception;
        this.DW.unlock();
        throw th;
    }

    @Override
    public void j6() {
        if (v5() == false) goto L7;
        this.j6.j6();
        return;
    L7:
        throw new java.lang.IllegalStateException();
    }

    public void j6(int r2) {
        this.Hw.addAndGet(r2);
    }

    @Override
    public void j6(java.lang.String r2, int r3) {
        if (v5() == false) goto L7;
        this.j6.j6(r2, r3);
        return;
    L7:
        throw new java.lang.IllegalStateException();
    }

    @Override
    public void start(int r2) {
        if (v5() == false) goto L7;
        this.j6.start(r2);
        return;
    L7:
        throw new java.lang.IllegalStateException();
    }

    @Override
    public void update(int r2) {
        int r3 = this.v5.getAndAdd(r2);
        if (v5() == false) goto L5;
        Hw();
        return;
    L5:
        if (r3 != 0) goto L9;
        this.Zo.release();
        return;
    }
}
