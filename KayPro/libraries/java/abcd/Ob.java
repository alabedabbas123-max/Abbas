package abcd;

@abcd.Interfacexu
public class Ob<T> {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = 936343634395342888L)
    private static final int[] j6 = null;

    @abcd.Interfaceru(field = 638468239418116400L)
    private int EQ;
    public final Ob<T>.a Hw;

    @abcd.Interfaceru(field = 1820892139362525416L)
    private T[] VH;

    @abcd.Interfaceru(field = -422935401206132855L)
    private int[] Zo;

    @abcd.Interfaceru(field = 1937372651397535287L)
    private T[] gn;

    @abcd.Interfaceru(field = 1653347827390359387L)
    private int tp;

    @abcd.Interfaceru(field = 2302944149700018325L)
    private int u7;

    @abcd.Interfaceru(field = 238360836310693460L)
    private int[] v5;

    @abcd.Interfacexu
    public class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = -1672926209096879823L)
        private int FH;

        @abcd.Interfaceru(field = -2911088618663903265L)
        private int Hw;

        @abcd.Interfaceru(field = 1082280305273576451L)
        private int VH;

        @abcd.Interfaceru(field = -1136642703482335508L)
        private T Zo;

        @abcd.Interfacevu
        final abcd.Ob gn;

        @abcd.Interfaceru(field = 617438039637262376L)
        private int v5;

        static {
            abcd.wu.j6(abcd.Ob.a.class, -1018365442098577632L, -1018365442098577632L);
        }

        @abcd.Interfacesu(method = -11821047438650697L)
        private a(abcd.Ob r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -411497317730045373L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-411497317730045373L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.gn = r6;     // Catch: java.lang.Throwable -> L8
            this.FH = 0;     // Catch: java.lang.Throwable -> L8
            this.Hw = 0;     // Catch: java.lang.Throwable -> L8
        }

        a(abcd.Ob r8, abcd.Nb r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -162188404509764868L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-162188404509764868L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }

        public void DW() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1251853313821082240L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1251853313821082240L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH = 0;     // Catch: java.lang.Throwable -> L8
            this.Hw = 0;     // Catch: java.lang.Throwable -> L8
        }

        public int FH() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2196088765201729864L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2196088765201729864L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.v5;
        }

        public T Hw() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -3283542036234027360L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-3283542036234027360L, this);     // Catch: java.lang.Throwable -> L8
        L6:
            return this.Zo;
        }

        public boolean j6() {
        L33:
            th = move-exception;
            if (DW == false) goto L38;
            abcd.wu.j6(th, -3980798418362431200L, this);
        L38:
            throw th;
        L4:
            if (j6 == false) goto L7;
            abcd.wu.j6(-3980798418362431200L, this);     // Catch: java.lang.Throwable -> L33
        L7:
            if (this.Hw == 0) goto L9;
        L21:
            this.v5 = abcd.Ob.j6(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            if (this.v5 == 0) goto L23;
            if (this.v5 == this.VH) goto L27;
            this.FH = (this.FH + this.Hw) % abcd.Ob.j6(this.gn).length;     // Catch: java.lang.Throwable -> L33
            goto L21
        L27:
            if (this.v5 != Integer.MAX_VALUE) goto L29;
            this.v5 = 0;     // Catch: java.lang.Throwable -> L33
        L29:
            this.Zo = (T) abcd.Ob.DW(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            this.FH = (this.FH + this.Hw) % abcd.Ob.j6(this.gn).length;     // Catch: java.lang.Throwable -> L33
            return true;
        L23:
            return false;
        L9:
            if (this.FH >= abcd.Ob.j6(this.gn).length) goto L10;
            this.v5 = abcd.Ob.j6(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
            if (this.v5 == 0) goto L20;
            if (this.v5 == Integer.MIN_VALUE) goto L20;
            if (this.v5 != Integer.MAX_VALUE) goto L18;
            this.v5 = 0;     // Catch: java.lang.Throwable -> L33
        L18:
            this.Zo = (T) abcd.Ob.DW(this.gn)[this.FH];     // Catch: java.lang.Throwable -> L33
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
        abcd.wu.j6(abcd.Ob.class, 4967242876517076780L, 4967242876517076780L);     // Catch: java.lang.Throwable -> L8
        if (DW == false) goto L6;
        abcd.wu.j6(2491595004375838560L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 2491595004375838560L, null);
    L12:
        throw th;
    }

    public Ob() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2705571329496296265L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2705571329496296265L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new abcd.Ob.a(this, null);     // Catch: java.lang.Throwable -> L8
        this.EQ = 0;     // Catch: java.lang.Throwable -> L8
        this.v5 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L8
        this.VH = (T[]) new java.lang.Object[j6[this.EQ]];     // Catch: java.lang.Throwable -> L8
        this.u7 = 0;     // Catch: java.lang.Throwable -> L8
        this.tp = 0;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 282309838656207264L)
    private void DW() {
    L34:
        th = move-exception;
        if (FH == false) goto L39;
        abcd.wu.j6(th, 2832403260804541671L, this);
    L39:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(2832403260804541671L, this);     // Catch: java.lang.Throwable -> L34
    L6:
        int r4 = 0;
        if ((this.tp * 2) <= this.v5.length) goto L10;
        this.EQ++;     // Catch: java.lang.Throwable -> L34
        this.Zo = null;     // Catch: java.lang.Throwable -> L34
        this.gn = null;     // Catch: java.lang.Throwable -> L34
        int[] r2 = new int[j6[this.EQ]];     // Catch: java.lang.Throwable -> L34
        T[] r3 = (T[]) new java.lang.Object[j6[this.EQ]];
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
        r3 = (T[]) new java.lang.Object[j6[this.EQ]];
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

    static java.lang.Object[] DW(abcd.Ob r0) {
        return r0.VH;
    }

    static int[] j6(abcd.Ob r0) {
        return r0.v5;
    }

    public T DW(int r6) {
    L17:
        th = move-exception;
        if (FH == false) goto L22;
        abcd.wu.j6(th, 2678549808127387711L, this, new java.lang.Integer(r6));
    L22:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(2678549808127387711L, this, r6);     // Catch: java.lang.Throwable -> L17
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
        abcd.wu.j6(th, -2426990229583984211L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (DW == false) goto L5;
        abcd.wu.j6(-2426990229583984211L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        FH(r8);     // Catch: java.lang.Throwable -> L7
        j6(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    public void FH(int r7) {
    L16:
        th = move-exception;
        if (FH == false) goto L21;
        abcd.wu.j6(th, 5428769114577455805L, this, new java.lang.Integer(r7));
    L21:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(5428769114577455805L, this, r7);     // Catch: java.lang.Throwable -> L16
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

    public int j6() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -2403696245085621465L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-2403696245085621465L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.tp;
    }

    public void j6(int r8, T r9) {
    L27:
        th = move-exception;
        if (FH == false) goto L32;
        abcd.wu.j6(th, 54436343172184485L, this, new java.lang.Integer(r8), r9);
    L32:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(54436343172184485L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L27
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

    public boolean j6(int r7) {
    L17:
        th = move-exception;
        if (FH == false) goto L22;
        abcd.wu.j6(th, 100585106384436936L, this, new java.lang.Integer(r7));
    L22:
        throw th;
    L4:
        if (DW == false) goto L7;
        abcd.wu.j6(100585106384436936L, this, r7);     // Catch: java.lang.Throwable -> L17
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
        abcd.wu.j6(th, 70806686696144224L, this);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(70806686696144224L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return getClass().getName() + "[Size=" + this.tp + "]";
    }
}
