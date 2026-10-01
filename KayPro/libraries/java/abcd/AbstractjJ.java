package abcd;

public abstract class AbstractjJ {
    public static final abcd.WI DW = null;
    public static final abcd.WI FH = null;
    private static int[] Hw;
    private static final java.util.List<java.lang.ref.WeakReference<abcd.DJ>> j6 = null;
    private java.lang.String EQ;
    private boolean J0;
    private boolean J8;
    private boolean QX;
    private java.lang.String VH;
    private boolean Ws;
    private int XL;
    protected final abcd.HJ Zo;
    private abcd.NH aM;
    private java.util.List<abcd.WI> gn;
    private abcd.AbstractkI j3;
    private boolean tp;
    private abcd.EnumeJ u7;
    protected final abcd.UE v5;
    private java.util.List<abcd.WI> we;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.AbstractjJ.a DW = null;
        private static final abcd.AbstractjJ.a[] FH = null;
        public static final abcd.AbstractjJ.a j6 = null;

        static {
            j6 = new abcd.AbstractjJ.a("FETCH", 0);
            DW = new abcd.AbstractjJ.a("PUSH", 1);
            FH = new abcd.AbstractjJ.a[]{j6, DW};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.AbstractjJ.a valueOf(java.lang.String r1) {
            return (abcd.AbstractjJ.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.AbstractjJ.a.values(), r1);
        }

        public static abcd.AbstractjJ.a[] values() {
            abcd.AbstractjJ.a[] r0 = FH;
            int r1 = r0.length;
            abcd.AbstractjJ.a[] r2 = new abcd.AbstractjJ.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    static {
        j6 = new java.util.concurrent.CopyOnWriteArrayList();
        j6(abcd.zJ.Mr);
        j6(abcd.C1119oJ.Mr);
        j6(abcd.C0990lJ.Mr);
        j6(abcd.C1204qJ.Mr);
        j6(abcd.GJ.a8);
        j6(abcd.xJ.a8);
        j6(abcd.xJ.U2);
        j6(abcd.tJ.a8);
        aM();
        DW = new abcd.WI("refs/tags/*:refs/tags/*");
        FH = new abcd.WI("refs/heads/*:refs/heads/*");
    }

    protected AbstractjJ(abcd.UE r3, abcd.HJ r4) {
        this.VH = "git-upload-pack";
        this.gn = java.util.Collections.emptyList();
        this.u7 = abcd.EnumeJ.DW;
        this.tp = true;
        this.EQ = "git-receive-pack";
        this.we = java.util.Collections.emptyList();
        this.J0 = false;
        abcd.iJ r0 = (abcd.iJ) r3.Zo().j6(abcd.iJ.j6);
        this.v5 = r3;
        this.Zo = r4;
        this.Ws = r0.j6();
        this.j3 = abcd.AbstractkI.j6();
    }

    public static java.util.List<abcd.AbstractjJ> DW(abcd.UE r3, abcd.XI r4, abcd.AbstractjJ.a r5) {
        java.util.List<abcd.HJ> r6 = null;
        java.util.ArrayList r0 = null;
        java.util.Iterator<abcd.HJ> r7 = null;
        abcd.AbstractjJ r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r6 = j6(r4, r5);
                    r0 = new java.util.ArrayList(r6.size());
                    r7 = r6.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r7.hasNext() == false) { $pc0 = 5; continue $sw0; }
                    r1 = j6(r3, r7.next(), r4.DW());
                    r1.j6(r4);
                    r0.add(r1);
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.util.List<abcd.AbstractjJ> DW(abcd.UE r2, java.lang.String r3, abcd.AbstractjJ.a r4) {
        abcd.XI r0 = null;
        java.util.ArrayList r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new abcd.XI(r2.Zo(), r3);
                    if (DW(r0) == false) { $pc1 = 7; continue $sw1; }
                    r5 = new java.util.ArrayList(1);
                    r5.add(j6(r2, new abcd.HJ(r3), null));
                    return r5;
                }
                case 7: {
                    return DW(r2, r0, r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean DW(abcd.XI r1) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r1.gn().isEmpty() == true) { $pc2 = 5; continue $sw2; }
                    return false;
                }
                case 5: {
                    if (r1.Hw().isEmpty() == false) { $pc2 = 10; continue $sw2; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void aM() {
        java.lang.ClassLoader r0 = null;
        java.util.Enumeration<java.net.URL> r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = java.lang.Thread.currentThread().getContextClassLoader();
                    if (r0 != null) { $pc3 = 5; continue $sw3; }
                    r0 = abcd.AbstractjJ.class.getClassLoader();
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r1 = j6(r0);
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r1.hasMoreElements() == false) { $pc3 = 8; continue $sw3; }
                    j6(r0, r1.nextElement());
                    { $pc3 = 7; continue $sw3; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.AbstractjJ j6(abcd.UE r3, abcd.HJ r4, java.lang.String r5) {
        java.util.Iterator<java.lang.ref.WeakReference<abcd.DJ>> r0 = null;
        java.lang.ref.WeakReference<abcd.DJ> r1 = null;
        abcd.DJ r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = j6.iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc4 = 13; continue $sw4; }
                    r1 = r0.next();
                    r2 = r1.get();
                    if (r2 == null) { $pc4 = 7; continue $sw4; }
                    if (r2.j6(r4, r3, r5) == false) { $pc4 = 4; continue $sw4; }
                    return r2.DW(r4, r3, r5);
                }
                case 7: {
                    j6.remove(r1);
                    { $pc4 = 4; continue $sw4; }
                }
                case 13: {
                    throw new abcd.jD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().URINotSupported, new java.lang.Object[]{r4}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.AbstractjJ j6(abcd.UE r2, abcd.XI r3, abcd.AbstractjJ.a r4) {
        java.util.List<abcd.HJ> r5 = null;
        abcd.AbstractjJ r6 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r5 = j6(r3, r4);
                    if (r5.isEmpty() == true) { $pc5 = 7; continue $sw5; }
                    r6 = j6(r2, r5.get(0), r3.DW());
                    r6.j6(r3);
                    return r6;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().remoteConfigHasNoURIAssociated, new java.lang.Object[]{r3.DW()}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.AbstractjJ j6(abcd.UE r1, java.lang.String r2) {
        return j6(r1, r2, abcd.AbstractjJ.a.j6);
    }

    public static abcd.AbstractjJ j6(abcd.UE r2, java.lang.String r3, abcd.AbstractjJ.a r4) {
        abcd.XI r0 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new abcd.XI(r2.Zo(), r3);
                    if (DW(r0) == false) { $pc6 = 7; continue $sw6; }
                    return j6(r2, new abcd.HJ(r3), null);
                }
                case 7: {
                    return j6(r2, r0, r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(java.lang.String r2, java.util.Collection<abcd.WI> r3) {
        java.util.Iterator<abcd.WI> r4 = null;
        abcd.WI r0 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r4 = r3.iterator();
                    $pc7 = 4; continue $sw7;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc7 = 5; continue $sw7; }
                    r0 = r4.next();
                    if (r0.v5(r2) == false) { $pc7 = 4; continue $sw7; }
                    if (r0.Hw() == false) { $pc7 = 14; continue $sw7; }
                    return r0.DW(r2).j6();
                }
                case 14: {
                    return r0.j6();
                }
                case 5: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.util.Collection<abcd.WI> j6(abcd.UE r5, java.util.Collection<abcd.WI> r6) {
        java.util.Map<java.lang.String, abcd.ME> r7 = null;
        java.util.HashSet r0 = null;
        java.util.Iterator<abcd.WI> r8 = null;
        abcd.WI r1 = null;
        java.util.Iterator<abcd.ME> r2 = null;
        abcd.ME r3 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r7 = r5.v5();
                    r0 = new java.util.HashSet();
                    r8 = r6.iterator();
                    $pc8 = 4; continue $sw8;
                }
                case 4: {
                    if (r8.hasNext() == false) { $pc8 = 5; continue $sw8; }
                    r1 = r8.next();
                    if (r1.Hw() == true) { $pc8 = 8; continue $sw8; }
                    r0.add(r1);
                    { $pc8 = 4; continue $sw8; }
                }
                case 8: {
                    r2 = r7.values().iterator();
                    $pc8 = 10; continue $sw8;
                }
                case 10: {
                    if (r2.hasNext() == false) { $pc8 = 4; continue $sw8; }
                    r3 = r2.next();
                    if (r1.DW(r3) == false) { $pc8 = 10; continue $sw8; }
                    r0.add(r1.j6(r3));
                    { $pc8 = 10; continue $sw8; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.util.Collection<abcd.YI> j6(abcd.UE r11, java.util.Collection<abcd.WI> r12, java.util.Collection<abcd.WI> r13) {
        java.util.LinkedList r0 = null;
        java.util.Iterator<abcd.WI> r14 = null;
        abcd.WI r1 = null;
        java.lang.String r2 = null;
        abcd.ME r3 = null;
        java.lang.String r6 = null;
        java.lang.String r4 = null;
        java.lang.String r5 = null;
        java.lang.String r7 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r13 != null) { $pc9 = 4; continue $sw9; }
                    r13 = java.util.Collections.emptyList();
                    $pc9 = 4; continue $sw9;
                }
                case 4: {
                    r0 = new java.util.LinkedList();
                    r14 = j6(r11, r12).iterator();
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    if (r14.hasNext() == false) { $pc9 = 7; continue $sw9; }
                    r1 = r14.next();
                    r2 = r1.DW();
                    r3 = r11.j6(r2);
                    if (r3 == null) { $pc9 = 11; continue $sw9; }
                    r2 = r3.getName();
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    r6 = r2;
                    r4 = r1.j6();
                    if (r4 != null) { $pc9 = 14; continue $sw9; }
                    r4 = r6;
                    $pc9 = 14; continue $sw9;
                }
                case 14: {
                    if (r3 == null) { $pc9 = 18; continue $sw9; }
                    if (r4.startsWith("refs/") == true) { $pc9 = 18; continue $sw9; }
                    r5 = r3.getName();
                    r4 = java.lang.String.valueOf(r5.substring(0, r5.indexOf(47, 5) + 1)) + r4;
                    $pc9 = 18; continue $sw9;
                }
                case 18: {
                    r7 = r4;
                    r0.add(new abcd.YI(r11, r6, r7, r1.FH(), j6(r7, r13), null));
                    { $pc9 = 6; continue $sw9; }
                }
                case 7: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.util.Enumeration<java.net.URL> j6(java.lang.ClassLoader r2) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    return r2.getResources("META-INF/services/" + abcd.AbstractjJ.class.getName());
                }
                case 5: {
                    return new java.util.Vector().elements();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.util.List<abcd.HJ> j6(abcd.XI r2, abcd.AbstractjJ.a r3) {
        int r0 = 0;
        java.util.List<abcd.HJ> r4 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = j6()[r3.ordinal()];
                    if (r0 == 1) { $pc11 = 13; continue $sw11; }
                    if (r0 != 2) { $pc11 = 11; continue $sw11; }
                    r4 = r2.Hw();
                    if (r4.isEmpty() == true) { $pc11 = 9; continue $sw11; }
                    return r4;
                }
                case 9: {
                    return r2.gn();
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException(r3.toString());
                }
                case 13: {
                    return r2.gn();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(abcd.DJ r2) {
        j6.add(0, new java.lang.ref.WeakReference(r2));
    }

    private static void j6(java.lang.ClassLoader r4, java.lang.String r5) {
        int r0 = 0;
        java.lang.reflect.Field[] r6 = null;
        int r7 = 0;
        java.lang.reflect.Field r1 = null;
        abcd.DJ r2 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = 0;
                    r6 = java.lang.Class.forName(r5, false, r4).getDeclaredFields();
                    r7 = r6.length;
                    $pc12 = 5; continue $sw12;
                }
                case 5: {
                    if (r0 >= r7) { $pc12 = 6; continue $sw12; }
                    r1 = r6[r0];
                    if ((r1.getModifiers() & 8) != 8) { $pc12 = 15; continue $sw12; }
                    if (abcd.DJ.class.isAssignableFrom(r1.getType()) == false) { $pc12 = 15; continue $sw12; }
                    try {
                        r2 = (abcd.DJ) r1.get(null);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 17; continue $sw12;
                    }
                    if (r2 == null) { $pc12 = 15; continue $sw12; }
                    j6(r2);
                    $pc12 = 15; continue $sw12;
                }
                case 15: {
                    r0 = r0 + 1;
                    { $pc12 = 5; continue $sw12; }
                }
                case 6: {
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(java.lang.ClassLoader r3, java.net.URL r4) {
        java.io.BufferedReader r0 = null;
        java.lang.String r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    try {
                        r0 = new java.io.BufferedReader(new java.io.InputStreamReader(r4.openStream(), "UTF-8"));
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.io.IOException) { $pc13 = 19; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc13 = 24; continue $sw13;
                }
                case 24: {
                    try {
                        r5 = r0.readLine();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.io.IOException) { $pc13 = 17; continue $sw13; }
                        $pc13 = 13; continue $sw13;
                    }
                    if (r5 == null) { $pc13 = 5; continue $sw13; }
                    if (r5.length() <= 0) { $pc13 = 24; continue $sw13; }
                    if (r5.startsWith("#") == true) { $pc13 = 24; continue $sw13; }
                    try {
                        j6(r3, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.io.IOException) { $pc13 = 17; continue $sw13; }
                        $pc13 = 13; continue $sw13;
                    }
                    $pc13 = 15; continue $sw13;
                }
                case 13: {
                    th = $ex13;
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.io.IOException) { $pc13 = 18; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc13 = 15; continue $sw13;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 5: {
                    try {
                        r0.close();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.io.IOException) { $pc13 = 19; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 17: {
                    return;
                }
                case 18: {
                    return;
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] j6() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = Hw;
                    if (r0 == null) { $pc14 = 5; continue $sw14; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.AbstractjJ.a.values().length];
                    try {
                        r1[abcd.AbstractjJ.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc14 = 10; continue $sw14; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    try {
                        r1[abcd.AbstractjJ.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc14 = 11; continue $sw14; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc14 = 8; continue $sw14;
                }
                case 8: {
                    Hw = r1;
                    return r1;
                }
                case 10: {
                    throw new java.lang.IllegalStateException();
                }
                case 11: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.util.List<abcd.DJ> u7() {
        java.util.ArrayList r1 = null;
        java.util.Iterator<java.lang.ref.WeakReference<abcd.DJ>> r0 = null;
        java.lang.ref.WeakReference<abcd.DJ> r2 = null;
        abcd.DJ r3 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r1 = new java.util.ArrayList(j6.size());
                    r0 = j6.iterator();
                    $pc15 = 4; continue $sw15;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc15 = 6; continue $sw15; }
                    r2 = r0.next();
                    r3 = r2.get();
                    if (r3 != null) { $pc15 = 9; continue $sw15; }
                    j6.remove(r2);
                    { $pc15 = 4; continue $sw15; }
                }
                case 9: {
                    r1.add(r3);
                    { $pc15 = 4; continue $sw15; }
                }
                case 6: {
                    return java.util.Collections.unmodifiableList(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.NI DW(abcd.LE r5, java.util.Collection<abcd.YI> r6) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if (r6 != null) { $pc16 = 4; continue $sw16; }
                    $pc16 = 15; continue $sw16;
                }
                case 15: {
                    try {
                        r6 = j6(this.we);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.io.IOException) { $pc16 = 12; continue $sw16; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r6.isEmpty() == true) { $pc16 = 11; continue $sw16; }
                    $pc16 = 9; continue $sw16;
                }
                case 9: {
                    return new abcd.MI(this, r6).j6(r5);
                }
                case 11: {
                    throw new abcd.yD(org.eclipse.jgit.JGitText.j6().nothingToPush);
                }
                case 12: {
                    e = $ex16;
                    throw new abcd.yD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().problemWithResolvingPushRefSpecsLocally, new java.lang.Object[]{e.getMessage()}), e);
                }
                case 4: {
                    if (r6.isEmpty() == false) { $pc16 = 9; continue $sw16; }
                    { $pc16 = 15; continue $sw16; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract void DW();

    public void DW(java.lang.String r2) {
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (r2 != null) { $pc17 = 4; continue $sw17; }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    this.VH = "git-upload-pack";
                    return;
                }
                case 4: {
                    if (r2.length() <= 0) { $pc17 = 6; continue $sw17; }
                    this.VH = r2;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(boolean r1) {
        this.J8 = r1;
    }

    public boolean EQ() {
        return this.Ws;
    }

    public abcd.AbstractkI FH() {
        return this.j3;
    }

    public void FH(boolean r1) {
        this.tp = r1;
    }

    public java.lang.String Hw() {
        return this.EQ;
    }

    public void Hw(boolean r1) {
        this.J0 = r1;
    }

    public boolean J0() {
        return this.tp;
    }

    public boolean J8() {
        return this.J0;
    }

    public abstract abcd.InterfacenI QX();

    public abcd.EnumeJ VH() {
        return this.u7;
    }

    public boolean Ws() {
        return this.QX;
    }

    public abstract abcd.LI XL();

    public abcd.NH Zo() {
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (this.aM != null) { $pc18 = 6; continue $sw18; }
                    this.aM = new abcd.NH(this.v5);
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    return this.aM;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int gn() {
        return this.XL;
    }

    public abcd.qI j6(abcd.LE r7, java.util.Collection<abcd.WI> r8) {
        java.util.ArrayList r0 = null;
        java.util.Iterator<abcd.WI> r1 = null;
        java.lang.String r2 = null;
        java.util.Iterator<abcd.WI> r3 = null;
        abcd.WI r9 = null;
        java.lang.String r4 = null;
        java.lang.String r5 = null;
        abcd.qI r6 = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    if (r8 == null) { $pc19 = 21; continue $sw19; }
                    if (r8.isEmpty() == true) { $pc19 = 21; continue $sw19; }
                    if (this.gn.isEmpty() == true) { $pc19 = 23; continue $sw19; }
                    r0 = new java.util.ArrayList(r8);
                    r1 = r8.iterator();
                    $pc19 = 10; continue $sw19;
                }
                case 10: {
                    if (r1.hasNext() == false) { $pc19 = 11; continue $sw19; }
                    r2 = r1.next().DW();
                    r3 = this.gn.iterator();
                    $pc19 = 14; continue $sw19;
                }
                case 14: {
                    if (r3.hasNext() == false) { $pc19 = 10; continue $sw19; }
                    r9 = r3.next();
                    r4 = r9.DW();
                    r5 = r9.j6();
                    if (r4.equals(r2) == false) { $pc19 = 14; continue $sw19; }
                    if (r5 == null) { $pc19 = 14; continue $sw19; }
                    r0.add(r9);
                    { $pc19 = 10; continue $sw19; }
                }
                case 11: {
                    r8 = r0;
                    $pc19 = 23; continue $sw19;
                }
                case 23: {
                    r6 = new abcd.qI();
                    new abcd.C1161pI(this, r8).j6(r7, r6);
                    return r6;
                }
                case 21: {
                    if (this.gn.isEmpty() == true) { $pc19 = 26; continue $sw19; }
                    r8 = this.gn;
                    { $pc19 = 23; continue $sw19; }
                }
                case 26: {
                    throw new abcd.yD(org.eclipse.jgit.JGitText.j6().nothingToFetch);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Collection<abcd.YI> j6(java.util.Collection<abcd.WI> r3) {
        return j6(this.v5, r3, this.gn);
    }

    public void j6(int r1) {
        this.XL = r1;
    }

    public void j6(abcd.XI r2) {
        DW(r2.u7());
        j6(r2.v5());
        j6(r2.Zo());
        this.gn = r2.j6();
        this.we = r2.FH();
        this.XL = r2.VH();
    }

    public void j6(abcd.EnumeJ r1) {
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (r1 != null) { $pc20 = 5; continue $sw20; }
                    r1 = abcd.EnumeJ.j6;
                    $pc20 = 5; continue $sw20;
                }
                case 5: {
                    this.u7 = r1;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.AbstractkI r1) {
        this.j3 = r1;
    }

    public void j6(java.lang.String r2) {
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    if (r2 != null) { $pc21 = 4; continue $sw21; }
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    this.EQ = "git-receive-pack";
                    return;
                }
                case 4: {
                    if (r2.length() <= 0) { $pc21 = 6; continue $sw21; }
                    this.EQ = r2;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(boolean r1) {
        this.Ws = r1;
    }

    public abcd.HJ tp() {
        return this.Zo;
    }

    public java.lang.String v5() {
        return this.VH;
    }

    public void v5(boolean r1) {
        this.QX = r1;
    }

    public boolean we() {
        return this.J8;
    }
}
