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
            monitor-enter(this);
        L12:
            th = move-exception;
            throw th;
        L4:
            if (this.v5 == false) goto L9;
            monitor-exit(this);
            return false;
        L9:
            this.v5 = true;     // Catch: java.lang.Throwable -> L12
            monitor-exit(this);
            return true;
        }
    }

    static {
        j6 = new java.util.Random();
        j6(new abcd.vH());
    }

    private uH(abcd.vH r6) {
        this.v5 = FH(r6);
        int r0 = DW(r6);
        if (this.v5 < 1) goto L29;
        if (r0 < 1) goto L27;
        this.Hw = new java.lang.ref.ReferenceQueue();
        this.Zo = new java.util.concurrent.atomic.AtomicLong(1);
        this.VH = new java.util.concurrent.atomic.AtomicReferenceArray(this.v5);
        this.gn = new abcd.uH.b[r0];
        int r1 = 0;
    L6:
        abcd.uH.b[] r2 = this.gn;
        if (r1 >= r2.length) goto L8;
        r2[r1] = new abcd.uH.b(null);
        r1 = r1 + 1;
        goto L6
    L8:
        this.u7 = new java.util.concurrent.locks.ReentrantLock();
        double r3 = this.v5;
        java.lang.Double.isNaN(r3);
        int r4 = (int) (r3 * 0.1d);
        if (64 >= r4) goto L11;
        r4 = 64;
    L13:
        int r5 = this.v5;
        if (r5 >= r4) goto L16;
        r4 = r5;
    L16:
        this.tp = r4;
        this.EQ = r6.FH();
        this.we = r6.DW();
        this.J0 = r6.Zo();
        this.J8 = j6(r6.Hw());
        this.Ws = 1 << this.J8;
        this.QX = new java.util.concurrent.atomic.AtomicInteger();
        this.XL = new java.util.concurrent.atomic.AtomicLong();
        if (this.EQ < 1) goto L24;
        if (this.we < this.Ws) goto L22;
        return;
    L22:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().windowSizeMustBeLesserThanLimit);
    L24:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().openFilesMustBeAtLeast1);
    L11:
        if (r4 >= 4) goto L13;
        r4 = 4;
        goto L13
    L27:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().lockCountMustBeGreaterOrEqual1);
    L29:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().tSizeMustBeGreaterOrEqual1);
    }

    private static int DW(abcd.vH r1) {
        return java.lang.Math.max(r1.FH(), 32);
    }

    private abcd.CG DW(abcd.aH r5, long r6) {
        int r0 = v5(r5, r6);
        abcd.uH.a r1 = this.VH.get(r0);
        abcd.CG r2 = j6(r1, r5, r6);
        if (r2 == null) goto L5;
        return r2;
    L5:
        abcd.uH.b r3 = Hw(r5, r6);
        monitor-enter(r3);
        abcd.uH.a r4 = this.VH.get(r0);     // Catch: java.lang.Throwable -> L26
        if (r4 == r1) goto L13;
        abcd.CG r7 = j6(r4, r5, r6);     // Catch: java.lang.Throwable -> L26
        if (r7 == null) goto L13;
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L26
        return r7;
    L13:
        abcd.CG r8 = FH(r5, r6);     // Catch: java.lang.Throwable -> L26
        abcd.uH.c r9 = j6(r5, r6, r8);     // Catch: java.lang.Throwable -> L26
        DW(r9);     // Catch: java.lang.Throwable -> L26
    L14:
        abcd.uH.a r10 = new abcd.uH.a(j6(r4), r9);     // Catch: java.lang.Throwable -> L26
        if (this.VH.compareAndSet(r0, r4, r10) == true) goto L16;
        r4 = this.VH.get(r0);     // Catch: java.lang.Throwable -> L26
        goto L14
    L16:
        monitor-exit(r3);     // Catch: java.lang.Throwable -> L26
        if (this.u7.tryLock() == true) goto L31;
    L24:
        return r8;
    L31:
        FH();     // Catch: java.lang.Throwable -> L21
        DW();     // Catch: java.lang.Throwable -> L21
        this.u7.unlock();
    L21:
        th = move-exception;
        this.u7.unlock();
        throw th;
    L26:
        th = move-exception;
        throw th;
    }

    private void DW() {
    L3:
        if (Hw() == false) goto L4;
        int r0 = j6.nextInt(this.v5);
        abcd.uH.a r1 = null;
        int r2 = this.tp - 1;
        int r4 = 0;
    L6:
        if (r2 < 0) goto L7;
        if (this.v5 > r0) goto L12;
        r0 = 0;
    L12:
        abcd.uH.a r5 = this.VH.get(r0);
    L13:
        if (r5 == null) goto L14;
        if (r5.FH == true) goto L22;
        if (r1 != null) goto L20;
    L21:
        r4 = r0;
        r1 = r5;
        goto L22
    L20:
        if (r5.DW.Hw < r1.DW.Hw) goto L21;
    L22:
        r5 = r5.j6;
        goto L13
    L14:
        r2 = r2 - 1;
        r0 = r0 + 1;
        goto L6
    L7:
        if (r1 == null) goto L3;
        r1.j6();
        FH();
        abcd.uH.a r3 = this.VH.get(r4);
        this.VH.compareAndSet(r4, r3, j6(r3));
        goto L3
    }

    private void DW(abcd.aH r1) {
        if (r1.FH() == false) goto L6;
        this.QX.decrementAndGet();
        return;
    }

    private void DW(abcd.uH.c r6) {
        long r0 = this.Zo.get();
        this.Zo.compareAndSet(r0, 1 + r0);
        r6.Hw = r0;
    }

    private static int FH(abcd.vH r7) {
        int r0 = r7.Hw();
        long r1 = r7.DW();
        if (r0 <= 0) goto L11;
        long r3 = r0;
        if (r1 < r3) goto L9;
        return (int) java.lang.Math.min(((r1 / r3) * 5) / 2, 2000000000);
    L9:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().windowSizeMustBeLesserThanLimit);
    L11:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().invalidWindowSize);
    }

    private abcd.CG FH(abcd.aH r2, long r3) {
        if (r2.j6() == false) goto L20;
        this.QX.incrementAndGet();
    L20:
    L17:
        e = move-exception;
        DW(r2);
        throw e;
    L11:
        e = move-exception;
        DW(r2);
        throw e;
    L14:
        e = move-exception;
        DW(r2);
        throw e;
    L6:
        if (this.J0 == false) goto L10;
        return r2.j6(r3, this.Ws);
    L10:
        return r2.DW(r3, this.Ws);
    }

    private void FH() {
    L2:
        abcd.uH.c r0 = (abcd.uH.c) this.Hw.poll();
        if (r0 == null) goto L4;
        if (r0.j6() == false) goto L2;
        j6(r0);
        boolean r1 = false;
        int r2 = v5(r0.j6, r0.DW);
        abcd.uH.a r3 = this.VH.get(r2);
        abcd.uH.a r4 = r3;
    L9:
        if (r4 == null) goto L14;
        if (r4.DW == r0) goto L13;
        r4 = r4.j6;
        goto L9
    L13:
        r4.FH = true;
        r1 = true;
    L14:
        if (r1 == false) goto L2;
        this.VH.compareAndSet(r2, r3, j6(r3));
        goto L2
    }

    private void FH(abcd.aH r8) {
        int r1 = 0;
    L4:
        if (r1 >= this.v5) goto L5;
        abcd.uH.a r2 = this.VH.get(r1);
        abcd.uH.a r3 = r2;
        boolean r4 = false;
    L8:
        if (r3 == null) goto L9;
        if (r3.DW.j6 != r8) goto L17;
        r3.j6();
    L15:
        r4 = true;
    L19:
        r3 = r3.j6;
        goto L8
    L17:
        if (r3.FH == false) goto L19;
    L9:
        if (r4 == false) goto L11;
        this.VH.compareAndSet(r1, r2, j6(r2));
    L11:
        r1 = r1 + 1;
        goto L4
    L5:
        FH();
    }

    private abcd.uH.b Hw(abcd.aH r2, long r3) {
        return this.gn[(j6(r2.v5, r3) >>> 1) % this.gn.length];
    }

    private boolean Hw() {
        if (this.EQ >= this.QX.get()) goto L5;
        return true;
    L5:
        if (this.we < this.XL.get()) goto L10;
        return false;
    L10:
        return true;
    }

    static int j6() {
        return FH;
    }

    private static final int j6(int r2) {
        if (r2 < 4096) goto L11;
        if (java.lang.Integer.bitCount(r2) != 1) goto L9;
        return java.lang.Integer.numberOfTrailingZeros(r2);
    L9:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().windowSizeMustBePowerOf2);
    L11:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().invalidWindowSize);
    }

    private int j6(int r2, long r3) {
        return r2 + ((int) (r3 >>> this.J8));
    }

    private long j6(long r2) {
        int r0 = this.J8;
        return (r2 >>> r0) << r0;
    }

    static final abcd.CG j6(abcd.aH r1, long r2) {
        abcd.uH r0 = DW;
        abcd.CG r3 = r0.DW(r1, r0.j6(r2));
        if (r0 == DW) goto L5;
        r0.v5();
    L5:
        return r3;
    }

    private abcd.CG j6(abcd.uH.a r5, abcd.aH r6, long r7) {
    L2:
        if (r5 == null) goto L20;
        abcd.uH.c r0 = r5.DW;
        if (r0.j6 != r6) goto L15;
        if (r0.DW != r7) goto L15;
        abcd.CG r8 = r0.get();
        if (r8 == null) goto L12;
        DW(r0);
        return r8;
    L12:
        r5.j6();
        return null;
    L15:
        r5 = r5.j6;
        goto L2
    L20:
        return null;
    }

    private static abcd.uH.a j6(abcd.uH.a r2) {
    L2:
        if (r2 == null) goto L7;
        if (r2.FH == false) goto L7;
        r2.DW.enqueue();
        r2 = r2.j6;
    L7:
        if (r2 != null) goto L10;
        return null;
    L10:
        abcd.uH.a r0 = j6(r2.j6);
        if (r0 != r2.j6) goto L14;
        return r2;
    L14:
        return new abcd.uH.a(r0, r2.DW);
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
        abcd.uH r0 = new abcd.uH(r2);
        abcd.uH r1 = DW;
        if (r1 == null) goto L5;
        r1.v5();
    L5:
        DW = r0;
        FH = r2.v5();
        abcd.EG.j6(r2);
    }

    private int v5(abcd.aH r1, long r2) {
        return (j6(r1.v5, r2) >>> 1) % this.v5;
    }

    private void v5() {
        int r0 = 0;
    L4:
        if (r0 >= this.v5) goto L5;
    L7:
        abcd.uH.a r1 = this.VH.get(r0);
        abcd.uH.a r2 = r1;
    L8:
        if (r2 == null) goto L10;
        r2.j6();
        r2 = r2.j6;
        goto L8
    L10:
        if (this.VH.compareAndSet(r0, r1, null) == false) goto L7;
        r0 = r0 + 1;
        goto L4
    L5:
        FH();
    }
}
