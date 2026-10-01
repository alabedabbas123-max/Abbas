package abcd;

@abcd.Interfacexu
public class dc {
    public static final abcd.dc DW = null;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 301422686127427072L)
    private static final int[] j6 = null;

    @abcd.Interfaceru(field = -1044293497519477125L)
    private long[] VH;

    @abcd.Interfaceru(field = 1644057881820727848L)
    private long[] Zo;

    @abcd.Interfaceru(field = 1640401021608463899L)
    private int gn;

    @abcd.Interfaceru(field = 4428228052452188L)
    private int tp;

    @abcd.Interfaceru(field = 998862536907858945L)
    private int u7;
    public final abcd.dc.a v5;

    @abcd.Interfacexu
    public class a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfaceru(field = 2720192144536686873L)
        private int FH;

        @abcd.Interfacevu
        final abcd.dc Hw;

        static {
            abcd.wu.j6(abcd.dc.a.class, 1359724431656601600L, 1359724431656601600L);
        }

        @abcd.Interfacesu(method = -122502422323718325L)
        private a(abcd.dc r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 563252126241925448L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(563252126241925448L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.Hw = r6;     // Catch: java.lang.Throwable -> L8
            this.FH = 0;     // Catch: java.lang.Throwable -> L8
        }

        a(abcd.dc r8, abcd.cc r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1390473997813720960L, null, r8, r9);
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-1390473997813720960L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
        L5:
            this(r8);     // Catch: java.lang.Throwable -> L7
        }
    }

    static {
        abcd.wu.j6(abcd.dc.class, 4379644660961656000L, 4379644660961656000L);     // Catch: java.lang.Throwable -> L8
        if (FH == false) goto L6;
        abcd.wu.j6(356802911305228224L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new int[]{5, 11, 17, 37, 67, 131, 257, 521, 1031, 2053, 4099, 8209, 16411, 32771, 65537, 131101, 262147, 524309, 1048583, 2097169, 4194319, 8388617, 16777259, 33554467, 67108879, 134217757, 268435459, 536870923, 1073741827, 2147383649};     // Catch: java.lang.Throwable -> L8
        DW = new abcd.dc();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 356802911305228224L, null);
    L12:
        throw th;
    }

    public dc() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 2853887064396271345L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(2853887064396271345L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5 = new abcd.dc.a(this, null);     // Catch: java.lang.Throwable -> L8
        this.tp = 1;     // Catch: java.lang.Throwable -> L8
        this.Zo = new long[j6[this.tp]];     // Catch: java.lang.Throwable -> L8
        this.gn = 0;     // Catch: java.lang.Throwable -> L8
        this.u7 = 0;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -1643887916944616200L)
    private void FH() {
    L34:
        th = move-exception;
        if (Hw == false) goto L39;
        abcd.wu.j6(th, -1257813617015926935L, this);
    L39:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-1257813617015926935L, this);     // Catch: java.lang.Throwable -> L34
    L6:
        int r7 = 0;
        if ((this.u7 * 2) <= this.Zo.length) goto L10;
        this.tp++;     // Catch: java.lang.Throwable -> L34
        this.VH = null;     // Catch: java.lang.Throwable -> L34
        long[] r0 = new long[j6[this.tp]];     // Catch: java.lang.Throwable -> L34
    L19:
        int r4 = 0;
    L21:
        if (r7 >= this.Zo.length) goto L32;
        long r9 = this.Zo[r7];     // Catch: java.lang.Throwable -> L34
        if (r9 == 0) goto L31;
        if (r9 == Long.MIN_VALUE) goto L31;
        long r11 = Long.MAX_VALUE & r9;     // Catch: java.lang.Throwable -> L34
        int r8 = (int) (r11 % ((long) r0.length));     // Catch: java.lang.Throwable -> L34
        int r12 = ((int) (r11 % (((long) r0.length) - 2))) + 1;     // Catch: java.lang.Throwable -> L34
    L28:
        if (r0[r8] == 0) goto L30;
        r8 = (r8 + r12) % r0.length;     // Catch: java.lang.Throwable -> L34
        goto L28
    L30:
        r0[r8] = r9;     // Catch: java.lang.Throwable -> L34
        r4 = r4 + 1;     // Catch: java.lang.Throwable -> L34
    L31:
        r7 = r7 + 1;     // Catch: java.lang.Throwable -> L34
        goto L21
    L32:
        this.Zo = r0;     // Catch: java.lang.Throwable -> L34
        this.gn = r4;     // Catch: java.lang.Throwable -> L34
        return;
    L10:
        if (this.VH != null) goto L12;
    L18:
        this.VH = this.Zo;     // Catch: java.lang.Throwable -> L34
        r0 = new long[j6[this.tp]];     // Catch: java.lang.Throwable -> L34
        goto L19
    L12:
        if (this.VH.length != this.Zo.length) goto L18;
        r0 = this.VH;     // Catch: java.lang.Throwable -> L34
        int r5 = 0;
    L15:
        if (r5 >= r0.length) goto L17;
        r0[r5] = 0;     // Catch: java.lang.Throwable -> L34
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L34
        goto L15
    L17:
        this.VH = this.Zo;     // Catch: java.lang.Throwable -> L34
        goto L19
    }

    public int DW() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 203532264663468201L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(203532264663468201L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.u7;
    }

    public void DW(long r14) {
    L28:
        th = move-exception;
        if (Hw == false) goto L33;
        abcd.wu.j6(th, -1028650398253309072L, this, new java.lang.Long(r14));
    L33:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-1028650398253309072L, this, new java.lang.Long(r14));     // Catch: java.lang.Throwable -> L28
    L7:
        if (r14 != 0) goto L9;
        r14 = Long.MAX_VALUE;
    L9:
        long r2 = Long.MAX_VALUE & r14;     // Catch: java.lang.Throwable -> L28
        int r7 = (int) (r2 % ((long) this.Zo.length));     // Catch: java.lang.Throwable -> L28
        int r3 = ((int) (r2 % (((long) this.Zo.length) - 2))) + 1;     // Catch: java.lang.Throwable -> L28
        long r8 = this.Zo[r7];     // Catch: java.lang.Throwable -> L28
        int r6 = -1;
    L11:
        if (r8 == 0) goto L19;
        if (r8 == r14) goto L14;
        if (r8 != Long.MIN_VALUE) goto L18;
        r6 = r7;
    L18:
        r7 = (r7 + r3) % this.Zo.length;     // Catch: java.lang.Throwable -> L28
        r8 = this.Zo[r7];     // Catch: java.lang.Throwable -> L28
        goto L11
    L14:
        return;
    L19:
        if (r6 == (-1)) goto L21;
        r7 = r6;
    L21:
        this.Zo[r7] = r14;     // Catch: java.lang.Throwable -> L28
        if (r6 != (-1)) goto L24;
        this.gn++;     // Catch: java.lang.Throwable -> L28
    L24:
        this.u7++;     // Catch: java.lang.Throwable -> L28
        if ((this.gn * 2) <= this.Zo.length) goto L41;
        FH();     // Catch: java.lang.Throwable -> L28
        return;
    }

    public boolean equals(java.lang.Object r13) {
    L28:
        th = move-exception;
        if (Hw == false) goto L33;
        abcd.wu.j6(th, 146393395345701740L, this, r13);
    L33:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(146393395345701740L, this, r13);     // Catch: java.lang.Throwable -> L28
    L7:
        if ((r13 instanceof abcd.dc) == true) goto L9;
        return false;
    L9:
        abcd.dc r2 = (abcd.dc) r13;     // Catch: java.lang.Throwable -> L28
        if (r2.DW() == DW()) goto L12;
        return false;
    L12:
        int r4 = 0;
    L13:
        if (r4 >= this.Zo.length) goto L26;
        long r6 = this.Zo[r4];     // Catch: java.lang.Throwable -> L28
        if (r6 == 0) goto L25;
        if (r6 == Long.MIN_VALUE) goto L25;
        if (r6 != Long.MAX_VALUE) goto L23;
        r6 = 0;
    L23:
        if (r2.j6(r6) == true) goto L25;
        return false;
    L25:
        r4 = r4 + 1;
        goto L13
    L26:
        return true;
    }

    public void j6() {
    L14:
        th = move-exception;
        if (Hw == false) goto L19;
        abcd.wu.j6(th, 830952819050231647L, this);
    L19:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(830952819050231647L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (this.gn <= 0) goto L24;
        int r3 = 0;
    L10:
        if (r3 >= this.Zo.length) goto L12;
        this.Zo[r3] = 0;     // Catch: java.lang.Throwable -> L14
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L14
        goto L10
    L12:
        this.gn = 0;     // Catch: java.lang.Throwable -> L14
        this.u7 = 0;     // Catch: java.lang.Throwable -> L14
        return;
    }

    public boolean j6(long r13) {
    L19:
        th = move-exception;
        if (Hw == false) goto L24;
        abcd.wu.j6(th, -1329487767138827152L, this, new java.lang.Long(r13));
    L24:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-1329487767138827152L, this, new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L19
    L7:
        if (r13 != 0) goto L9;
        r13 = Long.MAX_VALUE;
    L9:
        long r2 = Long.MAX_VALUE & r13;     // Catch: java.lang.Throwable -> L19
        int r7 = (int) (r2 % ((long) this.Zo.length));     // Catch: java.lang.Throwable -> L19
        int r3 = ((int) (r2 % (((long) this.Zo.length) - 2))) + 1;     // Catch: java.lang.Throwable -> L19
        long r8 = this.Zo[r7];     // Catch: java.lang.Throwable -> L19
    L11:
        if (r8 == r13) goto L18;
        if (r8 == 0) goto L14;
        r7 = (r7 + r3) % this.Zo.length;     // Catch: java.lang.Throwable -> L19
        r8 = this.Zo[r7];     // Catch: java.lang.Throwable -> L19
        goto L11
    L14:
        return false;
    L18:
        return true;
    }

    public java.lang.String toString() {
    L20:
        th = move-exception;
        if (Hw == false) goto L25;
        abcd.wu.j6(th, -2040058579844368736L, this);
    L25:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-2040058579844368736L, this);     // Catch: java.lang.Throwable -> L20
    L6:
        java.lang.String r2 = "{";
        int r3 = 0;
    L8:
        if (r3 >= this.Zo.length) goto L18;
        long r5 = this.Zo[r3];     // Catch: java.lang.Throwable -> L20
        if (r5 == 0) goto L17;
        if (r5 == Long.MIN_VALUE) goto L17;
        if (r5 != Long.MAX_VALUE) goto L16;
        r2 = r2 + "0, ";     // Catch: java.lang.Throwable -> L20
        goto L17
    L16:
        r2 = r2 + r5 + ", ";     // Catch: java.lang.Throwable -> L20
    L17:
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L20
        goto L8
    L18:
        return r2 + "}";
    }
}
