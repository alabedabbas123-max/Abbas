package com.crashlytics.android.core;

class sa implements com.crashlytics.android.core.Ka {
    private final java.util.Map<java.lang.String, java.lang.String> DW;
    private final java.lang.String FH;
    private final java.io.File[] j6;

    public sa(java.lang.String r2, java.io.File[] r3) {
        this.j6 = r3;
        this.DW = new java.util.HashMap(com.crashlytics.android.core.La.j6);
        this.FH = r2;
    }

    @Override
    public java.lang.String DW() {
        return this.FH;
    }

    @Override
    public java.io.File FH() {
        return this.j6[0];
    }

    @Override
    public java.io.File[] Hw() {
        return this.j6;
    }

    @Override
    public java.lang.String getFileName() {
        return this.j6[0].getName();
    }

    @Override
    public com.crashlytics.android.core.Ka.a getType() {
        return com.crashlytics.android.core.Ka.a.j6;
    }

    @Override
    public java.util.Map<java.lang.String, java.lang.String> j6() {
        return java.util.Collections.unmodifiableMap(this.DW);
    }

    @Override
    public void remove() {
        java.io.File[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.io.File r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.j6;
                    r1 = r0.length;
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r1) { $pc0 = 5; continue $sw0; }
                    r3 = r0[r2];
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Removing invalid report file at " + r3.getPath());
                    r3.delete();
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
