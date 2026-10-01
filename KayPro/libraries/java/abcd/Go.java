package abcd;

public final class Go extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Go();
    }

    private Go() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r4) {
        abcd.cs r5 = r4.gn();
        java.util.BitSet r0 = new java.util.BitSet(2);
        r0.set(0, abcd.Abstractao.Hw(r5.get(0).we()));
        r0.set(1, abcd.Abstractao.Zo(r5.get(1).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        if ((r5 instanceof abcd.mo) == true) goto L5;
    L11:
        return false;
    L5:
        if (r0.size() != 2) goto L11;
        if (abcd.Abstractao.Hw(r0.get(0).we()) == false) goto L11;
        if (abcd.Abstractao.Zo(r0.get(1).we()) == false) goto L11;
        return true;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r3) {
        abcd.cs r4 = r3.gn();
        return r4.get(0).lg() + ", " + r4.get(1).lg();
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
    public void j6(abcd.Lt r3, abcd.AbstractVn r4) {
        abcd.cs r0 = r4.gn();
        abcd.Abstractao.j6(r3, abcd.Abstractao.j6(r4, r0.get(0).we()), (short) r0.get(1).we());
    }
}
