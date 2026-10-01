package abcd;

public final class No extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.No();
    }

    private No() {
    }

    private static abcd.cs Hw(abcd.cs r7) {
        int r0 = v5(r7);
        int r1 = r7.size();
        if (r0 != r1) goto L5;
        return r7;
    L5:
        abcd.cs r2 = new abcd.cs(r0);
        int r3 = 0;
        int r4 = 0;
    L6:
        if (r3 >= r1) goto L12;
        abcd.bs r5 = r7.get(r3);
        r2.j6(r4, r5);
        if (r5.Hw() != 2) goto L10;
        r2.j6(r4 + 1, abcd.bs.j6(r5.we() + 1, abcd.Qs.tp));
        r4 = r4 + 2;
    L11:
        r3 = r3 + 1;
        goto L6
    L10:
        r4 = r4 + 1;
        goto L11
    L12:
        r2.we();
        return r2;
    }

    private static int v5(abcd.cs r7) {
        int r0 = r7.size();
        if (r0 <= 5) goto L5;
        return -1;
    L5:
        int r3 = 0;
        int r4 = 0;
    L6:
        if (r3 >= r0) goto L11;
        abcd.bs r5 = r7.get(r3);
        r4 = r4 + r5.Hw();
        if (abcd.Abstractao.v5((r5.we() + r5.Hw()) - 1) == false) goto L9;
        r3 = r3 + 1;
        goto L6
    L9:
        return -1;
    L11:
        if (r4 <= 5) goto L13;
        return -1;
    L13:
        return r4;
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r6) {
        abcd.cs r7 = r6.gn();
        int r0 = r7.size();
        java.util.BitSet r1 = new java.util.BitSet(r0);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        abcd.bs r3 = r7.get(r2);
        r1.set(r2, abcd.Abstractao.v5((r3.we() + r3.Hw()) - 1));
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    @Override
    public boolean VH(abcd.AbstractVn r4) {
        if ((r4 instanceof abcd.Tn) == true) goto L5;
        return false;
    L5:
        abcd.Tn r5 = (abcd.Tn) r4;
        if (abcd.Abstractao.Zo(r5.J0()) == true) goto L8;
        return false;
    L8:
        abcd.Abstractms r0 = r5.we();
        if ((r0 instanceof abcd.Gs) == true) goto L14;
        if ((r0 instanceof abcd.Ks) == true) goto L14;
        return false;
    L14:
        if (v5(r5.gn()) < 0) goto L17;
        return true;
    L17:
        return false;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r3) {
        return abcd.Abstractao.DW(Hw(r3.gn())) + ", " + abcd.Abstractao.v5(r3);
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
    public void j6(abcd.Lt r10, abcd.AbstractVn r11) {
        int r0 = ((abcd.Tn) r11).J0();
        abcd.cs r1 = Hw(r11.gn());
        int r2 = r1.size();
        int r3 = 0;
        if (r2 <= 0) goto L5;
        int r4 = r1.get(0).we();
    L7:
        if (r2 <= 1) goto L9;
        int r5 = r1.get(1).we();
    L11:
        if (r2 <= 2) goto L13;
        int r6 = r1.get(2).we();
    L15:
        if (r2 <= 3) goto L17;
        int r7 = r1.get(3).we();
    L19:
        if (r2 <= 4) goto L21;
        r3 = r1.get(4).we();
    L21:
        abcd.Abstractao.j6(r10, abcd.Abstractao.j6(r11, abcd.Abstractao.DW(r3, r2)), (short) r0, abcd.Abstractao.j6(r4, r5, r6, r7));
        return;
    L17:
        r7 = 0;
        goto L19
    L13:
        r6 = 0;
        goto L15
    L9:
        r5 = 0;
        goto L11
    L5:
        r4 = 0;
        goto L7
    }
}
