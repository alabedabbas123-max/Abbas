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
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.v5.getAndSet(0);
                    if (r0 <= 0) { $pc0 = 6; continue $sw0; }
                    this.j6.update(r0);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean v5() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (java.lang.Thread.currentThread() != this.FH) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.Hw.decrementAndGet() != 0) { $pc2 = 6; continue $sw2; }
                    this.Zo.release();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 3: {
                    if (this.Hw.get() <= 0) { $pc3 = 4; continue $sw3; }
                    Hw();
                    this.Zo.acquire();
                    { $pc3 = 3; continue $sw3; }
                }
                case 4: {
                    Hw();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean isCancelled() {
        boolean r0 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    this.DW.lock();
                    try {
                        r0 = this.j6.isCancelled();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 6; continue $sw4;
                    }
                    this.DW.unlock();
                    return r0;
                }
                case 6: {
                    th = $ex4;
                    this.DW.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6() {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (v5() == false) { $pc5 = 7; continue $sw5; }
                    this.j6.j6();
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r2) {
        this.Hw.addAndGet(r2);
    }

    @Override
    public void j6(java.lang.String r2, int r3) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (v5() == false) { $pc6 = 7; continue $sw6; }
                    this.j6.j6(r2, r3);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void start(int r2) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (v5() == false) { $pc7 = 7; continue $sw7; }
                    this.j6.start(r2);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void update(int r2) {
        int r3 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r3 = this.v5.getAndAdd(r2);
                    if (v5() == false) { $pc8 = 5; continue $sw8; }
                    Hw();
                    return;
                }
                case 5: {
                    if (r3 != 0) { $pc8 = 9; continue $sw8; }
                    this.Zo.release();
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
