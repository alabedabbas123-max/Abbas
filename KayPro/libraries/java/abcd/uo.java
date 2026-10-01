package abcd;

public final class uo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.uo();
    }

    private uo() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r3) {
        abcd.cs r4 = r3.gn();
        java.util.BitSet r0 = new java.util.BitSet(1);
        r0.set(0, abcd.Abstractao.v5(r4.get(0).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        if ((r5 instanceof abcd.Tn) == true) goto L5;
        return false;
    L5:
        if (r0.size() == 1) goto L7;
        return false;
    L7:
        if (abcd.Abstractao.v5(r0.get(0).we()) == false) goto L22;
        abcd.Abstractms r6 = ((abcd.Tn) r5).we();
        if ((r6 instanceof abcd.Ds) == true) goto L12;
        return false;
    L12:
        abcd.Ds r7 = (abcd.Ds) r6;
        if (r7.J8() == true) goto L15;
        return false;
    L15:
        if (abcd.Abstractao.DW(r7.Ws()) == false) goto L21;
        return true;
    L21:
        return false;
    L22:
        return false;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        return r4.gn().get(0).lg() + ", " + abcd.Abstractao.j6((abcd.Ds) ((abcd.Tn) r4).we());
    }

    @Override
    public int j6() {
        return 1;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return abcd.Abstractao.j6((abcd.Ds) ((abcd.Tn) r1).we(), 4);
    }

    @Override
    public void j6(abcd.Lt r4, abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        int r1 = ((abcd.Ds) ((abcd.Tn) r5).we()).Ws();
        abcd.Abstractao.j6(r4, abcd.Abstractao.j6(r5, abcd.Abstractao.DW(r0.get(0).we(), r1 & 15)));
    }
}
