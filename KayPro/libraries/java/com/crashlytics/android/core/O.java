package com.crashlytics.android.core;

class O implements java.io.FileFilter {
    O() {
    }

    @Override
    public boolean accept(java.io.File r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2.isDirectory() == true) { $pc0 = 5; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (r2.getName().length() != 35) { $pc0 = 7; continue $sw0; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
