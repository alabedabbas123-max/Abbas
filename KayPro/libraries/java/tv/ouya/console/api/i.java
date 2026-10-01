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

    public static final enum a extends java.lang.Enum<tv.ouya.console.api.i.a> {
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
            return (tv.ouya.console.api.i.a) java.lang.Enum.valueOf(tv.ouya.console.api.i.a.class, r1);
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
        j6();
        if (this.Zo == null) goto L5;
        r2.run();
        return;
    L5:
        this.VH.add(r2);
    }

    public tv.ouya.console.api.i.b DW() {
        if (this.tp != null) goto L18;
        if (Hw() == false) goto L16;
        android.content.Intent r0 = this.v5.registerReceiver(null, new android.content.IntentFilter("tv.ouya.DEVICE_INFO_ACTION"));
        if (r0 == null) goto L9;
        boolean r1 = r0.getBooleanExtra("SUPPORTED_DEVICE", false);
        java.lang.String r2 = r0.getStringExtra("DEVICE_NAME");
        java.lang.String r3 = r0.getStringExtra("DEVICE_ENUM");
        tv.ouya.console.api.i.a r4 = tv.ouya.console.api.i.a.FH;
        r4 = tv.ouya.console.api.i.a.valueOf(r3);     // Catch: java.lang.Exception -> L13
    L14:
        this.tp = new tv.ouya.console.api.i.b(r1, r2, r4);
    L13:
        android.util.Log.w("OUYAF", "Error looking up deviceEnum for: " + r3);
        goto L14
    L9:
        return new tv.ouya.console.api.i.b(false, "unknown", tv.ouya.console.api.i.a.FH);
    L16:
        throw new java.lang.RuntimeException("Must call OuyaFacade.init first");
    L18:
        return this.tp;
    }

    public boolean Hw() {
        if (this.v5 == null) goto L5;
        return true;
    L5:
        return false;
    }

    public void Zo() {
        android.content.Context r0 = this.v5;
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.Zo == null) goto L7;
        r0.unbindService(this);
        this.Zo = null;
        this.gn = false;
    L7:
        android.content.Intent r1 = new android.content.Intent("tv.ouya.ODK_SHUTDOWN");
        r1.putExtra("package_name", this.v5.getPackageName());
        this.v5.sendBroadcast(r1);
        this.v5 = null;
    }

    void j6() {
        if (this.v5 != null) goto L7;
        android.util.Log.e("OUYAF", "Dropping request because connect has been shut down");
        return;
    L7:
        if (this.gn == true) goto L10;
        android.util.Log.d("inAppPurchase", "Binding to IapService");
        android.content.Intent r0 = new android.content.Intent();
        r0.setClassName("tv.ouya", "tv.ouya.console.service.iap.IapService");
        this.v5.bindService(r0, this, 1);
        this.gn = true;
        return;
    }

    public void j6(android.content.Context r2, java.lang.String r3) {
        if (Hw() == false) goto L5;
        return;
    L5:
        this.v5 = r2.getApplicationContext();
        this.u7 = r3;
        android.content.Intent r4 = new android.content.Intent("tv.ouya.ODK_INITIALIZED");
        r4.putExtra("package_name", r2.getPackageName());
        this.v5.sendBroadcast(r4);
    }

    public void j6(tv.ouya.console.api.k<java.lang.String> r3) {
        j6(new tv.ouya.console.api.i.c(this, r3, null));
    }

    @Override
    public void onServiceConnected(android.content.ComponentName r2, android.os.IBinder r3) {
        android.util.Log.d("inAppPurchase", "Successfully bound to IapService");
        this.Zo = abcd.InterfacebQ.a.j6(r3);
    L4:
        if (this.VH.size() <= 0) goto L6;
        this.VH.remove(0).run();
        goto L4
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
