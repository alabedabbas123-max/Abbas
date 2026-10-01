package abcd;

public class LA {
    static abcd.InterfacetA j6;
    public java.lang.String DW;
    java.io.RandomAccessFile FH;
    long Hw;
    abcd.HA VH;
    java.util.Map<java.lang.String, abcd.IA> Zo;
    int v5;

    public LA(java.lang.String r3) {
        this.FH = null;
        this.v5 = 0;
        this.Zo = new java.util.LinkedHashMap();
        this.DW = r3;
        this.FH = new java.io.RandomAccessFile(new java.io.File(this.DW), "r");
        this.Hw = this.FH.length();
    }

    private static abcd.InterfacetA Zo() {
        if (j6 != null) goto L6;
        j6 = abcd.uA.j6(abcd.LA.class.getName());
    L6:
        return j6;
    }

    public static abcd.LA j6(java.lang.String r1) {
        abcd.LA r0 = new abcd.LA(r1);
        r0.v5();
        return r0;
    }

    private void v5() {
        this.FH.seek(FH(256));     // Catch: java.lang.Throwable -> L13
        this.VH = abcd.HA.j6(this);     // Catch: java.lang.Throwable -> L13
        boolean r0 = Zo().isDebugEnabled();     // Catch: java.lang.Throwable -> L13
        int r1 = 0;
        if (r0 == false) goto L6;
        Zo().FH(java.lang.String.format("EOCD found in %d iterations", new java.lang.Object[]{java.lang.Integer.valueOf(this.v5)}));     // Catch: java.lang.Throwable -> L13
        Zo().FH(java.lang.String.format("Directory entries=%d, size=%d, offset=%d/0x%08x", new java.lang.Object[]{java.lang.Short.valueOf(this.VH.Zo), java.lang.Integer.valueOf(this.VH.VH), java.lang.Integer.valueOf(this.VH.gn), java.lang.Integer.valueOf(this.VH.gn)}));     // Catch: java.lang.Throwable -> L13
        abcd.MA.j6(Zo());     // Catch: java.lang.Throwable -> L13
    L6:
        this.FH.seek(this.VH.gn);     // Catch: java.lang.Throwable -> L13
    L7:
        if (r1 >= this.VH.Zo) goto L21;
        abcd.IA r2 = abcd.IA.j6(this);     // Catch: java.lang.Throwable -> L13
        this.Zo.put(r2.EQ(), r2);     // Catch: java.lang.Throwable -> L13
        if (r0 == false) goto L12;
        abcd.MA.j6(Zo(), r2);     // Catch: java.lang.Throwable -> L13
    L12:
        r1 = r1 + 1;
        goto L7
    L21:
        return;
    L13:
        th = move-exception;
        th.printStackTrace();
    }

    public long DW() {
        return this.FH.getFilePointer();
    }

    public java.lang.String DW(int r4) {
        byte[] r0 = new byte[r4];
        int r1 = 0;
    L3:
        if (r1 >= r4) goto L6;
        r0[r1] = this.FH.readByte();
        r1 = r1 + 1;
        goto L3
    L6:
        return new java.lang.String(r0);
    }

    public int FH() {
        int r0 = 0;
        int r1 = 0;
    L4:
        if (r0 >= 4) goto L6;
        r1 = r1 | (this.FH.readUnsignedByte() << (r0 * 8));
        r0 = r0 + 1;
        goto L4
    L6:
        return r1;
    }

    public long FH(int r8) {
        long r0 = r8;
        long r2 = this.Hw;
        if (r0 > r2) goto L22;
        if (r8 > 65536) goto L22;
        int r1 = (int) java.lang.Math.min(r2, r0);
        byte[] r3 = new byte[r1];
        long r5 = r1;
        this.FH.seek(this.Hw - r5);
        this.FH.readFully(r3);
        int r4 = r1 - 22;
    L7:
        if (r4 < 0) goto L20;
        this.v5++;
        if (r3[r4] != 80) goto L18;
        if (r3[r4 + 1] != 75) goto L18;
        if (r3[r4 + 2] != 5) goto L18;
        if (r3[r4 + 3] != 6) goto L18;
        return (this.Hw - r5) + ((long) r4);
    L18:
        r4 = r4 - 1;
        goto L7
    L20:
        return FH(r8 * 2);
    L22:
        throw new java.lang.IllegalStateException("End of central directory not found in " + this.DW);
    }

    public short Hw() {
        int r0 = 0;
        short r1 = 0;
    L4:
        if (r0 >= 2) goto L6;
        r1 = (short) (r1 | (this.FH.readUnsignedByte() << (r0 * 8)));
        r0 = r0 + 1;
        goto L4
    L6:
        return r1;
    }

    public java.util.Map<java.lang.String, abcd.IA> j6() {
        return this.Zo;
    }

    public void j6(long r2) {
        this.FH.seek(r2);
    }

    public byte[] j6(int r4) {
        byte[] r0 = new byte[r4];
        int r1 = 0;
    L3:
        if (r1 >= r4) goto L5;
        r0[r1] = this.FH.readByte();
        r1 = r1 + 1;
        goto L3
    L5:
        return r0;
    }
}
