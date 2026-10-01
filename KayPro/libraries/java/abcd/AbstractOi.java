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
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 4;
            $sw0: while (true) {
                switch ($pc0) {
                    case 8: {
                        th = $ex0;
                        if (Hw == false) { $pc0 = 12; continue $sw0; }
                        abcd.wu.j6(th, -2260724432237922420L, null, r6);
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (FH == false) { $pc0 = 6; continue $sw0; }
                        try {
                            abcd.wu.j6(-2260724432237922420L, null, r6);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        $pc0 = 6; continue $sw0;
                    }
                    case 6: {
                        try {
                            this.v5 = r6;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 8; continue $sw0;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        a(abcd.AbstractOi r8, abcd.ServiceConnectionKi r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 3;
            $sw1: while (true) {
                switch ($pc1) {
                    case 7: {
                        th = $ex1;
                        if (Hw == false) { $pc1 = 11; continue $sw1; }
                        abcd.wu.j6(th, 3045516327804306288L, null, r8, r9);
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (FH == false) { $pc1 = 5; continue $sw1; }
                        try {
                            abcd.wu.j6(3045516327804306288L, null, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 7; continue $sw1;
                        }
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        try {
                            this(r8);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 7; continue $sw1;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = -79683348119109457L)
        public void DW(java.lang.String r8, java.lang.String r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 3;
            $sw2: while (true) {
                switch ($pc2) {
                    case 11: {
                        th = $ex2;
                        if (Hw == false) { $pc2 = 15; continue $sw2; }
                        abcd.wu.j6(th, -2708104841865264099L, this, r8, r9);
                        $pc2 = 15; continue $sw2;
                    }
                    case 15: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (FH == false) { $pc2 = 5; continue $sw2; }
                        try {
                            abcd.wu.j6(-2708104841865264099L, this, r8, r9);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 11; continue $sw2;
                        }
                        $pc2 = 5; continue $sw2;
                    }
                    case 5: {
                        try {
                            abcd.AbstractOi.j6(this.v5, "licenseVerified: " + r8);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 11; continue $sw2;
                        }
                        if (android.os.Binder.getCallingUid() == android.os.Process.myUid()) { $pc2 = 9; continue $sw2; }
                        try {
                            abcd.AbstractOi.DW(this.v5, "UID mismatch - my uid: " + android.os.Process.myUid() + " calling uid: " + android.os.Binder.getCallingUid());
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 11; continue $sw2;
                        }
                        return;
                    }
                    case 9: {
                        try {
                            com.aide.ui.U.j6(new abcd.RunnableNi(this, r8, r9));
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 11; continue $sw2;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        @abcd.Interfacesu(method = -2243428915497216240L)
        public void XX() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 4;
            $sw3: while (true) {
                switch ($pc3) {
                    case 12: {
                        th = $ex3;
                        if (Hw == false) { $pc3 = 16; continue $sw3; }
                        abcd.wu.j6(th, -4562683260330864240L, this);
                        $pc3 = 16; continue $sw3;
                    }
                    case 16: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (FH == false) { $pc3 = 6; continue $sw3; }
                        try {
                            abcd.wu.j6(-4562683260330864240L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 12; continue $sw3;
                        }
                        $pc3 = 6; continue $sw3;
                    }
                    case 6: {
                        try {
                            abcd.AbstractOi.j6(this.v5, "licenseNotVerified");
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 12; continue $sw3;
                        }
                        if (android.os.Binder.getCallingUid() == android.os.Process.myUid()) { $pc3 = 10; continue $sw3; }
                        try {
                            abcd.AbstractOi.DW(this.v5, "UID mismatch - my uid: " + android.os.Process.myUid() + " calling uid: " + android.os.Binder.getCallingUid());
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 12; continue $sw3;
                        }
                        return;
                    }
                    case 10: {
                        try {
                            com.aide.ui.U.j6(new abcd.RunnableMi(this));
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 12; continue $sw3;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        abcd.wu.j6(abcd.AbstractOi.class, -6228992669085397497L, -6228992669085397497L);
    }

    public AbstractOi(java.lang.String r10, java.lang.String r11, int r12, java.lang.String r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 7: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 11; continue $sw4; }
                    abcd.wu.j6(th, -3038348709593117004L, null, r10, r11, new java.lang.Integer(r12), r13);
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(-3038348709593117004L, null, r10, r11, new java.lang.Integer(r12), r13);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 7; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    try {
                        this.Zo = new abcd.AbstractOi.a(this, null);
                        this.VH = r10;
                        this.gn = r11;
                        this.u7 = r12;
                        this.tp = r13;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 7; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void DW(abcd.AbstractOi r0, java.lang.String r1) {
        r0.FH(r1);
    }

    @abcd.Interfacesu(method = -1370846427655774193L)
    private void DW(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -5382733115908416264L, this, r5);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-5382733115908416264L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        abcd.ue.j6("(" + this.VH + ") " + r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 6340873389908543052L)
    private void FH(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 2168766339546846501L, this, r5);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(2168766339546846501L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        abcd.ue.DW("(" + this.VH + ") " + r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4602333303917591165L)
    private void VH() {
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 11: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 15; continue $sw7; }
                    abcd.wu.j6(th, 7356759073356652992L, this);
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 18; continue $sw7; }
                    try {
                        abcd.wu.j6(7356759073356652992L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    $pc7 = 18; continue $sw7;
                }
                case 18: {
                    try {
                        DW("Requesting license check");
                        this.FH.j6(this.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof android.os.RemoteException) { $pc7 = 8; continue $sw7; }
                        $pc7 = 11; continue $sw7;
                    }
                    $pc7 = 20; continue $sw7;
                }
                case 20: {
                    return;
                }
                case 8: {
                    e = $ex7;
                    try {
                        j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2420763878479367811L)
    private void Zo() {
        boolean r2 = false;
        android.content.Intent r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 19: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 23; continue $sw8; }
                    abcd.wu.j6(th, 7596241288596834744L, this);
                    $pc8 = 23; continue $sw8;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 7; continue $sw8; }
                    try {
                        abcd.wu.j6(7596241288596834744L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 19; continue $sw8;
                    }
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (this.FH == null) { $pc8 = 10; continue $sw8; }
                    try {
                        VH();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 19; continue $sw8;
                    }
                    return;
                }
                case 10: {
                    if (this.v5 == true) { $pc8 = 17; continue $sw8; }
                    try {
                        this.Hw = new abcd.ServiceConnectionKi(this);
                        DW("Binding to " + com.aide.licensing.IAideLicensingService.class.getName());
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 19; continue $sw8;
                    }
                    r2 = false;
                    try {
                        r3 = new android.content.Intent(this.tp);
                        r3.setPackage(this.VH);
                        r2 = com.aide.ui.U.Zo().bindService(r3, this.Hw, 1);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 24; continue $sw8; }
                        $pc8 = 19; continue $sw8;
                    }
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    if (r2 == false) { $pc8 = 16; continue $sw8; }
                    try {
                        this.v5 = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 19; continue $sw8;
                    }
                    return;
                }
                case 16: {
                    try {
                        DW("Licensing service could not be bound");
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 19; continue $sw8;
                    }
                    return;
                }
                case 17: {
                    try {
                        DW("Licensing service bind already pending");
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 19; continue $sw8;
                    }
                    return;
                }
                case 24: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, -6818064566062512009L, this, r5);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(-6818064566062512009L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        abcd.ue.j6("(" + this.VH + ")", r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -5998873921622435375L)
    private void j6(java.lang.String r11, java.lang.String r12) {
        com.aide.licensing.f.a r0 = null;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 22: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 26; continue $sw10; }
                    abcd.wu.j6(th, -5057723731334384124L, this, r11, r12);
                    $pc10 = 26; continue $sw10;
                }
                case 26: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc10 = 5; continue $sw10; }
                    try {
                        abcd.wu.j6(-5057723731334384124L, this, r11, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 22; continue $sw10;
                    }
                    $pc10 = 5; continue $sw10;
                }
                case 5: {
                    try {
                        r0 = com.aide.licensing.f.j6(com.aide.ui.U.Zo(), -1, -1, -1, this.VH, r11, r12, this.gn);
                        r1 = abcd.Li.j6[r0.ordinal()];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 22; continue $sw10;
                    }
                    if (r1 != 1) { $pc10 = 8; continue $sw10; }
                    $pc10 = 20; continue $sw10;
                }
                case 20: {
                    try {
                        j6(com.aide.licensing.f.j6(r11, r12, this.gn).EQ);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 22; continue $sw10;
                    }
                    return;
                }
                case 8: {
                    if (r1 == 2) { $pc10 = 20; continue $sw10; }
                    if (r1 != 3) { $pc10 = 12; continue $sw10; }
                    try {
                        j6("OVER_GRACE_PERIOD");
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 22; continue $sw10;
                    }
                    return;
                }
                case 12: {
                    if (r1 != 4) { $pc10 = 14; continue $sw10; }
                    try {
                        j6("NOT_LICENSED");
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 22; continue $sw10;
                    }
                    return;
                }
                case 14: {
                    if (r1 != 5) { $pc10 = 17; continue $sw10; }
                    try {
                        j6("TEMPORARY_ERROR");
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 22; continue $sw10;
                    }
                    return;
                }
                case 17: {
                    try {
                        throw new java.lang.RuntimeException("Unknown LicenseVerificationResult " + r0);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 22; continue $sw10;
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(abcd.AbstractOi r0, boolean r1) {
        r0.v5 = r1;
        return r1;
    }

    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 7: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 11; continue $sw11; }
                    abcd.wu.j6(th, 1939618777909265128L, this);
                    $pc11 = 11; continue $sw11;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc11 = 14; continue $sw11; }
                    try {
                        abcd.wu.j6(1939618777909265128L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 7; continue $sw11;
                    }
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 11: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 15; continue $sw12; }
                    abcd.wu.j6(th, 6360085930485499135L, this);
                    $pc12 = 15; continue $sw12;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(6360085930485499135L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 11; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    if (com.aide.ui.U.Zo().getPackageManager().checkSignatures(this.VH, "com.aide.ui") != 0) { $pc12 = 9; continue $sw12; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void Hw();

    public void j6() {
        android.content.pm.PackageManager r2 = null;
        boolean r3 = false;
        boolean r4 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 23: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 27; continue $sw13; }
                    abcd.wu.j6(th, -170208189781830628L, this);
                    $pc13 = 27; continue $sw13;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 7; continue $sw13; }
                    try {
                        abcd.wu.j6(-170208189781830628L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 23; continue $sw13;
                    }
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (com.aide.ui.U.j6.equals("com.aide.phonegap") == false) { $pc13 = 9; continue $sw13; }
                    return;
                }
                case 9: {
                    try {
                        r2 = com.aide.ui.U.Zo().getPackageManager();
                        r3 = FH();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 23; continue $sw13;
                    }
                    r4 = false;
                    if (r3 == true) { $pc13 = 28; continue $sw13; }
                    $pc13 = 16; continue $sw13;
                }
                case 16: {
                    if (r3 == false) { $pc13 = 19; continue $sw13; }
                    if (r4 == false) { $pc13 = 19; continue $sw13; }
                    try {
                        Zo();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 23; continue $sw13;
                    }
                    return;
                }
                case 19: {
                    if (r3 == false) { $pc13 = 32; continue $sw13; }
                    if (r4 == true) { $pc13 = 33; continue $sw13; }
                    try {
                        Hw();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 23; continue $sw13;
                    }
                    return;
                }
                case 33: {
                    return;
                }
                case 32: {
                    return;
                }
                case 28: {
                    if (r2.getPackageInfo(this.VH, 0).versionCode < this.u7) { $pc13 = 16; continue $sw13; }
                    r4 = true;
                    { $pc13 = 16; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void j6(long r1);

    protected abstract void j6(java.lang.String r1);

    public void v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 10: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 14; continue $sw14; }
                    abcd.wu.j6(th, -2677966163372558652L, this);
                    $pc14 = 14; continue $sw14;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 7; continue $sw14; }
                    try {
                        abcd.wu.j6(-2677966163372558652L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 10; continue $sw14;
                    }
                    $pc14 = 7; continue $sw14;
                }
                case 7: {
                    if (this.FH == null) { $pc14 = 17; continue $sw14; }
                    try {
                        DW("Unbinding license service");
                        com.aide.ui.U.Zo().unbindService(this.Hw);
                        this.Hw = null;
                        this.v5 = false;
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 10; continue $sw14;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
