package abcd;

public final class Co extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Co();
    }

    private Co() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r4) {
        abcd.cs r5 = r4.gn();
        java.util.BitSet r0 = new java.util.BitSet(2);
        r0.set(0, abcd.Abstractao.Hw(r5.get(0).we()));
        r0.set(1, abcd.Abstractao.Hw(r5.get(1).we()));
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
        if (abcd.Abstractao.Hw(r0.get(0).we()) == false) goto L21;
        if (abcd.Abstractao.Hw(r0.get(1).we()) == false) goto L21;
        abcd.Abstractms r6 = ((abcd.Tn) r5).we();
        if ((r6 instanceof abcd.Ds) == true) goto L14;
        return false;
    L14:
        abcd.Ds r7 = (abcd.Ds) r6;
        if (r7.J8() == true) goto L17;
    L19:
        return false;
    L17:
        if (abcd.Abstractao.j6(r7.Ws()) == false) goto L19;
        return true;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        return r0.get(0).lg() + ", " + r0.get(1).lg() + ", " + abcd.Abstractao.j6((abcd.Ds) ((abcd.Tn) r5).we());
    }

    @Override
    public int j6() {
        return 2;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return abcd.Abstractao.j6((abcd.Ds) ((abcd.Tn) r1).we(), 8);
    }

    @Override
    public void j6(abcd.Lt r4, abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        int r1 = ((abcd.Ds) ((abcd.Tn) r5).we()).Ws();
        abcd.Abstractao.j6(r4, abcd.Abstractao.j6(r5, r0.get(0).we()), abcd.Abstractao.j6(r0.get(1).we(), r1 & 255));
    }
}
