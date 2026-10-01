package abcd;

public abstract class AbstractxO implements abcd.InterfacetO {
    private int DW;
    private long FH;
    private byte[] j6;

    protected AbstractxO() {
        this.j6 = new byte[4];
        this.DW = 0;
    }

    protected AbstractxO(abcd.AbstractxO r5) {
        this.j6 = new byte[r5.j6.length];
        byte[] r0 = r5.j6;
        java.lang.System.arraycopy(r0, 0, this.j6, 0, r0.length);
        this.DW = r5.DW;
        this.FH = r5.FH;
    }

    protected abstract void DW(byte[] r1, int r2);

    public void FH() {
        long r0 = this.FH << 3;
        j6((byte) -128);
    L4:
        if (this.DW == 0) goto L5;
        j6((byte) 0);
        goto L4
    L5:
        j6(r0);
        Hw();
    }

    protected abstract void Hw();

    @Override
    public void j6(byte r5) {
        byte[] r0 = this.j6;
        int r1 = this.DW;
        this.DW = r1 + 1;
        r0[r1] = r5;
        if (this.DW != r0.length) goto L5;
        DW(r0, 0);
        this.DW = 0;
    L5:
        this.FH++;
    }

    protected abstract void j6(long r1);

    @Override
    public void reset() {
        this.FH = 0;
        this.DW = 0;
        int r1 = 0;
    L3:
        byte[] r2 = this.j6;
        if (r1 >= r2.length) goto L5;
        r2[r1] = 0;
        r1 = r1 + 1;
        goto L3
    }

    @Override
    public void update(byte[] r6, int r7, int r8) {
    L3:
        if (this.DW == 0) goto L8;
        if (r8 <= 0) goto L8;
        j6(r6[r7]);
        r7 = r7 + 1;
        r8 = r8 - 1;
    L8:
        if (r8 <= this.j6.length) goto L9;
        DW(r6, r7);
        byte[] r0 = this.j6;
        r7 = r7 + r0.length;
        r8 = r8 - r0.length;
        this.FH += (long) r0.length;
    L9:
        if (r8 <= 0) goto L10;
        j6(r6[r7]);
        r7 = r7 + 1;
        r8 = r8 - 1;
        goto L9
    }
}
