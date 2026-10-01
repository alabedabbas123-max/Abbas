package abcd;

@abcd.Interfacexu
public abstract class AbstractOi {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 6274737380717667505L)
    private com.aide.licensing.IAideLicensingService FH;

    @abcd.Interfaceru(field = 278290876105144799L)
    private android.content.ServiceConnection Hw;

    @abcd.Interfaceru(field = 861711742328130144L)
    private java.lang.String VH;

    @abcd.Interfaceru(field = -5317556928652143645L)
    private abcd.AbstractOi.a Zo;

    @abcd.Interfaceru(field = -1195671941431952425L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = -404762652007184016L)
    private java.lang.String tp;

    @abcd.Interfaceru(field = 742411422137571605L)
    private int u7;

    @abcd.Interfaceru(field = 800758648115464284L)
    private boolean v5;

    @abcd.Interfacexu
    private class a extends com.aide.licensing.g.a {

        @abcd.Interfacetu
        private static boolean FH;

        @abcd.Interfaceuu
        private static boolean Hw;

        @abcd.Interfacevu
        final abcd.AbstractOi v5;

        static {
            abcd.wu.j6(abcd.AbstractOi.a.class, 31530143936738400L, 31530143936738400L);
        }

        @abcd.Interfacesu(method = 76885377396235581L)
        private a(abcd.AbstractOi r6) {
        L8:
            th = move-exception;
            if (Hw == false) goto L12;
            abcd.wu.j6(th, -2260724432237922420L, null, r6);
        L12:
            throw th;
        L4:
            if (FH == false) goto L6;
            abcd.wu.j6(-2260724432237922420L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.v5 = r6;     // Catch: java.lang.Throwable -> L8
        }

        a(abcd.AbstractOi r8, abcd.ServiceConnectionKi r9) {
        L7:
            th = move-exception;
            if (Hw == false) goto L11;
            abcd.wu.j6(th, 3045516327804306288L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (FH == false) goto L5;
            abcd.wu.j6(3045516327804306288L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }

        @Override
        @abcd.Interfacesu(method = -79683348119109457L)
        public void DW(java.lang.String r8, java.lang.String r9) {
        L11:
            th = move-exception;
            if (Hw == false) goto L15;
            abcd.wu.j6(th, -2708104841865264099L, this, r8, r9);
        L15:
            throw th;
        L3:
            if (FH == false) goto L5;
            abcd.wu.j6(-2708104841865264099L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
        L5:
            abcd.AbstractOi.j6(this.v5, "licenseVerified: " + r8);     // Catch: java.lang.Throwable -> L11
            if (android.os.Binder.getCallingUid() == android.os.Process.myUid()) goto L9;
            abcd.AbstractOi.DW(this.v5, "UID mismatch - my uid: " + android.os.Process.myUid() + " calling uid: " + android.os.Binder.getCallingUid());     // Catch: java.lang.Throwable -> L11
            return;
        L9:
            com.aide.ui.U.j6(new abcd.RunnableNi(this, r8, r9));     // Catch: java.lang.Throwable -> L11
        }

        @Override
        @abcd.Interfacesu(method = -2243428915497216240L)
        public void XX() {
        L12:
            th = move-exception;
            if (Hw == false) goto L16;
            abcd.wu.j6(th, -4562683260330864240L, this);
        L16:
            throw th;
        L4:
            if (FH == false) goto L6;
            abcd.wu.j6(-4562683260330864240L, this);     // Catch: java.lang.Throwable -> L12
        L6:
            abcd.AbstractOi.j6(this.v5, "licenseNotVerified");     // Catch: java.lang.Throwable -> L12
            if (android.os.Binder.getCallingUid() == android.os.Process.myUid()) goto L10;
            abcd.AbstractOi.DW(this.v5, "UID mismatch - my uid: " + android.os.Process.myUid() + " calling uid: " + android.os.Binder.getCallingUid());     // Catch: java.lang.Throwable -> L12
            return;
        L10:
            com.aide.ui.U.j6(new abcd.RunnableMi(this));     // Catch: java.lang.Throwable -> L12
        }
    }

    static {
        abcd.wu.j6(abcd.AbstractOi.class, -6228992669085397497L, -6228992669085397497L);
    }

    public AbstractOi(java.lang.String r10, java.lang.String r11, int r12, java.lang.String r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -3038348709593117004L, null, r10, r11, new java.lang.Integer(r12), r13);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3038348709593117004L, null, r10, r11, new java.lang.Integer(r12), r13);     // Catch: java.lang.Throwable -> L7
    L5:
        this.Zo = new abcd.AbstractOi.a(this, null);     // Catch: java.lang.Throwable -> L7
        this.VH = r10;     // Catch: java.lang.Throwable -> L7
        this.gn = r11;     // Catch: java.lang.Throwable -> L7
        this.u7 = r12;     // Catch: java.lang.Throwable -> L7
        this.tp = r13;     // Catch: java.lang.Throwable -> L7
    }

    static void DW(abcd.AbstractOi r0, java.lang.String r1) {
        r0.FH(r1);
    }

    @abcd.Interfacesu(method = -1370846427655774193L)
    private void DW(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5382733115908416264L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5382733115908416264L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.ue.j6("(" + this.VH + ") " + r5);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 6340873389908543052L)
    private void FH(java.lang.String r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2168766339546846501L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2168766339546846501L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.ue.DW("(" + this.VH + ") " + r5);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 4602333303917591165L)
    private void VH() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 7356759073356652992L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L18;
        abcd.wu.j6(7356759073356652992L, this);     // Catch: java.lang.Throwable -> L11
    L18:
        DW("Requesting license check");     // Catch: android.os.RemoteException -> L8 java.lang.Throwable -> L11
        this.FH.j6(this.Zo);     // Catch: android.os.RemoteException -> L8 java.lang.Throwable -> L11
    L20:
        return;
    L8:
        e = move-exception;
        j6(e);     // Catch: java.lang.Throwable -> L11
    }

    @abcd.Interfacesu(method = -2420763878479367811L)
    private void Zo() {
    L19:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, 7596241288596834744L, this);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(7596241288596834744L, this);     // Catch: java.lang.Throwable -> L19
    L7:
        if (this.FH == null) goto L10;
        VH();     // Catch: java.lang.Throwable -> L19
        return;
    L10:
        if (this.v5 == true) goto L17;
        this.Hw = new abcd.ServiceConnectionKi(this);     // Catch: java.lang.Throwable -> L19
        DW("Binding to " + com.aide.licensing.IAideLicensingService.class.getName());     // Catch: java.lang.Throwable -> L19
        boolean r2 = false;
        android.content.Intent r3 = new android.content.Intent(this.tp);     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L19
        r3.setPackage(this.VH);     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L19
        r2 = com.aide.ui.U.Zo().bindService(r3, this.Hw, 1);     // Catch: java.lang.Exception -> L24 java.lang.Throwable -> L19
    L14:
        if (r2 == false) goto L16;
        this.v5 = r2;     // Catch: java.lang.Throwable -> L19
        return;
    L16:
        DW("Licensing service could not be bound");     // Catch: java.lang.Throwable -> L19
        return;
    L17:
        DW("Licensing service bind already pending");     // Catch: java.lang.Throwable -> L19
    }

    static com.aide.licensing.IAideLicensingService j6(abcd.AbstractOi r0, com.aide.licensing.IAideLicensingService r1) {
        r0.FH = r1;
        return r1;
    }

    static void j6(abcd.AbstractOi r0) {
        r0.VH();
    }

    static void j6(abcd.AbstractOi r0, java.lang.String r1) {
        r0.DW(r1);
    }

    static void j6(abcd.AbstractOi r0, java.lang.String r1, java.lang.String r2) {
        r0.j6(r1, r2);
    }

    @abcd.Interfacesu(method = -2846317221657453600L)
    private void j6(java.lang.Exception r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -6818064566062512009L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6818064566062512009L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.ue.j6("(" + this.VH + ")", r5);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -5998873921622435375L)
    private void j6(java.lang.String r11, java.lang.String r12) {
    L22:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, -5057723731334384124L, this, r11, r12);
    L26:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5057723731334384124L, this, r11, r12);     // Catch: java.lang.Throwable -> L22
    L5:
        com.aide.licensing.f.a r0 = com.aide.licensing.f.j6(com.aide.ui.U.Zo(), -1, -1, -1, this.VH, r11, r12, this.gn);     // Catch: java.lang.Throwable -> L22
        int r1 = abcd.Li.j6[r0.ordinal()];     // Catch: java.lang.Throwable -> L22
        if (r1 != 1) goto L8;
    L20:
        j6(com.aide.licensing.f.j6(r11, r12, this.gn).EQ);     // Catch: java.lang.Throwable -> L22
        return;
    L8:
        if (r1 == 2) goto L20;
        if (r1 != 3) goto L12;
        j6("OVER_GRACE_PERIOD");     // Catch: java.lang.Throwable -> L22
        return;
    L12:
        if (r1 != 4) goto L14;
        j6("NOT_LICENSED");     // Catch: java.lang.Throwable -> L22
        return;
    L14:
        if (r1 != 5) goto L17;
        j6("TEMPORARY_ERROR");     // Catch: java.lang.Throwable -> L22
        return;
    L17:
        throw new java.lang.RuntimeException("Unknown LicenseVerificationResult " + r0);     // Catch: java.lang.Throwable -> L22
    }

    static boolean j6(abcd.AbstractOi r0, boolean r1) {
        r0.v5 = r1;
        return r1;
    }

    public void DW() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1939618777909265128L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(1939618777909265128L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    public boolean FH() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 6360085930485499135L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6360085930485499135L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (com.aide.ui.U.Zo().getPackageManager().checkSignatures(this.VH, "com.aide.ui") != 0) goto L9;
        return true;
    L9:
        return false;
    }

    protected abstract void Hw();

    public void j6() {
    L23:
        th = move-exception;
        if (DW == false) goto L27;
        abcd.wu.j6(th, -170208189781830628L, this);
    L27:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-170208189781830628L, this);     // Catch: java.lang.Throwable -> L23
    L7:
        if (com.aide.ui.U.j6.equals("com.aide.phonegap") == false) goto L9;
        return;
    L9:
        android.content.pm.PackageManager r2 = com.aide.ui.U.Zo().getPackageManager();     // Catch: java.lang.Throwable -> L23
        boolean r3 = FH();     // Catch: java.lang.Throwable -> L23
        boolean r4 = false;
        if (r3 == true) goto L28;
    L16:
        if (r3 == false) goto L19;
        if (r4 == false) goto L19;
        Zo();     // Catch: java.lang.Throwable -> L23
        return;
    L19:
        if (r3 == false) goto L32;
        if (r4 == true) goto L33;
        Hw();     // Catch: java.lang.Throwable -> L23
        return;
    L33:
        return;
    L32:
        return;
    L28:
        if (r2.getPackageInfo(this.VH, 0).versionCode < this.u7) goto L16;
        r4 = true;
        goto L16
    }

    protected abstract void j6(long r1);

    protected abstract void j6(java.lang.String r1);

    public void v5() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2677966163372558652L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2677966163372558652L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.FH == null) goto L17;
        DW("Unbinding license service");     // Catch: java.lang.Throwable -> L10
        com.aide.ui.U.Zo().unbindService(this.Hw);     // Catch: java.lang.Throwable -> L10
        this.Hw = null;     // Catch: java.lang.Throwable -> L10
        this.v5 = false;     // Catch: java.lang.Throwable -> L10
        return;
    }
}
