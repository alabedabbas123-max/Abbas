package com.aide.appwizard;

@abcd.Interfacexu
public class D {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.appwizard.D.class, 2080007746348708736L, 2080007746348708736L);
    }

    public D() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 592590467621090840L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(592590467621090840L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static java.lang.String j6() {
        java.lang.String r0 = null;
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -981198410316821352L, r0);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-981198410316821352L, null);     // Catch: java.lang.Throwable -> L12
    L6:
        java.io.File r3 = android.os.Environment.getExternalStorageDirectory();     // Catch: java.lang.Throwable -> L12
        if (r3.exists() == false) goto L10;
        r0 = r3.getPath();     // Catch: java.lang.Throwable -> L12
        return r0;
    L10:
        return "/mnt/sdcard";
    }

    public static java.lang.String j6(java.lang.String r9) {
    L29:
        th = move-exception;
        if (DW == false) goto L34;
        abcd.wu.j6(th, -2651439463917296211L, null, r9);
    L34:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2651439463917296211L, null, r9);     // Catch: java.lang.Throwable -> L29
    L7:
        if (r9 != null) goto L49;
        return "";
    L49:
        java.lang.StringBuffer r4 = new java.lang.StringBuffer();     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
        java.io.BufferedReader r5 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(r9), "UTF-8"));     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L22
    L47:
        char[] r6 = new char[1024];     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L38
    L12:
        int r7 = r5.read(r6);     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L38
        if (r7 == (-1)) goto L15;
        r4.append(java.lang.String.valueOf(r6, 0, r7));     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L38
        goto L12
    L15:
        r5.close();     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L38
        java.lang.String r3 = r4.toString();     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L38
        r5.close();     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L29
    L17:
        return r3;
    L18:
        th = th;
    L26:
        if (r5 != null) goto L40;
    L28:
        throw th;     // Catch: java.lang.Throwable -> L29
    L40:
        r5.close();     // Catch: java.lang.Exception -> L37 java.lang.Throwable -> L29
    L23:
        if (r5 != null) goto L44;
    L25:
        return "";
    L44:
        r5.close();     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L29
    L22:
        r5 = null;
    L20:
        th = th;
        r5 = null;
        goto L26
    }
}
