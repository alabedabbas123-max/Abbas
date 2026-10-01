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
            abcd.Xy.a r0 = (abcd.Xy.a) r3.obj;
            int r4 = r3.what;
            if (r4 != 1) goto L5;
            abcd.Xy.FH(r0.j6, r0.DW[0]);
            return;
        L5:
            if (r4 != 2) goto L11;
            r0.j6.DW(r0.DW);
            return;
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
            monitor-enter(this);
            this.j6.offer(new abcd.Yy(this, r3));     // Catch: java.lang.Throwable -> L8
            if (this.DW != null) goto L6;
            j6();     // Catch: java.lang.Throwable -> L8
        L6:
            monitor-exit(this);
            return;
        L8:
            th = move-exception;
            throw th;
        }

        protected synchronized void j6() {
            monitor-enter(this);
            java.lang.Runnable r0 = this.j6.poll();     // Catch: java.lang.Throwable -> L8
            this.DW = r0;     // Catch: java.lang.Throwable -> L8
            if (r0 == null) goto L6;
            abcd.Xy.Zo.execute(this.DW);     // Catch: java.lang.Throwable -> L8
        L6:
            monitor-exit(this);
            return;
        L8:
            th = move-exception;
            throw th;
        }
    }

    public static final enum d extends java.lang.Enum<abcd.Xy.d> {
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
            return (abcd.Xy.d) java.lang.Enum.valueOf(abcd.Xy.d.class, r1);
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
        if (Zo() == false) goto L5;
        DW(r2);
    L6:
        this.we = abcd.Xy.d.FH;
        return;
    L5:
        FH(r2);
        goto L6
    }

    private void Zo(Result r2) {
        if (this.J8.get() == true) goto L6;
        v5(r2);
        return;
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
        if (this.we == abcd.Xy.d.j6) goto L13;
        int r0 = abcd.Wy.j6[this.we.ordinal()];
        if (r0 == 1) goto L12;
        if (r0 != 2) goto L13;
        throw new java.lang.IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    L12:
        throw new java.lang.IllegalStateException("Cannot execute task: the task is already running.");
    L13:
        this.we = abcd.Xy.d.DW;
        VH();
        this.tp.j6 = r4;
        r3.execute(this.EQ);
        return this;
    }

    protected abstract Result j6(Params... r1);
}
