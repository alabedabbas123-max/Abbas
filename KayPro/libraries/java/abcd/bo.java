package abcd;

public final class bo extends abcd.Abstractro {
    private final abcd.bs v5;

    public bo(abcd.hs r1, abcd.bs r2) {
        super(r1);
        if (r2 == null) goto L7;
        this.v5 = r2;
        return;
    L7:
        throw new java.lang.NullPointerException("local == null");
    }

    @Override
    public abcd.AbstractVn DW(int r4) {
        return new abcd.bo(VH(), this.v5.DW(r4));
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r3) {
        return new abcd.bo(VH(), this.v5);
    }

    @Override
    protected java.lang.String j6() {
        return this.v5.toString();
    }

    @Override
    protected java.lang.String j6(boolean r2) {
        return "local-end " + abcd.eo.j6(this.v5);
    }

    public abcd.bs we() {
        return this.v5;
    }
}
