package abcd;

class dA extends io.fabric.sdk.android.services.common.Abstracta implements abcd.InterfaceqA {
    public dA(io.fabric.sdk.android.Kit r7, java.lang.String r8, java.lang.String r9, abcd.Jz r10) {
        this(r7, r8, r9, r10, abcd.Fz.j6);
    }

    dA(io.fabric.sdk.android.Kit r1, java.lang.String r2, java.lang.String r3, abcd.Jz r4, abcd.Fz r5) {
        super(r1, r2, r3, r4, r5);
    }

    private java.util.Map<java.lang.String, java.lang.String> DW(abcd.pA r4) {
        java.util.HashMap r0 = null;
        java.lang.String r1 = null;
        java.lang.String r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.HashMap();
                    r0.put("build_version", r4.gn);
                    r0.put("display_version", r4.VH);
                    r0.put("source", java.lang.Integer.toString(r4.u7));
                    r1 = r4.tp;
                    if (r1 == null) { $pc0 = 5; continue $sw0; }
                    r0.put("icon_hash", r1);
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r5 = r4.Zo;
                    if (io.fabric.sdk.android.services.common.i.DW(r5) == true) { $pc0 = 8; continue $sw0; }
                    r0.put("instance", r5);
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private org.json.JSONObject DW(java.lang.String r5) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return new org.json.JSONObject(r5);
                }
                case 4: {
                    e = $ex1;
                    io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Failed to parse settings JSON from " + DW(), e);
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Settings response " + r5);
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Hz j6(abcd.Hz r3, abcd.pA r4) {
        j6(r3, "X-CRASHLYTICS-API-KEY", r4.j6);
        j6(r3, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        j6(r3, "X-CRASHLYTICS-API-CLIENT-VERSION", this.Zo.getVersion());
        j6(r3, "Accept", "application/json");
        j6(r3, "X-CRASHLYTICS-DEVICE-MODEL", r4.DW);
        j6(r3, "X-CRASHLYTICS-OS-BUILD-VERSION", r4.FH);
        j6(r3, "X-CRASHLYTICS-OS-DISPLAY-VERSION", r4.Hw);
        j6(r3, "X-CRASHLYTICS-INSTALLATION-ID", r4.v5);
        return r3;
    }

    private void j6(abcd.Hz r1, java.lang.String r2, java.lang.String r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 == null) { $pc2 = 5; continue $sw2; }
                    r1.FH(r2, r3);
                    return;
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    org.json.JSONObject j6(abcd.Hz r5) {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r5.VH();
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Settings result was: " + r0);
                    if (j6(r0) == true) { $pc3 = 7; continue $sw3; }
                    io.fabric.sdk.android.Fabric.getLogger().DW("Fabric", "Failed to retrieve settings from " + DW());
                    return null;
                }
                case 7: {
                    return DW(r5.j6());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public org.json.JSONObject j6(abcd.pA r9) {
        java.lang.String r0 = null;
        org.json.JSONObject r3 = null;
        java.util.Map<java.lang.String, java.lang.String> r4 = null;
        abcd.Hz r5 = null;
        io.fabric.sdk.android.m r10 = null;
        java.lang.StringBuilder r6 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = "X-REQUEST-ID";
                    r3 = null;
                    try {
                        r4 = DW(r9);
                        r5 = j6(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof abcd.Hz.c) { $pc4 = 12; continue $sw4; }
                        $pc4 = 10; continue $sw4;
                    }
                    try {
                        j6(r5, r9);
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Requesting settings from " + DW());
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Settings query params were: " + r4);
                        r3 = j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof abcd.Hz.c) { $pc4 = 8; continue $sw4; }
                        $pc4 = 18; continue $sw4;
                    }
                    if (r5 == null) { $pc4 = 24; continue $sw4; }
                    r10 = io.fabric.sdk.android.Fabric.getLogger();
                    r6 = new java.lang.StringBuilder();
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    r6.append("Settings request ID: ");
                    r6.append(r5.Hw("X-REQUEST-ID"));
                    r0 = r6.toString();
                    r10.Hw("Fabric", r0);
                    $pc4 = 24; continue $sw4;
                }
                case 24: {
                    return r3;
                }
                case 8: {
                    e = e;
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Settings request failed.", e);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 18; continue $sw4;
                    }
                    if (r5 == null) { $pc4 = 24; continue $sw4; }
                    r10 = io.fabric.sdk.android.Fabric.getLogger();
                    r6 = new java.lang.StringBuilder();
                    { $pc4 = 7; continue $sw4; }
                }
                case 18: {
                    th = th;
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    if (r5 == null) { $pc4 = 22; continue $sw4; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Settings request ID: " + r5.Hw(r0));
                    $pc4 = 22; continue $sw4;
                }
                case 22: {
                    throw th;
                }
                case 12: {
                    e = e;
                    r5 = null;
                    throw new java.lang.IllegalStateException();
                }
                case 10: {
                    th = th;
                    r5 = null;
                    { $pc4 = 19; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    boolean j6(int r2) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r2 != 200) { $pc5 = 5; continue $sw5; }
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    return true;
                }
                case 5: {
                    if (r2 == 201) { $pc5 = 12; continue $sw5; }
                    if (r2 == 202) { $pc5 = 12; continue $sw5; }
                    if (r2 == 203) { $pc5 = 12; continue $sw5; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
