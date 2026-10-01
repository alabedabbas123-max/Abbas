package io.fabric.sdk.android;

public class Fabric {
    static final java.lang.String ANSWERS_KIT_IDENTIFIER = "com.crashlytics.sdk.android:answers";
    static final java.lang.String CRASHLYTICS_KIT_IDENTIFIER = "com.crashlytics.sdk.android:crashlytics";
    static final boolean DEFAULT_DEBUGGABLE = false;
    static final io.fabric.sdk.android.m DEFAULT_LOGGER = null;
    static final java.lang.String ROOT_DIR = ".Fabric";
    public static final java.lang.String TAG = "Fabric";
    static volatile io.fabric.sdk.android.Fabric singleton;
    private java.lang.ref.WeakReference<android.app.Activity> activity;
    private io.fabric.sdk.android.ActivityLifecycleManager activityLifecycleManager;
    private final android.content.Context context;
    final boolean debuggable;
    private final java.util.concurrent.ExecutorService executorService;
    private final io.fabric.sdk.android.services.common.v idManager;
    private final io.fabric.sdk.android.h<io.fabric.sdk.android.Fabric> initializationCallback;
    private java.util.concurrent.atomic.AtomicBoolean initialized;
    private final io.fabric.sdk.android.h<?> kitInitializationCallback;
    private final java.util.Map<java.lang.Class<? extends io.fabric.sdk.android.Kit>, io.fabric.sdk.android.Kit> kits;
    final io.fabric.sdk.android.m logger;
    private final android.os.Handler mainHandler;

    public static class Builder {
        private io.fabric.sdk.android.Kit[] DW;
        private abcd.kz FH;
        private android.os.Handler Hw;
        private java.lang.String VH;
        private boolean Zo;
        private java.lang.String gn;
        private final android.content.Context j6;
        private io.fabric.sdk.android.h<io.fabric.sdk.android.Fabric> u7;
        private io.fabric.sdk.android.m v5;

