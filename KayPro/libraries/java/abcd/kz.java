package abcd;

public class kz extends java.util.concurrent.ThreadPoolExecutor {
    private static final int DW = 0;
    private static final int FH = 0;
    private static final int j6 = 0;

    protected static final class a implements java.util.concurrent.ThreadFactory {
        private final int j6;

        public a(int r1) {
            this.j6 = r1;
        }

        @Override
        public java.lang.Thread newThread(java.lang.Runnable r2) {
            java.lang.Thread r0 = new java.lang.Thread(r2);
            r0.setPriority(this.j6);
            r0.setName("Queue");
            return r0;
        }
    }

    static {
        j6 = java.lang.Runtime.getRuntime().availableProcessors();
        int r0 = j6;
        DW = r0 + 1;
        FH = (r0 * 2) + 1;
    }

    <T extends java.lang.Runnable & abcd._y & abcd.Interfacelz & abcd.Interfacehz> kz(int r1, int r2, long r3, java.util.concurrent.TimeUnit r5, az<T> r6, java.util.concurrent.ThreadFactory r7) {
        super(r1, r2, r3, r5, r6, r7);
        prestartAllCoreThreads();
    }

    public static abcd.kz j6() {
        return j6(DW, FH);
    }

    public static <T extends java.lang.Runnable & abcd._y & abcd.Interfacelz & abcd.Interfacehz> abcd.kz j6(int r9, int r10) {
        return new abcd.kz(r9, r10, 1, java.util.concurrent.TimeUnit.SECONDS, new abcd.az(), new abcd.kz.a(10));
    }

    @Override
    protected void afterExecute(java.lang.Runnable r3, java.lang.Throwable r4) {
        abcd.Interfacelz r0 = (abcd.Interfacelz) r3;
        r0.j6(true);
        r0.j6(r4);
        getQueue().j6();
        super.afterExecute(r3, r4);
    }

    @Override
    @android.annotation.TargetApi(9)
    public void execute(java.lang.Runnable r2) {
        if (abcd.jz.DW(r2) == false) goto L5;
        super.execute(r2);
        return;
    L5:
        super.execute(newTaskFor(r2, null));
    }

    @Override
    public abcd.az getQueue() {
        return (abcd.az) super.getQueue();
    }

    @Override
    public java.util.concurrent.BlockingQueue getQueue() {
        return getQueue();
    }

    @Override
    protected <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.lang.Runnable r2, T r3) {
        return new abcd.gz(r2, r3);
    }

    @Override
    protected <T> java.util.concurrent.RunnableFuture<T> newTaskFor(java.util.concurrent.Callable<T> r2) {
        return new abcd.gz(r2);
    }
}
