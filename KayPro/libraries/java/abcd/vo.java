package abcd;

public final class vo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.vo();
    }

    private vo() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r3) {
        abcd.cs r4 = r3.gn();
        java.util.BitSet r0 = new java.util.BitSet(1);
        r0.set(0, abcd.Abstractao.Hw(r4.get(0).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r4) {
        abcd.cs r0 = r4.gn();
        if ((r4 instanceof abcd.mo) == true) goto L5;
    L9:
        return false;
    L5:
        if (r0.size() != 1) goto L9;
        if (abcd.Abstractao.Hw(r0.get(0).we()) == false) goto L9;
        return true;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r2) {
        return r2.gn().get(0).lg();
    }

    @Override
    public int j6() {
        return 1;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return "";
    }

    @Override
    public void j6(abcd.Lt r3, abcd.AbstractVn r4) {
        abcd.Abstractao.j6(r3, abcd.Abstractao.j6(r4, r4.gn().get(0).we()));
    }
}
