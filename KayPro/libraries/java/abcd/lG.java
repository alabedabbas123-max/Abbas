package abcd;

public class lG extends abcd.AbstractiG {
    private byte[] J0;
    private java.lang.String J8;
    private abcd.AbstractiG we;

    protected lG(abcd.YD r1) {
        super(r1);
    }

    @Override
    public final int aM() {
        return 4;
    }

    public final abcd.AbstractiG j3() {
        return this.we;
    }

    @Override
    void j6(abcd.qG r2) {
        j6(r2, r2.j6(this));
    }

    void j6(abcd.qG r5, byte[] r6) {
        abcd.EK r0 = new abcd.EK();
        r0.j6 = 53;
        int r1 = abcd.hE.j6(this, r6, (byte) 10, r0);
        r5.FH.v5(r6, 7);
        this.we = r5.j6(r5.FH, r1);
        int r2 = r0.j6 + 4;
        r0.j6 = r2;
        this.J8 = abcd.IK.j6(abcd.hE.Zo, r6, r2, abcd.IK.Zo(r6, r2) - 1);
        if (r5.u7() == false) goto L5;
        this.J0 = r6;
    L5:
        this.EQ |= 1;
    }
}
