package abcd;

@abcd.Interfacexu
public class H {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.H.class, -631724314935631775L, -631724314935631775L);
    }

    public H() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 400620540988354127L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(400620540988354127L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static int DW(android.content.Context r8, java.lang.String r9, double... r10) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -520151565633891585L, null, r8, r9, r10);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-520151565633891585L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L10
    L5:
        android.content.SharedPreferences r0 = DW(r8);     // Catch: java.lang.Throwable -> L10
        if (r0.contains(r9) == true) goto L8;
        int r1 = j6(r10);     // Catch: java.lang.Throwable -> L10
        android.content.SharedPreferences.Editor r2 = r0.edit();     // Catch: java.lang.Throwable -> L10
        r2.putInt(r9, r1);     // Catch: java.lang.Throwable -> L10
        r2.commit();     // Catch: java.lang.Throwable -> L10
        j6(r9, r1);     // Catch: java.lang.Throwable -> L10
    L8:
        return r0.getInt(r9, 0);
    }

    @abcd.Interfacesu(method = -1403905902894147609L)
    private static android.content.SharedPreferences DW(android.content.Context r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1853143184556849504L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1853143184556849504L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return r5.getSharedPreferences("SplitTests", 0);
    }

    @abcd.Interfacesu(method = 3310114134219083920L)
    private static java.lang.String DW(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2482867755154384323L, null, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2482867755154384323L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return java.lang.Character.toString((char) (r5 + 65));
    }

    public static boolean DW(android.content.Context r7, java.lang.String r8) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -1449882754732320003L, null, r7, r8);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1449882754732320003L, null, r7, r8);     // Catch: java.lang.Throwable -> L10
    L5:
        if (DW(r7, r8, j6(2)) == 0) goto L8;
        return true;
    L8:
        return false;
    }

    @abcd.Interfacesu(method = 2014466822845368320L)
    private static boolean DW(android.content.Context r8, java.lang.String r9, boolean r10) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, 4389278610342810305L, null, r8, r9, new java.lang.Boolean(r10));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4389278610342810305L, null, r8, r9, new java.lang.Boolean(r10));     // Catch: java.lang.Throwable -> L17
    L5:
        android.content.SharedPreferences r0 = j6(r8);     // Catch: java.lang.Throwable -> L17
        if (r10 == true) goto L8;
    L12:
        boolean r3 = false;
    L14:
        if (r0.getBoolean(r9, false) == true) goto L16;
        android.content.SharedPreferences.Editor r1 = r0.edit();     // Catch: java.lang.Throwable -> L17
        r1.putBoolean(r9, r10);     // Catch: java.lang.Throwable -> L17
        r1.commit();     // Catch: java.lang.Throwable -> L17
    L16:
        return r3;
    L8:
        if (r0.contains(r9) == false) goto L12;
        if (r0.getBoolean(r9, false) == true) goto L12;
        r3 = true;
        goto L14
    }

    @abcd.Interfacesu(method = 2412988057358639712L)
    private static void FH(android.content.Context r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 815116290126791247L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(815116290126791247L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.F.j6("Conversion_" + r8);     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -4515226447643989528L)
    private static void Hw(android.content.Context r7, java.lang.String r8) {
    L11:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 742861982389369581L, null, r7, r8);
    L16:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(742861982389369581L, null, r7, r8);     // Catch: java.lang.Throwable -> L11
    L5:
        java.util.Iterator<java.util.Map.Entry<java.lang.String, ?>> r0 = DW(r7).getAll().entrySet().iterator();     // Catch: java.lang.Throwable -> L11
    L6:
        if (r0.hasNext() == false) goto L10;
        java.util.Map.Entry<java.lang.String, ?> r1 = r0.next();     // Catch: java.lang.Throwable -> L11
        j6(r7, r8, r1.getKey(), ((java.lang.Integer) r1.getValue()).intValue());     // Catch: java.lang.Throwable -> L11
        goto L6
    }

    @abcd.Interfacesu(method = 216919943116405264L)
    private static int j6(double... r10) {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -1465681611648003165L, null, r10);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1465681611648003165L, null, r10);     // Catch: java.lang.Throwable -> L18
    L6:
        double r3 = new java.util.Random().nextDouble();     // Catch: java.lang.Throwable -> L18
        int r5 = 0;
        double r6 = 0.0d;
    L8:
        if (r5 >= r10.length) goto L14;
        r6 = r6 + r10[r5];     // Catch: java.lang.Throwable -> L18
        if (r6 >= r3) goto L14;
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L18
    L14:
        if (r5 != r10.length) goto L29;
        return r10.length - 1;
    L29:
        return r5;
    }

    @abcd.Interfacesu(method = -1399776985629449889L)
    private static android.content.SharedPreferences j6(android.content.Context r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1916053960646527940L, null, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1916053960646527940L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return r5.getSharedPreferences("Conversions", 0);
    }

    public static void j6(android.content.Context r7, java.lang.String r8) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, -5047671496272181111L, null, r7, r8);
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5047671496272181111L, null, r7, r8);     // Catch: java.lang.Throwable -> L9
    L6:
        if (v5(r7, r8) == false) goto L16;
        FH(r7, r8);     // Catch: java.lang.Throwable -> L9
        Hw(r7, r8);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public static void j6(android.content.Context r8, java.lang.String r9, int r10) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, -3343354739488848623L, null, r8, r9, new java.lang.Integer(r10));
    L13:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3343354739488848623L, null, r8, r9, new java.lang.Integer(r10));     // Catch: java.lang.Throwable -> L9
    L5:
        android.content.SharedPreferences r0 = DW(r8);     // Catch: java.lang.Throwable -> L9
        if (r0.contains(r9) == true) goto L16;
        android.content.SharedPreferences.Editor r1 = r0.edit();     // Catch: java.lang.Throwable -> L9
        r1.putInt(r9, r10);     // Catch: java.lang.Throwable -> L9
        r1.commit();     // Catch: java.lang.Throwable -> L9
        j6(r9, r10);     // Catch: java.lang.Throwable -> L9
        return;
    }

    public static void j6(android.content.Context r8, java.lang.String r9, long r10) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 2006714162712158244L, null, r8, r9, new java.lang.Long(r10));
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(2006714162712158244L, null, r8, r9, new java.lang.Long(r10));     // Catch: java.lang.Throwable -> L12
    L7:
        if (v5(r8, r9) == true) goto L9;
        return;
    L9:
        if (r10 <= 0) goto L20;
        long r1 = (java.lang.System.currentTimeMillis() - r10) / 3600000;     // Catch: java.lang.Throwable -> L12
        java.lang.String r3 = r9 + "_" + (r1 / 24) + "days";     // Catch: java.lang.Throwable -> L12
        FH(r8, r3);     // Catch: java.lang.Throwable -> L12
        Hw(r8, r3);     // Catch: java.lang.Throwable -> L12
        java.lang.String r0 = r9 + "_" + r1 + "hours";     // Catch: java.lang.Throwable -> L12
        FH(r8, r0);     // Catch: java.lang.Throwable -> L12
        Hw(r8, r0);     // Catch: java.lang.Throwable -> L12
        return;
    }

    @abcd.Interfacesu(method = 2278900053720331740L)
    private static void j6(android.content.Context r9, java.lang.String r10, java.lang.String r11, int r12) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5251387218189944427L, null, r9, r10, r11, new java.lang.Integer(r12));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5251387218189944427L, null, r9, r10, r11, new java.lang.Integer(r12));     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.F.j6("Group_" + r11 + "_" + r10 + "_" + DW(r12));     // Catch: java.lang.Throwable -> L8
    }

    public static void j6(android.content.Context r8, java.lang.String r9, boolean r10) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 623120749578508000L, null, r8, r9, new java.lang.Boolean(r10));
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(623120749578508000L, null, r8, r9, new java.lang.Boolean(r10));     // Catch: java.lang.Throwable -> L9
    L6:
        if (DW(r8, r9, r10) == false) goto L16;
        FH(r8, r9);     // Catch: java.lang.Throwable -> L9
        Hw(r8, r9);     // Catch: java.lang.Throwable -> L9
        return;
    }

    @abcd.Interfacesu(method = -5025945382804827359L)
    private static void j6(java.lang.String r7, int r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 4470573123673594140L, null, r7, new java.lang.Integer(r8));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4470573123673594140L, null, r7, new java.lang.Integer(r8));     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.F.j6("Group_" + r7 + "_" + DW(r8));     // Catch: java.lang.Throwable -> L7
    }

    public static boolean j6(android.content.Context r8, java.lang.String r9, double... r10) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 6275929751280083520L, null, r8, r9, r10);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6275929751280083520L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L10
    L5:
        if (DW(r8, r9, r10) == 0) goto L8;
        return true;
    L8:
        return false;
    }

    @abcd.Interfacesu(method = 6157569440757240L)
    private static double[] j6(int r9) {
    L13:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 3457582000720596921L, null, new java.lang.Integer(r9));
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3457582000720596921L, null, r9);     // Catch: java.lang.Throwable -> L13
    L6:
        double[] r3 = new double[r9];     // Catch: java.lang.Throwable -> L13
        int r4 = 0;
    L7:
        if (r4 >= r3.length) goto L12;
        double r7 = r9;
        java.lang.Double.isNaN(r7);
        r3[r4] = 1.0d / r7;     // Catch: java.lang.Throwable -> L13
        r4 = r4 + 1;
        goto L7
    L12:
        return r3;
    }

    @abcd.Interfacesu(method = 112551046055288393L)
    private static boolean v5(android.content.Context r7, java.lang.String r8) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2885168362231867160L, null, r7, r8);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2885168362231867160L, null, r7, r8);     // Catch: java.lang.Throwable -> L10
    L5:
        android.content.SharedPreferences r0 = j6(r7);     // Catch: java.lang.Throwable -> L10
        if (r0.getBoolean(r8, false) == true) goto L9;
        android.content.SharedPreferences.Editor r1 = r0.edit();     // Catch: java.lang.Throwable -> L10
        r1.putBoolean(r8, true);     // Catch: java.lang.Throwable -> L10
        r1.commit();     // Catch: java.lang.Throwable -> L10
        return true;
    L9:
        return false;
    }
}
