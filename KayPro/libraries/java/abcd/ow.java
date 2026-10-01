package abcd;

public class ow {
    private static long DW;
    private static android.os.Handler EQ;
    private static java.lang.String FH;
    private static java.lang.String Hw;
    private static java.lang.Object VH;
    private static java.lang.Object Zo;
    private static java.lang.Object gn;
    private static final java.util.List<abcd.lw> j6 = null;
    private static boolean tp;
    private static boolean u7;
    private static java.lang.Object v5;

    static {
        j6 = new java.util.ArrayList();
        v5 = new java.lang.Object();
        Zo = new java.lang.Object();
        VH = new java.lang.Object();
        gn = new java.lang.Object();
    }

    static java.io.File DW() {
        return tp();
    }

    private static void DW(java.io.File r4) {
        java.io.File[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4.isDirectory() == false) { $pc0 = 8; continue $sw0; }
                    r0 = r4.listFiles();
                    r1 = r0.length;
                    r2 = 0;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    if (r2 >= r1) { $pc0 = 7; continue $sw0; }
                    DW(r0[r2]);
                    r2 = r2 + 1;
                    { $pc0 = 5; continue $sw0; }
                }
                case 7: {
                    r4.delete();
                    return;
                }
                case 8: {
                    r4.delete();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void DW(java.lang.ClassLoader r1, java.util.List<java.lang.String> r2) {
        java.util.ArrayList r0 = null;
        java.util.Iterator r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.util.ArrayList();
                    j6(r1, r0, r2);
                    r3 = r0.iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc1 = 6; continue $sw1; }
                    j6((java.lang.Class) r3.next());
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void DW(java.lang.ClassLoader r4, boolean r5) {
        java.util.ArrayList r0 = null;
        java.util.ArrayList r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        r0 = new java.util.ArrayList();
                        r1 = new java.util.ArrayList();
                        abcd.Mv.XL().j6(new abcd.nw(r4, r1), r0);
                        j6(r0, r1, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 4; continue $sw2;
                    }
                    return;
                }
                case 4: {
                    th = $ex2;
                    abcd.yw.j6("Probe loading", th);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.io.File FH() {
        return u7();
    }

    private static java.lang.ClassLoader FH(java.io.File r9) {
        java.io.File r0 = null;
        java.util.zip.ZipFile r1 = null;
        java.io.InputStream r2 = null;
        java.io.FileOutputStream r3 = null;
        byte[] r4 = null;
        int r5 = 0;
        java.io.File r6 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        r0 = new java.io.File(r9.getParentFile(), r9.getName() + ".dex");
                        r1 = new java.util.zip.ZipFile(r9);
                        r2 = r1.getInputStream(r1.getEntry("classes.dex"));
                        r3 = new java.io.FileOutputStream(r0);
                        r4 = new byte[16000];
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 8; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    try {
                        r5 = r2.read(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 8; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5 == (-1)) { $pc3 = 6; continue $sw3; }
                    try {
                        r3.write(r4, 0, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 8; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 3; continue $sw3; }
                }
                case 6: {
                    try {
                        r1.close();
                        r3.close();
                        r6 = new java.io.File(r9.getParentFile(), r9.getName() + ".opt");
                        DW(r6);
                        r6.mkdirs();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 8; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return new abcd.kw(r0.getPath(), r6.getPath(), null, abcd.wu.j6().getClassLoader(), true);
                }
                case 8: {
                    e = $ex3;
                    abcd.yw.j6("Error loading probes", e);
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean Hw() {
        return u7;
    }

    public static void VH() {
        synchronized (VH) {
            java.lang.Object r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = VH;
                        try {
                            VH.notifyAll();
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 7; continue $sw4;
                        }
                        return;
                    }
                    case 7: {
                        th = $ex4;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    static java.lang.Object Zo() {
        return VH;
    }

    private static java.io.File gn() {
        java.io.File r2 = null;
        java.lang.String r3 = null;
        java.io.File r1 = null;
        java.lang.String r4 = null;
        java.io.InputStream r5 = null;
        java.io.FileOutputStream r6 = null;
        byte[] r7 = null;
        int r8 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    try {
                        r2 = abcd.rw.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 28; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (abcd.sw.j6() == false) { $pc5 = 6; continue $sw5; }
                    r3 = "dev.builtin.apk";
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    try {
                        r1 = new java.io.File(r2, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 28; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r1.exists() == true) { $pc5 = 10; continue $sw5; }
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    try {
                        r1.delete();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 28; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (abcd.sw.j6() == false) { $pc5 = 15; continue $sw5; }
                    r4 = "dev.probes";
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    try {
                        r5 = abcd.wu.j6().getClassLoader().getResourceAsStream(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 28; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5 != null) { $pc5 = 19; continue $sw5; }
                    return null;
                }
                case 19: {
                    try {
                        r6 = new java.io.FileOutputStream(r1);
                        r7 = new byte[16000];
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 28; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 20; continue $sw5;
                }
                case 20: {
                    try {
                        r8 = r5.read(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 28; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r8 == (-1)) { $pc5 = 23; continue $sw5; }
                    try {
                        r6.write(r7, 0, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 28; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc5 = 20; continue $sw5; }
                }
                case 23: {
                    try {
                        r6.close();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 28; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r1.exists() == false) { $pc5 = 27; continue $sw5; }
                    try {
                        r1.setLastModified(DW);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 28; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r1;
                }
                case 15: {
                    r4 = "public.probes";
                    { $pc5 = 16; continue $sw5; }
                }
                case 10: {
                    if (r1.lastModified() != DW) { $pc5 = 12; continue $sw5; }
                    return r1;
                }
                case 6: {
                    r3 = "public.builtin.apk";
                    $pc5 = 27; continue $sw5;
                }
                case 27: {
                    return null;
                }
                case 28: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.ClassLoader j6(java.io.File r0) {
        return FH(r0);
    }

    static java.lang.Object j6() {
        return gn;
    }

    public static void j6(abcd.lw r2, long r3, java.lang.Throwable r5) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    abcd.iw.j6(r2, r3, r5);
                    if (abcd.sw.j6() == false) { $pc6 = 6; continue $sw6; }
                    abcd.xw.j6(r2.DW().hashCode() + 346546, 17301624, "backbone probes event error: " + r2.DW() + ": " + r5);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(java.lang.Class<?> r8) {
        java.lang.reflect.Constructor<?> r5 = null;
        java.lang.Object r6 = null;
        java.lang.reflect.Method r9 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    abcd.yw.j6("Probes", "Opening " + r8);
                    try {
                        r5 = r8.getDeclaredConstructor(new java.lang.Class[0]);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Exception) { $pc7 = 21; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5 == null) { $pc7 = 7; continue $sw7; }
                    try {
                        r5.setAccessible(true);
                        r6 = r5.newInstance(new java.lang.Object[0]);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Exception) { $pc7 = 21; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc7 = 22; continue $sw7;
                }
                case 22: {
                    try {
                        r9 = r8.getDeclaredMethod("define", new java.lang.Class[0]);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Exception) { $pc7 = 20; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r9.getParameterTypes().length == 0) { $pc7 = 11; continue $sw7; }
                    return;
                }
                case 11: {
                    if ("void".equals(r9.getReturnType().getSimpleName()) == true) { $pc7 = 13; continue $sw7; }
                    return;
                }
                case 13: {
                    if (r9.isSynthetic() == false) { $pc7 = 15; continue $sw7; }
                    return;
                }
                case 15: {
                    if ((r9.getModifiers() & 8) != 0) { $pc7 = 18; continue $sw7; }
                    if (r6 == null) { $pc7 = 28; continue $sw7; }
                    try {
                        abcd.yw.j6("Probes", "Opening " + r9);
                        r9.setAccessible(true);
                        r9.invoke(r6, new java.lang.Object[0]);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Exception) { $pc7 = 20; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 28: {
                    return;
                }
                case 18: {
                    try {
                        abcd.yw.j6("Probes", "Opening " + r9);
                        r9.setAccessible(true);
                        r9.invoke(null, new java.lang.Object[0]);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.lang.Exception) { $pc7 = 20; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 30: {
                    return;
                }
                case 7: {
                    r6 = null;
                    { $pc7 = 22; continue $sw7; }
                }
                case 20: {
                    return;
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(java.lang.ClassLoader r0, java.util.List r1) {
        DW(r0, r1);
    }

    private static void j6(java.lang.ClassLoader r11, java.util.List<java.lang.Class<?>> r12, java.util.List<java.lang.String> r13) {
        java.lang.Class<?> r1 = null;
        java.lang.String[] r2 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.String r9 = null;
        int r7 = 0;
        java.lang.String r8 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r11 != null) { $pc8 = 23; continue $sw8; }
                    return;
                }
                case 23: {
                    try {
                        r1 = r11.loadClass("probes");
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.ClassNotFoundException) { $pc8 = 21; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r2 = (java.lang.String[]) r1.getDeclaredField("classes").get(null);
                    r4 = r2.length;
                    r5 = 0;
                    r6 = 0;
                    $pc8 = 8; continue $sw8;
                }
                case 8: {
                    if (r6 >= r4) { $pc8 = 13; continue $sw8; }
                    r9 = r2[r6];
                    if ("DefaultProbes".equals(r9) == true) { $pc8 = 12; continue $sw8; }
                    r12.add(r11.loadClass(r9.replace('/', '.')));
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    r6 = r6 + 1;
                    { $pc8 = 8; continue $sw8; }
                }
                case 13: {
                    r7 = r2.length;
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    if (r5 >= r7) { $pc8 = 19; continue $sw8; }
                    r8 = r2[r5];
                    if ("DefaultProbes".equals(r8) == false) { $pc8 = 18; continue $sw8; }
                    r12.add(r11.loadClass(r8.replace('/', '.')));
                    $pc8 = 18; continue $sw8;
                }
                case 18: {
                    r5 = r5 + 1;
                    { $pc8 = 14; continue $sw8; }
                }
                case 19: {
                    r13.addAll(java.util.Arrays.asList((java.lang.String[]) r1.getDeclaredField("strings").get(null)));
                    return;
                }
                case 21: {
                    r12.add(r11.loadClass("DefaultProbes"));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(java.lang.ClassLoader r0, boolean r1) {
        DW(r0, r1);
    }

    private static void j6(java.util.List<abcd.lw> r11, java.util.List<java.lang.String> r12, boolean r13) {
        synchronized (v5) {
            java.lang.Object r0 = null;
            java.util.Iterator<abcd.lw> r14 = null;
            long r1 = 0L;
            long r3 = 0L;
            java.util.Iterator<abcd.lw> r15 = null;
            abcd.lw r5 = null;
            java.util.Iterator<abcd.lw.a> r6 = null;
            long r7 = 0L;
            java.util.Iterator<abcd.lw> r16 = null;
            abcd.lw r17 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = -1;
            $sw9: while (true) {
                switch ($pc9) {
                    case -1: {
                        r0 = v5;
                        try {
                            abcd.yw.j6("Probes", "Opening probes " + r11.size());
                            abcd.Mv.XL().j6(r12);
                            r14 = j6.iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        $pc9 = 6; continue $sw9;
                    }
                    case 6: {
                        if (r14.hasNext() == false) { $pc9 = 8; continue $sw9; }
                        try {
                            abcd.kv.DW(r14.next().j6());
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        { $pc9 = 6; continue $sw9; }
                    }
                    case 8: {
                        try {
                            j6.clear();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        if (r13 == true) { $pc9 = 11; continue $sw9; }
                        $pc9 = 13; continue $sw9;
                    }
                    case 13: {
                        try {
                            r1 = com.appfour.backbone.api.Api.getLastUpdateTime();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        $pc9 = 14; continue $sw9;
                    }
                    case 14: {
                        try {
                            r3 = abcd.kv.DW();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        if (r13 == true) { $pc9 = 17; continue $sw9; }
                        try {
                            abcd.kv.j6();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        $pc9 = 17; continue $sw9;
                    }
                    case 17: {
                        try {
                            r15 = r11.iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        $pc9 = 19; continue $sw9;
                    }
                    case 19: {
                        if (r15.hasNext() == false) { $pc9 = 29; continue $sw9; }
                        try {
                            r5 = r15.next();
                            j6.add(r5);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        if (abcd.rw.DW(r5) == true) { $pc9 = 19; continue $sw9; }
                        if (r13 == true) { $pc9 = 27; continue $sw9; }
                        try {
                            r6 = r5.j6().iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        r7 = r1;
                        $pc9 = 25; continue $sw9;
                    }
                    case 25: {
                        if (r6.hasNext() == false) { $pc9 = 28; continue $sw9; }
                        try {
                            r7 = java.lang.Math.max(abcd.kv.j6(r6.next(), r3, r1), r7);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        $pc9 = 28; continue $sw9;
                    }
                    case 28: {
                        try {
                            abcd.rw.j6(r5);
                            abcd.iw.j6(r5, r3, r7);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        { $pc9 = 19; continue $sw9; }
                    }
                    case 27: {
                        r7 = r1;
                        { $pc9 = 28; continue $sw9; }
                    }
                    case 29: {
                        try {
                            r16 = r11.iterator();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        $pc9 = 31; continue $sw9;
                    }
                    case 31: {
                        if (r16.hasNext() == false) { $pc9 = 35; continue $sw9; }
                        try {
                            r17 = r16.next();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        if (r17.FH() == false) { $pc9 = 31; continue $sw9; }
                        try {
                            abcd.kv.j6(r17.j6());
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        { $pc9 = 31; continue $sw9; }
                    }
                    case 35: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 37; continue $sw9;
                        }
                        return;
                    }
                    case 11: {
                        if (com.appfour.backbone.api.Api.hasBeenUpdated() == true) { $pc9 = 13; continue $sw9; }
                        r1 = 0;
                        return;
                    }
                    case 37: {
                        th = $ex9;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public static void j6(boolean r6, long r7, java.lang.String r9, java.lang.String r10) {
        synchronized (gn) {
            java.lang.Object r0 = null;
            long r11 = 0L;
            java.io.File r12 = null;
            java.io.File r13 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex10 = null;
            int $pc10 = -1;
            $sw10: while (true) {
                switch ($pc10) {
                    case -1: {
                        EQ = new android.os.Handler();
                        DW = r7;
                        Hw = r9;
                        FH = r10;
                        r0 = gn;
                        try {
                            new java.lang.Thread(new abcd.Runnablemw(r9, r10, r7)).start();
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 28; continue $sw10;
                        }
                        if (r6 == false) { $pc10 = 18; continue $sw10; }
                        try {
                            r11 = java.lang.System.currentTimeMillis();
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 28; continue $sw10;
                        }
                        try {
                            u7 = true;
                            gn.wait(1000);
                            com.appfour.backbone.api.runtime.RuntimeDebug.initialProbeLoadAttempted = true;
                            com.appfour.backbone.api.runtime.RuntimeDebug.initialProbeLoadTime = java.lang.System.currentTimeMillis() - r11;
                            com.appfour.backbone.api.runtime.RuntimeDebug.initialProbeLoadSuccess = tp;
                            abcd.yw.j6("Probes", "Waited for load " + com.appfour.backbone.api.runtime.RuntimeDebug.initialProbeLoadTime + "ms");
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            if ($t instanceof java.lang.InterruptedException) { $pc10 = 13; continue $sw10; }
                            $pc10 = 11; continue $sw10;
                        }
                        $pc10 = 9; continue $sw10;
                    }
                    case 9: {
                        try {
                            u7 = false;
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 28; continue $sw10;
                        }
                        { $pc10 = 18; continue $sw10; }
                    }
                    case 13: {
                        e = $ex10;
                        try {
                            abcd.yw.j6("Probes", "Unexpected InterruptedException", e);
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 11; continue $sw10;
                        }
                        $pc10 = 18; continue $sw10;
                    }
                    case 11: {
                        th = $ex10;
                        try {
                            u7 = false;
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 28; continue $sw10;
                        }
                    }
                    case 18: {
                        try {
                            r12 = u7();
                            r13 = gn();
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 28; continue $sw10;
                        }
                        if (r12.exists() == true) { $pc10 = 21; continue $sw10; }
                        $pc10 = 23; continue $sw10;
                    }
                    case 23: {
                        if (r13 == null) { $pc10 = 25; continue $sw10; }
                        try {
                            abcd.yw.j6("Probes", "Opening built-in probes " + r13.getName());
                            DW(FH(r13), r6);
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 28; continue $sw10;
                        }
                        $pc10 = 26; continue $sw10;
                    }
                    case 26: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 28; continue $sw10;
                        }
                        return;
                    }
                    case 25: {
                        try {
                            abcd.yw.j6("Probes", "Opening no probes");
                            DW(null, r6);
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 28; continue $sw10;
                        }
                        { $pc10 = 26; continue $sw10; }
                    }
                    case 21: {
                        if (r12.lastModified() <= r7) { $pc10 = 23; continue $sw10; }
                        try {
                            abcd.yw.j6("Probes", "Opening downloaded probes " + r12);
                            DW(FH(r12), r6);
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 28; continue $sw10;
                        }
                        return;
                    }
                    case 28: {
                        th = $ex10;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public static boolean j6(java.lang.String r2) {
        java.util.Iterator<abcd.lw> r0 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = j6.iterator();
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc11 = 9; continue $sw11; }
                    if (r0.next().DW().equals(r2) == false) { $pc11 = 4; continue $sw11; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(boolean r0) {
        tp = r0;
        return r0;
    }

    private static java.io.File tp() {
        java.io.File r1 = null;
        java.lang.String r2 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r1 = abcd.rw.FH();
                    if (abcd.sw.j6() == false) { $pc12 = 5; continue $sw12; }
                    r2 = "dev.download.apk";
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    return new java.io.File(r1, r2);
                }
                case 5: {
                    r2 = "public.download.apk";
                    { $pc12 = 7; continue $sw12; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.io.File u7() {
        java.io.File r1 = null;
        java.lang.String r2 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r1 = abcd.rw.FH();
                    if (abcd.sw.j6() == false) { $pc13 = 5; continue $sw13; }
                    r2 = "dev.current.apk";
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    return new java.io.File(r1, r2);
                }
                case 5: {
                    r2 = "public.current.apk";
                    { $pc13 = 7; continue $sw13; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.Object v5() {
        return Zo;
    }
}
