package abcd;

public final class _n extends abcd.Abstractqo {
    private abcd.mo[] v5;

    public _n(abcd.hs r1, abcd.cs r2) {
        super(r1, r2);
        if (r2.size() == 0) goto L7;
        this.v5 = null;
        return;
    L7:
        throw new java.lang.IllegalArgumentException("registers.size() == 0");
    }

    private static abcd.mo j6(abcd.bs r2, int r3) {
        return abcd.AbstractVn.j6(abcd.hs.j6, abcd.bs.j6(r3, r2.getType()), r2);
    }

    private void we() {
        if (this.v5 == null) goto L5;
        return;
    L5:
        abcd.cs r0 = gn();
        int r1 = r0.size();
        this.v5 = new abcd.mo[r1];
        int r2 = 0;
        int r3 = 0;
    L6:
        if (r2 >= r1) goto L8;
        abcd.bs r4 = r0.get(r2);
        this.v5[r2] = j6(r4, r3);
        r3 = r3 + r4.Hw();
        r2 = r2 + 1;
        goto L6
    }

    @Override
    public int DW() {
        we();
        abcd.mo[] r0 = this.v5;
        int r1 = r0.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r3 = r3 + r0[r2].DW();
        r2 = r2 + 1;
        goto L3
    L5:
        return r3;
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r3) {
        return new abcd._n(VH(), r3);
    }

    @Override
    protected java.lang.String j6() {
        return null;
    }

    @Override
    protected java.lang.String j6(boolean r9) {
        abcd.cs r0 = gn();
        int r1 = r0.size();
        java.lang.StringBuffer r2 = new java.lang.StringBuffer(100);
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r3 >= r1) goto L9;
        abcd.bs r5 = r0.get(r3);
        abcd.mo r6 = j6(r5, r4);
        if (r3 == 0) goto L7;
        r2.append('\n');
    L7:
        r2.append(r6.j6(r9));
        r4 = r4 + r5.Hw();
        r3 = r3 + 1;
        goto L3
    L9:
        return r2.toString();
    }

    @Override
    public void j6(abcd.Lt r5) {
        we();
        abcd.mo[] r0 = this.v5;
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        r0[r2].j6(r5);
        r2 = r2 + 1;
        goto L3
    }
}
