package abcd;

abstract class Sz extends io.fabric.sdk.android.services.common.Abstracta implements abcd.Xz {
    public Sz(io.fabric.sdk.android.Kit r1, java.lang.String r2, java.lang.String r3, abcd.Jz r4, abcd.Fz r5) {
        super(r1, r2, r3, r4, r5);
    }

    private abcd.Hz DW(abcd.Hz r8, abcd.Vz r9) {
        java.io.InputStream r1 = null;
        java.util.Collection<io.fabric.sdk.android.l> r10 = null;
        java.util.Iterator<io.fabric.sdk.android.l> r11 = null;
        io.fabric.sdk.android.l r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r8.v5("app[identifier]", r9.DW);
                    r8.v5("app[name]", r9.Zo);
                    r8.v5("app[display_version]", r9.FH);
                    r8.v5("app[build_version]", r9.Hw);
                    r8.j6("app[source]", java.lang.Integer.valueOf(r9.VH));
                    r8.v5("app[minimum_sdk_version]", r9.gn);
                    r8.v5("app[built_sdk_version]", r9.u7);
                    if (io.fabric.sdk.android.services.common.i.DW(r9.v5) == true) { $pc0 = 6; continue $sw0; }
                    r8.v5("app[instance_identifier]", r9.v5);
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r9.tp == null) { $pc0 = 17; continue $sw0; }
                    r1 = null;
                    try {
                        r1 = this.Zo.getContext().getResources().openRawResource(r9.tp.DW);
                        r8.v5("app[icon][hash]", r9.tp.j6);
                        r8.j6("app[icon][data]", "icon.png", "application/octet-stream", r1);
                        r8.j6("app[icon][width]", java.lang.Integer.valueOf(r9.tp.FH));
                        r8.j6("app[icon][height]", java.lang.Integer.valueOf(r9.tp.Hw));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof android.content.res.Resources.NotFoundException) { $pc0 = 12; continue $sw0; }
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close app icon InputStream.");
                    { $pc0 = 17; continue $sw0; }
                }
                case 12: {
                    e = $ex0;
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to find app icon with resource ID: " + r9.tp.DW, e);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 10; continue $sw0;
                    }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    th = $ex0;
                    io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close app icon InputStream.");
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 17: {
                    r10 = r9.EQ;
                    if (r10 == null) { $pc0 = 23; continue $sw0; }
                    r11 = r10.iterator();
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    if (r11.hasNext() == false) { $pc0 = 23; continue $sw0; }
                    r0 = r11.next();
                    r8.v5(DW(r0), r0.FH());
                    r8.v5(j6(r0), r0.j6());
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    return r8;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Hz j6(abcd.Hz r2, abcd.Vz r3) {
        r2.FH("X-CRASHLYTICS-API-KEY", r3.j6);
        r2.FH("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        r2.FH("X-CRASHLYTICS-API-CLIENT-VERSION", this.Zo.getVersion());
        return r2;
    }

    java.lang.String DW(io.fabric.sdk.android.l r4) {
        return java.lang.String.format(java.util.Locale.US, "app[build][libraries][%s][version]", new java.lang.Object[]{r4.DW()});
    }

    java.lang.String j6(io.fabric.sdk.android.l r4) {
        return java.lang.String.format(java.util.Locale.US, "app[build][libraries][%s][type]", new java.lang.Object[]{r4.DW()});
    }

    public boolean j6(abcd.Vz r6) {
        abcd.Hz r0 = null;
        int r7 = 0;
        java.lang.String r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = j6();
                    j6(r0, r6);
                    DW(r0, r6);
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Sending app info to " + DW());
                    if (r6.tp == null) { $pc1 = 5; continue $sw1; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "App icon hash is " + r6.tp.j6);
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "App icon size is " + r6.tp.FH + "x" + r6.tp.Hw);
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r7 = r0.VH();
                    if ("POST".equals(r0.EQ()) == false) { $pc1 = 8; continue $sw1; }
                    r1 = "Create";
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", r1 + " app request ID: " + r0.Hw("X-REQUEST-ID"));
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Result was " + r7);
                    if (io.fabric.sdk.android.services.common.A.j6(r7) != 0) { $pc1 = 12; continue $sw1; }
                    return true;
                }
                case 12: {
                    return false;
                }
                case 8: {
                    r1 = "Update";
                    { $pc1 = 9; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
