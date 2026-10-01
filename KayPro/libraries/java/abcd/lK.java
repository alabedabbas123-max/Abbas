package abcd;

public class lK<T> extends java.util.AbstractList<T> {
    private int DW;
    private int FH;
    private int Hw;
    private T[][] j6;
    private T[] v5;

    private class a implements java.util.Iterator<T> {
        private int DW;
        private int FH;
        private T[] Hw;
        private int j6;
        final abcd.lK v5;

        private a(abcd.lK r2) {
            this.v5 = r2;
            this.Hw = (T[]) abcd.lK.j6(r2)[0];
        }

        a(abcd.lK r1, abcd.lK.a r2) {
            this(r1);
        }

        @Override
        public boolean hasNext() {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.j6 >= abcd.lK.DW(this.v5)) { $pc0 = 6; continue $sw0; }
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
        public T next() {
            T[] r0 = null;
            int r1 = 0;
            T r2 = null;
            int r3 = 0;
            int r4 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (abcd.lK.DW(this.v5) <= this.j6) { $pc1 = 14; continue $sw1; }
                        r0 = this.Hw;
                        r1 = this.FH;
                        r2 = r0[r1];
                        r3 = r1 + 1;
                        this.FH = r3;
                        if (r3 != 1024) { $pc1 = 11; continue $sw1; }
                        r4 = this.DW + 1;
                        this.DW = r4;
                        if (r4 >= abcd.lK.j6(this.v5).length) { $pc1 = 9; continue $sw1; }
                        this.Hw = (T[]) abcd.lK.j6(this.v5)[this.DW];
                        $pc1 = 10; continue $sw1;
                    }
                    case 10: {
                        this.FH = 0;
                        { $pc1 = 11; continue $sw1; }
                    }
                    case 9: {
                        this.Hw = null;
                        $pc1 = 11; continue $sw1;
                    }
                    case 11: {
                        this.j6++;
                        return r2;
                    }
                    case 14: {
                        throw new java.util.NoSuchElementException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void remove() {
            int r0 = 0;
            abcd.lK r1 = null;
            int r2 = 0;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = this.j6;
                        if (r0 == 0) { $pc2 = 7; continue $sw2; }
                        r1 = this.v5;
                        r2 = r0 - 1;
                        this.j6 = r2;
                        r1.remove(r2);
                        this.DW = abcd.lK.v5(this.j6);
                        this.FH = abcd.lK.Zo(this.j6);
                        this.Hw = (T[]) abcd.lK.j6(this.v5)[this.DW];
                        return;
                    }
                    case 7: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public lK() {
        this.j6 = (T[][]) VH(256);
        ((T[][]) this.j6)[0] = j6();
        this.v5 = this.j6[0];
    }

    public lK(int r3) {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = u7(r3);
                    if ((r3 & 1023) != 0) { $pc3 = 5; continue $sw3; }
                    if (r0 == 0) { $pc3 = 5; continue $sw3; }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    this.j6 = (T[][]) VH(r0);
                    ((T[][]) this.j6)[0] = j6();
                    this.v5 = this.j6[0];
                    return;
                }
                case 5: {
                    r0 = r0 + 1;
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int DW(abcd.lK r0) {
        return r0.DW;
    }

    private void DW() {
        this.FH = u7(this.DW);
        this.Hw = gn(this.DW);
        this.v5 = this.j6[this.FH];
    }

    private static <T> T[][] VH(int r0) {
        return (T[][]) new java.lang.Object[r0][];
    }

    static int Zo(int r0) {
        return gn(r0);
    }

    private static final int gn(int r0) {
        return r0 & 1023;
    }

    private static <T> T[] j6() {
        return (T[]) new java.lang.Object[1024];
    }

    static java.lang.Object[][] j6(abcd.lK r0) {
        return r0.j6;
    }

    private static final int u7(int r0) {
        return r0 >>> 10;
    }

    static int v5(int r0) {
        return u7(r0);
    }

    public void FH(lK<T> r5) {
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r5.DW != 0) { $pc4 = 5; continue $sw4; }
                    return;
                }
                case 5: {
                    r1 = 0;
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (r1 >= r5.FH) { $pc4 = 8; continue $sw4; }
                    j6(r5.j6[r1], 0, 1024);
                    r1 = r1 + 1;
                    { $pc4 = 7; continue $sw4; }
                }
                case 8: {
                    r2 = r5.Hw;
                    if (r2 == 0) { $pc4 = 14; continue $sw4; }
                    j6(r5.v5, 0, r2);
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void add(int r4, T r5) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.DW;
                    if (r4 != r0) { $pc5 = 5; continue $sw5; }
                    add(r5);
                    return;
                }
                case 5: {
                    if (r4 < 0) { $pc5 = 13; continue $sw5; }
                    if (r0 < r4) { $pc5 = 13; continue $sw5; }
                    add(null);
                    r1 = this.DW - 2;
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    if (r4 > r1) { $pc5 = 9; continue $sw5; }
                    set(r1 + 1, get(r1));
                    r1 = r1 - 1;
                    { $pc5 = 8; continue $sw5; }
                }
                case 9: {
                    set(r4, r5);
                    return;
                }
                case 13: {
                    throw new java.lang.IndexOutOfBoundsException(java.lang.String.valueOf(r4));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean add(T r6) {
        int r0 = 0;
        int r1 = 0;
        T[][] r2 = null;
        T[][] r3 = null;
        T[][] r4 = null;
        T[] r5 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 >= 1024) { $pc6 = 6; continue $sw6; }
                    this.v5[r0] = r6;
                    this.Hw = r0 + 1;
                    this.DW++;
                    return true;
                }
                case 6: {
                    r1 = this.FH + 1;
                    this.FH = r1;
                    r2 = this.j6;
                    if (r1 != r2.length) { $pc6 = 9; continue $sw6; }
                    r3 = (T[][]) VH(r2.length << 1);
                    r4 = this.j6;
                    java.lang.System.arraycopy(r4, 0, r3, 0, r4.length);
                    this.j6 = r3;
                    $pc6 = 9; continue $sw6;
                }
                case 9: {
                    r5 = this.j6[this.FH];
                    if (r5 != null) { $pc6 = 12; continue $sw6; }
                    r5 = (T[]) j6();
                    this.j6[this.FH] = r5;
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    r5[0] = r6;
                    this.v5 = r5;
                    this.Hw = 1;
                    this.DW++;
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void clear() {
        T[][] r0 = null;
        int r1 = 0;
        int r3 = 0;
        T[] r4 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.j6;
                    r1 = r0.length;
                    r3 = 0;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    if (r3 >= r1) { $pc7 = 4; continue $sw7; }
                    r4 = r0[r3];
                    if (r4 == null) { $pc7 = 9; continue $sw7; }
                    java.util.Arrays.fill(r4, null);
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    r3 = r3 + 1;
                    { $pc7 = 3; continue $sw7; }
                }
                case 4: {
                    this.DW = 0;
                    this.FH = 0;
                    this.Hw = 0;
                    this.v5 = this.j6[0];
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public T get(int r3) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r3 < 0) { $pc8 = 8; continue $sw8; }
                    if (this.DW <= r3) { $pc8 = 8; continue $sw8; }
                    return this.j6[u7(r3)][gn(r3)];
                }
                case 8: {
                    throw new java.lang.IndexOutOfBoundsException(java.lang.String.valueOf(r3));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new abcd.lK.a(this, null);
    }

    public void j6(T[] r4, int r5, int r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 2;
        $sw9: while (true) {
            switch ($pc9) {
                case 2: {
                    if (r6 <= 0) { $pc9 = 3; continue $sw9; }
                    r0 = this.Hw;
                    r1 = java.lang.Math.min(r6, 1024 - r0);
                    if (r1 == 0) { $pc9 = 6; continue $sw9; }
                    java.lang.System.arraycopy(r4, r5, this.v5, r0, r1);
                    this.Hw += r1;
                    this.DW += r1;
                    r5 = r5 + r1;
                    r6 = r6 - r1;
                    { $pc9 = 2; continue $sw9; }
                }
                case 6: {
                    add(r4[r5]);
                    r6 = r6 - 1;
                    r5 = r5 + 1;
                    { $pc9 = 2; continue $sw9; }
                }
                case 3: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public T remove(int r5) {
        int r0 = 0;
        T[] r1 = null;
        int r6 = 0;
        T r2 = null;
        int r7 = 0;
        T r3 = null;
        int r4 = 0;
        int r8 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = this.DW;
                    if (r5 != (r0 - 1)) { $pc10 = 9; continue $sw10; }
                    r1 = this.j6[u7(r5)];
                    r6 = gn(r5);
                    r2 = r1[r6];
                    r1[r6] = null;
                    this.DW--;
                    r7 = this.Hw;
                    if (r7 <= 0) { $pc10 = 7; continue $sw10; }
                    this.Hw = r7 - 1;
                    $pc10 = 8; continue $sw10;
                }
                case 8: {
                    return r2;
                }
                case 7: {
                    DW();
                    { $pc10 = 8; continue $sw10; }
                }
                case 9: {
                    if (r5 < 0) { $pc10 = 18; continue $sw10; }
                    if (r0 <= r5) { $pc10 = 18; continue $sw10; }
                    r3 = get(r5);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    r4 = this.DW;
                    if (r5 >= (r4 - 1)) { $pc10 = 14; continue $sw10; }
                    r8 = r5 + 1;
                    set(r5, get(r8));
                    r5 = r8;
                    { $pc10 = 12; continue $sw10; }
                }
                case 14: {
                    set(r4 - 1, null);
                    this.DW--;
                    DW();
                    return r3;
                }
                case 18: {
                    throw new java.lang.IndexOutOfBoundsException(java.lang.String.valueOf(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public T set(int r3, T r4) {
        T[] r0 = null;
        int r5 = 0;
        T r1 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (r3 < 0) { $pc11 = 8; continue $sw11; }
                    if (this.DW <= r3) { $pc11 = 8; continue $sw11; }
                    r0 = this.j6[u7(r3)];
                    r5 = gn(r3);
                    r1 = r0[r5];
                    r0[r5] = r4;
                    return r1;
                }
                case 8: {
                    throw new java.lang.IndexOutOfBoundsException(java.lang.String.valueOf(r3));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int size() {
        return this.DW;
    }
}
