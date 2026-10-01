package com.crashlytics.android.core;

class da {
    private final abcd.Oz DW;
    private final java.lang.String j6;

    public da(java.lang.String r1, abcd.Oz r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    private java.io.File Hw() {
        return new java.io.File(this.DW.j6(), this.j6);
    }

    public boolean DW() {
        return Hw().exists();
    }

    public boolean FH() {
        return Hw().delete();
    }

    public boolean j6() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return Hw().createNewFile();
                }
                case 4: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().FH("CrashlyticsCore", "Error creating marker: " + this.j6, e);
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
