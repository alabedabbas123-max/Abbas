package abcd;

abstract class Sz extends io.fabric.sdk.android.services.common.Abstracta implements abcd.Xz {
    public Sz(io.fabric.sdk.android.Kit r1, java.lang.String r2, java.lang.String r3, abcd.Jz r4, abcd.Fz r5) {
        super(r1, r2, r3, r4, r5);
    }

    private abcd.Hz DW(abcd.Hz r8, abcd.Vz r9) {
        r8.v5("app[identifier]", r9.DW);
        r8.v5("app[name]", r9.Zo);
        r8.v5("app[display_version]", r9.FH);
        r8.v5("app[build_version]", r9.Hw);
        r8.j6("app[source]", java.lang.Integer.valueOf(r9.VH));
        r8.v5("app[minimum_sdk_version]", r9.gn);
        r8.v5("app[built_sdk_version]", r9.u7);
        if (io.fabric.sdk.android.services.common.i.DW(r9.v5) == true) goto L6;
        r8.v5("app[instance_identifier]", r9.v5);
    L6:
        if (r9.tp == null) goto L17;
        java.io.InputStream r1 = null;
        r1 = this.Zo.getContext().getResources().openRawResource(r9.tp.DW);     // Catch: java.lang.Throwable -> L10 android.content.res.Resources.NotFoundException -> L12
        r8.v5("app[icon][hash]", r9.tp.j6);     // Catch: java.lang.Throwable -> L10 android.content.res.Resources.NotFoundException -> L12
        r8.j6("app[icon][data]", "icon.png", "application/octet-stream", r1);     // Catch: java.lang.Throwable -> L10 android.content.res.Resources.NotFoundException -> L12
        r8.j6("app[icon][width]", java.lang.Integer.valueOf(r9.tp.FH));     // Catch: java.lang.Throwable -> L10 android.content.res.Resources.NotFoundException -> L12
        r8.j6("app[icon][height]", java.lang.Integer.valueOf(r9.tp.Hw));     // Catch: java.lang.Throwable -> L10 android.content.res.Resources.NotFoundException -> L12
    L14:
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close app icon InputStream.");
        goto L17
    L12:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Failed to find app icon with resource ID: " + r9.tp.DW, e);     // Catch: java.lang.Throwable -> L10
    L10:
        th = move-exception;
        io.fabric.sdk.android.services.common.i.j6(r1, "Failed to close app icon InputStream.");
        throw th;
    L17:
        java.util.Collection<io.fabric.sdk.android.l> r10 = r9.EQ;
        if (r10 == null) goto L23;
        java.util.Iterator<io.fabric.sdk.android.l> r11 = r10.iterator();
    L21:
        if (r11.hasNext() == false) goto L23;
        io.fabric.sdk.android.l r0 = r11.next();
        r8.v5(DW(r0), r0.FH());
        r8.v5(j6(r0), r0.j6());
    L23:
        return r8;
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
        abcd.Hz r0 = j6();
        j6(r0, r6);
        DW(r0, r6);
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Sending app info to " + DW());
        if (r6.tp == null) goto L5;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "App icon hash is " + r6.tp.j6);
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "App icon size is " + r6.tp.FH + "x" + r6.tp.Hw);
    L5:
        int r7 = r0.VH();
        if ("POST".equals(r0.EQ()) == false) goto L8;
        java.lang.String r1 = "Create";
    L9:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", r1 + " app request ID: " + r0.Hw("X-REQUEST-ID"));
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Result was " + r7);
        if (io.fabric.sdk.android.services.common.A.j6(r7) != 0) goto L12;
        return true;
    L12:
        return false;
    L8:
        r1 = "Update";
        goto L9
    }
}
