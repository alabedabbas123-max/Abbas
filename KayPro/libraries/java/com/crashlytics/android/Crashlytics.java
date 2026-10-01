package com.crashlytics.android;

public class Crashlytics extends io.fabric.sdk.android.Kit<java.lang.Void> implements io.fabric.sdk.android.k {
    public static final java.lang.String TAG = "Crashlytics";
    public final com.crashlytics.android.answers.C1918b answers;
    public final abcd.Bw beta;
    public final com.crashlytics.android.core.ca core;
    public final java.util.Collection<? extends io.fabric.sdk.android.Kit> kits;

    public Crashlytics() {
        this(new com.crashlytics.android.answers.C1918b(), new abcd.Bw(), new com.crashlytics.android.core.ca());
    }

    Crashlytics(com.crashlytics.android.answers.C1918b r3, abcd.Bw r4, com.crashlytics.android.core.ca r5) {
        this.answers = r3;
        this.beta = r4;
        this.core = r5;
        this.kits = java.util.Collections.unmodifiableCollection(java.util.Arrays.asList(new io.fabric.sdk.android.Kit[]{r3, r4, r5}));
    }

    private static void checkInitialized() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (getInstance() == null) { $pc0 = 6; continue $sw0; }
                    return;
                }
                case 6: {
                    throw new java.lang.IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static com.crashlytics.android.Crashlytics getInstance() {
        return (com.crashlytics.android.Crashlytics) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.Crashlytics.class);
    }

    public static com.crashlytics.android.core.Da getPinningInfoProvider() {
        checkInitialized();
        return getInstance().core.getPinningInfoProvider();
    }

    private static boolean isCrashlyticsCollectionEnabled() {
        checkInitialized();
        return io.fabric.sdk.android.services.common.l.j6(getInstance().getContext()).j6();
    }

    public static void log(int r1, java.lang.String r2, java.lang.String r3) {
        checkInitialized();
        getInstance().core.log(r1, r2, r3);
    }

    public static void log(java.lang.String r1) {
        checkInitialized();
        getInstance().core.log(r1);
    }

    public static void logException(java.lang.Throwable r1) {
        checkInitialized();
        getInstance().core.logException(r1);
    }

    public static void setBool(java.lang.String r1, boolean r2) {
        checkInitialized();
        getInstance().core.setBool(r1, r2);
    }

    private static void setCrashlyticsCollectionEnabled(boolean r1) {
        checkInitialized();
        io.fabric.sdk.android.services.common.l.j6(getInstance().getContext()).j6(r1);
    }

    public static void setDouble(java.lang.String r1, double r2) {
        checkInitialized();
        getInstance().core.setDouble(r1, r2);
    }

    public static void setFloat(java.lang.String r1, float r2) {
        checkInitialized();
        getInstance().core.setFloat(r1, r2);
    }

    public static void setInt(java.lang.String r1, int r2) {
        checkInitialized();
        getInstance().core.setInt(r1, r2);
    }

    public static void setLong(java.lang.String r1, long r2) {
        checkInitialized();
        getInstance().core.setLong(r1, r2);
    }

    @java.lang.Deprecated
    public static void setPinningInfoProvider(com.crashlytics.android.core.Da r2) {
        io.fabric.sdk.android.Fabric.getLogger().j6("Crashlytics", "Use of Crashlytics.setPinningInfoProvider is deprecated");
    }

    public static void setString(java.lang.String r1, java.lang.String r2) {
        checkInitialized();
        getInstance().core.setString(r1, r2);
    }

    public static void setUserEmail(java.lang.String r1) {
        checkInitialized();
        getInstance().core.setUserEmail(r1);
    }

    public static void setUserIdentifier(java.lang.String r1) {
        checkInitialized();
        getInstance().core.setUserIdentifier(r1);
    }

    public static void setUserName(java.lang.String r1) {
        checkInitialized();
        getInstance().core.setUserName(r1);
    }

    public void crash() {
        this.core.crash();
    }

    @Override
    protected java.lang.Void doInBackground() {
        return doInBackground2();
    }

    @Override
    protected java.lang.Void doInBackground2() {
        return null;
    }

    @java.lang.Deprecated
    public boolean getDebugMode() {
        io.fabric.sdk.android.Fabric.getLogger().j6("Crashlytics", "Use of Crashlytics.getDebugMode is deprecated.");
        getFabric();
        return io.fabric.sdk.android.Fabric.isDebuggable();
    }

    @Override
    public java.lang.String getIdentifier() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    @Override
    public java.util.Collection<? extends io.fabric.sdk.android.Kit> getKits() {
        return this.kits;
    }

    @Override
    public java.lang.String getVersion() {
        return "2.10.0.33";
    }

    @java.lang.Deprecated
    public void setDebugMode(boolean r3) {
        io.fabric.sdk.android.Fabric.getLogger().j6("Crashlytics", "Use of Crashlytics.setDebugMode is deprecated.");
    }

    @java.lang.Deprecated
    public synchronized void setListener(com.crashlytics.android.core.Interfaceea r2) {
        synchronized (this) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        try {
                            this.core.setListener(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 6; continue $sw1;
                        }
                        return;
                    }
                    case 6: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public boolean verifyPinning(java.net.URL r2) {
        return this.core.verifyPinning(r2);
    }
}
