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
            if (r2 == null) goto L7;
            this.j6 = r2;
            return;
        L7:
            throw new java.lang.IllegalArgumentException("Context must not be null.");
        }

        public io.fabric.sdk.android.Fabric.Builder j6(io.fabric.sdk.android.Kit... r12) {
            if (this.DW != null) goto L29;
            if (io.fabric.sdk.android.services.common.l.j6(this.j6).j6() == true) goto L26;
            java.util.ArrayList r0 = new java.util.ArrayList();
            int r1 = r12.length;
            int r3 = 0;
            boolean r4 = false;
        L7:
            if (r3 >= r1) goto L25;
            io.fabric.sdk.android.Kit r5 = r12[r3];
            java.lang.String r6 = r5.getIdentifier();
            byte r7 = -1;
            int r8 = r6.hashCode();
            if (r8 == 607220212) goto L17;
            if (r8 == 1830452504) goto L14;
        L19:
            if (r7 == 0) goto L23;
            if (r7 == 1) goto L23;
            if (r4 == true) goto L24;
            io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
            r4 = true;
        L24:
            r3 = r3 + 1;
        L23:
            r0.add(r5);
            goto L24
        L14:
            if (r6.equals("com.crashlytics.sdk.android:crashlytics") == false) goto L19;
            r7 = 0;
            goto L19
        L17:
            if (r6.equals("com.crashlytics.sdk.android:answers") == false) goto L19;
            r7 = 1;
            goto L19
        L25:
            r12 = (io.fabric.sdk.android.Kit[]) r0.toArray(new io.fabric.sdk.android.Kit[0]);
        L26:
            this.DW = r12;
            return this;
        L29:
            throw new java.lang.IllegalStateException("Kits already set.");
        }

        public io.fabric.sdk.android.Fabric j6() {
            if (this.FH != null) goto L6;
            this.FH = abcd.kz.j6();
        L6:
            if (this.Hw != null) goto L9;
            this.Hw = new android.os.Handler(android.os.Looper.getMainLooper());
        L9:
            if (this.v5 != null) goto L15;
            if (this.Zo == false) goto L13;
            this.v5 = new io.fabric.sdk.android.b(3);
            goto L15
        L13:
            this.v5 = new io.fabric.sdk.android.b();
        L15:
            if (this.gn != null) goto L18;
            this.gn = this.j6.getPackageName();
        L18:
            if (this.u7 != null) goto L20;
            this.u7 = io.fabric.sdk.android.h.j6;
        L20:
            io.fabric.sdk.android.Kit[] r0 = this.DW;
            if (r0 != null) goto L23;
            java.util.Map r1 = new java.util.HashMap();
        L24:
            java.util.Map r3 = r1;
            android.content.Context r2 = this.j6.getApplicationContext();
            io.fabric.sdk.android.services.common.v r9 = new io.fabric.sdk.android.services.common.v(r2, this.gn, this.VH, r3.values());
            return new io.fabric.sdk.android.Fabric(r2, r3, this.FH, this.Hw, this.v5, this.Zo, this.u7, r9, io.fabric.sdk.android.Fabric.access$100(this.j6));
        L23:
            r1 = io.fabric.sdk.android.Fabric.access$000(java.util.Arrays.asList(r0));
            goto L24
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
        java.util.Iterator<? extends io.fabric.sdk.android.Kit> r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L8;
        java.lang.Object r0 = (io.fabric.sdk.android.Kit) r4.next();
        r2.put(r0.getClass(), r0);
        if ((r0 instanceof io.fabric.sdk.android.k) == false) goto L4;
        addToKitMap(r2, ((io.fabric.sdk.android.k) r0).getKits());
        goto L4
    }

    private static android.app.Activity extractActivity(android.content.Context r1) {
        if ((r1 instanceof android.app.Activity) == true) goto L5;
        return null;
    L5:
        return (android.app.Activity) r1;
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
        if (singleton != null) goto L7;
        return DEFAULT_LOGGER;
    L7:
        return singleton.logger;
    }

    private void init() {
        this.activityLifecycleManager = new io.fabric.sdk.android.ActivityLifecycleManager(this.context);
        this.activityLifecycleManager.j6(new io.fabric.sdk.android.c(this));
        initializeKits(this.context);
    }

    public static boolean isDebuggable() {
        if (singleton != null) goto L7;
        return false;
    L7:
        return singleton.debuggable;
    }

    public static boolean isInitialized() {
        if (singleton != null) goto L5;
    L7:
        return false;
    L5:
        if (singleton.initialized.get() == false) goto L7;
        return true;
    }

    private static void setFabric(io.fabric.sdk.android.Fabric r0) {
        singleton = r0;
        r0.init();
    }

    static io.fabric.sdk.android.Fabric singleton() {
        if (singleton == null) goto L7;
        return singleton;
    L7:
        throw new java.lang.IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    public static io.fabric.sdk.android.Fabric with(android.content.Context r2, io.fabric.sdk.android.Kit... r3) {
        if (singleton != null) goto L15;
        monitor-enter(io.fabric.sdk.android.Fabric.class);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (singleton != null) goto L9;
        setFabric(new io.fabric.sdk.android.Fabric.Builder(r2).j6(r3).j6());     // Catch: java.lang.Throwable -> L11
    L9:
        monitor-exit(io.fabric.sdk.android.Fabric.class);     // Catch: java.lang.Throwable -> L11
    L15:
        return singleton;
    }

    public static io.fabric.sdk.android.Fabric with(io.fabric.sdk.android.Fabric r2) {
        if (singleton != null) goto L15;
        monitor-enter(io.fabric.sdk.android.Fabric.class);
    L11:
        th = move-exception;
        throw th;
    L7:
        if (singleton != null) goto L9;
        setFabric(r2);     // Catch: java.lang.Throwable -> L11
    L9:
        monitor-exit(io.fabric.sdk.android.Fabric.class);     // Catch: java.lang.Throwable -> L11
    L15:
        return singleton;
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
        abcd.Interfacebz r0 = r9.dependsOnAnnotation;
        if (r0 == null) goto L20;
        java.lang.Class<?>[] r1 = r0.value();
        int r2 = r1.length;
        int r3 = 0;
    L5:
        if (r3 >= r2) goto L29;
        java.lang.Class<?> r4 = r1[r3];
        if (r4.isInterface() == false) goto L15;
        java.util.Iterator<io.fabric.sdk.android.Kit> r5 = r8.values().iterator();
    L10:
        if (r5.hasNext() == false) goto L17;
        io.fabric.sdk.android.Kit r6 = r5.next();
        if (r4.isAssignableFrom(r6.getClass()) == false) goto L10;
        r9.initializationTask.j6(r6.initializationTask);
    L17:
        r3 = r3 + 1;
        goto L5
    L15:
        if (r8.get(r4) == null) goto L19;
        r9.initializationTask.j6(r8.get(r4).initializationTask);
        goto L17
    L19:
        throw new abcd.mz("Referenced Kit was null, does the kit exist?");
    L29:
        return;
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
        java.lang.ref.WeakReference<android.app.Activity> r0 = this.activity;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.get();
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
        java.util.concurrent.Future<java.util.Map<java.lang.String, io.fabric.sdk.android.l>> r0 = getKitsFinderFuture(r8);
        java.util.Collection<io.fabric.sdk.android.Kit> r1 = getKits();
        io.fabric.sdk.android.n r2 = new io.fabric.sdk.android.n(r0, r1);
        java.util.ArrayList r3 = new java.util.ArrayList(r1);
        java.util.Collections.sort(r3);
        r2.injectParameters(r8, this, io.fabric.sdk.android.h.j6, this.idManager);
        java.util.Iterator r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        ((io.fabric.sdk.android.Kit) r4.next()).injectParameters(r8, this, this.kitInitializationCallback, this.idManager);
        goto L4
    L6:
        r2.initialize();
        if (getLogger().j6("Fabric", 3) == false) goto L9;
        java.lang.StringBuilder r9 = new java.lang.StringBuilder("Initializing ");
        r9.append(getIdentifier());
        r9.append(" [Version: ");
        r9.append(getVersion());
        r9.append("], with the following kits:\n");
    L10:
        java.util.Iterator r5 = r3.iterator();
    L12:
        if (r5.hasNext() == false) goto L16;
        io.fabric.sdk.android.Kit r6 = (io.fabric.sdk.android.Kit) r5.next();
        r6.initializationTask.j6(r2.initializationTask);
        addAnnotatedDependencies(this.kits, r6);
        r6.initialize();
        if (r9 == null) goto L12;
        r9.append(r6.getIdentifier());
        r9.append(" [Version: ");
        r9.append(r6.getVersion());
        r9.append("]\n");
        goto L12
    L16:
        if (r9 == null) goto L25;
        getLogger().Hw("Fabric", r9.toString());
        return;
    L25:
        return;
    L9:
        r9 = null;
        goto L10
    }

    public io.fabric.sdk.android.Fabric setCurrentActivity(android.app.Activity r2) {
        this.activity = new java.lang.ref.WeakReference(r2);
        return this;
    }
}
