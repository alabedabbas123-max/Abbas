package abcd;

public class uH {
    private static volatile abcd.uH DW;
    private static volatile int FH;
    private static final java.util.Random j6 = null;
    private final int EQ;
    private final java.lang.ref.ReferenceQueue<abcd.CG> Hw;
    private final boolean J0;
    private final int J8;
    private final java.util.concurrent.atomic.AtomicInteger QX;
    private final java.util.concurrent.atomic.AtomicReferenceArray<abcd.uH.a> VH;
    private final int Ws;
    private final java.util.concurrent.atomic.AtomicLong XL;
    private final java.util.concurrent.atomic.AtomicLong Zo;
    private final abcd.uH.b[] gn;
    private final int tp;
    private final java.util.concurrent.locks.ReentrantLock u7;
    private final int v5;
    private final long we;

    private static class a {
        final abcd.uH.c DW;
        volatile boolean FH;
        final abcd.uH.a j6;

        a(abcd.uH.a r1, abcd.uH.c r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        final void j6() {
            this.FH = true;
            this.DW.enqueue();
        }
    }

    private static final class b {
        private b() {
        }

        b(abcd.uH.b r1) {
            this();
        }
    }

    private static class c extends java.lang.ref.SoftReference<abcd.CG> {
        final long DW;
        final int FH;
        long Hw;
        final abcd.aH j6;
        private boolean v5;

        protected c(abcd.aH r1, long r2, abcd.CG r4, java.lang.ref.ReferenceQueue<abcd.CG> r5) {
            super(r4, r5);
            this.j6 = r1;
            this.DW = r2;
            this.FH = r4.j6();
        }

