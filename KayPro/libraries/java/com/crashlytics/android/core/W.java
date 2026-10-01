package com.crashlytics.android.core;

class W {
    static final java.io.FilenameFilter DW = null;
    static final java.io.FileFilter FH = null;
    static final java.util.Comparator<java.io.File> Hw = null;
    private static final java.util.Map<java.lang.String, java.lang.String> VH = null;
    private static final java.util.regex.Pattern Zo = null;
    private static final java.lang.String[] gn = null;
    static final java.io.FilenameFilter j6 = null;
    static final java.util.Comparator<java.io.File> v5 = null;
    private final com.crashlytics.android.core.r EQ;
    private final io.fabric.sdk.android.services.common.v J0;
    private final com.crashlytics.android.core.Ea J8;
    private final com.crashlytics.android.core.La.b Mr;
    private final com.crashlytics.android.core.ClassA QX;
    private final com.crashlytics.android.core.DevicePowerStateListener U2;
    private final abcd.Oz Ws;
    private final com.crashlytics.android.core.W.g XL;
    private final com.crashlytics.android.core.Qa a8;
    private final com.crashlytics.android.core.ua aM;
    private final com.crashlytics.android.answers.u er;
    private final com.crashlytics.android.core.La.c j3;
    private final java.lang.String lg;
    private final com.crashlytics.android.core.Interfaceb rN;
    private final com.crashlytics.android.core.ca tp;
    private final java.util.concurrent.atomic.AtomicInteger u7;
    private final abcd.Jz we;
    private com.crashlytics.android.core.ia yS;

    private static class a implements java.io.FilenameFilter {
        private a() {
        }

        a(com.crashlytics.android.core.D r1) {
            this();
        }

        @Override
        public boolean accept(java.io.File r2, java.lang.String r3) {
            if (com.crashlytics.android.core.W.DW.accept(r2, r3) == false) goto L5;
        L7:
            return false;
        L5:
            if (com.crashlytics.android.core.W.j6().matcher(r3).matches() == false) goto L7;
            return true;
        }
    }

    private interface b {
        void j6(com.crashlytics.android.core.ClassH r1);
    }

    private static final class c implements com.crashlytics.android.core.ia.b {
        private c() {
        }

        c(com.crashlytics.android.core.D r1) {
            this();
        }

        @Override
        public abcd.mA j6() {
            return abcd.C0895jA.DW().j6();
        }
    }

    static class d implements java.io.FilenameFilter {
        private final java.lang.String j6;

        public d(java.lang.String r1) {
            this.j6 = r1;
        }

        @Override
        public boolean accept(java.io.File r1, java.lang.String r2) {
            if (r2.contains(this.j6) == true) goto L5;
        L7:
            return false;
        L5:
            if (r2.endsWith(".cls_temp") == true) goto L7;
            return true;
        }
    }

    private interface e {
        void j6(java.io.FileOutputStream r1);
    }

    static class f implements java.io.FilenameFilter {
        f() {
        }

        @Override
        public boolean accept(java.io.File r2, java.lang.String r3) {
            if (com.crashlytics.android.core.ClassG.j6.accept(r2, r3) == false) goto L5;
        L8:
            return true;
        L5:
            if (r3.contains("SessionMissingBinaryImages") == true) goto L8;
            return false;
        }
    }

    private static final class g implements com.crashlytics.android.core.ua.a {
        private final abcd.Oz j6;

        public g(abcd.Oz r1) {
            this.j6 = r1;
        }

        @Override
        public java.io.File j6() {
            java.io.File r0 = new java.io.File(this.j6.j6(), "log-files");
            if (r0.exists() == true) goto L5;
            r0.mkdirs();
        L5:
            return r0;
        }
    }

    private static final class h implements com.crashlytics.android.core.La.d {
        private final com.crashlytics.android.core.Ea DW;
        private final abcd.gA FH;
        private final io.fabric.sdk.android.Kit j6;

        public h(io.fabric.sdk.android.Kit r1, com.crashlytics.android.core.Ea r2, abcd.gA r3) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
        }

        static com.crashlytics.android.core.Ea j6(com.crashlytics.android.core.W.h r0) {
            return r0.DW;
        }

