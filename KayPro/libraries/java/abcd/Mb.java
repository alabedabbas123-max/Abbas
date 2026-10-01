package abcd;

@abcd.Interfacexu
public class Mb {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = -2275320006339553467L)
    private static final int[] j6 = null;

    @abcd.Interfaceru(field = 786691153589216409L)
    private int EQ;
    public final abcd.Mb.a Hw;

    @abcd.Interfaceru(field = -2446175920963666885L)
    private long[] VH;

    @abcd.Interfaceru(field = -283292406876403128L)
    private int[] Zo;

    @abcd.Interfaceru(field = 2892985364442350492L)
    private long[] gn;

    @abcd.Interfaceru(field = -1617592964811371808L)
    private int tp;

    @abcd.Interfaceru(field = -972234468924051760L)
    private int u7;

    @abcd.Interfaceru(field = 2139040437303671929L)
    private int[] v5;

    @abcd.Interfacexu
    public class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 1272651770239836L)
        private int FH;

        @abcd.Interfaceru(field = 733336819445981124L)
        private int Hw;

        @abcd.Interfaceru(field = 1577189990889793104L)
        private int VH;

        @abcd.Interfaceru(field = 510401075817958521L)
        private long Zo;

        @abcd.Interfacevu
        final abcd.Mb gn;

        @abcd.Interfaceru(field = -2455928137690763853L)
        private int v5;

        static {
            abcd.wu.j6(abcd.Mb.a.class, 2776620608827402095L, 2776620608827402095L);
        }

        @abcd.Interfacesu(method = -31854801244726816L)
        private a(abcd.Mb r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -450109477765826860L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-450109477765826860L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.gn = r6;     // Catch: java.lang.Throwable -> L8
            this.FH = 0;     // Catch: java.lang.Throwable -> L8
            this.Hw = 0;     // Catch: java.lang.Throwable -> L8
        }

        a(abcd.Mb r8, abcd.Lb r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 1243161846285260265L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(1243161846285260265L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }

        public void DW() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 683785028023098507L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(683785028023098507L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH = 0;     // Catch: java.lang.Throwable -> L8
            this.Hw = 0;     // Catch: java.lang.Throwable -> L8
        }

        public int FH() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1034110458154151253L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1034110458154151253L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.v5;
        }

        public long Hw() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2309561034054458199L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2309561034054458199L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.Zo;
        }

        public boolean j6() {
        L33:
            th = move-exception;
            if (DW == false) goto L38;
            abcd.wu.j6(th, 724731773040276897L, this);
        L38:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(724731773040276897L, this);     // Catch: java.lang.Throwable -> L33
        L7:
            if (this.Hw == 0) goto L9;
        L21:
            this.v5 = abcd.Mb.j6(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            if (this.v5 == 0) goto L23;
            if (this.v5 == this.VH) goto L27;
            this.FH = (this.FH + this.Hw) % abcd.Mb.j6(this.gn).length;     // Catch: java.lang.Throwable -> L33
            goto L21
        L27:
            if (this.v5 != Integer.MAX_VALUE) goto L29;
            this.v5 = 0;     // Catch: java.lang.Throwable -> L33
        L29:
            this.Zo = abcd.Mb.DW(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            this.FH = (this.FH + this.Hw) % abcd.Mb.j6(this.gn).length;     // Catch: java.lang.Throwable -> L33
            return true;
        L23:
            return false;
        L9:
            if (this.FH >= abcd.Mb.j6(this.gn).length) goto L10;
            this.v5 = abcd.Mb.j6(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            if (this.v5 == 0) goto L20;
            if (this.v5 == Integer.MIN_VALUE) goto L20;
            if (this.v5 != Integer.MAX_VALUE) goto L18;
            this.v5 = 0;     // Catch: java.lang.Throwable -> L33
        L18:
            this.Zo = abcd.Mb.DW(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
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
        abcd.wu.j6(abcd.Mb.class, 3659322688218762075L, 3659322688218762075L);     // Catch: java.lang.Throwable -> L8
        if (DW == false) goto L6;
        abcd.wu.j6(-95072509845511200L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -95072509845511200L, null);
    L12:
        throw th;
    }

    public Mb() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2304525454521607800L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2304525454521607800L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new abcd.Mb.a(this, null);     // Catch: java.lang.Throwable -> L8
        this.EQ = 0;     // Catch: java.lang.Throwable -> L8
        this.v5 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L8
        this.VH = new long[j6[this.EQ]];     // Catch: java.lang.Throwable -> L8
        this.u7 = 0;     // Catch: java.lang.Throwable -> L8
        this.tp = 0;     // Catch: java.lang.Throwable -> L8
    }

    public Mb(abcd.ec r8) {
    L16:
        th = move-exception;
        if (FH == false) goto L21;
        abcd.wu.j6(th, 2973664881823939072L, null, r8);
    L21:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(2973664881823939072L, null, r8);     // Catch: java.lang.Throwable -> L16
    L6:
        this.Hw = new abcd.Mb.a(this, null);     // Catch: java.lang.Throwable -> L16
        this.tp = r8.readInt();     // Catch: java.lang.Throwable -> L16
        this.u7 = r8.readInt();     // Catch: java.lang.Throwable -> L16
        this.EQ = r8.readInt();     // Catch: java.lang.Throwable -> L16
        this.v5 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L16
        int r3 = 0;
        int r4 = 0;
    L8:
        if (r4 >= this.v5.length) goto L10;
        this.v5[r4] = r8.readInt();     // Catch: java.lang.Throwable -> L16
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L16
        goto L8
    L10:
        this.VH = new long[j6[this.EQ]];     // Catch: java.lang.Throwable -> L16
    L11:
        if (r3 >= this.VH.length) goto L15;
        this.VH[r3] = r8.readLong();     // Catch: java.lang.Throwable -> L16
        r3 = r3 + 1;
        goto L11
    }

    @abcd.Interfacesu(method = 2657566117398320421L)
    private void DW() {
    L34:
        th = move-exception;
        if (FH == false) goto L39;
        abcd.wu.j6(th, -565565878588757287L, this);
    L39:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-565565878588757287L, this);     // Catch: java.lang.Throwable -> L34
    L6:
        int r4 = 0;
        if ((this.tp * 2) <= this.v5.length) goto L10;
        this.EQ++;     // Catch: java.lang.Throwable -> L34
        this.Zo = null;     // Catch: java.lang.Throwable -> L34
        this.gn = null;     // Catch: java.lang.Throwable -> L34
        int[] r2 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L34
        long[] r3 = new long[j6[this.EQ]];     // Catch: java.lang.Throwable -> L34
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
        r3 = new long[j6[this.EQ]];     // Catch: java.lang.Throwable -> L34
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

    static long[] DW(abcd.Mb r0) {
        return r0.VH;
    }

    static int[] j6(abcd.Mb r0) {
        return r0.v5;
    }

    public long DW(int r6) {
    L17:
        th = move-exception;
        if (FH == false) goto L22;
        abcd.wu.j6(th, 6486143246431260125L, this, new java.lang.Integer(r6));
    L22:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(6486143246431260125L, this, r6);     // Catch: java.lang.Throwable -> L17
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

    public void DW(int r8, long r9) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, 286905547438170025L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(286905547438170025L, this, new java.lang.Integer(r8), new java.lang.Long(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        FH(r8);     // Catch: java.lang.Throwable -> L7
        j6(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    public void FH(int r7) {
    L16:
        th = move-exception;
        if (FH == false) goto L21;
        abcd.wu.j6(th, -6746725027039578373L, this, new java.lang.Integer(r7));
    L21:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-6746725027039578373L, this, r7);     // Catch: java.lang.Throwable -> L16
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
    L18:
        th = move-exception;
        if (FH == false) goto L23;
        abcd.wu.j6(th, 2431355369120097071L, this);
    L23:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(2431355369120097071L, this);     // Catch: java.lang.Throwable -> L18
    L7:
        if (this.u7 <= 0) goto L29;
        int r3 = 0;
    L10:
        if (r3 >= this.v5.length) goto L12;
        this.v5[r3] = 0;     // Catch: java.lang.Throwable -> L18
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L18
        goto L10
    L12:
        int r4 = 0;
    L14:
        if (r4 >= this.VH.length) goto L16;
        this.VH[r4] = 0;     // Catch: java.lang.Throwable -> L18
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L18
        goto L14
    L16:
        this.u7 = 0;     // Catch: java.lang.Throwable -> L18
        this.tp = 0;     // Catch: java.lang.Throwable -> L18
        return;
    }

    public void j6(int r8, long r9) {
    L27:
        th = move-exception;
        if (FH == false) goto L32;
        abcd.wu.j6(th, 2316729831846393L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
    L32:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(2316729831846393L, this, new java.lang.Integer(r8), new java.lang.Long(r9));     // Catch: java.lang.Throwable -> L27
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
        DW();     // Catch: java.lang.Throwable -> L27
        return;
    }

    public void j6(abcd.fc r7) {
    L15:
        th = move-exception;
        if (FH == false) goto L20;
        abcd.wu.j6(th, -3064738974656993920L, this, r7);
    L20:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-3064738974656993920L, this, r7);     // Catch: java.lang.Throwable -> L15
    L6:
        r7.writeInt(this.tp);     // Catch: java.lang.Throwable -> L15
        r7.writeInt(this.u7);     // Catch: java.lang.Throwable -> L15
        r7.writeInt(this.EQ);     // Catch: java.lang.Throwable -> L15
        int r2 = 0;
        int r3 = 0;
    L8:
        if (r3 >= this.v5.length) goto L10;
        r7.writeInt(this.v5[r3]);     // Catch: java.lang.Throwable -> L15
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L15
    L10:
        if (r2 >= this.VH.length) goto L14;
        r7.writeLong(this.VH[r2]);     // Catch: java.lang.Throwable -> L15
        r2 = r2 + 1;
        goto L10
    }

    public boolean j6(int r7) {
    L17:
        th = move-exception;
        if (FH == false) goto L22;
        abcd.wu.j6(th, 988890967189256640L, this, new java.lang.Integer(r7));
    L22:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(988890967189256640L, this, r7);     // Catch: java.lang.Throwable -> L17
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

    public java.lang.String toString() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2492727991359498064L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2492727991359498064L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getClass().getName() + "[Size=" + this.tp + "]";
    }
}
