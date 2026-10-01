package abcd;

public abstract class TI {
    private final char[] DW;
    private final java.util.Set<java.lang.String> FH;
    private final java.util.Set<abcd.yE> Hw;
    private boolean VH;
    private boolean Zo;
    private final java.lang.StringBuilder j6;
    private abcd.UE v5;

    public static class a extends abcd.TI {
        private final abcd.EI gn;

        public a(abcd.EI r1) {
            this.gn = r1;
        }

        @Override
        protected void j6() {
            this.gn.j6();
        }

        @Override
        protected void j6(java.lang.CharSequence r2) {
            this.gn.j6(r2.toString());
        }
    }

    public TI() {
        this.j6 = new java.lang.StringBuilder(100);
        this.DW = new char[40];
        this.FH = new java.util.LinkedHashSet();
        this.Hw = new java.util.HashSet();
        this.VH = true;
    }

    private java.lang.Iterable<abcd.ME> DW(java.util.Map<java.lang.String, abcd.ME> r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r2 instanceof abcd.MK) == true) { $pc0 = 12; continue $sw0; }
                    if ((r2 instanceof java.util.SortedMap) == false) { $pc0 = 10; continue $sw0; }
                    if (((java.util.SortedMap) r2).comparator() == null) { $pc0 = 12; continue $sw0; }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    return abcd.NE.j6(r2.values());
                }
                case 12: {
                    return r2.values();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.YD r3, java.lang.String r4) {
        this.Hw.add(r3.J8());
        j6(r3, r4);
    }

    private void FH(abcd.YD r2, java.lang.String r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.Hw.contains(r2) == true) { $pc1 = 6; continue $sw1; }
                    DW(r2, r3);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW() {
        return this.VH;
    }

    public java.util.Set<abcd.yE> j6(java.util.Map<java.lang.String, abcd.ME> r4) {
        java.util.Iterator<abcd.ME> r5 = null;
        abcd.ME r0 = null;
        abcd.UE r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r5 = DW(r4).iterator();
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r5.hasNext() == false) { $pc2 = 6; continue $sw2; }
                    r0 = r5.next();
                    if (r0.DW() == null) { $pc2 = 4; continue $sw2; }
                    DW(r0.DW(), r0.getName());
                    if (this.Zo == false) { $pc2 = 4; continue $sw2; }
                    if (r0.Hw() == true) { $pc2 = 20; continue $sw2; }
                    r1 = this.v5;
                    if (r1 == null) { $pc2 = 4; continue $sw2; }
                    r0 = r1.j6(r0);
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    if (r0.FH() == null) { $pc2 = 4; continue $sw2; }
                    DW(r0.FH(), java.lang.String.valueOf(r0.getName()) + "^{}");
                    { $pc2 = 4; continue $sw2; }
                }
                case 6: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void j6();

    public void j6(abcd.UE r1) {
        this.v5 = r1;
    }

    public void j6(abcd.YD r2) {
        FH(r2, ".have");
    }

    public void j6(abcd.YD r4, java.lang.String r5) {
        java.util.Iterator<java.lang.String> r6 = null;
        java.lang.String r7 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    this.j6.setLength(0);
                    r4.j6(this.DW, this.j6);
                    this.j6.append(' ');
                    this.j6.append(r5);
                    if (this.VH == false) { $pc3 = 11; continue $sw3; }
                    this.VH = false;
                    if (this.FH.isEmpty() == true) { $pc3 = 11; continue $sw3; }
                    this.j6.append(0);
                    r6 = this.FH.iterator();
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    if (r6.hasNext() == false) { $pc3 = 9; continue $sw3; }
                    r7 = r6.next();
                    this.j6.append(' ');
                    this.j6.append(r7);
                    { $pc3 = 8; continue $sw3; }
                }
                case 9: {
                    this.j6.append(' ');
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    this.j6.append('\n');
                    j6(this.j6);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract void j6(java.lang.CharSequence r1);

    public void j6(java.lang.String r2) {
        this.FH.add(r2);
    }

    public void j6(boolean r1) {
        this.Zo = r1;
    }
}
