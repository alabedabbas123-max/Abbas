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
        java.io.File[] r6 = r2.listFiles(r3);
        int r7 = 0;
        if (r6 != null) goto L5;
        return 0;
    L5:
        int r0 = r6.length;
        java.util.Arrays.sort(r6, r5);
        int r8 = r6.length;
    L6:
        if (r7 >= r8) goto L11;
        java.io.File r1 = r6[r7];
        if (r0 <= r4) goto L9;
        r1.delete();
        r0 = r0 - 1;
        r7 = r7 + 1;
        goto L6
    L9:
        return r0;
    L11:
        return r0;
    }
}
