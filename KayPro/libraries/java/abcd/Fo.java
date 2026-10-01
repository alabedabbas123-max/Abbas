package abcd;

public final class Fo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Fo();
    }

    private Fo() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r4) {
        abcd.cs r5 = r4.gn();
        java.util.BitSet r0 = new java.util.BitSet(2);
        r0.set(0, abcd.Abstractao.v5(r5.get(0).we()));
        r0.set(1, abcd.Abstractao.v5(r5.get(1).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        if ((r5 instanceof abcd.po) == true) goto L5;
    L15:
        return false;
    L5:
        if (r0.size() != 2) goto L15;
        if (abcd.Abstractao.v5(r0.get(0).we()) == false) goto L15;
        if (abcd.Abstractao.v5(r0.get(1).we()) == false) goto L15;
        abcd.po r6 = (abcd.po) r5;
        if (r6.Ws() == true) goto L14;
        return true;
    L14:
        return j6(r6);
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        return r0.get(0).lg() + ", " + r0.get(1).lg() + ", " + abcd.Abstractao.DW(r5);
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
    public void j6(abcd.Lt r5, abcd.AbstractVn r6) {
        abcd.cs r0 = r6.gn();
        int r1 = ((abcd.po) r6).J8();
        abcd.Abstractao.j6(r5, abcd.Abstractao.j6(r6, abcd.Abstractao.DW(r0.get(0).we(), r0.get(1).we())), (short) r1);
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
