package abcd;

final class hn {
    private final int DW;
    private final int FH;
    private final abcd.gn Hw;
    private abcd.Interfacexn VH;
    private int Zo;
    private final abcd.jn j6;
    private final abcd.yn v5;

    public hn(abcd.jn r2, int r3, int r4, abcd.gn r5) {
        if (r2 == null) goto L10;
        if (r5 == null) goto L8;
        int r0 = r2.Hw().Zo(r4);
        this.j6 = r2;
        this.DW = r3;
        this.FH = r4;
        this.Hw = r5;
        this.v5 = new abcd.yn(r0);
        this.Zo = -1;
        return;
    L8:
        throw new java.lang.NullPointerException("attributeFactory == null");
    L10:
        throw new java.lang.NullPointerException("cf == null");
    }

    private void FH() {
        int r2 = this.v5.size();
        int r3 = this.FH + 2;
        abcd.Pt r5 = this.j6.Hw();
        abcd.Interfacexn r6 = this.VH;
        if (r6 == null) goto L5;
        r6.j6(r5, this.FH, 2, "attributes_count: " + abcd.Yt.v5(r2));
    L5:
        int r7 = r3;
        int r4 = 0;
    L6:
        if (r4 >= r2) goto L20;
        if (this.VH == null) goto L10;
        this.VH.j6(r5, r7, 0, "\nattributes[" + r4 + "]:\n");     // Catch: java.lang.RuntimeException -> L14 abcd.wn -> L17
        this.VH.j6(1);     // Catch: java.lang.RuntimeException -> L14 abcd.wn -> L17
    L10:
        abcd.Interfaceon r8 = this.Hw.j6(this.j6, this.DW, r7, this.VH);     // Catch: java.lang.RuntimeException -> L14 abcd.wn -> L17
        r7 = r7 + r8.Hw();     // Catch: java.lang.RuntimeException -> L14 abcd.wn -> L17
        this.v5.j6(r4, r8);     // Catch: java.lang.RuntimeException -> L14 abcd.wn -> L17
        if (this.VH == null) goto L13;
        this.VH.j6(-1);     // Catch: java.lang.RuntimeException -> L14 abcd.wn -> L17
        this.VH.j6(r5, r7, 0, "end attributes[" + r4 + "]\n");     // Catch: java.lang.RuntimeException -> L14 abcd.wn -> L17
    L13:
        r4 = r4 + 1;
        goto L6
    L17:
        e = move-exception;
        e.j6("...while parsing attributes[" + r4 + "]");
        throw e;
    L14:
        e = move-exception;
        abcd.wn r9 = new abcd.wn(e);
        r9.j6("...while parsing attributes[" + r4 + "]");
        throw r9;
    L20:
        this.Zo = r7;
    }

    private void Hw() {
        if (this.Zo >= 0) goto L6;
        FH();
        return;
    }

    public abcd.yn DW() {
        Hw();
        return this.v5;
    }

    public int j6() {
        Hw();
        return this.Zo;
    }

    public void j6(abcd.Interfacexn r1) {
        this.VH = r1;
    }
}
