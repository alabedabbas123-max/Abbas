package abcd;

@abcd.Interfacexu
public class ub {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = -11784326254558620L)
    private static final int[] j6 = null;

    @abcd.Interfaceru(field = -1537364462906718880L)
    private int EQ;
    public final abcd.ub.a Hw;

    @abcd.Interfaceru(field = 2036516144078093424L)
    private int[] VH;

    @abcd.Interfaceru(field = -2524712710769442425L)
    private long[] Zo;

    @abcd.Interfaceru(field = 2644252862294472625L)
    private int[] gn;

    @abcd.Interfaceru(field = 638214035480845441L)
    private int tp;

    @abcd.Interfaceru(field = 1241046473090080679L)
    private int u7;

    @abcd.Interfaceru(field = -1476769781514878496L)
    private long[] v5;

    @abcd.Interfacexu
    public class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 2122079007204384364L)
        private int FH;

        @abcd.Interfaceru(field = 1348832837446472212L)
        private int Hw;

        @abcd.Interfacevu
        final abcd.ub v5;

        static {
            abcd.wu.j6(abcd.ub.a.class, 5292118356782114075L, 5292118356782114075L);
        }

        @abcd.Interfacesu(method = 33808782387511215L)
        private a(abcd.ub r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 435738392491990605L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(435738392491990605L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.v5 = r6;     // Catch: java.lang.Throwable -> L8
            this.FH = 0;     // Catch: java.lang.Throwable -> L8
            this.Hw = 0;     // Catch: java.lang.Throwable -> L8
        }

        a(abcd.ub r8, abcd.tb r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -134400406678034873L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-134400406678034873L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }
    }

    static {
        abcd.wu.j6(abcd.ub.class, -841303878985533273L, -841303878985533273L);     // Catch: java.lang.Throwable -> L8
        if (DW == false) goto L6;
        abcd.wu.j6(3248469553883527700L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 3248469553883527700L, null);
    L12:
        throw th;
    }

    public ub() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -4715908203577089120L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-4715908203577089120L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new abcd.ub.a(this, null);     // Catch: java.lang.Throwable -> L8
        this.EQ = 0;     // Catch: java.lang.Throwable -> L8
        this.v5 = new long[j6[this.EQ]];     // Catch: java.lang.Throwable -> L8
        this.VH = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L8
        this.u7 = 0;     // Catch: java.lang.Throwable -> L8
        this.tp = 0;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -2600286742085766684L)
    private void FH() {
    L34:
        th = move-exception;
        if (FH == false) goto L39;
        abcd.wu.j6(th, -355236792828969195L, this);
    L39:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-355236792828969195L, this);     // Catch: java.lang.Throwable -> L34
    L6:
        int r7 = 0;
        if ((this.tp * 2) <= this.v5.length) goto L10;
        this.EQ++;     // Catch: java.lang.Throwable -> L34
        this.Zo = null;     // Catch: java.lang.Throwable -> L34
        this.gn = null;     // Catch: java.lang.Throwable -> L34
        long[] r0 = new long[j6[this.EQ]];     // Catch: java.lang.Throwable -> L34
        int[] r4 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L34
    L19:
        int r8 = 0;
    L21:
        if (r7 >= this.v5.length) goto L32;
        long r10 = this.v5[r7];     // Catch: java.lang.Throwable -> L34
        if (r10 == 0) goto L31;
        if (r10 == Long.MIN_VALUE) goto L31;
        long r12 = Long.MAX_VALUE & r10;     // Catch: java.lang.Throwable -> L34
        int r9 = (int) (r12 % ((long) r0.length));     // Catch: java.lang.Throwable -> L34
        int r13 = ((int) (r12 % (((long) r0.length) - 2))) + 1;     // Catch: java.lang.Throwable -> L34
    L28:
        if (r0[r9] == 0) goto L30;
        r9 = (r9 + r13) % r0.length;     // Catch: java.lang.Throwable -> L34
        goto L28
    L30:
        r0[r9] = r10;     // Catch: java.lang.Throwable -> L34
        r4[r9] = this.VH[r7];     // Catch: java.lang.Throwable -> L34
        r8 = r8 + 1;     // Catch: java.lang.Throwable -> L34
    L31:
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L34
        goto L21
    L32:
        this.v5 = r0;     // Catch: java.lang.Throwable -> L34
        this.VH = r4;     // Catch: java.lang.Throwable -> L34
        this.u7 = r8;     // Catch: java.lang.Throwable -> L34
        return;
    L10:
        if (this.Zo != null) goto L12;
    L18:
        this.Zo = this.v5;     // Catch: java.lang.Throwable -> L34
        this.gn = this.VH;     // Catch: java.lang.Throwable -> L34
        r0 = new long[j6[this.EQ]];     // Catch: java.lang.Throwable -> L34
        r4 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L34
        goto L19
    L12:
        if (this.Zo.length != this.v5.length) goto L18;
        r0 = this.Zo;     // Catch: java.lang.Throwable -> L34
        int r5 = 0;
    L15:
        if (r5 >= r0.length) goto L17;
        r0[r5] = 0;     // Catch: java.lang.Throwable -> L34
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L34
        goto L15
    L17:
        r4 = this.gn;     // Catch: java.lang.Throwable -> L34
        this.Zo = this.v5;     // Catch: java.lang.Throwable -> L34
        this.gn = this.VH;     // Catch: java.lang.Throwable -> L34
        goto L19
    }

    public int DW() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 1421119522668328021L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(1421119522668328021L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.tp;
    }

    public int DW(long r13) {
    L19:
        th = move-exception;
        if (FH == false) goto L24;
        abcd.wu.j6(th, -7782042155463490131L, this, new java.lang.Long(r13));
    L24:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-7782042155463490131L, this, new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L19
    L7:
        if (r13 != 0) goto L9;
        r13 = Long.MAX_VALUE;
    L9:
        long r2 = Long.MAX_VALUE & r13;     // Catch: java.lang.Throwable -> L19
        int r7 = (int) (r2 % ((long) this.v5.length));     // Catch: java.lang.Throwable -> L19
        int r3 = ((int) (r2 % (((long) this.v5.length) - 2))) + 1;     // Catch: java.lang.Throwable -> L19
        long r8 = this.v5[r7];     // Catch: java.lang.Throwable -> L19
    L11:
        if (r8 == r13) goto L17;
        if (r8 == 0) goto L14;
        r7 = (r7 + r3) % this.v5.length;     // Catch: java.lang.Throwable -> L19
        r8 = this.v5[r7];     // Catch: java.lang.Throwable -> L19
        goto L11
    L14:
        return -1;
    L17:
        return this.VH[r7];
    }

    public void j6() {
    L14:
        th = move-exception;
        if (FH == false) goto L19;
        abcd.wu.j6(th, -1237326473175517197L, this);
    L19:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-1237326473175517197L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.u7 <= 0) goto L24;
        int r3 = 0;
    L10:
        if (r3 >= this.v5.length) goto L12;
        this.v5[r3] = 0;     // Catch: java.lang.Throwable -> L14
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L14
        goto L10
    L12:
        this.u7 = 0;     // Catch: java.lang.Throwable -> L14
        this.tp = 0;     // Catch: java.lang.Throwable -> L14
        return;
    }

    public void j6(long r12, int r14) {
    L30:
        th = move-exception;
        if (FH == false) goto L35;
        abcd.wu.j6(th, -3123752686141576509L, this, new java.lang.Long(r12), new java.lang.Integer(r14));
    L35:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(-3123752686141576509L, this, new java.lang.Long(r12), new java.lang.Integer(r14));     // Catch: java.lang.Throwable -> L30
    L6:
        if (r12 != 0) goto L8;
        r12 = Long.MAX_VALUE;
    L8:
        long r0 = Long.MAX_VALUE & r12;     // Catch: java.lang.Throwable -> L30
        int r5 = (int) (r0 % ((long) this.v5.length));     // Catch: java.lang.Throwable -> L30
        int r1 = ((int) (r0 % (((long) this.v5.length) - 2))) + 1;     // Catch: java.lang.Throwable -> L30
        long r6 = this.v5[r5];     // Catch: java.lang.Throwable -> L30
        int r4 = -1;
    L10:
        if (r6 == 0) goto L21;
        if (r6 != r12) goto L18;
        if (this.VH[r5] == r14) goto L15;
        this.v5[r5] = Long.MIN_VALUE;     // Catch: java.lang.Throwable -> L30
        this.tp--;     // Catch: java.lang.Throwable -> L30
    L20:
        r5 = (r5 + r1) % this.v5.length;     // Catch: java.lang.Throwable -> L30
        r6 = this.v5[r5];     // Catch: java.lang.Throwable -> L30
        goto L10
    L15:
        return;
    L18:
        if (r6 != Long.MIN_VALUE) goto L20;
        r4 = r5;
        goto L20
    L21:
        if (r4 == (-1)) goto L23;
        r5 = r4;
    L23:
        this.v5[r5] = r12;     // Catch: java.lang.Throwable -> L30
        this.VH[r5] = r14;     // Catch: java.lang.Throwable -> L30
        this.tp++;     // Catch: java.lang.Throwable -> L30
        if (r4 != (-1)) goto L27;
        this.u7++;     // Catch: java.lang.Throwable -> L30
    L27:
        if ((this.u7 * 2) <= this.v5.length) goto L44;
        FH();     // Catch: java.lang.Throwable -> L30
        return;
    }

    public boolean j6(long r13) {
    L19:
        th = move-exception;
        if (FH == false) goto L24;
        abcd.wu.j6(th, 815730037251973760L, this, new java.lang.Long(r13));
    L24:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(815730037251973760L, this, new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L19
    L7:
        if (r13 != 0) goto L9;
        r13 = Long.MAX_VALUE;
    L9:
        long r2 = Long.MAX_VALUE & r13;     // Catch: java.lang.Throwable -> L19
        int r7 = (int) (r2 % ((long) this.v5.length));     // Catch: java.lang.Throwable -> L19
        int r3 = ((int) (r2 % (((long) this.v5.length) - 2))) + 1;     // Catch: java.lang.Throwable -> L19
        long r8 = this.v5[r7];     // Catch: java.lang.Throwable -> L19
    L11:
        if (r8 == r13) goto L18;
        if (r8 == 0) goto L14;
        r7 = (r7 + r3) % this.v5.length;     // Catch: java.lang.Throwable -> L19
        r8 = this.v5[r7];     // Catch: java.lang.Throwable -> L19
        goto L11
    L14:
        return false;
    L18:
        return true;
    }

    public java.lang.String toString() {
    L21:
        th = move-exception;
        if (FH == false) goto L26;
        abcd.wu.j6(th, 855331686624496424L, this);
    L26:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(855331686624496424L, this);     // Catch: java.lang.Throwable -> L21
    L6:
        java.lang.String r2 = "{";
        int r3 = 0;
    L8:
        if (r3 >= this.v5.length) goto L19;
        long r5 = this.v5[r3];     // Catch: java.lang.Throwable -> L21
        if (r5 == 0) goto L18;
        if (r5 == Long.MIN_VALUE) goto L18;
        int r4 = this.VH[r3];     // Catch: java.lang.Throwable -> L21
        if (r5 != Long.MAX_VALUE) goto L17;
        r2 = r2 + "0->" + r4 + ", ";     // Catch: java.lang.Throwable -> L21
        goto L18
    L17:
        r2 = r2 + r5 + "->" + r4 + ", ";     // Catch: java.lang.Throwable -> L21
    L18:
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L21
        goto L8
    L19:
        return r2 + "}";
    }
}
