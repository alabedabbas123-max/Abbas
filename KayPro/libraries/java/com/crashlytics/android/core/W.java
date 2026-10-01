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
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (com.crashlytics.android.core.W.DW.accept(r2, r3) == false) { $pc0 = 5; continue $sw0; }
                        $pc0 = 7; continue $sw0;
                    }
                    case 7: {
                        return false;
                    }
                    case 5: {
                        if (com.crashlytics.android.core.W.j6().matcher(r3).matches() == false) { $pc0 = 7; continue $sw0; }
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (r2.contains(this.j6) == true) { $pc1 = 5; continue $sw1; }
                        $pc1 = 7; continue $sw1;
                    }
                    case 7: {
                        return false;
                    }
                    case 5: {
                        if (r2.endsWith(".cls_temp") == true) { $pc1 = 7; continue $sw1; }
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (com.crashlytics.android.core.ClassG.j6.accept(r2, r3) == false) { $pc2 = 5; continue $sw2; }
                        $pc2 = 8; continue $sw2;
                    }
                    case 8: {
                        return true;
                    }
                    case 5: {
                        if (r3.contains("SessionMissingBinaryImages") == true) { $pc2 = 8; continue $sw2; }
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static final class g implements com.crashlytics.android.core.ua.a {
        private final abcd.Oz j6;

        public g(abcd.Oz r1) {
            this.j6 = r1;
        }

        @Override
        public java.io.File j6() {
            java.io.File r0 = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = new java.io.File(this.j6.j6(), "log-files");
                        if (r0.exists() == true) { $pc3 = 5; continue $sw3; }
                        r0.mkdirs();
                        $pc3 = 5; continue $sw3;
                    }
                    case 5: {
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            android.app.Activity r0 = null;
            com.crashlytics.android.core.X r1 = null;
            com.crashlytics.android.core.ClassN r2 = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = this.j6.getFabric().getCurrentActivity();
                        if (r0 != null) { $pc4 = 5; continue $sw4; }
                        return true;
                    }
                    case 5: {
                        if (r0.isFinishing() == true) { $pc4 = 11; continue $sw4; }
                        r1 = new com.crashlytics.android.core.X(this);
                        r2 = com.crashlytics.android.core.ClassN.j6(r0, this.FH, r1);
                        r0.runOnUiThread(new com.crashlytics.android.core.Y(this, r2));
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Waiting for user opt-in.");
                        r2.j6();
                        return r2.DW();
                    }
                    case 11: {
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        if (io.fabric.sdk.android.services.common.i.DW(this.j6) == true) { $pc5 = 5; continue $sw5; }
                        return;
                    }
                    case 5: {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                        this.FH.j6(this.DW);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static class l implements java.io.FilenameFilter {
        private final java.lang.String j6;

        public l(java.lang.String r1) {
            this.j6 = r1;
        }

        @Override
        public boolean accept(java.io.File r2, java.lang.String r3) {
            java.lang.Throwable $ex6 = null;
            int $pc6 = -1;
            $sw6: while (true) {
                switch ($pc6) {
                    case -1: {
                        if (r3.equals(this.j6 + ".cls") == false) { $pc6 = 6; continue $sw6; }
                        return false;
                    }
                    case 6: {
                        if (r3.contains(this.j6) == true) { $pc6 = 8; continue $sw6; }
                        return false;
                    }
                    case 8: {
                        if (r3.endsWith(".cls_temp") == true) { $pc6 = 12; continue $sw6; }
                        return true;
                    }
                    case 12: {
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
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
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (VH() == false) { $pc7 = 6; continue $sw7; }
                    return new com.crashlytics.android.core.Ta(this.tp.aM(), this.tp.j3(), this.tp.Ws());
                }
                case 6: {
                    return new com.crashlytics.android.core.xa(Hw()).FH(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String DW(com.crashlytics.android.core.W r0) {
        return r0.Ws();
    }

    private void DW(int r5) {
        java.util.HashSet r0 = null;
        java.io.File[] r1 = null;
        int r6 = 0;
        int r2 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = new java.util.HashSet();
                    r1 = XL();
                    r6 = java.lang.Math.min(r5, r1.length);
                    r2 = 0;
                    $pc8 = 3; continue $sw8;
                }
                case 3: {
                    if (r2 >= r6) { $pc8 = 5; continue $sw8; }
                    r0.add(j6(r1[r2]));
                    r2 = r2 + 1;
                    { $pc8 = 3; continue $sw8; }
                }
                case 5: {
                    this.aM.j6(r0);
                    j6(j6(new com.crashlytics.android.core.W.a(null)), r0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.mA r8) {
        android.content.Context r0 = null;
        abcd.Wz r9 = null;
        com.crashlytics.android.core.Interfaceka r10 = null;
        com.crashlytics.android.core.La r1 = null;
        java.io.File[] r11 = null;
        int r2 = 0;
        int r3 = 0;
        com.crashlytics.android.core.Oa r5 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r8 != null) { $pc9 = 5; continue $sw9; }
                    io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Cannot send reports. Settings are unavailable.");
                    return;
                }
                case 5: {
                    r0 = this.tp.getContext();
                    r9 = r8.j6;
                    r10 = j6(r9.Hw, r9.v5);
                    r1 = new com.crashlytics.android.core.La(this.QX.j6, r10, this.j3, this.Mr);
                    r11 = gn();
                    r2 = r11.length;
                    r3 = 0;
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    if (r3 >= r2) { $pc9 = 8; continue $sw9; }
                    r5 = new com.crashlytics.android.core.Oa(r11[r3], VH);
                    this.EQ.j6(new com.crashlytics.android.core.W.k(r0, r5, r1));
                    r3 = r3 + 1;
                    { $pc9 = 6; continue $sw9; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void DW(com.crashlytics.android.core.W r0, abcd.mA r1) {
        r0.DW(r1);
    }

    static void DW(com.crashlytics.android.core.W r0, java.util.Date r1, java.lang.Thread r2, java.lang.Throwable r3) {
        r0.DW(r1, r2, r3);
    }

    private void DW(java.util.Date r15, java.lang.Thread r16, java.lang.Throwable r17) {
        com.crashlytics.android.core.ClassH r4 = null;
        java.lang.String r0 = null;
        com.crashlytics.android.core.ClassG r5 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r4 = null;
                    try {
                        r0 = Ws();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 15; continue $sw10; }
                        $pc10 = 13; continue $sw10;
                    }
                    if (r0 != null) { $pc10 = 8; continue $sw10; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", null);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 15; continue $sw10; }
                        $pc10 = 13; continue $sw10;
                    }
                    io.fabric.sdk.android.services.common.i.j6(null, "Failed to flush to session begin file.");
                    io.fabric.sdk.android.services.common.i.j6(null, "Failed to close fatal exception file output stream.");
                    return;
                }
                case 8: {
                    try {
                        FH(r0, r17.getClass().getName());
                        r5 = new com.crashlytics.android.core.ClassG(Hw(), r0 + "SessionCrash");
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 15; continue $sw10; }
                        $pc10 = 13; continue $sw10;
                    }
                    try {
                        r4 = com.crashlytics.android.core.ClassH.j6(r5);
                        j6(r4, r15, r16, r17, "crash", true);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.Exception) { $pc10 = 11; continue $sw10; }
                        $pc10 = 20; continue $sw10;
                    }
                    $pc10 = 18; continue $sw10;
                }
                case 18: {
                    io.fabric.sdk.android.services.common.i.j6(r4, "Failed to flush to session begin file.");
                    io.fabric.sdk.android.services.common.i.j6(r5, "Failed to close fatal exception file output stream.");
                    return;
                }
                case 11: {
                    e = e;
                    $pc10 = 17; continue $sw10;
                }
                case 17: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "An error occurred in the fatal exception logger", e);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 20; continue $sw10;
                    }
                    $pc10 = 21; continue $sw10;
                }
                case 20: {
                    th = th;
                    $pc10 = 21; continue $sw10;
                }
                case 21: {
                    io.fabric.sdk.android.services.common.i.j6(r4, "Failed to flush to session begin file.");
                    io.fabric.sdk.android.services.common.i.j6(r5, "Failed to close fatal exception file output stream.");
                    throw th;
                }
                case 15: {
                    e = e;
                    r5 = null;
                    return;
                }
                case 13: {
                    th = th;
                    r5 = null;
                    { $pc10 = 21; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(byte[] r2, java.io.File r3) {
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (r2 != null) { $pc11 = 4; continue $sw11; }
                    return;
                }
                case 4: {
                    if (r2.length <= 0) { $pc11 = 8; continue $sw11; }
                    j6(r2, r3);
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] DW(java.lang.String r4, java.lang.String r5) {
        return com.crashlytics.android.core.Ba.FH(new java.io.File(Hw(), r4 + r5));
    }

    private java.io.File[] DW(java.io.File r1) {
        return DW(r1.listFiles());
    }

    private java.io.File[] DW(java.io.File[] r1) {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (r1 == null) { $pc12 = 4; continue $sw12; }
                    return r1;
                }
                case 4: {
                    return new java.io.File[0];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String FH(com.crashlytics.android.core.W r0) {
        return r0.QX();
    }

    private void FH(java.io.File r5) {
        java.io.File[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (r5.isDirectory() == false) { $pc13 = 7; continue $sw13; }
                    r0 = r5.listFiles();
                    r1 = r0.length;
                    r2 = 0;
                    $pc13 = 5; continue $sw13;
                }
                case 5: {
                    if (r2 >= r1) { $pc13 = 7; continue $sw13; }
                    FH(r0[r2]);
                    r2 = r2 + 1;
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    r5.delete();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void FH(java.lang.String r2, java.lang.String r3) {
        com.crashlytics.android.answers.C1918b r0 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = (com.crashlytics.android.answers.C1918b) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.answers.C1918b.class);
                    if (r0 != null) { $pc14 = 6; continue $sw14; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Answers is not available");
                    return;
                }
                case 6: {
                    r0.j6(new io.fabric.sdk.android.services.common.j.a(r2, r3));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean FH(abcd.mA r2) {
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (r2 != null) { $pc15 = 6; continue $sw15; }
                    return false;
                }
                case 6: {
                    if (r2.Hw.j6 == true) { $pc15 = 8; continue $sw15; }
                    return false;
                }
                case 8: {
                    if (this.J8.j6() == true) { $pc15 = 12; continue $sw15; }
                    return true;
                }
                case 12: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        com.crashlytics.android.answers.C1918b r0 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = (com.crashlytics.android.answers.C1918b) io.fabric.sdk.android.Fabric.getKit(com.crashlytics.android.answers.C1918b.class);
                    if (r0 != null) { $pc16 = 6; continue $sw16; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Answers is not available");
                    return;
                }
                case 6: {
                    r0.j6(new io.fabric.sdk.android.services.common.j.b(r2, r3));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    try {
                        java.lang.Class.forName("com.google.firebase.crash.FirebaseCrash");
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        if ($t instanceof java.lang.ClassNotFoundException) { $pc17 = 6; continue $sw17; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String QX() {
        java.io.File[] r0 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r0 = XL();
                    if (r0.length > 1) { $pc18 = 7; continue $sw18; }
                    return null;
                }
                case 7: {
                    return j6(r0[1]);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void VH(com.crashlytics.android.core.W r0) {
        r0.J0();
    }

    private void VH(java.lang.String r3) {
        j6(r3, "SessionUser", new com.crashlytics.android.core.M(this, DW(r3)));
    }

    private java.lang.String Ws() {
        java.io.File[] r0 = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r0 = XL();
                    if (r0.length > 0) { $pc19 = 7; continue $sw19; }
                    return null;
                }
                case 7: {
                    return j6(r0[0]);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.io.File r0 = null;
        java.io.File[] r1 = null;
        java.util.HashSet r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r0 = v5();
                    if (r0.exists() == true) { $pc20 = 5; continue $sw20; }
                    return;
                }
                case 5: {
                    r1 = j6(r0, new com.crashlytics.android.core.W.f());
                    java.util.Arrays.sort(r1, java.util.Collections.reverseOrder());
                    r2 = new java.util.HashSet();
                    r3 = 0;
                    $pc20 = 7; continue $sw20;
                }
                case 7: {
                    if (r3 >= r1.length) { $pc20 = 11; continue $sw20; }
                    if (r2.size() >= 4) { $pc20 = 11; continue $sw20; }
                    r2.add(j6(r1[r3]));
                    r3 = r3 + 1;
                    $pc20 = 11; continue $sw20;
                }
                case 11: {
                    j6(DW(r0), r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        android.os.Bundle r0 = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    if (J8() == false) { $pc21 = 7; continue $sw21; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    return;
                }
                case 7: {
                    if (this.er == null) { $pc21 = 9; continue $sw21; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Logging Crashlytics event to Firebase");
                    r0 = new android.os.Bundle();
                    r0.putInt("_r", 1);
                    r0.putInt("fatal", 1);
                    r0.putLong("timestamp", r4);
                    this.er.j6("clx", "_ae", r0);
                    return;
                }
                case 9: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void j6(abcd.hA r4, boolean r5) {
        java.io.File[] r0 = null;
        int r6 = 0;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    DW((r5 ? 1 : 0) + 8);
                    r0 = XL();
                    if (r0.length > r5) { $pc22 = 6; continue $sw22; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "No open sessions to be closed.");
                    return;
                }
                case 6: {
                    VH(j6(r0[r5 ? 1 : 0]));
                    if (r4 != null) { $pc22 = 10; continue $sw22; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Unable to close session. Settings are not loaded.");
                    return;
                }
                case 10: {
                    r6 = r4.FH;
                    j6(r0, r5 ? 1 : 0, r6);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(android.content.Context r12, java.io.File r13, java.lang.String r14) {
        byte[] r0 = null;
        byte[] r1 = null;
        byte[] r15 = null;
        byte[] r16 = null;
        byte[] r3 = null;
        byte[] r4 = null;
        byte[] r5 = null;
        byte[] r6 = null;
        com.crashlytics.android.core.ua r7 = null;
        byte[] r8 = null;
        byte[] r9 = null;
        java.io.File r10 = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    r0 = com.crashlytics.android.core.Ba.DW(r13);
                    r1 = com.crashlytics.android.core.Ba.j6(r13);
                    r15 = com.crashlytics.android.core.Ba.j6(r13, r12);
                    if (r0 != null) { $pc23 = 5; continue $sw23; }
                    $pc23 = 13; continue $sw23;
                }
                case 13: {
                    io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "No minidump data found in directory " + r13);
                    return;
                }
                case 5: {
                    if (r0.length == 0) { $pc23 = 13; continue $sw23; }
                    FH(r14, "<native-crash: minidump>");
                    r16 = DW(r14, "BeginSession.json");
                    r3 = DW(r14, "SessionApp.json");
                    r4 = DW(r14, "SessionDevice.json");
                    r5 = DW(r14, "SessionOS.json");
                    r6 = com.crashlytics.android.core.Ba.FH(new com.crashlytics.android.core.xa(Hw()).DW(r14));
                    r7 = new com.crashlytics.android.core.ua(this.tp.getContext(), this.XL, r14);
                    r8 = r7.FH();
                    r7.j6();
                    r9 = com.crashlytics.android.core.Ba.FH(new com.crashlytics.android.core.xa(Hw()).j6(r14));
                    r10 = new java.io.File(this.Ws.j6(), r14);
                    if (r10.mkdir() == true) { $pc23 = 11; continue $sw23; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Couldn't create native sessions directory");
                    return;
                }
                case 11: {
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
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable e = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    if (r4 != null) { $pc24 = 9; continue $sw24; }
                    return;
                }
                case 9: {
                    try {
                        r4.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        if ($t instanceof java.io.IOException) { $pc24 = 6; continue $sw24; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 6: {
                    e = $ex24;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error closing session file stream in the presence of an exception", e);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(com.crashlytics.android.core.ClassH r4, java.io.File r5) {
        java.io.FileInputStream r1 = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    if (r5.exists() == true) { $pc25 = 18; continue $sw25; }
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Tried to include a file that doesn't exist: " + r5.getName(), null);
                    return;
                }
                case 18: {
                    try {
                        r1 = new java.io.FileInputStream(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 12; continue $sw25;
                    }
                    try {
                        j6(r1, r4, (int) r5.length());
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 10; continue $sw25;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close file input stream.");
                    return;
                }
                case 10: {
                    th = th;
                    $pc25 = 14; continue $sw25;
                }
                case 14: {
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close file input stream.");
                    throw th;
                }
                case 12: {
                    th = th;
                    r1 = null;
                    { $pc25 = 14; continue $sw25; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(com.crashlytics.android.core.ClassH r12, java.lang.String r13) {
        java.lang.String[] r0 = null;
        int r1 = 0;
        int r3 = 0;
        java.lang.String r4 = null;
        java.io.File[] r5 = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    r0 = gn;
                    r1 = r0.length;
                    r3 = 0;
                    $pc26 = 3; continue $sw26;
                }
                case 3: {
                    if (r3 >= r1) { $pc26 = 9; continue $sw26; }
                    r4 = r0[r3];
                    r5 = j6(new com.crashlytics.android.core.W.d(r13 + r4 + ".cls"));
                    if (r5.length != 0) { $pc26 = 7; continue $sw26; }
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Can't find " + r4 + " data for session ID " + r13, null);
                    $pc26 = 8; continue $sw26;
                }
                case 8: {
                    r3 = r3 + 1;
                    { $pc26 = 3; continue $sw26; }
                }
                case 7: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Collecting " + r4 + " data for session ID " + r13);
                    j6(r12, r5[0]);
                    { $pc26 = 8; continue $sw26; }
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5 */
    private void j6(com.crashlytics.android.core.ClassH r25, java.util.Date r26, java.lang.Thread r27, java.lang.Throwable r28, java.lang.String r29, boolean r30) {
        com.crashlytics.android.core.Ra r5 = null;
        android.content.Context r1 = null;
        long r2 = 0L;
        java.lang.Float r16 = null;
        int r17 = 0;
        boolean r18 = false;
        int r13 = 0;
        long r19 = 0L;
        long r21 = 0L;
        android.app.ActivityManager.RunningAppProcessInfo r12 = null;
        java.util.LinkedList r9 = null;
        java.lang.StackTraceElement[] r7 = null;
        java.lang.String r15 = null;
        java.lang.String r14 = null;
        int r4 = 0;
        java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> r8 = null;
        java.lang.Thread[] r10 = null;
        java.util.Iterator<java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]>> r11 = null;
        java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> r110 = null;
        java.lang.Object r6 = null;
        java.lang.Thread[] r20 = null;
        java.util.Map<java.lang.String, java.lang.String> r3 = null;
        java.util.Map<java.lang.String, java.lang.String> r111 = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    r5 = new com.crashlytics.android.core.Ra(r28, this.a8);
                    r1 = this.tp.getContext();
                    r2 = r26.getTime() / 1000;
                    r16 = io.fabric.sdk.android.services.common.i.v5(r1);
                    r17 = io.fabric.sdk.android.services.common.i.j6(r1, this.U2.FH());
                    r18 = io.fabric.sdk.android.services.common.i.VH(r1);
                    r13 = r1.getResources().getConfiguration().orientation;
                    r19 = io.fabric.sdk.android.services.common.i.DW() - io.fabric.sdk.android.services.common.i.j6(r1);
                    r21 = io.fabric.sdk.android.services.common.i.j6(android.os.Environment.getDataDirectory().getPath());
                    r12 = io.fabric.sdk.android.services.common.i.j6(r1.getPackageName(), r1);
                    r9 = new java.util.LinkedList();
                    r7 = r5.FH;
                    r15 = this.QX.DW;
                    r14 = this.J0.FH();
                    r4 = 0;
                    if (r30 == false) { $pc27 = 9; continue $sw27; }
                    r8 = java.lang.Thread.getAllStackTraces();
                    r10 = new java.lang.Thread[r8.size()];
                    r11 = r8.entrySet().iterator();
                    $pc27 = 6; continue $sw27;
                }
                case 6: {
                    if (r11.hasNext() == false) { $pc27 = 8; continue $sw27; }
                    r110 = r11.next();
                    r10[r4] = r110.getKey();
                    r9.add(this.a8.j6(r110.getValue()));
                    r4 = r4 + 1;
                    { $pc27 = 6; continue $sw27; }
                }
                case 8: {
                    r6 = 1;
                    r20 = r10;
                    $pc27 = 11; continue $sw27;
                }
                case 11: {
                    if (io.fabric.sdk.android.services.common.i.j6(r1, "com.crashlytics.CollectCustomKeys", r6) == true) { $pc27 = 13; continue $sw27; }
                    r3 = new java.util.TreeMap();
                    $pc27 = 18; continue $sw27;
                }
                case 18: {
                    r111 = r3;
                    $pc27 = 19; continue $sw27;
                }
                case 19: {
                    com.crashlytics.android.core.Na.j6(r25, r2, r29, r5, r27, r7, r20, r9, r111, this.aM, r12, r13, r14, r15, r16, r17, r18, r19, r21);
                    return;
                }
                case 13: {
                    r3 = this.tp.we();
                    if (r3 == null) { $pc27 = 18; continue $sw27; }
                    if (r3.size() <= r6) { $pc27 = 18; continue $sw27; }
                    r111 = new java.util.TreeMap(r3);
                    { $pc27 = 19; continue $sw27; }
                }
                case 9: {
                    r6 = 1;
                    r20 = new java.lang.Thread[0];
                    { $pc27 = 11; continue $sw27; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(com.crashlytics.android.core.ClassH r11, java.io.File[] r12, java.lang.String r13) {
        int r1 = 0;
        int r3 = 0;
        java.io.File r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = -1;
        $sw28: while (true) {
            switch ($pc28) {
                case -1: {
                    java.util.Arrays.sort(r12, io.fabric.sdk.android.services.common.i.Hw);
                    r1 = r12.length;
                    r3 = 0;
                    $pc28 = 3; continue $sw28;
                }
                case 3: {
                    if (r3 >= r1) { $pc28 = 10; continue $sw28; }
                    r4 = r12[r3];
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", java.lang.String.format(java.util.Locale.US, "Found Non Fatal for session ID %s in %s ", new java.lang.Object[]{r13, r4.getName()}));
                        j6(r11, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        if ($t instanceof java.lang.Exception) { $pc28 = 7; continue $sw28; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc28 = 9; continue $sw28;
                }
                case 9: {
                    r3 = r3 + 1;
                    $pc28 = 10; continue $sw28;
                }
                case 7: {
                    e = $ex28;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error writting non-fatal to session.", e);
                    { $pc28 = 9; continue $sw28; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.io.File r12, java.lang.String r13, int r14) {
        java.io.File[] r0 = null;
        boolean r4 = false;
        java.io.File[] r5 = null;
        boolean r6 = false;
        java.io.File[] r15 = null;
        java.io.File r1 = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = -1;
        $sw29: while (true) {
            switch ($pc29) {
                case -1: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Collecting session parts for ID " + r13);
                    r0 = j6(new com.crashlytics.android.core.W.d(r13 + "SessionCrash"));
                    if (r0 != null) { $pc29 = 5; continue $sw29; }
                    $pc29 = 7; continue $sw29;
                }
                case 7: {
                    r4 = false;
                    $pc29 = 8; continue $sw29;
                }
                case 8: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", java.lang.String.format(java.util.Locale.US, "Session %s has fatal exception: %s", new java.lang.Object[]{r13, java.lang.Boolean.valueOf(r4)}));
                    r5 = j6(new com.crashlytics.android.core.W.d(r13 + "SessionEvent"));
                    if (r5 != null) { $pc29 = 11; continue $sw29; }
                    $pc29 = 13; continue $sw29;
                }
                case 13: {
                    r6 = false;
                    $pc29 = 14; continue $sw29;
                }
                case 14: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", java.lang.String.format(java.util.Locale.US, "Session %s has non-fatal exceptions: %s", new java.lang.Object[]{r13, java.lang.Boolean.valueOf(r6)}));
                    if (r4 == true) { $pc29 = 19; continue $sw29; }
                    if (r6 == true) { $pc29 = 19; continue $sw29; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "No events present for session ID " + r13);
                    $pc29 = 24; continue $sw29;
                }
                case 24: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Removing session part files for ID " + r13);
                    j6(r13);
                    return;
                }
                case 19: {
                    r15 = j6(r13, r5, r14);
                    if (r4 == false) { $pc29 = 22; continue $sw29; }
                    r1 = r0[0];
                    $pc29 = 23; continue $sw29;
                }
                case 23: {
                    j6(r12, r13, r15, r1);
                    { $pc29 = 24; continue $sw29; }
                }
                case 22: {
                    r1 = null;
                    { $pc29 = 23; continue $sw29; }
                }
                case 11: {
                    if (r5.length <= 0) { $pc29 = 13; continue $sw29; }
                    r6 = true;
                    { $pc29 = 14; continue $sw29; }
                }
                case 5: {
                    if (r0.length <= 0) { $pc29 = 7; continue $sw29; }
                    r4 = true;
                    { $pc29 = 8; continue $sw29; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.io.File r16, java.lang.String r17, java.io.File[] r18, java.io.File r19) {
        boolean r7 = false;
        java.io.File r8 = null;
        com.crashlytics.android.core.ClassH r9 = null;
        com.crashlytics.android.core.ClassG r10 = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = -1;
        $sw30: while (true) {
            switch ($pc30) {
                case -1: {
                    if (r19 == null) { $pc30 = 5; continue $sw30; }
                    r7 = true;
                    $pc30 = 6; continue $sw30;
                }
                case 6: {
                    if (r7 == false) { $pc30 = 8; continue $sw30; }
                    r8 = FH();
                    $pc30 = 10; continue $sw30;
                }
                case 10: {
                    if (r8.exists() == true) { $pc30 = 12; continue $sw30; }
                    r8.mkdirs();
                    $pc30 = 12; continue $sw30;
                }
                case 12: {
                    r9 = null;
                    try {
                        r10 = new com.crashlytics.android.core.ClassG(r8, r17);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 22; continue $sw30; }
                        $pc30 = 20; continue $sw30;
                    }
                    try {
                        r9 = com.crashlytics.android.core.ClassH.j6(r10);
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Collecting SessionStart data for session ID " + r17);
                        j6(r9, r16);
                        r9.DW(4, new java.util.Date().getTime() / 1000);
                        r9.DW(5, r7);
                        r9.VH(11, 1);
                        r9.Hw(12, 3);
                        j6(r9, r17);
                        j6(r9, r18, r17);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 18; continue $sw30; }
                        $pc30 = 27; continue $sw30;
                    }
                    if (r7 == false) { $pc30 = 17; continue $sw30; }
                    try {
                        j6(r9, r19);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        if ($t instanceof java.lang.Exception) { $pc30 = 18; continue $sw30; }
                        $pc30 = 27; continue $sw30;
                    }
                    $pc30 = 17; continue $sw30;
                }
                case 17: {
                    io.fabric.sdk.android.services.common.i.j6(r9, "Error flushing session file stream");
                    io.fabric.sdk.android.services.common.i.j6(r10, "Failed to close CLS file");
                    return;
                }
                case 18: {
                    e = e;
                    $pc30 = 24; continue $sw30;
                }
                case 24: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Failed to write session file for session ID: " + r17, e);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 27; continue $sw30;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r9, "Error flushing session file stream");
                    j6(r10);
                    return;
                }
                case 27: {
                    th = th;
                    $pc30 = 28; continue $sw30;
                }
                case 28: {
                    io.fabric.sdk.android.services.common.i.j6(r9, "Error flushing session file stream");
                    io.fabric.sdk.android.services.common.i.j6(r10, "Failed to close CLS file");
                    throw th;
                }
                case 22: {
                    e = e;
                    r10 = null;
                    $pc30 = 8; continue $sw30;
                }
                case 20: {
                    th = th;
                    r10 = null;
                    { $pc30 = 28; continue $sw30; }
                }
                case 8: {
                    r8 = Zo();
                    { $pc30 = 10; continue $sw30; }
                }
                case 5: {
                    r7 = false;
                    { $pc30 = 6; continue $sw30; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(java.io.InputStream r2, com.crashlytics.android.core.ClassH r3, int r4) {
        byte[] r5 = null;
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex31 = null;
        int $pc31 = -1;
        $sw31: while (true) {
            switch ($pc31) {
                case -1: {
                    r5 = new byte[r4];
                    r0 = 0;
                    $pc31 = 4; continue $sw31;
                }
                case 4: {
                    if (r0 >= r5.length) { $pc31 = 8; continue $sw31; }
                    r1 = r2.read(r5, r0, r5.length - r0);
                    if (r1 < 0) { $pc31 = 8; continue $sw31; }
                    r0 = r0 + r1;
                    $pc31 = 8; continue $sw31;
                }
                case 8: {
                    r3.j6(r5);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.lang.String r4) {
        java.io.File[] r5 = null;
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex32 = null;
        int $pc32 = -1;
        $sw32: while (true) {
            switch ($pc32) {
                case -1: {
                    r5 = FH(r4);
                    r0 = r5.length;
                    r1 = 0;
                    $pc32 = 3; continue $sw32;
                }
                case 3: {
                    if (r1 >= r0) { $pc32 = 5; continue $sw32; }
                    r5[r1].delete();
                    r1 = r1 + 1;
                    { $pc32 = 3; continue $sw32; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.lang.String r4, int r5) {
        com.crashlytics.android.core.Va.j6(Hw(), new com.crashlytics.android.core.W.d(r4 + "SessionEvent"), r5, v5);
    }

    private void j6(java.lang.String r8, java.lang.String r9, com.crashlytics.android.core.W.b r10) {
        com.crashlytics.android.core.ClassH r3 = null;
        com.crashlytics.android.core.ClassG r4 = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = -1;
        $sw33: while (true) {
            switch ($pc33) {
                case -1: {
                    r3 = null;
                    try {
                        r4 = new com.crashlytics.android.core.ClassG(Hw(), r8 + r9);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 9; continue $sw33;
                    }
                    try {
                        r3 = com.crashlytics.android.core.ClassH.j6(r4);
                        r10.j6(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 7; continue $sw33;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r3, "Failed to flush to session " + r9 + " file.");
                    io.fabric.sdk.android.services.common.i.j6(r4, "Failed to close session " + r9 + " file.");
                    return;
                }
                case 7: {
                    th = th;
                    $pc33 = 11; continue $sw33;
                }
                case 11: {
                    io.fabric.sdk.android.services.common.i.j6(r3, "Failed to flush to session " + r9 + " file.");
                    io.fabric.sdk.android.services.common.i.j6(r4, "Failed to close session " + r9 + " file.");
                    throw th;
                }
                case 9: {
                    th = th;
                    r4 = null;
                    { $pc33 = 11; continue $sw33; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.lang.String r8, java.lang.String r9, com.crashlytics.android.core.W.e r10) {
        java.io.FileOutputStream r2 = null;
        java.io.FileOutputStream r3 = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = -1;
        $sw34: while (true) {
            switch ($pc34) {
                case -1: {
                    r2 = null;
                    try {
                        r3 = new java.io.FileOutputStream(new java.io.File(Hw(), r8 + r9));
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 9; continue $sw34;
                    }
                    try {
                        r10.j6(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 7; continue $sw34;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r3, "Failed to close " + r9 + " file.");
                    return;
                }
                case 7: {
                    th = th;
                    r2 = r3;
                    $pc34 = 10; continue $sw34;
                }
                case 10: {
                    io.fabric.sdk.android.services.common.i.j6(r2, "Failed to close " + r9 + " file.");
                    throw th;
                }
                case 9: {
                    th = th;
                    { $pc34 = 10; continue $sw34; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.String r11 = null;
        java.lang.Object r1 = null;
        com.crashlytics.android.core.ClassH r2 = null;
        com.crashlytics.android.core.ClassG r13 = null;
        com.crashlytics.android.core.ClassH r14 = null;
        com.crashlytics.android.core.W r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex35 = null;
        int $pc35 = -1;
        $sw35: while (true) {
            switch ($pc35) {
                case -1: {
                    r11 = Ws();
                    r1 = 0;
                    r2 = null;
                    r2 = null;
                    r1 = 0;
                    if (r11 != null) { $pc35 = 6; continue $sw35; }
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Tried to write a non-fatal exception while no session was open.", null);
                    return;
                }
                case 6: {
                    Hw(r11, r18.getClass().getName());
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Crashlytics is logging non-fatal exception \"" + r18 + "\" from thread " + r17.getName());
                        r13 = new com.crashlytics.android.core.ClassG(Hw(), r11 + "SessionEvent" + io.fabric.sdk.android.services.common.i.DW(this.u7.getAndIncrement()));
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        if ($t instanceof java.lang.Exception) { $pc35 = 19; continue $sw35; }
                        $pc35 = 17; continue $sw35;
                    }
                    try {
                        r14 = com.crashlytics.android.core.ClassH.j6(r13);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        if ($t instanceof java.lang.Exception) { $pc35 = 15; continue $sw35; }
                        $pc35 = 29; continue $sw35;
                    }
                    r3 = this;
                    try {
                        r3.j6(r14, r16, r17, r18, "error", false);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        if ($t instanceof java.lang.Exception) { $pc35 = 13; continue $sw35; }
                        $pc35 = 11; continue $sw35;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r14, "Failed to flush to non-fatal file.");
                    r1 = r3;
                    $pc35 = 23; continue $sw35;
                }
                case 23: {
                    io.fabric.sdk.android.services.common.i.j6(r13, "Failed to close non-fatal file output stream.");
                    try {
                        j6(r11, 64);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        if ($t instanceof java.lang.Exception) { $pc35 = 26; continue $sw35; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 26: {
                    e = $ex35;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "An error occurred when trimming non-fatal files.", e);
                    return;
                }
                case 13: {
                    e = e;
                    r2 = r14;
                    $pc35 = 21; continue $sw35;
                }
                case 21: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "An error occurred in the non-fatal exception logger", e);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 29; continue $sw35;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r2, "Failed to flush to non-fatal file.");
                    r1 = r2;
                    $pc35 = 30; continue $sw35;
                }
                case 11: {
                    th = th;
                    r1 = r14;
                    $pc35 = 30; continue $sw35;
                }
                case 30: {
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to flush to non-fatal file.");
                    io.fabric.sdk.android.services.common.i.j6(r13, "Failed to close non-fatal file output stream.");
                    throw th;
                }
                case 15: {
                    e = e;
                    { $pc35 = 21; continue $sw35; }
                }
                case 29: {
                    th = th;
                    return;
                }
                case 19: {
                    e = e;
                    r13 = null;
                    return;
                }
                case 17: {
                    th = th;
                    r13 = null;
                    { $pc35 = 30; continue $sw35; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.util.Set<java.io.File> r2) {
        java.util.Iterator<java.io.File> r3 = null;
        java.lang.Throwable $ex36 = null;
        int $pc36 = -1;
        $sw36: while (true) {
            switch ($pc36) {
                case -1: {
                    r3 = r2.iterator();
                    $pc36 = 4; continue $sw36;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc36 = 6; continue $sw36; }
                    FH(r3.next());
                    { $pc36 = 4; continue $sw36; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(byte[] r4, java.io.File r5) {
        java.util.zip.GZIPOutputStream r0 = null;
        java.util.zip.GZIPOutputStream r1 = null;
        java.lang.Throwable $ex37 = null;
        int $pc37 = -1;
        $sw37: while (true) {
            switch ($pc37) {
                case -1: {
                    r0 = null;
                    try {
                        r1 = new java.util.zip.GZIPOutputStream(new java.io.FileOutputStream(r5));
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 9; continue $sw37;
                    }
                    try {
                        r1.write(r4);
                        r1.finish();
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 7; continue $sw37;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r1);
                    return;
                }
                case 7: {
                    th = th;
                    r0 = r1;
                    $pc37 = 10; continue $sw37;
                }
                case 10: {
                    io.fabric.sdk.android.services.common.i.j6(r0);
                    throw th;
                }
                case 9: {
                    th = th;
                    { $pc37 = 10; continue $sw37; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.io.File[] r7, int r8, int r9) {
        java.io.File r0 = null;
        java.lang.String r2 = null;
        java.lang.Throwable $ex38 = null;
        int $pc38 = -1;
        $sw38: while (true) {
            switch ($pc38) {
                case -1: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Closing open sessions.");
                    $pc38 = 4; continue $sw38;
                }
                case 4: {
                    if (r8 >= r7.length) { $pc38 = 6; continue $sw38; }
                    r0 = r7[r8];
                    r2 = j6(r0);
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Closing session: " + r2);
                    j6(r0, r2, r9);
                    r8 = r8 + 1;
                    { $pc38 = 4; continue $sw38; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.io.File[] r9, java.util.Set<java.lang.String> r10) {
        int r0 = 0;
        int r1 = 0;
        java.io.File r2 = null;
        java.lang.String r3 = null;
        java.util.regex.Matcher r4 = null;
        java.lang.Throwable $ex39 = null;
        int $pc39 = -1;
        $sw39: while (true) {
            switch ($pc39) {
                case -1: {
                    r0 = r9.length;
                    r1 = 0;
                    $pc39 = 3; continue $sw39;
                }
                case 3: {
                    if (r1 >= r0) { $pc39 = 11; continue $sw39; }
                    r2 = r9[r1];
                    r3 = r2.getName();
                    r4 = Zo.matcher(r3);
                    if (r4.matches() == true) { $pc39 = 8; continue $sw39; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Deleting unknown file: " + r3);
                    r2.delete();
                    $pc39 = 10; continue $sw39;
                }
                case 10: {
                    r1 = r1 + 1;
                    { $pc39 = 3; continue $sw39; }
                }
                case 8: {
                    if (r10.contains(r4.group(1)) == true) { $pc39 = 10; continue $sw39; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Trimming session file: " + r3);
                    r2.delete();
                    { $pc39 = 10; continue $sw39; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex40 = null;
        int $pc40 = -1;
        $sw40: while (true) {
            switch ($pc40) {
                case -1: {
                    if (r6.length <= r7) { $pc40 = 6; continue $sw40; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", java.lang.String.format(java.util.Locale.US, "Trimming down to %d logged exceptions.", new java.lang.Object[]{java.lang.Integer.valueOf(r7)}));
                    j6(r5, r7);
                    return j6(new com.crashlytics.android.core.W.d(r5 + "SessionEvent"));
                }
                case 6: {
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        com.crashlytics.android.core.ia r0 = null;
        java.lang.Throwable $ex41 = null;
        int $pc41 = -1;
        $sw41: while (true) {
            switch ($pc41) {
                case -1: {
                    r0 = this.yS;
                    if (r0 != null) { $pc41 = 5; continue $sw41; }
                    $pc41 = 7; continue $sw41;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r0.j6() == false) { $pc41 = 7; continue $sw41; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        abcd.Wz r0 = null;
        com.crashlytics.android.core.Interfaceka r1 = null;
        com.crashlytics.android.core.La.d r2 = null;
        java.lang.Throwable $ex42 = null;
        int $pc42 = -1;
        $sw42: while (true) {
            switch ($pc42) {
                case -1: {
                    if (r7 != null) { $pc42 = 5; continue $sw42; }
                    io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Could not send reports. Settings are not available.");
                    return;
                }
                case 5: {
                    r0 = r7.j6;
                    r1 = j6(r0.Hw, r0.v5);
                    if (FH(r7) == false) { $pc42 = 8; continue $sw42; }
                    r2 = new com.crashlytics.android.core.W.h(this.tp, this.J8, r7.FH);
                    $pc42 = 9; continue $sw42;
                }
                case 9: {
                    new com.crashlytics.android.core.La(this.QX.j6, r1, this.j3, this.Mr).j6(r6, r2);
                    return;
                }
                case 8: {
                    r2 = new com.crashlytics.android.core.La.a();
                    { $pc42 = 9; continue $sw42; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        boolean r5 = false;
        java.lang.Throwable $ex43 = null;
        int $pc43 = -1;
        $sw43: while (true) {
            switch ($pc43) {
                case -1: {
                    if (r4.Hw.v5 == false) { $pc43 = 6; continue $sw43; }
                    r5 = this.rN.j6();
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Registered Firebase Analytics event listener for breadcrumbs: " + r5);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    synchronized void j6(com.crashlytics.android.core.ia.b r10, java.lang.Thread r11, java.lang.Throwable r12, boolean r13) {
        synchronized (this) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex44 = null;
            int $pc44 = -1;
            $sw44: while (true) {
                switch ($pc44) {
                    case -1: {
                        try {
                            io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Crashlytics is handling uncaught exception \"" + r12 + "\" from thread " + r11.getName());
                            this.U2.j6();
                            this.EQ.DW(new com.crashlytics.android.core.T(this, new java.util.Date(), r11, r12, r10, r13));
                        } catch (java.lang.Throwable $t) {
                            $ex44 = $t;
                            $pc44 = 6; continue $sw44;
                        }
                        return;
                    }
                    case 6: {
                        th = $ex44;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
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
        java.util.HashSet r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.io.File r5 = null;
        java.io.File r11 = null;
        java.io.File[] r4 = null;
        int r6 = 0;
        java.io.File r7 = null;
        java.lang.Throwable $ex45 = null;
        int $pc45 = -1;
        $sw45: while (true) {
            switch ($pc45) {
                case -1: {
                    r0 = new java.util.HashSet();
                    r1 = r10.length;
                    r2 = 0;
                    r3 = 0;
                    $pc45 = 4; continue $sw45;
                }
                case 4: {
                    if (r3 >= r1) { $pc45 = 7; continue $sw45; }
                    r5 = r10[r3];
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Found invalid session part file: " + r5);
                    r0.add(j6(r5));
                    r3 = r3 + 1;
                    { $pc45 = 4; continue $sw45; }
                }
                case 7: {
                    if (r0.isEmpty() == false) { $pc45 = 9; continue $sw45; }
                    return;
                }
                case 9: {
                    r11 = v5();
                    if (r11.exists() == true) { $pc45 = 12; continue $sw45; }
                    r11.mkdir();
                    $pc45 = 12; continue $sw45;
                }
                case 12: {
                    r4 = j6(new com.crashlytics.android.core.ClassX(this, r0));
                    r6 = r4.length;
                    $pc45 = 13; continue $sw45;
                }
                case 13: {
                    if (r2 >= r6) { $pc45 = 18; continue $sw45; }
                    r7 = r4[r2];
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Moving session file: " + r7);
                    if (r7.renameTo(new java.io.File(r11, r7.getName())) == true) { $pc45 = 17; continue $sw45; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Could not move session file. Deleting " + r7);
                    r7.delete();
                    $pc45 = 17; continue $sw45;
                }
                case 17: {
                    r2 = r2 + 1;
                    { $pc45 = 13; continue $sw45; }
                }
                case 18: {
                    aM();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean j6(com.crashlytics.android.core.fa r3) {
        java.lang.Throwable $ex46 = null;
        int $pc46 = -1;
        $sw46: while (true) {
            switch ($pc46) {
                case -1: {
                    if (r3 != null) { $pc46 = 6; continue $sw46; }
                    return true;
                }
                case 6: {
                    return ((java.lang.Boolean) this.EQ.DW(new com.crashlytics.android.core.CallableC1975y(this, r3))).booleanValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
