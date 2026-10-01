package abcd;

public final class Bo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Bo();
    }

    private Bo() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r3) {
        abcd.cs r4 = r3.gn();
        java.util.BitSet r0 = new java.util.BitSet(1);
        r0.set(0, abcd.Abstractao.Hw(r4.get(0).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        if ((r5 instanceof abcd.po) == true) goto L5;
    L13:
        return false;
    L5:
        if (r0.size() != 1) goto L13;
        if (abcd.Abstractao.Hw(r0.get(0).we()) == false) goto L13;
        abcd.po r6 = (abcd.po) r5;
        if (r6.Ws() == true) goto L12;
        return true;
    L12:
        return j6(r6);
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        return r4.gn().get(0).lg() + ", " + abcd.Abstractao.DW(r4);
    }

    @Override
    public int j6() {
        return 2;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return abcd.Abstractao.j6(r1);
    }

    @Override
    public void j6(abcd.Lt r4, abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        int r1 = ((abcd.po) r5).J8();
        abcd.Abstractao.j6(r4, abcd.Abstractao.j6(r5, r0.get(0).we()), (short) r1);
    }

    @Override
    public boolean j6(abcd.po r1) {
        int r2 = r1.J8();
        if (r2 != 0) goto L5;
    L7:
        return false;
    L5:
        if (abcd.Abstractao.FH(r2) == false) goto L7;
        return true;
    }
}
