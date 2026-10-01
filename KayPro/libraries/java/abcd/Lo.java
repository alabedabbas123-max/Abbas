package abcd;

public final class Lo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Lo();
    }

    private Lo() {
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
        if ((r4 instanceof abcd.po) == true) goto L5;
    L10:
        return false;
    L5:
        if (r0.size() != 1) goto L10;
        if (abcd.Abstractao.Hw(r0.get(0).we()) == false) goto L10;
        return true;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        return r4.gn().get(0).lg() + ", " + abcd.Abstractao.DW(r4);
    }

    @Override
    public int j6() {
        return 3;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return abcd.Abstractao.j6(r1);
    }

    @Override
    public void j6(abcd.Lt r4, abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        int r1 = ((abcd.po) r5).J8();
        abcd.Abstractao.j6(r4, abcd.Abstractao.j6(r5, r0.get(0).we()), r1);
    }

    @Override
    public boolean j6(abcd.po r1) {
        return true;
    }
}
