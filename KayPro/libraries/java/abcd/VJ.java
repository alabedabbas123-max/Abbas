package abcd;

public class VJ extends abcd.TJ {
    public VJ() {
    }

    VJ(abcd.TJ r1) {
        super(r1);
        this.gn = this.VH;
    }

    public VJ(abcd.TJ r1, byte[] r2, int r3) {
        super(r1, r2, r3);
        this.gn = r3 - 1;
    }

    @Override
    public boolean DW() {
        return true;
    }

    @Override
    public void EQ() {
    }

    @Override
    public void FH(int r1) {
    }

    @Override
    public boolean FH() {
        return true;
    }

    @Override
    public void J0() {
        abcd.TJ r0 = this.DW;
        if (r0 == null) goto L6;
        r0.J0();
        return;
    }

    @Override
    public boolean gn() {
        return false;
    }

    @Override
    public abcd.TJ j6(abcd.IE r1) {
        return new abcd.VJ(this);
    }

    @Override
    public void j6(int r1) {
    }

    @Override
    public int tp() {
        return 0;
    }

    @Override
    public byte[] u7() {
        return abcd.TJ.j6;
    }

    @Override
    public abcd.yE v5() {
        return abcd.yE.Ws();
    }
}
