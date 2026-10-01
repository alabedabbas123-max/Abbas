package abcd;

public final class Wo extends abcd.AbstractGp {
    private final abcd.C0418Vo[] Zo;
    private final abcd.Jr v5;

    public Wo(abcd.Jr r5) {
        super(4, j6(r5));
        this.v5 = r5;
        this.Zo = new abcd.C0418Vo[r5.size()];
        java.util.Iterator<abcd.Hr> r6 = r5.lg().iterator();
        int r0 = 0;
    L4:
        if (r6.hasNext() == false) goto L6;
        abcd.Hr r1 = r6.next();
        this.Zo[r0] = new abcd.C0418Vo(r1);
        r0 = r0 + 1;
        goto L4
    }

    private static int j6(abcd.Jr r1) {
        return (r1.size() * 4) + 4;
    L6:
        throw new java.lang.NullPointerException("list == null");
    }

    @Override
    protected int DW(abcd.AbstractGp r2) {
        return this.v5.DW(((abcd.Wo) r2).v5);
    }

    @Override
    protected void DW(abcd.AbstractKp r1, int r2) {
        abcd.C0418Vo.j6(this.Zo);
    }

    @Override
    protected void DW(abcd.jp r7, abcd.Lt r8) {
        boolean r9 = r8.Hw();
        int r0 = this.Zo.length;
        int r2 = 0;
        if (r9 == false) goto L5;
        r8.j6(0, Ws() + " annotation set");
        r8.j6(4, "  size: " + abcd.Yt.gn(r0));
    L5:
        r8.writeInt(r0);
    L6:
        if (r2 >= r0) goto L11;
        int r3 = this.Zo[r2].we();
        if (r9 == false) goto L10;
        r8.j6(4, "  entries[" + java.lang.Integer.toHexString(r2) + "]: " + abcd.Yt.gn(r3));
        this.Zo[r2].j6(r8, "    ");
    L10:
        r8.writeInt(r3);
        r2 = r2 + 1;
        goto L6
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.EQ;
    }

    @Override
    public java.lang.String aM() {
        return this.v5.toString();
    }

    public int hashCode() {
        return this.v5.hashCode();
    }

    @Override
    public void j6(abcd.jp r5) {
        abcd.Fp r6 = r5.j6();
        int r0 = this.Zo.length;
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        abcd.C0418Vo[] r2 = this.Zo;
        r2[r1] = (abcd.C0418Vo) r6.DW(r2[r1]);
        r1 = r1 + 1;
        goto L3
    }
}
