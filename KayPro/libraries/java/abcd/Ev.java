package abcd;

public class Ev {
    public static java.util.Set<java.lang.Long> DW;
    private static java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> FH;
    private static java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> Hw;
    private static java.util.Map<java.lang.Long, java.lang.reflect.Method> VH;
    private static java.util.Map<java.lang.Long, java.lang.Class> Zo;
    private static java.util.Map<java.lang.Long, java.lang.reflect.Field> gn;
    public static java.util.Set<java.lang.Long> j6;
    private static java.util.Map<java.lang.Long, java.util.List<java.lang.Class>> v5;

    static {
        j6 = new java.util.HashSet();
        DW = new java.util.HashSet();
        FH = new java.util.HashMap();
        Hw = new java.util.HashMap();
        v5 = new java.util.HashMap();
        Zo = new java.util.HashMap();
        VH = new java.util.HashMap();
        gn = new java.util.HashMap();
    }

    public static java.lang.reflect.Method DW(long r5, long r7) {
        java.lang.reflect.Method r0 = VH.get(java.lang.Long.valueOf(r7));
        if (r0 == null) goto L5;
        return r0;
    L5:
        java.lang.Class r6 = Zo.get(java.lang.Long.valueOf(r5));
        if (r6 == null) goto L16;
        java.lang.reflect.Method[] r8 = r6.getDeclaredMethods();
        int r9 = r8.length;
        int r1 = 0;
    L8:
        if (r1 >= r9) goto L22;
        java.lang.reflect.Method r2 = r8[r1];
        abcd.Interfacesu r3 = (abcd.Interfacesu) r2.getAnnotation(abcd.Interfacesu.class);
        if (r3 == null) goto L15;
        if (r3.method() != r7) goto L15;
        VH.put(java.lang.Long.valueOf(r7), r2);
        return r2;
    L15:
        r1 = r1 + 1;
        goto L8
    L22:
        return null;
    L16:
        return null;
    }

    public static void DW(long r2, long r4, boolean r6) {
        abcd.yw.j6("Code", "Set onThrow " + r6 + ": container " + r2 + " method " + r4);
        if (r6 == false) goto L13;
        DW.add(java.lang.Long.valueOf(r4));
        if (FH.containsKey(java.lang.Long.valueOf(r2)) == true) goto L7;
        FH.put(java.lang.Long.valueOf(r2), new java.util.HashSet());
    L7:
        FH.get(java.lang.Long.valueOf(r2)).add(java.lang.Long.valueOf(r4));
        if (v5.containsKey(java.lang.Long.valueOf(r2)) == false) goto L26;
        java.util.Iterator<java.lang.Class> r3 = v5.get(java.lang.Long.valueOf(r2)).iterator();
    L11:
        if (r3.hasNext() == false) goto L31;
        DW(r3.next(), true);
        goto L11
    L31:
        return;
    L26:
        return;
    L13:
        DW.remove(java.lang.Long.valueOf(r4));
        if (FH.containsKey(java.lang.Long.valueOf(r2)) == false) goto L19;
        FH.get(java.lang.Long.valueOf(r2)).remove(java.lang.Long.valueOf(r4));
        if (FH.get(java.lang.Long.valueOf(r2)).size() != 0) goto L19;
        java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> r7 = FH;
        r7.remove(r7);
    L19:
        if (FH.containsKey(java.lang.Long.valueOf(r4)) == false) goto L21;
        return;
    L21:
        if (v5.containsKey(java.lang.Long.valueOf(r2)) == false) goto L30;
        java.util.Iterator<java.lang.Class> r5 = v5.get(java.lang.Long.valueOf(r2)).iterator();
    L24:
        if (r5.hasNext() == false) goto L32;
        DW(r5.next(), false);
        goto L24
    L32:
        return;
    }

