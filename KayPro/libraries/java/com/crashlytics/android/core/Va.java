package com.crashlytics.android.core;

final class Va {
    private static final java.io.FilenameFilter j6 = null;

    static {
        j6 = new com.crashlytics.android.core.Ua();
    }

    static int j6(java.io.File r1, int r2, java.util.Comparator<java.io.File> r3) {
        return j6(r1, j6, r2, r3);
    }

    static int j6(java.io.File r2, java.io.FilenameFilter r3, int r4, java.util.Comparator<java.io.File> r5) {
        java.io.File[] r6 = null;
        int r7 = 0;
        int r0 = 0;
        int r8 = 0;
        java.io.File r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r6 = r2.listFiles(r3);
                    r7 = 0;
                    if (r6 != null) { $pc0 = 5; continue $sw0; }
                    return 0;
                }
                case 5: {
                    r0 = r6.length;
                    java.util.Arrays.sort(r6, r5);
                    r8 = r6.length;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r7 >= r8) { $pc0 = 11; continue $sw0; }
                    r1 = r6[r7];
                    if (r0 <= r4) { $pc0 = 9; continue $sw0; }
                    r1.delete();
                    r0 = r0 - 1;
                    r7 = r7 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 9: {
                    return r0;
                }
                case 11: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
