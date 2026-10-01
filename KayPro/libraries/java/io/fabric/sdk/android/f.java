package io.fabric.sdk.android;

class f implements java.util.concurrent.Callable<java.util.Map<java.lang.String, io.fabric.sdk.android.l>> {
    final java.lang.String j6;

    f(java.lang.String r1) {
        this.j6 = r1;
    }

    private java.util.Map<java.lang.String, io.fabric.sdk.android.l> DW() {
        java.util.HashMap r0 = null;
        io.fabric.sdk.android.l r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.HashMap();
                    try {
                        java.lang.Class.forName("com.google.android.gms.ads.AdView");
                        r1 = new io.fabric.sdk.android.l("com.google.firebase.firebase-ads", "0.0.0", "binary");
                        r0.put(r1.DW(), r1);
                        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Found kit: com.google.firebase.firebase-ads");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 5; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    return r0;
                }
                case 5: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.util.Map<java.lang.String, io.fabric.sdk.android.l> FH() {
        java.util.HashMap r0 = null;
        java.util.zip.ZipFile r1 = null;
        java.util.Enumeration<? extends java.util.zip.ZipEntry> r2 = null;
        java.util.zip.ZipEntry r3 = null;
        io.fabric.sdk.android.l r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.util.HashMap();
                    r1 = j6();
                    r2 = r1.entries();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r2.hasMoreElements() == false) { $pc1 = 12; continue $sw1; }
                    r3 = r2.nextElement();
                    if (r3.getName().startsWith("fabric/") == false) { $pc1 = 4; continue $sw1; }
                    if (r3.getName().length() <= 7) { $pc1 = 4; continue $sw1; }
                    r4 = j6(r3, r1);
                    if (r4 == null) { $pc1 = 4; continue $sw1; }
                    r0.put(r4.DW(), r4);
                    io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", java.lang.String.format("Found kit:[%s] version:[%s]", new java.lang.Object[]{r4.DW(), r4.FH()}));
                    { $pc1 = 4; continue $sw1; }
                }
                case 12: {
                    if (r1 != null) { $pc1 = 16; continue $sw1; }
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    return r0;
                }
                case 16: {
                    try {
                        r1.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc1 = 14; continue $sw1; }
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private io.fabric.sdk.android.l j6(java.util.zip.ZipEntry r7, java.util.zip.ZipFile r8) {
        java.io.InputStream r9 = null;
        java.util.Properties r1 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        io.fabric.sdk.android.l r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        r9 = r8.getInputStream(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 19; continue $sw2; }
                        $pc2 = 17; continue $sw2;
                    }
                    try {
                        r1 = new java.util.Properties();
                        r1.load(r9);
                        r2 = r1.getProperty("fabric-identifier");
                        r3 = r1.getProperty("fabric-version");
                        r4 = r1.getProperty("fabric-build-type");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 15; continue $sw2; }
                        $pc2 = 13; continue $sw2;
                    }
                    if (android.text.TextUtils.isEmpty(r2) == true) { $pc2 = 12; continue $sw2; }
                    if (android.text.TextUtils.isEmpty(r3) == true) { $pc2 = 12; continue $sw2; }
                    try {
                        r5 = new io.fabric.sdk.android.l(r2, r3, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 15; continue $sw2; }
                        $pc2 = 13; continue $sw2;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r9);
                    return r5;
                }
                case 12: {
                    try {
                        throw new java.lang.IllegalStateException("Invalid format of fabric file," + r7.getName());
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 15; continue $sw2; }
                        $pc2 = 13; continue $sw2;
                    }
                }
                case 15: {
                    e = e;
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().FH("Fabric", "Error when parsing fabric properties " + r7.getName(), e);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r9);
                    return null;
                }
                case 13: {
                    th = th;
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    io.fabric.sdk.android.services.common.i.j6(r8);
                    throw th;
                }
                case 19: {
                    e = e;
                    r9 = null;
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    th = th;
                    r8 = null;
                    { $pc2 = 24; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
