package abcd;

public final class wo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.wo();
    }

    private wo() {
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
    public boolean VH(abcd.AbstractVn r6) {
        if ((r6 instanceof abcd.mo) == true) goto L5;
        return false;
    L5:
        abcd.cs r7 = r6.gn();
        int r0 = r7.size();
        if (r0 != 2) goto L8;
        abcd.bs r1 = r7.get(0);
        abcd.bs r2 = r7.get(1);
    L15:
        if (abcd.Abstractao.v5(r1.we()) == true) goto L17;
        return false;
    L17:
        if (abcd.Abstractao.v5(r2.we()) == false) goto L21;
        return true;
    L21:
        return false;
    L8:
        if (r0 == 3) goto L10;
        return false;
    L10:
        r1 = r7.get(1);
        r2 = r7.get(2);
        if (r1.we() == r7.get(0).we()) goto L15;
        return false;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        abcd.cs r5 = r4.gn();
        int r0 = r5.size();
        return r5.get(r0 - 2).lg() + ", " + r5.get(r0 - 1).lg();
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
    public void j6(abcd.Lt r4, abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        int r1 = r0.size();
        abcd.Abstractao.j6(r4, abcd.Abstractao.j6(r5, abcd.Abstractao.DW(r0.get(r1 - 2).we(), r0.get(r1 - 1).we())));
    }
}
