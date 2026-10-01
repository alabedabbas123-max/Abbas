package abcd;

final class Runnablenx implements java.lang.Runnable {
    private final int DW;
    private final java.lang.Runnable j6;

    public Runnablenx(java.lang.Runnable r1, int r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public final void run() {
        android.os.Process.setThreadPriority(this.DW);
        this.j6.run();
    }
}
