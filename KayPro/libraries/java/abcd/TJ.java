package abcd;

public abstract class TJ {
    protected static final byte[] j6 = null;
    final abcd.TJ DW;
    abcd.TJ FH;
    int Hw;
    protected final int VH;
    protected byte[] Zo;
    protected int gn;
    protected int v5;

    static {
        j6 = new byte[20];
    }

    protected TJ() {
        this.DW = null;
        this.Zo = new byte[128];
        this.VH = 0;
    }

    protected TJ(abcd.TJ r4) {
        this.DW = r4;
        this.Zo = r4.Zo;
        this.VH = r4.gn + 1;
        this.Zo[this.VH - 1] = 47;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
        return;
    L5:
        DW(r4.gn);
        this.Zo[this.VH - 1] = 47;
    }

    protected TJ(abcd.TJ r1, byte[] r2, int r3) {
        this.DW = r1;
        this.Zo = r2;
        this.VH = r3;
    }

    protected TJ(byte[] r4) {
        this.DW = null;
        if (r4 != null) goto L5;
    L10:
        this.Zo = new byte[128];
        this.VH = 0;
        return;
    L5:
        if (r4.length <= 0) goto L10;
        this.gn = r4.length;
        this.Zo = new byte[java.lang.Math.max(128, this.gn + 1)];
        java.lang.System.arraycopy(r4, 0, this.Zo, 0, this.gn);
        byte[] r5 = this.Zo;
        int r0 = this.gn;
        if (r5[r0 - 1] == 47) goto L9;
        this.gn = r0 + 1;
        r5[r0] = 47;
    L9:
        this.VH = this.gn;
    }

    private void DW(int r3, int r4) {
        byte[] r0 = this.Zo;
        byte[] r5 = new byte[r3];
        java.lang.System.arraycopy(r0, 0, r5, 0, r4);
        abcd.TJ r6 = this;
    L3:
        if (r6 == null) goto L8;
        if (r6.Zo != r0) goto L11;
        r6.Zo = r5;
        r6 = r6.DW;
        goto L3
    L11:
        return;
    }

    private static int Hw(int r1) {
        if (abcd.AbstractrE.j6.j6(r1) == false) goto L5;
        return 47;
    L5:
        return 0;
    }

    private static int j6(abcd.TJ r3, abcd.TJ r4) {
    L2:
        abcd.TJ r0 = r3.DW;
        r4 = r4.DW;
        if (r0 == null) goto L11;
        if (r4 == null) goto L16;
        if (r0.FH == r4.FH) goto L9;
        r3 = r0;
        goto L2
    L9:
        return r3.VH;
    L16:
        return 0;
    L11:
        return 0;
    }

    private int j6(byte[] r5, int r6, int r7, int r8, int r9) {
        byte[] r0 = this.Zo;
        int r1 = this.gn;
    L3:
        if (r9 >= r1) goto L10;
        if (r6 >= r7) goto L10;
        int r2 = (r0[r9] & 255) - (r5[r6] & 255);
        if (r2 != 0) goto L8;
        r9 = r9 + 1;
        r6 = r6 + 1;
        goto L3
    L8:
        return r2;
    L10:
        if (r9 >= r1) goto L14;
        int r10 = r0[r9] & 255;
        int r11 = Hw(r8);
    L13:
        return r10 - r11;
    L14:
        if (r6 < r7) goto L16;
        r10 = Hw(this.v5);
        r11 = Hw(r8);
        goto L13
    L16:
        return Hw(this.v5) - (r5[r6] & 255);
    }

    public int DW(abcd.TJ r2) {
        return j6(r2, r2.v5);
    }

    protected void DW(int r2) {
        DW(this.Zo.length << 1, r2);
    }

    public abstract boolean DW();

    public void EQ() {
    L3:
        if (FH() == true) goto L4;
        j6(1);
        goto L3
    }

    public abstract void FH(int r1);

    public abstract boolean FH();

    public abcd.AbstractrE Hw() {
        return abcd.AbstractrE.DW(this.v5);
    }

    public void J0() {
    }

    public int VH() {
        return this.v5;
    }

    public java.lang.String Zo() {
        return abcd.YJ.DW(this);
    }

    public abstract boolean gn();

    int j6(abcd.TJ r7, int r8) {
        int r5 = j6(this, r7);
        return j6(r7.Zo, r5, r7.gn, r8, r5);
    }

    public int j6(byte[] r7, int r8, int r9, int r10) {
        return j6(r7, r8, r9, r10, 0);
    }

    public abstract abcd.TJ j6(abcd.IE r1);

    public abcd.TJ j6(abcd.IE r1, abcd.uE r2) {
        return j6(r1);
    }

    public abcd.VJ j6() {
        return new abcd.VJ(this);
    }

    public abstract void j6(int r1);

    protected void j6(int r3, int r4) {
        byte[] r0 = this.Zo;
        if (r0.length < r3) goto L5;
        return;
    L5:
        int r1 = r0.length;
    L6:
        if (r1 >= r3) goto L10;
        if (r1 <= 0) goto L10;
        r1 = r1 << 1;
    L10:
        DW(r1, r4);
    }

    public void j6(abcd.uE r3) {
        r3.Hw(u7(), tp());
    }

    public boolean j6(abcd.TJ r4) {
        return abcd.yE.j6(u7(), tp(), r4.u7(), r4.tp());
    }

    public abstract int tp();

    public abstract byte[] u7();

    public abcd.yE v5() {
        return abcd.yE.Hw(u7(), tp());
    }

    public void we() {
        FH(1);
    }
}
