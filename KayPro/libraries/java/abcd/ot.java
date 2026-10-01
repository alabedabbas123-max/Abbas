package abcd;

public final class ot extends abcd.Abstractvt {
    private final int FH;
    private final java.util.ArrayList<abcd.ot.a> Hw;
    private abcd.cs v5;

    private static class a {
        public final int DW;
        public final int FH;
        public abcd.bs j6;

        public a(abcd.bs r1, int r2, int r3) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
        }
    }

    public interface b {
        void j6(abcd.ot r1);
    }

    public ot(int r2, abcd.tt r3) {
        super(abcd.bs.j6(r2, abcd.Qs.tp), r3);
        this.Hw = new java.util.ArrayList();
        this.FH = r2;
    }

    public ot(abcd.bs r1, abcd.tt r2) {
        super(r1, r2);
        this.Hw = new java.util.ArrayList();
        this.FH = r1.we();
    }

    public void DW(abcd.bs r6) {
        java.util.ArrayList r0 = null;
        java.util.Iterator<abcd.ot.a> r1 = null;
        abcd.ot.a r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.ArrayList();
                    r1 = this.Hw.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc0 = 8; continue $sw0; }
                    r2 = r1.next();
                    if (r2.j6.we() != r6.we()) { $pc0 = 4; continue $sw0; }
                    r0.add(r2);
                    { $pc0 = 4; continue $sw0; }
                }
                case 8: {
                    this.Hw.removeAll(r0);
                    this.v5 = null;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final void DW(abcd.Abstractqt r5) {
        java.util.Iterator<abcd.ot.a> r0 = null;
        abcd.ot.a r1 = null;
        abcd.bs r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.Hw.iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc1 = 8; continue $sw1; }
                    r1 = r0.next();
                    r2 = r1.j6;
                    r1.j6 = r5.j6(r2);
                    if (r2 == r1.j6) { $pc1 = 4; continue $sw1; }
                    DW().v5().j6(this, r2, r1.j6);
                    { $pc1 = 4; continue $sw1; }
                }
                case 8: {
                    this.v5 = null;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean EQ() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (abcd.C1102nt.DW() == true) { $pc2 = 5; continue $sw2; }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (FH() == null) { $pc2 = 7; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH(int r2) {
        return this.Hw.get(r2).DW;
    }

    @Override
    public boolean XL() {
        return true;
    }

    @Override
    public java.lang.String aM() {
        return j6(null);
    }

    @Override
    public abcd.ot clone() {
        throw new java.lang.UnsupportedOperationException("can't clone phi");
    }

    @Override
    public abcd.Abstractvt clone() {
        clone();
        throw null;
    }

    @Override
    public java.lang.Object mo30clone() {
        clone();
        throw null;
    }

    @Override
    public abcd.Tr gn() {
        return null;
    }

    protected final java.lang.String j6(java.lang.String r6) {
        java.lang.StringBuffer r0 = null;
        abcd.bs r7 = null;
        int r8 = 0;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.lang.StringBuffer(80);
                    r0.append(abcd.hs.j6);
                    r0.append(": phi");
                    if (r6 == null) { $pc3 = 5; continue $sw3; }
                    r0.append("(");
                    r0.append(r6);
                    r0.append(")");
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r7 = u7();
                    if (r7 != null) { $pc3 = 8; continue $sw3; }
                    r0.append(" .");
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    r0.append(" <-");
                    r8 = tp().size();
                    if (r8 != 0) { $pc3 = 12; continue $sw3; }
                    r0.append(" .");
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    return r0.toString();
                }
                case 12: {
                    r1 = 0;
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    if (r1 >= r8) { $pc3 = 16; continue $sw3; }
                    r0.append(" ");
                    r0.append(this.v5.get(r1).aM() + "[b=" + abcd.Yt.v5(this.Hw.get(r1).FH) + "]");
                    r1 = r1 + 1;
                    { $pc3 = 13; continue $sw3; }
                }
                case 8: {
                    r0.append(" ");
                    r0.append(r7.aM());
                    { $pc3 = 9; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<abcd.tt> j6(int r5, abcd.yt r6) {
        java.util.ArrayList r0 = null;
        java.util.Iterator<abcd.ot.a> r1 = null;
        abcd.ot.a r2 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.util.ArrayList();
                    r1 = this.Hw.iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc4 = 8; continue $sw4; }
                    r2 = r1.next();
                    if (r2.j6.we() != r5) { $pc4 = 4; continue $sw4; }
                    r0.add(r6.DW().get(r2.DW));
                    { $pc4 = 4; continue $sw4; }
                }
                case 8: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Rs r2, abcd.Vr r3) {
        j6(abcd.bs.FH(u7().we(), r2, r3));
    }

    public void j6(abcd.bs r4, abcd.tt r5) {
        this.Hw.add(new abcd.ot.a(r4, r5.DW(), r5.EQ()));
        this.v5 = null;
    }

    @Override
    public void j6(abcd.Abstractvt.a r1) {
        r1.j6(this);
    }

    public void j6(abcd.yt r5) {
        java.util.Iterator<abcd.ot.a> r0 = null;
        abcd.ot.a r1 = null;
        abcd.bs r2 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.Hw.iterator();
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc5 = 6; continue $sw5; }
                    r1 = r0.next();
                    r2 = r5.FH(r1.j6.we()).u7();
                    r1.j6 = r1.j6.j6(r2.getType());
                    { $pc5 = 4; continue $sw5; }
                }
                case 6: {
                    this.v5 = null;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6() {
        return false;
    }

    @Override
    public abcd.Tr lg() {
        throw new java.lang.IllegalArgumentException("Cannot convert phi insns to rop form");
    }

    public int rN() {
        return this.FH;
    }

    @Override
    public abcd.cs tp() {
        abcd.cs r0 = null;
        int r1 = 0;
        int r2 = 0;
        abcd.ot.a r3 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.v5;
                    if (r0 == null) { $pc6 = 6; continue $sw6; }
                    return r0;
                }
                case 6: {
                    if (this.Hw.size() == 0) { $pc6 = 8; continue $sw6; }
                    r1 = this.Hw.size();
                    this.v5 = new abcd.cs(r1);
                    r2 = 0;
                    $pc6 = 10; continue $sw6;
                }
                case 10: {
                    if (r2 >= r1) { $pc6 = 12; continue $sw6; }
                    r3 = this.Hw.get(r2);
                    this.v5.j6(r2, r3.j6);
                    r2 = r2 + 1;
                    { $pc6 = 10; continue $sw6; }
                }
                case 12: {
                    this.v5.we();
                    return this.v5;
                }
                case 8: {
                    return abcd.cs.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.es v5() {
        return null;
    }
}
