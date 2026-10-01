package abcd;

class OG extends abcd.FE {
    private long DW;
    private final long FH;
    private final long Hw;
    private final abcd.GG VH;
    private final abcd.aH Zo;
    private int j6;
    private final int v5;

    OG(long r3, long r5, int r7, abcd.aH r8, abcd.GG r9) {
        this.j6 = -1;
        this.DW = -1;
        this.FH = r3;
        this.Hw = r5;
        this.v5 = r7;
        this.Zo = r8;
        this.VH = r9;
    }

    private abcd.yE Zo() {
        return this.Zo.j6(this.FH);
    }

    static abcd.GG j6(abcd.OG r0) {
        return r0.VH;
    }

    static java.io.InputStream j6(abcd.OG r0, abcd.wH r1) {
        return r0.j6(r1);
    }

    private java.io.InputStream j6(abcd.wH r7) {
        java.util.zip.InflaterInputStream r1 = new java.util.zip.InflaterInputStream(new abcd.jH(this.Zo, this.FH + ((long) this.v5), r7));
        abcd.FE r0 = this.Zo.Hw(r7, this.Hw);
        abcd.NG r2 = new abcd.NG(this, r1, r0, r7);
        if (this.j6 != (-1)) goto L9;
        if ((r0 instanceof abcd.OG) == true) goto L9;
        this.j6 = r0.FH();
    L9:
        if (this.DW != (-1)) goto L11;
        this.DW = r2.DW();
    L11:
        return r2;
    L13:
        return r7.FH(Zo()).v5();
    }

    @Override
    public long DW() {
        if (this.DW != (-1)) goto L15;
        abcd.wH r0 = new abcd.wH(this.VH);
        this.DW = abcd.AH.j6(this.Zo.j6(r0, this.FH + ((long) this.v5)));     // Catch: java.lang.Throwable -> L7 java.io.IOException -> L9 java.lang.Throwable -> L16
    L17:
        goto L13
    L7:
        th = move-exception;
        r0.FH();
        throw th;
    L9:
        this.DW = r0.FH(Zo()).DW();     // Catch: java.lang.Throwable -> L7
    L13:
        r0.FH();
    L15:
        return this.DW;
    }

    @Override
    public int FH() {
        if (this.j6 != (-1)) goto L14;
        abcd.wH r0 = new abcd.wH(this.VH);
        this.j6 = this.Zo.FH(r0, this.FH);     // Catch: java.lang.Throwable -> L7 java.io.IOException -> L9
    L16:
    L7:
        th = move-exception;
        r0.FH();
        throw th;
    L9:
        this.j6 = r0.FH(Zo()).FH();     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L7
    L6:
        r0.FH();
    L14:
        return this.j6;
    }

    @Override
    public boolean Hw() {
        return true;
    }

    @Override
    public byte[] j6() {
    L4:
        e = move-exception;
        abcd.cD r1 = new abcd.cD();
        r1.initCause(e);
        throw r1;
    L3:
        throw new abcd.cD(Zo());     // Catch: java.io.IOException -> L4
    }

    @Override
    public abcd.JE v5() {
        abcd.yE r9 = Zo();
        abcd.wH r7 = new abcd.wH(this.VH);
        abcd.FE r0 = this.VH.FH(r7, r9.we(), r9);
        if (r0 != null) goto L5;
        java.io.BufferedInputStream r1 = new java.io.BufferedInputStream(j6(r7), 8192);
        int r2 = FH();
        long r3 = DW();
        abcd.YG r6 = this.VH.Hw();
        java.io.File r8 = r6.Zo();
        java.util.zip.DeflaterOutputStream r4 = r6.j6(new java.io.FileOutputStream(r8));
        r6.j6(r4, r2, r3);
        return new abcd.MG(this, r2, r3, new abcd.ZK(r1, r4), r6, r7, r8, r9);
    L5:
        return r0.v5();
    }
}
