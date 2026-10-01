package tv.ouya.console.api;

public class i implements android.content.ServiceConnection {
    private static final java.lang.String[] DW = null;
    private static tv.ouya.console.api.i FH;
    private static boolean Hw;
    private static final java.lang.String[] j6 = null;
    private java.util.List<java.lang.Runnable> VH;
    private abcd.InterfacebQ Zo;
    private boolean gn;
    private tv.ouya.console.api.i.b tp;
    private java.lang.String u7;
    private android.content.Context v5;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final tv.ouya.console.api.i.a DW = null;
        public static final tv.ouya.console.api.i.a FH = null;
        private static final tv.ouya.console.api.i.a[] Hw = null;
        public static final tv.ouya.console.api.i.a j6 = null;

        static {
            j6 = new tv.ouya.console.api.i.a("OUYA", 0);
            DW = new tv.ouya.console.api.i.a("MOJO", 1);
            FH = new tv.ouya.console.api.i.a("UNKNOWN", 2);
            Hw = new tv.ouya.console.api.i.a[]{j6, DW, FH};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static tv.ouya.console.api.i.a valueOf(java.lang.String r1) {
            return (tv.ouya.console.api.i.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(tv.ouya.console.api.i.a.values(), r1);
        }

        public static tv.ouya.console.api.i.a[] values() {
            return (tv.ouya.console.api.i.a[]) Hw.clone();
        }
    }

    public static class b {
        private java.lang.String DW;
        private tv.ouya.console.api.i.a FH;
        private boolean j6;

        b(boolean r1, java.lang.String r2, tv.ouya.console.api.i.a r3) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
        }

        public boolean j6() {
            return this.j6;
        }
    }

    private class c extends tv.ouya.console.api.o {
        final tv.ouya.console.api.i FH;

        private c(tv.ouya.console.api.i r1, tv.ouya.console.api.k<java.lang.String> r2) {
            this.FH = r1;
            super(r2, "fetching receipts");
        }

        c(tv.ouya.console.api.i r1, tv.ouya.console.api.k r2, tv.ouya.console.api.h r3) {
            this(r1, r2);
        }

        @Override
        void j6() {
            tv.ouya.console.api.i.j6(this.FH).j6(tv.ouya.console.api.i.DW(this.FH), new abcd.BinderhQ(this.j6));
        }
    }

    static {
        j6 = new java.lang.String[]{"value"};
        DW = new java.lang.String[]{"property_name", "value"};
        FH = new tv.ouya.console.api.i();
        Hw = false;
    }

    i() {
        this.VH = new java.util.ArrayList();
        android.util.Log.v("OUYAF", "ODK version number: 62");
    }

    static java.lang.String DW(tv.ouya.console.api.i r0) {
        return r0.u7;
    }

    public static tv.ouya.console.api.i FH() {
        return FH;
    }

    static abcd.InterfacebQ j6(tv.ouya.console.api.i r0) {
        return r0.Zo;
    }

    private void j6(java.lang.Runnable r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    j6();
                    if (this.Zo == null) { $pc0 = 5; continue $sw0; }
                    r2.run();
                    return;
                }
                case 5: {
                    this.VH.add(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public tv.ouya.console.api.i.b DW() {
        android.content.Intent r0 = null;
        boolean r1 = false;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        tv.ouya.console.api.i.a r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.tp != null) { $pc1 = 18; continue $sw1; }
                    if (Hw() == false) { $pc1 = 16; continue $sw1; }
                    r0 = this.v5.registerReceiver(null, new android.content.IntentFilter("tv.ouya.DEVICE_INFO_ACTION"));
                    if (r0 == null) { $pc1 = 9; continue $sw1; }
                    r1 = r0.getBooleanExtra("SUPPORTED_DEVICE", false);
                    r2 = r0.getStringExtra("DEVICE_NAME");
                    r3 = r0.getStringExtra("DEVICE_ENUM");
                    r4 = tv.ouya.console.api.i.a.FH;
                    try {
                        r4 = tv.ouya.console.api.i.a.valueOf(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 13; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    this.tp = new tv.ouya.console.api.i.b(r1, r2, r4);
                    $pc1 = 9; continue $sw1;
                }
                case 13: {
                    android.util.Log.w("OUYAF", "Error looking up deviceEnum for: " + r3);
                    { $pc1 = 14; continue $sw1; }
                }
                case 9: {
                    return new tv.ouya.console.api.i.b(false, "unknown", tv.ouya.console.api.i.a.FH);
                }
                case 16: {
                    throw new java.lang.RuntimeException("Must call OuyaFacade.init first");
                }
                case 18: {
                    return this.tp;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Hw() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.v5 == null) { $pc2 = 5; continue $sw2; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Zo() {
        android.content.Context r0 = null;
        android.content.Intent r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.v5;
                    if (r0 != null) { $pc3 = 5; continue $sw3; }
                    return;
                }
                case 5: {
                    if (this.Zo == null) { $pc3 = 7; continue $sw3; }
                    r0.unbindService(this);
                    this.Zo = null;
                    this.gn = false;
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    r1 = new android.content.Intent("tv.ouya.ODK_SHUTDOWN");
                    r1.putExtra("package_name", this.v5.getPackageName());
                    this.v5.sendBroadcast(r1);
                    this.v5 = null;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6() {
        android.content.Intent r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.v5 != null) { $pc4 = 7; continue $sw4; }
                    android.util.Log.e("OUYAF", "Dropping request because connect has been shut down");
                    return;
                }
                case 7: {
                    if (this.gn == true) { $pc4 = 10; continue $sw4; }
                    android.util.Log.d("inAppPurchase", "Binding to IapService");
                    r0 = new android.content.Intent();
                    r0.setClassName("tv.ouya", "tv.ouya.console.service.iap.IapService");
                    this.v5.bindService(r0, this, 1);
                    this.gn = true;
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(android.content.Context r2, java.lang.String r3) {
        android.content.Intent r4 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (Hw() == false) { $pc5 = 5; continue $sw5; }
                    return;
                }
                case 5: {
                    this.v5 = r2.getApplicationContext();
                    this.u7 = r3;
                    r4 = new android.content.Intent("tv.ouya.ODK_INITIALIZED");
                    r4.putExtra("package_name", r2.getPackageName());
                    this.v5.sendBroadcast(r4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(tv.ouya.console.api.k<java.lang.String> r3) {
        j6(new tv.ouya.console.api.i.c(this, r3, null));
    }

    @Override
    public void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    android.util.Log.d("inAppPurchase", "Successfully bound to IapService");
                    this.Zo = abcd.InterfacebQ.a.j6(r3);
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (this.VH.size() <= 0) { $pc6 = 6; continue $sw6; }
                    this.VH.remove(0).run();
                    { $pc6 = 4; continue $sw6; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void onServiceDisconnected(android.content.ComponentName r1) {
        this.Zo = null;
        this.gn = false;
    }

    public boolean v5() {
        return DW().j6();
    }
}
