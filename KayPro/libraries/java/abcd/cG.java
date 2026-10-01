package abcd;

public class cG extends abcd.AbstractiG {
    protected cG(abcd.YD r1) {
        super(r1);
    }

    @Override
    public final int aM() {
        return 3;
    }

    @Override
    void j6(abcd.qG r2) {
        if (r2.DW.DW(this) == false) goto L7;
        this.EQ |= 1;
        return;
    L7:
        throw new abcd.fD(this, aM());
    }
}
