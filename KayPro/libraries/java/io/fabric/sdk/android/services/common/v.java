package io.fabric.sdk.android.services.common;

public class v {
    private static final java.lang.String DW = null;
    private static final java.util.regex.Pattern j6 = null;
    io.fabric.sdk.android.services.common.AdvertisingInfoProvider EQ;
    private final java.util.concurrent.locks.ReentrantLock FH;
    private final io.fabric.sdk.android.services.common.x Hw;
    boolean J0;
    io.fabric.sdk.android.services.common.u J8;
    private final android.content.Context VH;
    private final boolean Zo;
    private final java.lang.String gn;
    private final java.util.Collection<io.fabric.sdk.android.Kit> tp;
    private final java.lang.String u7;
    private final boolean v5;
    io.fabric.sdk.android.services.common.ClassB we;

    public static final enum a extends java.lang.Enum<io.fabric.sdk.android.services.common.v.a> {
        public static final io.fabric.sdk.android.services.common.v.a DW = null;
        public static final io.fabric.sdk.android.services.common.v.a FH = null;
        public static final io.fabric.sdk.android.services.common.v.a Hw = null;
        public static final io.fabric.sdk.android.services.common.v.a VH = null;
        public static final io.fabric.sdk.android.services.common.v.a Zo = null;
        private static final io.fabric.sdk.android.services.common.v.a[] gn = null;
        public static final io.fabric.sdk.android.services.common.v.a j6 = null;
        public static final io.fabric.sdk.android.services.common.v.a v5 = null;
        public final int u7;

        static {
            j6 = new io.fabric.sdk.android.services.common.v.a("WIFI_MAC_ADDRESS", 0, 1);
            DW = new io.fabric.sdk.android.services.common.v.a("BLUETOOTH_MAC_ADDRESS", 1, 2);
            FH = new io.fabric.sdk.android.services.common.v.a("FONT_TOKEN", 2, 53);
            Hw = new io.fabric.sdk.android.services.common.v.a("ANDROID_ID", 3, 100);
            v5 = new io.fabric.sdk.android.services.common.v.a("ANDROID_DEVICE_ID", 4, 101);
            Zo = new io.fabric.sdk.android.services.common.v.a("ANDROID_SERIAL", 5, 102);
            VH = new io.fabric.sdk.android.services.common.v.a("ANDROID_ADVERTISING_ID", 6, 103);
            gn = new io.fabric.sdk.android.services.common.v.a[]{j6, DW, FH, Hw, v5, Zo, VH};
        }

        private a(java.lang.String r1, int r2, int r3) {
            super(r1, r2);
            this.u7 = r3;
        }

        public static io.fabric.sdk.android.services.common.v.a valueOf(java.lang.String r1) {
            return (io.fabric.sdk.android.services.common.v.a) java.lang.Enum.valueOf(io.fabric.sdk.android.services.common.v.a.class, r1);
        }

        public static io.fabric.sdk.android.services.common.v.a[] values() {
            return (io.fabric.sdk.android.services.common.v.a[]) gn.clone();
        }
    }

    static {
        j6 = java.util.regex.Pattern.compile("[^\\p{Alnum}]");
        DW = java.util.regex.Pattern.quote("/");
    }

