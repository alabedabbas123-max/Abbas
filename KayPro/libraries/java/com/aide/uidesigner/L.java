package com.aide.uidesigner;

@abcd.Interfacexu
public class L {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.L.class, -2150908242116545680L, -2150908242116545680L);
    }

    public L() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5203276896473754525L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5203276896473754525L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @abcd.Interfacesu(method = 1448757450179201013L)
    private static java.util.List<com.aide.common.ua.a> DW(android.app.Activity r7, com.aide.uidesigner.ClassS r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -424790971500819665L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-424790971500819665L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L7
        r0.addAll(FH(r7, r8));     // Catch: java.lang.Throwable -> L7
        r0.addAll(Hw(r7, r8));     // Catch: java.lang.Throwable -> L7
        return r0;
    }

    @abcd.Interfacesu(method = -3459724401338190993L)
    private static java.util.List<com.aide.common.ua.a> FH(android.app.Activity r7, com.aide.uidesigner.ClassS r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 4087902274621270701L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4087902274621270701L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        return java.util.Arrays.asList(new com.aide.common.ua.a[]{new com.aide.uidesigner.ClassX(r8, r7), new com.aide.uidesigner.C1915y(r7, r8), new com.aide.uidesigner.A(r8, r7), new com.aide.uidesigner.C(r8, r7), new com.aide.uidesigner.E(r8, r7), new com.aide.uidesigner.G(r8, r7), new com.aide.uidesigner.I(r8, r7), new com.aide.uidesigner.K(r7, r8), new com.aide.uidesigner.ClassT(r8), new com.aide.uidesigner.C1911u(r8, r7), new com.aide.uidesigner.C1912v(r8, r7)});
    }

    @abcd.Interfacesu(method = -2382694599864101963L)
    private static java.util.List<com.aide.common.ua.a> Hw(android.app.Activity r7, com.aide.uidesigner.ClassS r8) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, 1756864205468733015L, null, r7, r8);
    L24:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1756864205468733015L, null, r7, r8);     // Catch: java.lang.Throwable -> L19
    L5:
        java.util.ArrayList r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L19
        java.util.Iterator<com.aide.uidesigner.ClassA> r1 = r8.getAttributes().iterator();     // Catch: java.lang.Throwable -> L19
    L6:
        if (r1.hasNext() == false) goto L18;
        com.aide.uidesigner.ClassA r2 = r1.next();     // Catch: java.lang.Throwable -> L19
        if (r2.FH() == false) goto L13;
        java.lang.String r3 = r2.FH.j6() + " styled <b>" + r2.j6() + "</b>";     // Catch: java.lang.Throwable -> L19
    L16:
        r0.add(new com.aide.uidesigner.C1913w(r7, r8, r2, r3));     // Catch: java.lang.Throwable -> L19
        goto L6
    L13:
        if (r2.DW() == false) goto L15;
        r3 = r2.FH.j6() + " = <b>" + r2.j6() + "</b>";     // Catch: java.lang.Throwable -> L19
        goto L16
    L15:
        r3 = r2.FH.j6();     // Catch: java.lang.Throwable -> L19
        goto L16
    L18:
        return r0;
    }

    public static void j6(android.app.Activity r7, com.aide.uidesigner.ClassS r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5678331379897073831L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5678331379897073831L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.common.Abstractma.j6(r7, new com.aide.common.ua(r8.getPath(), DW(r7, r8)));     // Catch: java.lang.Throwable -> L7
    }
}