        @Override
        public boolean j6() {
            android.app.Activity r0 = this.j6.getFabric().getCurrentActivity();
            if (r0 != null) goto L5;
            return true;
        L5:
            if (r0.isFinishing() == true) goto L11;
            com.crashlytics.android.core.X r1 = new com.crashlytics.android.core.X(this);
            com.crashlytics.android.core.ClassN r2 = com.crashlytics.android.core.ClassN.j6(r0, this.FH, r1);
            r0.runOnUiThread(new com.crashlytics.android.core.Y(this, r2));
            io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Waiting for user opt-in.");
            r2.j6();
            return r2.DW();
        L11:
            return true;
        }
    }

    private final class i implements com.crashlytics.android.core.La.c {
        final com.crashlytics.android.core.W j6;

        private i(com.crashlytics.android.core.W r1) {
            this.j6 = r1;
        }

        i(com.crashlytics.android.core.W r1, com.crashlytics.android.core.D r2) {
            this(r1);
        }

        @Override
        public java.io.File[] DW() {
            return this.j6.v5().listFiles();
        }

        @Override
        public java.io.File[] FH() {
            return this.j6.gn();
        }

        @Override
        public java.io.File[] j6() {
            return this.j6.u7();
        }
    }

    private final class j implements com.crashlytics.android.core.La.b {
        final com.crashlytics.android.core.W j6;

        private j(com.crashlytics.android.core.W r1) {
            this.j6 = r1;
        }

        j(com.crashlytics.android.core.W r1, com.crashlytics.android.core.D r2) {
            this(r1);
        }

        @Override
        public boolean j6() {
            return this.j6.VH();
        }
    }

    private static final class k implements java.lang.Runnable {
        private final com.crashlytics.android.core.Ka DW;
        private final com.crashlytics.android.core.La FH;
        private final android.content.Context j6;

        public k(android.content.Context r1, com.crashlytics.android.core.Ka r2, com.crashlytics.android.core.La r3) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
        }

        @Override
        public void run() {
            if (io.fabric.sdk.android.services.common.i.DW(this.j6) == true) goto L5;
            return;
        L5:
            io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Attempting to send crash report at time of crash...");
            this.FH.j6(this.DW);
        }
    }

    static class l implements java.io.FilenameFilter {
        private final java.lang.String j6;

        public l(java.lang.String r1) {
            this.j6 = r1;
        }

        @Override
        public boolean accept(java.io.File r2, java.lang.String r3) {
            if (r3.equals(this.j6 + ".cls") == false) goto L6;
            return false;
        L6:
            if (r3.contains(this.j6) == true) goto L8;
            return false;
        L8:
            if (r3.endsWith(".cls_temp") == true) goto L12;
            return true;
        L12:
            return false;
        }
    }

    static {
        j6 = new com.crashlytics.android.core.D("BeginSession");
        DW = new com.crashlytics.android.core.N();
        FH = new com.crashlytics.android.core.O();
        Hw = new com.crashlytics.android.core.P();
        v5 = new com.crashlytics.android.core.Q();
        Zo = java.util.regex.Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
        VH = java.util.Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
        gn = new java.lang.String[]{"SessionUser", "SessionApp", "SessionOS", "SessionDevice"};
    }

    W(com.crashlytics.android.core.ca r3, com.crashlytics.android.core.r r4, abcd.Jz r5, io.fabric.sdk.android.services.common.v r6, com.crashlytics.android.core.Ea r7, abcd.Oz r8, com.crashlytics.android.core.ClassA r9, com.crashlytics.android.core.Sa r10, com.crashlytics.android.core.Interfaceb r11, com.crashlytics.android.answers.u r12) {
        this.u7 = new java.util.concurrent.atomic.AtomicInteger(0);
        this.tp = r3;
        this.EQ = r4;
        this.we = r5;
        this.J0 = r6;
        this.J8 = r7;
        this.Ws = r8;
        this.QX = r9;
        this.lg = r10.j6();
        this.rN = r11;
        this.er = r12;
        android.content.Context r13 = r3.getContext();
        this.XL = new com.crashlytics.android.core.W.g(r8);
        this.aM = new com.crashlytics.android.core.ua(r13, this.XL);
        this.j3 = new com.crashlytics.android.core.W.i(this, null);
        this.Mr = new com.crashlytics.android.core.W.j(this, null);
        this.U2 = new com.crashlytics.android.core.DevicePowerStateListener(r13);
        this.a8 = new com.crashlytics.android.core.ya(1024, new com.crashlytics.android.core.Qa[]{new com.crashlytics.android.core.Ja(10)});
    }

    private com.crashlytics.android.core.Ta DW(java.lang.String r4) {
        if (VH() == false) goto L6;
        return new com.crashlytics.android.core.Ta(this.tp.aM(), this.tp.j3(), this.tp.Ws());
    L6:
        return new com.crashlytics.android.core.xa(Hw()).FH(r4);
    }

    static java.lang.String DW(com.crashlytics.android.core.W r0) {
        return r0.Ws();
    }

    private void DW(int r5) {
        java.util.HashSet r0 = new java.util.HashSet();
        java.io.File[] r1 = XL();
        int r6 = java.lang.Math.min(r5, r1.length);
        int r2 = 0;
    L3:
        if (r2 >= r6) goto L5;
        r0.add(j6(r1[r2]));
        r2 = r2 + 1;
        goto L3
    L5:
        this.aM.j6(r0);
        j6(j6(new com.crashlytics.android.core.W.a(null)), r0);
    }

    private void DW(abcd.mA r8) {
        if (r8 != null) goto L5;
        io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
        return;
    L5:
        android.content.Context r0 = this.tp.getContext();
        abcd.Wz r9 = r8.j6;
        com.crashlytics.android.core.Interfaceka r10 = j6(r9.Hw, r9.v5);
        com.crashlytics.android.core.La r1 = new com.crashlytics.android.core.La(this.QX.j6, r10, this.j3, this.Mr);
        java.io.File[] r11 = gn();
        int r2 = r11.length;
        int r3 = 0;
    L6:
        if (r3 >= r2) goto L8;
        com.crashlytics.android.core.Oa r5 = new com.crashlytics.android.core.Oa(r11[r3], VH);
        this.EQ.j6(new com.crashlytics.android.core.W.k(r0, r5, r1));
        r3 = r3 + 1;
        goto L6
    }

    static void DW(com.crashlytics.android.core.W r0, abcd.mA r1) {
        r0.DW(r1);
    }

    static void DW(com.crashlytics.android.core.W r0, java.util.Date r1, java.lang.Thread r2, java.lang.Throwable r3) {
        r0.DW(r1, r2, r3);
    }

    private void DW(java.util.Date r15, java.lang.Thread r16, java.lang.Throwable r17) {
        com.crashlytics.android.core.ClassH r4 = null;
        java.lang.String r0 = Ws();     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        if (r0 != null) goto L8;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", null);     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        io.fabric.sdk.android.services.common.i.j6(null, "Failed to flush to session begin file.");
        io.fabric.sdk.android.services.common.i.j6(null, "Failed to close fatal exception file output stream.");
        return;
    L8:
        FH(r0, r17.getClass().getName());     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        com.crashlytics.android.core.ClassG r5 = new com.crashlytics.android.core.ClassG(Hw(), r0 + "SessionCrash");     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        r4 = com.crashlytics.android.core.ClassH.j6(r5);     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L20
        j6(r4, r15, r16, r17, "crash", true);     // Catch: java.lang.Exception -> L11 java.lang.Throwable -> L20
    L18:
        io.fabric.sdk.android.services.common.i.j6(r4, "Failed to flush to session begin file.");
        io.fabric.sdk.android.services.common.i.j6(r5, "Failed to close fatal exception file output stream.");
        return;
    L11:
        e = e;
    L17:
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "An error occurred in the fatal exception logger", e);     // Catch: java.lang.Throwable -> L20
    L20:
        th = th;
    L21:
        io.fabric.sdk.android.services.common.i.j6(r4, "Failed to flush to session begin file.");
        io.fabric.sdk.android.services.common.i.j6(r5, "Failed to close fatal exception file output stream.");
        throw th;
    L15:
        e = e;
        r5 = null;
    L13:
        th = th;
        r5 = null;
        goto L21
    }

    private void DW(byte[] r2, java.io.File r3) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (r2.length <= 0) goto L8;
        j6(r2, r3);
        return;
    }

    private byte[] DW(java.lang.String r4, java.lang.String r5) {
        return com.crashlytics.android.core.Ba.FH(new java.io.File(Hw(), r4 + r5));
    }

    private java.io.File[] DW(java.io.File r1) {
        return DW(r1.listFiles());
    }

    private java.io.File[] DW(java.io.File[] r1) {
        if (r1 == null) goto L4;
        return r1;
    L4:
        return new java.io.File[0];
    }

    static java.lang.String FH(com.crashlytics.android.core.W r0) {
        return r0.QX();
    }

    private void FH(java.io.File r5) {
        if (r5.isDirectory() == false) goto L7;
        java.io.File[] r0 = r5.listFiles();
        int r1 = r0.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L7;
        FH(r0[r2]);
        r2 = r2 + 1;
    L7:
        r5.delete();
    }

    private static void FH(java.lang.String r2, java.lang.String r3) {
        com.crashlytics.android.answers.C1918b r0 = (com.crashlytics.android.answers.C1918b) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.answers.C1918b.class);
        if (r0 != null) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Answers is not available");
        return;
    L6:
        r0.j6(new io.fabric.sdk.android.services.common.j.a(r2, r3));
    }

    private boolean FH(abcd.mA r2) {
        if (r2 != null) goto L6;
        return false;
    L6:
        if (r2.Hw.j6 == true) goto L8;
        return false;
    L8:
        if (this.J8.j6() == true) goto L12;
        return true;
    L12:
        return false;
    }

    private java.io.File[] FH(java.lang.String r2) {
        return j6(new com.crashlytics.android.core.W.l(r2));
    }

    static com.crashlytics.android.core.ClassA Hw(com.crashlytics.android.core.W r0) {
        return r0.QX;
    }

    private void Hw(java.lang.String r14) {
        java.lang.String r0 = this.J0.FH();
        com.crashlytics.android.core.ClassA r1 = this.QX;
        java.lang.String r8 = r1.v5;
        java.lang.String r9 = r1.Zo;
        java.lang.String r10 = this.J0.Hw();
        int r11 = io.fabric.sdk.android.services.common.m.j6(this.QX.FH).getId();
        j6(r14, "SessionApp", new com.crashlytics.android.core.C(this, r0, r8, r9, r10, r11));
        j6(r14, "SessionApp.json", new com.crashlytics.android.core.F(this, r0, r8, r9, r10, r11));
    }

    private static void Hw(java.lang.String r2, java.lang.String r3) {
        com.crashlytics.android.answers.C1918b r0 = (com.crashlytics.android.answers.C1918b) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.answers.C1918b.class);
        if (r0 != null) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Answers is not available");
        return;
    L6:
        r0.j6(new io.fabric.sdk.android.services.common.j.b(r2, r3));
    }

    private void J0() {
        java.util.Date r0 = new java.util.Date();
        java.lang.String r1 = new com.crashlytics.android.core.ClassE(this.J0).toString();
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Opening a new session with ID " + r1);
        j6(r1, r0);
        Hw(r1);
        Zo(r1);
        v5(r1);
        this.aM.j6(r1);
    }

    private boolean J8() {
        java.lang.Class.forName("com.google.firebase.crash.FirebaseCrash");     // Catch: java.lang.ClassNotFoundException -> L6
        return true;
    L6:
        return false;
    }

    private java.lang.String QX() {
        java.io.File[] r0 = XL();
        if (r0.length > 1) goto L7;
        return null;
    L7:
        return j6(r0[1]);
    }

    static void VH(com.crashlytics.android.core.W r0) {
        r0.J0();
    }

    private void VH(java.lang.String r3) {
        j6(r3, "SessionUser", new com.crashlytics.android.core.M(this, DW(r3)));
    }

    private java.lang.String Ws() {
        java.io.File[] r0 = XL();
        if (r0.length > 0) goto L7;
        return null;
    L7:
        return j6(r0[0]);
    }

    private java.io.File[] XL() {
        java.io.File[] r0 = tp();
        java.util.Arrays.sort(r0, Hw);
        return r0;
    }

    static com.crashlytics.android.core.ca Zo(com.crashlytics.android.core.W r0) {
        return r0.tp;
    }

    private void Zo(java.lang.String r4) {
        boolean r0 = io.fabric.sdk.android.services.common.i.J0(this.tp.getContext());
        j6(r4, "SessionOS", new com.crashlytics.android.core.G(this, r0));
        j6(r4, "SessionOS.json", new com.crashlytics.android.core.I(this, r0));
    }

    private void aM() {
        java.io.File r0 = v5();
        if (r0.exists() == true) goto L5;
        return;
    L5:
        java.io.File[] r1 = j6(r0, new com.crashlytics.android.core.W.f());
        java.util.Arrays.sort(r1, java.util.Collections.reverseOrder());
        java.util.HashSet r2 = new java.util.HashSet();
        int r3 = 0;
    L7:
        if (r3 >= r1.length) goto L11;
        if (r2.size() >= 4) goto L11;
        r2.add(j6(r1[r3]));
        r3 = r3 + 1;
    L11:
        j6(DW(r0), r2);
    }

    private com.crashlytics.android.core.Interfaceka j6(java.lang.String r5, java.lang.String r6) {
        java.lang.String r0 = io.fabric.sdk.android.services.common.i.DW(this.tp.getContext(), "com.crashlytics.ApiEndpoint");
        return new com.crashlytics.android.core.ClassJ(new com.crashlytics.android.core.na(this.tp, r0, r5, this.we), new com.crashlytics.android.core.Aa(this.tp, r0, r6, this.we));
    }

    static com.crashlytics.android.core.ua j6(com.crashlytics.android.core.W r0) {
        return r0.aM;
    }

    static java.lang.String j6(java.io.File r2) {
        return r2.getName().substring(0, 35);
    }

    static java.util.regex.Pattern j6() {
        return Zo;
    }

    private void j6(long r4) {
        if (J8() == false) goto L7;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
        return;
    L7:
        if (this.er == null) goto L9;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Logging Crashlytics event to Firebase");
        android.os.Bundle r0 = new android.os.Bundle();
        r0.putInt("_r", 1);
        r0.putInt("fatal", 1);
        r0.putLong("timestamp", r4);
        this.er.j6("clx", "_ae", r0);
        return;
    L9:
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void j6(abcd.hA r4, boolean r5) {
        DW((r5 ? 1 : 0) + 8);
        java.io.File[] r0 = XL();
        if (r0.length > r5) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "No open sessions to be closed.");
        return;
    L6:
        VH(j6(r0[r5 ? 1 : 0]));
        if (r4 != null) goto L10;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Unable to close session. Settings are not loaded.");
        return;
    L10:
        int r6 = r4.FH;
        j6(r0, r5 ? 1 : 0, r6);
    }

    private void j6(android.content.Context r12, java.io.File r13, java.lang.String r14) {
        byte[] r0 = com.crashlytics.android.core.Ba.DW(r13);
        byte[] r1 = com.crashlytics.android.core.Ba.j6(r13);
        byte[] r15 = com.crashlytics.android.core.Ba.j6(r13, r12);
        if (r0 != null) goto L5;
    L13:
        io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "No minidump data found in directory " + r13);
        return;
    L5:
        if (r0.length == 0) goto L13;
        FH(r14, "<native-crash: minidump>");
        byte[] r16 = DW(r14, "BeginSession.json");
        byte[] r3 = DW(r14, "SessionApp.json");
        byte[] r4 = DW(r14, "SessionDevice.json");
        byte[] r5 = DW(r14, "SessionOS.json");
        byte[] r6 = com.crashlytics.android.core.Ba.FH(new com.crashlytics.android.core.xa(Hw()).DW(r14));
        com.crashlytics.android.core.ua r7 = new com.crashlytics.android.core.ua(this.tp.getContext(), this.XL, r14);
        byte[] r8 = r7.FH();
        r7.j6();
        byte[] r9 = com.crashlytics.android.core.Ba.FH(new com.crashlytics.android.core.xa(Hw()).j6(r14));
        java.io.File r10 = new java.io.File(this.Ws.j6(), r14);
        if (r10.mkdir() == true) goto L11;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Couldn't create native sessions directory");
        return;
    L11:
        DW(r0, new java.io.File(r10, "minidump"));
        DW(r1, new java.io.File(r10, "metadata"));
        DW(r15, new java.io.File(r10, "binaryImages"));
        DW(r16, new java.io.File(r10, "session"));
        DW(r3, new java.io.File(r10, "app"));
        DW(r4, new java.io.File(r10, "device"));
        DW(r5, new java.io.File(r10, "os"));
        DW(r6, new java.io.File(r10, "user"));
        DW(r8, new java.io.File(r10, "logs"));
        DW(r9, new java.io.File(r10, "keys"));
    }

    static void j6(com.crashlytics.android.core.W r0, long r1) {
        r0.j6(r1);
    }

    static void j6(com.crashlytics.android.core.W r0, abcd.hA r1, boolean r2) {
        r0.j6(r1, r2);
    }

    static void j6(com.crashlytics.android.core.W r0, android.content.Context r1, java.io.File r2, java.lang.String r3) {
        r0.j6(r1, r2, r3);
    }

    static void j6(com.crashlytics.android.core.W r0, java.util.Date r1, java.lang.Thread r2, java.lang.Throwable r3) {
        r0.j6(r1, r2, r3);
    }

    static void j6(com.crashlytics.android.core.W r0, java.util.Set r1) {
        r0.j6(r1);
    }

    private void j6(com.crashlytics.android.core.ClassG r4) {
        if (r4 != null) goto L9;
        return;
    L9:
        r4.j6();     // Catch: java.io.IOException -> L6
        return;
    L6:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error closing session file stream in the presence of an exception", e);
    }

    private static void j6(com.crashlytics.android.core.ClassH r4, java.io.File r5) {
        if (r5.exists() == true) goto L18;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Tried to include a file that doesn't exist: " + r5.getName(), null);
        return;
    L18:
        java.io.FileInputStream r1 = new java.io.FileInputStream(r5);     // Catch: java.lang.Throwable -> L12
        j6(r1, r4, (int) r5.length());     // Catch: java.lang.Throwable -> L10
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close file input stream.");
        return;
    L10:
        th = th;
    L14:
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close file input stream.");
        throw th;
    L12:
        th = th;
        r1 = null;
        goto L14
    }

    private void j6(com.crashlytics.android.core.ClassH r12, java.lang.String r13) {
        java.lang.String[] r0 = gn;
        int r1 = r0.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        java.lang.String r4 = r0[r3];
        java.io.File[] r5 = j6(new com.crashlytics.android.core.W.d(r13 + r4 + ".cls"));
        if (r5.length != 0) goto L7;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Can't find " + r4 + " data for session ID " + r13, null);
    L8:
        r3 = r3 + 1;
        goto L3
    L7:
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Collecting " + r4 + " data for session ID " + r13);
        j6(r12, r5[0]);
        goto L8
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    private void j6(com.crashlytics.android.core.ClassH r25, java.util.Date r26, java.lang.Thread r27, java.lang.Throwable r28, java.lang.String r29, boolean r30) {
        com.crashlytics.android.core.Ra r5 = new com.crashlytics.android.core.Ra(r28, this.a8);
        android.content.Context r1 = this.tp.getContext();
        long r2 = r26.getTime() / 1000;
        java.lang.Float r16 = io.fabric.sdk.android.services.common.i.v5(r1);
        int r17 = io.fabric.sdk.android.services.common.i.j6(r1, this.U2.FH());
        boolean r18 = io.fabric.sdk.android.services.common.i.VH(r1);
        int r13 = r1.getResources().getConfiguration().orientation;
        long r19 = io.fabric.sdk.android.services.common.i.DW() - io.fabric.sdk.android.services.common.i.j6(r1);
        long r21 = io.fabric.sdk.android.services.common.i.j6(android.os.Environment.getDataDirectory().getPath());
        android.app.ActivityManager.RunningAppProcessInfo r12 = io.fabric.sdk.android.services.common.i.j6(r1.getPackageName(), r1);
        java.util.LinkedList r9 = new java.util.LinkedList();
        java.lang.StackTraceElement[] r7 = r5.FH;
        java.lang.String r15 = this.QX.DW;
        java.lang.String r14 = this.J0.FH();
        int r4 = 0;
        if (r30 == false) goto L9;
        java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> r8 = java.lang.Thread.getAllStackTraces();
        java.lang.Thread[] r10 = new java.lang.Thread[r8.size()];
        java.util.Iterator<java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]>> r11 = r8.entrySet().iterator();
    L6:
        if (r11.hasNext() == false) goto L8;
        java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> r110 = r11.next();
        r10[r4] = r110.getKey();
        r9.add(this.a8.j6(r110.getValue()));
        r4 = r4 + 1;
        goto L6
    L8:
        ?? r6 = 1;
        java.lang.Thread[] r20 = r10;
    L11:
        if (io.fabric.sdk.android.services.common.i.j6(r1, "com.crashlytics.CollectCustomKeys", r6) == true) goto L13;
        java.util.Map<java.lang.String, java.lang.String> r3 = new java.util.TreeMap();
    L18:
        java.util.Map<java.lang.String, java.lang.String> r111 = r3;
    L19:
        com.crashlytics.android.core.Na.j6(r25, r2, r29, r5, r27, r7, r20, r9, r111, this.aM, r12, r13, r14, r15, r16, r17, r18, r19, r21);
        return;
    L13:
        r3 = this.tp.we();
        if (r3 == null) goto L18;
        if (r3.size() <= r6) goto L18;
        r111 = new java.util.TreeMap(r3);
        goto L19
    L9:
        r6 = 1;
        r20 = new java.lang.Thread[0];
        goto L11
    }

    private static void j6(com.crashlytics.android.core.ClassH r11, java.io.File[] r12, java.lang.String r13) {
        java.util.Arrays.sort(r12, io.fabric.sdk.android.services.common.i.Hw);
        int r1 = r12.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L10;
        java.io.File r4 = r12[r3];
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", java.lang.String.format(java.util.Locale.US, "Found Non Fatal for session ID %s in %s ", new java.lang.Object[]{r13, r4.getName()}));     // Catch: java.lang.Exception -> L7
        j6(r11, r4);     // Catch: java.lang.Exception -> L7
    L9:
        r3 = r3 + 1;
    L7:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error writting non-fatal to session.", e);
        goto L9
    }

    private void j6(java.io.File r12, java.lang.String r13, int r14) {
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Collecting session parts for ID " + r13);
        java.io.File[] r0 = j6(new com.crashlytics.android.core.W.d(r13 + "SessionCrash"));
        if (r0 != null) goto L5;
    L7:
        boolean r4 = false;
    L8:
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", java.lang.String.format(java.util.Locale.US, "Session %s has fatal exception: %s", new java.lang.Object[]{r13, java.lang.Boolean.valueOf(r4)}));
        java.io.File[] r5 = j6(new com.crashlytics.android.core.W.d(r13 + "SessionEvent"));
        if (r5 != null) goto L11;
    L13:
        boolean r6 = false;
    L14:
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", java.lang.String.format(java.util.Locale.US, "Session %s has non-fatal exceptions: %s", new java.lang.Object[]{r13, java.lang.Boolean.valueOf(r6)}));
        if (r4 == true) goto L19;
        if (r6 == true) goto L19;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "No events present for session ID " + r13);
    L24:
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Removing session part files for ID " + r13);
        j6(r13);
        return;
    L19:
        java.io.File[] r15 = j6(r13, r5, r14);
        if (r4 == false) goto L22;
        java.io.File r1 = r0[0];
    L23:
        j6(r12, r13, r15, r1);
        goto L24
    L22:
        r1 = null;
        goto L23
    L11:
        if (r5.length <= 0) goto L13;
        r6 = true;
        goto L14
    L5:
        if (r0.length <= 0) goto L7;
        r4 = true;
        goto L8
    }

    private void j6(java.io.File r16, java.lang.String r17, java.io.File[] r18, java.io.File r19) {
        if (r19 == null) goto L5;
        boolean r7 = true;
    L6:
        if (r7 == false) goto L8;
        java.io.File r8 = FH();
    L10:
        if (r8.exists() == true) goto L12;
        r8.mkdirs();
    L12:
        com.crashlytics.android.core.ClassH r9 = null;
        com.crashlytics.android.core.ClassG r10 = new com.crashlytics.android.core.ClassG(r8, r17);     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
        r9 = com.crashlytics.android.core.ClassH.j6(r10);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L27
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Collecting SessionStart data for session ID " + r17);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L27
        j6(r9, r16);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L27
        r9.DW(4, new java.util.Date().getTime() / 1000);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L27
        r9.DW(5, r7);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L27
        r9.VH(11, 1);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L27
        r9.Hw(12, 3);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L27
        j6(r9, r17);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L27
        j6(r9, r18, r17);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L27
        if (r7 == false) goto L17;
        j6(r9, r19);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L27
    L17:
        io.fabric.sdk.android.services.common.i.j6(r9, "Error flushing session file stream");
        io.fabric.sdk.android.services.common.i.j6(r10, "Failed to close CLS file");
        return;
    L18:
        e = e;
    L24:
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Failed to write session file for session ID: " + r17, e);     // Catch: java.lang.Throwable -> L27
        io.fabric.sdk.android.services.common.i.j6(r9, "Error flushing session file stream");
        j6(r10);
        return;
    L27:
        th = th;
    L28:
        io.fabric.sdk.android.services.common.i.j6(r9, "Error flushing session file stream");
        io.fabric.sdk.android.services.common.i.j6(r10, "Failed to close CLS file");
        throw th;
    L22:
        e = e;
        r10 = null;
    L20:
        th = th;
        r10 = null;
        goto L28
    L8:
        r8 = Zo();
        goto L10
    L5:
        r7 = false;
        goto L6
    }

    private static void j6(java.io.InputStream r2, com.crashlytics.android.core.ClassH r3, int r4) {
        byte[] r5 = new byte[r4];
        int r0 = 0;
    L4:
        if (r0 >= r5.length) goto L8;
        int r1 = r2.read(r5, r0, r5.length - r0);
        if (r1 < 0) goto L8;
        r0 = r0 + r1;
    L8:
        r3.j6(r5);
    }

    private void j6(java.lang.String r4) {
        java.io.File[] r5 = FH(r4);
        int r0 = r5.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        r5[r1].delete();
        r1 = r1 + 1;
        goto L3
    }

    private void j6(java.lang.String r4, int r5) {
        com.crashlytics.android.core.Va.j6(Hw(), new com.crashlytics.android.core.W.d(r4 + "SessionEvent"), r5, v5);
    }

    private void j6(java.lang.String r8, java.lang.String r9, com.crashlytics.android.core.W.b r10) {
        com.crashlytics.android.core.ClassH r3 = null;
        com.crashlytics.android.core.ClassG r4 = new com.crashlytics.android.core.ClassG(Hw(), r8 + r9);     // Catch: java.lang.Throwable -> L9
        r3 = com.crashlytics.android.core.ClassH.j6(r4);     // Catch: java.lang.Throwable -> L7
        r10.j6(r3);     // Catch: java.lang.Throwable -> L7
        io.fabric.sdk.android.services.common.i.j6(r3, "Failed to flush to session " + r9 + " file.");
        io.fabric.sdk.android.services.common.i.j6(r4, "Failed to close session " + r9 + " file.");
        return;
    L7:
        th = th;
    L11:
        io.fabric.sdk.android.services.common.i.j6(r3, "Failed to flush to session " + r9 + " file.");
        io.fabric.sdk.android.services.common.i.j6(r4, "Failed to close session " + r9 + " file.");
        throw th;
    L9:
        th = th;
        r4 = null;
        goto L11
    }

    private void j6(java.lang.String r8, java.lang.String r9, com.crashlytics.android.core.W.e r10) {
        java.io.FileOutputStream r2 = null;
        java.io.FileOutputStream r3 = new java.io.FileOutputStream(new java.io.File(Hw(), r8 + r9));     // Catch: java.lang.Throwable -> L9
        r10.j6(r3);     // Catch: java.lang.Throwable -> L7
        io.fabric.sdk.android.services.common.i.j6(r3, "Failed to close " + r9 + " file.");
        return;
    L7:
        th = th;
        r2 = r3;
    L10:
        io.fabric.sdk.android.services.common.i.j6(r2, "Failed to close " + r9 + " file.");
        throw th;
    L9:
        th = th;
        goto L10
    }

    private void j6(java.lang.String r10, java.util.Date r11) {
        java.lang.String r0 = java.lang.String.format(java.util.Locale.US, "Crashlytics Android SDK/%s", new java.lang.Object[]{this.tp.getVersion()});
        long r1 = r11.getTime() / 1000;
        j6(r10, "BeginSession", new com.crashlytics.android.core.C1976z(this, r10, r0, r1));
        j6(r10, "BeginSession.json", new com.crashlytics.android.core.B(this, r10, r0, r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Flushable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    private void j6(java.util.Date r16, java.lang.Thread r17, java.lang.Throwable r18) {
        java.lang.String r11 = Ws();
        ?? r1 = 0;
        com.crashlytics.android.core.ClassH r2 = null;
        r2 = null;
        r1 = 0;
        if (r11 != null) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Tried to write a non-fatal exception while no session was open.", null);
        return;
    L6:
        Hw(r11, r18.getClass().getName());
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Crashlytics is logging non-fatal exception \"" + r18 + "\" from thread " + r17.getName());     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
        com.crashlytics.android.core.ClassG r13 = new com.crashlytics.android.core.ClassG(Hw(), r11 + "SessionEvent" + io.fabric.sdk.android.services.common.i.DW(this.u7.getAndIncrement()));     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
        com.crashlytics.android.core.ClassH r14 = com.crashlytics.android.core.ClassH.j6(r13);     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> L29
        com.crashlytics.android.core.W r3 = this;
        r3.j6(r14, r16, r17, r18, "error", false);     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
        io.fabric.sdk.android.services.common.i.j6(r14, "Failed to flush to non-fatal file.");
        r1 = r3;
    L23:
        io.fabric.sdk.android.services.common.i.j6(r13, "Failed to close non-fatal file output stream.");
        j6(r11, 64);     // Catch: java.lang.Exception -> L26
        return;
    L26:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "An error occurred when trimming non-fatal files.", e);
        return;
    L13:
        e = e;
        r2 = r14;
    L21:
        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "An error occurred in the non-fatal exception logger", e);     // Catch: java.lang.Throwable -> L29
        io.fabric.sdk.android.services.common.i.j6(r2, "Failed to flush to non-fatal file.");
        r1 = r2;
    L11:
        th = th;
        r1 = r14;
    L30:
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to flush to non-fatal file.");
        io.fabric.sdk.android.services.common.i.j6(r13, "Failed to close non-fatal file output stream.");
        throw th;
    L15:
        e = e;
        goto L21
    L29:
        th = th;
    L19:
        e = e;
        r13 = null;
    L17:
        th = th;
        r13 = null;
        goto L30
    }

    private void j6(java.util.Set<java.io.File> r2) {
        java.util.Iterator<java.io.File> r3 = r2.iterator();
    L4:
        if (r3.hasNext() == false) goto L6;
        FH(r3.next());
        goto L4
    }

    private void j6(byte[] r4, java.io.File r5) {
        java.util.zip.GZIPOutputStream r0 = null;
        java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream(new java.io.FileOutputStream(r5));     // Catch: java.lang.Throwable -> L9
        r1.write(r4);     // Catch: java.lang.Throwable -> L7
        r1.finish();     // Catch: java.lang.Throwable -> L7
        io.fabric.sdk.android.services.common.i.j6(r1);
        return;
    L7:
        th = th;
        r0 = r1;
    L10:
        io.fabric.sdk.android.services.common.i.j6(r0);
        throw th;
    L9:
        th = th;
        goto L10
    }

    private void j6(java.io.File[] r7, int r8, int r9) {
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Closing open sessions.");
    L4:
        if (r8 >= r7.length) goto L6;
        java.io.File r0 = r7[r8];
        java.lang.String r2 = j6(r0);
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Closing session: " + r2);
        j6(r0, r2, r9);
        r8 = r8 + 1;
        goto L4
    }

    private void j6(java.io.File[] r9, java.util.Set<java.lang.String> r10) {
        int r0 = r9.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L11;
        java.io.File r2 = r9[r1];
        java.lang.String r3 = r2.getName();
        java.util.regex.Matcher r4 = Zo.matcher(r3);
        if (r4.matches() == true) goto L8;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Deleting unknown file: " + r3);
        r2.delete();
    L10:
        r1 = r1 + 1;
        goto L3
    L8:
        if (r10.contains(r4.group(1)) == true) goto L10;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Trimming session file: " + r3);
        r2.delete();
        goto L10
    }

    static boolean j6(com.crashlytics.android.core.W r0, abcd.mA r1) {
        return r0.FH(r1);
    }

    static java.io.File[] j6(com.crashlytics.android.core.W r0, java.io.FilenameFilter r1) {
        return r0.j6(r1);
    }

    private java.io.File[] j6(java.io.File r1, java.io.FilenameFilter r2) {
        return DW(r1.listFiles(r2));
    }

    private java.io.File[] j6(java.io.FileFilter r2) {
        return DW(Hw().listFiles(r2));
    }

    private java.io.File[] j6(java.io.FilenameFilter r2) {
        return j6(Hw(), r2);
    }

    private java.io.File[] j6(java.lang.String r5, java.io.File[] r6, int r7) {
        if (r6.length <= r7) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", java.lang.String.format(java.util.Locale.US, "Trimming down to %d logged exceptions.", new java.lang.Object[]{java.lang.Integer.valueOf(r7)}));
        j6(r5, r7);
        return j6(new com.crashlytics.android.core.W.d(r5 + "SessionEvent"));
    L6:
        return r6;
    }

    static java.lang.String v5(com.crashlytics.android.core.W r0) {
        return r0.lg;
    }

    private void v5(java.lang.String r25) {
        android.content.Context r0 = this.tp.getContext();
        android.os.StatFs r1 = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
        int r13 = io.fabric.sdk.android.services.common.i.j6();
        int r14 = java.lang.Runtime.getRuntime().availableProcessors();
        long r15 = io.fabric.sdk.android.services.common.i.DW();
        long r17 = ((long) r1.getBlockCount()) * ((long) r1.getBlockSize());
        boolean r19 = io.fabric.sdk.android.services.common.i.we(r0);
        java.util.Map<io.fabric.sdk.android.services.common.v.a, java.lang.String> r20 = this.J0.v5();
        int r21 = io.fabric.sdk.android.services.common.i.Zo(r0);
        j6(r25, "SessionDevice", new com.crashlytics.android.core.J(this, r13, r14, r15, r17, r19, r20, r21));
        j6(r25, "SessionDevice.json", new com.crashlytics.android.core.L(this, r13, r14, r15, r17, r19, r20, r21));
    }

    void DW() {
        this.EQ.j6(new com.crashlytics.android.core.Runnablew(this));
    }

    boolean DW(abcd.hA r3) {
        return ((java.lang.Boolean) this.EQ.DW(new com.crashlytics.android.core.CallableC1970v(this, r3))).booleanValue();
    }

    void EQ() {
        this.EQ.j6(new com.crashlytics.android.core.Callableu(this));
    }

    java.io.File FH() {
        return new java.io.File(Hw(), "fatal-sessions");
    }

    java.io.File Hw() {
        return this.Ws.j6();
    }

    boolean VH() {
        com.crashlytics.android.core.ia r0 = this.yS;
        if (r0 != null) goto L5;
    L7:
        return false;
    L5:
        if (r0.j6() == false) goto L7;
        return true;
    }

    java.io.File Zo() {
        return new java.io.File(Hw(), "nonfatal-sessions");
    }

    java.io.File[] gn() {
        java.util.LinkedList r0 = new java.util.LinkedList();
        java.util.Collections.addAll(r0, j6(FH(), DW));
        java.util.Collections.addAll(r0, j6(Zo(), DW));
        java.util.Collections.addAll(r0, j6(Hw(), DW));
        return (java.io.File[]) r0.toArray(new java.io.File[r0.size()]);
    }

    void j6(float r6, abcd.mA r7) {
        if (r7 != null) goto L5;
        io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Could not send reports. Settings are not available.");
        return;
    L5:
        abcd.Wz r0 = r7.j6;
        com.crashlytics.android.core.Interfaceka r1 = j6(r0.Hw, r0.v5);
        if (FH(r7) == false) goto L8;
        com.crashlytics.android.core.La.d r2 = new com.crashlytics.android.core.W.h(this.tp, this.J8, r7.FH);
    L9:
        new com.crashlytics.android.core.La(this.QX.j6, r1, this.j3, this.Mr).j6(r6, r2);
        return;
    L8:
        r2 = new com.crashlytics.android.core.La.a();
        goto L9
    }

    void j6(int r4) {
        int r5 = r4 - com.crashlytics.android.core.Va.j6(FH(), r4, v5);
        int r6 = r5 - com.crashlytics.android.core.Va.j6(Zo(), r5, v5);
        com.crashlytics.android.core.Va.j6(Hw(), DW, r6, v5);
    }

    void j6(long r3, java.lang.String r5) {
        this.EQ.j6(new com.crashlytics.android.core.U(this, r3, r5));
    }

    void j6(abcd.hA r2) {
        j6(r2, false);
    }

    void j6(abcd.mA r4) {
        if (r4.Hw.v5 == false) goto L6;
        boolean r5 = this.rN.j6();
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Registered Firebase Analytics event listener for breadcrumbs: " + r5);
        return;
    }

    synchronized void j6(com.crashlytics.android.core.ia.b r10, java.lang.Thread r11, java.lang.Throwable r12, boolean r13) {
        monitor-enter(this);
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Crashlytics is handling uncaught exception \"" + r12 + "\" from thread " + r11.getName());     // Catch: java.lang.Throwable -> L6
        this.U2.j6();     // Catch: java.lang.Throwable -> L6
        this.EQ.DW(new com.crashlytics.android.core.T(this, new java.util.Date(), r11, r12, r10, r13));     // Catch: java.lang.Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    void j6(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        this.EQ.j6(new com.crashlytics.android.core.CallableC1964s(this, r3, r4, r5));
    }

    void j6(java.lang.Thread.UncaughtExceptionHandler r5, boolean r6) {
        EQ();
        this.yS = new com.crashlytics.android.core.ia(new com.crashlytics.android.core.S(this), new com.crashlytics.android.core.W.c(null), r6, r5);
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this.yS);
    }

    void j6(java.lang.Thread r4, java.lang.Throwable r5) {
        java.util.Date r0 = new java.util.Date();
        this.EQ.j6(new com.crashlytics.android.core.V(this, r0, r4, r5));
    }

    void j6(java.util.Map<java.lang.String, java.lang.String> r3) {
        this.EQ.j6(new com.crashlytics.android.core.Callablet(this, r3));
    }

    void j6(java.io.File[] r10) {
        java.util.HashSet r0 = new java.util.HashSet();
        int r1 = r10.length;
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r3 >= r1) goto L7;
        java.io.File r5 = r10[r3];
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Found invalid session part file: " + r5);
        r0.add(j6(r5));
        r3 = r3 + 1;
        goto L4
    L7:
        if (r0.isEmpty() == false) goto L9;
        return;
    L9:
        java.io.File r11 = v5();
        if (r11.exists() == true) goto L12;
        r11.mkdir();
    L12:
        java.io.File[] r4 = j6(new com.crashlytics.android.core.ClassX(this, r0));
        int r6 = r4.length;
    L13:
        if (r2 >= r6) goto L18;
        java.io.File r7 = r4[r2];
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Moving session file: " + r7);
        if (r7.renameTo(new java.io.File(r11, r7.getName())) == true) goto L17;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Could not move session file. Deleting " + r7);
        r7.delete();
    L17:
        r2 = r2 + 1;
        goto L13
    L18:
        aM();
    }

    boolean j6(com.crashlytics.android.core.fa r3) {
        if (r3 != null) goto L6;
        return true;
    L6:
        return ((java.lang.Boolean) this.EQ.DW(new com.crashlytics.android.core.CallableC1975y(this, r3))).booleanValue();
    }

    java.io.File[] tp() {
        return j6(j6);
    }

    java.io.File[] u7() {
        return j6(FH);
    }

    java.io.File v5() {
        return new java.io.File(Hw(), "invalidClsFiles");
    }

    void we() {
        this.U2.DW();
    }
}
