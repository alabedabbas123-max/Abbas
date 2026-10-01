package abcd;

@abcd.Interfacexu
public class Ib {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = 41347381820705317L)
    private static final int[] j6 = null;

    @abcd.Interfaceru(field = -2594694057391598385L)
    private int[] EQ;

    @abcd.Interfaceru(field = 2558317741010154933L)
    private int[] Hw;

    @abcd.Interfaceru(field = -2599006275127982181L)
    private int[] VH;

    @abcd.Interfaceru(field = 2408824838078374560L)
    private int[] Zo;

    @abcd.Interfaceru(field = 1401348054059239888L)
    private int gn;

    @abcd.Interfaceru(field = 3082726183384112697L)
    private int tp;

    @abcd.Interfaceru(field = 747565675296007008L)
    private int u7;

    @abcd.Interfaceru(field = -1740943664598758720L)
    private int v5;

    static {
        abcd.wu.j6(abcd.Ib.class, 30717209212082835L, 30717209212082835L);     // Catch: java.lang.Throwable -> L8
        if (DW == false) goto L6;
        abcd.wu.j6(-2125784050070869956L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2125784050070869956L, null);
    L12:
        throw th;
    }

    public Ib() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2731326174239369112L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2731326174239369112L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.tp = 0;     // Catch: java.lang.Throwable -> L8
        this.Zo = new int[j6[this.tp]];     // Catch: java.lang.Throwable -> L8
        this.VH = new int[j6[this.tp]];     // Catch: java.lang.Throwable -> L8
        this.Hw = new int[10];     // Catch: java.lang.Throwable -> L8
        this.v5 = 1;     // Catch: java.lang.Throwable -> L8
        this.gn = 0;     // Catch: java.lang.Throwable -> L8
        this.u7 = 0;     // Catch: java.lang.Throwable -> L8
    }

    public Ib(abcd.ec r8) {
    L20:
        th = move-exception;
        if (FH == false) goto L25;
        abcd.wu.j6(th, -2229565801241763432L, null, r8);
    L25:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2229565801241763432L, null, r8);     // Catch: java.lang.Throwable -> L20
    L6:
        this.u7 = r8.readInt();     // Catch: java.lang.Throwable -> L20
        this.gn = r8.readInt();     // Catch: java.lang.Throwable -> L20
        this.tp = r8.readInt();     // Catch: java.lang.Throwable -> L20
        this.Zo = new int[j6[this.tp]];     // Catch: java.lang.Throwable -> L20
        int r3 = 0;
        int r4 = 0;
    L8:
        if (r4 >= this.Zo.length) goto L10;
        this.Zo[r4] = r8.readInt();     // Catch: java.lang.Throwable -> L20
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L20
        goto L8
    L10:
        this.VH = new int[j6[this.tp]];     // Catch: java.lang.Throwable -> L20
        int r5 = 0;
    L12:
        if (r5 >= this.VH.length) goto L14;
        this.VH[r5] = r8.readInt();     // Catch: java.lang.Throwable -> L20
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L20
        goto L12
    L14:
        this.v5 = r8.readInt();     // Catch: java.lang.Throwable -> L20
        this.Hw = new int[r8.readInt()];     // Catch: java.lang.Throwable -> L20
    L15:
        if (r3 >= this.v5) goto L19;
        this.Hw[r3] = r8.readInt();     // Catch: java.lang.Throwable -> L20
        r3 = r3 + 1;
        goto L15
    }

    @abcd.Interfacesu(method = 3804513888865510953L)
    private int FH(int[] r9, int r10, int r11) {
    L14:
        th = move-exception;
        if (FH == false) goto L19;
        abcd.wu.j6(th, -659394407513054579L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L19:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-659394407513054579L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L14
    L5:
        int r0 = 0;
        int r1 = 0;
    L6:
        if (r0 >= r11) goto L10;
        r1 = r1 ^ r9[r0 + r10];
        r0 = r0 + 1;
        goto L6
    L10:
        if (r1 != 0) goto L13;
        r1 = Integer.MAX_VALUE;
    L13:
        return Integer.MAX_VALUE & r1;
    }

    @abcd.Interfacesu(method = 2516941107689935045L)
    private void j6() {
    L21:
        th = move-exception;
        if (FH == false) goto L26;
        abcd.wu.j6(th, 264760601564290281L, this);
    L26:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(264760601564290281L, this);     // Catch: java.lang.Throwable -> L21
    L6:
        this.tp++;     // Catch: java.lang.Throwable -> L21
        int[] r2 = new int[j6[this.tp]];     // Catch: java.lang.Throwable -> L21
        int[] r3 = new int[j6[this.tp]];     // Catch: java.lang.Throwable -> L21
        int r4 = 0;
        int r5 = 0;
    L8:
        if (r4 >= this.Zo.length) goto L19;
        int r6 = this.Zo[r4];     // Catch: java.lang.Throwable -> L21
        if (r6 == 0) goto L18;
        if (r6 == Integer.MIN_VALUE) goto L18;
        int r7 = FH(this.Hw, r6 + 1, this.Hw[r6]);     // Catch: java.lang.Throwable -> L21
        int r8 = r7 % r2.length;     // Catch: java.lang.Throwable -> L21
        int r9 = (r7 % (r2.length - 2)) + 1;     // Catch: java.lang.Throwable -> L21
    L15:
        if (r2[r8] == 0) goto L17;
        r8 = (r8 + r9) % r2.length;     // Catch: java.lang.Throwable -> L21
        goto L15
    L17:
        r2[r8] = r6;     // Catch: java.lang.Throwable -> L21
        r3[r8] = this.VH[r4];     // Catch: java.lang.Throwable -> L21
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L21
    L18:
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L21
        goto L8
    L19:
        this.Zo = r2;     // Catch: java.lang.Throwable -> L21
        this.VH = r3;     // Catch: java.lang.Throwable -> L21
        this.gn = r5;     // Catch: java.lang.Throwable -> L21
    }

    public int DW(int r11, int[] r12, int[] r13, int r14, int r15) {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, -2828003442192993537L, this, new java.lang.Integer(r11), r12, r13, new java.lang.Integer(r14), new java.lang.Integer(r15));
    L16:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-2828003442192993537L, this, new java.lang.Integer(r11), r12, r13, new java.lang.Integer(r14), new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L12
    L5:
        int r0 = (r15 * 2) + 1;     // Catch: java.lang.Throwable -> L12
        if (this.EQ != null) goto L8;
    L9:
        this.EQ = new int[r0];     // Catch: java.lang.Throwable -> L12
    L10:
        this.EQ[0] = r11;     // Catch: java.lang.Throwable -> L12
        java.lang.System.arraycopy(r12, r14, this.EQ, 1, r15);     // Catch: java.lang.Throwable -> L12
        java.lang.System.arraycopy(r13, r14, this.EQ, r15 + 1, r15);     // Catch: java.lang.Throwable -> L12
        return DW(this.EQ, 0, r0);
    L8:
        if (this.EQ.length > r0) goto L10;
        goto L9
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    public int DW(int[] r9, int r10, int r11) {
    L23:
        th = move-exception;
        if (FH == false) goto L28;
        abcd.wu.j6(th, -1716786471069664269L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L28:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-1716786471069664269L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L23
    L5:
        int r0 = FH(r9, r10, r11);     // Catch: java.lang.Throwable -> L23
        int r1 = r0 % this.Zo.length;     // Catch: java.lang.Throwable -> L23
        int r2 = (r0 % (this.Zo.length - 2)) + 1;     // Catch: java.lang.Throwable -> L23
        int r3 = this.Zo[r1];     // Catch: java.lang.Throwable -> L23
    L6:
        if (r3 == 0) goto L21;
        if (r3 == Integer.MIN_VALUE) goto L38;
        if (this.Hw[r3] != r11) goto L19;
        int r4 = r3 + 1;     // Catch: java.lang.Throwable -> L23
        int r5 = 0;
    L12:
        if (r5 >= r11) goto L17;
        int r6 = r4 + 1;     // Catch: java.lang.Throwable -> L23
        if (this.Hw[r4] != r9[r10 + r5]) goto L19;
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L23
        r4 = r6;
        goto L12
    L17:
        r9 = this.VH[r1];     // Catch: java.lang.Throwable -> L23
        return r9;
    L19:
        r1 = (r1 + r2) % this.Zo.length;     // Catch: java.lang.Throwable -> L23
        r3 = this.Zo[r1];     // Catch: java.lang.Throwable -> L23
        goto L6
    L38:
        return -1;
    L21:
        return -1;
    }

    public void j6(int r8, int[] r9, int[] r10, int r11, int r12, int r13) {
        if (DW == false) goto L5;
        abcd.wu.j6(-635802111660573L, this, new java.lang.Object[]{new java.lang.Integer(r8), r9, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13)});
    L5:
        int r0 = (r12 * 2) + 1;
        int[] r3 = this.EQ;
        if (r3 != null) goto L8;
    L9:
        this.EQ = new int[r0];
    L10:
        int[] r4 = this.EQ;
        r4[0] = r8;
        java.lang.System.arraycopy(r9, r11, r4, 1, r12);
        java.lang.System.arraycopy(r10, r11, this.EQ, r12 + 1, r12);
        j6(this.EQ, 0, r0, r13);
        return;
    L8:
        if (r3.length > r0) goto L10;
        goto L9
    }

    public void j6(abcd.fc r6) {
    L20:
        th = move-exception;
        if (FH == false) goto L25;
        abcd.wu.j6(th, -7423424447459465236L, this, r6);
    L25:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-7423424447459465236L, this, r6);     // Catch: java.lang.Throwable -> L20
    L6:
        r6.writeInt(this.u7);     // Catch: java.lang.Throwable -> L20
        r6.writeInt(this.gn);     // Catch: java.lang.Throwable -> L20
        r6.writeInt(this.tp);     // Catch: java.lang.Throwable -> L20
        int r2 = 0;
        int r3 = 0;
    L8:
        if (r3 >= this.Zo.length) goto L10;
        r6.writeInt(this.Zo[r3]);     // Catch: java.lang.Throwable -> L20
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L20
        goto L8
    L10:
        int r4 = 0;
    L12:
        if (r4 >= this.VH.length) goto L14;
        r6.writeInt(this.VH[r4]);     // Catch: java.lang.Throwable -> L20
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L20
        goto L12
    L14:
        r6.writeInt(this.v5);     // Catch: java.lang.Throwable -> L20
        r6.writeInt(this.Hw.length);     // Catch: java.lang.Throwable -> L20
    L15:
        if (r2 >= this.v5) goto L19;
        r6.writeInt(this.Hw[r2]);     // Catch: java.lang.Throwable -> L20
        r2 = r2 + 1;
        goto L15
    }

    public void j6(int[] r10, int r11, int r12, int r13) {
    L33:
        th = move-exception;
        if (FH == false) goto L38;
        abcd.wu.j6(th, -580043143434076047L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L38:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-580043143434076047L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L33
    L5:
        int r0 = FH(r10, r11, r12);     // Catch: java.lang.Throwable -> L33
        int r1 = r0 % this.Zo.length;     // Catch: java.lang.Throwable -> L33
        int r2 = (r0 % (this.Zo.length - 2)) + 1;     // Catch: java.lang.Throwable -> L33
        int r3 = this.Zo[r1];     // Catch: java.lang.Throwable -> L33
    L6:
        int r4 = 0;
        if (r3 == 0) goto L20;
        if (r3 == Integer.MIN_VALUE) goto L20;
        if (this.Hw[r3] != r12) goto L19;
        int r5 = r3 + 1;     // Catch: java.lang.Throwable -> L33
    L12:
        if (r4 >= r12) goto L17;
        int r6 = r5 + 1;     // Catch: java.lang.Throwable -> L33
        if (this.Hw[r5] != r10[r11 + r4]) goto L19;
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L33
        r5 = r6;
        goto L12
    L17:
        this.VH[r1] = r13;     // Catch: java.lang.Throwable -> L33
        return;
    L19:
        r1 = (r1 + r2) % this.Zo.length;     // Catch: java.lang.Throwable -> L33
        r3 = this.Zo[r1];     // Catch: java.lang.Throwable -> L33
    L20:
        this.Zo[r1] = this.v5;     // Catch: java.lang.Throwable -> L33
        if (((this.v5 + r12) + 1) < this.Hw.length) goto L23;
        int[] r7 = new int[java.lang.Math.max((this.Hw.length + r12) + 1, (this.Hw.length * 2) + 1)];     // Catch: java.lang.Throwable -> L33
        java.lang.System.arraycopy(this.Hw, 0, r7, 0, this.Hw.length);     // Catch: java.lang.Throwable -> L33
        this.Hw = r7;     // Catch: java.lang.Throwable -> L33
    L23:
        int[] r8 = this.Hw;     // Catch: java.lang.Throwable -> L33
        int r9 = this.v5;     // Catch: java.lang.Throwable -> L33
        this.v5 = r9 + 1;     // Catch: java.lang.Throwable -> L33
        r8[r9] = r12;     // Catch: java.lang.Throwable -> L33
    L24:
        if (r4 >= r12) goto L26;
        int[] r14 = this.Hw;     // Catch: java.lang.Throwable -> L33
        int r15 = this.v5;     // Catch: java.lang.Throwable -> L33
        this.v5 = r15 + 1;     // Catch: java.lang.Throwable -> L33
        r14[r15] = r10[r11 + r4];     // Catch: java.lang.Throwable -> L33
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L33
        goto L24
    L26:
        this.VH[r1] = r13;     // Catch: java.lang.Throwable -> L33
        if (r3 == Integer.MIN_VALUE) goto L29;
        this.gn++;     // Catch: java.lang.Throwable -> L33
    L29:
        this.u7++;     // Catch: java.lang.Throwable -> L33
        if ((this.gn * 2) <= this.Zo.length) goto L48;
        j6();     // Catch: java.lang.Throwable -> L33
        return;
    }

    public boolean j6(int r11, int[] r12, int[] r13, int r14, int r15) {
    L12:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 5926346260535450600L, this, new java.lang.Integer(r11), r12, r13, new java.lang.Integer(r14), new java.lang.Integer(r15));
    L16:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(5926346260535450600L, this, new java.lang.Integer(r11), r12, r13, new java.lang.Integer(r14), new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L12
    L5:
        int r0 = (r15 * 2) + 1;     // Catch: java.lang.Throwable -> L12
        if (this.EQ != null) goto L8;
    L9:
        this.EQ = new int[r0];     // Catch: java.lang.Throwable -> L12
    L10:
        this.EQ[0] = r11;     // Catch: java.lang.Throwable -> L12
        java.lang.System.arraycopy(r12, r14, this.EQ, 1, r15);     // Catch: java.lang.Throwable -> L12
        java.lang.System.arraycopy(r13, r14, this.EQ, r15 + 1, r15);     // Catch: java.lang.Throwable -> L12
        return j6(this.EQ, 0, r0);
    L8:
        if (this.EQ.length > r0) goto L10;
        goto L9
    }

    public boolean j6(int[] r9, int r10, int r11) {
    L22:
        th = move-exception;
        if (FH == false) goto L27;
        abcd.wu.j6(th, 2665953759176881668L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L27:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(2665953759176881668L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L22
    L5:
        int r0 = FH(r9, r10, r11);     // Catch: java.lang.Throwable -> L22
        int r1 = r0 % this.Zo.length;     // Catch: java.lang.Throwable -> L22
        int r2 = (r0 % (this.Zo.length - 2)) + 1;     // Catch: java.lang.Throwable -> L22
        int r3 = this.Zo[r1];     // Catch: java.lang.Throwable -> L22
    L6:
        int r4 = 0;
        if (r3 == 0) goto L21;
        if (r3 == Integer.MIN_VALUE) goto L21;
        if (this.Hw[r3] != r11) goto L19;
        int r5 = r3 + 1;     // Catch: java.lang.Throwable -> L22
    L13:
        if (r4 >= r11) goto L18;
        int r6 = r5 + 1;     // Catch: java.lang.Throwable -> L22
        if (this.Hw[r5] != r9[r10 + r4]) goto L19;
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L22
        r5 = r6;
        goto L13
    L18:
        return true;
    L19:
        r1 = (r1 + r2) % this.Zo.length;     // Catch: java.lang.Throwable -> L22
        r3 = this.Zo[r1];     // Catch: java.lang.Throwable -> L22
    L21:
        return false;
    }

    public java.lang.String toString() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 1890622685958199240L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(1890622685958199240L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getClass().getName() + "[Size=" + this.u7 + "]";
    }
}
