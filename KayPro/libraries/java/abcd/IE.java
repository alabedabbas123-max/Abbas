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
        Hw(r1, r2);     // Catch: abcd.fD -> L5
        return true;
    L5:
        return false;
    }

    public abstract abcd.FE Hw(abcd.YD r1, int r2);

    public void Hw() {
    }

    public abcd.WD j6(abcd.YD r2) {
        return j6(r2, 7);
    }

    public abcd.WD j6(abcd.YD r8, int r9) {
        if (r9 == 40) goto L5;
        abcd.WD r1 = r8.j6(r9);
        java.util.Collection<abcd.yE> r2 = j6(r1);
    L8:
        if (1 >= r2.size()) goto L21;
        if (r9 >= 40) goto L21;
        r9 = r9 + 1;
        r1 = r8.j6(r9);
        java.util.ArrayList r5 = new java.util.ArrayList(8);
        java.util.Iterator<abcd.yE> r3 = r2.iterator();
    L13:
        if (r3.hasNext() == false) goto L15;
        abcd.yE r4 = r3.next();
        if (r1.DW(r4) != 0) goto L13;
        r5.add(r4);
        goto L13
    L15:
        if (1 < r5.size()) goto L16;
        r2 = j6(r1);
        goto L8
    L16:
        r2 = r5;
    L21:
        return r1;
    L5:
        return abcd.WD.j6(r8);
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
