package abcd;

public final class So extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.So();
    }

    private So() {
    }

    @Override
    public boolean VH(abcd.AbstractVn r4) {
        if (abcd.Abstractao.j6 == true) goto L6;
        return false;
    L6:
        if ((r4 instanceof abcd.Tn) == true) goto L8;
        return false;
    L8:
        abcd.Tn r5 = (abcd.Tn) r4;
        abcd.Abstractms r0 = r5.we();
        if ((r0 instanceof abcd.Gs) == false) goto L11;
    L13:
        abcd.cs r6 = r5.gn();
        r6.size();
        if (r6.size() != 0) goto L16;
    L21:
        return true;
    L16:
        if (abcd.Abstractao.j6(r6) == true) goto L18;
        return false;
    L18:
        if (abcd.Abstractao.Zo(r6.get(0).we()) == true) goto L20;
        return false;
    L20:
        if (abcd.Abstractao.Zo(r6.rN()) == true) goto L21;
        return false;
    L11:
        if ((r0 instanceof abcd.Ks) == true) goto L13;
        return false;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r3) {
        return abcd.Abstractao.FH(r3.gn()) + ", " + abcd.Abstractao.v5(r3);
    }

    @Override
    public int j6() {
        return 5;
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
        int r3 = 0;
        if (r0.size() == 0) goto L6;
        r3 = r0.get(0).we();
    L6:
        int r2 = r0.rN();
        abcd.Abstractao.j6(r5, abcd.Abstractao.gn(r6), r1, (short) r2, (short) r3);
    }
}
