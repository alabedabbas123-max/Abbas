package com.crashlytics.android.core;

class ClassJ implements com.crashlytics.android.core.Interfaceka {
    private final com.crashlytics.android.core.Aa DW;
    private final com.crashlytics.android.core.na j6;

    public ClassJ(com.crashlytics.android.core.na r1, com.crashlytics.android.core.Aa r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public boolean j6(com.crashlytics.android.core.ja r4) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = com.crashlytics.android.core.ClassI.j6[r4.DW.getType().ordinal()];
                    if (r0 != 1) { $pc0 = 5; continue $sw0; }
                    this.j6.j6(r4);
                    return true;
                }
                case 5: {
                    if (r0 == 2) { $pc0 = 8; continue $sw0; }
                    return false;
                }
                case 8: {
                    this.DW.j6(r4);
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
