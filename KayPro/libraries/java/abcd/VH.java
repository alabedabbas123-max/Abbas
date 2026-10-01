package abcd;

class VH extends abcd.CH {
    private final java.util.concurrent.locks.ReentrantLock v5;

    VH(abcd.NH r1) {
        super(r1);
        this.v5 = new java.util.concurrent.locks.ReentrantLock();
    }

    @Override
    abcd.CH.a j6(byte[] r2, int r3, int r4) {
        byte[] r5 = null;
        abcd.CH.a r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r5 = j6(r2, r3);
                    this.v5.lock();
                    try {
                        r6 = super.j6(r5, r3, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 6; continue $sw0;
                    }
                    this.v5.unlock();
                    return r6;
                }
                case 6: {
                    th = $ex0;
                    this.v5.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(int r2) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.v5.lock();
                    try {
                        super.j6(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 6; continue $sw1;
                    }
                    this.v5.unlock();
                    return;
                }
                case 6: {
                    th = $ex1;
                    this.v5.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    boolean j6(int r2, abcd.MH r3, abcd.MH r4) {
        boolean r5 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.v5.lock();
                    try {
                        r5 = super.j6(r2, r3, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 6; continue $sw2;
                    }
                    this.v5.unlock();
                    return r5;
                }
                case 6: {
                    th = $ex2;
                    this.v5.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
