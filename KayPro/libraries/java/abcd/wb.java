package abcd;

@abcd.Interfacexu
public class wb<T> {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = -2112874059830192384L)
    private static final int[] j6 = null;

    @abcd.Interfaceru(field = 1198532525584837548L)
    private int EQ;
    public final wb<T>.a Hw;

    @abcd.Interfaceru(field = 1605692611523357804L)
    private T[] VH;

    @abcd.Interfaceru(field = 147742362621808803L)
    private int[] Zo;

    @abcd.Interfaceru(field = 3288918572145288033L)
    private T[] gn;

    @abcd.Interfaceru(field = -1466678899635048423L)
    private int tp;

    @abcd.Interfaceru(field = -833805449763845229L)
    private int u7;

    @abcd.Interfaceru(field = -212284426466010312L)
    private int[] v5;

    @abcd.Interfacexu
    public class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 1675180986662809600L)
        private int FH;

        @abcd.Interfaceru(field = 1510980506830099600L)
        private int Hw;

        @abcd.Interfaceru(field = -1493781540304395804L)
        private int VH;

        @abcd.Interfaceru(field = 2190498677736197445L)
        private T Zo;

        @abcd.Interfacevu
        final abcd.wb gn;

        @abcd.Interfaceru(field = 708095089362173539L)
        private int v5;

        static {
            abcd.wu.j6(abcd.wb.a.class, 1360197766476346969L, 1360197766476346969L);
        }

        @abcd.Interfacesu(method = 110213513056291260L)
        private a(abcd.wb r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -734448108852801783L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-734448108852801783L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.gn = r6;     // Catch: java.lang.Throwable -> L8
            this.FH = 0;     // Catch: java.lang.Throwable -> L8
            this.Hw = 0;     // Catch: java.lang.Throwable -> L8
        }

        a(abcd.wb r8, abcd.vb r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -816733024977602304L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-816733024977602304L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }

        public void DW() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1287148807320878640L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1287148807320878640L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH = 0;     // Catch: java.lang.Throwable -> L8
            this.Hw = 0;     // Catch: java.lang.Throwable -> L8
        }

        public int FH() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 2426033441639374124L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(2426033441639374124L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.v5;
        }

        public T Hw() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1246058646537277336L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1246058646537277336L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.Zo;
        }

        public boolean j6() {
        L33:
            th = move-exception;
            if (DW == false) goto L38;
            abcd.wu.j6(th, 887374090413555704L, this);
        L38:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(887374090413555704L, this);     // Catch: java.lang.Throwable -> L33
        L7:
            if (this.Hw == 0) goto L9;
        L21:
            this.v5 = abcd.wb.j6(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            if (this.v5 == 0) goto L23;
            if (this.v5 == this.VH) goto L27;
            this.FH = (this.FH + this.Hw) % abcd.wb.j6(this.gn).length;     // Catch: java.lang.Throwable -> L33
            goto L21
        L27:
            if (this.v5 != Integer.MAX_VALUE) goto L29;
            this.v5 = 0;     // Catch: java.lang.Throwable -> L33
        L29:
            this.Zo = (T) abcd.wb.DW(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            this.FH = (this.FH + this.Hw) % abcd.wb.j6(this.gn).length;     // Catch: java.lang.Throwable -> L33
            return true;
        L23:
            return false;
        L9:
            if (this.FH >= abcd.wb.j6(this.gn).length) goto L10;
            this.v5 = abcd.wb.j6(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            if (this.v5 == 0) goto L20;
            if (this.v5 == Integer.MIN_VALUE) goto L20;
            if (this.v5 != Integer.MAX_VALUE) goto L18;
            this.v5 = 0;     // Catch: java.lang.Throwable -> L33
        L18:
            this.Zo = (T) abcd.wb.DW(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
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
        abcd.wu.j6(abcd.wb.class, 7360388161383203025L, 7360388161383203025L);     // Catch: java.lang.Throwable -> L8
        if (DW == false) goto L6;
        abcd.wu.j6(1346018338701764995L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 1346018338701764995L, null);
    L12:
        throw th;
    }

    public wb() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -3000439428057659209L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-3000439428057659209L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new abcd.wb.a(this, null);     // Catch: java.lang.Throwable -> L8
        this.EQ = 0;     // Catch: java.lang.Throwable -> L8
        this.v5 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L8
        this.VH = (T[]) new java.lang.Object[j6[this.EQ]];     // Catch: java.lang.Throwable -> L8
        this.u7 = 0;     // Catch: java.lang.Throwable -> L8
        this.tp = 0;     // Catch: java.lang.Throwable -> L8
    }

    public wb(int r7) {
    L12:
        th = move-exception;
        if (FH == false) goto L17;
        abcd.wu.j6(th, -3545753592683713920L, null, new java.lang.Integer(r7));
    L17:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-3545753592683713920L, null, r7);     // Catch: java.lang.Throwable -> L12
    L6:
        this.Hw = new abcd.wb.a(this, null);     // Catch: java.lang.Throwable -> L12
        this.EQ = 0;     // Catch: java.lang.Throwable -> L12
    L8:
        if (j6[this.EQ] >= (r7 * 2)) goto L10;
        this.EQ++;     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        this.v5 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L12
        this.VH = (T[]) new java.lang.Object[j6[this.EQ]];     // Catch: java.lang.Throwable -> L12
        this.u7 = 0;     // Catch: java.lang.Throwable -> L12
        this.tp = 0;     // Catch: java.lang.Throwable -> L12
    }

    static java.lang.Object[] DW(abcd.wb r0) {
        return r0.VH;
    }

    @abcd.Interfacesu(method = 84727159270746456L)
    private void FH() {
    L39:
        th = move-exception;
        if (FH == false) goto L44;
        abcd.wu.j6(th, -2936328469938470880L, this);
    L44:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2936328469938470880L, this);     // Catch: java.lang.Throwable -> L39
    L6:
        int r5 = 0;
        if ((this.tp * 2) <= this.v5.length) goto L10;
        this.EQ++;     // Catch: java.lang.Throwable -> L39
        this.Zo = null;     // Catch: java.lang.Throwable -> L39
        this.gn = null;     // Catch: java.lang.Throwable -> L39
        int[] r2 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L39
        T[] r3 = (T[]) new java.lang.Object[j6[this.EQ]];
    L19:
        int r6 = 0;
        int r7 = 0;
    L21:
        if (r6 >= this.v5.length) goto L32;
        int r8 = this.v5[r6];     // Catch: java.lang.Throwable -> L39
        if (r8 == 0) goto L31;
        if (r8 == Integer.MIN_VALUE) goto L31;
        int r9 = Integer.MAX_VALUE & r8;     // Catch: java.lang.Throwable -> L39
        int r10 = (r9 % (r2.length - 2)) + 1;     // Catch: java.lang.Throwable -> L39
        int r11 = r9 % r2.length;     // Catch: java.lang.Throwable -> L39
    L28:
        if (r2[r11] == 0) goto L30;
        r11 = (r11 + r10) % r2.length;     // Catch: java.lang.Throwable -> L39
        goto L28
    L30:
        r2[r11] = r8;     // Catch: java.lang.Throwable -> L39
        r3[r11] = this.VH[r6];     // Catch: java.lang.Throwable -> L39
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L39
    L31:
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L39
        goto L21
    L32:
        this.v5 = r2;     // Catch: java.lang.Throwable -> L39
        this.VH = r3;     // Catch: java.lang.Throwable -> L39
        this.u7 = r7;     // Catch: java.lang.Throwable -> L39
        if (this.gn == null) goto L38;
    L34:
        if (r5 >= this.gn.length) goto L55;
        this.gn[r5] = null;     // Catch: java.lang.Throwable -> L39
        r5 = r5 + 1;
        goto L34
    L55:
        return;
    L38:
        return;
    L10:
        if (this.Zo != null) goto L12;
    L18:
        this.Zo = this.v5;     // Catch: java.lang.Throwable -> L39
        this.gn = this.VH;     // Catch: java.lang.Throwable -> L39
        r2 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L39
        r3 = (T[]) new java.lang.Object[j6[this.EQ]];
        goto L19
    L12:
        if (this.Zo.length != this.v5.length) goto L18;
        r2 = this.Zo;     // Catch: java.lang.Throwable -> L39
        int r4 = 0;
    L15:
        if (r4 >= r2.length) goto L17;
        r2[r4] = 0;     // Catch: java.lang.Throwable -> L39
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L39
        goto L15
    L17:
        r3 = this.gn;     // Catch: java.lang.Throwable -> L39
        this.Zo = this.v5;     // Catch: java.lang.Throwable -> L39
        this.gn = this.VH;     // Catch: java.lang.Throwable -> L39
        goto L19
    }

    static int[] j6(abcd.wb r0) {
        return r0.v5;
    }

    public int DW() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -1917599878404671328L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1917599878404671328L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.tp;
    }

    public T DW(int r6) {
    L17:
        th = move-exception;
        if (FH == false) goto L22;
        abcd.wu.j6(th, -4303058939507884824L, this, new java.lang.Integer(r6));
    L22:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-4303058939507884824L, this, r6);     // Catch: java.lang.Throwable -> L17
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
        return null;
    L15:
        return this.VH[r4];
    }

    public void DW(int r8, T r9) {
    L7:
        th = move-exception;
        if (FH == false) goto L11;
        abcd.wu.j6(th, -3036674910552220800L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-3036674910552220800L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        FH(r8);     // Catch: java.lang.Throwable -> L7
        j6(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    public void FH(int r7) {
    L16:
        th = move-exception;
        if (FH == false) goto L21;
        abcd.wu.j6(th, -5745820151261733088L, this, new java.lang.Integer(r7));
    L21:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(-5745820151261733088L, this, r7);     // Catch: java.lang.Throwable -> L16
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
        this.VH[r3] = null;     // Catch: java.lang.Throwable -> L16
        this.tp--;     // Catch: java.lang.Throwable -> L16
    L13:
        r3 = (r3 + r4) % this.v5.length;     // Catch: java.lang.Throwable -> L16
        r5 = this.v5[r3];     // Catch: java.lang.Throwable -> L16
        goto L10
    }

    public void FH(wb<? extends T> r8) {
    L18:
        th = move-exception;
        if (FH == false) goto L23;
        abcd.wu.j6(th, 2193639453993458625L, this, r8);
    L23:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(2193639453993458625L, this, r8);     // Catch: java.lang.Throwable -> L18
    L6:
        int r3 = 0;
    L7:
        if (r3 >= r8.v5.length) goto L17;
        int r4 = r8.v5[r3];     // Catch: java.lang.Throwable -> L18
        T r5 = r8.VH[r3];     // Catch: java.lang.Throwable -> L18
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

    public void j6() {
    L16:
        th = move-exception;
        if (FH == false) goto L21;
        abcd.wu.j6(th, -616084013174343000L, this);
    L21:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-616084013174343000L, this);     // Catch: java.lang.Throwable -> L16
    L6:
        int r3 = 0;
    L8:
        if (r3 >= this.v5.length) goto L10;
        this.v5[r3] = 0;     // Catch: java.lang.Throwable -> L16
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L16
        goto L8
    L10:
        int r4 = 0;
    L12:
        if (r4 >= this.VH.length) goto L14;
        this.VH[r4] = null;     // Catch: java.lang.Throwable -> L16
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L16
        goto L12
    L14:
        this.u7 = 0;     // Catch: java.lang.Throwable -> L16
        this.tp = 0;     // Catch: java.lang.Throwable -> L16
        this.gn = null;     // Catch: java.lang.Throwable -> L16
        this.Zo = null;     // Catch: java.lang.Throwable -> L16
    }

    public void j6(int r8, T r9) {
    L27:
        th = move-exception;
        if (FH == false) goto L32;
        abcd.wu.j6(th, 2683471013546840712L, this, new java.lang.Integer(r8), r9);
    L32:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(2683471013546840712L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L27
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

    public boolean j6(int r7) {
    L17:
        th = move-exception;
        if (FH == false) goto L22;
        abcd.wu.j6(th, 117971930104354865L, this, new java.lang.Integer(r7));
    L22:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(117971930104354865L, this, r7);     // Catch: java.lang.Throwable -> L17
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
        abcd.wu.j6(th, -1029057893001464271L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-1029057893001464271L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getClass().getName() + "[Size=" + this.tp + "]";
    }
}
