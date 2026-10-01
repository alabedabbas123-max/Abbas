package abcd;

public final class zo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.zo();
    }

    private zo() {
    }

    @Override
    public java.util.BitSet FH(abcd.AbstractVn r3) {
        abcd.cs r4 = r3.gn();
        java.util.BitSet r0 = new java.util.BitSet(1);
        r0.set(0, abcd.Abstractao.Hw(r4.get(0).we()));
        return r0;
    }

    @Override
    public boolean VH(abcd.AbstractVn r7) {
        abcd.cs r0 = r7.gn();
        if ((r7 instanceof abcd.Tn) == true) goto L5;
        return false;
    L5:
        if (r0.size() == 1) goto L7;
        return false;
    L7:
        if (abcd.Abstractao.Hw(r0.get(0).we()) == false) goto L26;
        abcd.Abstractms r8 = ((abcd.Tn) r7).we();
        if ((r8 instanceof abcd.Ds) == true) goto L12;
        return false;
    L12:
        abcd.Ds r9 = (abcd.Ds) r8;
        if (r0.get(0).Hw() != 1) goto L19;
        if ((r9.Ws() & 65535) != 0) goto L22;
        return true;
    L22:
        return false;
    L19:
        if ((r9.lg() & 281474976710655L) != 0) goto L25;
        return true;
    L25:
        return false;
    L26:
        return false;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r4) {
        return r4.gn().get(0).lg() + ", " + abcd.Abstractao.j6((abcd.Ds) ((abcd.Tn) r4).we());
    }

    @Override
    public int j6() {
        return 2;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r2, boolean r3) {
        abcd.cs r4 = r2.gn();
        abcd.Ds r5 = (abcd.Ds) ((abcd.Tn) r2).we();
        if (r4.get(0).Hw() != 1) goto L5;
        int r6 = 32;
    L7:
        return abcd.Abstractao.j6(r5, r6);
    L5:
        r6 = 64;
        goto L7
    }

    @Override
    public void j6(abcd.Lt r6, abcd.AbstractVn r7) {
        abcd.cs r0 = r7.gn();
        abcd.Ds r1 = (abcd.Ds) ((abcd.Tn) r7).we();
        if (r0.get(0).Hw() != 1) goto L5;
        int r2 = r1.Ws() >>> 16;
    L6:
        short r8 = abcd.Abstractao.j6(r7, r0.get(0).we());
        abcd.Abstractao.j6(r6, r8, (short) r2);
        return;
    L5:
        r2 = (int) (r1.lg() >>> 48);
        goto L6
    }
}