    public v(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.util.Collection<io.fabric.sdk.android.Kit> r6) {
        this.FH = new java.util.concurrent.locks.ReentrantLock();
        if (r3 == null) goto L18;
        if (r4 == null) goto L16;
        if (r6 == null) goto L14;
        this.VH = r3;
        this.gn = r4;
        this.u7 = r5;
        this.tp = r6;
        this.Hw = new io.fabric.sdk.android.services.common.x();
        this.EQ = new io.fabric.sdk.android.services.common.AdvertisingInfoProvider(r3);
        this.J8 = new io.fabric.sdk.android.services.common.u();
        this.v5 = io.fabric.sdk.android.services.common.i.j6(r3, "com.crashlytics.CollectDeviceIdentifiers", true);
        if (this.v5 == true) goto L9;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Device ID collection disabled for " + r3.getPackageName());
    L9:
        this.Zo = io.fabric.sdk.android.services.common.i.j6(r3, "com.crashlytics.CollectUserIdentifiers", true);
        if (this.Zo == true) goto L19;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "User information collection disabled for " + r3.getPackageName());
        return;
    L19:
        return;
    L14:
        throw new java.lang.IllegalArgumentException("kits must not be null");
    L16:
        throw new java.lang.IllegalArgumentException("appIdentifier must not be null");
    L18:
        throw new java.lang.IllegalArgumentException("appContext must not be null");
    }

    @android.annotation.SuppressLint({"CommitPrefEdits"})
    private java.lang.String DW(android.content.SharedPreferences r3) {
        this.FH.lock();
        java.lang.String r1 = r3.getString("crashlytics.installation.id", null);     // Catch: java.lang.Throwable -> L8
        if (r1 != null) goto L6;
        r1 = j6(java.util.UUID.randomUUID().toString());     // Catch: java.lang.Throwable -> L8
        r3.edit().putString("crashlytics.installation.id", r1).commit();     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.unlock();
        return r1;
    L8:
        th = move-exception;
        this.FH.unlock();
        throw th;
    }

    private java.lang.String DW(java.lang.String r3) {
        return r3.replaceAll(DW, "");
    }

    private java.lang.Boolean J0() {
        io.fabric.sdk.android.services.common.ClassB r0 = DW();
        if (r0 != null) goto L5;
        return null;
    L5:
        return java.lang.Boolean.valueOf(r0.DW);
    }

    private java.lang.String j6(java.lang.String r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        return j6.matcher(r2).replaceAll("").toLowerCase(java.util.Locale.US);
    }

    private void j6(android.content.SharedPreferences r2) {
        io.fabric.sdk.android.services.common.ClassB r0 = DW();
        if (r0 == null) goto L6;
        j6(r2, r0.j6);
        return;
    }

    @android.annotation.SuppressLint({"CommitPrefEdits"})
    private void j6(android.content.SharedPreferences r4, java.lang.String r5) {
        this.FH.lock();
    L16:
        th = move-exception;
        this.FH.unlock();
        throw th;
    L4:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L8;
        this.FH.unlock();
        return;
    L8:
        java.lang.String r1 = r4.getString("crashlytics.advertising.id", null);     // Catch: java.lang.Throwable -> L16
        if (android.text.TextUtils.isEmpty(r1) == false) goto L12;
        r4.edit().putString("crashlytics.advertising.id", r5).commit();     // Catch: java.lang.Throwable -> L16
    L14:
        this.FH.unlock();
        return;
    L12:
        if (r1.equals(r5) == true) goto L14;
        r4.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", r5).commit();     // Catch: java.lang.Throwable -> L16
        goto L14
    }

    private void j6(java.util.Map<io.fabric.sdk.android.services.common.v.a, java.lang.String> r1, io.fabric.sdk.android.services.common.v.a r2, java.lang.String r3) {
        if (r3 == null) goto L5;
        r1.put(r2, r3);
        return;
    }

    synchronized io.fabric.sdk.android.services.common.ClassB DW() {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.J0 == true) goto L6;
        this.we = this.EQ.j6();     // Catch: java.lang.Throwable -> L9
        this.J0 = true;     // Catch: java.lang.Throwable -> L9
    L6:
        io.fabric.sdk.android.services.common.ClassB r0 = this.we;     // Catch: java.lang.Throwable -> L9
        monitor-exit(this);
        return r0;
    }

    public java.lang.Boolean EQ() {
        if (we() == true) goto L7;
        return null;
    L7:
        return J0();
    }

    public java.lang.String FH() {
        return this.gn;
    }

    public java.lang.String Hw() {
        java.lang.String r0 = this.u7;
        if (r0 != null) goto L9;
        android.content.SharedPreferences r1 = io.fabric.sdk.android.services.common.i.u7(this.VH);
        j6(r1);
        java.lang.String r2 = r1.getString("crashlytics.installation.id", null);
        if (r2 != null) goto L8;
        return DW(r1);
    L8:
        return r2;
    L9:
        return r0;
    }

    public java.lang.String VH() {
        return java.lang.String.format(java.util.Locale.US, "%s/%s", new java.lang.Object[]{DW(android.os.Build.MANUFACTURER), DW(android.os.Build.MODEL)});
    }

    public java.lang.String Zo() {
        return this.Hw.j6(this.VH);
    }

    public java.lang.String gn() {
        return DW(android.os.Build.VERSION.INCREMENTAL);
    }

    public boolean j6() {
        return this.Zo;
    }

    public java.lang.String tp() {
        return u7() + "/" + gn();
    }

    public java.lang.String u7() {
        return DW(android.os.Build.VERSION.RELEASE);
    }

    public java.util.Map<io.fabric.sdk.android.services.common.v.a, java.lang.String> v5() {
        java.util.HashMap r0 = new java.util.HashMap();
        java.util.Iterator<io.fabric.sdk.android.Kit> r1 = this.tp.iterator();
    L4:
        if (r1.hasNext() == false) goto L12;
        java.lang.Object r2 = (io.fabric.sdk.android.Kit) r1.next();
        if ((r2 instanceof io.fabric.sdk.android.services.common.n) == false) goto L4;
        java.util.Iterator<java.util.Map.Entry<io.fabric.sdk.android.services.common.v.a, java.lang.String>> r3 = ((io.fabric.sdk.android.services.common.n) r2).Hw().entrySet().iterator();
    L9:
        if (r3.hasNext() == false) goto L4;
        java.util.Map.Entry<io.fabric.sdk.android.services.common.v.a, java.lang.String> r4 = r3.next();
        j6(r0, r4.getKey(), r4.getValue());
        goto L9
    L12:
        return java.util.Collections.unmodifiableMap(r0);
    }

    protected boolean we() {
        if (this.v5 == true) goto L5;
    L7:
        return false;
    L5:
        if (this.J8.v5(this.VH) == true) goto L7;
        return true;
    }
}
