package abcd;

public class ThreadFactorymx implements java.util.concurrent.ThreadFactory {
    private final int DW;
    private final java.util.concurrent.ThreadFactory FH;
    private final java.lang.String j6;

    public ThreadFactorymx(java.lang.String r2) {
        this(r2, 0);
    }

    private ThreadFactorymx(java.lang.String r1, int r2) {
        this.FH = java.util.concurrent.Executors.defaultThreadFactory();
        com.google.android.gms.common.internal.r.j6(r1, "Name must not be null");
        this.j6 = r1;
        this.DW = 0;
    }

    @Override
    public java.lang.Thread newThread(java.lang.Runnable r4) {
        java.lang.Thread r5 = this.FH.newThread(new abcd.Runnablenx(r4, 0));
        r5.setName(this.j6);
        return r5;
    }
}
