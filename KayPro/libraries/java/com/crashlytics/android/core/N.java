package com.crashlytics.android.core;

class N implements java.io.FilenameFilter {
    N() {
    }

    @Override
    public boolean accept(java.io.File r2, java.lang.String r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3.length() == 39) { $pc0 = 5; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r3.endsWith(".cls") == false) { $pc0 = 7; continue $sw0; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
