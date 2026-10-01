package abcd;

final class Executoruy implements java.util.concurrent.Executor {
    static final java.util.concurrent.Executor j6 = null;

    static {
        j6 = new abcd.Executoruy();
    }

    private Executoruy() {
    }

    @Override
    public final void execute(java.lang.Runnable r1) {
        r1.run();
    }
}
