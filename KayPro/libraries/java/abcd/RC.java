package abcd;

public class RC extends abcd.TJ {
    private final int EQ;
    private final byte[] J0;
    protected int J8;
    protected abcd.QC QX;
    private int Ws;
    protected abcd.TC XL;
    private final abcd.TC tp;
    protected final abcd.KC u7;
    private final int we;

    public RC(abcd.KC r2) {
        this.u7 = r2;
        this.tp = r2.j6(true);
        this.EQ = 0;
        this.we = this.tp.DW();
        this.J0 = new byte[20];
        if (DW() == true) goto L6;
        Ws();
        return;
    }

    RC(abcd.RC r3, abcd.TC r4) {
        super(r3, r3.Zo, r3.gn + 1);
        this.u7 = r3.u7;
        this.tp = r4;
        this.EQ = r3.J8;
        this.we = this.EQ + this.tp.DW();
        this.J0 = r3.J0;
        this.J8 = r3.J8;
        Ws();
    }

    private void Ws() {
        this.QX = this.u7.j6(this.J8);
        byte[] r0 = this.QX.Hw;
        if (this.Ws == this.tp.j6()) goto L11;
        abcd.TC r1 = this.tp.j6(this.Ws);
        if (r1.j6(r0, this.VH, r0.length) == false) goto L11;
        this.XL = r1;
        this.Ws++;
        if (r1.Hw() == false) goto L9;
        r1.FH().DW(this.J0, 0);
    L9:
        this.v5 = abcd.AbstractrE.j6.DW();
        this.Zo = r0;
        this.gn = this.VH + r1.v5();
        return;
    L11:
        this.v5 = this.QX.Zo();
        this.Zo = r0;
        this.gn = r0.length;
        this.XL = null;
    }

    @Override
    public boolean DW() {
        if (this.J8 != this.we) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    public void EQ() {
        if (FH() == true) goto L8;
        this.J8 = this.EQ;
        if (DW() == true) goto L9;
        Ws();
        return;
    L9:
        return;
    }

    @Override
    public void FH(int r3) {
    L2:
        r3 = r3 - 1;
        if (r3 < 0) goto L11;
        abcd.TC r0 = this.XL;
        if (r0 == null) goto L8;
        this.J8 += r0.DW();
    L10:
        if (DW() == true) goto L15;
        Ws();
        goto L2
    L15:
        return;
    L8:
        this.J8++;
        goto L10
    }

    @Override
    public boolean FH() {
        if (this.J8 != this.EQ) goto L6;
        return true;
    L6:
        return false;
    }

    public abcd.QC J8() {
        if (this.XL == null) goto L7;
        return null;
    L7:
        return this.QX;
    }

    @Override
    public boolean gn() {
        abcd.TC r0 = this.XL;
        if (r0 == null) goto L7;
        return r0.Hw();
    L7:
        if (this.QX == null) goto L10;
        return true;
    L10:
        return false;
    }

    @Override
    public abcd.TJ j6(abcd.IE r3) {
        abcd.TC r4 = this.XL;
        if (r4 == null) goto L7;
        return new abcd.RC(this, r4);
    L7:
        throw new abcd.ZC(v5(), "tree");
    }

    @Override
    public abcd.VJ j6() {
        byte[] r0 = new byte[java.lang.Math.max(this.gn + 1, 128)];
        java.lang.System.arraycopy(this.Zo, 0, r0, 0, this.gn);
        int r1 = this.gn;
        r0[r1] = 47;
        return new abcd.VJ(this, r0, r1 + 1);
    }

    @Override
    public void j6(int r3) {
    L2:
        r3 = r3 - 1;
        if (r3 < 0) goto L4;
        if (this.XL == null) goto L8;
        this.Ws--;
    L8:
        this.J8--;
        Ws();
        abcd.TC r0 = this.XL;
        if (r0 == null) goto L2;
        this.J8 -= r0.DW() - 1;
        goto L2
    }

    @Override
    public int tp() {
        if (this.XL == null) goto L5;
        return 0;
    L5:
        abcd.QC r0 = this.QX;
        if (r0 != null) goto L8;
        return 0;
    L8:
        return r0.u7();
    }

    @Override
    public byte[] u7() {
        abcd.TC r0 = this.XL;
        if (r0 != null) goto L5;
        abcd.QC r1 = this.QX;
        if (r1 == null) goto L14;
        return r1.gn();
    L14:
        return abcd.TJ.j6;
    L5:
        if (r0.Hw() == false) goto L8;
        return this.J0;
    L8:
        return abcd.TJ.j6;
    }
}
