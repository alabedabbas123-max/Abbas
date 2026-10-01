package abcd;

public class Sm extends abcd.AbstractRm {
    private final abcd.Vm DW;
    private final java.util.ArrayList<abcd.AbstractRm> FH;

    public Sm(int r2) {
        boolean r0 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == 0) { $pc0 = 4; continue $sw0; }
                    r0 = true;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    super(r0);
                    this.DW = new abcd.Vm(r2);
                    this.FH = new java.util.ArrayList();
                    return;
                }
                case 4: {
                    r0 = false;
                    { $pc0 = 5; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private Sm(abcd.Sm r5) {
        int r1 = 0;
        boolean r0 = false;
        int r2 = 0;
        abcd.AbstractRm r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = 0;
                    if (r5.er() <= 0) { $pc1 = 5; continue $sw1; }
                    r0 = true;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    super(r0);
                    this.DW = r5.DW.lg();
                    this.FH = new java.util.ArrayList(r5.FH.size());
                    r2 = r5.FH.size();
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r1 >= r2) { $pc1 = 13; continue $sw1; }
                    r3 = r5.FH.get(r1);
                    if (r3 != null) { $pc1 = 11; continue $sw1; }
                    this.FH.add(null);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    r1 = r1 + 1;
                    { $pc1 = 7; continue $sw1; }
                }
                case 11: {
                    this.FH.add(r3.lg());
                    { $pc1 = 12; continue $sw1; }
                }
                case 13: {
                    return;
                }
                case 5: {
                    r0 = false;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public Sm(abcd.Vm r2, java.util.ArrayList<abcd.AbstractRm> r3) {
        boolean r0 = false;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2.er() <= 0) { $pc2 = 5; continue $sw2; }
                    r0 = true;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    super(r0);
                    this.DW = r2;
                    this.FH = r3;
                    return;
                }
                case 5: {
                    r0 = false;
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.AbstractRm FH(int r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r2 < this.FH.size()) { $pc3 = 7; continue $sw3; }
                    return null;
                }
                case 7: {
                    return this.FH.get(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Sm j6(abcd.Sm r14) {
        abcd.Vm r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.util.ArrayList r4 = null;
        int r6 = 0;
        boolean r7 = false;
        abcd.AbstractRm r8 = null;
        abcd.AbstractRm r9 = null;
        abcd.AbstractRm r10 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.DW.j6(r14.rN());
                    r1 = this.FH.size();
                    r2 = r14.FH.size();
                    r3 = java.lang.Math.max(r1, r2);
                    r4 = new java.util.ArrayList(r3);
                    r6 = 0;
                    r7 = false;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r6 >= r3) { $pc4 = 28; continue $sw4; }
                    r8 = null;
                    if (r6 >= r1) { $pc4 = 7; continue $sw4; }
                    r9 = this.FH.get(r6);
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r6 >= r2) { $pc4 = 10; continue $sw4; }
                    r10 = r14.FH.get(r6);
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    if (r9 == r10) { $pc4 = 16; continue $sw4; }
                    if (r9 != null) { $pc4 = 15; continue $sw4; }
                    r8 = r10;
                    $pc4 = 21; continue $sw4;
                }
                case 21: {
                    if (r7 == true) { $pc4 = 25; continue $sw4; }
                    if (r9 != r8) { $pc4 = 25; continue $sw4; }
                    r7 = false;
                    $pc4 = 26; continue $sw4;
                }
                case 26: {
                    r4.add(r8);
                    r6 = r6 + 1;
                    $pc4 = 25; continue $sw4;
                }
                case 25: {
                    r7 = true;
                    { $pc4 = 26; continue $sw4; }
                }
                case 15: {
                    if (r10 == null) { $pc4 = 16; continue $sw4; }
                    try {
                        r8 = r9.j6(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof abcd.an) { $pc4 = 19; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    e = $ex4;
                    e.j6("Merging locals set for caller block " + abcd.Yt.v5(r6));
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    r8 = r9;
                    { $pc4 = 21; continue $sw4; }
                }
                case 10: {
                    r10 = null;
                    { $pc4 = 11; continue $sw4; }
                }
                case 7: {
                    r9 = null;
                    { $pc4 = 8; continue $sw4; }
                }
                case 28: {
                    if (this.DW != r0) { $pc4 = 32; continue $sw4; }
                    if (r7 == true) { $pc4 = 32; continue $sw4; }
                    return this;
                }
                case 32: {
                    return new abcd.Sm(r0, r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Sm j6(abcd.Vm r12) {
        abcd.Vm r0 = null;
        abcd.Vm r1 = null;
        java.util.ArrayList r2 = null;
        int r3 = 0;
        int r4 = 0;
        boolean r5 = false;
        abcd.AbstractRm r6 = null;
        abcd.AbstractRm r7 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.DW;
                    r12.rN();
                    r1 = r0.j6(r12);
                    r2 = new java.util.ArrayList(this.FH.size());
                    r3 = this.FH.size();
                    r4 = 0;
                    r5 = false;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r4 >= r3) { $pc5 = 17; continue $sw5; }
                    r6 = this.FH.get(r4);
                    r7 = null;
                    if (r6 != null) { $pc5 = 22; continue $sw5; }
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    if (r5 == true) { $pc5 = 14; continue $sw5; }
                    if (r6 != r7) { $pc5 = 14; continue $sw5; }
                    r5 = false;
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    r2.add(r7);
                    r4 = r4 + 1;
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    r5 = true;
                    { $pc5 = 15; continue $sw5; }
                }
                case 22: {
                    try {
                        r7 = r6.j6(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof abcd.an) { $pc5 = 8; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    e = $ex5;
                    e.j6("Merging one locals against caller block " + abcd.Yt.v5(r4));
                    { $pc5 = 10; continue $sw5; }
                }
                case 17: {
                    if (this.DW != r1) { $pc5 = 21; continue $sw5; }
                    if (r5 == true) { $pc5 = 21; continue $sw5; }
                    return this;
                }
                case 21: {
                    return new abcd.Sm(r1, r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AbstractRm DW(int r1) {
        return FH(r1);
    }

    @Override
    public void DW(abcd.Qs r3) {
        java.util.Iterator<abcd.AbstractRm> r0 = null;
        abcd.AbstractRm r1 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.DW.er() != 0) { $pc6 = 5; continue $sw6; }
                    return;
                }
                case 5: {
                    J8();
                    this.DW.DW(r3);
                    r0 = this.FH.iterator();
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (r0.hasNext() == false) { $pc6 = 11; continue $sw6; }
                    r1 = r0.next();
                    if (r1 == null) { $pc6 = 7; continue $sw6; }
                    r1.DW(r3);
                    { $pc6 = 7; continue $sw6; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String aM() {
        java.lang.StringBuilder r0 = null;
        int r2 = 0;
        int r3 = 0;
        abcd.AbstractRm r4 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("(locals array set; primary)\n");
                    r0.append(rN().aM());
                    r0.append('\n');
                    r2 = this.FH.size();
                    r3 = 0;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    if (r3 >= r2) { $pc7 = 9; continue $sw7; }
                    r4 = this.FH.get(r3);
                    if (r4 == null) { $pc7 = 7; continue $sw7; }
                    r0.append("(locals array set: primary for caller " + abcd.Yt.v5(r3) + ")\n");
                    r0.append(r4.rN().aM());
                    r0.append('\n');
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    r3 = r3 + 1;
                    { $pc7 = 3; continue $sw7; }
                }
                case 9: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int er() {
        return this.DW.er();
    }

    @Override
    public abcd.Rs get(int r2) {
        return this.DW.get(r2);
    }

    @Override
    public abcd.AbstractRm j6(abcd.AbstractRm r1) {
        return j6(r1);
    }

    @Override
    public abcd.Sm j6(abcd.AbstractRm r3) {
        abcd.Sm r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    e = $ex8;
                    e.j6("underlay locals:");
                    j6(e);
                    e.j6("overlay locals:");
                    r3.j6(e);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 3: {
                    if ((r3 instanceof abcd.Sm) == false) { $pc8 = 5; continue $sw8; }
                    try {
                        r4 = j6((abcd.Sm) r3);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof abcd.an) { $pc8 = 8; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    r4.we();
                    return r4;
                }
                case 5: {
                    try {
                        r4 = j6((abcd.Vm) r3);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof abcd.an) { $pc8 = 8; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc8 = 6; continue $sw8; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Sm j6(abcd.AbstractRm r9, int r10) {
        abcd.AbstractRm r0 = null;
        abcd.Vm r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.util.ArrayList r4 = null;
        int r5 = 0;
        abcd.Vm r6 = null;
        abcd.AbstractRm r7 = null;
        abcd.Sm r11 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = FH(r10);
                    r1 = this.DW.j6(r9.rN());
                    if (r0 != r9) { $pc9 = 5; continue $sw9; }
                    r9 = r0;
                    $pc9 = 8; continue $sw9;
                }
                case 8: {
                    if (r9 == r0) { $pc9 = 10; continue $sw9; }
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    r2 = this.FH.size();
                    r3 = java.lang.Math.max(r10 + 1, r2);
                    r4 = new java.util.ArrayList(r3);
                    r5 = 0;
                    r6 = null;
                    $pc9 = 13; continue $sw9;
                }
                case 13: {
                    if (r5 >= r3) { $pc9 = 24; continue $sw9; }
                    if (r5 != r10) { $pc9 = 16; continue $sw9; }
                    r7 = r9;
                    $pc9 = 19; continue $sw9;
                }
                case 19: {
                    if (r7 == null) { $pc9 = 23; continue $sw9; }
                    if (r6 != null) { $pc9 = 22; continue $sw9; }
                    r6 = r7.rN();
                    { $pc9 = 23; continue $sw9; }
                }
                case 22: {
                    r6 = r6.j6(r7.rN());
                    $pc9 = 23; continue $sw9;
                }
                case 23: {
                    r4.add(r7);
                    r5 = r5 + 1;
                    { $pc9 = 13; continue $sw9; }
                }
                case 16: {
                    if (r5 >= r2) { $pc9 = 18; continue $sw9; }
                    r7 = this.FH.get(r5);
                    { $pc9 = 19; continue $sw9; }
                }
                case 18: {
                    r7 = null;
                    { $pc9 = 19; continue $sw9; }
                }
                case 24: {
                    r11 = new abcd.Sm(r6, r4);
                    r11.we();
                    return r11;
                }
                case 10: {
                    if (r1 != this.DW) { $pc9 = 12; continue $sw9; }
                    return this;
                }
                case 5: {
                    if (r0 == null) { $pc9 = 8; continue $sw9; }
                    r9 = r0.j6(r9);
                    { $pc9 = 8; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(int r3, abcd.Rs r4) {
        java.util.Iterator<abcd.AbstractRm> r0 = null;
        abcd.AbstractRm r1 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    J8();
                    this.DW.j6(r3, r4);
                    r0 = this.FH.iterator();
                    $pc10 = 4; continue $sw10;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc10 = 8; continue $sw10; }
                    r1 = r0.next();
                    if (r1 == null) { $pc10 = 4; continue $sw10; }
                    r1.j6(r3, r4);
                    { $pc10 = 4; continue $sw10; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Vt r6) {
        int r0 = 0;
        int r1 = 0;
        abcd.AbstractRm r2 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r6.j6("(locals array set; primary)");
                    this.DW.j6(r6);
                    r0 = this.FH.size();
                    r1 = 0;
                    $pc11 = 3; continue $sw11;
                }
                case 3: {
                    if (r1 >= r0) { $pc11 = 8; continue $sw11; }
                    r2 = this.FH.get(r1);
                    if (r2 == null) { $pc11 = 7; continue $sw11; }
                    r6.j6("(locals array set: primary for caller " + abcd.Yt.v5(r1) + ')');
                    r2.rN().j6(r6);
                    $pc11 = 7; continue $sw11;
                }
                case 7: {
                    r1 = r1 + 1;
                    { $pc11 = 3; continue $sw11; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.bs r2) {
        j6(r2.we(), r2);
    }

    @Override
    public abcd.AbstractRm lg() {
        return new abcd.Sm(this);
    }

    @Override
    protected abcd.Vm rN() {
        return this.DW;
    }

    @Override
    public void we() {
        java.util.Iterator<abcd.AbstractRm> r0 = null;
        abcd.AbstractRm r1 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    this.DW.we();
                    r0 = this.FH.iterator();
                    $pc12 = 4; continue $sw12;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc12 = 8; continue $sw12; }
                    r1 = r0.next();
                    if (r1 == null) { $pc12 = 4; continue $sw12; }
                    r1.we();
                    { $pc12 = 4; continue $sw12; }
                }
                case 8: {
                    super.we();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
