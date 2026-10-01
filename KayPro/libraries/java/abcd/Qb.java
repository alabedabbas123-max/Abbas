package abcd;

@abcd.Interfacexu
public class Qb {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = -3105261584004538535L)
    private static final int[] j6 = null;

    @abcd.Interfaceru(field = 839709177539218629L)
    private int EQ;
    public final abcd.Qb.a Hw;

    @abcd.Interfaceru(field = 2641644404607903711L)
    private int[] VH;

    @abcd.Interfaceru(field = -295899937856454888L)
    private long[] Zo;

    @abcd.Interfaceru(field = -430888391209984172L)
    private int[] gn;

    @abcd.Interfaceru(field = -2412766364248464000L)
    private int tp;

    @abcd.Interfaceru(field = -1725515930123346312L)
    private int u7;

    @abcd.Interfaceru(field = 909678957481581749L)
    private long[] v5;

    @abcd.Interfacexu
    public class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -691564211716496928L)
        private int FH;

        @abcd.Interfaceru(field = 2004319005010315128L)
        private int Hw;

        @abcd.Interfacevu
        final abcd.Qb v5;

        static {
            abcd.wu.j6(abcd.Qb.a.class, 400920452278172695L, 400920452278172695L);
        }

        @abcd.Interfacesu(method = -165119742805953015L)
        private a(abcd.Qb r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 763482911649096663L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(763482911649096663L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.v5 = r6;     // Catch: java.lang.Throwable -> L8
            this.FH = 0;     // Catch: java.lang.Throwable -> L8
            this.Hw = 0;     // Catch: java.lang.Throwable -> L8
        }

        a(abcd.Qb r8, abcd.Pb r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 86746765712196159L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(86746765712196159L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }
    }

    static {
        abcd.wu.j6(abcd.Qb.class, -4539247182517018205L, -4539247182517018205L);     // Catch: java.lang.Throwable -> L8
        if (DW == false) goto L6;
        abcd.wu.j6(-463736038517153425L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -463736038517153425L, null);
    L12:
        throw th;
    }

    public Qb() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2138963765610002295L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2138963765610002295L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new abcd.Qb.a(this, null);     // Catch: java.lang.Throwable -> L8
        this.EQ = 0;     // Catch: java.lang.Throwable -> L8
        this.v5 = new long[j6[this.EQ]];     // Catch: java.lang.Throwable -> L8
        this.VH = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L8
        this.u7 = 0;     // Catch: java.lang.Throwable -> L8
        this.tp = 0;     // Catch: java.lang.Throwable -> L8
    }

    public Qb(abcd.ec r9) {
    L16:
        th = move-exception;
        if (FH == false) goto L21;
        abcd.wu.j6(th, 3431135177519370741L, null, r9);
    L21:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(3431135177519370741L, null, r9);     // Catch: java.lang.Throwable -> L16
    L6:
        this.Hw = new abcd.Qb.a(this, null);     // Catch: java.lang.Throwable -> L16
        this.tp = r9.readInt();     // Catch: java.lang.Throwable -> L16
        this.u7 = r9.readInt();     // Catch: java.lang.Throwable -> L16
        this.EQ = r9.readInt();     // Catch: java.lang.Throwable -> L16
        this.v5 = new long[j6[this.EQ]];     // Catch: java.lang.Throwable -> L16
        int r3 = 0;
        int r4 = 0;
    L8:
        if (r4 >= this.v5.length) goto L10;
        this.v5[r4] = r9.readLong();     // Catch: java.lang.Throwable -> L16
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L16
        goto L8
    L10:
        this.VH = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L16
    L11:
        if (r3 >= this.VH.length) goto L15;
        this.VH[r3] = r9.readInt();     // Catch: java.lang.Throwable -> L16
        r3 = r3 + 1;
        goto L11
    }

    @abcd.Interfacesu(method = 1119863829305088363L)
    private void j6() {
    L34:
        th = move-exception;
        if (FH == false) goto L39;
        abcd.wu.j6(th, 1597939349583119840L, this);
    L39:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(1597939349583119840L, this);     // Catch: java.lang.Throwable -> L34
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

    public int DW(int r8, int r9) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, -3309048933238468945L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-3309048933238468945L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        return DW((((long) r8) << 32) | ((long) r9));
    }

    public int DW(long r13) {
    L19:
        th = move-exception;
        if (FH == false) goto L24;
        abcd.wu.j6(th, -6140469894409196208L, this, new java.lang.Long(r13));
    L24:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-6140469894409196208L, this, new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L19
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

    public void DW(long r8, int r10) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, 3467374853702376924L, this, new java.lang.Long(r8), new java.lang.Integer(r10));
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(3467374853702376924L, this, new java.lang.Long(r8), new java.lang.Integer(r10));     // Catch: java.lang.Throwable -> L7
    L5:
        FH(r8);     // Catch: java.lang.Throwable -> L7
        j6(r8, r10);     // Catch: java.lang.Throwable -> L7
    }

    public void FH(long r13) {
    L18:
        th = move-exception;
        if (FH == false) goto L23;
        abcd.wu.j6(th, 295247275176219380L, this, new java.lang.Long(r13));
    L23:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(295247275176219380L, this, new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L18
    L7:
        if (r13 != 0) goto L9;
        r13 = Long.MAX_VALUE;
    L9:
        long r2 = Long.MAX_VALUE & r13;     // Catch: java.lang.Throwable -> L18
        int r7 = (int) (r2 % ((long) this.v5.length));     // Catch: java.lang.Throwable -> L18
        int r3 = ((int) (r2 % (((long) this.v5.length) - 2))) + 1;     // Catch: java.lang.Throwable -> L18
        long r8 = this.v5[r7];     // Catch: java.lang.Throwable -> L18
    L11:
        if (r8 == 0) goto L17;
        if (r8 != r13) goto L15;
        this.v5[r7] = Long.MIN_VALUE;     // Catch: java.lang.Throwable -> L18
        this.tp--;     // Catch: java.lang.Throwable -> L18
    L15:
        r7 = (r7 + r3) % this.v5.length;     // Catch: java.lang.Throwable -> L18
        r8 = this.v5[r7];     // Catch: java.lang.Throwable -> L18
        goto L11
    }

    public void j6(int r8) {
    L21:
        th = move-exception;
        if (FH == false) goto L26;
        abcd.wu.j6(th, -4234538833608172881L, this, new java.lang.Integer(r8));
    L26:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-4234538833608172881L, this, r8);     // Catch: java.lang.Throwable -> L21
    L7:
        if (this.u7 > 0) goto L9;
        return;
    L9:
        if (this.v5.length < r8) goto L15;
        this.EQ = 0;     // Catch: java.lang.Throwable -> L21
    L12:
        if (j6[this.EQ] >= (r8 * 2)) goto L14;
        this.EQ++;     // Catch: java.lang.Throwable -> L21
        goto L12
    L14:
        this.v5 = new long[j6[this.EQ]];     // Catch: java.lang.Throwable -> L21
        this.VH = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L21
    L19:
        this.u7 = 0;     // Catch: java.lang.Throwable -> L21
        this.tp = 0;     // Catch: java.lang.Throwable -> L21
        return;
    L15:
        int r2 = 0;
    L17:
        if (r2 >= this.v5.length) goto L19;
        this.v5[r2] = 0;     // Catch: java.lang.Throwable -> L21
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L21
        goto L17
    }

    public void j6(int r9, int r10, int r11) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, -5944588731342560115L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-5944588731342560115L, this, new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        DW((((long) r9) << 32) | ((long) r10), r11);     // Catch: java.lang.Throwable -> L7
    }

    public void j6(long r12, int r14) {
    L29:
        th = move-exception;
        if (FH == false) goto L34;
        abcd.wu.j6(th, -225338381748270000L, this, new java.lang.Long(r12), new java.lang.Integer(r14));
    L34:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(-225338381748270000L, this, new java.lang.Long(r12), new java.lang.Integer(r14));     // Catch: java.lang.Throwable -> L29
    L6:
        if (r12 != 0) goto L8;
        r12 = Long.MAX_VALUE;
    L8:
        long r0 = Long.MAX_VALUE & r12;     // Catch: java.lang.Throwable -> L29
        int r5 = (int) (r0 % ((long) this.v5.length));     // Catch: java.lang.Throwable -> L29
        int r1 = ((int) (r0 % (((long) this.v5.length) - 2))) + 1;     // Catch: java.lang.Throwable -> L29
        long r6 = this.v5[r5];     // Catch: java.lang.Throwable -> L29
        int r4 = -1;
    L10:
        if (r6 == 0) goto L20;
        if (r6 != r12) goto L17;
        if (this.VH[r5] != r14) goto L19;
        return;
    L19:
        r5 = (r5 + r1) % this.v5.length;     // Catch: java.lang.Throwable -> L29
        r6 = this.v5[r5];     // Catch: java.lang.Throwable -> L29
        goto L10
    L17:
        if (r6 != (-2147483648L)) goto L19;
        r4 = r5;
        goto L19
    L20:
        if (r4 == (-1)) goto L22;
        r5 = r4;
    L22:
        this.v5[r5] = r12;     // Catch: java.lang.Throwable -> L29
        this.VH[r5] = r14;     // Catch: java.lang.Throwable -> L29
        this.tp++;     // Catch: java.lang.Throwable -> L29
        if (r4 != (-1)) goto L26;
        this.u7++;     // Catch: java.lang.Throwable -> L29
    L26:
        if ((this.u7 * 2) <= this.v5.length) goto L43;
        j6();     // Catch: java.lang.Throwable -> L29
        return;
    }

    public void j6(abcd.fc r8) {
    L15:
        th = move-exception;
        if (FH == false) goto L20;
        abcd.wu.j6(th, -782408673491432715L, this, r8);
    L20:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-782408673491432715L, this, r8);     // Catch: java.lang.Throwable -> L15
    L6:
        r8.writeInt(this.tp);     // Catch: java.lang.Throwable -> L15
        r8.writeInt(this.u7);     // Catch: java.lang.Throwable -> L15
        r8.writeInt(this.EQ);     // Catch: java.lang.Throwable -> L15
        int r2 = 0;
        int r3 = 0;
    L8:
        if (r3 >= this.v5.length) goto L10;
        r8.writeLong(this.v5[r3]);     // Catch: java.lang.Throwable -> L15
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L15
    L10:
        if (r2 >= this.VH.length) goto L14;
        r8.writeInt(this.VH[r2]);     // Catch: java.lang.Throwable -> L15
        r2 = r2 + 1;
        goto L10
    }

    public boolean j6(int r8, int r9) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, 1254770687444558424L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(1254770687444558424L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        return j6((((long) r8) << 32) | ((long) r9));
    }

    public boolean j6(long r13) {
    L19:
        th = move-exception;
        if (FH == false) goto L24;
        abcd.wu.j6(th, -1295537802859789331L, this, new java.lang.Long(r13));
    L24:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-1295537802859789331L, this, new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L19
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
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2968870889585594119L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2968870889585594119L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getClass().getName() + "[Size=" + this.tp + "]";
    }
}
