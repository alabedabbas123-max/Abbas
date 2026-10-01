package io.fabric.sdk.android;

class f implements java.util.concurrent.Callable<java.util.Map<java.lang.String, io.fabric.sdk.android.l>> {
    final java.lang.String j6;

    f(java.lang.String r1) {
        this.j6 = r1;
    }

    private java.util.Map<java.lang.String, io.fabric.sdk.android.l> DW() {
        java.util.HashMap r0 = new java.util.HashMap();
        java.lang.Class.forName("com.google.android.gms.ads.AdView");     // Catch: java.lang.Exception -> L5
        io.fabric.sdk.android.l r1 = new io.fabric.sdk.android.l("com.google.firebase.firebase-ads", "0.0.0", "binary");     // Catch: java.lang.Exception -> L5
        r0.put(r1.DW(), r1);     // Catch: java.lang.Exception -> L5
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Found kit: com.google.firebase.firebase-ads");     // Catch: java.lang.Exception -> L5
    L4:
        return r0;
    }

    private java.util.Map<java.lang.String, io.fabric.sdk.android.l> FH() {
        java.util.HashMap r0 = new java.util.HashMap();
        java.util.zip.ZipFile r1 = j6();
        java.util.Enumeration<? extends java.util.zip.ZipEntry> r2 = r1.entries();
    L4:
        if (r2.hasMoreElements() == false) goto L12;
        java.util.zip.ZipEntry r3 = r2.nextElement();
        if (r3.getName().startsWith("fabric/") == false) goto L4;
        if (r3.getName().length() <= 7) goto L4;
        io.fabric.sdk.android.l r4 = j6(r3, r1);
        if (r4 == null) goto L4;
        r0.put(r4.DW(), r4);
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", java.lang.String.format("Found kit:[%s] version:[%s]", new java.lang.Object[]{r4.DW(), r4.FH()}));
        goto L4
    L12:
        if (r1 != null) goto L16;
    L14:
        return r0;
    L16:
        r1.close();     // Catch: java.io.IOException -> L15
        goto L14
    }

    private io.fabric.sdk.android.l j6(java.util.zip.ZipEntry r7, java.util.zip.ZipFile r8) {
        java.io.InputStream r9 = r8.getInputStream(r7);     // Catch: java.lang.Throwable -> L17 java.io.IOException -> L19
        java.util.Properties r1 = new java.util.Properties();     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L15
        r1.load(r9);     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L15
        java.lang.String r2 = r1.getProperty("fabric-identifier");     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L15
        java.lang.String r3 = r1.getProperty("fabric-version");     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L15
        java.lang.String r4 = r1.getProperty("fabric-build-type");     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L15
        if (android.text.TextUtils.isEmpty(r2) == true) goto L12;
        if (android.text.TextUtils.isEmpty(r3) == true) goto L12;
        io.fabric.sdk.android.l r5 = new io.fabric.sdk.android.l(r2, r3, r4);     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L15
        io.fabric.sdk.android.services.common.i.j6(r9);
        return r5;
    L12:
        throw new java.lang.IllegalStateException("Invalid format of fabric file," + r7.getName());     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L15
    L15:
        e = e;
    L21:
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Error when parsing fabric properties " + r7.getName(), e);     // Catch: java.lang.Throwable -> L13
        io.fabric.sdk.android.services.common.i.j6(r9);
        return null;
    L13:
        th = th;
    L24:
        io.fabric.sdk.android.services.common.i.j6(r8);
        throw th;
    L19:
        e = e;
        r9 = null;
    L17:
        th = th;
        r8 = null;
        goto L24
    }

    @Override
    public java.util.Map<java.lang.String, io.fabric.sdk.android.l> call() {
        return call2();
    }

    @Override
    public java.util.Map<java.lang.String, io.fabric.sdk.android.l> call2() {
        java.util.HashMap r0 = new java.util.HashMap();
        long r1 = android.os.SystemClock.elapsedRealtime();
        r0.putAll(DW());
        r0.putAll(FH());
        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "finish scanning in " + (android.os.SystemClock.elapsedRealtime() - r1));
        return r0;
    }

    protected java.util.zip.ZipFile j6() {
        return new java.util.zip.ZipFile(this.j6);
    }
}
