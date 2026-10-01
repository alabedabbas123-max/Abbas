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
        java.lang.reflect.Method r0 = null;
        java.lang.Class r6 = null;
        java.lang.reflect.Method[] r8 = null;
        int r9 = 0;
        int r1 = 0;
        java.lang.reflect.Method r2 = null;
        abcd.Interfacesu r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = VH.get(java.lang.Long.valueOf(r7));
                    if (r0 == null) { $pc0 = 5; continue $sw0; }
                    return r0;
                }
                case 5: {
                    r6 = Zo.get(java.lang.Long.valueOf(r5));
                    if (r6 == null) { $pc0 = 16; continue $sw0; }
                    r8 = r6.getDeclaredMethods();
                    r9 = r8.length;
                    r1 = 0;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r1 >= r9) { $pc0 = 22; continue $sw0; }
                    r2 = r8[r1];
                    r3 = (abcd.Interfacesu) r2.getAnnotation(abcd.Interfacesu.class);
                    if (r3 == null) { $pc0 = 15; continue $sw0; }
                    if (r3.method() != r7) { $pc0 = 15; continue $sw0; }
                    VH.put(java.lang.Long.valueOf(r7), r2);
                    return r2;
                }
                case 15: {
                    r1 = r1 + 1;
                    { $pc0 = 8; continue $sw0; }
                }
                case 22: {
                    return null;
                }
                case 16: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(long r2, long r4, boolean r6) {
        java.util.Iterator<java.lang.Class> r3 = null;
        java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> r7 = null;
        java.util.Iterator<java.lang.Class> r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    abcd.yw.j6("Code", "Set onThrow " + r6 + ": container " + r2 + " method " + r4);
                    if (r6 == false) { $pc1 = 13; continue $sw1; }
                    DW.add(java.lang.Long.valueOf(r4));
                    if (FH.containsKey(java.lang.Long.valueOf(r2)) == true) { $pc1 = 7; continue $sw1; }
                    FH.put(java.lang.Long.valueOf(r2), new java.util.HashSet());
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    FH.get(java.lang.Long.valueOf(r2)).add(java.lang.Long.valueOf(r4));
                    if (v5.containsKey(java.lang.Long.valueOf(r2)) == false) { $pc1 = 26; continue $sw1; }
                    r3 = v5.get(java.lang.Long.valueOf(r2)).iterator();
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    if (r3.hasNext() == false) { $pc1 = 31; continue $sw1; }
                    DW(r3.next(), true);
                    { $pc1 = 11; continue $sw1; }
                }
                case 31: {
                    return;
                }
                case 26: {
                    return;
                }
                case 13: {
                    DW.remove(java.lang.Long.valueOf(r4));
                    if (FH.containsKey(java.lang.Long.valueOf(r2)) == false) { $pc1 = 19; continue $sw1; }
                    FH.get(java.lang.Long.valueOf(r2)).remove(java.lang.Long.valueOf(r4));
                    if (FH.get(java.lang.Long.valueOf(r2)).size() != 0) { $pc1 = 19; continue $sw1; }
                    r7 = FH;
                    r7.remove(r7);
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    if (FH.containsKey(java.lang.Long.valueOf(r4)) == false) { $pc1 = 21; continue $sw1; }
                    return;
                }
                case 21: {
                    if (v5.containsKey(java.lang.Long.valueOf(r2)) == false) { $pc1 = 30; continue $sw1; }
                    r5 = v5.get(java.lang.Long.valueOf(r2)).iterator();
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    if (r5.hasNext() == false) { $pc1 = 32; continue $sw1; }
                    DW(r5.next(), false);
                    { $pc1 = 24; continue $sw1; }
                }
                case 32: {
                    return;
                }
                case 30: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void DW(java.lang.Class<?> r4, boolean r5) {
        java.lang.reflect.Field[] r6 = null;
        int r0 = 0;
        int r1 = 0;
        java.lang.reflect.Field r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        abcd.yw.j6("Code", "Toggle onThrow " + r5 + " " + r4);
                        r6 = r4.getDeclaredFields();
                        r0 = r6.length;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    r1 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r1 >= r0) { $pc2 = 16; continue $sw2; }
                    try {
                        r2 = r6[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    if (r2.getAnnotation(abcd.Interfaceuu.class) != null) { $pc2 = 6; continue $sw2; }
                    r1 = r1 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 6: {
                    try {
                        r2.setAccessible(true);
                        r2.set(null, java.lang.Boolean.valueOf(r5));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 9; continue $sw2;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                case 9: {
                    th = $ex2;
                    abcd.yw.j6("Runtime Error", th);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean DW(java.lang.Object r1, long r2) {
        java.lang.Class r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r3 = Zo.get(java.lang.Long.valueOf(r2));
                    if (r3 != null) { $pc3 = 5; continue $sw3; }
                    return false;
                }
                case 5: {
                    return r3.isInstance(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.Class<?> j6(long r1) {
        java.lang.Class<?> r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r2 = Zo.get(java.lang.Long.valueOf(r1));
                    if (r2 == null) { $pc4 = 6; continue $sw4; }
                    return r2;
                }
                case 6: {
                    throw new java.lang.NoClassDefFoundError();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.Object j6(java.lang.Object r1, long r2) {
        java.lang.Class r3 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r3 = Zo.get(java.lang.Long.valueOf(r2));
                    if (r3 != null) { $pc5 = 5; continue $sw5; }
                    return null;
                }
                case 5: {
                    return j6(r1, r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T j6(java.lang.Object r7, java.lang.Class<T> r8) {
        java.lang.reflect.Field[] r2 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.reflect.Field r5 = null;
        java.lang.reflect.Field r6 = null;
        java.lang.reflect.Field r9 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r7 != 0) { $pc6 = 6; continue $sw6; }
                    return null;
                }
                case 6: {
                    if (r8.isInstance(r7) == false) { $pc6 = 22; continue $sw6; }
                    return r7;
                }
                case 22: {
                    try {
                        r2 = r7.getClass().getDeclaredFields();
                        r3 = r2.length;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 17; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r4 = 0;
                    $pc6 = 10; continue $sw6;
                }
                case 10: {
                    if (r4 >= r3) { $pc6 = 16; continue $sw6; }
                    try {
                        r5 = r2[r4];
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 17; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (((abcd.Interfacevu) r5.getAnnotation(abcd.Interfacevu.class)) != null) { $pc6 = 13; continue $sw6; }
                    r4 = r4 + 1;
                    { $pc6 = 10; continue $sw6; }
                }
                case 13: {
                    try {
                        r5.setAccessible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 17; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return (T) j6(r5.get(r7), r8);
                }
                case 16: {
                    return null;
                }
                case 17: {
                    try {
                        r6 = r7.getClass().getDeclaredField("this$0");
                        r6.setAccessible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 19; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return (T) j6(r6.get(r7), r8);
                }
                case 19: {
                    try {
                        r9 = r7.getClass().getDeclaredField("arg$1");
                        r9.setAccessible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 21; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return (T) j6(r9.get(r7), r8);
                }
                case 21: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.reflect.Field j6(long r5, long r7) {
        java.lang.reflect.Field r0 = null;
        java.lang.Class r6 = null;
        java.lang.reflect.Field[] r8 = null;
        int r9 = 0;
        int r1 = 0;
        java.lang.reflect.Field r2 = null;
        abcd.Interfaceru r3 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = gn.get(java.lang.Long.valueOf(r7));
                    if (r0 == null) { $pc7 = 5; continue $sw7; }
                    return r0;
                }
                case 5: {
                    r6 = Zo.get(java.lang.Long.valueOf(r5));
                    if (r6 == null) { $pc7 = 16; continue $sw7; }
                    r8 = r6.getDeclaredFields();
                    r9 = r8.length;
                    r1 = 0;
                    $pc7 = 8; continue $sw7;
                }
                case 8: {
                    if (r1 >= r9) { $pc7 = 22; continue $sw7; }
                    r2 = r8[r1];
                    r3 = (abcd.Interfaceru) r2.getAnnotation(abcd.Interfaceru.class);
                    if (r3 == null) { $pc7 = 15; continue $sw7; }
                    if (r3.field() != r7) { $pc7 = 15; continue $sw7; }
                    gn.put(java.lang.Long.valueOf(r7), r2);
                    return r2;
                }
                case 15: {
                    r1 = r1 + 1;
                    { $pc7 = 8; continue $sw7; }
                }
                case 22: {
                    return null;
                }
                case 16: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(long r2, long r4, boolean r6) {
        java.util.Iterator<java.lang.Class> r3 = null;
        java.util.Map<java.lang.Long, java.util.Set<java.lang.Long>> r7 = null;
        java.util.Iterator<java.lang.Class> r5 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    abcd.yw.j6("Code", "Set onEnter " + r6 + ": container " + r2 + " method " + r4);
                    if (r6 == false) { $pc8 = 13; continue $sw8; }
                    j6.add(java.lang.Long.valueOf(r4));
                    if (Hw.containsKey(java.lang.Long.valueOf(r2)) == true) { $pc8 = 7; continue $sw8; }
                    Hw.put(java.lang.Long.valueOf(r2), new java.util.HashSet());
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    Hw.get(java.lang.Long.valueOf(r2)).add(java.lang.Long.valueOf(r4));
                    if (v5.containsKey(java.lang.Long.valueOf(r2)) == false) { $pc8 = 26; continue $sw8; }
                    r3 = v5.get(java.lang.Long.valueOf(r2)).iterator();
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    if (r3.hasNext() == false) { $pc8 = 31; continue $sw8; }
                    j6(r3.next(), true);
                    { $pc8 = 11; continue $sw8; }
                }
                case 31: {
                    return;
                }
                case 26: {
                    return;
                }
                case 13: {
                    j6.remove(java.lang.Long.valueOf(r4));
                    if (Hw.containsKey(java.lang.Long.valueOf(r2)) == false) { $pc8 = 19; continue $sw8; }
                    Hw.get(java.lang.Long.valueOf(r2)).remove(java.lang.Long.valueOf(r4));
                    if (Hw.get(java.lang.Long.valueOf(r2)).size() != 0) { $pc8 = 19; continue $sw8; }
                    r7 = Hw;
                    r7.remove(r7);
                    $pc8 = 19; continue $sw8;
                }
                case 19: {
                    if (Hw.containsKey(java.lang.Long.valueOf(r4)) == false) { $pc8 = 21; continue $sw8; }
                    return;
                }
                case 21: {
                    if (v5.containsKey(java.lang.Long.valueOf(r2)) == false) { $pc8 = 30; continue $sw8; }
                    r5 = v5.get(java.lang.Long.valueOf(r2)).iterator();
                    $pc8 = 24; continue $sw8;
                }
                case 24: {
                    if (r5.hasNext() == false) { $pc8 = 32; continue $sw8; }
                    j6(r5.next(), false);
                    { $pc8 = 24; continue $sw8; }
                }
                case 32: {
                    return;
                }
                case 30: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.Class<?> r3, long r4, long r6) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (v5.containsKey(java.lang.Long.valueOf(r4)) == true) { $pc9 = 5; continue $sw9; }
                    v5.put(java.lang.Long.valueOf(r4), new java.util.ArrayList());
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    v5.get(java.lang.Long.valueOf(r4)).add(r3);
                    Zo.put(java.lang.Long.valueOf(r6), r3);
                    if (Hw.containsKey(java.lang.Long.valueOf(r4)) == false) { $pc9 = 8; continue $sw9; }
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    abcd.yw.j6("Code", "Load active class " + r3 + ": container " + r4 + " class " + r6);
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    if (Hw.containsKey(java.lang.Long.valueOf(r4)) == false) { $pc9 = 14; continue $sw9; }
                    j6(r3, true);
                    $pc9 = 14; continue $sw9;
                }
                case 14: {
                    if (FH.containsKey(java.lang.Long.valueOf(r4)) == false) { $pc9 = 17; continue $sw9; }
                    DW(r3, true);
                    return;
                }
                case 17: {
                    return;
                }
                case 8: {
                    if (FH.containsKey(java.lang.Long.valueOf(r4)) == false) { $pc9 = 11; continue $sw9; }
                    { $pc9 = 9; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(java.lang.Class<?> r4, boolean r5) {
        java.lang.reflect.Field[] r6 = null;
        int r0 = 0;
        int r1 = 0;
        java.lang.reflect.Field r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    try {
                        abcd.yw.j6("Code", "Toggle onEnter " + r5 + " " + r4);
                        r6 = r4.getDeclaredFields();
                        r0 = r6.length;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 9; continue $sw10;
                    }
                    r1 = 0;
                    $pc10 = 3; continue $sw10;
                }
                case 3: {
                    if (r1 >= r0) { $pc10 = 16; continue $sw10; }
                    try {
                        r2 = r6[r1];
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 9; continue $sw10;
                    }
                    if (r2.getAnnotation(abcd.Interfacetu.class) != null) { $pc10 = 6; continue $sw10; }
                    r1 = r1 + 1;
                    { $pc10 = 3; continue $sw10; }
                }
                case 6: {
                    try {
                        r2.setAccessible(true);
                        r2.set(null, java.lang.Boolean.valueOf(r5));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 9; continue $sw10;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                case 9: {
                    th = $ex10;
                    abcd.yw.j6("Runtime Error", th);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
