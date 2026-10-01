package abcd;

@abcd.Interfacexu
public class Kb {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = 952109684946897300L)
    private static final int[] j6 = null;

    @abcd.Interfaceru(field = 2368814562314603200L)
    private int EQ;
    public final abcd.Kb.a Hw;

    @abcd.Interfaceru(field = -1415512143243953280L)
    private int[] VH;

    @abcd.Interfaceru(field = 1373270203344798527L)
    private int[] Zo;

    @abcd.Interfaceru(field = -35692828007601279L)
    private int[] gn;

    @abcd.Interfaceru(field = 1618774196975708625L)
    private int tp;

    @abcd.Interfaceru(field = 2220502582710722127L)
    private int u7;

    @abcd.Interfaceru(field = 1384266291851926712L)
    private int[] v5;

    @abcd.Interfacexu
    public class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 2506551853044960284L)
        private int FH;

        @abcd.Interfaceru(field = -1353463936327969180L)
        private int Hw;

        @abcd.Interfaceru(field = 574496785979409600L)
        private int VH;

        @abcd.Interfaceru(field = 3020851637804340809L)
        private int Zo;

        @abcd.Interfacevu
        final abcd.Kb gn;

        @abcd.Interfaceru(field = -1030136139207055125L)
        private int v5;

        static {
            abcd.wu.j6(abcd.Kb.a.class, -268052789629962480L, -268052789629962480L);
        }

        @abcd.Interfacesu(method = -75153925334932032L)
        private a(abcd.Kb r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -138991161835729973L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-138991161835729973L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.gn = r6;     // Catch: java.lang.Throwable -> L8
            this.FH = 0;     // Catch: java.lang.Throwable -> L8
            this.Hw = 0;     // Catch: java.lang.Throwable -> L8
        }

        a(abcd.Kb r8, abcd.Jb r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1108979900001645584L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-1108979900001645584L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }

        public void DW() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -577549524988802352L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-577549524988802352L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH = 0;     // Catch: java.lang.Throwable -> L8
            this.Hw = 0;     // Catch: java.lang.Throwable -> L8
        }

        public int FH() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1795262040206385024L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1795262040206385024L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.v5;
        }

        public int Hw() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -3357496083471202848L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-3357496083471202848L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.Zo;
        }

        public void j6(int r5) {
        L11:
            th = move-exception;
            if (DW == false) goto L15;
            abcd.wu.j6(th, 1110043169612655741L, this, new java.lang.Integer(r5));
        L15:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(1110043169612655741L, this, r5);     // Catch: java.lang.Throwable -> L11
        L7:
            if (r5 != 0) goto L9;
            r5 = Integer.MAX_VALUE;
        L9:
            this.VH = r5;     // Catch: java.lang.Throwable -> L11
            int r2 = Integer.MAX_VALUE & r5;     // Catch: java.lang.Throwable -> L11
            this.Hw = (r2 % (abcd.Kb.j6(this.gn).length - 2)) + 1;     // Catch: java.lang.Throwable -> L11
            this.FH = r2 % abcd.Kb.j6(this.gn).length;     // Catch: java.lang.Throwable -> L11
        }

        public boolean j6() {
        L33:
            th = move-exception;
            if (DW == false) goto L38;
            abcd.wu.j6(th, 4062361068202258368L, this);
        L38:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(4062361068202258368L, this);     // Catch: java.lang.Throwable -> L33
        L7:
            if (this.Hw == 0) goto L9;
        L21:
            this.v5 = abcd.Kb.j6(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            if (this.v5 == 0) goto L23;
            if (this.v5 == this.VH) goto L27;
            this.FH = (this.FH + this.Hw) % abcd.Kb.j6(this.gn).length;     // Catch: java.lang.Throwable -> L33
            goto L21
        L27:
            if (this.v5 != Integer.MAX_VALUE) goto L29;
            this.v5 = 0;     // Catch: java.lang.Throwable -> L33
        L29:
            this.Zo = abcd.Kb.DW(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            this.FH = (this.FH + this.Hw) % abcd.Kb.j6(this.gn).length;     // Catch: java.lang.Throwable -> L33
            return true;
        L23:
            return false;
        L9:
            if (this.FH >= abcd.Kb.j6(this.gn).length) goto L10;
            this.v5 = abcd.Kb.j6(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            if (this.v5 == 0) goto L20;
            if (this.v5 == Integer.MIN_VALUE) goto L20;
            if (this.v5 != Integer.MAX_VALUE) goto L18;
            this.v5 = 0;     // Catch: java.lang.Throwable -> L33
        L18:
            this.Zo = abcd.Kb.DW(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            this.FH++;     // Catch: java.lang.Throwable -> L33
            return true;
        L20:
            this.FH++;     // Catch: java.lang.Throwable -> L33
            goto L9
        L10:
            return false;
        }
    }

    static {
        abcd.wu.j6(abcd.Kb.class, 2451584352145441620L, 2451584352145441620L);     // Catch: java.lang.Throwable -> L8
        if (DW == false) goto L6;
        abcd.wu.j6(-1187631115837145472L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -1187631115837145472L, null);
    L12:
        throw th;
    }

    public Kb() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2320650060286383679L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2320650060286383679L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new abcd.Kb.a(this, null);     // Catch: java.lang.Throwable -> L8
        this.EQ = 0;     // Catch: java.lang.Throwable -> L8
        this.v5 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L8
        this.VH = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L8
        this.u7 = 0;     // Catch: java.lang.Throwable -> L8
        this.tp = 0;     // Catch: java.lang.Throwable -> L8
    }

    public Kb(abcd.ec r8) {
    L11:
        th = move-exception;
        if (FH == false) goto L16;
        abcd.wu.j6(th, 1879472473865004525L, null, r8);
    L16:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(1879472473865004525L, null, r8);     // Catch: java.lang.Throwable -> L11
    L6:
        this.Hw = new abcd.Kb.a(this, null);     // Catch: java.lang.Throwable -> L11
        int r3 = r8.readInt();     // Catch: java.lang.Throwable -> L11
        this.EQ = r8.readInt();     // Catch: java.lang.Throwable -> L11
        this.v5 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L11
        this.VH = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L11
        int r4 = 0;
        this.u7 = 0;     // Catch: java.lang.Throwable -> L11
        this.tp = 0;     // Catch: java.lang.Throwable -> L11
    L7:
        if (r4 >= r3) goto L10;
        j6(r8.readInt(), r8.readInt());     // Catch: java.lang.Throwable -> L11
        r4 = r4 + 1;
        goto L7
    }

    static int[] DW(abcd.Kb r0) {
        return r0.VH;
    }

    @abcd.Interfacesu(method = 113015990092057956L)
    private void FH() {
    L34:
        th = move-exception;
        if (FH == false) goto L39;
        abcd.wu.j6(th, -76187676909011913L, this);
    L39:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-76187676909011913L, this);     // Catch: java.lang.Throwable -> L34
    L6:
        int r4 = 0;
        if ((this.tp * 2) <= this.v5.length) goto L10;
        this.EQ++;     // Catch: java.lang.Throwable -> L34
        this.Zo = null;     // Catch: java.lang.Throwable -> L34
        this.gn = null;     // Catch: java.lang.Throwable -> L34
        int[] r2 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L34
        int[] r3 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L34
    L19:
        int r5 = 0;
    L21:
        if (r4 >= this.v5.length) goto L32;
        int r6 = this.v5[r4];     // Catch: java.lang.Throwable -> L34
        if (r6 == 0) goto L31;
        if (r6 == Integer.MIN_VALUE) goto L31;
        int r7 = Integer.MAX_VALUE & r6;     // Catch: java.lang.Throwable -> L34
        int r8 = (r7 % (r2.length - 2)) + 1;     // Catch: java.lang.Throwable -> L34
        int r9 = r7 % r2.length;     // Catch: java.lang.Throwable -> L34
    L28:
        if (r2[r9] == 0) goto L30;
        r9 = (r9 + r8) % r2.length;     // Catch: java.lang.Throwable -> L34
        goto L28
    L30:
        r2[r9] = r6;     // Catch: java.lang.Throwable -> L34
        r3[r9] = this.VH[r4];     // Catch: java.lang.Throwable -> L34
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L34
    L31:
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L34
        goto L21
    L32:
        this.v5 = r2;     // Catch: java.lang.Throwable -> L34
        this.VH = r3;     // Catch: java.lang.Throwable -> L34
        this.u7 = r5;     // Catch: java.lang.Throwable -> L34
        return;
    L10:
        if (this.Zo != null) goto L12;
    L18:
        this.Zo = this.v5;     // Catch: java.lang.Throwable -> L34
        this.gn = this.VH;     // Catch: java.lang.Throwable -> L34
        r2 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L34
        r3 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L34
        goto L19
    L12:
        if (this.Zo.length != this.v5.length) goto L18;
        r2 = this.Zo;     // Catch: java.lang.Throwable -> L34
        int r10 = 0;
    L15:
        if (r10 >= r2.length) goto L17;
        r2[r10] = 0;     // Catch: java.lang.Throwable -> L34
        r10 = r10 + 1;     // Catch: java.lang.Throwable -> L34
        goto L15
    L17:
        r3 = this.gn;     // Catch: java.lang.Throwable -> L34
        this.Zo = this.v5;     // Catch: java.lang.Throwable -> L34
        this.gn = this.VH;     // Catch: java.lang.Throwable -> L34
        goto L19
    }

    static int[] j6(abcd.Kb r0) {
        return r0.v5;
    }

    public abcd.Kb.a DW() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 407508767655614952L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(407508767655614952L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return new abcd.Kb.a(this, null);
    }

    public void DW(int r9, int r10) {
    L29:
        th = move-exception;
        if (FH == false) goto L34;
        abcd.wu.j6(th, 4676563592341575375L, this, new java.lang.Integer(r9), new java.lang.Integer(r10));
    L34:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(4676563592341575375L, this, new java.lang.Integer(r9), new java.lang.Integer(r10));     // Catch: java.lang.Throwable -> L29
    L6:
        if (r9 != 0) goto L8;
        r9 = Integer.MAX_VALUE;
    L8:
        int r0 = Integer.MAX_VALUE & r9;     // Catch: java.lang.Throwable -> L29
        int r1 = r0 % this.v5.length;     // Catch: java.lang.Throwable -> L29
        int r2 = (r0 % (this.v5.length - 2)) + 1;     // Catch: java.lang.Throwable -> L29
        boolean r3 = false;
        int r4 = this.v5[r1];     // Catch: java.lang.Throwable -> L29
        int r6 = r1;
        int r5 = -1;
    L9:
        if (r4 == 0) goto L19;
        if (r4 == r9) goto L13;
        if (r4 != Integer.MIN_VALUE) goto L18;
        r5 = r6;
    L18:
        r6 = (r6 + r2) % this.v5.length;     // Catch: java.lang.Throwable -> L29
        r4 = this.v5[r6];     // Catch: java.lang.Throwable -> L29
        goto L9
    L13:
        if (this.VH[r6] != r10) goto L15;
        r3 = true;
        goto L18
    L15:
        this.v5[r6] = Integer.MIN_VALUE;     // Catch: java.lang.Throwable -> L29
        this.tp--;     // Catch: java.lang.Throwable -> L29
        goto L18
    L19:
        if (r3 == true) goto L43;
        if (r5 == (-1)) goto L22;
        r6 = r5;
    L22:
        this.v5[r6] = r9;     // Catch: java.lang.Throwable -> L29
        this.VH[r6] = r10;     // Catch: java.lang.Throwable -> L29
        this.tp++;     // Catch: java.lang.Throwable -> L29
        if (r5 != (-1)) goto L26;
        this.u7++;     // Catch: java.lang.Throwable -> L29
    L26:
        if ((this.u7 * 2) <= this.v5.length) goto L44;
        FH();     // Catch: java.lang.Throwable -> L29
        return;
    L44:
        return;
    }

    public boolean DW(int r7) {
    L17:
        th = move-exception;
        if (FH == false) goto L22;
        abcd.wu.j6(th, 738290232207132000L, this, new java.lang.Integer(r7));
    L22:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(738290232207132000L, this, r7);     // Catch: java.lang.Throwable -> L17
    L7:
        if (r7 != 0) goto L9;
        r7 = Integer.MAX_VALUE;
    L9:
        int r2 = Integer.MAX_VALUE & r7;     // Catch: java.lang.Throwable -> L17
        int r3 = (r2 % (this.v5.length - 2)) + 1;     // Catch: java.lang.Throwable -> L17
        int r4 = r2 % this.v5.length;     // Catch: java.lang.Throwable -> L17
        int r5 = this.v5[r4];     // Catch: java.lang.Throwable -> L17
    L10:
        if (r5 == r7) goto L16;
        if (r5 == 0) goto L12;
        r4 = (r4 + r3) % this.v5.length;     // Catch: java.lang.Throwable -> L17
        r5 = this.v5[r4];     // Catch: java.lang.Throwable -> L17
        goto L10
    L12:
        return false;
    L16:
        return true;
    }

    public int FH(int r6) {
    L17:
        th = move-exception;
        if (FH == false) goto L22;
        abcd.wu.j6(th, -966755981223307945L, this, new java.lang.Integer(r6));
    L22:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-966755981223307945L, this, r6);     // Catch: java.lang.Throwable -> L17
    L7:
        if (r6 != 0) goto L9;
        r6 = Integer.MAX_VALUE;
    L9:
        int r2 = Integer.MAX_VALUE & r6;     // Catch: java.lang.Throwable -> L17
        int r3 = (r2 % (this.v5.length - 2)) + 1;     // Catch: java.lang.Throwable -> L17
        int r4 = r2 % this.v5.length;     // Catch: java.lang.Throwable -> L17
        int r5 = this.v5[r4];     // Catch: java.lang.Throwable -> L17
    L10:
        if (r5 == r6) goto L15;
        if (r5 == 0) goto L12;
        r4 = (r4 + r3) % this.v5.length;     // Catch: java.lang.Throwable -> L17
        r5 = this.v5[r4];     // Catch: java.lang.Throwable -> L17
        goto L10
    L12:
        return -1;
    L15:
        return this.VH[r4];
    }

    public void FH(int r8, int r9) {
    L17:
        th = move-exception;
        if (FH == false) goto L22;
        abcd.wu.j6(th, 3850956080653223520L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L22:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(3850956080653223520L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L17
    L6:
        if (r8 != 0) goto L8;
        r8 = Integer.MAX_VALUE;
    L8:
        int r0 = Integer.MAX_VALUE & r8;     // Catch: java.lang.Throwable -> L17
        int r1 = r0 % this.v5.length;     // Catch: java.lang.Throwable -> L17
        int r2 = (r0 % (this.v5.length - 2)) + 1;     // Catch: java.lang.Throwable -> L17
        int r3 = this.v5[r1];     // Catch: java.lang.Throwable -> L17
    L9:
        if (r3 == 0) goto L16;
        if (r3 != r8) goto L14;
        if (this.VH[r1] != r9) goto L14;
        this.v5[r1] = Integer.MIN_VALUE;     // Catch: java.lang.Throwable -> L17
        this.tp--;     // Catch: java.lang.Throwable -> L17
    L14:
        r1 = (r1 + r2) % this.v5.length;     // Catch: java.lang.Throwable -> L17
        r3 = this.v5[r1];     // Catch: java.lang.Throwable -> L17
        goto L9
    }

    public void FH(abcd.Kb r8) {
    L18:
        th = move-exception;
        if (FH == false) goto L23;
        abcd.wu.j6(th, 108455174511798600L, this, r8);
    L23:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(108455174511798600L, this, r8);     // Catch: java.lang.Throwable -> L18
    L6:
        int r3 = 0;
    L7:
        if (r3 >= r8.v5.length) goto L17;
        int r4 = r8.v5[r3];     // Catch: java.lang.Throwable -> L18
        int r5 = r8.VH[r3];     // Catch: java.lang.Throwable -> L18
        if (r4 != Integer.MAX_VALUE) goto L12;
        j6(0, r5);     // Catch: java.lang.Throwable -> L18
    L16:
        r3 = r3 + 1;
        goto L7
    L12:
        if (r4 == 0) goto L16;
        if (r4 == Integer.MIN_VALUE) goto L16;
        j6(r4, r5);     // Catch: java.lang.Throwable -> L18
        goto L16
    }

    public void Hw(int r7) {
    L16:
        th = move-exception;
        if (FH == false) goto L21;
        abcd.wu.j6(th, 2007957929180410261L, this, new java.lang.Integer(r7));
    L21:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(2007957929180410261L, this, r7);     // Catch: java.lang.Throwable -> L16
    L7:
        if (r7 != 0) goto L9;
        r7 = Integer.MAX_VALUE;
    L9:
        int r2 = Integer.MAX_VALUE & r7;     // Catch: java.lang.Throwable -> L16
        int r3 = r2 % this.v5.length;     // Catch: java.lang.Throwable -> L16
        int r4 = (r2 % (this.v5.length - 2)) + 1;     // Catch: java.lang.Throwable -> L16
        int r5 = this.v5[r3];     // Catch: java.lang.Throwable -> L16
    L10:
        if (r5 == 0) goto L15;
        if (r5 != r7) goto L13;
        this.v5[r3] = Integer.MIN_VALUE;     // Catch: java.lang.Throwable -> L16
        this.tp--;     // Catch: java.lang.Throwable -> L16
    L13:
        r3 = (r3 + r4) % this.v5.length;     // Catch: java.lang.Throwable -> L16
        r5 = this.v5[r3];     // Catch: java.lang.Throwable -> L16
        goto L10
    }

    public void j6() {
    L14:
        th = move-exception;
        if (FH == false) goto L19;
        abcd.wu.j6(th, 333636021579215961L, this);
    L19:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(333636021579215961L, this);     // Catch: java.lang.Throwable -> L14
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

    public void j6(int r6) {
    L21:
        th = move-exception;
        if (FH == false) goto L26;
        abcd.wu.j6(th, 5686622021455212432L, this, new java.lang.Integer(r6));
    L26:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(5686622021455212432L, this, r6);     // Catch: java.lang.Throwable -> L21
    L7:
        if (this.u7 > 0) goto L9;
        return;
    L9:
        if (this.v5.length < r6) goto L15;
        this.EQ = 0;     // Catch: java.lang.Throwable -> L21
    L12:
        if (j6[this.EQ] >= (r6 * 2)) goto L14;
        this.EQ++;     // Catch: java.lang.Throwable -> L21
        goto L12
    L14:
        this.v5 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L21
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

    public void j6(int r8, int r9) {
    L27:
        th = move-exception;
        if (FH == false) goto L32;
        abcd.wu.j6(th, -6333112258103675653L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L32:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(-6333112258103675653L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L27
    L6:
        if (r8 != 0) goto L8;
        r8 = Integer.MAX_VALUE;
    L8:
        int r0 = Integer.MAX_VALUE & r8;     // Catch: java.lang.Throwable -> L27
        int r1 = r0 % this.v5.length;     // Catch: java.lang.Throwable -> L27
        int r2 = (r0 % (this.v5.length - 2)) + 1;     // Catch: java.lang.Throwable -> L27
        int r3 = this.v5[r1];     // Catch: java.lang.Throwable -> L27
        int r4 = r1;
        int r5 = -1;
    L9:
        if (r3 == 0) goto L18;
        if (r3 != r8) goto L15;
        if (this.VH[r4] != r9) goto L17;
        return;
    L17:
        r4 = (r4 + r2) % this.v5.length;     // Catch: java.lang.Throwable -> L27
        r3 = this.v5[r4];     // Catch: java.lang.Throwable -> L27
        goto L9
    L15:
        if (r3 != Integer.MIN_VALUE) goto L17;
        r5 = r4;
        goto L17
    L18:
        if (r5 == (-1)) goto L20;
        r4 = r5;
    L20:
        this.v5[r4] = r8;     // Catch: java.lang.Throwable -> L27
        this.VH[r4] = r9;     // Catch: java.lang.Throwable -> L27
        this.tp++;     // Catch: java.lang.Throwable -> L27
        if (r5 != (-1)) goto L24;
        this.u7++;     // Catch: java.lang.Throwable -> L27
    L24:
        if ((this.u7 * 2) <= this.v5.length) goto L41;
        FH();     // Catch: java.lang.Throwable -> L27
        return;
    }

    public void j6(abcd.fc r6) {
    L16:
        th = move-exception;
        if (FH == false) goto L21;
        abcd.wu.j6(th, 7412056296506818320L, this, r6);
    L21:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(7412056296506818320L, this, r6);     // Catch: java.lang.Throwable -> L16
    L6:
        r6.writeInt(this.tp);     // Catch: java.lang.Throwable -> L16
        r6.writeInt(this.EQ);     // Catch: java.lang.Throwable -> L16
        int r2 = 0;
    L7:
        if (r2 >= this.v5.length) goto L15;
        int r3 = this.v5[r2];     // Catch: java.lang.Throwable -> L16
        if (r3 == 0) goto L14;
        if (r3 == Integer.MIN_VALUE) goto L14;
        r6.writeInt(this.v5[r2]);     // Catch: java.lang.Throwable -> L16
        r6.writeInt(this.VH[r2]);     // Catch: java.lang.Throwable -> L16
    L14:
        r2 = r2 + 1;
        goto L7
    }

    public java.lang.String toString() {
    L21:
        th = move-exception;
        if (FH == false) goto L26;
        abcd.wu.j6(th, 3384168664103562052L, this);
    L26:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(3384168664103562052L, this);     // Catch: java.lang.Throwable -> L21
    L6:
        java.lang.String r2 = "{";
        int r3 = 0;
    L8:
        if (r3 >= this.v5.length) goto L19;
        int r4 = this.v5[r3];     // Catch: java.lang.Throwable -> L21
        if (r4 == 0) goto L18;
        if (r4 == Integer.MIN_VALUE) goto L18;
        int r5 = this.VH[r3];     // Catch: java.lang.Throwable -> L21
        if (r4 != Integer.MAX_VALUE) goto L17;
        r2 = r2 + "0->" + r5 + ", ";     // Catch: java.lang.Throwable -> L21
        goto L18
    L17:
        r2 = r2 + r4 + "->" + r5 + ", ";     // Catch: java.lang.Throwable -> L21
    L18:
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L21
        goto L8
    L19:
        return r2 + "}";
    }
}
