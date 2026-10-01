package abcd;

public abstract class Xy<Params, Progress, Result> {
    private static final int DW = 0;
    private static final int FH = 0;
    private static final java.util.concurrent.ThreadFactory Hw = null;
    public static final java.util.concurrent.Executor VH = null;
    public static final java.util.concurrent.Executor Zo = null;
    private static final abcd.Xy.b gn = null;
    private static final int j6 = 0;
    private static volatile java.util.concurrent.Executor u7;
    private static final java.util.concurrent.BlockingQueue<java.lang.Runnable> v5 = null;
    private final java.util.concurrent.FutureTask<Result> EQ;
    private final java.util.concurrent.atomic.AtomicBoolean J0;
    private final java.util.concurrent.atomic.AtomicBoolean J8;
    private final Xy.e<Params, Result> tp;
    private volatile abcd.Xy.d we;

    private static class a<Data> {
        final Data[] DW;
        final abcd.Xy j6;

        a(abcd.Xy r1, Data... r2) {
            this.j6 = r1;
            this.DW = r2;
        }
    }

    private static class b extends android.os.Handler {
        public b() {
            super(android.os.Looper.getMainLooper());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.$r8$lambda$3Jn-YhBaujEHu2U7RtYHYfrstds(FixTypesVisitor.java:0)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor$$ExternalSyntheticLambda8.apply(D8$$SyntheticClass:0)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override
        public void handleMessage(android.os.Message r3) {
            abcd.Xy.a r0 = null;
            int r4 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = (abcd.Xy.a) r3.obj;
                        r4 = r3.what;
                        if (r4 != 1) { $pc0 = 5; continue $sw0; }
                        abcd.Xy.FH(r0.j6, r0.DW[0]);
                        return;
                    }
                    case 5: {
                        if (r4 != 2) { $pc0 = 11; continue $sw0; }
                        r0.j6.DW(r0.DW);
                        return;
                    }
                    case 11: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static class c implements java.util.concurrent.Executor {
        java.lang.Runnable DW;
        final java.util.LinkedList<java.lang.Runnable> j6;

        private c() {
            this.j6 = new java.util.LinkedList();
        }

        c(abcd.Ty r1) {
            this();
        }

        @Override
        public synchronized void execute(java.lang.Runnable r3) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        monitor-enter(this);
                        try {
                            this.j6.offer(new abcd.Yy(this, r3));
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 8; continue $sw1;
                        }
                        if (this.DW != null) { $pc1 = 6; continue $sw1; }
                        try {
                            j6();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 8; continue $sw1;
                        }
                        $pc1 = 6; continue $sw1;
                    }
                    case 6: {
                        monitor-exit(this);
                        return;
                    }
                    case 8: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        protected synchronized void j6() {
            java.lang.Runnable r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        monitor-enter(this);
                        try {
                            r0 = this.j6.poll();
                            this.DW = r0;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 8; continue $sw2;
                        }
                        if (r0 == null) { $pc2 = 6; continue $sw2; }
                        try {
                            abcd.Xy.Zo.execute(this.DW);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 8; continue $sw2;
                        }
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        monitor-exit(this);
                        return;
                    }
                    case 8: {
                        th = $ex2;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public static final class d extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.Xy.d DW = null;
        public static final abcd.Xy.d FH = null;
        private static final abcd.Xy.d[] Hw = null;
        public static final abcd.Xy.d j6 = null;

        static {
            j6 = new abcd.Xy.d("PENDING", 0);
            DW = new abcd.Xy.d("RUNNING", 1);
            FH = new abcd.Xy.d("FINISHED", 2);
            Hw = new abcd.Xy.d[]{j6, DW, FH};
        }

        private d(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.Xy.d valueOf(java.lang.String r1) {
            return (abcd.Xy.d) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Xy.d.values(), r1);
        }

        public static abcd.Xy.d[] values() {
            return (abcd.Xy.d[]) Hw.clone();
        }
    }

    private static abstract class e<Params, Result> implements java.util.concurrent.Callable<Result> {
        Params[] j6;

        private e() {
        }

        e(abcd.Ty r1) {
            this();
        }
    }

    static {
        j6 = java.lang.Runtime.getRuntime().availableProcessors();
        int r0 = j6;
        DW = r0 + 1;
        FH = (r0 * 2) + 1;
        Hw = new abcd.Ty();
        v5 = new java.util.concurrent.LinkedBlockingQueue(128);
        Zo = new java.util.concurrent.ThreadPoolExecutor(DW, FH, 1, java.util.concurrent.TimeUnit.SECONDS, v5, Hw);
        VH = new abcd.Xy.c(null);
        gn = new abcd.Xy.b();
        u7 = VH;
    }

    public Xy() {
        this.we = abcd.Xy.d.j6;
        this.J0 = new java.util.concurrent.atomic.AtomicBoolean();
        this.J8 = new java.util.concurrent.atomic.AtomicBoolean();
        this.tp = new abcd.Uy(this);
        this.EQ = new abcd.Vy(this, this.tp);
    }

    static void DW(abcd.Xy r0, java.lang.Object r1) {
        r0.Zo(r1);
    }

    static void FH(abcd.Xy r0, java.lang.Object r1) {
        r0.Hw(r1);
    }

    private void Hw(Result r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (Zo() == false) { $pc3 = 5; continue $sw3; }
                    DW(r2);
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    this.we = abcd.Xy.d.FH;
                    return;
                }
                case 5: {
                    FH(r2);
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Zo(Result r2) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.J8.get() == true) { $pc4 = 6; continue $sw4; }
                    v5(r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.Object j6(abcd.Xy r0, java.lang.Object r1) {
        r0.v5(r1);
        return r1;
    }

    static java.util.concurrent.atomic.AtomicBoolean j6(abcd.Xy r0) {
        return r0.J8;
    }

    private Result v5(Result r6) {
        gn.obtainMessage(1, new abcd.Xy.a(this, new java.lang.Object[]{r6})).sendToTarget();
        return r6;
    }

    protected abstract void DW(Result r1);

    protected void DW(Progress... r1) {
    }

    public final boolean DW(boolean r3) {
        this.J0.set(true);
        return this.EQ.cancel(r3);
    }

    protected abstract void FH(Result r1);

    public final abcd.Xy.d Hw() {
        return this.we;
    }

    protected void VH() {
    }

    public final boolean Zo() {
        return this.J0.get();
    }

    public final Xy<Params, Progress, Result> j6(java.util.concurrent.Executor r3, Params... r4) {
        int r0 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.we == abcd.Xy.d.j6) { $pc5 = 13; continue $sw5; }
                    r0 = abcd.Wy.j6[this.we.ordinal()];
                    if (r0 == 1) { $pc5 = 12; continue $sw5; }
                    if (r0 != 2) { $pc5 = 13; continue $sw5; }
                    throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                case 12: {
                    throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
                }
                case 13: {
                    this.we = abcd.Xy.d.DW;
                    VH();
                    this.tp.j6 = r4;
                    r3.execute(this.EQ);
                    return this;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract Result j6(Params... r1);
}
