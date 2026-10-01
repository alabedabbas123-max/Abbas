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

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
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
            return (io.fabric.sdk.android.services.common.v.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(io.fabric.sdk.android.services.common.v.a.values(), r1);
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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.FH = new java.util.concurrent.locks.ReentrantLock();
                    if (r3 == null) { $pc0 = 18; continue $sw0; }
                    if (r4 == null) { $pc0 = 16; continue $sw0; }
                    if (r6 == null) { $pc0 = 14; continue $sw0; }
                    this.VH = r3;
                    this.gn = r4;
                    this.u7 = r5;
                    this.tp = r6;
                    this.Hw = new io.fabric.sdk.android.services.common.x();
                    this.EQ = new io.fabric.sdk.android.services.common.AdvertisingInfoProvider(r3);
                    this.J8 = new io.fabric.sdk.android.services.common.u();
                    this.v5 = io.fabric.sdk.android.services.common.i.j6(r3, "com.crashlytics.CollectDeviceIdentifiers", true);
                    if (this.v5 == true) { $pc0 = 9; continue $sw0; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Device ID collection disabled for " + r3.getPackageName());
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    this.Zo = io.fabric.sdk.android.services.common.i.j6(r3, "com.crashlytics.CollectUserIdentifiers", true);
                    if (this.Zo == true) { $pc0 = 19; continue $sw0; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "User information collection disabled for " + r3.getPackageName());
                    return;
                }
                case 19: {
                    return;
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("kits must not be null");
                }
                case 16: {
                    throw new java.lang.IllegalArgumentException("appIdentifier must not be null");
                }
                case 18: {
                    throw new java.lang.IllegalArgumentException("appContext must not be null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @android.annotation.SuppressLint({"CommitPrefEdits"})
    private java.lang.String DW(android.content.SharedPreferences r3) {
        java.lang.String r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.FH.lock();
                    try {
                        r1 = r3.getString("crashlytics.installation.id", null);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    if (r1 != null) { $pc1 = 6; continue $sw1; }
                    try {
                        r1 = j6(java.util.UUID.randomUUID().toString());
                        r3.edit().putString("crashlytics.installation.id", r1).commit();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    this.FH.unlock();
                    return r1;
                }
                case 8: {
                    th = $ex1;
                    this.FH.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String DW(java.lang.String r3) {
        return r3.replaceAll(DW, "");
    }

    private java.lang.Boolean J0() {
        io.fabric.sdk.android.services.common.ClassB r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = DW();
                    if (r0 != null) { $pc2 = 5; continue $sw2; }
                    return null;
                }
                case 5: {
                    return java.lang.Boolean.valueOf(r0.DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String j6(java.lang.String r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r2 != null) { $pc3 = 5; continue $sw3; }
                    return null;
                }
                case 5: {
                    return j6.matcher(r2).replaceAll("").toLowerCase(java.util.Locale.US);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(android.content.SharedPreferences r2) {
        io.fabric.sdk.android.services.common.ClassB r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = DW();
                    if (r0 == null) { $pc4 = 6; continue $sw4; }
                    j6(r2, r0.j6);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @android.annotation.SuppressLint({"CommitPrefEdits"})
    private void j6(android.content.SharedPreferences r4, java.lang.String r5) {
        java.lang.String r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    this.FH.lock();
                    $pc5 = 4; continue $sw5;
                }
                case 16: {
                    th = $ex5;
                    this.FH.unlock();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (android.text.TextUtils.isEmpty(r5) == false) { $pc5 = 8; continue $sw5; }
                    this.FH.unlock();
                    return;
                }
                case 8: {
                    try {
                        r1 = r4.getString("crashlytics.advertising.id", null);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 16; continue $sw5;
                    }
                    if (android.text.TextUtils.isEmpty(r1) == false) { $pc5 = 12; continue $sw5; }
                    try {
                        r4.edit().putString("crashlytics.advertising.id", r5).commit();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 16; continue $sw5;
                    }
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    this.FH.unlock();
                    return;
                }
                case 12: {
                    if (r1.equals(r5) == true) { $pc5 = 14; continue $sw5; }
                    try {
                        r4.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", r5).commit();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 16; continue $sw5;
                    }
                    { $pc5 = 14; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.util.Map<io.fabric.sdk.android.services.common.v.a, java.lang.String> r1, io.fabric.sdk.android.services.common.v.a r2, java.lang.String r3) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r3 == null) { $pc6 = 5; continue $sw6; }
                    r1.put(r2, r3);
                    return;
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    synchronized io.fabric.sdk.android.services.common.ClassB DW() {
        synchronized (this) {
            io.fabric.sdk.android.services.common.ClassB r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = -1;
            $sw7: while (true) {
                switch ($pc7) {
                    case -1: {
                        $pc7 = 4; continue $sw7;
                    }
                    case 9: {
                        th = $ex7;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (this.J0 == true) { $pc7 = 6; continue $sw7; }
                        try {
                            this.we = this.EQ.j6();
                            this.J0 = true;
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 9; continue $sw7;
                        }
                        $pc7 = 6; continue $sw7;
                    }
                    case 6: {
                        try {
                            r0 = this.we;
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 9; continue $sw7;
                        }
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public java.lang.Boolean EQ() {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (we() == true) { $pc8 = 7; continue $sw8; }
                    return null;
                }
                case 7: {
                    return J0();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String FH() {
        return this.gn;
    }

    public java.lang.String Hw() {
        java.lang.String r0 = null;
        android.content.SharedPreferences r1 = null;
        java.lang.String r2 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = this.u7;
                    if (r0 != null) { $pc9 = 9; continue $sw9; }
                    r1 = io.fabric.sdk.android.services.common.i.u7(this.VH);
                    j6(r1);
                    r2 = r1.getString("crashlytics.installation.id", null);
                    if (r2 != null) { $pc9 = 8; continue $sw9; }
                    return DW(r1);
                }
                case 8: {
                    return r2;
                }
                case 9: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.util.HashMap r0 = null;
        java.util.Iterator<io.fabric.sdk.android.Kit> r1 = null;
        java.lang.Object r2 = null;
        java.util.Iterator<java.util.Map.Entry<io.fabric.sdk.android.services.common.v.a, java.lang.String>> r3 = null;
        java.util.Map.Entry<io.fabric.sdk.android.services.common.v.a, java.lang.String> r4 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = new java.util.HashMap();
                    r1 = this.tp.iterator();
                    $pc10 = 4; continue $sw10;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc10 = 12; continue $sw10; }
                    r2 = (io.fabric.sdk.android.Kit) r1.next();
                    if ((r2 instanceof io.fabric.sdk.android.services.common.n) == false) { $pc10 = 4; continue $sw10; }
                    r3 = ((io.fabric.sdk.android.services.common.n) r2).Hw().entrySet().iterator();
                    $pc10 = 9; continue $sw10;
                }
                case 9: {
                    if (r3.hasNext() == false) { $pc10 = 4; continue $sw10; }
                    r4 = r3.next();
                    j6(r0, r4.getKey(), r4.getValue());
                    { $pc10 = 9; continue $sw10; }
                }
                case 12: {
                    return java.util.Collections.unmodifiableMap(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected boolean we() {
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (this.v5 == true) { $pc11 = 5; continue $sw11; }
                    $pc11 = 7; continue $sw11;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (this.J8.v5(this.VH) == true) { $pc11 = 7; continue $sw11; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
