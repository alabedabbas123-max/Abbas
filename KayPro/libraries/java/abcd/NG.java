package abcd;

class NG extends abcd.GH {
    final abcd.OG J0;
    private final abcd.FE J8;
    private final abcd.wH Ws;
    private long we;

    NG(abcd.OG r1, java.io.InputStream r2, abcd.FE r3, abcd.wH r4) {
        this.J0 = r1;
        this.J8 = r3;
        this.Ws = r4;
        super(r2);
        this.we = -1;
    }

    @Override
    protected java.io.InputStream FH() {
        abcd.FE r0 = this.J8;
        if ((r0 instanceof abcd.OG) == false) goto L5;
        java.io.InputStream r1 = abcd.OG.j6((abcd.OG) r0, this.Ws);
    L7:
        if (this.we == (-1)) goto L9;
    L14:
        return r1;
    L9:
        if ((r1 instanceof abcd.GH) == false) goto L12;
        this.we = ((abcd.GH) r1).DW();
        goto L14
    L12:
        if ((r1 instanceof abcd.JE) == false) goto L14;
        this.we = ((abcd.JE) r1).j6();
        goto L14
    L5:
        r1 = r0.v5();
        goto L7
    }

    @Override
    protected long j6() {
        if (this.we != (-1)) goto L6;
        this.we = this.J8.DW();
    L6:
        return this.we;
    }
}
