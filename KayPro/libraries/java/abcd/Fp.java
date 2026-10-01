package abcd;

public final class Fp extends abcd.AbstractKp {
    private static final java.util.Comparator<abcd.AbstractGp> Zo = null;
    private final java.util.ArrayList<abcd.AbstractGp> VH;
    private final java.util.HashMap<abcd.AbstractGp, abcd.AbstractGp> gn;
    private int tp;
    private final abcd.Fp.a u7;

    static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.Fp.a DW = null;
        public static final abcd.Fp.a FH = null;
        private static final abcd.Fp.a[] Hw = null;
        public static final abcd.Fp.a j6 = null;

        static {
            j6 = new abcd.Fp.a("NONE", 0);
            DW = new abcd.Fp.a("TYPE", 1);
            FH = new abcd.Fp.a("INSTANCE", 2);
            Hw = new abcd.Fp.a[]{j6, DW, FH};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.Fp.a valueOf(java.lang.String r1) {
            return (abcd.Fp.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Fp.a.values(), r1);
        }

        public static abcd.Fp.a[] values() {
            return (abcd.Fp.a[]) Hw.clone();
        }
    }

    static {
        Zo = new abcd.Dp();
    }

    public Fp(java.lang.String r1, abcd.jp r2, int r3, abcd.Fp.a r4) {
        super(r1, r2, r3);
        this.VH = new java.util.ArrayList(100);
        this.gn = new java.util.HashMap(100);
        this.u7 = r4;
        this.tp = -1;
    }

    public <T extends abcd.AbstractGp> T DW(T r2) {
        T r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    gn();
                    r0 = (T) this.gn.get(r2);
                    if (r0 == null) { $pc0 = 5; continue $sw0; }
                    return r0;
                }
                case 5: {
                    j6(r2);
                    this.gn.put(r2, r2);
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void FH(abcd.Lt r11) {
        boolean r0 = false;
        abcd.jp r1 = null;
        java.util.Iterator<abcd.AbstractGp> r2 = null;
        int r5 = 0;
        boolean r6 = false;
        abcd.AbstractGp r7 = null;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r11.Hw();
                    r1 = DW();
                    r2 = this.VH.iterator();
                    r5 = 0;
                    r6 = true;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc1 = 15; continue $sw1; }
                    r7 = r2.next();
                    if (r0 == false) { $pc1 = 10; continue $sw1; }
                    if (r6 == false) { $pc1 = 9; continue $sw1; }
                    r6 = false;
                    { $pc1 = 10; continue $sw1; }
                }
                case 9: {
                    r11.j6(0, "\n");
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    r8 = r7.J8() - 1;
                    r9 = r5 + r8;
                    r10 = (r8 ^ (-1)) & r9;
                    if (r5 == r10) { $pc1 = 13; continue $sw1; }
                    r11.j6(r10 - r5);
                    r5 = r10;
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r7.j6(r1, r11);
                    r5 = r5 + r7.VH();
                    { $pc1 = 4; continue $sw1; }
                }
                case 15: {
                    if (r5 != this.tp) { $pc1 = 18; continue $sw1; }
                    return;
                }
                case 18: {
                    throw new java.lang.RuntimeException("output size mismatch");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Collection<? extends abcd.Abstractvp> Hw() {
        return this.VH;
    }

    @Override
    protected void Zo() {
        abcd.jp r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = DW();
                    r1 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    r2 = this.VH.size();
                    if (r1 < r2) { $pc2 = 6; continue $sw2; }
                    return;
                }
                case 6: {
                    if (r1 >= r2) { $pc2 = 3; continue $sw2; }
                    this.VH.get(r1).j6(r0);
                    r1 = r1 + 1;
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int j6(abcd.Abstractvp r1) {
        return ((abcd.AbstractGp) r1).we();
    }

    public void j6(abcd.AbstractGp r3) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    gn();
                    if (r3.J8() > j6()) { $pc3 = 8; continue $sw3; }
                    this.VH.add(r3);
                    return;
                }
                case 8: {
                    try {
                        throw new java.lang.IllegalArgumentException("incompatible item alignment");
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc3 = 9; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 10: {
                    throw new java.lang.NullPointerException("item == null");
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Lt r5, abcd.Enumwp r6, java.lang.String r7) {
        java.util.TreeMap r0 = null;
        java.util.Iterator<abcd.AbstractGp> r1 = null;
        abcd.AbstractGp r2 = null;
        java.util.Iterator r8 = null;
        java.util.Map.Entry r3 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    VH();
                    r0 = new java.util.TreeMap();
                    r1 = this.VH.iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc4 = 9; continue $sw4; }
                    r2 = r1.next();
                    if (r2.Hw() != r6) { $pc4 = 4; continue $sw4; }
                    r0.put(r2.aM(), r2);
                    { $pc4 = 4; continue $sw4; }
                }
                case 9: {
                    if (r0.size() != 0) { $pc4 = 11; continue $sw4; }
                    return;
                }
                case 11: {
                    r5.j6(0, r7);
                    r8 = r0.entrySet().iterator();
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    if (r8.hasNext() == false) { $pc4 = 15; continue $sw4; }
                    r3 = (java.util.Map.Entry) r8.next();
                    r5.j6(0, ((abcd.AbstractGp) r3.getValue()).Ws() + ' ' + ((java.lang.String) r3.getKey()) + '\n');
                    { $pc4 = 13; continue $sw4; }
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void tp() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.AbstractGp r4 = null;
        int r5 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    VH();
                    r0 = abcd.Ep.j6[this.u7.ordinal()];
                    if (r0 != 1) { $pc5 = 5; continue $sw5; }
                    java.util.Collections.sort(this.VH);
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    r1 = this.VH.size();
                    r2 = 0;
                    r3 = 0;
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    if (r2 >= r1) { $pc5 = 20; continue $sw5; }
                    r4 = this.VH.get(r2);
                    try {
                        r5 = r4.j6(this, r3);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc5 = 17; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5 < r3) { $pc5 = 16; continue $sw5; }
                    try {
                        r3 = r4.VH() + r5;
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc5 = 17; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc5 = 10; continue $sw5; }
                }
                case 16: {
                    try {
                        throw new java.lang.RuntimeException("bogus place() result for " + r4);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc5 = 17; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 17: {
                    e = $ex5;
                    throw abcd.Vt.j6(e, "...while placing " + r4);
                }
                case 20: {
                    this.tp = r3;
                    return;
                }
                case 5: {
                    if (r0 != 2) { $pc5 = 9; continue $sw5; }
                    java.util.Collections.sort(this.VH, Zo);
                    { $pc5 = 9; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int u7() {
        VH();
        return this.tp;
    }
}
