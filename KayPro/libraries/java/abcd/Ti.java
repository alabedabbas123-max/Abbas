package abcd;

@abcd.Interfacexu
public class Ti {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.Ti.class, 5954351271705613112L, 5954351271705613112L);
    }

    public Ti() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1661105084502740968L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1661105084502740968L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static java.util.List<java.lang.String> DW(java.lang.String r7, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1931341203769167955L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1931341203769167955L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        java.util.HashSet r0 = new java.util.HashSet();     // Catch: java.lang.Throwable -> L7
        java.util.ArrayList r1 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L7
        j6(r7, r8, r0, r1);     // Catch: java.lang.Throwable -> L7
        return r1;
    }

    public static java.util.Map<java.lang.String, java.util.List<java.lang.String>> j6(java.lang.String r7, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -3252213030375534953L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3252213030375534953L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        java.util.HashMap r0 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L7
        j6(r7, r8, r0);     // Catch: java.lang.Throwable -> L7
        return r0;
    }

    @abcd.Interfacesu(method = 1059576926652699336L)
    private static void j6(java.lang.String r8, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -1739145866213029132L, null, r8, r9, r10);
    L21:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1739145866213029132L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L16
    L6:
        if (r10.containsKey(r8) == true) goto L15;
        java.util.List<java.lang.String> r0 = r9.get(r8);     // Catch: java.lang.Throwable -> L16
        if (r0 != null) goto L10;
        r0 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L16
    L10:
        r10.put(r8, r0);     // Catch: java.lang.Throwable -> L16
        java.util.Iterator<java.lang.String> r1 = r0.iterator();     // Catch: java.lang.Throwable -> L16
    L11:
        if (r1.hasNext() == false) goto L26;
        j6(r1.next(), r9, r10);     // Catch: java.lang.Throwable -> L16
        goto L11
    L26:
        return;
    }

    @abcd.Interfacesu(method = -2290371236549358953L)
    private static void j6(java.lang.String r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, java.util.Set<java.lang.String> r11, java.util.List<java.lang.String> r12) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -4855936115600225771L, null, r9, r10, r11, r12);
    L21:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4855936115600225771L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L16
    L6:
        if (r11.contains(r9) == true) goto L15;
        r11.add(r9);     // Catch: java.lang.Throwable -> L16
        if (r12.contains(r9) == true) goto L10;
        r12.add(r9);     // Catch: java.lang.Throwable -> L16
    L10:
        java.util.Iterator<java.lang.String> r0 = r10.get(r9).iterator();     // Catch: java.lang.Throwable -> L16
    L11:
        if (r0.hasNext() == false) goto L26;
        j6(r0.next(), r10, r11, r12);     // Catch: java.lang.Throwable -> L16
        goto L11
    L26:
        return;
    }
}
