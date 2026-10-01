package abcd;

public final class Do extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Do();
    }

    private Do() {
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
        if ((r5 instanceof abcd.Tn) == true) goto L5;
    L21:
        return false;
    L5:
        if (r0.size() != 2) goto L21;
        if (abcd.Abstractao.v5(r0.get(0).we()) == false) goto L21;
        if (abcd.Abstractao.v5(r0.get(1).we()) == false) goto L21;
        abcd.Tn r6 = (abcd.Tn) r5;
        if (abcd.Abstractao.Zo(r6.J0()) == true) goto L14;
        return false;
    L14:
        abcd.Abstractms r7 = r6.we();
        if ((r7 instanceof abcd.Ks) == false) goto L17;
        return true;
    L17:
        if ((r7 instanceof abcd.ws) == true) goto L23;
        return false;
    L23:
        return true;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        return r0.get(0).lg() + ", " + r0.get(1).lg() + ", " + abcd.Abstractao.v5(r5);
    }

    @Override
    public int j6() {
        return 2;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        if (r2 == true) goto L4;
        return "";
    L4:
        return abcd.Abstractao.Hw(r1);
    }

    @Override
    public void j6(abcd.Lt r5, abcd.AbstractVn r6) {
        abcd.cs r0 = r6.gn();
        int r1 = ((abcd.Tn) r6).J0();
        abcd.Abstractao.j6(r5, abcd.Abstractao.j6(r6, abcd.Abstractao.DW(r0.get(0).we(), r0.get(1).we())), (short) r1);
    }
}
