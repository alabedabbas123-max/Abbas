package abcd;

public abstract class AbstracteE implements abcd.LE {
    static final java.lang.Object DW = null;
    private static final java.util.concurrent.ScheduledThreadPoolExecutor j6 = null;
    private long FH;
    private java.util.concurrent.TimeUnit Hw;
    private abcd.AbstracteE.a v5;

    private static class a implements java.lang.Runnable {
        private final int DW;
        private volatile boolean FH;
        private java.util.concurrent.Future<?> Hw;
        private int VH;
        private int Zo;
        private final java.lang.String j6;
        private boolean v5;

        a(java.lang.String r1, int r2) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = true;
        }

        private void j6() {
            this.FH = false;
            this.Hw = abcd.AbstracteE.DW().schedule(this, 1, java.util.concurrent.TimeUnit.SECONDS);
        }

        void j6(long r2, java.util.concurrent.TimeUnit r4) {
            this.FH = false;
            this.Hw = abcd.AbstracteE.DW().schedule(this, r2, r4);
        }

        void j6(abcd.AbstracteE r5) {
            int r0 = 0;
            int r1 = 0;
            java.lang.String r3 = null;
            java.util.concurrent.Future<?> r6 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.v5 == false) { $pc0 = 8; continue $sw0; }
                        r0 = this.DW;
                        if (r0 != 0) { $pc0 = 7; continue $sw0; }
                        r5.DW(this.j6, this.Zo);
                        { $pc0 = 8; continue $sw0; }
                    }
                    case 7: {
                        r1 = this.Zo;
                        r3 = this.j6;
                        r5.j6(r3, r1, r0, (r1 * 100) / r0);
                        $pc0 = 8; continue $sw0;
                    }
                    case 8: {
                        r6 = this.Hw;
                        if (r6 == null) { $pc0 = 12; continue $sw0; }
                        r6.cancel(false);
                        return;
                    }
                    case 12: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        void j6(abcd.AbstracteE r5, int r6) {
            int r7 = 0;
            int r1 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        this.Zo += r6;
                        r7 = this.DW;
                        if (r7 == 0) { $pc1 = 5; continue $sw1; }
                        r1 = (this.Zo * 100) / r7;
                        if (this.FH == false) { $pc1 = 11; continue $sw1; }
                        r5.DW(this.j6, this.Zo, this.DW, r1);
                        this.v5 = true;
                        j6();
                        this.VH = r1;
                        return;
                    }
                    case 11: {
                        if (r1 == this.VH) { $pc1 = 17; continue $sw1; }
                        r5.DW(this.j6, this.Zo, this.DW, r1);
                        this.v5 = true;
                        this.VH = r1;
                        return;
                    }
                    case 17: {
                        return;
                    }
                    case 5: {
                        if (this.FH == false) { $pc1 = 14; continue $sw1; }
                        r5.FH(this.j6, this.Zo);
                        this.v5 = true;
                        j6();
                        return;
                    }
                    case 14: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void run() {
            this.FH = true;
        }
    }

    static {
        j6 = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new abcd.ThreadFactorycE());
        j6.setContinueExistingPeriodicTasksAfterShutdownPolicy(false);
        j6.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
        j6.prestartAllCoreThreads();
        j6.setThreadFactory(java.util.concurrent.Executors.defaultThreadFactory());
        DW = new abcd.dE();
    }

    public AbstracteE() {
        this.Hw = java.util.concurrent.TimeUnit.MILLISECONDS;
    }

    static java.util.concurrent.ScheduledThreadPoolExecutor DW() {
        return j6;
    }

    protected abstract void DW(java.lang.String r1, int r2);

    protected abstract void DW(java.lang.String r1, int r2, int r3, int r4);

    protected abstract void FH(java.lang.String r1, int r2);

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public void j6() {
        abcd.AbstracteE.a r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.v5;
                    if (r0 == null) { $pc2 = 6; continue $sw2; }
                    r0.j6(this);
                    this.v5 = null;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(long r1, java.util.concurrent.TimeUnit r3) {
        this.FH = r1;
        this.Hw = r3;
    }

    @Override
    public void j6(java.lang.String r4, int r5) {
        long r6 = 0L;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    j6();
                    this.v5 = new abcd.AbstracteE.a(r4, r5);
                    r6 = this.FH;
                    if (r6 == 0) { $pc3 = 6; continue $sw3; }
                    this.v5.j6(r6, this.Hw);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void j6(java.lang.String r1, int r2, int r3, int r4);

    @Override
    public void start(int r1) {
    }

    @Override
    public void update(int r2) {
        abcd.AbstracteE.a r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.v5;
                    if (r0 == null) { $pc4 = 6; continue $sw4; }
                    r0.j6(this, r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
