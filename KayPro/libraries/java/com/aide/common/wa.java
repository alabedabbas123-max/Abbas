package com.aide.common;

@abcd.Interfacexu
public class wa {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common.wa.class, 4303922799090801297L, 4303922799090801297L);
    }

    public wa() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4528397624089618344L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4528397624089618344L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static java.lang.Object j6(java.lang.String r7, java.lang.Object r8) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -3466118415688901700L, null, r7, r8);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3466118415688901700L, null, r7, r8);     // Catch: java.lang.Throwable -> L10
    L5:
        if (r7 != null) goto L18;
    L9:
        return r8;
    L18:
        java.lang.Object r9 = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(com.aide.common.ClassJ.j6(r7))).readObject();     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> L10
        if (r9 == null) goto L9;
        return r9;
        goto L9
    }

    public static java.lang.String j6(java.lang.Object r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 1114976387404153443L, null, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1114976387404153443L, null, r5);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r5 != null) goto L16;
        return null;
    L16:
        java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream();     // Catch: java.lang.Exception -> L10 java.lang.Throwable -> L11
        java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream(r3);     // Catch: java.lang.Exception -> L10 java.lang.Throwable -> L11
        r4.writeObject(r5);     // Catch: java.lang.Exception -> L10 java.lang.Throwable -> L11
        r4.close();     // Catch: java.lang.Exception -> L10 java.lang.Throwable -> L11
        return new java.lang.String(com.aide.common.ClassJ.j6(r3.toByteArray()));
    L10:
        return null;
    }
}
