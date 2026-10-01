package abcd;

public final class Ho extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Ho();
    }

    private Ho() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r4) {
        abcd.cs r5 = r4.gn();
        java.util.BitSet r0 = new java.util.BitSet(3);
        r0.set(0, abcd.Abstractao.Hw(r5.get(0).we()));
        r0.set(1, abcd.Abstractao.Hw(r5.get(1).we()));
        r0.set(2, abcd.Abstractao.Hw(r5.get(2).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        if ((r5 instanceof abcd.mo) == true) goto L5;
    L13:
        return false;
    L5:
        if (r0.size() != 3) goto L13;
        if (abcd.Abstractao.Hw(r0.get(0).we()) == false) goto L13;
        if (abcd.Abstractao.Hw(r0.get(1).we()) == false) goto L13;
        if (abcd.Abstractao.Hw(r0.get(2).we()) == false) goto L13;
        return true;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        abcd.cs r5 = r4.gn();
        return r5.get(0).lg() + ", " + r5.get(1).lg() + ", " + r5.get(2).lg();
    }

    @Override
    public int j6() {
        return 2;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return "";
    }

    @Override
    public void j6(abcd.Lt r4, abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        abcd.Abstractao.j6(r4, abcd.Abstractao.j6(r5, r0.get(0).we()), abcd.Abstractao.j6(r0.get(1).we(), r0.get(2).we()));
    }
}
