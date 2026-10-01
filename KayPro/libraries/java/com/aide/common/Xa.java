package com.aide.common;

@abcd.Interfacexu
public class Xa {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common.Xa.class, -711442613965315275L, -711442613965315275L);
    }

    public Xa() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5202972984187072409L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5202972984187072409L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static int j6(java.io.InputStream r7, byte[] r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -7482175249959446385L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-7482175249959446385L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        return j6(r7, r8, 0, r8.length);
    }

    public static int j6(java.io.InputStream r9, byte[] r10, int r11, int r12) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 2497325975796263005L, null, r9, r10, new java.lang.Integer(r11), new java.lang.Integer(r12));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2497325975796263005L, null, r9, r10, new java.lang.Integer(r11), new java.lang.Integer(r12));     // Catch: java.lang.Throwable -> L16
    L5:
        int r0 = 0;
    L6:
        if (r0 >= r12) goto L15;
        int r1 = r9.read(r10, r11 + r0, r12 - r0);     // Catch: java.lang.Throwable -> L16
        if (r1 == (-1)) goto L10;
        r0 = r0 + r1;
        goto L6
    L10:
        if (r0 > 0) goto L27;
        return -1;
    L27:
        return r0;
    L15:
        return r0;
    }

    public static java.lang.String j6(java.io.InputStream r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 370504340859600000L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(370504340859600000L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(new java.io.InputStreamReader(r5));
    }

    public static java.lang.String j6(java.io.Reader r8) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 698705286827615665L, null, r8);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(698705286827615665L, null, r8);     // Catch: java.lang.Throwable -> L12
    L6:
        java.io.BufferedReader r3 = new java.io.BufferedReader(r8);     // Catch: java.lang.Throwable -> L12
        java.lang.StringBuilder r4 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L12
        char[] r5 = new char[8192];     // Catch: java.lang.Throwable -> L12
    L7:
        int r6 = r3.read(r5, 0, r5.length);     // Catch: java.lang.Throwable -> L12
        if (r6 <= 0) goto L10;
        r4.append(r5, 0, r6);     // Catch: java.lang.Throwable -> L12
        goto L7
    L10:
        return r4.toString();
    }

    public static void j6(java.io.InputStream r7, java.io.OutputStream r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 6971637334206136032L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6971637334206136032L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r7, r8, true);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(java.io.InputStream r8, java.io.OutputStream r9, boolean r10) {
    L23:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, 1437261948199776069L, null, r8, r9, new java.lang.Boolean(r10));
    L28:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1437261948199776069L, null, r8, r9, new java.lang.Boolean(r10));     // Catch: java.lang.Throwable -> L23
    L5:
        byte[] r0 = new byte[4096];     // Catch: java.lang.Throwable -> L23
    L31:
        int r1 = r8.read(r0);     // Catch: java.lang.Throwable -> L15
        if (r1 == (-1)) goto L10;
        r9.write(r0, 0, r1);     // Catch: java.lang.Throwable -> L15
    L10:
        if (r10 == false) goto L12;
        r8.close();     // Catch: java.lang.Throwable -> L19
    L12:
        if (r10 == false) goto L35;
        r9.close();     // Catch: java.lang.Throwable -> L23
        return;
    L35:
        return;
    L19:
        th = move-exception;
        if (r10 == false) goto L22;
        r9.close();     // Catch: java.lang.Throwable -> L23
    L22:
        throw th;     // Catch: java.lang.Throwable -> L23
    L15:
        th = move-exception;
        if (r10 == false) goto L18;
        r8.close();     // Catch: java.lang.Throwable -> L19
    L18:
        throw th;     // Catch: java.lang.Throwable -> L19
    }

    public static void j6(java.io.Reader r7, java.io.Writer r8) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -8207949121622678776L, null, r7, r8);
    L24:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-8207949121622678776L, null, r7, r8);     // Catch: java.lang.Throwable -> L19
    L5:
        char[] r0 = new char[4096];     // Catch: java.lang.Throwable -> L19
    L26:
        int r1 = r7.read(r0);     // Catch: java.lang.Throwable -> L13
        if (r1 == (-1)) goto L10;
        r8.write(r0, 0, r1);     // Catch: java.lang.Throwable -> L13
    L10:
        r7.close();     // Catch: java.lang.Throwable -> L16
        r8.close();     // Catch: java.lang.Throwable -> L19
        return;
    L13:
        th = move-exception;
        r7.close();     // Catch: java.lang.Throwable -> L16
        throw th;     // Catch: java.lang.Throwable -> L16
    L16:
        th = move-exception;
        r8.close();     // Catch: java.lang.Throwable -> L19
        throw th;     // Catch: java.lang.Throwable -> L19
    }

    public static boolean j6(java.io.InputStream r7, java.io.InputStream r8) {
    L27:
        th = move-exception;
        if (DW == false) goto L32;
        abcd.wu.j6(th, -3912056261930219600L, null, r7, r8);
    L32:
        throw th;
    L3:
        if (j6 == false) goto L35;
        abcd.wu.j6(-3912056261930219600L, null, r7, r8);     // Catch: java.lang.Throwable -> L27
    L35:
        byte[] r1 = new byte[8192];     // Catch: java.lang.Throwable -> L24
        byte[] r0 = new byte[8192];     // Catch: java.lang.Throwable -> L24
    L7:
        int r2 = j6(r7, r1);     // Catch: java.lang.Throwable -> L24
        if (r2 != j6(r8, r0)) goto L10;
        if (r2 == (-1)) goto L14;
        int r3 = 0;
    L18:
        if (r3 >= r2) goto L7;
        if (r1[r3] != r0[r3]) goto L21;
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L27
        goto L18
    L21:
        r7.close();     // Catch: java.lang.Throwable -> L27
        r8.close();     // Catch: java.lang.Throwable -> L27
        return false;
    L14:
        r7.close();     // Catch: java.lang.Throwable -> L27
        r8.close();     // Catch: java.lang.Throwable -> L27
        return true;
    L10:
        r7.close();     // Catch: java.lang.Throwable -> L27
        r8.close();     // Catch: java.lang.Throwable -> L27
        return false;
    L24:
        th = move-exception;
        r7.close();     // Catch: java.lang.Throwable -> L27
        r8.close();     // Catch: java.lang.Throwable -> L27
        throw th;     // Catch: java.lang.Throwable -> L27
    }
}
