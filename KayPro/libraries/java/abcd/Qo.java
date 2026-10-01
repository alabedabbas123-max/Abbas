package abcd;

public final class Qo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Qo();
    }

    private Qo() {
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
        if ((r5 instanceof abcd.Tn) == true) goto L5;
    L11:
        return false;
    L5:
        if (r0.size() != 1) goto L11;
        if (abcd.Abstractao.Hw(r0.get(0).we()) == false) goto L11;
        return ((abcd.Tn) r5).we() instanceof abcd.Cs;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        return r4.gn().get(0).lg() + ", " + abcd.Abstractao.j6((abcd.Ds) ((abcd.Tn) r4).we());
    }

    @Override
    public int j6() {
        return 5;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return abcd.Abstractao.j6((abcd.Ds) ((abcd.Tn) r1).we(), 64);
    }

    @Override
    public void j6(abcd.Lt r5, abcd.AbstractVn r6) {
        abcd.cs r0 = r6.gn();
        long r1 = ((abcd.Cs) ((abcd.Tn) r6).we()).lg();
        abcd.Abstractao.j6(r5, abcd.Abstractao.j6(r6, r0.get(0).we()), r1);
    }
}