    private static void DW(java.lang.Class<?> r4, boolean r5) {
        abcd.yw.j6("Code", "Toggle onThrow " + r5 + " " + r4);     // Catch: java.lang.Throwable -> L9
        java.lang.reflect.Field[] r6 = r4.getDeclaredFields();     // Catch: java.lang.Throwable -> L9
        int r0 = r6.length;     // Catch: java.lang.Throwable -> L9
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L16;
        java.lang.reflect.Field r2 = r6[r1];     // Catch: java.lang.Throwable -> L9
        if (r2.getAnnotation(abcd.Interfaceuu.class) != null) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        r2.setAccessible(true);     // Catch: java.lang.Throwable -> L9
        r2.set(null, java.lang.Boolean.valueOf(r5));     // Catch: java.lang.Throwable -> L9
        return;
    L16:
        return;
    L9:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
    }

    public static boolean DW(java.lang.Object r1, long r2) {
        java.lang.Class r3 = Zo.get(java.lang.Long.valueOf(r2));
        if (r3 != null) goto L5;
        return false;
    L5:
        return r3.isInstance(r1);
    }

    public static java.lang.Class<?> j6(long r1) {
        java.lang.Class<?> r2 = Zo.get(java.lang.Long.valueOf(r1));
        if (r2 == null) goto L6;
        return r2;
    L6:
        throw new java.lang.NoClassDefFoundError();
    }

