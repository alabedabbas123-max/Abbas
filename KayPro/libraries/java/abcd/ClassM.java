package abcd;

public final class ClassM<E> implements java.util.Collection<E>, java.util.Set<E> {
    private static final java.lang.Object[] DW = null;
    static java.lang.Object[] FH;
    static int Hw;
    static int Zo;
    private static final int[] j6 = null;
    static java.lang.Object[] v5;
    r<E, E> EQ;
    final boolean VH;
    int[] gn;
    int tp;
    java.lang.Object[] u7;

    static {
        j6 = new int[0];
        DW = new java.lang.Object[0];
    }

    public ClassM() {
        this(0, false);
    }

    public ClassM(int r2) {
        this(r2, false);
    }

    public ClassM(int r1, boolean r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.VH = r2;
                    if (r1 != 0) { $pc0 = 5; continue $sw0; }
                    this.gn = j6;
                    this.u7 = DW;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.tp = 0;
                    return;
                }
                case 5: {
                    gn(r1);
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int DW() {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.tp;
                    if (r0 != 0) { $pc1 = 5; continue $sw1; }
                    return -1;
                }
                case 5: {
                    r2 = abcd.ClassN.j6(this.gn, r0, 0);
                    if (r2 >= 0) { $pc1 = 9; continue $sw1; }
                    return r2;
                }
                case 9: {
                    if (this.u7[r2] != null) { $pc1 = 11; continue $sw1; }
                    return r2;
                }
                case 11: {
                    r3 = r2 + 1;
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    if (r3 >= r0) { $pc1 = 19; continue $sw1; }
                    if (this.gn[r3] != 0) { $pc1 = 19; continue $sw1; }
                    if (this.u7[r3] == null) { $pc1 = 17; continue $sw1; }
                    r3 = r3 + 1;
                    { $pc1 = 12; continue $sw1; }
                }
                case 17: {
                    return r3;
                }
                case 19: {
                    r4 = r2 - 1;
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    if (r4 < 0) { $pc1 = 28; continue $sw1; }
                    if (this.gn[r4] != 0) { $pc1 = 28; continue $sw1; }
                    if (this.u7[r4] == null) { $pc1 = 25; continue $sw1; }
                    r4 = r4 - 1;
                    { $pc1 = 20; continue $sw1; }
                }
                case 25: {
                    return r4;
                }
                case 28: {
                    return r3 ^ (-1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void gn(int r6) {
        java.lang.Object[] r7 = null;
        java.lang.Object[] r8 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r6 != 8) { $pc2 = 17; continue $sw2; }
                    monitor-enter(abcd.ClassM.class);
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    th = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 7: {
                    if (v5 == null) { $pc2 = 11; continue $sw2; }
                    try {
                        r7 = v5;
                        this.u7 = r7;
                        v5 = (java.lang.Object[]) r7[0];
                        this.gn = (int[]) r7[1];
                        r7[1] = null;
                        r7[0] = null;
                        Zo--;
                        monitor-exit(abcd.ClassM.class);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    return;
                }
                case 11: {
                    try {
                        monitor-exit(abcd.ClassM.class);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 13; continue $sw2;
                    }
                    $pc2 = 30; continue $sw2;
                }
                case 30: {
                    this.gn = new int[r6];
                    this.u7 = new java.lang.Object[r6];
                    return;
                }
                case 17: {
                    if (r6 != 4) { $pc2 = 30; continue $sw2; }
                    monitor-enter(abcd.ClassM.class);
                    $pc2 = 27; continue $sw2;
                }
                case 27: {
                    th = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 21: {
                    if (FH == null) { $pc2 = 25; continue $sw2; }
                    try {
                        r8 = FH;
                        this.u7 = r8;
                        FH = (java.lang.Object[]) r8[0];
                        this.gn = (int[]) r8[1];
                        r8[1] = null;
                        r8[0] = null;
                        Hw--;
                        monitor-exit(abcd.ClassM.class);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    return;
                }
                case 25: {
                    try {
                        monitor-exit(abcd.ClassM.class);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 27; continue $sw2;
                    }
                    { $pc2 = 30; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(java.lang.Object r6, int r7) {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.tp;
                    if (r0 != 0) { $pc3 = 5; continue $sw3; }
                    return -1;
                }
                case 5: {
                    r2 = abcd.ClassN.j6(this.gn, r0, r7);
                    if (r2 >= 0) { $pc3 = 9; continue $sw3; }
                    return r2;
                }
                case 9: {
                    if (r6.equals(this.u7[r2]) == false) { $pc3 = 11; continue $sw3; }
                    return r2;
                }
                case 11: {
                    r3 = r2 + 1;
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    if (r3 >= r0) { $pc3 = 19; continue $sw3; }
                    if (this.gn[r3] != r7) { $pc3 = 19; continue $sw3; }
                    if (r6.equals(this.u7[r3]) == true) { $pc3 = 17; continue $sw3; }
                    r3 = r3 + 1;
                    { $pc3 = 12; continue $sw3; }
                }
                case 17: {
                    return r3;
                }
                case 19: {
                    r4 = r2 - 1;
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    if (r4 < 0) { $pc3 = 28; continue $sw3; }
                    if (this.gn[r4] != r7) { $pc3 = 28; continue $sw3; }
                    if (r6.equals(this.u7[r4]) == true) { $pc3 = 25; continue $sw3; }
                    r4 = r4 - 1;
                    { $pc3 = 20; continue $sw3; }
                }
                case 25: {
                    return r4;
                }
                case 28: {
                    return r3 ^ (-1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private r<E, E> j6() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.EQ != null) { $pc4 = 6; continue $sw4; }
                    this.EQ = new abcd.l(this);
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return this.EQ;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(int[] r7, java.lang.Object[] r8, int r9) {
        int r10 = 0;
        int r11 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r7.length != 8) { $pc5 = 18; continue $sw5; }
                    monitor-enter(abcd.ClassM.class);
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    th = $ex5;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 7: {
                    if (Zo >= 10) { $pc5 = 12; continue $sw5; }
                    try {
                        r8[0] = v5;
                        r8[1] = r7;
                        r10 = r9 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    if (r10 < 2) { $pc5 = 11; continue $sw5; }
                    try {
                        r8[r10] = null;
                        r10 = r10 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                    { $pc5 = 9; continue $sw5; }
                }
                case 11: {
                    try {
                        v5 = r8;
                        Zo++;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    try {
                        monitor-exit(abcd.ClassM.class);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                    return;
                }
                case 18: {
                    if (r7.length == 4) { $pc5 = 20; continue $sw5; }
                    return;
                }
                case 20: {
                    monitor-enter(abcd.ClassM.class);
                    $pc5 = 29; continue $sw5;
                }
                case 29: {
                    th = $ex5;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 22: {
                    if (Hw >= 10) { $pc5 = 27; continue $sw5; }
                    try {
                        r8[0] = FH;
                        r8[1] = r7;
                        r11 = r9 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 29; continue $sw5;
                    }
                    $pc5 = 24; continue $sw5;
                }
                case 24: {
                    if (r11 < 2) { $pc5 = 26; continue $sw5; }
                    try {
                        r8[r11] = null;
                        r11 = r11 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 29; continue $sw5;
                    }
                    { $pc5 = 24; continue $sw5; }
                }
                case 26: {
                    try {
                        FH = r8;
                        Hw++;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 29; continue $sw5;
                    }
                    $pc5 = 27; continue $sw5;
                }
                case 27: {
                    try {
                        monitor-exit(abcd.ClassM.class);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 29; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public E VH(int r2) {
        return (E) this.u7[r2];
    }

    public E Zo(int r8) {
        java.lang.Object[] r0 = null;
        E r1 = null;
        int r2 = 0;
        int[] r3 = null;
        int r6 = 0;
        int r4 = 0;
        int[] r5 = null;
        int r7 = 0;
        java.lang.Object[] r9 = null;
        int[] r10 = null;
        java.lang.Object[] r11 = null;
        int r12 = 0;
        int r13 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.u7;
                    r1 = (E) r0[r8];
                    r2 = this.tp;
                    if (r2 > 1) { $pc6 = 5; continue $sw6; }
                    j6(this.gn, r0, r2);
                    this.gn = j6;
                    this.u7 = DW;
                    this.tp = 0;
                    $pc6 = 21; continue $sw6;
                }
                case 21: {
                    return r1;
                }
                case 5: {
                    r3 = this.gn;
                    r6 = 8;
                    if (r3.length > 8) { $pc6 = 8; continue $sw6; }
                    $pc6 = 17; continue $sw6;
                }
                case 17: {
                    this.tp--;
                    r4 = this.tp;
                    if (r8 >= r4) { $pc6 = 20; continue $sw6; }
                    r5 = this.gn;
                    r7 = r8 + 1;
                    java.lang.System.arraycopy(r5, r7, r5, r8, r4 - r8);
                    r9 = this.u7;
                    java.lang.System.arraycopy(r9, r7, r9, r8, this.tp - r8);
                    $pc6 = 20; continue $sw6;
                }
                case 20: {
                    this.u7[this.tp] = null;
                    { $pc6 = 21; continue $sw6; }
                }
                case 8: {
                    if (r2 >= (r3.length / 3)) { $pc6 = 17; continue $sw6; }
                    if (r2 <= 8) { $pc6 = 11; continue $sw6; }
                    r6 = r2 + (r2 >> 1);
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    r10 = this.gn;
                    r11 = this.u7;
                    gn(r6);
                    this.tp--;
                    if (r8 <= 0) { $pc6 = 14; continue $sw6; }
                    java.lang.System.arraycopy(r10, 0, this.gn, 0, r8);
                    java.lang.System.arraycopy(r11, 0, this.u7, 0, r8);
                    $pc6 = 14; continue $sw6;
                }
                case 14: {
                    r12 = this.tp;
                    if (r8 >= r12) { $pc6 = 21; continue $sw6; }
                    r13 = r8 + 1;
                    java.lang.System.arraycopy(r10, r13, this.gn, r8, r12 - r8);
                    java.lang.System.arraycopy(r11, r13, this.u7, r8, this.tp - r8);
                    { $pc6 = 21; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean add(E r9) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int[] r6 = null;
        java.lang.Object[] r7 = null;
        int[] r8 = null;
        int r0 = 0;
        int[] r10 = null;
        int r11 = 0;
        java.lang.Object[] r12 = null;
        int r13 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r9 != null) { $pc7 = 6; continue $sw7; }
                    r1 = DW();
                    r2 = 0;
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    if (r1 < 0) { $pc7 = 12; continue $sw7; }
                    return false;
                }
                case 12: {
                    r3 = r1 ^ (-1);
                    r4 = this.tp;
                    if (r4 < this.gn.length) { $pc7 = 23; continue $sw7; }
                    r5 = 4;
                    if (r4 < 8) { $pc7 = 17; continue $sw7; }
                    r5 = (r4 >> 1) + r4;
                    $pc7 = 19; continue $sw7;
                }
                case 19: {
                    r6 = this.gn;
                    r7 = this.u7;
                    gn(r5);
                    r8 = this.gn;
                    if (r8.length <= 0) { $pc7 = 22; continue $sw7; }
                    java.lang.System.arraycopy(r6, 0, r8, 0, r6.length);
                    java.lang.System.arraycopy(r7, 0, this.u7, 0, r7.length);
                    $pc7 = 22; continue $sw7;
                }
                case 22: {
                    j6(r6, r7, this.tp);
                    { $pc7 = 23; continue $sw7; }
                }
                case 17: {
                    if (r4 < 4) { $pc7 = 19; continue $sw7; }
                    r5 = 8;
                    $pc7 = 23; continue $sw7;
                }
                case 23: {
                    r0 = this.tp;
                    if (r3 >= r0) { $pc7 = 26; continue $sw7; }
                    r10 = this.gn;
                    r11 = r3 + 1;
                    java.lang.System.arraycopy(r10, r3, r10, r11, r0 - r3);
                    r12 = this.u7;
                    java.lang.System.arraycopy(r12, r3, r12, r11, this.tp - r3);
                    $pc7 = 26; continue $sw7;
                }
                case 26: {
                    this.gn[r3] = r2;
                    this.u7[r3] = r9;
                    this.tp++;
                    return true;
                }
                case 6: {
                    if (this.VH == false) { $pc7 = 8; continue $sw7; }
                    r13 = java.lang.System.identityHashCode(r9);
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    r2 = r13;
                    r1 = j6(r9, r13);
                    { $pc7 = 10; continue $sw7; }
                }
                case 8: {
                    r13 = r9.hashCode();
                    { $pc7 = 9; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean addAll(java.util.Collection<? extends E> r3) {
        java.util.Iterator<? extends E> r4 = null;
        boolean r0 = false;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    v5(this.tp + r3.size());
                    r4 = r3.iterator();
                    r0 = false;
                    $pc8 = 4; continue $sw8;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc8 = 6; continue $sw8; }
                    r0 = r0 | add(r4.next());
                    { $pc8 = 4; continue $sw8; }
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void clear() {
        int r0 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = this.tp;
                    if (r0 == 0) { $pc9 = 6; continue $sw9; }
                    j6(this.gn, this.u7, r0);
                    this.gn = j6;
                    this.u7 = DW;
                    this.tp = 0;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean contains(java.lang.Object r1) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (indexOf(r1) < 0) { $pc10 = 5; continue $sw10; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean containsAll(java.util.Collection<?> r2) {
        java.util.Iterator<?> r3 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r3 = r2.iterator();
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc11 = 9; continue $sw11; }
                    if (contains(r3.next()) == true) { $pc11 = 4; continue $sw11; }
                    return false;
                }
                case 9: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean equals(java.lang.Object r5) {
        java.util.Set r6 = null;
        int r1 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (this != r5) { $pc12 = 6; continue $sw12; }
                    return true;
                }
                case 6: {
                    if ((r5 instanceof java.util.Set) == false) { $pc12 = 18; continue $sw12; }
                    r6 = (java.util.Set) r5;
                    if (size() == r6.size()) { $pc12 = 10; continue $sw12; }
                    return false;
                }
                case 10: {
                    r1 = 0;
                    $pc12 = 20; continue $sw12;
                }
                case 20: {
                    if (r1 >= this.tp) { $pc12 = 17; continue $sw12; }
                    if (r6.contains(VH(r1)) == false) { $pc12 = 15; continue $sw12; }
                    r1 = r1 + 1;
                    { $pc12 = 20; continue $sw12; }
                }
                case 15: {
                    return false;
                }
                case 17: {
                    return true;
                }
                case 18: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int hashCode() {
        int[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = this.gn;
                    r1 = this.tp;
                    r2 = 0;
                    r3 = 0;
                    $pc13 = 3; continue $sw13;
                }
                case 3: {
                    if (r2 >= r1) { $pc13 = 5; continue $sw13; }
                    r3 = r3 + r0[r2];
                    r2 = r2 + 1;
                    { $pc13 = 3; continue $sw13; }
                }
                case 5: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int indexOf(java.lang.Object r2) {
        int r0 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (r2 != null) { $pc14 = 5; continue $sw14; }
                    return DW();
                }
                case 5: {
                    if (this.VH == false) { $pc14 = 7; continue $sw14; }
                    r0 = java.lang.System.identityHashCode(r2);
                    $pc14 = 9; continue $sw14;
                }
                case 9: {
                    return j6(r2, r0);
                }
                case 7: {
                    r0 = r2.hashCode();
                    { $pc14 = 9; continue $sw14; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean isEmpty() {
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (this.tp > 0) { $pc15 = 5; continue $sw15; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return j6().v5().iterator();
    }

    @Override
    public boolean remove(java.lang.Object r1) {
        int r2 = 0;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r2 = indexOf(r1);
                    if (r2 < 0) { $pc16 = 6; continue $sw16; }
                    Zo(r2);
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean removeAll(java.util.Collection<?> r3) {
        java.util.Iterator<?> r4 = null;
        boolean r0 = false;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r4 = r3.iterator();
                    r0 = false;
                    $pc17 = 4; continue $sw17;
                }
                case 4: {
                    if (r4.hasNext() == false) { $pc17 = 6; continue $sw17; }
                    r0 = r0 | remove(r4.next());
                    { $pc17 = 4; continue $sw17; }
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean retainAll(java.util.Collection<?> r5) {
        int r0 = 0;
        boolean r2 = false;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r0 = this.tp - 1;
                    r2 = false;
                    $pc18 = 3; continue $sw18;
                }
                case 3: {
                    if (r0 < 0) { $pc18 = 8; continue $sw18; }
                    if (r5.contains(this.u7[r0]) == true) { $pc18 = 7; continue $sw18; }
                    Zo(r0);
                    r2 = true;
                    $pc18 = 7; continue $sw18;
                }
                case 7: {
                    r0 = r0 - 1;
                    { $pc18 = 3; continue $sw18; }
                }
                case 8: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int size() {
        return this.tp;
    }

    @Override
    public java.lang.Object[] toArray() {
        int r0 = this.tp;
        java.lang.Object[] r1 = new java.lang.Object[r0];
        java.lang.System.arraycopy(this.u7, 0, r1, 0, r0);
        return r1;
    }

    @Override
    public <T> T[] toArray(T[] r4) {
        T[] r5 = null;
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    if (r4.length >= this.tp) { $pc19 = 5; continue $sw19; }
                    r4 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(r4.getClass().getComponentType(), this.tp));
                    $pc19 = 5; continue $sw19;
                }
                case 5: {
                    r5 = r4;
                    java.lang.System.arraycopy(this.u7, 0, r5, 0, this.tp);
                    r0 = r4.length;
                    r1 = this.tp;
                    if (r0 <= r1) { $pc19 = 8; continue $sw19; }
                    r4[r1] = null;
                    $pc19 = 8; continue $sw19;
                }
                case 8: {
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        E r2 = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (isEmpty() == false) { $pc20 = 6; continue $sw20; }
                    return "{}";
                }
                case 6: {
                    r0 = new java.lang.StringBuilder(this.tp * 14);
                    r0.append('{');
                    r1 = 0;
                    $pc20 = 8; continue $sw20;
                }
                case 8: {
                    if (r1 >= this.tp) { $pc20 = 16; continue $sw20; }
                    if (r1 <= 0) { $pc20 = 11; continue $sw20; }
                    r0.append(", ");
                    $pc20 = 11; continue $sw20;
                }
                case 11: {
                    r2 = VH(r1);
                    if (r2 == this) { $pc20 = 14; continue $sw20; }
                    r0.append(r2);
                    $pc20 = 15; continue $sw20;
                }
                case 15: {
                    r1 = r1 + 1;
                    { $pc20 = 8; continue $sw20; }
                }
                case 14: {
                    r0.append("(this Set)");
                    { $pc20 = 15; continue $sw20; }
                }
                case 16: {
                    r0.append('}');
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5(int r5) {
        int[] r0 = null;
        java.lang.Object[] r1 = null;
        int r6 = 0;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r0 = this.gn;
                    if (r0.length >= r5) { $pc21 = 9; continue $sw21; }
                    r1 = this.u7;
                    gn(r5);
                    r6 = this.tp;
                    if (r6 <= 0) { $pc21 = 7; continue $sw21; }
                    java.lang.System.arraycopy(r0, 0, this.gn, 0, r6);
                    java.lang.System.arraycopy(r1, 0, this.u7, 0, this.tp);
                    $pc21 = 7; continue $sw21;
                }
                case 7: {
                    j6(r0, r1, this.tp);
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
