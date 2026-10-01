package com.crashlytics.android.core;

class D extends com.crashlytics.android.core.W.d {
    D(java.lang.String r1) {
        super(r1);
    }

    @Override
    public boolean accept(java.io.File r1, java.lang.String r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (super.accept(r1, r2) == true) { $pc0 = 5; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r2.endsWith(".cls") == false) { $pc0 = 7; continue $sw0; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
