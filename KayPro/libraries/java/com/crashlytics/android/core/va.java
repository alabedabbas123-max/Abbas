package com.crashlytics.android.core;

class va implements com.crashlytics.android.core.Sa {
    private final java.lang.String DW;
    private final android.content.Context j6;

    public va(android.content.Context r1, java.lang.String r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public java.lang.String j6() {
        android.content.pm.PackageManager r0 = null;
        android.os.Bundle r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.j6.getPackageManager();
                    try {
                        r1 = r0.getApplicationInfo(this.DW, 128).metaData;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 8; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r1 == null) { $pc0 = 11; continue $sw0; }
                    return r1.getString("io.fabric.unity.crashlytics.version");
                }
                case 11: {
                    return null;
                }
                case 12: {
                    return null;
                }
                case 8: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
