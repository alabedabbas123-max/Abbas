package com.crashlytics.android.core;

class Ca implements com.crashlytics.android.core.Ka {
    private final java.io.File j6;

    public Ca(java.io.File r1) {
        this.j6 = r1;
    }

    @Override
    public java.lang.String DW() {
        return this.j6.getName();
    }

    @Override
    public java.io.File FH() {
        return null;
    }

    @Override
    public java.io.File[] Hw() {
        return this.j6.listFiles();
    }

    @Override
    public java.lang.String getFileName() {
        return null;
    }

    @Override
    public com.crashlytics.android.core.Ka.a getType() {
        return com.crashlytics.android.core.Ka.a.DW;
    }

    @Override
    public java.util.Map<java.lang.String, java.lang.String> j6() {
        return null;
    }

    @Override
    public void remove() {
        java.io.File[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.io.File r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = Hw();
                    r1 = r0.length;
                    r2 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r2 >= r1) { $pc0 = 6; continue $sw0; }
                    r4 = r0[r2];
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Removing native report file at " + r4.getPath());
                    r4.delete();
                    r2 = r2 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 6: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Removing native report directory at " + this.j6);
                    this.j6.delete();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
