package abcd;

public class fE {
    private static final byte[] DW = null;
    private static final byte[] FH = null;
    private static final byte[] Hw = null;
    private static final byte[] Zo = null;
    private static final abcd.yE[] j6 = null;
    private static final byte[] v5 = null;
    private java.lang.String EQ;
    private abcd.yE VH;
    private abcd.yE[] gn;
    private abcd.KE tp;
    private abcd.KE u7;
    private java.nio.charset.Charset we;

    static {
        j6 = new abcd.yE[0];
        DW = abcd.hE.DW("tree");
        FH = abcd.hE.DW("parent");
        Hw = abcd.hE.DW("author");
        v5 = abcd.hE.DW("committer");
        Zo = abcd.hE.DW("encoding");
    }

    public fE() {
        this.gn = j6;
        this.we = abcd.hE.Zo;
    }

    public abcd.KE DW() {
        return this.u7;
    }

    public void DW(abcd.KE r1) {
        this.tp = r1;
    }

    public abcd.KE FH() {
        return this.tp;
    }

    public java.nio.charset.Charset Hw() {
        return this.we;
    }

    public abcd.yE VH() {
        return this.VH;
    }

    public abcd.yE[] Zo() {
        return this.gn;
    }

    public void j6(abcd.KE r1) {
        this.u7 = r1;
    }

    public void j6(abcd.YD r1) {
        this.VH = r1.Hw();
    }

    public void j6(java.lang.String r1) {
        this.EQ = r1;
    }

    public void j6(java.util.List<? extends abcd.YD> r4) {
        this.gn = new abcd.yE[r4.size()];
        int r0 = 0;
    L4:
        if (r0 >= r4.size()) goto L5;
        this.gn[r0] = r4.get(r0).Hw();
        r0 = r0 + 1;
        goto L4
    }

    public byte[] j6() {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();
        java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter(r0, Hw());
        r0.write(DW);     // Catch: java.io.IOException -> L15
        r0.write(32);     // Catch: java.io.IOException -> L15
        VH().DW(r0);     // Catch: java.io.IOException -> L15
        r0.write(10);     // Catch: java.io.IOException -> L15
        abcd.yE[] r4 = Zo();     // Catch: java.io.IOException -> L15
        int r5 = r4.length;     // Catch: java.io.IOException -> L15
        int r6 = 0;
    L4:
        if (r6 >= r5) goto L5;
        abcd.yE r7 = r4[r6];     // Catch: java.io.IOException -> L15
        r0.write(FH);     // Catch: java.io.IOException -> L15
        r0.write(32);     // Catch: java.io.IOException -> L15
        r7.DW(r0);     // Catch: java.io.IOException -> L15
        r0.write(10);     // Catch: java.io.IOException -> L15
        r6 = r6 + 1;
        goto L4
    L5:
        r0.write(Hw);     // Catch: java.io.IOException -> L15
        r0.write(32);     // Catch: java.io.IOException -> L15
        r1.write(DW().Hw());     // Catch: java.io.IOException -> L15
        r1.flush();     // Catch: java.io.IOException -> L15
        r0.write(10);     // Catch: java.io.IOException -> L15
        r0.write(v5);     // Catch: java.io.IOException -> L15
        r0.write(32);     // Catch: java.io.IOException -> L15
        r1.write(FH().Hw());     // Catch: java.io.IOException -> L15
        r1.flush();     // Catch: java.io.IOException -> L15
        r0.write(10);     // Catch: java.io.IOException -> L15
        if (Hw() == abcd.hE.Zo) goto L8;
        r0.write(Zo);     // Catch: java.io.IOException -> L15
        r0.write(32);     // Catch: java.io.IOException -> L15
        r0.write(abcd.hE.DW(Hw().name()));     // Catch: java.io.IOException -> L15
        r0.write(10);     // Catch: java.io.IOException -> L15
    L8:
        r0.write(10);     // Catch: java.io.IOException -> L15
        if (v5() == null) goto L12;
        r1.write(v5());     // Catch: java.io.IOException -> L15
        r1.flush();     // Catch: java.io.IOException -> L15
    L12:
        return r0.toByteArray();
    L15:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("Commit");
        r0.append("={\n");
        r0.append("tree ");
        abcd.yE r1 = this.VH;
        java.lang.String r2 = "NOT_SET";
        if (r1 == null) goto L5;
        java.lang.String r3 = r1.we();
    L6:
        r0.append(r3);
        r0.append("\n");
        abcd.yE[] r4 = this.gn;
        int r5 = r4.length;
        int r6 = 0;
    L7:
        if (r6 >= r5) goto L8;
        abcd.yE r7 = r4[r6];
        r0.append("parent ");
        r0.append(r7.we());
        r0.append("\n");
        r6 = r6 + 1;
        goto L7
    L8:
        r0.append("author ");
        abcd.KE r8 = this.u7;
        if (r8 == null) goto L11;
        java.lang.String r9 = r8.toString();
    L12:
        r0.append(r9);
        r0.append("\n");
        r0.append("committer ");
        abcd.KE r10 = this.tp;
        if (r10 == null) goto L15;
        r2 = r10.toString();
    L15:
        r0.append(r2);
        r0.append("\n");
        java.nio.charset.Charset r11 = this.we;
        if (r11 != null) goto L18;
    L20:
        r0.append("\n");
        java.lang.String r12 = this.EQ;
        if (r12 != null) goto L24;
        r12 = "";
    L24:
        r0.append(r12);
        r0.append("}");
        return r0.toString();
    L18:
        if (r11 == abcd.hE.Zo) goto L20;
        r0.append("encoding ");
        r0.append(this.we.name());
        r0.append("\n");
        goto L20
    L11:
        r9 = "NOT_SET";
        goto L12
    L5:
        r3 = "NOT_SET";
        goto L6
    }

    public java.lang.String v5() {
        return this.EQ;
    }
}
