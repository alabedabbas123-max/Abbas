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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1.v5() == false) { $pc0 = 7; continue $sw0; }
                    return (TResult) r1.DW();
                }
                case 7: {
                    if (r1.FH() == false) { $pc0 = 11; continue $sw0; }
                    throw new java.util.concurrent.CancellationException("Task is already canceled");
                }
                case 11: {
                    throw new java.util.concurrent.ExecutionException(r1.j6());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static <TResult> Yx<TResult> j6(TResult r1) {
        abcd.qy r0 = new abcd.qy();
        r0.j6(r1);
        return r0;
    }

    public static <TResult> TResult j6(Yx<TResult> r2) {
        abcd.ay.a r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    com.google.android.gms.common.internal.r.j6();
                    com.google.android.gms.common.internal.r.j6(r2, "Task must not be null");
                    if (r2.Hw() == true) { $pc1 = 5; continue $sw1; }
                    r0 = new abcd.ay.a(null);
                    j6(r2, r0);
                    r0.DW();
                    return (TResult) DW(r2);
                }
                case 5: {
                    return (TResult) DW(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static <TResult> TResult j6(Yx<TResult> r2, long r3, java.util.concurrent.TimeUnit r5) {
        abcd.ay.a r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    com.google.android.gms.common.internal.r.j6();
                    com.google.android.gms.common.internal.r.j6(r2, "Task must not be null");
                    com.google.android.gms.common.internal.r.j6(r5, "TimeUnit must not be null");
                    if (r2.Hw() == true) { $pc2 = 5; continue $sw2; }
                    r0 = new abcd.ay.a(null);
                    j6(r2, r0);
                    if (r0.j6(r3, r5) == false) { $pc2 = 11; continue $sw2; }
                    return (TResult) DW(r2);
                }
                case 11: {
                    throw new java.util.concurrent.TimeoutException("Timed out waiting for Task");
                }
                case 5: {
                    return (TResult) DW(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(Yx<?> r1, abcd.ay.b r2) {
        r1.j6(abcd._x.DW, r2);
        r1.j6(abcd._x.DW, r2);
        r1.j6(abcd._x.DW, r2);
    }
}
