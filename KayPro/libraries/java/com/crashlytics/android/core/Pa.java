package com.crashlytics.android.core;

class Pa implements com.crashlytics.android.core.ClassC.a {
    Pa() {
    }

    private static java.lang.String j6(java.lang.String r3) {
        java.io.BufferedInputStream r0 = null;
        java.io.BufferedInputStream r1 = null;
        java.lang.String r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = null;
                    try {
                        r1 = new java.io.BufferedInputStream(new java.io.FileInputStream(r3));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    try {
                        r4 = io.fabric.sdk.android.services.common.i.j6(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    io.fabric.sdk.android.services.common.i.j6(r1);
                    return r4;
                }
                case 7: {
                    th = th;
                    r0 = r1;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    io.fabric.sdk.android.services.common.i.j6(r0);
                    throw th;
                }
                case 9: {
                    th = th;
                    { $pc0 = 10; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String j6(java.io.File r1) {
        return j6(r1.getPath());
    }
}