    public static java.lang.Object j6(java.lang.Object r1, long r2) {
        java.lang.Class r3 = Zo.get(java.lang.Long.valueOf(r2));
        if (r3 != null) goto L5;
        return null;
    L5:
        return j6(r1, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T j6(java.lang.Object r7, java.lang.Class<T> r8) {
        if (r7 != 0) goto L6;
        return null;
    L6:
        if (r8.isInstance(r7) == false) goto L22;
        return r7;
    L22:
        java.lang.reflect.Field[] r2 = r7.getClass().getDeclaredFields();     // Catch: java.lang.Exception -> L17
        int r3 = r2.length;     // Catch: java.lang.Exception -> L17
        int r4 = 0;
    L10:
        if (r4 >= r3) goto L16;
        java.lang.reflect.Field r5 = r2[r4];     // Catch: java.lang.Exception -> L17
        if (((abcd.Interfacevu) r5.getAnnotation(abcd.Interfacevu.class)) != null) goto L13;
        r4 = r4 + 1;
        goto L10
    L13:
        r5.setAccessible(true);     // Catch: java.lang.Exception -> L17
        return (T) j6(r5.get(r7), r8);
    L16:
        return null;
    L17:
        java.lang.reflect.Field r6 = r7.getClass().getDeclaredField("this$0");     // Catch: java.lang.Exception -> L19
        r6.setAccessible(true);     // Catch: java.lang.Exception -> L19
        return (T) j6(r6.get(r7), r8);
    L19:
        java.lang.reflect.Field r9 = r7.getClass().getDeclaredField("arg$1");     // Catch: java.lang.Exception -> L21
        r9.setAccessible(true);     // Catch: java.lang.Exception -> L21
        return (T) j6(r9.get(r7), r8);
    L21:
        return null;
    }

    public static java.lang.reflect.Field j6(long r5, long r7) {
        java.lang.reflect.Field r0 = gn.get(java.lang.Long.valueOf(r7));
        if (r0 == null) goto L5;
        return r0;
    L5:
        java.lang.Class r6 = Zo.get(java.lang.Long.valueOf(r5));
        if (r6 == null) goto L16;
        java.lang.reflect.Field[] r8 = r6.getDeclaredFields();
        int r9 = r8.length;
        int r1 = 0;
    L8:
        if (r1 >= r9) goto L22;
        java.lang.reflect.Field r2 = r8[r1];
        abcd.Interfaceru r3 = (abcd.Interfaceru) r2.getAnnotation(abcd.Interfaceru.class);
        if (r3 == null) goto L15;
        if (r3.field() != r7) goto L15;
        gn.put(java.lang.Long.valueOf(r7), r2);
        return r2;
    L15:
        r1 = r1 + 1;
        goto L8
    L22:
        return null;
    L16:
        return null;
    }

    public static void j6(long r2, long r4, boolean r6) {
        abcd.yw.j6("Code", "Set onEnter " + r6 + ": container " + r2 + " method " + r4);
        if (r6 == false) goto L13;
        j6.add(java.lang.Long.valueOf(r4));
        if (Hw.containsKey(java.lang.Long.valueOf(r2)) == true) goto L7;
        Hw.put(java.lang.Long.valueOf(r2), new java.util.HashSet());
    L7:
        Hw.get(java.lang.Long.valueOf(r2)).add(java.lang.Long.valueOf(r4));
        if (v5.containsKey(java.lang.Long.valueOf(r2)) == false) goto L26;
        java.util.Iterator<java.lang.Class> r3 = v5.get(java.lang.Long.valueOf(r2)).iterator();
    L11:
        if (r3.hasNext() == false) goto L31;
        j6(r3.next(), true);
        goto L11
    L31:
        return;
    L26:
        return;
    L13:
        j6.remove(java.lang.Long.valueOf(r4));
        if (Hw.containsKey(java.lang.Long.valueOf(r2)) == false) goto L19;
        Hw.get(java.lang.Long.valueOf(r2)).remove(java.lang.Long.valueOf(r4));
        if (Hw.get(java.lang.Long.valueOf(r2)).size() != 0) goto L19;
        java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> r7 = Hw;
        r7.remove(r7);
    L19:
        if (Hw.containsKey(java.lang.Long.valueOf(r4)) == false) goto L21;
        return;
    L21:
        if (v5.containsKey(java.lang.Long.valueOf(r2)) == false) goto L30;
        java.util.Iterator<java.lang.Class> r5 = v5.get(java.lang.Long.valueOf(r2)).iterator();
    L24:
        if (r5.hasNext() == false) goto L32;
        j6(r5.next(), false);
        goto L24
    L32:
        return;
    }

    public static void j6(java.lang.Class<?> r3, long r4, long r6) {
        if (v5.containsKey(java.lang.Long.valueOf(r4)) == true) goto L5;
        v5.put(java.lang.Long.valueOf(r4), new java.util.ArrayList());
    L5:
        v5.get(java.lang.Long.valueOf(r4)).add(r3);
        Zo.put(java.lang.Long.valueOf(r6), r3);
        if (Hw.containsKey(java.lang.Long.valueOf(r4)) == false) goto L8;
    L9:
        abcd.yw.j6("Code", "Load active class " + r3 + ": container " + r4 + " class " + r6);
    L11:
        if (Hw.containsKey(java.lang.Long.valueOf(r4)) == false) goto L14;
        j6(r3, true);
    L14:
        if (FH.containsKey(java.lang.Long.valueOf(r4)) == false) goto L17;
        DW(r3, true);
        return;
    L17:
        return;
    L8:
        if (FH.containsKey(java.lang.Long.valueOf(r4)) == false) goto L11;
        goto L9
    }

    private static void j6(java.lang.Class<?> r4, boolean r5) {
        abcd.yw.j6("Code", "Toggle onEnter " + r5 + " " + r4);     // Catch: java.lang.Throwable -> L9
        java.lang.reflect.Field[] r6 = r4.getDeclaredFields();     // Catch: java.lang.Throwable -> L9
        int r0 = r6.length;     // Catch: java.lang.Throwable -> L9
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L16;
        java.lang.reflect.Field r2 = r6[r1];     // Catch: java.lang.Throwable -> L9
        if (r2.getAnnotation(abcd.Interfacetu.class) != null) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        r2.setAccessible(true);     // Catch: java.lang.Throwable -> L9
        r2.set(null, java.lang.Boolean.valueOf(r5));     // Catch: java.lang.Throwable -> L9
        return;
    L16:
        return;
    L9:
        th = move-exception;
        abcd.yw.j6("Runtime Error", th);
    }
}
