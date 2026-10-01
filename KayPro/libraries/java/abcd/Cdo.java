package abcd;

public final class Cdo extends abcd.Abstractro {
    private final abcd.ds v5;

    public Cdo(abcd.hs r1, abcd.ds r2) {
        super(r1);
        if (r2 == null) goto L7;
        this.v5 = r2;
        return;
    L7:
        throw new java.lang.NullPointerException("locals == null");
    }

    @Override
    public abcd.AbstractVn DW(int r4) {
        return new abcd.Cdo(VH(), this.v5.DW(r4));
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r3) {
        return new abcd.Cdo(VH(), this.v5);
    }

    @Override
    protected java.lang.String j6() {
        return this.v5.toString();
    }

    @Override
    protected java.lang.String j6(boolean r5) {
        int r6 = this.v5.size();
        int r0 = this.v5.lg();
        java.lang.StringBuffer r1 = new java.lang.StringBuffer((r6 * 40) + 100);
        r1.append("local-snapshot");
        int r7 = 0;
    L3:
        if (r7 >= r0) goto L9;
        abcd.bs r2 = this.v5.get(r7);
        if (r2 == null) goto L7;
        r1.append("\n  ");
        r1.append(abcd.eo.j6(r2));
    L7:
        r7 = r7 + 1;
        goto L3
    L9:
        return r1.toString();
    }

    public abcd.ds we() {
        return this.v5;
    }
}
