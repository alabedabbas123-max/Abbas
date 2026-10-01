package abcd;

public class BC {
    private static int[] DW;
    private static final java.util.Comparator<abcd.hC> j6 = null;
    private boolean EQ;
    private java.util.List<abcd.hC> FH;
    private java.util.List<abcd.hC> Hw;
    private final abcd.UE VH;
    private boolean Zo;
    private int gn;
    private int tp;
    private int u7;
    private java.util.List<abcd.hC> v5;

    static {
        j6 = new abcd.AC();
    }

    public BC(abcd.UE r2) {
        this.gn = 60;
        this.u7 = -1;
        this.VH = r2;
        this.tp = ((abcd.gC) r2.Zo().j6(abcd.gC.j6)).j6();
        v5();
    }

    private static abcd.hC DW(abcd.hC r2, abcd.hC r3) {
        return abcd.hC.j6(abcd.hC.a.Hw, r2, r3, 100);
    }

    private static abcd.AbstractrE DW(abcd.hC r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2.VH != abcd.hC.a.FH) { $pc0 = 6; continue $sw0; }
                    return r2.v5;
                }
                case 6: {
                    return r2.Zo;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.LE r15) {
        java.util.HashMap<abcd.WD, java.lang.Object> r0 = null;
        java.util.HashMap<abcd.WD, java.lang.Object> r1 = null;
        java.util.ArrayList r2 = null;
        java.util.ArrayList r3 = null;
        java.util.Iterator<java.lang.Object> r4 = null;
        java.lang.Object r5 = null;
        java.util.ArrayList r6 = null;
        java.util.Iterator r7 = null;
        abcd.hC r8 = null;
        java.lang.Object r9 = null;
        abcd.hC r10 = null;
        abcd.hC r11 = null;
        java.util.Iterator r12 = null;
        java.util.List r13 = null;
        java.lang.Object r14 = null;
        java.util.List r16 = null;
        long[] r17 = null;
        int r18 = 0;
        int r19 = 0;
        java.lang.String r110 = null;
        int r111 = 0;
        int r20 = 0;
        long r112 = 0L;
        int r21 = 0;
        int r22 = 0;
        abcd.hC r23 = null;
        abcd.hC r113 = null;
        abcd.hC.a r114 = null;
        abcd.hC r24 = null;
        abcd.hC r25 = null;
        java.util.Iterator r26 = null;
        abcd.hC r27 = null;
        java.util.Iterator<java.lang.Object> r28 = null;
        java.lang.Object r29 = null;
        java.util.Iterator r30 = null;
        abcd.hC r31 = null;
        abcd.hC r32 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r15.j6(org.eclipse.jgit.JGitText.j6().renamesFindingExact, ((this.v5.size() + this.v5.size()) + this.Hw.size()) + (this.v5.size() * this.Hw.size()));
                    r0 = j6(this.Hw, r15);
                    r1 = j6(this.v5, r15);
                    r2 = new java.util.ArrayList(this.v5.size());
                    r3 = new java.util.ArrayList();
                    r4 = r1.values().iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc1 = 5; continue $sw1; }
                    r5 = r4.next();
                    if ((r5 instanceof abcd.hC) == true) { $pc1 = 80; continue $sw1; }
                    r3.add((java.util.List) r5);
                    { $pc1 = 4; continue $sw1; }
                }
                case 80: {
                    r2.add((abcd.hC) r5);
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    r6 = new java.util.ArrayList(this.v5.size());
                    r7 = r2.iterator();
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r7.hasNext() == false) { $pc1 = 8; continue $sw1; }
                    r8 = (abcd.hC) r7.next();
                    r9 = r0.get(r8.tp);
                    if ((r9 instanceof abcd.hC) == false) { $pc1 = 71; continue $sw1; }
                    r10 = (abcd.hC) r9;
                    if (j6(r10.v5, r8.Zo) == false) { $pc1 = 70; continue $sw1; }
                    r10.VH = abcd.hC.a.Hw;
                    this.FH.add(DW(r10, r8));
                    $pc1 = 77; continue $sw1;
                }
                case 77: {
                    r15.update(1);
                    { $pc1 = 7; continue $sw1; }
                }
                case 70: {
                    r6.add(r8);
                    { $pc1 = 77; continue $sw1; }
                }
                case 71: {
                    if (r9 == null) { $pc1 = 76; continue $sw1; }
                    r11 = j6(r8, (java.util.List) r9);
                    if (r11 == null) { $pc1 = 75; continue $sw1; }
                    r11.VH = abcd.hC.a.Hw;
                    this.FH.add(DW(r11, r8));
                    { $pc1 = 77; continue $sw1; }
                }
                case 75: {
                    r6.add(r8);
                    { $pc1 = 77; continue $sw1; }
                }
                case 76: {
                    r6.add(r8);
                    { $pc1 = 77; continue $sw1; }
                }
                case 8: {
                    r12 = r3.iterator();
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (r12.hasNext() == false) { $pc1 = 11; continue $sw1; }
                    r13 = (java.util.List) r12.next();
                    r14 = r0.get(((abcd.hC) r13.get(0)).tp);
                    if ((r14 instanceof abcd.hC) == true) { $pc1 = 30; continue $sw1; }
                    if (r14 != null) { $pc1 = 44; continue $sw1; }
                    r6.addAll(r13);
                    { $pc1 = 10; continue $sw1; }
                }
                case 44: {
                    r16 = (java.util.List) r14;
                    r17 = new long[r16.size() * r13.size()];
                    r18 = 0;
                    r19 = 0;
                    $pc1 = 46; continue $sw1;
                }
                case 46: {
                    if (r18 >= r16.size()) { $pc1 = 47; continue $sw1; }
                    r110 = ((abcd.hC) r16.get(r18)).FH;
                    r111 = r19;
                    r20 = 0;
                    $pc1 = 61; continue $sw1;
                }
                case 61: {
                    if (r20 >= r13.size()) { $pc1 = 62; continue $sw1; }
                    r17[r111] = abcd.FC.j6(abcd.FC.j6(((abcd.hC) r13.get(r20)).Hw, r110), r18, r20);
                    r111 = r111 + 1;
                    r20 = r20 + 1;
                    { $pc1 = 61; continue $sw1; }
                }
                case 62: {
                    r18 = r18 + 1;
                    r19 = r111;
                    { $pc1 = 46; continue $sw1; }
                }
                case 47: {
                    java.util.Arrays.sort(r17);
                    $pc1 = 48; continue $sw1;
                }
                case 48: {
                    r19 = r19 - 1;
                    if (r19 < 0) { $pc1 = 10; continue $sw1; }
                    r112 = r17[r19];
                    r21 = abcd.FC.DW(r112);
                    r22 = abcd.FC.j6(r112);
                    r23 = (abcd.hC) r16.get(r21);
                    r113 = (abcd.hC) r13.get(r22);
                    if (r113 == null) { $pc1 = 53; continue $sw1; }
                    if (r23.VH != abcd.hC.a.FH) { $pc1 = 57; continue $sw1; }
                    r114 = abcd.hC.a.Hw;
                    r23.VH = r114;
                    $pc1 = 58; continue $sw1;
                }
                case 58: {
                    this.FH.add(abcd.hC.j6(r114, r23, r113, 100));
                    r13.set(r22, null);
                    r15.update(1);
                    { $pc1 = 48; continue $sw1; }
                }
                case 57: {
                    r114 = abcd.hC.a.v5;
                    { $pc1 = 58; continue $sw1; }
                }
                case 53: {
                    r15.update(1);
                    { $pc1 = 48; continue $sw1; }
                }
                case 30: {
                    r24 = (abcd.hC) r14;
                    r25 = j6(r24, r13);
                    if (r25 != null) { $pc1 = 32; continue $sw1; }
                    r6.addAll(r13);
                    { $pc1 = 10; continue $sw1; }
                }
                case 32: {
                    r24.VH = abcd.hC.a.Hw;
                    this.FH.add(DW(r24, r25));
                    r26 = r13.iterator();
                    $pc1 = 34; continue $sw1;
                }
                case 34: {
                    if (r26.hasNext() == false) { $pc1 = 10; continue $sw1; }
                    r27 = (abcd.hC) r26.next();
                    if (r27 == r25) { $pc1 = 34; continue $sw1; }
                    if (j6(r24.v5, r27.Zo) == true) { $pc1 = 40; continue $sw1; }
                    r6.add(r27);
                    { $pc1 = 34; continue $sw1; }
                }
                case 40: {
                    this.FH.add(j6(r24, r27));
                    { $pc1 = 34; continue $sw1; }
                }
                case 11: {
                    this.v5 = r6;
                    this.Hw = new java.util.ArrayList(r0.size());
                    r28 = r0.values().iterator();
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    if (r28.hasNext() == false) { $pc1 = 14; continue $sw1; }
                    r29 = r28.next();
                    if ((r29 instanceof abcd.hC) == true) { $pc1 = 18; continue $sw1; }
                    r30 = ((java.util.List) r29).iterator();
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    if (r30.hasNext() == false) { $pc1 = 13; continue $sw1; }
                    r31 = (abcd.hC) r30.next();
                    if (r31.VH != abcd.hC.a.FH) { $pc1 = 23; continue $sw1; }
                    this.Hw.add(r31);
                    { $pc1 = 23; continue $sw1; }
                }
                case 18: {
                    r32 = (abcd.hC) r29;
                    if (r32.VH != abcd.hC.a.FH) { $pc1 = 13; continue $sw1; }
                    this.Hw.add(r32);
                    { $pc1 = 13; continue $sw1; }
                }
                case 14: {
                    r15.j6();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.AbstractcC.c r8, abcd.LE r9) {
        java.util.ArrayList r0 = null;
        int r2 = 0;
        abcd.hC r3 = null;
        int r4 = 0;
        java.util.List<abcd.hC> r5 = null;
        abcd.hC r6 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new java.util.ArrayList(this.FH.size());
                    r9.j6(org.eclipse.jgit.JGitText.j6().renamesBreakingModifies, this.FH.size());
                    r2 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r2 >= this.FH.size()) { $pc2 = 5; continue $sw2; }
                    r3 = this.FH.get(r2);
                    if (r3.DW() != abcd.hC.a.DW) { $pc2 = 13; continue $sw2; }
                    r4 = j6(r8, r3);
                    if (r4 >= this.u7) { $pc2 = 12; continue $sw2; }
                    r5 = abcd.hC.j6(r3);
                    r6 = r5.get(0);
                    r6.gn = r4;
                    this.Hw.add(r6);
                    this.v5.add(r5.get(1));
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    r9.update(1);
                    r2 = r2 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 12: {
                    r0.add(r3);
                    { $pc2 = 14; continue $sw2; }
                }
                case 13: {
                    r0.add(r3);
                    { $pc2 = 14; continue $sw2; }
                }
                case 5: {
                    this.FH = r0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String FH(abcd.hC r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r2.VH != abcd.hC.a.FH) { $pc3 = 6; continue $sw3; }
                    return r2.FH;
                }
                case 6: {
                    return r2.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(abcd.LE r10) {
        java.util.HashMap r0 = null;
        java.util.ArrayList r1 = null;
        java.util.Iterator<abcd.hC> r2 = null;
        abcd.hC r3 = null;
        java.util.Iterator<abcd.hC> r4 = null;
        abcd.hC r5 = null;
        abcd.hC r6 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.util.HashMap();
                    r1 = new java.util.ArrayList(this.v5.size());
                    r10.j6(org.eclipse.jgit.JGitText.j6().renamesRejoiningModifies, this.v5.size() + this.Hw.size());
                    r2 = this.Hw.iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc4 = 5; continue $sw4; }
                    r3 = r2.next();
                    r0.put(r3.FH, r3);
                    r10.update(1);
                    { $pc4 = 4; continue $sw4; }
                }
                case 5: {
                    r4 = this.v5.iterator();
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r4.hasNext() == false) { $pc4 = 8; continue $sw4; }
                    r5 = r4.next();
                    r6 = (abcd.hC) r0.remove(r5.Hw);
                    if (r6 != null) { $pc4 = 13; continue $sw4; }
                    r1.add(r5);
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    r10.update(1);
                    { $pc4 = 7; continue $sw4; }
                }
                case 13: {
                    if (j6(r6.v5, r5.Zo) == false) { $pc4 = 15; continue $sw4; }
                    this.FH.add(abcd.hC.j6(abcd.hC.a.DW, r6, r5, r6.gn));
                    { $pc4 = 17; continue $sw4; }
                }
                case 15: {
                    r0.put(r6.FH, r6);
                    r1.add(r5);
                    { $pc4 = 17; continue $sw4; }
                }
                case 8: {
                    this.v5 = r1;
                    this.Hw = new java.util.ArrayList(r0.values());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(abcd.AbstractcC.c r4, abcd.LE r5) {
        int r0 = 0;
        abcd.FC r1 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = java.lang.Math.max(this.v5.size(), this.Hw.size());
                    if (FH() != 0) { $pc5 = 5; continue $sw5; }
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    r1 = new abcd.FC(r4, this.Hw, this.v5);
                    r1.j6(Hw());
                    r1.j6(r5);
                    this.EQ |= r1.Hw();
                    this.Hw = r1.DW();
                    this.v5 = r1.j6();
                    this.FH.addAll(r1.FH());
                    return;
                }
                case 5: {
                    if (r0 <= FH()) { $pc5 = 8; continue $sw5; }
                    this.EQ = true;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(abcd.AbstractcC.c r4, abcd.hC r5) {
        abcd.EC r0 = null;
        abcd.EC r1 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    try {
                        r0 = new abcd.EC();
                        r0.j6(r4.j6(abcd.hC.b.j6, r5));
                        r0.j6();
                        r1 = new abcd.EC();
                        r1.j6(r4.j6(abcd.hC.b.DW, r5));
                        r1.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof abcd.EC.a) { $pc6 = 4; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0.j6(r1, 100);
                }
                case 4: {
                    this.EQ = true;
                    return this.u7 + 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.WD j6(abcd.hC r2) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r2.VH != abcd.hC.a.FH) { $pc7 = 6; continue $sw7; }
                    return r2.u7;
                }
                case 6: {
                    return r2.tp;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.hC j6(abcd.hC r2, abcd.hC r3) {
        return abcd.hC.j6(abcd.hC.a.v5, r2, r3, 100);
    }

    private static abcd.hC j6(abcd.hC r5, java.util.List<abcd.hC> r6) {
        java.util.Iterator<abcd.hC> r7 = null;
        abcd.hC r0 = null;
        int r1 = 0;
        abcd.hC r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r7 = r6.iterator();
                    r0 = null;
                    r1 = -1;
                    $pc8 = 4; continue $sw8;
                }
                case 4: {
                    if (r7.hasNext() == false) { $pc8 = 5; continue $sw8; }
                    r2 = r7.next();
                    if (j6(DW(r2), DW(r5)) == false) { $pc8 = 4; continue $sw8; }
                    r3 = abcd.FC.j6(FH(r2), FH(r5));
                    if (r3 <= r1) { $pc8 = 4; continue $sw8; }
                    r0 = r2;
                    r1 = r3;
                    { $pc8 = 4; continue $sw8; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.util.HashMap<abcd.WD, java.lang.Object> j6(java.util.List<abcd.hC> r6, abcd.LE r7) {
        java.util.HashMap<abcd.WD, java.lang.Object> r0 = null;
        java.util.Iterator<abcd.hC> r8 = null;
        abcd.hC r1 = null;
        java.lang.Object r2 = null;
        java.util.ArrayList r3 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = new java.util.HashMap();
                    r8 = r6.iterator();
                    $pc9 = 4; continue $sw9;
                }
                case 4: {
                    if (r8.hasNext() == false) { $pc9 = 5; continue $sw9; }
                    r1 = r8.next();
                    r2 = r0.put(j6(r1), r1);
                    if ((r2 instanceof abcd.hC) == false) { $pc9 = 9; continue $sw9; }
                    r3 = new java.util.ArrayList(2);
                    r3.add((abcd.hC) r2);
                    r3.add(r1);
                    r0.put(j6(r1), r3);
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    r7.update(1);
                    { $pc9 = 4; continue $sw9; }
                }
                case 9: {
                    if (r2 == null) { $pc9 = 11; continue $sw9; }
                    ((java.util.List) r2).add(r1);
                    r0.put(j6(r1), r2);
                    { $pc9 = 11; continue $sw9; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(abcd.AbstractrE r1, abcd.AbstractrE r2) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if ((r1.DW() & 61440) != (r2.DW() & 61440)) { $pc10 = 6; continue $sw10; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] j6() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = DW;
                    if (r0 == null) { $pc11 = 5; continue $sw11; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.hC.a.values().length];
                    try {
                        r1[abcd.hC.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc11 = 13; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 18; continue $sw11;
                }
                case 18: {
                    try {
                        r1[abcd.hC.a.v5.ordinal()] = 5;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc11 = 14; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 24; continue $sw11;
                }
                case 24: {
                    try {
                        r1[abcd.hC.a.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc11 = 15; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 26; continue $sw11;
                }
                case 26: {
                    try {
                        r1[abcd.hC.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc11 = 16; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 20; continue $sw11;
                }
                case 20: {
                    try {
                        r1[abcd.hC.a.Hw.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc11 = 17; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 11; continue $sw11;
                }
                case 11: {
                    DW = r1;
                    return r1;
                }
                case 13: {
                    throw new java.lang.IllegalStateException();
                }
                case 14: {
                    throw new java.lang.IllegalStateException();
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                case 16: {
                    throw new java.lang.IllegalStateException();
                }
                case 17: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<abcd.hC> DW() {
        return j6(abcd.vE.j6);
    }

    public int FH() {
        return this.tp;
    }

    public int Hw() {
        return this.gn;
    }

    public java.util.List<abcd.hC> j6(abcd.IE r2, abcd.LE r3) {
        abcd.AbstractcC r4 = abcd.AbstractcC.j6(r2);
        return j6(new abcd.AbstractcC.c(r4, r4), r3);
    }

    public java.util.List<abcd.hC> j6(abcd.LE r2) {
        abcd.IE r0 = null;
        java.util.List<abcd.hC> r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (this.Zo == true) { $pc12 = 12; continue $sw12; }
                    r0 = this.VH.j3();
                    try {
                        r3 = j6(r0, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    r0.FH();
                    return r3;
                }
                case 8: {
                    th = $ex12;
                    r0.FH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 12: {
                    return java.util.Collections.unmodifiableList(this.FH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<abcd.hC> j6(abcd.AbstractcC.c r2, abcd.LE r3) {
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (this.Zo == true) { $pc13 = 29; continue $sw13; }
                    this.Zo = true;
                    if (r3 != null) { $pc13 = 8; continue $sw13; }
                    r3 = abcd.vE.j6;
                    $pc13 = 8; continue $sw13;
                }
                case 8: {
                    if (this.u7 <= 0) { $pc13 = 11; continue $sw13; }
                    DW(r2, r3);
                    $pc13 = 11; continue $sw13;
                }
                case 11: {
                    if (this.v5.isEmpty() == true) { $pc13 = 16; continue $sw13; }
                    if (this.Hw.isEmpty() == true) { $pc13 = 16; continue $sw13; }
                    DW(r3);
                    $pc13 = 16; continue $sw13;
                }
                case 16: {
                    if (this.v5.isEmpty() == true) { $pc13 = 21; continue $sw13; }
                    if (this.Hw.isEmpty() == true) { $pc13 = 21; continue $sw13; }
                    FH(r2, r3);
                    $pc13 = 21; continue $sw13;
                }
                case 21: {
                    if (this.u7 > 0) { $pc13 = 23; continue $sw13; }
                    $pc13 = 27; continue $sw13;
                }
                case 27: {
                    this.FH.addAll(this.v5);
                    this.v5 = null;
                    this.FH.addAll(this.Hw);
                    this.Hw = null;
                    java.util.Collections.sort(this.FH, j6);
                    { $pc13 = 29; continue $sw13; }
                }
                case 23: {
                    if (this.v5.isEmpty() == true) { $pc13 = 27; continue $sw13; }
                    if (this.Hw.isEmpty() == true) { $pc13 = 27; continue $sw13; }
                    FH(r3);
                    $pc13 = 29; continue $sw13;
                }
                case 29: {
                    return java.util.Collections.unmodifiableList(this.FH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.util.Collection<abcd.hC> r5) {
        java.util.Iterator<abcd.hC> r6 = null;
        abcd.hC r0 = null;
        int r1 = 0;
        java.util.List<abcd.hC> r2 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (this.Zo == true) { $pc14 = 22; continue $sw14; }
                    r6 = r5.iterator();
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    if (r6.hasNext() == false) { $pc14 = 7; continue $sw14; }
                    r0 = r6.next();
                    r1 = j6()[r0.DW().ordinal()];
                    if (r1 != 1) { $pc14 = 11; continue $sw14; }
                    this.v5.add(r0);
                    { $pc14 = 6; continue $sw14; }
                }
                case 11: {
                    if (r1 != 2) { $pc14 = 13; continue $sw14; }
                    if (j6(r0.VH(), r0.Hw()) == true) { $pc14 = 18; continue $sw14; }
                    r2 = abcd.hC.j6(r0);
                    this.Hw.add(r2.get(0));
                    this.v5.add(r2.get(1));
                    { $pc14 = 6; continue $sw14; }
                }
                case 18: {
                    this.FH.add(r0);
                    { $pc14 = 6; continue $sw14; }
                }
                case 13: {
                    if (r1 != 3) { $pc14 = 14; continue $sw14; }
                    this.Hw.add(r0);
                    { $pc14 = 6; continue $sw14; }
                }
                case 14: {
                    this.FH.add(r0);
                    { $pc14 = 6; continue $sw14; }
                }
                case 7: {
                    return;
                }
                case 22: {
                    throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().renamesAlreadyFound);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5() {
        this.FH = new java.util.ArrayList();
        this.Hw = new java.util.ArrayList();
        this.v5 = new java.util.ArrayList();
        this.Zo = false;
    }
}
