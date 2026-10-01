package abcd;

public abstract class IE {
    public IE() {
    }

    public abstract long DW(abcd.YD r1, int r2);

    public abstract abcd.IE DW();

    public <T extends abcd.yE> ZD<T> DW(java.lang.Iterable<T> r1, boolean r2) {
        return new abcd.GE(this, r1.iterator());
    }

    public abstract boolean DW(abcd.YD r1);

    public abcd.FE FH(abcd.YD r2) {
        return Hw(r2, -1);
    }

    public abstract void FH();

    public boolean FH(abcd.YD r1, int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        Hw(r1, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof abcd.fD) { $pc0 = 5; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract abcd.FE Hw(abcd.YD r1, int r2);

    public void Hw() {
    }

    public abcd.WD j6(abcd.YD r2) {
        return j6(r2, 7);
    }

    public abcd.WD j6(abcd.YD r8, int r9) {
        abcd.WD r1 = null;
        java.util.Collection<abcd.yE> r2 = null;
        java.util.ArrayList r5 = null;
        java.util.Iterator<abcd.yE> r3 = null;
        abcd.yE r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r9 == 40) { $pc1 = 5; continue $sw1; }
                    r1 = r8.j6(r9);
                    r2 = j6(r1);
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (1 >= r2.size()) { $pc1 = 21; continue $sw1; }
                    if (r9 >= 40) { $pc1 = 21; continue $sw1; }
                    r9 = r9 + 1;
                    r1 = r8.j6(r9);
                    r5 = new java.util.ArrayList(8);
                    r3 = r2.iterator();
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    if (r3.hasNext() == false) { $pc1 = 15; continue $sw1; }
                    r4 = r3.next();
                    if (r1.DW(r4) != 0) { $pc1 = 13; continue $sw1; }
                    r5.add(r4);
                    { $pc1 = 13; continue $sw1; }
                }
                case 15: {
                    if (1 < r5.size()) { $pc1 = 16; continue $sw1; }
                    r2 = j6(r1);
                    { $pc1 = 8; continue $sw1; }
                }
                case 16: {
                    r2 = r5;
                    $pc1 = 21; continue $sw1;
                }
                case 21: {
                    return r1;
                }
                case 5: {
                    return abcd.WD.j6(r8);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public <T extends abcd.yE> _D<T> j6(java.lang.Iterable<T> r1, boolean r2) {
        return new abcd.HE(this, r1.iterator());
    }

    public abstract java.util.Collection<abcd.yE> j6(abcd.WD r1);

    public void j6(abcd._F r1, abcd.dG r2, abcd.dG r3) {
    }

    public void j6(abcd.qG r1, java.util.Collection<abcd.dG> r2) {
    }
}
