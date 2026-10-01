package abcd;

public class ClassX<K, V> {
    static int DW;
    static java.lang.Object[] FH;
    static int Hw;
    static java.lang.Object[] j6;
    int VH;
    java.lang.Object[] Zo;
    int[] v5;

    public ClassX() {
        this.v5 = abcd.ClassN.j6;
        this.Zo = abcd.ClassN.FH;
        this.VH = 0;
    }

    public ClassX(int r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 != 0) { $pc0 = 5; continue $sw0; }
                    this.v5 = abcd.ClassN.j6;
                    this.Zo = abcd.ClassN.FH;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.VH = 0;
                    return;
                }
                case 5: {
                    v5(r1);
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(int[] r0, int r1, int r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return abcd.ClassN.j6(r0, r1, r2);
                }
                case 5: {
                    throw new java.util.ConcurrentModificationException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(int[] r7, java.lang.Object[] r8, int r9) {
        int r10 = 0;
        int r11 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r7.length != 8) { $pc2 = 18; continue $sw2; }
                    monitor-enter(abcd.ClassK.class);
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    th = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 7: {
                    if (Hw >= 10) { $pc2 = 12; continue $sw2; }
                    try {
                        r8[0] = FH;
                        r8[1] = r7;
                        r10 = (r9 << 1) - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (r10 < 2) { $pc2 = 11; continue $sw2; }
                    try {
                        r8[r10] = null;
                        r10 = r10 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    { $pc2 = 9; continue $sw2; }
                }
                case 11: {
                    try {
                        FH = r8;
                        Hw++;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    try {
                        monitor-exit(abcd.ClassK.class);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    return;
                }
                case 18: {
                    if (r7.length == 4) { $pc2 = 20; continue $sw2; }
                    return;
                }
                case 20: {
                    monitor-enter(abcd.ClassK.class);
                    $pc2 = 29; continue $sw2;
                }
                case 29: {
                    th = $ex2;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 22: {
                    if (DW >= 10) { $pc2 = 27; continue $sw2; }
                    try {
                        r8[0] = j6;
                        r8[1] = r7;
                        r11 = (r9 << 1) - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 29; continue $sw2;
                    }
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    if (r11 < 2) { $pc2 = 26; continue $sw2; }
                    try {
                        r8[r11] = null;
                        r11 = r11 - 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 29; continue $sw2;
                    }
                    { $pc2 = 24; continue $sw2; }
                }
                case 26: {
                    try {
                        j6 = r8;
                        DW++;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 29; continue $sw2;
                    }
                    $pc2 = 27; continue $sw2;
                }
                case 27: {
                    try {
                        monitor-exit(abcd.ClassK.class);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 29; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void v5(int r6) {
        java.lang.Object[] r7 = null;
        java.lang.Object[] r8 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r6 != 8) { $pc3 = 17; continue $sw3; }
                    monitor-enter(abcd.ClassK.class);
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    th = $ex3;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 7: {
                    if (FH == null) { $pc3 = 11; continue $sw3; }
                    try {
                        r7 = FH;
                        this.Zo = r7;
                        FH = (java.lang.Object[]) r7[0];
                        this.v5 = (int[]) r7[1];
                        r7[1] = null;
                        r7[0] = null;
                        Hw--;
                        monitor-exit(abcd.ClassK.class);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    return;
                }
                case 11: {
                    try {
                        monitor-exit(abcd.ClassK.class);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    $pc3 = 30; continue $sw3;
                }
                case 30: {
                    this.v5 = new int[r6];
                    this.Zo = new java.lang.Object[r6 << 1];
                    return;
                }
                case 17: {
                    if (r6 != 4) { $pc3 = 30; continue $sw3; }
                    monitor-enter(abcd.ClassK.class);
                    $pc3 = 27; continue $sw3;
                }
                case 27: {
                    th = $ex3;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 21: {
                    if (j6 == null) { $pc3 = 25; continue $sw3; }
                    try {
                        r8 = j6;
                        this.Zo = r8;
                        j6 = (java.lang.Object[]) r8[0];
                        this.v5 = (int[]) r8[1];
                        r8[1] = null;
                        r8[0] = null;
                        DW--;
                        monitor-exit(abcd.ClassK.class);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 27; continue $sw3;
                    }
                    return;
                }
                case 25: {
                    try {
                        monitor-exit(abcd.ClassK.class);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 27; continue $sw3;
                    }
                    { $pc3 = 30; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int DW(java.lang.Object r6) {
        int r0 = 0;
        java.lang.Object[] r1 = null;
        int r7 = 0;
        int r3 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.VH * 2;
                    r1 = this.Zo;
                    if (r6 != null) { $pc4 = 11; continue $sw4; }
                    r7 = 1;
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    if (r7 >= r0) { $pc4 = 18; continue $sw4; }
                    if (r1[r7] == null) { $pc4 = 9; continue $sw4; }
                    r7 = r7 + 2;
                    { $pc4 = 5; continue $sw4; }
                }
                case 9: {
                    return r7 >> 1;
                }
                case 18: {
                    return -1;
                }
                case 11: {
                    r3 = 1;
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    if (r3 >= r0) { $pc4 = 24; continue $sw4; }
                    if (r6.equals(r1[r3]) == true) { $pc4 = 16; continue $sw4; }
                    r3 = r3 + 2;
                    { $pc4 = 12; continue $sw4; }
                }
                case 16: {
                    return r3 >> 1;
                }
                case 24: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public K DW(int r2) {
        return (K) this.Zo[r2 << 1];
    }

    public V FH(int r11) {
        java.lang.Object[] r0 = null;
        int r1 = 0;
        V r2 = null;
        int r3 = 0;
        int r4 = 0;
        int[] r6 = null;
        int r8 = 0;
        int[] r5 = null;
        int r7 = 0;
        int r9 = 0;
        java.lang.Object[] r12 = null;
        java.lang.Object[] r13 = null;
        int r10 = 0;
        int[] r14 = null;
        java.lang.Object[] r15 = null;
        int r16 = 0;
        int r17 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.Zo;
                    r1 = r11 << 1;
                    r2 = (V) r0[r1 + 1];
                    r3 = this.VH;
                    if (r3 > 1) { $pc5 = 5; continue $sw5; }
                    j6(this.v5, r0, r3);
                    this.v5 = abcd.ClassN.j6;
                    this.Zo = abcd.ClassN.FH;
                    r4 = 0;
                    $pc5 = 23; continue $sw5;
                }
                case 23: {
                    if (r3 != this.VH) { $pc5 = 27; continue $sw5; }
                    this.VH = r4;
                    return r2;
                }
                case 27: {
                    throw new java.util.ConcurrentModificationException();
                }
                case 5: {
                    r4 = r3 - 1;
                    r6 = this.v5;
                    r8 = 8;
                    if (r6.length > 8) { $pc5 = 8; continue $sw5; }
                    $pc5 = 19; continue $sw5;
                }
                case 19: {
                    if (r11 >= r4) { $pc5 = 21; continue $sw5; }
                    r5 = this.v5;
                    r7 = r11 + 1;
                    r9 = r4 - r11;
                    java.lang.System.arraycopy(r5, r7, r5, r11, r9);
                    r12 = this.Zo;
                    java.lang.System.arraycopy(r12, r7 << 1, r12, r1, r9 << 1);
                    $pc5 = 21; continue $sw5;
                }
                case 21: {
                    r13 = this.Zo;
                    r10 = r4 << 1;
                    r13[r10] = null;
                    r13[r10 + 1] = null;
                    { $pc5 = 23; continue $sw5; }
                }
                case 8: {
                    if (r3 >= (r6.length / 3)) { $pc5 = 19; continue $sw5; }
                    if (r3 <= 8) { $pc5 = 11; continue $sw5; }
                    r8 = r3 + (r3 >> 1);
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    r14 = this.v5;
                    r15 = this.Zo;
                    v5(r8);
                    if (r3 != this.VH) { $pc5 = 18; continue $sw5; }
                    if (r11 <= 0) { $pc5 = 15; continue $sw5; }
                    java.lang.System.arraycopy(r14, 0, this.v5, 0, r11);
                    java.lang.System.arraycopy(r15, 0, this.Zo, 0, r1);
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    if (r11 >= r4) { $pc5 = 23; continue $sw5; }
                    r16 = r11 + 1;
                    r17 = r4 - r11;
                    java.lang.System.arraycopy(r14, r16, this.v5, r11, r17);
                    java.lang.System.arraycopy(r15, r16 << 1, this.Zo, r1, r17 << 1);
                    { $pc5 = 23; continue $sw5; }
                }
                case 18: {
                    throw new java.util.ConcurrentModificationException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public V Hw(int r2) {
        return (V) this.Zo[(r2 << 1) + 1];
    }

    public void clear() {
        int r0 = 0;
        int[] r1 = null;
        java.lang.Object[] r2 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.VH;
                    if (r0 <= 0) { $pc6 = 6; continue $sw6; }
                    r1 = this.v5;
                    r2 = this.Zo;
                    this.v5 = abcd.ClassN.j6;
                    this.Zo = abcd.ClassN.FH;
                    this.VH = 0;
                    j6(r1, r2, r0);
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (this.VH > 0) { $pc6 = 9; continue $sw6; }
                    return;
                }
                case 9: {
                    throw new java.util.ConcurrentModificationException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean containsKey(java.lang.Object r1) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (j6(r1) < 0) { $pc7 = 5; continue $sw7; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean containsValue(java.lang.Object r1) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (DW(r1) < 0) { $pc8 = 5; continue $sw8; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r7) {
        abcd.ClassX r8 = null;
        int r1 = 0;
        K r3 = null;
        V r4 = null;
        java.lang.Object r5 = null;
        java.util.Map r9 = null;
        int r2 = 0;
        K r6 = null;
        V r10 = null;
        java.lang.Object r11 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (this != r7) { $pc9 = 6; continue $sw9; }
                    return true;
                }
                case 6: {
                    if ((r7 instanceof abcd.ClassX) == false) { $pc9 = 26; continue $sw9; }
                    r8 = (abcd.ClassX) r7;
                    if (size() == r8.size()) { $pc9 = 10; continue $sw9; }
                    return false;
                }
                case 10: {
                    r1 = 0;
                    $pc9 = 48; continue $sw9;
                }
                case 48: {
                    if (r1 >= this.VH) { $pc9 = 23; continue $sw9; }
                    try {
                        r3 = DW(r1);
                        r4 = Hw(r1);
                        r5 = r8.get(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 24; continue $sw9;
                    }
                    if (r4 != null) { $pc9 = 20; continue $sw9; }
                    if (r5 != null) { $pc9 = 18; continue $sw9; }
                    if (r8.containsKey(r3) == false) { $pc9 = 18; continue $sw9; }
                    $pc9 = 22; continue $sw9;
                }
                case 22: {
                    r1 = r1 + 1;
                    $pc9 = 18; continue $sw9;
                }
                case 18: {
                    return false;
                }
                case 20: {
                    if (r4.equals(r5) == true) { $pc9 = 22; continue $sw9; }
                    return false;
                }
                case 23: {
                    return true;
                }
                case 24: {
                    return false;
                }
                case 26: {
                    if ((r7 instanceof java.util.Map) == false) { $pc9 = 44; continue $sw9; }
                    r9 = (java.util.Map) r7;
                    if (size() == r9.size()) { $pc9 = 30; continue $sw9; }
                    return false;
                }
                case 30: {
                    r2 = 0;
                    $pc9 = 46; continue $sw9;
                }
                case 46: {
                    if (r2 >= this.VH) { $pc9 = 43; continue $sw9; }
                    try {
                        r6 = DW(r2);
                        r10 = Hw(r2);
                        r11 = r9.get(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 45; continue $sw9;
                    }
                    if (r10 != null) { $pc9 = 40; continue $sw9; }
                    if (r11 != null) { $pc9 = 38; continue $sw9; }
                    if (r9.containsKey(r6) == false) { $pc9 = 38; continue $sw9; }
                    $pc9 = 42; continue $sw9;
                }
                case 42: {
                    r2 = r2 + 1;
                    $pc9 = 38; continue $sw9;
                }
                case 38: {
                    return false;
                }
                case 40: {
                    if (r10.equals(r11) == true) { $pc9 = 42; continue $sw9; }
                    return false;
                }
                case 43: {
                    return true;
                }
                case 44: {
                    return false;
                }
                case 45: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public V get(java.lang.Object r2) {
        int r3 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r3 = j6(r2);
                    if (r3 >= 0) { $pc10 = 7; continue $sw10; }
                    return null;
                }
                case 7: {
                    return (V) this.Zo[(r3 << 1) + 1];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int[] r0 = null;
        java.lang.Object[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Object r7 = null;
        int r8 = 0;
        int r9 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = this.v5;
                    r1 = this.Zo;
                    r2 = this.VH;
                    r3 = 0;
                    r5 = 0;
                    r6 = 1;
                    $pc11 = 3; continue $sw11;
                }
                case 3: {
                    if (r3 >= r2) { $pc11 = 9; continue $sw11; }
                    r7 = r1[r6];
                    r8 = r0[r3];
                    if (r7 != null) { $pc11 = 7; continue $sw11; }
                    r9 = 0;
                    $pc11 = 8; continue $sw11;
                }
                case 8: {
                    r5 = r5 + (r9 ^ r8);
                    r3 = r3 + 1;
                    r6 = r6 + 2;
                    { $pc11 = 3; continue $sw11; }
                }
                case 7: {
                    r9 = r7.hashCode();
                    { $pc11 = 8; continue $sw11; }
                }
                case 9: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean isEmpty() {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (this.VH > 0) { $pc12 = 5; continue $sw12; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6() {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = this.VH;
                    if (r0 != 0) { $pc13 = 5; continue $sw13; }
                    return -1;
                }
                case 5: {
                    r2 = j6(this.v5, r0, 0);
                    if (r2 >= 0) { $pc13 = 9; continue $sw13; }
                    return r2;
                }
                case 9: {
                    if (this.Zo[r2 << 1] != null) { $pc13 = 11; continue $sw13; }
                    return r2;
                }
                case 11: {
                    r3 = r2 + 1;
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    if (r3 >= r0) { $pc13 = 19; continue $sw13; }
                    if (this.v5[r3] != 0) { $pc13 = 19; continue $sw13; }
                    if (this.Zo[r3 << 1] == null) { $pc13 = 17; continue $sw13; }
                    r3 = r3 + 1;
                    { $pc13 = 12; continue $sw13; }
                }
                case 17: {
                    return r3;
                }
                case 19: {
                    r4 = r2 - 1;
                    $pc13 = 20; continue $sw13;
                }
                case 20: {
                    if (r4 < 0) { $pc13 = 28; continue $sw13; }
                    if (this.v5[r4] != 0) { $pc13 = 28; continue $sw13; }
                    if (this.Zo[r4 << 1] == null) { $pc13 = 25; continue $sw13; }
                    r4 = r4 - 1;
                    { $pc13 = 20; continue $sw13; }
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

    public int j6(java.lang.Object r2) {
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (r2 != null) { $pc14 = 5; continue $sw14; }
                    return j6();
                }
                case 5: {
                    return j6(r2, r2.hashCode());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6(java.lang.Object r7, int r8) {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = this.VH;
                    if (r0 != 0) { $pc15 = 5; continue $sw15; }
                    return -1;
                }
                case 5: {
                    r2 = j6(this.v5, r0, r8);
                    if (r2 >= 0) { $pc15 = 9; continue $sw15; }
                    return r2;
                }
                case 9: {
                    if (r7.equals(this.Zo[r2 << 1]) == false) { $pc15 = 11; continue $sw15; }
                    return r2;
                }
                case 11: {
                    r3 = r2 + 1;
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    if (r3 >= r0) { $pc15 = 19; continue $sw15; }
                    if (this.v5[r3] != r8) { $pc15 = 19; continue $sw15; }
                    if (r7.equals(this.Zo[r3 << 1]) == true) { $pc15 = 17; continue $sw15; }
                    r3 = r3 + 1;
                    { $pc15 = 12; continue $sw15; }
                }
                case 17: {
                    return r3;
                }
                case 19: {
                    r4 = r2 - 1;
                    $pc15 = 20; continue $sw15;
                }
                case 20: {
                    if (r4 < 0) { $pc15 = 28; continue $sw15; }
                    if (this.v5[r4] != r8) { $pc15 = 28; continue $sw15; }
                    if (r7.equals(this.Zo[r4 << 1]) == true) { $pc15 = 25; continue $sw15; }
                    r4 = r4 - 1;
                    { $pc15 = 20; continue $sw15; }
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

    public V j6(int r3, V r4) {
        int r5 = (r3 << 1) + 1;
        java.lang.Object[] r0 = this.Zo;
        V r1 = (V) r0[r5];
        r0[r5] = r4;
        return r1;
    }

    public void j6(int r6) {
        int r0 = 0;
        int[] r1 = null;
        java.lang.Object[] r2 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = this.VH;
                    r1 = this.v5;
                    if (r1.length >= r6) { $pc16 = 9; continue $sw16; }
                    r2 = this.Zo;
                    v5(r6);
                    if (this.VH <= 0) { $pc16 = 7; continue $sw16; }
                    java.lang.System.arraycopy(r1, 0, this.v5, 0, r0);
                    java.lang.System.arraycopy(r2, 0, this.Zo, 0, r0 << 1);
                    $pc16 = 7; continue $sw16;
                }
                case 7: {
                    j6(r1, r2, r0);
                    $pc16 = 9; continue $sw16;
                }
                case 9: {
                    if (this.VH != r0) { $pc16 = 12; continue $sw16; }
                    return;
                }
                case 12: {
                    throw new java.util.ConcurrentModificationException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public V put(K r10, V r11) {
        int r0 = 0;
        int r2 = 0;
        int r3 = 0;
        int r12 = 0;
        java.lang.Object[] r1 = null;
        V r4 = null;
        int r5 = 0;
        int r6 = 0;
        int[] r7 = null;
        java.lang.Object[] r8 = null;
        int[] r9 = null;
        int[] r13 = null;
        int r14 = 0;
        java.lang.Object[] r15 = null;
        int r16 = 0;
        int[] r17 = null;
        java.lang.Object[] r18 = null;
        int r19 = 0;
        int r20 = 0;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r0 = this.VH;
                    if (r10 != null) { $pc17 = 5; continue $sw17; }
                    r2 = j6();
                    r3 = 0;
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    if (r2 < 0) { $pc17 = 9; continue $sw17; }
                    r12 = (r2 << 1) + 1;
                    r1 = this.Zo;
                    r4 = (V) r1[r12];
                    r1[r12] = r11;
                    return r4;
                }
                case 9: {
                    r5 = r2 ^ (-1);
                    if (r0 < this.v5.length) { $pc17 = 24; continue $sw17; }
                    r6 = 4;
                    if (r0 < 8) { $pc17 = 14; continue $sw17; }
                    r6 = (r0 >> 1) + r0;
                    $pc17 = 16; continue $sw17;
                }
                case 16: {
                    r7 = this.v5;
                    r8 = this.Zo;
                    v5(r6);
                    if (r0 != this.VH) { $pc17 = 23; continue $sw17; }
                    r9 = this.v5;
                    if (r9.length <= 0) { $pc17 = 21; continue $sw17; }
                    java.lang.System.arraycopy(r7, 0, r9, 0, r7.length);
                    java.lang.System.arraycopy(r8, 0, this.Zo, 0, r8.length);
                    $pc17 = 21; continue $sw17;
                }
                case 21: {
                    j6(r7, r8, r0);
                    { $pc17 = 24; continue $sw17; }
                }
                case 23: {
                    throw new java.util.ConcurrentModificationException();
                }
                case 14: {
                    if (r0 < 4) { $pc17 = 16; continue $sw17; }
                    r6 = 8;
                    $pc17 = 24; continue $sw17;
                }
                case 24: {
                    if (r5 >= r0) { $pc17 = 26; continue $sw17; }
                    r13 = this.v5;
                    r14 = r5 + 1;
                    java.lang.System.arraycopy(r13, r5, r13, r14, r0 - r5);
                    r15 = this.Zo;
                    java.lang.System.arraycopy(r15, r5 << 1, r15, r14 << 1, (this.VH - r5) << 1);
                    $pc17 = 26; continue $sw17;
                }
                case 26: {
                    r16 = this.VH;
                    if (r0 != r16) { $pc17 = 33; continue $sw17; }
                    r17 = this.v5;
                    if (r5 >= r17.length) { $pc17 = 33; continue $sw17; }
                    r17[r5] = r3;
                    r18 = this.Zo;
                    r19 = r5 << 1;
                    r18[r19] = r10;
                    r18[r19 + 1] = r11;
                    this.VH = r16 + 1;
                    return null;
                }
                case 33: {
                    throw new java.util.ConcurrentModificationException();
                }
                case 5: {
                    r20 = r10.hashCode();
                    r3 = r20;
                    r2 = j6(r10, r20);
                    { $pc17 = 6; continue $sw17; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public V remove(java.lang.Object r1) {
        int r2 = 0;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r2 = j6(r1);
                    if (r2 >= 0) { $pc18 = 5; continue $sw18; }
                    return null;
                }
                case 5: {
                    return FH(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int size() {
        return this.VH;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        K r2 = null;
        V r3 = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    if (isEmpty() == false) { $pc19 = 6; continue $sw19; }
                    return "{}";
                }
                case 6: {
                    r0 = new java.lang.StringBuilder(this.VH * 28);
                    r0.append('{');
                    r1 = 0;
                    $pc19 = 8; continue $sw19;
                }
                case 8: {
                    if (r1 >= this.VH) { $pc19 = 20; continue $sw19; }
                    if (r1 <= 0) { $pc19 = 11; continue $sw19; }
                    r0.append(", ");
                    $pc19 = 11; continue $sw19;
                }
                case 11: {
                    r2 = DW(r1);
                    if (r2 == this) { $pc19 = 14; continue $sw19; }
                    r0.append(r2);
                    $pc19 = 15; continue $sw19;
                }
                case 15: {
                    r0.append('=');
                    r3 = Hw(r1);
                    if (r3 == this) { $pc19 = 18; continue $sw19; }
                    r0.append(r3);
                    $pc19 = 19; continue $sw19;
                }
                case 19: {
                    r1 = r1 + 1;
                    { $pc19 = 8; continue $sw19; }
                }
                case 18: {
                    r0.append("(this Map)");
                    { $pc19 = 19; continue $sw19; }
                }
                case 14: {
                    r0.append("(this Map)");
                    { $pc19 = 15; continue $sw19; }
                }
                case 20: {
                    r0.append('}');
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
