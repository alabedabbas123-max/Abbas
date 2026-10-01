package abcd;

public final class Jo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Jo();
    }

    private Jo() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r6) {
        abcd.cs r7 = r6.gn();
        int r0 = r7.size();
        java.util.BitSet r1 = new java.util.BitSet(r0);
        boolean r3 = abcd.Abstractao.Hw(r7.get(0).we());
        if (r0 != 1) goto L6;
        r1.set(0, r3);
    L8:
        return r1;
    L6:
        if (r7.get(0).we() != r7.get(1).we()) goto L8;
        r1.set(0, r3);
        r1.set(1, r3);
        goto L8
    }

    @Override
    public boolean VH(abcd.AbstractVn r6) {
        if ((r6 instanceof abcd.Tn) == true) goto L5;
        return false;
    L5:
        abcd.cs r0 = r6.gn();
        int r2 = r0.size();
        if (r2 != 1) goto L8;
        abcd.bs r3 = r0.get(0);
    L15:
        if (abcd.Abstractao.Hw(r3.we()) == true) goto L17;
        return false;
    L17:
        abcd.Abstractms r7 = ((abcd.Tn) r6).we();
        if ((r7 instanceof abcd.Ks) == false) goto L20;
    L23:
        return true;
    L20:
        if ((r7 instanceof abcd.ws) == true) goto L23;
        if ((r7 instanceof abcd.Js) == true) goto L23;
        return false;
    L8:
        if (r2 == 2) goto L10;
        return false;
    L10:
        r3 = r0.get(0);
        if (r3.we() == r0.get(1).we()) goto L15;
        return false;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        return r4.gn().get(0).lg() + ", " + abcd.Abstractao.v5(r4);
    }

    @Override
    public int j6() {
        return 3;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        if (r2 == true) goto L4;
        return "";
    L4:
        return abcd.Abstractao.Hw(r1);
    }

    @Override
    public void j6(abcd.Lt r4, abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        int r1 = ((abcd.Tn) r5).J0();
        abcd.Abstractao.j6(r4, abcd.Abstractao.j6(r5, r0.get(0).we()), r1);
    }
}
