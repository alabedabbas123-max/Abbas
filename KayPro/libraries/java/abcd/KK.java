package abcd;

public class KK<T extends abcd.ME> implements java.lang.Iterable<abcd.ME> {
    private static final KK<abcd.ME> j6 = null;
    private final abcd.ME[] DW;
    private final int FH;

    public static class a<T extends abcd.ME> {
        private int DW;
        private abcd.ME[] j6;

        public a() {
            this(16);
        }

        public a(int r1) {
            this.j6 = new abcd.ME[r1];
        }

        public void DW() {
            java.util.Arrays.sort(this.j6, 0, this.DW, abcd.NE.j6);
        }

        public void DW(int r4) {
            abcd.ME[] r0 = this.j6;
            int r1 = r4 + 1;
            java.lang.System.arraycopy(r0, r1, r0, r4, this.DW - r1);
            this.DW--;
        }

        public KK<T> FH() {
            return new abcd.KK(this.j6, this.DW);
        }

        public int j6() {
            return this.DW;
        }

        public T j6(int r2) {
            return (T) this.j6[r2];
        }

        public void j6(int r2, T r3) {
            this.j6[r2] = r3;
        }

        public void j6(T r5) {
            abcd.ME[] r0 = null;
            int r1 = 0;
            int r2 = 0;
            abcd.ME[] r3 = null;
            abcd.ME[] r4 = null;
            int r6 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = this.j6;
                        r1 = r0.length;
                        r2 = this.DW;
                        if (r1 != r2) { $pc0 = 5; continue $sw0; }
                        r3 = new abcd.ME[r2 * 2];
                        java.lang.System.arraycopy(r0, 0, r3, 0, r2);
                        this.j6 = r3;
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        r4 = this.j6;
                        r6 = this.DW;
                        this.DW = r6 + 1;
                        r4[r6] = r5;
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void j6(abcd.ME[] r5, int r6, int r7) {
            int r0 = 0;
            int r1 = 0;
            abcd.ME[] r2 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = this.j6.length;
                        r1 = this.DW;
                        if (r0 >= (r1 + r7)) { $pc1 = 5; continue $sw1; }
                        r2 = new abcd.ME[java.lang.Math.max(r1 * 2, r1 + r7)];
                        java.lang.System.arraycopy(this.j6, 0, r2, 0, this.DW);
                        this.j6 = r2;
                        $pc1 = 5; continue $sw1;
                    }
                    case 5: {
                        java.lang.System.arraycopy(r5, r6, this.j6, this.DW, r7);
                        this.DW += r7;
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public java.lang.String toString() {
            return FH().toString();
        }
    }

    static {
        j6 = new abcd.KK(new abcd.ME[0], 0);
    }

    protected KK(KK<T> r2) {
        this.DW = r2.DW;
        this.FH = r2.FH;
    }

    KK(abcd.ME[] r1, int r2) {
        this.DW = r1;
        this.FH = r2;
    }

    public static <T extends abcd.ME> KK<T> DW() {
        return (KK<T>) j6;
    }

    static abcd.ME[] DW(abcd.KK r0) {
        return r0.DW;
    }

    static int j6(abcd.KK r0) {
        return r0.FH;
    }

    public final int DW(java.lang.String r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.FH;
                    if (r0 != 0) { $pc2 = 6; continue $sw2; }
                    return -1;
                }
                case 6: {
                    r1 = 0;
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    r2 = (r1 + r0) >>> 1;
                    r3 = abcd.NE.j6(this.DW[r2], r5);
                    if (r3 >= 0) { $pc2 = 10; continue $sw2; }
                    r1 = r2 + 1;
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    if (r1 < r0) { $pc2 = 7; continue $sw2; }
                    return -(r1 + 1);
                }
                case 10: {
                    if (r3 == 0) { $pc2 = 11; continue $sw2; }
                    r0 = r2;
                    { $pc2 = 13; continue $sw2; }
                }
                case 11: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final KK<T> DW(int r5, T r6) {
        int r0 = this.FH;
        abcd.ME[] r1 = new abcd.ME[r0];
        java.lang.System.arraycopy(this.DW, 0, r1, 0, r0);
        r1[r5] = r6;
        return new abcd.KK(r1, this.FH);
    }

    public final T FH(java.lang.String r1) {
        int r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r2 = DW(r1);
                    if (r2 >= 0) { $pc3 = 7; continue $sw3; }
                    return null;
                }
                case 7: {
                    return (T) get(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final T get(int r2) {
        return (T) this.DW[r2];
    }

    public final boolean isEmpty() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.FH != 0) { $pc4 = 6; continue $sw4; }
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
    public java.util.Iterator<abcd.ME> iterator() {
        return new abcd.JK(this);
    }

    public final KK<T> j6(int r4, T r5) {
        abcd.ME[] r0 = null;
        int r6 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r4 >= 0) { $pc5 = 4; continue $sw5; }
                    r4 = -(r4 + 1);
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    r0 = new abcd.ME[this.FH + 1];
                    if (r4 <= 0) { $pc5 = 7; continue $sw5; }
                    java.lang.System.arraycopy(this.DW, 0, r0, 0, r4);
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    r0[r4] = r5;
                    r6 = this.FH;
                    if (r4 >= r6) { $pc5 = 11; continue $sw5; }
                    java.lang.System.arraycopy(this.DW, r4, r0, r4 + 1, r6 - r4);
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    return new abcd.KK(r0, this.FH + 1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final KK<T> j6(T r2) {
        int r0 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = DW(r2.getName());
                    if (r0 < 0) { $pc6 = 7; continue $sw6; }
                    return DW(r0, r2);
                }
                case 7: {
                    return j6(r0, r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final java.util.List<abcd.ME> j6() {
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(this.DW).subList(0, this.FH));
    }

    public final boolean j6(java.lang.String r1) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (DW(r1) < 0) { $pc7 = 6; continue $sw7; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final KK<T> remove(int r6) {
        int r0 = 0;
        abcd.ME[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.FH;
                    if (r0 == 1) { $pc8 = 5; continue $sw8; }
                    r1 = new abcd.ME[r0 - 1];
                    if (r6 <= 0) { $pc8 = 9; continue $sw8; }
                    java.lang.System.arraycopy(this.DW, 0, r1, 0, r6);
                    $pc8 = 9; continue $sw8;
                }
                case 9: {
                    r2 = r6 + 1;
                    r3 = this.FH;
                    if (r2 >= r3) { $pc8 = 13; continue $sw8; }
                    java.lang.System.arraycopy(this.DW, r2, r1, r6, r3 - r2);
                    $pc8 = 13; continue $sw8;
                }
                case 13: {
                    return new abcd.KK(r1, this.FH - 1);
                }
                case 5: {
                    return DW();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int size() {
        return this.FH;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append('[');
                    if (this.FH <= 0) { $pc9 = 9; continue $sw9; }
                    r0.append(this.DW[0]);
                    r1 = 1;
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    if (r1 >= this.FH) { $pc9 = 9; continue $sw9; }
                    r0.append(", ");
                    r0.append(this.DW[r1]);
                    r1 = r1 + 1;
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    r0.append(']');
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final KK.a<T> v5(int r4) {
        abcd.KK.a r0 = new abcd.KK.a(java.lang.Math.max(16, r4));
        r0.j6(this.DW, 0, r4);
        return r0;
    }
}