        public Builder(android.content.Context r2) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r2 == null) { $pc0 = 7; continue $sw0; }
                        this.j6 = r2;
                        return;
                    }
                    case 7: {
                        throw new java.lang.IllegalArgumentException("Context must not be null.");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public io.fabric.sdk.android.Fabric.Builder j6(io.fabric.sdk.android.Kit... r12) {
            java.util.ArrayList r0 = null;
            int r1 = 0;
            int r3 = 0;
            boolean r4 = false;
            io.fabric.sdk.android.Kit r5 = null;
            java.lang.String r6 = null;
            byte r7 = 0;
            int r8 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (this.DW != null) { $pc1 = 29; continue $sw1; }
                        if (io.fabric.sdk.android.services.common.l.j6(this.j6).j6() == true) { $pc1 = 26; continue $sw1; }
                        r0 = new java.util.ArrayList();
                        r1 = r12.length;
                        r3 = 0;
                        r4 = false;
                        $pc1 = 7; continue $sw1;
                    }
                    case 7: {
                        if (r3 >= r1) { $pc1 = 25; continue $sw1; }
                        r5 = r12[r3];
                        r6 = r5.getIdentifier();
                        r7 = -1;
                        r8 = r6.hashCode();
                        if (r8 == 607220212) { $pc1 = 17; continue $sw1; }
                        if (r8 == 1830452504) { $pc1 = 14; continue $sw1; }
                        $pc1 = 19; continue $sw1;
                    }
                    case 19: {
                        if (r7 == 0) { $pc1 = 23; continue $sw1; }
                        if (r7 == 1) { $pc1 = 23; continue $sw1; }
                        if (r4 == true) { $pc1 = 24; continue $sw1; }
                        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
                        r4 = true;
                        $pc1 = 24; continue $sw1;
                    }
                    case 24: {
                        r3 = r3 + 1;
                        $pc1 = 23; continue $sw1;
                    }
                    case 23: {
                        r0.add(r5);
                        { $pc1 = 24; continue $sw1; }
                    }
                    case 14: {
                        if (r6.equals("com.crashlytics.sdk.android:crashlytics") == false) { $pc1 = 19; continue $sw1; }
                        r7 = 0;
                        { $pc1 = 19; continue $sw1; }
                    }
                    case 17: {
                        if (r6.equals("com.crashlytics.sdk.android:answers") == false) { $pc1 = 19; continue $sw1; }
                        r7 = 1;
                        { $pc1 = 19; continue $sw1; }
                    }
                    case 25: {
                        r12 = (io.fabric.sdk.android.Kit[]) r0.toArray(new io.fabric.sdk.android.Kit[0]);
                        $pc1 = 26; continue $sw1;
                    }
                    case 26: {
                        this.DW = r12;
                        return this;
                    }
                    case 29: {
                        throw new java.lang.IllegalStateException("Kits already set.");
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public io.fabric.sdk.android.Fabric j6() {
            io.fabric.sdk.android.Kit[] r0 = null;
            java.util.Map r1 = null;
            java.util.Map r3 = null;
            android.content.Context r2 = null;
            io.fabric.sdk.android.services.common.v r9 = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (this.FH != null) { $pc2 = 6; continue $sw2; }
                        this.FH = abcd.kz.j6();
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        if (this.Hw != null) { $pc2 = 9; continue $sw2; }
                        this.Hw = new android.os.Handler(android.os.Looper.getMainLooper());
                        $pc2 = 9; continue $sw2;
                    }
                    case 9: {
                        if (this.v5 != null) { $pc2 = 15; continue $sw2; }
                        if (this.Zo == false) { $pc2 = 13; continue $sw2; }
                        this.v5 = new io.fabric.sdk.android.b(3);
                        { $pc2 = 15; continue $sw2; }
                    }
                    case 13: {
                        this.v5 = new io.fabric.sdk.android.b();
                        $pc2 = 15; continue $sw2;
                    }
                    case 15: {
                        if (this.gn != null) { $pc2 = 18; continue $sw2; }
                        this.gn = this.j6.getPackageName();
                        $pc2 = 18; continue $sw2;
                    }
                    case 18: {
                        if (this.u7 != null) { $pc2 = 20; continue $sw2; }
                        this.u7 = io.fabric.sdk.android.h.j6;
                        $pc2 = 20; continue $sw2;
                    }
                    case 20: {
                        r0 = this.DW;
                        if (r0 != null) { $pc2 = 23; continue $sw2; }
                        r1 = new java.util.HashMap();
                        $pc2 = 24; continue $sw2;
                    }
                    case 24: {
                        r3 = r1;
                        r2 = this.j6.getApplicationContext();
                        r9 = new io.fabric.sdk.android.services.common.v(r2, this.gn, this.VH, r3.values());
                        return new io.fabric.sdk.android.Fabric(r2, r3, this.FH, this.Hw, this.v5, this.Zo, this.u7, r9, io.fabric.sdk.android.Fabric.access$100(this.j6));
                    }
                    case 23: {
                        r1 = io.fabric.sdk.android.Fabric.access$000(java.util.Arrays.asList(r0));
                        { $pc2 = 24; continue $sw2; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        DEFAULT_LOGGER = new io.fabric.sdk.android.b();
    }

    Fabric(android.content.Context r1, java.util.Map<java.lang.Class<? extends io.fabric.sdk.android.Kit>, io.fabric.sdk.android.Kit> r2, abcd.kz r3, android.os.Handler r4, io.fabric.sdk.android.m r5, boolean r6, io.fabric.sdk.android.h r7, io.fabric.sdk.android.services.common.v r8, android.app.Activity r9) {
        this.context = r1;
        this.kits = r2;
        this.executorService = r3;
        this.mainHandler = r4;
        this.logger = r5;
        this.debuggable = r6;
        this.initializationCallback = r7;
        this.initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.kitInitializationCallback = createKitInitializationCallback(r2.size());
        this.idManager = r8;
        setCurrentActivity(r9);
    }

    static java.util.Map access$000(java.util.Collection r0) {
        return getKitMap(r0);
    }

    static android.app.Activity access$100(android.content.Context r0) {
        return extractActivity(r0);
    }

    static java.util.concurrent.atomic.AtomicBoolean access$200(io.fabric.sdk.android.Fabric r0) {
        return r0.initialized;
    }

    static io.fabric.sdk.android.h access$300(io.fabric.sdk.android.Fabric r0) {
        return r0.initializationCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void addToKitMap(java.util.Map<java.lang.Class<? extends io.fabric.sdk.android.Kit>, io.fabric.sdk.android.Kit> r2, java.util.Collection<? extends io.fabric.sdk.android.Kit> r3) {
        java.util.Iterator<? extends io.fabric.sdk.android.Kit> r4 = null;
        java.lang.Object r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r4 = r3.iterator();
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc3 = 8; continue $sw3; }
                    r0 = (io.fabric.sdk.android.Kit) r4.next();
                    r2.put(r0.getClass(), r0);
                    if ((r0 instanceof io.fabric.sdk.android.k) == false) { $pc3 = 4; continue $sw3; }
                    addToKitMap(r2, ((io.fabric.sdk.android.k) r0).getKits());
                    { $pc3 = 4; continue $sw3; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static android.app.Activity extractActivity(android.content.Context r1) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if ((r1 instanceof android.app.Activity) == true) { $pc4 = 5; continue $sw4; }
                    return null;
                }
                case 5: {
                    return (android.app.Activity) r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static <T extends io.fabric.sdk.android.Kit> T getKit(java.lang.Class<T> r1) {
        return (T) singleton().kits.get(r1);
    }

    private static java.util.Map<java.lang.Class<? extends io.fabric.sdk.android.Kit>, io.fabric.sdk.android.Kit> getKitMap(java.util.Collection<? extends io.fabric.sdk.android.Kit> r2) {
        java.util.HashMap r0 = new java.util.HashMap(r2.size());
        addToKitMap(r0, r2);
        return r0;
    }

    public static io.fabric.sdk.android.m getLogger() {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (singleton != null) { $pc5 = 7; continue $sw5; }
                    return DEFAULT_LOGGER;
                }
                case 7: {
                    return singleton.logger;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void init() {
        this.activityLifecycleManager = new io.fabric.sdk.android.ActivityLifecycleManager(this.context);
        this.activityLifecycleManager.j6(new io.fabric.sdk.android.c(this));
        initializeKits(this.context);
    }

    public static boolean isDebuggable() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (singleton != null) { $pc6 = 7; continue $sw6; }
                    return false;
                }
                case 7: {
                    return singleton.debuggable;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean isInitialized() {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (singleton != null) { $pc7 = 5; continue $sw7; }
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (singleton.initialized.get() == false) { $pc7 = 7; continue $sw7; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void setFabric(io.fabric.sdk.android.Fabric r0) {
        singleton = r0;
        r0.init();
    }

    static io.fabric.sdk.android.Fabric singleton() {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (singleton == null) { $pc8 = 7; continue $sw8; }
                    return singleton;
                }
                case 7: {
                    throw new java.lang.IllegalStateException("Must Initialize Fabric before using singleton()");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static io.fabric.sdk.android.Fabric with(android.content.Context r2, io.fabric.sdk.android.Kit... r3) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (singleton != null) { $pc9 = 15; continue $sw9; }
                    monitor-enter(io.fabric.sdk.android.Fabric.class);
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    th = $ex9;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 7: {
                    if (singleton != null) { $pc9 = 9; continue $sw9; }
                    try {
                        setFabric(new io.fabric.sdk.android.Fabric.Builder(r2).j6(r3).j6());
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    try {
                        monitor-exit(io.fabric.sdk.android.Fabric.class);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    return singleton;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static io.fabric.sdk.android.Fabric with(io.fabric.sdk.android.Fabric r2) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (singleton != null) { $pc10 = 15; continue $sw10; }
                    monitor-enter(io.fabric.sdk.android.Fabric.class);
                    $pc10 = 11; continue $sw10;
                }
                case 11: {
                    th = $ex10;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 7: {
                    if (singleton != null) { $pc10 = 9; continue $sw10; }
                    try {
                        setFabric(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 11; continue $sw10;
                    }
                    $pc10 = 9; continue $sw10;
                }
                case 9: {
                    try {
                        monitor-exit(io.fabric.sdk.android.Fabric.class);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 11; continue $sw10;
                    }
                    $pc10 = 15; continue $sw10;
                }
                case 15: {
                    return singleton;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
    void addAnnotatedDependencies(java.util.Map<java.lang.Class<? extends io.fabric.sdk.android.Kit>, io.fabric.sdk.android.Kit> r8, io.fabric.sdk.android.Kit r9) {
        abcd.Interfacebz r0 = null;
        java.lang.Class<?>[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Class<?> r4 = null;
        java.util.Iterator<io.fabric.sdk.android.Kit> r5 = null;
        io.fabric.sdk.android.Kit r6 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = r9.dependsOnAnnotation;
                    if (r0 == null) { $pc11 = 20; continue $sw11; }
                    r1 = r0.value();
                    r2 = r1.length;
                    r3 = 0;
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    if (r3 >= r2) { $pc11 = 29; continue $sw11; }
                    r4 = r1[r3];
                    if (r4.isInterface() == false) { $pc11 = 15; continue $sw11; }
                    r5 = r8.values().iterator();
                    $pc11 = 10; continue $sw11;
                }
                case 10: {
                    if (r5.hasNext() == false) { $pc11 = 17; continue $sw11; }
                    r6 = r5.next();
                    if (r4.isAssignableFrom(r6.getClass()) == false) { $pc11 = 10; continue $sw11; }
                    r9.initializationTask.j6(r6.initializationTask);
                    $pc11 = 17; continue $sw11;
                }
                case 17: {
                    r3 = r3 + 1;
                    { $pc11 = 5; continue $sw11; }
                }
                case 15: {
                    if (r8.get(r4) == null) { $pc11 = 19; continue $sw11; }
                    r9.initializationTask.j6(r8.get(r4).initializationTask);
                    { $pc11 = 17; continue $sw11; }
                }
                case 19: {
                    throw new abcd.mz("Referenced Kit was null, does the kit exist?");
                }
                case 29: {
                    return;
                }
                case 20: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    io.fabric.sdk.android.h<?> createKitInitializationCallback(int r2) {
        return new io.fabric.sdk.android.d(this, r2);
    }

    public io.fabric.sdk.android.ActivityLifecycleManager getActivityLifecycleManager() {
        return this.activityLifecycleManager;
    }

    public java.lang.String getAppIdentifier() {
        return this.idManager.FH();
    }

    public java.lang.String getAppInstallIdentifier() {
        return this.idManager.Hw();
    }

    public android.app.Activity getCurrentActivity() {
        java.lang.ref.WeakReference<android.app.Activity> r0 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = this.activity;
                    if (r0 != null) { $pc12 = 5; continue $sw12; }
                    return null;
                }
                case 5: {
                    return r0.get();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.concurrent.ExecutorService getExecutorService() {
        return this.executorService;
    }

    public java.lang.String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    public java.util.Collection<io.fabric.sdk.android.Kit> getKits() {
        return this.kits.values();
    }

    java.util.concurrent.Future<java.util.Map<java.lang.String, io.fabric.sdk.android.l>> getKitsFinderFuture(android.content.Context r2) {
        io.fabric.sdk.android.f r0 = new io.fabric.sdk.android.f(r2.getPackageCodePath());
        return getExecutorService().submit(r0);
    }

    public android.os.Handler getMainHandler() {
        return this.mainHandler;
    }

    public java.lang.String getVersion() {
        return "1.4.8.32";
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
    void initializeKits(android.content.Context r8) {
        java.util.concurrent.Future<java.util.Map<java.lang.String, io.fabric.sdk.android.l>> r0 = null;
        java.util.Collection<io.fabric.sdk.android.Kit> r1 = null;
        io.fabric.sdk.android.n r2 = null;
        java.util.ArrayList r3 = null;
        java.util.Iterator r4 = null;
        java.lang.StringBuilder r9 = null;
        java.util.Iterator r5 = null;
        io.fabric.sdk.android.Kit r6 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = getKitsFinderFuture(r8);
                    r1 = getKits();
                    r2 = new io.fabric.sdk.android.n(r0, r1);
                    r3 = new java.util.ArrayList(r1);
                    java.util.Collections.sort(r3);
                    r2.injectParameters(r8, this, io.fabric.sdk.android.h.j6, this.idManager);
                    r4 = r3.iterator();
                    $pc13 = 4; continue $sw13;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc13 = 6; continue $sw13; }
                    ((io.fabric.sdk.android.Kit) r4.next()).injectParameters(r8, this, this.kitInitializationCallback, this.idManager);
                    { $pc13 = 4; continue $sw13; }
                }
                case 6: {
                    r2.initialize();
                    if (getLogger().j6("Fabric", 3) == false) { $pc13 = 9; continue $sw13; }
                    r9 = new java.lang.StringBuilder("Initializing ");
                    r9.append(getIdentifier());
                    r9.append(" [Version: ");
                    r9.append(getVersion());
                    r9.append("], with the following kits:\n");
                    $pc13 = 10; continue $sw13;
                }
                case 10: {
                    r5 = r3.iterator();
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    if (r5.hasNext() == false) { $pc13 = 16; continue $sw13; }
                    r6 = (io.fabric.sdk.android.Kit) r5.next();
                    r6.initializationTask.j6(r2.initializationTask);
                    addAnnotatedDependencies(this.kits, r6);
                    r6.initialize();
                    if (r9 == null) { $pc13 = 12; continue $sw13; }
                    r9.append(r6.getIdentifier());
                    r9.append(" [Version: ");
                    r9.append(r6.getVersion());
                    r9.append("]\n");
                    { $pc13 = 12; continue $sw13; }
                }
                case 16: {
                    if (r9 == null) { $pc13 = 25; continue $sw13; }
                    getLogger().Hw("Fabric", r9.toString());
                    return;
                }
                case 25: {
                    return;
                }
                case 9: {
                    r9 = null;
                    { $pc13 = 10; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public io.fabric.sdk.android.Fabric setCurrentActivity(android.app.Activity r2) {
        this.activity = new java.lang.ref.WeakReference(r2);
        return this;
    }
}
