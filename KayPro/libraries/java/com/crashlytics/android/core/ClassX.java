package com.crashlytics.android.core;

class ClassX implements java.io.FilenameFilter {
    final com.crashlytics.android.core.W DW;
    final java.util.Set j6;

    ClassX(com.crashlytics.android.core.W r1, java.util.Set r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public boolean accept(java.io.File r3, java.lang.String r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4.length() >= 35) { $pc0 = 6; continue $sw0; }
                    return false;
                }
                case 6: {
                    return this.j6.contains(r4.substring(0, 35));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
