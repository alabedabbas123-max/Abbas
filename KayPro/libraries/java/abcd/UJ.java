package abcd;

public class UJ extends abcd.TJ {
    private static final byte[] u7 = null;
    private int EQ;
    private int J0;
    private byte[] tp;
    private int we;

    static {
        u7 = new byte[0];
    }

    public UJ() {
        j6(u7);
    }

    private UJ(abcd.UJ r1) {
        super(r1);
    }

    public UJ(byte[] r1, abcd.IE r2, abcd.YD r3) {
        super(r1);
        DW(r2, r3);
    }

    private void Ws() {
        int r0 = this.we;
        int r2 = r0 + 1;
        int r1 = this.tp[r0] - 48;
    L3:
        int r3 = r2 + 1;
        byte r4 = this.tp[r2];
        if (32 == r4) goto L5;
        r1 = (r1 << 3) + (r4 - 48);
        r2 = r3;
        goto L3
    L5:
        this.v5 = r1;
        int r5 = this.VH;
    L6:
        int r6 = r3 + 1;
        byte r7 = this.tp[r3];
        if (r7 == 0) goto L8;
        this.Zo[r5] = r7;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L12
    L13:
        r5 = r5 + 1;
        r3 = r6;
    L12:
        DW(r5);
        this.Zo[r5] = r7;
        goto L13
    L8:
        this.gn = r5;
        this.J0 = r6 + 20;
    }

    public void DW(abcd.IE r2, abcd.YD r3) {
        j6(r2.Hw(r3, 2).j6());
    }

    @Override
    public boolean DW() {
        if (this.we != this.tp.length) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    public void EQ() {
        if (FH() == true) goto L6;
        j6(this.tp);
        return;
    }

    @Override
    public void FH(int r4) {
        if (r4 != 1) goto L8;
        this.EQ = this.we;
        this.we = this.J0;
        if (DW() == true) goto L29;
        Ws();
        return;
    L29:
        return;
    L8:
        int r0 = this.tp.length;
        int r1 = this.J0;
    L9:
        r4 = r4 - 1;
        if (r4 <= 0) goto L18;
        if (r1 == r0) goto L18;
        this.EQ = r1;
    L15:
        if (this.tp[r1] == 0) goto L16;
        r1 = r1 + 1;
        goto L15
    L16:
        r1 = r1 + 21;
    L18:
        if (r4 != 0) goto L24;
        this.we = r1;
        if (DW() == true) goto L30;
        Ws();
        return;
    L30:
        return;
    L24:
        throw new java.lang.ArrayIndexOutOfBoundsException(r4);
    }

    @Override
    public boolean FH() {
        if (this.we != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public abcd.UJ J8() {
        abcd.UJ r0 = this;
    L3:
        int r1 = r0.J0;
        if (r1 != r0.tp.length) goto L10;
        abcd.TJ r2 = r0.DW;
        if (r2 == null) goto L7;
        r0 = (abcd.UJ) r2;
        goto L3
    L7:
        r0.we = r1;
        return r0;
    L10:
        r0.EQ = r0.we;
        r0.we = r1;
        r0.Ws();
        return r0;
    }

    @Override
    public boolean gn() {
        return true;
    }

    @Override
    public abcd.TJ j6(abcd.IE r1) {
        return j6(r1);
    }

    @Override
    public abcd.TJ j6(abcd.IE r1, abcd.uE r2) {
        return j6(r1, r2);
    }

    @Override
    public abcd.UJ j6(abcd.IE r2) {
        return j6(r2, new abcd.uE());
    }

    public final abcd.UJ j6(abcd.IE r2, abcd.YD r3) {
        abcd.UJ r0 = new abcd.UJ(this);
        r0.DW(r2, r3);
        return r0;
    }

    @Override
    public abcd.UJ j6(abcd.IE r3, abcd.uE r4) {
        r4.Hw(u7(), tp());
        if (abcd.AbstractrE.j6.j6(this.v5) == false) goto L7;
        return j6(r3, r4);
    L7:
        throw new abcd.ZC(r4.J8(), "tree");
    }

    @Override
    public void j6(int r7) {
        if (r7 != 1) goto L10;
        int r2 = this.EQ;
        if (r2 < 0) goto L10;
        this.we = r2;
        this.EQ = -1;
        if (DW() == true) goto L30;
        Ws();
        return;
    L30:
        return;
    L10:
        if (r7 <= 0) goto L26;
        int[] r3 = new int[r7 + 1];
        java.util.Arrays.fill(r3, -1);
        int r4 = 0;
    L13:
        if (r4 == this.we) goto L15;
        java.lang.System.arraycopy(r3, 1, r3, 0, r7);
        r3[r7] = r4;
    L22:
        if (this.tp[r4] == 0) goto L23;
        r4 = r4 + 1;
        goto L22
    L23:
        r4 = r4 + 21;
        goto L13
    L15:
        if (r3[1] == (-1)) goto L19;
        this.EQ = r3[0];
        this.we = r3[1];
        Ws();
        return;
    L19:
        throw new java.lang.ArrayIndexOutOfBoundsException(r7);
    L26:
        throw new java.lang.ArrayIndexOutOfBoundsException(r7);
    }

    public void j6(byte[] r2) {
        this.tp = r2;
        this.EQ = -1;
        this.we = 0;
        if (DW() == false) goto L5;
        this.J0 = 0;
        return;
    L5:
        Ws();
    }

    @Override
    public int tp() {
        return this.J0 - 20;
    }

    @Override
    public byte[] u7() {
        return this.tp;
    }
}
