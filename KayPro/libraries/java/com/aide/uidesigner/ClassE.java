package com.aide.uidesigner;

@abcd.Interfacexu
public class ClassE {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassE.class, -2705139259622029791L, -2705139259622029791L);
    }

    public ClassE() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1931914286760774756L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1931914286760774756L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static java.lang.String DW() {
        java.lang.String r0 = null;
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 4676949321758339140L, r0);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4676949321758339140L, null);     // Catch: java.lang.Throwable -> L12
    L6:
        java.io.File r3 = android.os.Environment.getExternalStorageDirectory();     // Catch: java.lang.Throwable -> L12
        if (r3.exists() == false) goto L10;
        r0 = r3.getPath();     // Catch: java.lang.Throwable -> L12
        return r0;
    L10:
        return "/mnt/sdcard";
    }

    public static java.lang.String DW(android.content.Context r8, android.net.Uri r9) {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -6732646976338307100L, null, r8, r9);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-6732646976338307100L, null, r8, r9);     // Catch: java.lang.Throwable -> L15
    L7:
        if ("content".equals(r9.getScheme()) == false) goto L11;
        android.database.Cursor r1 = r8.getContentResolver().query(r9, new java.lang.String[]{"_data"}, null, null, null);     // Catch: java.lang.Throwable -> L15
        int r0 = r1.getColumnIndexOrThrow("_data");     // Catch: java.lang.Throwable -> L15
        r1.moveToFirst();     // Catch: java.lang.Throwable -> L15
        return r1.getString(r0);
    L11:
        if ("file".equals(r9.getScheme()) == true) goto L13;
        return null;
    L13:
        return r9.getPath();
    }

    public static java.util.List<java.io.File> DW(java.lang.String r10) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -5637595544212521960L, null, r10);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5637595544212521960L, null, r10);     // Catch: java.lang.Throwable -> L16
    L6:
        java.util.ArrayList r3 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L16
        java.io.File[] r4 = new java.io.File(r10, "layout").listFiles();     // Catch: java.lang.Throwable -> L16
        if (r4 == null) goto L14;
        int r5 = r4.length;     // Catch: java.lang.Throwable -> L16
        int r6 = 0;
    L9:
        if (r6 >= r5) goto L14;
        java.io.File r7 = r4[r6];     // Catch: java.lang.Throwable -> L16
        if (r7.getName().endsWith(".xml") == false) goto L13;
        r3.add(r7);     // Catch: java.lang.Throwable -> L16
    L13:
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L16
    L14:
        java.util.Collections.sort(r3, new com.aide.uidesigner.ClassD());     // Catch: java.lang.Throwable -> L16
        return r3;
    }

    public static java.lang.String FH(java.lang.String r9) {
    L29:
        th = move-exception;
        if (DW == false) goto L34;
        abcd.wu.j6(th, 6076388906223223763L, null, r9);
    L34:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(6076388906223223763L, null, r9);     // Catch: java.lang.Throwable -> L29
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

    public static java.lang.String Hw(java.lang.String r9) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -269436893562331629L, null, r9);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-269436893562331629L, null, r9);     // Catch: java.lang.Throwable -> L12
    L6:
        java.io.File r4 = new java.io.File(r9, "layout");     // Catch: java.lang.Throwable -> L12
        r4.mkdirs();     // Catch: java.lang.Throwable -> L12
        int r5 = 1;
    L7:
        java.lang.StringBuilder r7 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L12
        r7.append("layout");     // Catch: java.lang.Throwable -> L12
        int r8 = r5 + 1;     // Catch: java.lang.Throwable -> L12
        r7.append(r5);     // Catch: java.lang.Throwable -> L12
        r7.append(".xml");     // Catch: java.lang.Throwable -> L12
        java.io.File r6 = new java.io.File(r4, r7.toString());     // Catch: java.lang.Throwable -> L12
        if (r6.exists() == false) goto L9;
        r5 = r8;
        goto L7
    L9:
        return r6.getName();
    }

    public static long j6(java.io.InputStream r7, java.io.OutputStream r8) {
    L11:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -3843410740143351909L, null, r7, r8);
    L16:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3843410740143351909L, null, r7, r8);     // Catch: java.lang.Throwable -> L11
    L5:
        long r0 = 0;
        byte[] r2 = new byte[1000];     // Catch: java.lang.Throwable -> L11
    L6:
        int r3 = r7.read(r2);     // Catch: java.lang.Throwable -> L11
        if (r3 == (-1)) goto L9;
        r0 = r0 + ((long) r3);     // Catch: java.lang.Throwable -> L11
        r8.write(r2, 0, r3);     // Catch: java.lang.Throwable -> L11
        goto L6
    L9:
        r7.close();     // Catch: java.lang.Throwable -> L11
        r8.close();     // Catch: java.lang.Throwable -> L11
        return r0;
    }

    public static java.lang.String j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 764067844874393001L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(764067844874393001L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        return DW() + "/AppProjects/UIDesigns/res";
    }

    public static java.lang.String j6(android.content.Context r7, android.net.Uri r8) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -759348599259927288L, null, r7, r8);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-759348599259927288L, null, r7, r8);     // Catch: java.lang.Throwable -> L10
    L5:
        java.lang.String r0 = DW(r7, r8);     // Catch: java.lang.Throwable -> L10
        if (r0 != null) goto L8;
        return null;
    L8:
        return r0.substring(r0.lastIndexOf("/") + 1, r0.length());
    }

    public static java.lang.String j6(java.lang.String r9) {
    L17:
        th = move-exception;
        if (DW == false) goto L22;
        abcd.wu.j6(th, -1488321909622508240L, null, r9);
    L22:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1488321909622508240L, null, r9);     // Catch: java.lang.Throwable -> L17
    L6:
        java.io.File[] r3 = new java.io.File(r9, "layout").listFiles();     // Catch: java.lang.Throwable -> L17
        if (r3 == null) goto L16;
        int r4 = r3.length;     // Catch: java.lang.Throwable -> L17
        int r5 = 0;
    L9:
        if (r5 >= r4) goto L16;
        java.io.File r6 = r3[r5];     // Catch: java.lang.Throwable -> L17
        if (r6.getName().endsWith(".xml") == true) goto L13;
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L17
        goto L9
    L13:
        return r6.getPath();
    L16:
        return j6(r9, Hw(r9));
    }

    public static java.lang.String j6(java.lang.String r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -413584676189093376L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-413584676189093376L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        return j6(r7, r8, "");
    }

    public static java.lang.String j6(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
    L17:
        th = move-exception;
        java.lang.String r6 = r9;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -484412775610803360L, null, r8, r6, r10);
    L21:
        throw th;
    L3:
        if (j6 == false) goto L24;
        abcd.wu.j6(-484412775610803360L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L17
    L24:
        java.io.File r0 = new java.io.File(r8, "layout");     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L17
        r0.mkdirs();     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L17
        if (r9 != null) goto L8;
    L9:
        r9 = Hw(r8);     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L17
    L10:
        java.io.File r1 = new java.io.File(r0, r9);     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L17
        if (r1.exists() == false) goto L13;
        r1 = new java.io.File(r0, Hw(r8));     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L17
    L13:
        java.io.FileWriter r2 = new java.io.FileWriter(r1);     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L17
        r2.write(r10);     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L17
        r2.close();     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L17
        return r1.getPath();
    L8:
        if (r9.trim().length() != 0) goto L10;
    L15:
        return null;
    }
}