        final synchronized boolean j6() {
            synchronized (this) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = -1;
                $sw0: while (true) {
                    switch ($pc0) {
                        case -1: {
                            $pc0 = 4; continue $sw0;
                        }
                        case 12: {
                            th = $ex0;
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (this.v5 == false) { $pc0 = 9; continue $sw0; }
                            return false;
                        }
                        case 9: {
                            try {
                                this.v5 = true;
                            } catch (java.lang.Throwable $t) {
                                $ex0 = $t;
                                $pc0 = 12; continue $sw0;
                            }
                            return true;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
        
            }
        }
    }

    static {
        j6 = new java.util.Random();
        j6(new abcd.vH());
    }

    private uH(abcd.vH r6) {
        int r0 = 0;
        int r1 = 0;
        abcd.uH.b[] r2 = null;
        double r3 = 0.0d;
        int r4 = 0;
        int r5 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.v5 = FH(r6);
                    r0 = DW(r6);
                    if (this.v5 < 1) { $pc1 = 29; continue $sw1; }
                    if (r0 < 1) { $pc1 = 27; continue $sw1; }
                    this.Hw = new java.lang.ref.ReferenceQueue();
                    this.Zo = new java.util.concurrent.atomic.AtomicLong(1);
                    this.VH = new java.util.concurrent.atomic.AtomicReferenceArray(this.v5);
                    this.gn = new abcd.uH.b[r0];
                    r1 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r2 = this.gn;
                    if (r1 >= r2.length) { $pc1 = 8; continue $sw1; }
                    r2[r1] = new abcd.uH.b(null);
                    r1 = r1 + 1;
                    { $pc1 = 6; continue $sw1; }
                }
                case 8: {
                    this.u7 = new java.util.concurrent.locks.ReentrantLock();
                    r3 = this.v5;
                    java.lang.Double.isNaN(r3);
                    r4 = (int) (r3 * 0.1d);
                    if (64 >= r4) { $pc1 = 11; continue $sw1; }
                    r4 = 64;
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r5 = this.v5;
                    if (r5 >= r4) { $pc1 = 16; continue $sw1; }
                    r4 = r5;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    this.tp = r4;
                    this.EQ = r6.FH();
                    this.we = r6.DW();
                    this.J0 = r6.Zo();
                    this.J8 = j6(r6.Hw());
                    this.Ws = 1 << this.J8;
                    this.QX = new java.util.concurrent.atomic.AtomicInteger();
                    this.XL = new java.util.concurrent.atomic.AtomicLong();
                    if (this.EQ < 1) { $pc1 = 24; continue $sw1; }
                    if (this.we < this.Ws) { $pc1 = 22; continue $sw1; }
                    return;
                }
                case 22: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().windowSizeMustBeLesserThanLimit);
                }
                case 24: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().openFilesMustBeAtLeast1);
                }
                case 11: {
                    if (r4 >= 4) { $pc1 = 13; continue $sw1; }
                    r4 = 4;
                    { $pc1 = 13; continue $sw1; }
                }
                case 27: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().lockCountMustBeGreaterOrEqual1);
                }
                case 29: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().tSizeMustBeGreaterOrEqual1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int DW(abcd.vH r1) {
        return java.lang.Math.max(r1.FH(), 32);
    }

    private abcd.CG DW(abcd.aH r5, long r6) {
        synchronized (this) {
            int r0 = 0;
            abcd.uH.a r1 = null;
            abcd.CG r2 = null;
            abcd.uH.b r3 = null;
            abcd.uH.a r4 = null;
            abcd.CG r7 = null;
            abcd.CG r8 = null;
            abcd.uH.c r9 = null;
            abcd.uH.a r10 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = v5(r5, r6);
                        r1 = this.VH.get(r0);
                        r2 = j6(r1, r5, r6);
                        if (r2 == null) { $pc2 = 5; continue $sw2; }
                        return r2;
                    }
                    case 5: {
                        r3 = Hw(r5, r6);
                        try {
                            r4 = this.VH.get(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 26; continue $sw2;
                        }
                        if (r4 == r1) { $pc2 = 13; continue $sw2; }
                        try {
                            r7 = j6(r4, r5, r6);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 26; continue $sw2;
                        }
                        if (r7 == null) { $pc2 = 13; continue $sw2; }
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 26; continue $sw2;
                        }
                        return r7;
                    }
                    case 13: {
                        try {
                            r8 = FH(r5, r6);
                            r9 = j6(r5, r6, r8);
                            DW(r9);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 26; continue $sw2;
                        }
                        $pc2 = 14; continue $sw2;
                    }
                    case 14: {
                        try {
                            r10 = new abcd.uH.a(j6(r4), r9);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 26; continue $sw2;
                        }
                        if (this.VH.compareAndSet(r0, r4, r10) == true) { $pc2 = 16; continue $sw2; }
                        try {
                            r4 = this.VH.get(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 26; continue $sw2;
                        }
                        { $pc2 = 14; continue $sw2; }
                    }
                    case 16: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 26; continue $sw2;
                        }
                        if (this.u7.tryLock() == true) { $pc2 = 31; continue $sw2; }
                        $pc2 = 24; continue $sw2;
                    }
                    case 24: {
                        return r8;
                    }
                    case 31: {
                        try {
                            FH();
                            DW();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 21; continue $sw2;
                        }
                        this.u7.unlock();
                        throw new java.lang.IllegalStateException();
                    }
                    case 21: {
                        th = $ex2;
                        this.u7.unlock();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 26: {
                        th = $ex2;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    private void DW() {
        int r0 = 0;
        abcd.uH.a r1 = null;
        int r2 = 0;
        int r4 = 0;
        abcd.uH.a r5 = null;
        abcd.uH.a r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 3: {
                    if (Hw() == false) { $pc3 = 4; continue $sw3; }
                    r0 = j6.nextInt(this.v5);
                    r1 = null;
                    r2 = this.tp - 1;
                    r4 = 0;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (r2 < 0) { $pc3 = 7; continue $sw3; }
                    if (this.v5 > r0) { $pc3 = 12; continue $sw3; }
                    r0 = 0;
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    r5 = this.VH.get(r0);
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    if (r5 == null) { $pc3 = 14; continue $sw3; }
                    if (r5.FH == true) { $pc3 = 22; continue $sw3; }
                    if (r1 != null) { $pc3 = 20; continue $sw3; }
                    $pc3 = 21; continue $sw3;
                }
                case 21: {
                    r4 = r0;
                    r1 = r5;
                    { $pc3 = 22; continue $sw3; }
                }
                case 20: {
                    if (r5.DW.Hw < r1.DW.Hw) { $pc3 = 21; continue $sw3; }
                    $pc3 = 22; continue $sw3;
                }
                case 22: {
                    r5 = r5.j6;
                    { $pc3 = 13; continue $sw3; }
                }
                case 14: {
                    r2 = r2 - 1;
                    r0 = r0 + 1;
                    { $pc3 = 6; continue $sw3; }
                }
                case 7: {
                    if (r1 == null) { $pc3 = 3; continue $sw3; }
                    r1.j6();
                    FH();
                    r3 = this.VH.get(r4);
                    this.VH.compareAndSet(r4, r3, j6(r3));
                    { $pc3 = 3; continue $sw3; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.aH r1) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r1.FH() == false) { $pc4 = 6; continue $sw4; }
                    this.QX.decrementAndGet();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.uH.c r6) {
        long r0 = this.Zo.get();
        this.Zo.compareAndSet(r0, 1 + r0);
        r6.Hw = r0;
    }

    private static int FH(abcd.vH r7) {
        int r0 = 0;
        long r1 = 0L;
        long r3 = 0L;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = r7.Hw();
                    r1 = r7.DW();
                    if (r0 <= 0) { $pc5 = 11; continue $sw5; }
                    r3 = r0;
                    if (r1 < r3) { $pc5 = 9; continue $sw5; }
                    return (int) java.lang.Math.min(((r1 / r3) * 5) / 2, 2000000000);
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().windowSizeMustBeLesserThanLimit);
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().invalidWindowSize);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.CG FH(abcd.aH r2, long r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r2.j6() == false) { $pc6 = 20; continue $sw6; }
                    this.QX.incrementAndGet();
                    $pc6 = 20; continue $sw6;
                }
                case 20: {
                    $pc6 = 6; continue $sw6;
                }
                case 17: {
                    e = $ex6;
                    DW(r2);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 11: {
                    e = $ex6;
                    DW(r2);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 14: {
                    e = $ex6;
                    DW(r2);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 6: {
                    if (this.J0 == false) { $pc6 = 10; continue $sw6; }
                    return r2.j6(r3, this.Ws);
                }
                case 10: {
                    return r2.DW(r3, this.Ws);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH() {
        abcd.uH.c r0 = null;
        boolean r1 = false;
        int r2 = 0;
        abcd.uH.a r3 = null;
        abcd.uH.a r4 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 2;
        $sw7: while (true) {
            switch ($pc7) {
                case 2: {
                    r0 = (abcd.uH.c) this.Hw.poll();
                    if (r0 == null) { $pc7 = 4; continue $sw7; }
                    if (r0.j6() == false) { $pc7 = 2; continue $sw7; }
                    j6(r0);
                    r1 = false;
                    r2 = v5(r0.j6, r0.DW);
                    r3 = this.VH.get(r2);
                    r4 = r3;
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    if (r4 == null) { $pc7 = 14; continue $sw7; }
                    if (r4.DW == r0) { $pc7 = 13; continue $sw7; }
                    r4 = r4.j6;
                    { $pc7 = 9; continue $sw7; }
                }
                case 13: {
                    r4.FH = true;
                    r1 = true;
                    $pc7 = 14; continue $sw7;
                }
                case 14: {
                    if (r1 == false) { $pc7 = 2; continue $sw7; }
                    this.VH.compareAndSet(r2, r3, j6(r3));
                    { $pc7 = 2; continue $sw7; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(abcd.aH r8) {
        int r1 = 0;
        abcd.uH.a r2 = null;
        abcd.uH.a r3 = null;
        boolean r4 = false;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r1 = 0;
                    $pc8 = 4; continue $sw8;
                }
                case 4: {
                    if (r1 >= this.v5) { $pc8 = 5; continue $sw8; }
                    r2 = this.VH.get(r1);
                    r3 = r2;
                    r4 = false;
                    $pc8 = 8; continue $sw8;
                }
                case 8: {
                    if (r3 == null) { $pc8 = 9; continue $sw8; }
                    if (r3.DW.j6 != r8) { $pc8 = 17; continue $sw8; }
                    r3.j6();
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    r4 = true;
                    $pc8 = 19; continue $sw8;
                }
                case 19: {
                    r3 = r3.j6;
                    { $pc8 = 8; continue $sw8; }
                }
                case 17: {
                    if (r3.FH == false) { $pc8 = 19; continue $sw8; }
                    $pc8 = 9; continue $sw8;
                }
                case 9: {
                    if (r4 == false) { $pc8 = 11; continue $sw8; }
                    this.VH.compareAndSet(r1, r2, j6(r2));
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    r1 = r1 + 1;
                    { $pc8 = 4; continue $sw8; }
                }
                case 5: {
                    FH();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.uH.b Hw(abcd.aH r2, long r3) {
        return this.gn[(j6(r2.v5, r3) >>> 1) % this.gn.length];
    }

    private boolean Hw() {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (this.EQ >= this.QX.get()) { $pc9 = 5; continue $sw9; }
                    return true;
                }
                case 5: {
                    if (this.we < this.XL.get()) { $pc9 = 10; continue $sw9; }
                    return false;
                }
                case 10: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int j6() {
        return FH;
    }

    private static final int j6(int r2) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r2 < 4096) { $pc10 = 11; continue $sw10; }
                    if (java.lang.Integer.bitCount(r2) != 1) { $pc10 = 9; continue $sw10; }
                    return java.lang.Integer.numberOfTrailingZeros(r2);
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().windowSizeMustBePowerOf2);
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().invalidWindowSize);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(int r2, long r3) {
        return r2 + ((int) (r3 >>> this.J8));
    }

    private long j6(long r2) {
        int r0 = this.J8;
        return (r2 >>> r0) << r0;
    }

    static final abcd.CG j6(abcd.aH r1, long r2) {
        abcd.uH r0 = null;
        abcd.CG r3 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = DW;
                    r3 = r0.DW(r1, r0.j6(r2));
                    if (r0 == DW) { $pc11 = 5; continue $sw11; }
                    r0.v5();
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.CG j6(abcd.uH.a r5, abcd.aH r6, long r7) {
        abcd.uH.c r0 = null;
        abcd.CG r8 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 2;
        $sw12: while (true) {
            switch ($pc12) {
                case 2: {
                    if (r5 == null) { $pc12 = 20; continue $sw12; }
                    r0 = r5.DW;
                    if (r0.j6 != r6) { $pc12 = 15; continue $sw12; }
                    if (r0.DW != r7) { $pc12 = 15; continue $sw12; }
                    r8 = r0.get();
                    if (r8 == null) { $pc12 = 12; continue $sw12; }
                    DW(r0);
                    return r8;
                }
                case 12: {
                    r5.j6();
                    return null;
                }
                case 15: {
                    r5 = r5.j6;
                    { $pc12 = 2; continue $sw12; }
                }
                case 20: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.uH.a j6(abcd.uH.a r2) {
        abcd.uH.a r0 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 2;
        $sw13: while (true) {
            switch ($pc13) {
                case 2: {
                    if (r2 == null) { $pc13 = 7; continue $sw13; }
                    if (r2.FH == false) { $pc13 = 7; continue $sw13; }
                    r2.DW.enqueue();
                    r2 = r2.j6;
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (r2 != null) { $pc13 = 10; continue $sw13; }
                    return null;
                }
                case 10: {
                    r0 = j6(r2.j6);
                    if (r0 != r2.j6) { $pc13 = 14; continue $sw13; }
                    return r2;
                }
                case 14: {
                    return new abcd.uH.a(r0, r2.DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.uH.c j6(abcd.aH r8, long r9, abcd.CG r11) {
        abcd.uH.c r6 = new abcd.uH.c(r8, r9, r11, this.Hw);
        this.XL.addAndGet(r6.FH);
        return r6;
    }

    static final void j6(abcd.aH r1) {
        DW.FH(r1);
    }

    private void j6(abcd.uH.c r4) {
        this.XL.addAndGet(-r4.FH);
        DW(r4.j6);
    }

    public static void j6(abcd.vH r2) {
        abcd.uH r0 = null;
        abcd.uH r1 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = new abcd.uH(r2);
                    r1 = DW;
                    if (r1 == null) { $pc14 = 5; continue $sw14; }
                    r1.v5();
                    $pc14 = 5; continue $sw14;
                }
                case 5: {
                    DW = r0;
                    FH = r2.v5();
                    abcd.EG.j6(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int v5(abcd.aH r1, long r2) {
        return (j6(r1.v5, r2) >>> 1) % this.v5;
    }

    private void v5() {
        int r0 = 0;
        abcd.uH.a r1 = null;
        abcd.uH.a r2 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = 0;
                    $pc15 = 4; continue $sw15;
                }
                case 4: {
                    if (r0 >= this.v5) { $pc15 = 5; continue $sw15; }
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    r1 = this.VH.get(r0);
                    r2 = r1;
                    $pc15 = 8; continue $sw15;
                }
                case 8: {
                    if (r2 == null) { $pc15 = 10; continue $sw15; }
                    r2.j6();
                    r2 = r2.j6;
                    { $pc15 = 8; continue $sw15; }
                }
                case 10: {
                    if (this.VH.compareAndSet(r0, r1, null) == false) { $pc15 = 7; continue $sw15; }
                    r0 = r0 + 1;
                    { $pc15 = 4; continue $sw15; }
                }
                case 5: {
                    FH();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
