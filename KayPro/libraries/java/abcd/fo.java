package abcd;

public final class fo extends abcd.Abstractqo {
    public fo(abcd.hs r2) {
        super(r2, abcd.cs.FH);
    }

    @Override
    public int DW() {
        return FH() & 1;
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r2) {
        return new abcd.fo(VH());
    }

    @Override
    protected java.lang.String j6() {
        return null;
    }

    @Override
    protected java.lang.String j6(boolean r1) {
        if (DW() != 0) goto L6;
        return null;
    L6:
        return "nop // spacer";
    }

    @Override
    public void j6(abcd.Lt r2) {
        if (DW() == 0) goto L6;
        r2.writeShort(abcd.Abstractao.j6(0, 0));
        return;
    }
}
