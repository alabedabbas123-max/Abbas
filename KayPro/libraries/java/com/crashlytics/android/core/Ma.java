package com.crashlytics.android.core;

class Ma implements com.crashlytics.android.core.Sa {
    private final com.crashlytics.android.core.Sa DW;
    private boolean FH;
    private java.lang.String Hw;
    private final android.content.Context j6;

    public Ma(android.content.Context r2, com.crashlytics.android.core.Sa r3) {
        this.FH = false;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public java.lang.String j6() {
        java.lang.String r0 = null;
        com.crashlytics.android.core.Sa r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.FH == true) { $pc0 = 5; continue $sw0; }
                    this.Hw = io.fabric.sdk.android.services.common.i.Ws(this.j6);
                    this.FH = true;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    r0 = this.Hw;
                    if (r0 == null) { $pc0 = 8; continue $sw0; }
                    return r0;
                }
                case 8: {
                    r1 = this.DW;
                    if (r1 != null) { $pc0 = 11; continue $sw0; }
                    return null;
                }
                case 11: {
                    return r1.j6();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
