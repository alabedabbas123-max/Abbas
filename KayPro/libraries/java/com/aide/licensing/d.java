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
        L7:
            th = move-exception;
            if (Hw == false) goto L11;
            abcd.wu.j6(th, 4601674493633101729L, null, r8, new java.lang.Long(r9));
        L11:
            throw th;
        L3:
            if (FH == false) goto L5;
            abcd.wu.j6(4601674493633101729L, null, r8, new java.lang.Long(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            this.Zo = r8;     // Catch: java.lang.Throwable -> L7
            this.v5 = r9;     // Catch: java.lang.Throwable -> L7
        }

        static long j6(com.aide.licensing.d.a r2) {
            return r2.v5;
        }

        @Override
        @abcd.Interfacesu(method = 1240417823567612072L)
        public void j6(int r9, java.lang.String r10, java.lang.String r11) {
        L7:
            th = move-exception;
            if (Hw == false) goto L11;
            abcd.wu.j6(th, -177146904446841200L, this, new java.lang.Integer(r9), r10, r11);
        L11:
            throw th;
        L3:
            if (FH == false) goto L5;
            abcd.wu.j6(-177146904446841200L, this, new java.lang.Integer(r9), r10, r11);     // Catch: java.lang.Throwable -> L7
        L5:
            com.aide.licensing.d.DW(this.Zo).post(new com.aide.licensing.c(this, r9, r10, r11));     // Catch: java.lang.Throwable -> L7
        }
    }

    static {
        abcd.wu.j6(com.aide.licensing.d.class, 2773153765153353776L, 2773153765153353776L);
    }

    public d() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1688200213923072072L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1688200213923072072L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    static android.os.Handler DW(com.aide.licensing.d r0) {
        return r0.tp;
    }

    @abcd.Interfacesu(method = 4356939747947333044L)
    private java.lang.String Hw() {
    L20:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -7163474981163740260L, this);
    L24:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-7163474981163740260L, this);     // Catch: java.lang.Throwable -> L20
    L7:
        if (Zo().equals("com.aide.premium.key") == false) goto L11;
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkjXTkIvABlLJgyvluBm4h4Ytw87BbBrSRXohMVMvk0Eq2pYJKT1jYfC1W65/YY5GcFYwMiaemVlpH40h/h+rkm+GYYq04awtN8zv35+HymbrW6ztGgNv7gF7ksAOOb8swqQwlx6uzfZWzbny7r9kkKURlXWmpkcKpWUjfoQ1MIRFxuXoJ2owTjvdkezI2hjCxC+NJ57QCG8tBoWJo5jscDRylHuaXBGVX7fJx7NsWzlk9xTXUFE7F8J5OaPRpgCNwo+xC0pXSoA/yCv1dOy4v2tPr9L9rfB95nrTwRs1ob44LOY3UqYgVMC1wpy+nxU6UGch8g8/DfHXfaefBcsbfwIDAQAB";
    L11:
        if (Zo().equals("com.aide.java.premium.key") == false) goto L14;
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAn+LHwdRGxOPUMAOl1xlpO/jK/2cqCBxkbIlP0fjvubrkNhj+TdoFzXAPEVJQDmBhRdgfOW7T1JyNDKjQYHqvsqxecl5DSxy+e2c3do2+OmtXDgsCZnwsPoQKZlXqYmr2m7oohe+ogGQ6dvK5ToyLEHtJu6zBs4HNrHEDJAZz4+eG8UydfPJut0VaBxFhLTwdInzILO27JcabVjNWSbMj/3ClErZjcaM9wBhPaftBFpyQWBiIVL5dULHspqlXsiVljpIvz1UTwkHwE+hqJPhPGLBIe6xqNPyv16IOssFskia97yekprSeoMaP0xzc/c7KT2sqsVuCUJsm41yDbqvIDwIDAQAB";
    L14:
        if (Zo().equals("com.aide.designer") == false) goto L18;
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAscoEgrFdBkxPcWpFbDQhJaTdZ92LV4sGN7NdUmkp1OIL9m9vO8cYFRU2ZCpHEQ+gilfA2T37855hqegNJfv3Uv/Rh9gZYy+cEGyqEnZyjZ0eYXEMcRmuvLNCrkFpg8xlzRpAvwMB7Tseez5GSYuwefuSle5OBLYrKYxZ14qIiHBwYrS338+v0jIav07YAlwxqkLIEWikNN0lI7ZuJlhcgIiwCJCDT9WtHaU8GgOGYh4cTLnuNAo5FOsSNnEmSmdc4jRyWCPSSETMs+fbEy3BsDKpaO4I2b/VO0/GVmyI9jkYJgkmx/33gYKSTRw9BZR3yy7Vtnq64/afnSoMYqzkDQIDAQAB";
    L18:
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAh9PowqySSG6WBaQx3i5y+3vjHUlva+HzWV7ZlYCkMdY5rHxp48M566VZjQVPV9xF0a47f0n0kdECfNGcLvLtQdB6rhk1xW6ouQG+uCiLmjLomLVZbaHPS7kDDP0ETU7SpVksPfPFlHCNLgZ/68HQzWMv7WmQ5Y1+9x3QQ4EfC3gsQdftsNyjSr7GZ7oR3dMDPyMkjNa5tHi4ZzSEHJQyutD7ezURXAsmyEvFUphp871vKCHNrNA+NHt2KMptZdRuCpip6yr6yyD1uFGWZ7XDEtu9Gtt93dWlC6PyecA21LHbGGbv6M9T5WkyqYRyorDKxdfOXIYuuW2I5PdmiE//+wIDAQAB";
    }

    @abcd.Interfacesu(method = 41736832369318944L)
    private java.lang.String[] VH() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 5306356262044124480L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5306356262044124480L, this);     // Catch: java.lang.Throwable -> L15
    L6:
        java.io.File r2 = v5();     // Catch: java.lang.Throwable -> L15
        if (r2.isFile() == true) goto L21;
        return null;
    L21:
        java.io.FileReader r3 = new java.io.FileReader(r2);     // Catch: java.io.IOException -> L12 java.lang.Throwable -> L15
        java.io.StringWriter r4 = new java.io.StringWriter();     // Catch: java.io.IOException -> L12 java.lang.Throwable -> L15
        abcd.ve.j6(r3, r4);     // Catch: java.io.IOException -> L12 java.lang.Throwable -> L15
        return r4.toString().split("\u0000");
    L12:
        e = move-exception;
        abcd.ue.j6(e);     // Catch: java.lang.Throwable -> L15
        return null;
    }

    @abcd.Interfacesu(method = -2934235875277803685L)
    private java.lang.String Zo() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1806130113672571385L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1806130113672571385L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.gn.getApplicationContext().getPackageName();
    }

    @abcd.Interfacesu(method = -7862113735668787868L)
    private void gn() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -3785385826124745108L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-3785385826124745108L, this);     // Catch: java.lang.Throwable -> L15
    L7:
        if (java.lang.System.currentTimeMillis() >= (this.VH + 60000)) goto L20;
        abcd.ue.j6("License check responsed pending - throttled");     // Catch: java.lang.Throwable -> L15
        return;
    L20:
        abcd.ue.j6("Requesting license check");     // Catch: android.os.RemoteException -> L12 java.lang.Throwable -> L15
        long r2 = com.aide.licensing.i.j6(this.gn);     // Catch: android.os.RemoteException -> L12 java.lang.Throwable -> L15
        this.FH.j6(r2, Zo(), new com.aide.licensing.d.a(this, r2));     // Catch: android.os.RemoteException -> L12 java.lang.Throwable -> L15
        this.VH = java.lang.System.currentTimeMillis();     // Catch: android.os.RemoteException -> L12 java.lang.Throwable -> L15
    L23:
        return;
    L12:
        e = move-exception;
        abcd.ue.j6(e);     // Catch: java.lang.Throwable -> L15
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
        ?? r13 = r20;
    L81:
        th = th;
        r13 = r23;
    L84:
        if (DW == false) goto L86;
        abcd.wu.j6(th, 181994932081715397L, this, new java.lang.Long(r18), new java.lang.Integer(r20), r21, r22, new java.lang.Boolean(r13));
    L86:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(181994932081715397L, this, new java.lang.Long(r18), new java.lang.Integer(r13 == true ? 1 : 0), r21, r22, new java.lang.Boolean(r23));     // Catch: java.lang.Throwable -> L81
    L6:
        int r1 = -1;
        android.content.pm.PackageInfo r0 = this.gn.getPackageManager().getPackageInfo(this.gn.getPackageName(), 0);     // Catch: java.lang.Throwable -> L12 android.content.pm.PackageManager.NameNotFoundException -> L14
        if (r23 == true) goto L11;
        r1 = r0.versionCode;     // Catch: java.lang.Throwable -> L12 android.content.pm.PackageManager.NameNotFoundException -> L14
    L11:
        int r5 = r1;
    L16:
        boolean r16 = false;
        boolean r14 = r23;
        com.aide.licensing.f.a r2 = com.aide.licensing.f.j6(this.gn, r18, r20, r5, Zo(), r21, r22, Hw());     // Catch: java.lang.Throwable -> L73
        int r3 = com.aide.licensing.b.j6[r2.ordinal()];     // Catch: java.lang.Throwable -> L73
        if (r3 != 1) goto L21;
    L47:
        com.aide.licensing.LicenseUpdateAlarmReceiver.j6(this.gn);     // Catch: java.lang.Throwable -> L73
        this.Zo = com.aide.licensing.f.j6(r21, r22, Hw()).tp;     // Catch: java.lang.Throwable -> L73
        if (r14 == true) goto L53;
        if (r2 != com.aide.licensing.f.a.j6) goto L53;
        j6(r21, r22);     // Catch: java.lang.Throwable -> L73
    L53:
        if (r2 != com.aide.licensing.f.a.j6) goto L55;
    L56:
        r16 = true;
    L58:
        if (this.u7 == false) goto L60;
    L67:
        com.aide.licensing.LicenseUpdateAlarmReceiver.j6(this.gn);     // Catch: java.lang.Throwable -> L73
    L68:
        if (r14 == false) goto L70;
    L72:
        return r2;
    L70:
        if (this.u7 == false) goto L72;
        u7();     // Catch: java.lang.Throwable -> L79
        goto L72
    L60:
        if (this.EQ == null) goto L67;
        if (r16 == false) goto L63;
        this.EQ.DW(r21, r22);     // Catch: android.os.RemoteException -> L65 java.lang.Throwable -> L73
    L98:
    L63:
        this.EQ.XX();     // Catch: android.os.RemoteException -> L65 java.lang.Throwable -> L73
    L65:
        e = move-exception;
        abcd.ue.j6(e);     // Catch: java.lang.Throwable -> L73
        goto L67
    L55:
        if (r2 != com.aide.licensing.f.a.DW) goto L58;
    L21:
        if (r3 == 2) goto L47;
        if (r3 == 3) goto L47;
        if (r3 == 4) goto L39;
        if (r3 == 5) goto L68;
        if (this.u7 == false) goto L31;
    L36:
        this.Zo = java.lang.System.currentTimeMillis() + 3600000;     // Catch: java.lang.Throwable -> L73
        throw new java.lang.RuntimeException("Unknown LicenseVerificationResult " + r2);     // Catch: java.lang.Throwable -> L73
    L31:
        if (this.EQ == null) goto L36;
        this.EQ.XX();     // Catch: android.os.RemoteException -> L34 java.lang.Throwable -> L73
    L34:
        e = move-exception;
        abcd.ue.j6(e);     // Catch: java.lang.Throwable -> L73
        goto L36
    L39:
        if (this.u7 == false) goto L41;
    L46:
        this.Zo = java.lang.System.currentTimeMillis() + 3600000;     // Catch: java.lang.Throwable -> L73
        goto L68
    L41:
        if (this.EQ == null) goto L46;
        this.EQ.XX();     // Catch: android.os.RemoteException -> L44 java.lang.Throwable -> L73
    L44:
        e = move-exception;
        abcd.ue.j6(e);     // Catch: java.lang.Throwable -> L73
    L73:
        th = th;
    L74:
        if (r14 == false) goto L76;
    L78:
        throw th;     // Catch: java.lang.Throwable -> L79
    L76:
        if (this.u7 == false) goto L78;
        u7();     // Catch: java.lang.Throwable -> L79
    L14:
        e = move-exception;
        abcd.ue.j6(e);     // Catch: java.lang.Throwable -> L12
        r5 = -1;
    L12:
        th = th;
        r14 = r23;
    L79:
        th = th;
        goto L84
    }

    static com.android.vending.licensing.ILicensingService j6(com.aide.licensing.d r0, com.android.vending.licensing.ILicensingService r1) {
        r0.FH = r1;
        return r1;
    }

    @abcd.Interfacesu(method = 715154442785351339L)
    private void j6(long r10, int r12, java.lang.String r13, java.lang.String r14) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 440777614008551735L, this, new java.lang.Long(r10), new java.lang.Integer(r12), r13, r14);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(440777614008551735L, this, new java.lang.Long(r10), new java.lang.Integer(r12), r13, r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, r12, r13, r14, false);     // Catch: java.lang.Throwable -> L7
    }

    static void j6(com.aide.licensing.d r0) {
        r0.gn();
    }

    static void j6(com.aide.licensing.d r0, long r1, int r3, java.lang.String r4, java.lang.String r5) {
        r0.j6(r1, r3, r4, r5);
    }

    @abcd.Interfacesu(method = 532025155659076464L)
    private void j6(java.lang.String r9, java.lang.String r10) {
    L33:
        th = move-exception;
        if (DW == false) goto L38;
        abcd.wu.j6(th, 3833499257148565160L, this, r9, r10);
    L38:
        throw th;
    L3:
        if (j6 == false) goto L41;
        abcd.wu.j6(3833499257148565160L, this, r9, r10);     // Catch: java.lang.Throwable -> L33
    L41:
        java.io.FileWriter r1 = new java.io.FileWriter(v5());     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17
        r1.write(r9);     // Catch: java.io.IOException -> L13 java.lang.Throwable -> L26
        r1.write(0);     // Catch: java.io.IOException -> L13 java.lang.Throwable -> L26
        r1.write(r10);     // Catch: java.io.IOException -> L13 java.lang.Throwable -> L26
        r1.close();     // Catch: java.io.IOException -> L10 java.lang.Throwable -> L33
    L40:
        return;
    L10:
        e = e;
    L11:
        abcd.ue.j6(e);     // Catch: java.lang.Throwable -> L33
        return;
    L13:
        java.io.IOException e = e;
    L19:
        abcd.ue.j6(e);     // Catch: java.lang.Throwable -> L26
        if (r1 == null) goto L40;
        r1.close();     // Catch: java.io.IOException -> L23 java.lang.Throwable -> L33
    L23:
        e = e;
        goto L11
    L26:
        java.lang.Throwable th = th;
    L27:
        if (r1 != null) goto L45;
    L32:
        throw th;     // Catch: java.lang.Throwable -> L33
    L45:
        r1.close();     // Catch: java.io.IOException -> L30 java.lang.Throwable -> L33
    L30:
        e = move-exception;
        abcd.ue.j6(e);     // Catch: java.lang.Throwable -> L33
    L17:
        e = move-exception;
        r1 = null;
        e = e;
    L15:
        th = move-exception;
        r1 = null;
        th = th;
        goto L27
    }

    static boolean j6(com.aide.licensing.d r0, boolean r1) {
        r0.v5 = r1;
        return r1;
    }

    @abcd.Interfacesu(method = 1260346338860274744L)
    private com.aide.licensing.f.a tp() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 1917750026386113920L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1917750026386113920L, this);     // Catch: java.lang.Throwable -> L15
    L6:
        java.lang.String[] r2 = VH();     // Catch: java.lang.Throwable -> L15
        if (r2 == null) goto L14;
        if (r2.length != 2) goto L14;
        return j6(-1, -1, r2[0], r2[1], true);
    L14:
        return com.aide.licensing.f.a.Hw;
    }

    @abcd.Interfacesu(method = -693377464180282975L)
    private void u7() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -638749578083613499L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-638749578083613499L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.ue.j6("Stopping LicenseUpdateService");     // Catch: java.lang.Throwable -> L8
        this.gn.stopService(new android.content.Intent(this.gn, com.aide.licensing.LicenseUpdateService.class));     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -5158803844777835567L)
    private java.io.File v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3850333796794209811L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3850333796794209811L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return new java.io.File(this.gn.getFilesDir(), "license.txt");
    }

    public void DW() {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 272400898447333665L, this);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(272400898447333665L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        com.aide.licensing.f.a r2 = tp();     // Catch: java.lang.Throwable -> L16
        boolean r3 = true;
        if (r2 == com.aide.licensing.f.a.DW) goto L11;
        if (r2 == com.aide.licensing.f.a.FH) goto L11;
    L13:
        if (r3 == false) goto L23;
        u7();     // Catch: java.lang.Throwable -> L16
        return;
    L23:
        return;
    L11:
        if (j6(null) == false) goto L13;
        r3 = false;
        goto L13
    }

    public void FH() {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2810366303274470976L, this);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2810366303274470976L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.FH == null) goto L17;
        abcd.ue.j6("License service shutdown");     // Catch: java.lang.Throwable -> L10
        this.gn.unbindService(this.Hw);     // Catch: java.lang.Throwable -> L10
        this.Hw = null;     // Catch: java.lang.Throwable -> L10
        this.EQ = null;     // Catch: java.lang.Throwable -> L10
        this.v5 = false;     // Catch: java.lang.Throwable -> L10
        return;
    }

    public void j6(android.content.Context r8, boolean r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2471490827726034832L, this, r8, new java.lang.Boolean(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2471490827726034832L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        this.gn = r8;     // Catch: java.lang.Throwable -> L7
        this.tp = new android.os.Handler();     // Catch: java.lang.Throwable -> L7
        this.u7 = r9;     // Catch: java.lang.Throwable -> L7
    }

    public boolean j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -6796593317997719007L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-6796593317997719007L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return v5().isFile();
    }

    public boolean j6(com.aide.licensing.g r9) {
    L33:
        th = move-exception;
        if (DW == false) goto L37;
        abcd.wu.j6(th, 2858423354287112887L, this, r9);
    L37:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2858423354287112887L, this, r9);     // Catch: java.lang.Throwable -> L33
    L6:
        this.EQ = r9;     // Catch: java.lang.Throwable -> L33
        if (java.lang.System.currentTimeMillis() >= this.Zo) goto L9;
        return false;
    L9:
        com.aide.licensing.f.a r2 = tp();     // Catch: java.lang.Throwable -> L33
        int r3 = com.aide.licensing.b.j6[r2.ordinal()];     // Catch: java.lang.Throwable -> L33
        if (r3 != 1) goto L12;
        return false;
    L12:
        if (r3 == 2) goto L21;
        if (r3 == 3) goto L21;
        if (r3 == 4) goto L21;
        throw new java.lang.RuntimeException("Unknown LicenseVerificationResult " + r2);     // Catch: java.lang.Throwable -> L33
    L21:
        if (this.FH == null) goto L24;
        gn();     // Catch: java.lang.Throwable -> L33
    L31:
        return true;
    L24:
        if (this.v5 == true) goto L30;
        this.Hw = new com.aide.licensing.a(this);     // Catch: java.lang.Throwable -> L33
        android.content.Intent r4 = new android.content.Intent("com.android.vending.licensing.ILicensingService");     // Catch: java.lang.Throwable -> L33
        r4.setPackage("com.android.vending");     // Catch: java.lang.Throwable -> L33
        boolean r5 = this.gn.bindService(r4, this.Hw, 1);     // Catch: java.lang.Throwable -> L33
        if (r5 == false) goto L28;
        this.v5 = r5;     // Catch: java.lang.Throwable -> L33
        goto L31
    L28:
        abcd.ue.j6("Licensing service could not be bound");     // Catch: java.lang.Throwable -> L33
        return false;
    L30:
        abcd.ue.j6("Licensing service bind already pending");     // Catch: java.lang.Throwable -> L33
        goto L31
    }
}
