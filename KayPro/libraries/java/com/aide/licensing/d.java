package com.aide.licensing;

@abcd.Interfacexu
public class d {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -2058651584078755015L)
    private com.aide.licensing.g EQ;

    @abcd.Interfaceru(field = -2512952542514638600L)
    private com.android.vending.licensing.ILicensingService FH;

    @abcd.Interfaceru(field = 496542026622531780L)
    private android.content.ServiceConnection Hw;

    @abcd.Interfaceru(field = 4206743962334186687L)
    private long VH;

    @abcd.Interfaceru(field = -1505747536030087413L)
    private long Zo;

    @abcd.Interfaceru(field = 1828798445655587952L)
    private android.content.Context gn;

    @abcd.Interfaceru(field = 2762961747722253723L)
    private android.os.Handler tp;

    @abcd.Interfaceru(field = -5648668544183493780L)
    private boolean u7;

    @abcd.Interfaceru(field = 345655218644649489L)
    private boolean v5;

    @abcd.Interfacexu
    private class a extends com.android.vending.licensing.a.AbstractBinderC0055a {

        @abcd.Interfacetu
        private static boolean FH;

        @abcd.Interfaceuu
        private static boolean Hw;

        @abcd.Interfacevu
        final com.aide.licensing.d Zo;

        @abcd.Interfaceru(field = -439940160593241037L)
        private long v5;

        static {
            abcd.wu.j6(com.aide.licensing.d.a.class, -90332927685326755L, -90332927685326755L);
        }

        @abcd.Interfacesu(method = 217334903144526112L)
        public a(com.aide.licensing.d r8, long r9) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = 3;
            $sw0: while (true) {
                switch ($pc0) {
                    case 7: {
                        th = $ex0;
                        if (Hw == false) { $pc0 = 11; continue $sw0; }
                        abcd.wu.j6(th, 4601674493633101729L, null, r8, new java.lang.Long(r9));
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (FH == false) { $pc0 = 5; continue $sw0; }
                        try {
                            abcd.wu.j6(4601674493633101729L, null, r8, new java.lang.Long(r9));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        try {
                            this.Zo = r8;
                            this.v5 = r9;
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 7; continue $sw0;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static long j6(com.aide.licensing.d.a r2) {
            return r2.v5;
        }

        @Override
        @abcd.Interfacesu(method = 1240417823567612072L)
        public void j6(int r9, java.lang.String r10, java.lang.String r11) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = 3;
            $sw1: while (true) {
                switch ($pc1) {
                    case 7: {
                        th = $ex1;
                        if (Hw == false) { $pc1 = 11; continue $sw1; }
                        abcd.wu.j6(th, -177146904446841200L, this, new java.lang.Integer(r9), r10, r11);
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (FH == false) { $pc1 = 5; continue $sw1; }
                        try {
                            abcd.wu.j6(-177146904446841200L, this, new java.lang.Integer(r9), r10, r11);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 7; continue $sw1;
                        }
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        try {
                            com.aide.licensing.d.DW(this.Zo).post(new com.aide.licensing.c(this, r9, r10, r11));
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
    }

    static {
        abcd.wu.j6(com.aide.licensing.d.class, 2773153765153353776L, 2773153765153353776L);
    }

    public d() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 1688200213923072072L, null);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(1688200213923072072L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.os.Handler DW(com.aide.licensing.d r0) {
        return r0.tp;
    }

    @abcd.Interfacesu(method = 4356939747947333044L)
    private java.lang.String Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 20: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 24; continue $sw3; }
                    abcd.wu.j6(th, -7163474981163740260L, this);
                    $pc3 = 24; continue $sw3;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 7; continue $sw3; }
                    try {
                        abcd.wu.j6(-7163474981163740260L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 20; continue $sw3;
                    }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (Zo().equals("com.aide.premium.key") == false) { $pc3 = 11; continue $sw3; }
                    return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkjXTkIvABlLJgyvluBm4h4Ytw87BbBrSRXohMVMvk0Eq2pYJKT1jYfC1W65/YY5GcFYwMiaemVlpH40h/h+rkm+GYYq04awtN8zv35+HymbrW6ztGgNv7gF7ksAOOb8swqQwlx6uzfZWzbny7r9kkKURlXWmpkcKpWUjfoQ1MIRFxuXoJ2owTjvdkezI2hjCxC+NJ57QCG8tBoWJo5jscDRylHuaXBGVX7fJx7NsWzlk9xTXUFE7F8J5OaPRpgCNwo+xC0pXSoA/yCv1dOy4v2tPr9L9rfB95nrTwRs1ob44LOY3UqYgVMC1wpy+nxU6UGch8g8/DfHXfaefBcsbfwIDAQAB";
                }
                case 11: {
                    if (Zo().equals("com.aide.java.premium.key") == false) { $pc3 = 14; continue $sw3; }
                    return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAn+LHwdRGxOPUMAOl1xlpO/jK/2cqCBxkbIlP0fjvubrkNhj+TdoFzXAPEVJQDmBhRdgfOW7T1JyNDKjQYHqvsqxecl5DSxy+e2c3do2+OmtXDgsCZnwsPoQKZlXqYmr2m7oohe+ogGQ6dvK5ToyLEHtJu6zBs4HNrHEDJAZz4+eG8UydfPJut0VaBxFhLTwdInzILO27JcabVjNWSbMj/3ClErZjcaM9wBhPaftBFpyQWBiIVL5dULHspqlXsiVljpIvz1UTwkHwE+hqJPhPGLBIe6xqNPyv16IOssFskia97yekprSeoMaP0xzc/c7KT2sqsVuCUJsm41yDbqvIDwIDAQAB";
                }
                case 14: {
                    if (Zo().equals("com.aide.designer") == false) { $pc3 = 18; continue $sw3; }
                    return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAscoEgrFdBkxPcWpFbDQhJaTdZ92LV4sGN7NdUmkp1OIL9m9vO8cYFRU2ZCpHEQ+gilfA2T37855hqegNJfv3Uv/Rh9gZYy+cEGyqEnZyjZ0eYXEMcRmuvLNCrkFpg8xlzRpAvwMB7Tseez5GSYuwefuSle5OBLYrKYxZ14qIiHBwYrS338+v0jIav07YAlwxqkLIEWikNN0lI7ZuJlhcgIiwCJCDT9WtHaU8GgOGYh4cTLnuNAo5FOsSNnEmSmdc4jRyWCPSSETMs+fbEy3BsDKpaO4I2b/VO0/GVmyI9jkYJgkmx/33gYKSTRw9BZR3yy7Vtnq64/afnSoMYqzkDQIDAQAB";
                }
                case 18: {
                    return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh9PowqySSG6WBaQx3i5y+3vjHUlva+HzWV7ZlYCkMdY5rHxp48M566VZjQVPV9xF0a47f0n0kdECfNGcLvLtQdB6rhk1xW6ouQG+uCiLmjLomLVZbaHPS7kDDP0ETU7SpVksPfPFlHCNLgZ/68HQzWMv7WmQ5Y1+9x3QQ4EfC3gsQdftsNyjSr7GZ7oR3dMDPyMkjNa5tHi4ZzSEHJQyutD7ezURXAsmyEvFUphp871vKCHNrNA+NHt2KMptZdRuCpip6yr6yyD1uFGWZ7XDEtu9Gtt93dWlC6PyecA21LHbGGbv6M9T5WkyqYRyorDKxdfOXIYuuW2I5PdmiE//+wIDAQAB";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 41736832369318944L)
    private java.lang.String[] VH() {
        java.io.File r2 = null;
        java.io.FileReader r3 = null;
        java.io.StringWriter r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 15: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 19; continue $sw4; }
                    abcd.wu.j6(th, 5306356262044124480L, this);
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(5306356262044124480L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        r2 = v5();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    if (r2.isFile() == true) { $pc4 = 21; continue $sw4; }
                    return null;
                }
                case 21: {
                    try {
                        r3 = new java.io.FileReader(r2);
                        r4 = new java.io.StringWriter();
                        abcd.ve.j6(r3, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 12; continue $sw4; }
                        $pc4 = 15; continue $sw4;
                    }
                    return r4.toString().split("\u0000");
                }
                case 12: {
                    e = $ex4;
                    try {
                        abcd.ue.j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2934235875277803685L)
    private java.lang.String Zo() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -1806130113672571385L, this);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-1806130113672571385L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return this.gn.getApplicationContext().getPackageName();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -7862113735668787868L)
    private void gn() {
        long r2 = 0L;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 15: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 19; continue $sw6; }
                    abcd.wu.j6(th, -3785385826124745108L, this);
                    $pc6 = 19; continue $sw6;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 7; continue $sw6; }
                    try {
                        abcd.wu.j6(-3785385826124745108L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (java.lang.System.currentTimeMillis() >= (this.VH + 60000)) { $pc6 = 20; continue $sw6; }
                    try {
                        abcd.ue.j6("License check responsed pending - throttled");
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    return;
                }
                case 20: {
                    try {
                        abcd.ue.j6("Requesting license check");
                        r2 = com.aide.licensing.i.j6(this.gn);
                        this.FH.j6(r2, Zo(), new com.aide.licensing.d.a(this, r2));
                        this.VH = java.lang.System.currentTimeMillis();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof android.os.RemoteException) { $pc6 = 12; continue $sw6; }
                        $pc6 = 15; continue $sw6;
                    }
                    $pc6 = 23; continue $sw6;
                }
                case 23: {
                    return;
                }
                case 12: {
                    e = $ex6;
                    try {
                        abcd.ue.j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 15; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static long j6(com.aide.licensing.d r0, long r1) {
        r0.VH = r1;
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    @abcd.Interfacesu(method = 2213268228625464729L)
    private com.aide.licensing.f.a j6(long r18, int r20, java.lang.String r21, java.lang.String r22, boolean r23) {
        java.lang.Object r13 = null;
        int r1 = 0;
        android.content.pm.PackageInfo r0 = null;
        int r5 = 0;
        boolean r16 = false;
        boolean r14 = false;
        com.aide.licensing.f.a r2 = null;
        int r3 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r13 = r20;
                    $pc7 = 81; continue $sw7;
                }
                case 81: {
                    th = th;
                    r13 = r23;
                    $pc7 = 84; continue $sw7;
                }
                case 84: {
                    if (DW == false) { $pc7 = 86; continue $sw7; }
                    abcd.wu.j6(th, 181994932081715397L, this, new java.lang.Long(r18), new java.lang.Integer(r20), r21, r22, new java.lang.Boolean(r13));
                    $pc7 = 86; continue $sw7;
                }
                case 86: {
                    throw th;
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(181994932081715397L, this, new java.lang.Long(r18), new java.lang.Integer(r13 == true ? 1 : 0), r21, r22, new java.lang.Boolean(r23));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 81; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    r1 = -1;
                    try {
                        r0 = this.gn.getPackageManager().getPackageInfo(this.gn.getPackageName(), 0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof android.content.pm.PackageManager.NameNotFoundException) { $pc7 = 14; continue $sw7; }
                        $pc7 = 12; continue $sw7;
                    }
                    if (r23 == true) { $pc7 = 11; continue $sw7; }
                    try {
                        r1 = r0.versionCode;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof android.content.pm.PackageManager.NameNotFoundException) { $pc7 = 14; continue $sw7; }
                        $pc7 = 12; continue $sw7;
                    }
                    $pc7 = 11; continue $sw7;
                }
                case 11: {
                    r5 = r1;
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    r16 = false;
                    r14 = r23;
                    try {
                        r2 = com.aide.licensing.f.j6(this.gn, r18, r20, r5, Zo(), r21, r22, Hw());
                        r3 = com.aide.licensing.b.j6[r2.ordinal()];
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 73; continue $sw7;
                    }
                    if (r3 != 1) { $pc7 = 21; continue $sw7; }
                    $pc7 = 47; continue $sw7;
                }
                case 47: {
                    try {
                        com.aide.licensing.LicenseUpdateAlarmReceiver.j6(this.gn);
                        this.Zo = com.aide.licensing.f.j6(r21, r22, Hw()).tp;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 73; continue $sw7;
                    }
                    if (r14 == true) { $pc7 = 53; continue $sw7; }
                    if (r2 != com.aide.licensing.f.a.j6) { $pc7 = 53; continue $sw7; }
                    try {
                        j6(r21, r22);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 73; continue $sw7;
                    }
                    $pc7 = 53; continue $sw7;
                }
                case 53: {
                    if (r2 != com.aide.licensing.f.a.j6) { $pc7 = 55; continue $sw7; }
                    $pc7 = 56; continue $sw7;
                }
                case 56: {
                    r16 = true;
                    $pc7 = 58; continue $sw7;
                }
                case 58: {
                    if (this.u7 == false) { $pc7 = 60; continue $sw7; }
                    $pc7 = 67; continue $sw7;
                }
                case 67: {
                    try {
                        com.aide.licensing.LicenseUpdateAlarmReceiver.j6(this.gn);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 73; continue $sw7;
                    }
                    $pc7 = 68; continue $sw7;
                }
                case 68: {
                    if (r14 == false) { $pc7 = 70; continue $sw7; }
                    $pc7 = 72; continue $sw7;
                }
                case 72: {
                    return r2;
                }
                case 70: {
                    if (this.u7 == false) { $pc7 = 72; continue $sw7; }
                    try {
                        u7();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 79; continue $sw7;
                    }
                    { $pc7 = 72; continue $sw7; }
                }
                case 60: {
                    if (this.EQ == null) { $pc7 = 67; continue $sw7; }
                    if (r16 == false) { $pc7 = 63; continue $sw7; }
                    try {
                        this.EQ.DW(r21, r22);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof android.os.RemoteException) { $pc7 = 65; continue $sw7; }
                        $pc7 = 73; continue $sw7;
                    }
                    $pc7 = 98; continue $sw7;
                }
                case 98: {
                    $pc7 = 63; continue $sw7;
                }
                case 63: {
                    try {
                        this.EQ.XX();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof android.os.RemoteException) { $pc7 = 65; continue $sw7; }
                        $pc7 = 73; continue $sw7;
                    }
                    $pc7 = 65; continue $sw7;
                }
                case 65: {
                    e = $ex7;
                    try {
                        abcd.ue.j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 73; continue $sw7;
                    }
                    { $pc7 = 67; continue $sw7; }
                }
                case 55: {
                    if (r2 != com.aide.licensing.f.a.DW) { $pc7 = 58; continue $sw7; }
                    $pc7 = 21; continue $sw7;
                }
                case 21: {
                    if (r3 == 2) { $pc7 = 47; continue $sw7; }
                    if (r3 == 3) { $pc7 = 47; continue $sw7; }
                    if (r3 == 4) { $pc7 = 39; continue $sw7; }
                    if (r3 == 5) { $pc7 = 68; continue $sw7; }
                    if (this.u7 == false) { $pc7 = 31; continue $sw7; }
                    $pc7 = 36; continue $sw7;
                }
                case 36: {
                    try {
                        this.Zo = java.lang.System.currentTimeMillis() + 3600000;
                        throw new java.lang.RuntimeException("Unknown LicenseVerificationResult " + r2);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 73; continue $sw7;
                    }
                }
                case 31: {
                    if (this.EQ == null) { $pc7 = 36; continue $sw7; }
                    try {
                        this.EQ.XX();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof android.os.RemoteException) { $pc7 = 34; continue $sw7; }
                        $pc7 = 73; continue $sw7;
                    }
                    $pc7 = 34; continue $sw7;
                }
                case 34: {
                    e = $ex7;
                    try {
                        abcd.ue.j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 73; continue $sw7;
                    }
                    { $pc7 = 36; continue $sw7; }
                }
                case 39: {
                    if (this.u7 == false) { $pc7 = 41; continue $sw7; }
                    $pc7 = 46; continue $sw7;
                }
                case 46: {
                    try {
                        this.Zo = java.lang.System.currentTimeMillis() + 3600000;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 73; continue $sw7;
                    }
                    { $pc7 = 68; continue $sw7; }
                }
                case 41: {
                    if (this.EQ == null) { $pc7 = 46; continue $sw7; }
                    try {
                        this.EQ.XX();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof android.os.RemoteException) { $pc7 = 44; continue $sw7; }
                        $pc7 = 73; continue $sw7;
                    }
                    $pc7 = 44; continue $sw7;
                }
                case 44: {
                    e = $ex7;
                    try {
                        abcd.ue.j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 73; continue $sw7;
                    }
                    $pc7 = 73; continue $sw7;
                }
                case 73: {
                    th = th;
                    $pc7 = 74; continue $sw7;
                }
                case 74: {
                    if (r14 == false) { $pc7 = 76; continue $sw7; }
                    $pc7 = 78; continue $sw7;
                }
                case 78: {
                    try {
                        throw th;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 79; continue $sw7;
                    }
                }
                case 76: {
                    if (this.u7 == false) { $pc7 = 78; continue $sw7; }
                    try {
                        u7();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 79; continue $sw7;
                    }
                    $pc7 = 14; continue $sw7;
                }
                case 14: {
                    e = $ex7;
                    try {
                        abcd.ue.j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 12; continue $sw7;
                    }
                    r5 = -1;
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    th = th;
                    r14 = r23;
                    $pc7 = 79; continue $sw7;
                }
                case 79: {
                    th = th;
                    { $pc7 = 84; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.android.vending.licensing.ILicensingService j6(com.aide.licensing.d r0, com.android.vending.licensing.ILicensingService r1) {
        r0.FH = r1;
        return r1;
    }

    @abcd.Interfacesu(method = 715154442785351339L)
    private void j6(long r10, int r12, java.lang.String r13, java.lang.String r14) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 7: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 11; continue $sw8; }
                    abcd.wu.j6(th, 440777614008551735L, this, new java.lang.Long(r10), new java.lang.Integer(r12), r13, r14);
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(440777614008551735L, this, new java.lang.Long(r10), new java.lang.Integer(r12), r13, r14);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    try {
                        j6(r10, r12, r13, r14, false);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.aide.licensing.d r0) {
        r0.gn();
    }

    static void j6(com.aide.licensing.d r0, long r1, int r3, java.lang.String r4, java.lang.String r5) {
        r0.j6(r1, r3, r4, r5);
    }

    @abcd.Interfacesu(method = 532025155659076464L)
    private void j6(java.lang.String r9, java.lang.String r10) {
        java.io.FileWriter r1 = null;
        java.io.IOException e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 33: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 38; continue $sw9; }
                    abcd.wu.j6(th, 3833499257148565160L, this, r9, r10);
                    $pc9 = 38; continue $sw9;
                }
                case 38: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc9 = 41; continue $sw9; }
                    try {
                        abcd.wu.j6(3833499257148565160L, this, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    $pc9 = 41; continue $sw9;
                }
                case 41: {
                    try {
                        r1 = new java.io.FileWriter(v5());
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.io.IOException) { $pc9 = 17; continue $sw9; }
                        $pc9 = 15; continue $sw9;
                    }
                    try {
                        r1.write(r9);
                        r1.write(0);
                        r1.write(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.io.IOException) { $pc9 = 13; continue $sw9; }
                        $pc9 = 26; continue $sw9;
                    }
                    try {
                        r1.close();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.io.IOException) { $pc9 = 10; continue $sw9; }
                        $pc9 = 33; continue $sw9;
                    }
                    $pc9 = 40; continue $sw9;
                }
                case 40: {
                    return;
                }
                case 10: {
                    e = e;
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    try {
                        abcd.ue.j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    return;
                }
                case 13: {
                    e = e;
                    $pc9 = 19; continue $sw9;
                }
                case 19: {
                    try {
                        abcd.ue.j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 26; continue $sw9;
                    }
                    if (r1 == null) { $pc9 = 40; continue $sw9; }
                    try {
                        r1.close();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.io.IOException) { $pc9 = 23; continue $sw9; }
                        $pc9 = 33; continue $sw9;
                    }
                    $pc9 = 23; continue $sw9;
                }
                case 23: {
                    e = e;
                    { $pc9 = 11; continue $sw9; }
                }
                case 26: {
                    th = th;
                    $pc9 = 27; continue $sw9;
                }
                case 27: {
                    if (r1 != null) { $pc9 = 45; continue $sw9; }
                    $pc9 = 32; continue $sw9;
                }
                case 32: {
                    try {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                }
                case 45: {
                    try {
                        r1.close();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.io.IOException) { $pc9 = 30; continue $sw9; }
                        $pc9 = 33; continue $sw9;
                    }
                    $pc9 = 30; continue $sw9;
                }
                case 30: {
                    e = $ex9;
                    try {
                        abcd.ue.j6(e);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 33; continue $sw9;
                    }
                    $pc9 = 17; continue $sw9;
                }
                case 17: {
                    e = $ex9;
                    r1 = null;
                    e = e;
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    th = $ex9;
                    r1 = null;
                    th = th;
                    { $pc9 = 27; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(com.aide.licensing.d r0, boolean r1) {
        r0.v5 = r1;
        return r1;
    }

    @abcd.Interfacesu(method = 1260346338860274744L)
    private com.aide.licensing.f.a tp() {
        java.lang.String[] r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 15: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 19; continue $sw10; }
                    abcd.wu.j6(th, 1917750026386113920L, this);
                    $pc10 = 19; continue $sw10;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(1917750026386113920L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 15; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    try {
                        r2 = VH();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 15; continue $sw10;
                    }
                    if (r2 == null) { $pc10 = 14; continue $sw10; }
                    if (r2.length != 2) { $pc10 = 14; continue $sw10; }
                    return j6(-1, -1, r2[0], r2[1], true);
                }
                case 14: {
                    return com.aide.licensing.f.a.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -693377464180282975L)
    private void u7() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, -638749578083613499L, this);
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(-638749578083613499L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    try {
                        abcd.ue.j6("Stopping LicenseUpdateService");
                        this.gn.stopService(new android.content.Intent(this.gn, com.aide.licensing.LicenseUpdateService.class));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -5158803844777835567L)
    private java.io.File v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 8: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 12; continue $sw12; }
                    abcd.wu.j6(th, -3850333796794209811L, this);
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(-3850333796794209811L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    return new java.io.File(this.gn.getFilesDir(), "license.txt");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        com.aide.licensing.f.a r2 = null;
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 16: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 20; continue $sw13; }
                    abcd.wu.j6(th, 272400898447333665L, this);
                    $pc13 = 20; continue $sw13;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(272400898447333665L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 16; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    try {
                        r2 = tp();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 16; continue $sw13;
                    }
                    r3 = true;
                    if (r2 == com.aide.licensing.f.a.DW) { $pc13 = 11; continue $sw13; }
                    if (r2 == com.aide.licensing.f.a.FH) { $pc13 = 11; continue $sw13; }
                    $pc13 = 13; continue $sw13;
                }
                case 13: {
                    if (r3 == false) { $pc13 = 23; continue $sw13; }
                    try {
                        u7();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 16; continue $sw13;
                    }
                    return;
                }
                case 23: {
                    return;
                }
                case 11: {
                    if (j6(null) == false) { $pc13 = 13; continue $sw13; }
                    r3 = false;
                    { $pc13 = 13; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 10: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 14; continue $sw14; }
                    abcd.wu.j6(th, -2810366303274470976L, this);
                    $pc14 = 14; continue $sw14;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 7; continue $sw14; }
                    try {
                        abcd.wu.j6(-2810366303274470976L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 10; continue $sw14;
                    }
                    $pc14 = 7; continue $sw14;
                }
                case 7: {
                    if (this.FH == null) { $pc14 = 17; continue $sw14; }
                    try {
                        abcd.ue.j6("License service shutdown");
                        this.gn.unbindService(this.Hw);
                        this.Hw = null;
                        this.EQ = null;
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

    public void j6(android.content.Context r8, boolean r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 3;
        $sw15: while (true) {
            switch ($pc15) {
                case 7: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 11; continue $sw15; }
                    abcd.wu.j6(th, 2471490827726034832L, this, r8, new java.lang.Boolean(r9));
                    $pc15 = 11; continue $sw15;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc15 = 5; continue $sw15; }
                    try {
                        abcd.wu.j6(2471490827726034832L, this, r8, new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 7; continue $sw15;
                    }
                    $pc15 = 5; continue $sw15;
                }
                case 5: {
                    try {
                        this.gn = r8;
                        this.tp = new android.os.Handler();
                        this.u7 = r9;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 7; continue $sw15;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 8: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 12; continue $sw16; }
                    abcd.wu.j6(th, -6796593317997719007L, this);
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(-6796593317997719007L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    return v5().isFile();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(com.aide.licensing.g r9) {
        com.aide.licensing.f.a r2 = null;
        int r3 = 0;
        android.content.Intent r4 = null;
        boolean r5 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 33: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 37; continue $sw17; }
                    abcd.wu.j6(th, 2858423354287112887L, this, r9);
                    $pc17 = 37; continue $sw17;
                }
                case 37: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(2858423354287112887L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 33; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    try {
                        this.EQ = r9;
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 33; continue $sw17;
                    }
                    if (java.lang.System.currentTimeMillis() >= this.Zo) { $pc17 = 9; continue $sw17; }
                    return false;
                }
                case 9: {
                    try {
                        r2 = tp();
                        r3 = com.aide.licensing.b.j6[r2.ordinal()];
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 33; continue $sw17;
                    }
                    if (r3 != 1) { $pc17 = 12; continue $sw17; }
                    return false;
                }
                case 12: {
                    if (r3 == 2) { $pc17 = 21; continue $sw17; }
                    if (r3 == 3) { $pc17 = 21; continue $sw17; }
                    if (r3 == 4) { $pc17 = 21; continue $sw17; }
                    try {
                        throw new java.lang.RuntimeException("Unknown LicenseVerificationResult " + r2);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 33; continue $sw17;
                    }
                }
                case 21: {
                    if (this.FH == null) { $pc17 = 24; continue $sw17; }
                    try {
                        gn();
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 33; continue $sw17;
                    }
                    $pc17 = 31; continue $sw17;
                }
                case 31: {
                    return true;
                }
                case 24: {
                    if (this.v5 == true) { $pc17 = 30; continue $sw17; }
                    try {
                        this.Hw = new com.aide.licensing.a(this);
                        r4 = new android.content.Intent("com.android.vending.licensing.ILicensingService");
                        r4.setPackage("com.android.vending");
                        r5 = this.gn.bindService(r4, this.Hw, 1);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 33; continue $sw17;
                    }
                    if (r5 == false) { $pc17 = 28; continue $sw17; }
                    try {
                        this.v5 = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 33; continue $sw17;
                    }
                    { $pc17 = 31; continue $sw17; }
                }
                case 28: {
                    try {
                        abcd.ue.j6("Licensing service could not be bound");
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 33; continue $sw17;
                    }
                    return false;
                }
                case 30: {
                    try {
                        abcd.ue.j6("Licensing service bind already pending");
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 33; continue $sw17;
                    }
                    { $pc17 = 31; continue $sw17; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
