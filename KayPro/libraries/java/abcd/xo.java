package abcd;

public final class xo extends abcd.Abstractao {
    public static final abcd.Abstractao DW = null;

    static {
        DW = new abcd.xo();
    }

    private xo() {
    }

    @Override
    public boolean VH(abcd.AbstractVn r2) {
        if ((r2 instanceof abcd.po) == true) goto L5;
        return false;
    L5:
        if (r2.gn().size() != 0) goto L15;
        abcd.po r3 = (abcd.po) r2;
        if (r3.Ws() == true) goto L14;
        return true;
    L14:
        return j6(r3);
    L15:
        return false;
    }

    @Override
    public java.lang.String Zo(abcd.AbstractVn r1) {
        return abcd.Abstractao.DW(r1);
    }

    @Override
    public int j6() {
        return 2;
    }

    @Override
    public java.lang.String j6(abcd.AbstractVn r1, boolean r2) {
        return abcd.Abstractao.j6(r1);
    }

    @Override
    public void j6(abcd.Lt r3, abcd.AbstractVn r4) {
        int r0 = ((abcd.po) r4).J8();
        abcd.Abstractao.j6(r3, abcd.Abstractao.j6(r4, 0), (short) r0);
    }

    @Override
    public boolean j6(abcd.po r1) {
        int r2 = r1.J8();
        if (r2 != 0) goto L5;
    L7:
        return false;
    L5:
        if (abcd.Abstractao.FH(r2) == false) goto L7;
        return true;
    }
}
