package abcd;

public class mG extends abcd.AbstractiG {
    protected mG(abcd.YD r1) {
        super(r1);
    }

    @Override
    public final int aM() {
        return 2;
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
