package abcd;

@abcd.Interfacexu
public final class Wa {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public int EQ;
    public int[] FH;
    public int[] Hw;
    public int[] VH;
    public int[] Zo;
    public int[] gn;
    public int tp;
    public char[] u7;
    public int[] v5;

    static {
        abcd.wu.j6(abcd.Wa.class, -2092753086169783275L, -2092753086169783275L);
    }

    public Wa() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 81724473711662424L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(81724473711662424L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new int[10000];     // Catch: java.lang.Throwable -> L8
        this.Hw = new int[10000];     // Catch: java.lang.Throwable -> L8
        this.v5 = new int[10000];     // Catch: java.lang.Throwable -> L8
        this.Zo = new int[10000];     // Catch: java.lang.Throwable -> L8
        this.VH = new int[10000];     // Catch: java.lang.Throwable -> L8
        this.gn = new int[10000];     // Catch: java.lang.Throwable -> L8
        this.u7 = new char[1000];     // Catch: java.lang.Throwable -> L8
        this.tp = 1;     // Catch: java.lang.Throwable -> L8
    }

    public int DW(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -625053990202362900L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-625053990202362900L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.u7[r5];
    }

    public int FH(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -613108329232434912L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-613108329232434912L, this, r5);     // Catch: java.lang.Throwable -> L8
    L7:
        return r5 + 1;
    }

    public java.lang.String Hw(int r7) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5367050059670448912L, this, new java.lang.Integer(r7));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5367050059670448912L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        return new java.lang.String(this.u7, FH(r7), DW(r7));
    }

    public int j6(char[] r9, int r10, int r11) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -1458680118336398608L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1458680118336398608L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L10
    L6:
        if (((this.tp + r11) + 1) < this.u7.length) goto L8;
        char[] r0 = new char[java.lang.Math.max((this.u7.length * 2) + 1, (this.tp + r11) + 1)];     // Catch: java.lang.Throwable -> L10
        java.lang.System.arraycopy(this.u7, 0, r0, 0, this.u7.length);     // Catch: java.lang.Throwable -> L10
        this.u7 = r0;     // Catch: java.lang.Throwable -> L10
    L8:
        int r1 = this.tp;     // Catch: java.lang.Throwable -> L10
        char[] r2 = this.u7;     // Catch: java.lang.Throwable -> L10
        int r3 = this.tp;     // Catch: java.lang.Throwable -> L10
        this.tp = r3 + 1;     // Catch: java.lang.Throwable -> L10
        r2[r3] = (char) r11;     // Catch: java.lang.Throwable -> L10
        java.lang.System.arraycopy(r9, r10, this.u7, this.tp, r11);     // Catch: java.lang.Throwable -> L10
        this.tp += r11;     // Catch: java.lang.Throwable -> L10
        return r1;
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 347892484435237000L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(347892484435237000L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.EQ = 0;     // Catch: java.lang.Throwable -> L8
        this.tp = 1;     // Catch: java.lang.Throwable -> L8
    }

    public void j6(int r8) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 553389122902284791L, this, new java.lang.Integer(r8));
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(553389122902284791L, this, r8);     // Catch: java.lang.Throwable -> L12
    L6:
        int r2 = this.FH.length;     // Catch: java.lang.Throwable -> L12
        if (r8 < r2) goto L22;
    L8:
        if (r8 < r2) goto L10;
        r2 = this.FH.length * 2;     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        int[] r3 = new int[r2];     // Catch: java.lang.Throwable -> L12
        java.lang.System.arraycopy(this.FH, 0, r3, 0, this.FH.length);     // Catch: java.lang.Throwable -> L12
        this.FH = r3;     // Catch: java.lang.Throwable -> L12
        int[] r4 = new int[r2];     // Catch: java.lang.Throwable -> L12
        java.lang.System.arraycopy(this.Hw, 0, r4, 0, this.Hw.length);     // Catch: java.lang.Throwable -> L12
        this.Hw = r4;     // Catch: java.lang.Throwable -> L12
        int[] r5 = new int[r2];     // Catch: java.lang.Throwable -> L12
        java.lang.System.arraycopy(this.v5, 0, r5, 0, this.v5.length);     // Catch: java.lang.Throwable -> L12
        this.v5 = r5;     // Catch: java.lang.Throwable -> L12
        int[] r6 = new int[r2];     // Catch: java.lang.Throwable -> L12
        java.lang.System.arraycopy(this.VH, 0, r6, 0, this.VH.length);     // Catch: java.lang.Throwable -> L12
        this.VH = r6;     // Catch: java.lang.Throwable -> L12
        int[] r7 = new int[r2];     // Catch: java.lang.Throwable -> L12
        java.lang.System.arraycopy(this.Zo, 0, r7, 0, this.Zo.length);     // Catch: java.lang.Throwable -> L12
        this.Zo = r7;     // Catch: java.lang.Throwable -> L12
        int[] r9 = new int[r2];     // Catch: java.lang.Throwable -> L12
        java.lang.System.arraycopy(this.gn, 0, r9, 0, this.gn.length);     // Catch: java.lang.Throwable -> L12
        this.gn = r9;     // Catch: java.lang.Throwable -> L12
        return;
    }

    public void j6(int r7, int r8, int r9, int r10, int r11, int r12) {
        if (j6 == false) goto L5;
        abcd.wu.j6(2792690499386444560L, this, new java.lang.Object[]{new java.lang.Integer(r7), new java.lang.Integer(r8), new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12)});
    L5:
        int r0 = this.EQ;
        j6(r0 + 1);
        this.FH[r0] = r7;
        this.Hw[r0] = r8;
        this.v5[r0] = r9;
        this.VH[r0] = r10;
        this.Zo[r0] = r11;
        this.gn[r0] = r12;
        this.EQ++;
    }
}
