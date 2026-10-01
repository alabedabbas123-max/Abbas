package abcd;

public final class ay {

    private static final class a implements abcd.ay.b {
        private final java.util.concurrent.CountDownLatch j6;

        private a() {
            this.j6 = new java.util.concurrent.CountDownLatch(1);
        }

        a(abcd.Runnablery r1) {
            this();
        }

        public final void DW() {
            this.j6.await();
        }

        @Override
        public final void j6() {
            this.j6.countDown();
        }

        @Override
        public final void j6(java.lang.Exception r1) {
            this.j6.countDown();
        }

        public final void j6(java.lang.Object r1) {
            this.j6.countDown();
        }

        public final boolean j6(long r2, java.util.concurrent.TimeUnit r4) {
            return this.j6.await(r2, r4);
        }
    }

    interface b extends abcd.Tx, abcd.Vx, Wx<java.lang.Object> {
    }

    private static <TResult> TResult DW(Yx<TResult> r1) {
        if (r1.v5() == false) goto L7;
        return (TResult) r1.DW();
    L7:
        if (r1.FH() == false) goto L11;
        throw new java.util.concurrent.CancellationException("Task is already canceled");
    L11:
        throw new java.util.concurrent.ExecutionException(r1.j6());
    }

    public static <TResult> Yx<TResult> j6(TResult r1) {
        abcd.qy r0 = new abcd.qy();
        r0.j6(r1);
        return r0;
    }

    public static <TResult> TResult j6(Yx<TResult> r2) {
        com.google.android.gms.common.internal.r.j6();
        com.google.android.gms.common.internal.r.j6(r2, "Task must not be null");
        if (r2.Hw() == true) goto L5;
        abcd.ay.a r0 = new abcd.ay.a(null);
        j6(r2, r0);
        r0.DW();
        return (TResult) DW(r2);
    L5:
        return (TResult) DW(r2);
    }

    public static <TResult> TResult j6(Yx<TResult> r2, long r3, java.util.concurrent.TimeUnit r5) {
        com.google.android.gms.common.internal.r.j6();
        com.google.android.gms.common.internal.r.j6(r2, "Task must not be null");
        com.google.android.gms.common.internal.r.j6(r5, "TimeUnit must not be null");
        if (r2.Hw() == true) goto L5;
        abcd.ay.a r0 = new abcd.ay.a(null);
        j6(r2, r0);
        if (r0.j6(r3, r5) == false) goto L11;
        return (TResult) DW(r2);
    L11:
        throw new java.util.concurrent.TimeoutException("Timed out waiting for Task");
    L5:
        return (TResult) DW(r2);
    }

    private static void j6(Yx<?> r1, abcd.ay.b r2) {
        r1.j6(abcd._x.DW, r2);
        r1.j6(abcd._x.DW, r2);
        r1.j6(abcd._x.DW, r2);
    }
}
