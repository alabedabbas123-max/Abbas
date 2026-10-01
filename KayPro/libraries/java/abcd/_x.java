package abcd;

public final class _x {
    static final java.util.concurrent.Executor DW = null;
    public static final java.util.concurrent.Executor j6 = null;

    private static final class a implements java.util.concurrent.Executor {
        private final android.os.Handler j6;

        public a() {
            this.j6 = new android.os.Handler(android.os.Looper.getMainLooper());
        }

        @Override
        public final void execute(java.lang.Runnable r2) {
            this.j6.post(r2);
        }
    }

    static {
        j6 = new abcd._x.a();
        DW = new abcd.Executorpy();
    }
}
