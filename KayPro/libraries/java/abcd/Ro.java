package abcd;

public final class Ro extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.Ro();
    }

    private Ro() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r4) {
        abcd.cs r5 = r4.gn();
        java.util.BitSet r0 = new java.util.BitSet(2);
        r0.set(0, abcd.Abstractao.Zo(r5.get(0).we()));
        r0.set(1, abcd.Abstractao.Zo(r5.get(1).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r5) {
        if (abcd.Abstractao.j6 == true) goto L5;
        return false;
    L5:
        abcd.cs r0 = r5.gn();
        if ((r5 instanceof abcd.Tn) == true) goto L8;
        return false;
    L8:
        if (r0.size() == 2) goto L10;
        return false;
    L10:
        if (abcd.Abstractao.Zo(r0.get(0).we()) == true) goto L12;
        return false;
    L12:
        if (abcd.Abstractao.Zo(r0.get(1).we()) == false) goto L24;
        abcd.Abstractms r6 = ((abcd.Tn) r5).we();
        if ((r6 instanceof abcd.Ks) == false) goto L17;
    L18:
        return true;
    L17:
        if ((r6 instanceof abcd.ws) == true) goto L18;
        return false;
    L24:
        return false;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r5) {
        abcd.cs r0 = r5.gn();
        return r0.get(0).lg() + ", " + r0.get(1).lg() + ", " + abcd.Abstractao.v5(r5);
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
        abcd.Abstractao.j6(r5, abcd.Abstractao.gn(r6), r1, (short) r0.get(0).we(), (short) r0.get(1).we());
    }
}
