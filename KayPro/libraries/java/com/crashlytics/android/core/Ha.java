package com.crashlytics.android.core;

class Ha implements io.fabric.sdk.android.services.common.z.c {
    final int[] DW;
    final com.crashlytics.android.core.Ia FH;
    final byte[] j6;

    Ha(com.crashlytics.android.core.Ia r1, byte[] r2, int[] r3) {
        this.FH = r1;
        this.j6 = r2;
        this.DW = r3;
    }

    @Override
    public void j6(java.io.InputStream r4, int r5) {
        int[] r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r4.read(this.j6, this.DW[0], r5);
                        r0 = this.DW;
                        r0[0] = r0[0] + r5;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 5; continue $sw0;
                    }
                    r4.close();
                    return;
                }
                case 5: {
                    th = $ex0;
                    r4.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
