package abcd;

@abcd.Interfacexu
public class Cb {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -2741246541754232352L)
    private int[] FH;

    @abcd.Interfaceru(field = -2689474325645500761L)
    private int Hw;

    static {
        abcd.wu.j6(abcd.Cb.class, 1772296429983558735L, 1772296429983558735L);
    }

    public Cb() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1812504265671665600L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1812504265671665600L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = null;     // Catch: java.lang.Throwable -> L8
        this.Hw = 0;     // Catch: java.lang.Throwable -> L8
    }

    public Cb(int r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 44833406766386859L, null, new java.lang.Integer(r6));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(44833406766386859L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new int[r6];     // Catch: java.lang.Throwable -> L8
        this.Hw = r6;     // Catch: java.lang.Throwable -> L8
    }

    public Cb(abcd.ec r7) {
    L14:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, -334798370985474000L, null, r7);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-334798370985474000L, null, r7);     // Catch: java.lang.Throwable -> L14
    L6:
        this.Hw = r7.readInt();     // Catch: java.lang.Throwable -> L14
        if (this.Hw <= 0) goto L13;
        this.FH = new int[this.Hw];     // Catch: java.lang.Throwable -> L14
        int r3 = 0;
    L9:
        if (r3 >= this.FH.length) goto L24;
        this.FH[r3] = r7.readInt();     // Catch: java.lang.Throwable -> L14
        r3 = r3 + 1;
        goto L9
    L24:
        return;
    }

    @abcd.Interfacesu(method = 8592412082527781793L)
    private void DW(int r8, int r9) {
    L21:
        th = th;
        int r1 = r8;
        int r2 = r9;
    L24:
        if (DW == false) goto L27;
        abcd.wu.j6(th, 6476239322047086384L, this, new java.lang.Integer(r1), new java.lang.Integer(r2));
    L27:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6476239322047086384L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L21
    L5:
        if (r8 >= r9) goto L40;
        int r0 = this.FH[((r9 - r8) / 2) + r8];     // Catch: java.lang.Throwable -> L21
        r1 = r8;
        r2 = r9;
    L8:
        if (r1 > r2) goto L19;
    L29:
    L17:
        th = th;
        goto L24
    L10:
        if (this.FH[r1] >= r0) goto L13;
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L17
    L13:
        if (r0 >= this.FH[r2]) goto L15;
        r2 = r2 - 1;     // Catch: java.lang.Throwable -> L17
        goto L13
    L15:
        if (r1 > r2) goto L8;
        int r3 = this.FH[r2];     // Catch: java.lang.Throwable -> L17
        this.FH[r2] = this.FH[r1];     // Catch: java.lang.Throwable -> L17
        this.FH[r1] = r3;     // Catch: java.lang.Throwable -> L17
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L17
        r2 = r2 - 1;     // Catch: java.lang.Throwable -> L17
        goto L8
    L19:
        DW(r8, r2);     // Catch: java.lang.Throwable -> L17
        DW(r1, r9);     // Catch: java.lang.Throwable -> L17
        return;
    }

    public int DW() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -838419201184654845L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-838419201184654845L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.Hw != 0) goto L10;
        return -1;
    L10:
        return DW(this.Hw - 1);
    }

    public int DW(int r5) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -4807456511014428765L, this, new java.lang.Integer(r5));
    L21:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-4807456511014428765L, this, r5);     // Catch: java.lang.Throwable -> L17
    L7:
        if (this.FH != null) goto L10;
        return -1;
    L10:
        if (r5 < this.FH.length) goto L13;
        return -1;
    L13:
        if (r5 < this.Hw) goto L15;
        return -1;
    L15:
        return this.FH[r5];
    }

    public int FH() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 568608656937265713L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(568608656937265713L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (this.Hw != 0) goto L10;
        return -1;
    L10:
        int[] r2 = this.FH;     // Catch: java.lang.Throwable -> L12
        int r3 = this.Hw - 1;     // Catch: java.lang.Throwable -> L12
        this.Hw = r3;     // Catch: java.lang.Throwable -> L12
        return r2[r3];
    }

    public void FH(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6169686089017505477L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6169686089017505477L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(r5);     // Catch: java.lang.Throwable -> L8
    }

    public int Hw() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -837821790407373349L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-837821790407373349L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw;
    }

    public void Hw(int r7) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 4447896482021548145L, this, new java.lang.Integer(r7));
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(4447896482021548145L, this, r7);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.FH != null) goto L10;
        return;
    L10:
        if (r7 < this.Hw) goto L12;
        return;
    L12:
        java.lang.System.arraycopy(this.FH, r7 + 1, this.FH, r7, (this.Hw - r7) - 1);     // Catch: java.lang.Throwable -> L14
        this.Hw--;     // Catch: java.lang.Throwable -> L14
    }

    public boolean equals(java.lang.Object r8) {
    L21:
        th = move-exception;
        if (DW == false) goto L26;
        abcd.wu.j6(th, 223935440798815320L, this, r8);
    L26:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(223935440798815320L, this, r8);     // Catch: java.lang.Throwable -> L21
    L7:
        if ((r8 instanceof abcd.Cb) == true) goto L9;
        return false;
    L9:
        abcd.Cb r2 = (abcd.Cb) r8;     // Catch: java.lang.Throwable -> L21
        if (this.Hw == r2.Hw) goto L12;
        return false;
    L12:
        int r4 = 0;
    L13:
        if (r4 >= this.Hw) goto L19;
        if (DW(r4) != r2.DW(r4)) goto L17;
        r4 = r4 + 1;
        goto L13
    L17:
        return false;
    L19:
        return true;
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1412049244061192187L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1412049244061192187L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = 0;     // Catch: java.lang.Throwable -> L8
    }

    public void j6(int r7) {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -5542839875055269188L, this, new java.lang.Integer(r7));
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-5542839875055269188L, this, r7);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.FH != null) goto L10;
        this.FH = new int[10];     // Catch: java.lang.Throwable -> L14
    L12:
        int[] r2 = this.FH;     // Catch: java.lang.Throwable -> L14
        int r3 = this.Hw;     // Catch: java.lang.Throwable -> L14
        this.Hw = r3 + 1;     // Catch: java.lang.Throwable -> L14
        r2[r3] = r7;     // Catch: java.lang.Throwable -> L14
        return;
    L10:
        if (this.Hw < this.FH.length) goto L12;
        int[] r4 = new int[(this.FH.length * 2) + 1];     // Catch: java.lang.Throwable -> L14
        java.lang.System.arraycopy(this.FH, 0, r4, 0, this.FH.length);     // Catch: java.lang.Throwable -> L14
        this.FH = r4;     // Catch: java.lang.Throwable -> L14
        goto L12
    }

    public void j6(int r8, int r9) {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -2919152307333001580L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L20:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2919152307333001580L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L16
    L6:
        if (this.FH != null) goto L9;
        this.FH = new int[java.lang.Math.max(10, r8 + 1)];     // Catch: java.lang.Throwable -> L16
    L12:
        if (r8 < this.Hw) goto L14;
        this.Hw = r8 + 1;     // Catch: java.lang.Throwable -> L16
    L14:
        this.FH[r8] = r9;     // Catch: java.lang.Throwable -> L16
        return;
    L9:
        if (r8 < this.FH.length) goto L12;
        int[] r0 = new int[java.lang.Math.max(r8 + 1, (this.FH.length * 2) + 1)];     // Catch: java.lang.Throwable -> L16
        java.lang.System.arraycopy(this.FH, 0, r0, 0, this.FH.length);     // Catch: java.lang.Throwable -> L16
        this.FH = r0;     // Catch: java.lang.Throwable -> L16
        goto L12
    }

    public void j6(abcd.fc r5) {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -5896539441114979352L, this, r5);
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5896539441114979352L, this, r5);     // Catch: java.lang.Throwable -> L15
    L6:
        int r3 = 0;
        if (this.FH != null) goto L9;
        r5.writeInt(0);     // Catch: java.lang.Throwable -> L15
        return;
    L9:
        r5.writeInt(this.Hw);     // Catch: java.lang.Throwable -> L15
    L11:
        if (r3 >= this.Hw) goto L24;
        r5.writeInt(this.FH[r3]);     // Catch: java.lang.Throwable -> L15
        r3 = r3 + 1;
        goto L11
    }

    public java.lang.String toString() {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -883228644126773492L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-883228644126773492L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        java.lang.String r2 = "{";
        int r3 = 0;
    L8:
        if (r3 >= this.Hw) goto L10;
        r2 = r2 + this.FH[r3] + ", ";     // Catch: java.lang.Throwable -> L12
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        return r2 + "}";
    }

    public void v5() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -838415478933956000L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-838415478933956000L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        DW(0, this.Hw - 1);     // Catch: java.lang.Throwable -> L8
    }

    public void v5(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 125597264603791088L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(125597264603791088L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = r5;     // Catch: java.lang.Throwable -> L8
    }
}
