package abcd;

public abstract class CF extends abcd.AbstractwF {
    private abcd.mG gn;

    protected CF(abcd.UE r1) {
        super(r1);
    }

    public void DW(abcd.YD r2) {
        if (r2 == null) goto L4;
        this.gn = this.FH.gn(r2);
        return;
    L4:
        this.gn = null;
    }

    @Override
    public boolean j6(abcd.YD... r3) {
        if (r3.length == 2) goto L7;
        return false;
    L7:
        return super.j6(r3);
    }

    protected abcd.TJ v5() {
        abcd.mG r0 = this.gn;
        if (r0 == null) goto L7;
        return j6(r0);
    L7:
        return DW(0, 1);
    }
}
