package com.crashlytics.android.core;

final class Ba {
    static byte[] DW(java.io.File r1) {
        java.io.File r2 = j6(r1, ".dmp");
        if (r2 != null) goto L6;
        return new byte[0];
    L6:
        return Hw(r2);
    }

    private static byte[] DW(java.io.File r1, android.content.Context r2) {
        byte[] r3 = FH(r1);
        if (r3 != null) goto L5;
        return null;
    L5:
        if (r3.length != 0) goto L8;
        return null;
    L8:
        return j6(r2, new java.lang.String(r3));
    }

    static byte[] FH(java.io.File r2) {
        java.io.FileInputStream r0 = null;
        java.io.FileInputStream r1 = new java.io.FileInputStream(r2);     // Catch: java.lang.Throwable -> L9 java.io.IOException -> L12 java.io.FileNotFoundException -> L15
        byte[] r3 = j6(r1);     // Catch: java.lang.Throwable -> L7 java.io.IOException -> L18 java.io.FileNotFoundException -> L19
        io.fabric.sdk.android.services.common.i.j6(r1);
        return r3;
    L7:
        th = th;
        r0 = r1;
    L10:
        io.fabric.sdk.android.services.common.i.j6(r0);
        throw th;
    L16:
        io.fabric.sdk.android.services.common.i.j6(r1);
        return null;
    L13:
        io.fabric.sdk.android.services.common.i.j6(r1);
        return null;
    L15:
        r1 = null;
    L12:
        r1 = null;
    L9:
        th = th;
        goto L10
    }

    private static byte[] FH(java.io.File r3, android.content.Context r4) {
        if (r3.exists() == true) goto L17;
        return null;
    L17:
        java.io.BufferedReader r0 = new java.io.BufferedReader(new java.io.FileReader(r3));     // Catch: java.lang.Throwable -> L11
        byte[] r5 = new com.crashlytics.android.core.ClassC(r4, new com.crashlytics.android.core.Pa()).j6(r0);     // Catch: java.lang.Throwable -> L9
        io.fabric.sdk.android.services.common.i.j6(r0);
        return r5;
    L9:
        th = th;
    L13:
        io.fabric.sdk.android.services.common.i.j6(r0);
        throw th;
    L11:
        th = th;
        r0 = null;
        goto L13
    }

    private static byte[] Hw(java.io.File r0) {
        return FH(r0);
    }

    private static java.io.File j6(java.io.File r4, java.lang.String r5) {
        java.io.File[] r6 = r4.listFiles();
        int r0 = r6.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        java.io.File r2 = r6[r1];
        if (r2.getName().endsWith(r5) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        return r2;
    L8:
        return null;
    }

    private static byte[] j6(android.content.Context r2, java.lang.String r3) {
        return new com.crashlytics.android.core.ClassC(r2, new com.crashlytics.android.core.Pa()).j6(r3);
    }

    static byte[] j6(java.io.File r1) {
        java.io.File r2 = j6(r1, ".device_info");
        if (r2 != null) goto L6;
        return null;
    L6:
        return FH(r2);
    }

    static byte[] j6(java.io.File r1, android.content.Context r2) {
        java.io.File r0 = j6(r1, ".maps");
        if (r0 != null) goto L5;
        java.io.File r3 = j6(r1, ".binary_libs");
        if (r3 != null) goto L9;
        return null;
    L9:
        return DW(r3, r2);
    L5:
        return FH(r0, r2);
    }

    private static byte[] j6(java.io.InputStream r4) {
        byte[] r0 = new byte[1024];
        java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream();
    L3:
        int r2 = r4.read(r0);
        if (r2 == (-1)) goto L7;
        r1.write(r0, 0, r2);
        goto L3
    L7:
        return r1.toByteArray();
    }
}
