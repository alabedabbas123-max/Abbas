package abcd;

public final class bs implements abcd.Rs, abcd.Interfacelu, java.lang.Comparable<abcd.bs> {
    private static final abcd.bs.a DW = null;
    private static final java.util.HashMap<java.lang.Object, abcd.bs> j6 = null;
    private final int FH;
    private final abcd.Rs Hw;
    private final abcd.Vr v5;

    private static class a {
        private abcd.Rs DW;
        private abcd.Vr FH;
        private int j6;

        private a() {
        }

        a(abcd.as r1) {
            this();
        }

        static abcd.Rs DW(abcd.bs.a r0) {
            return r0.DW;
        }

        static abcd.Vr FH(abcd.bs.a r0) {
            return r0.FH;
        }

        static int j6(abcd.bs.a r0) {
            return r0.j6;
        }

        public boolean equals(java.lang.Object r4) {
            if ((r4 instanceof abcd.bs) == true) goto L7;
            return false;
        L7:
            return abcd.bs.j6((abcd.bs) r4, this.j6, this.DW, this.FH);
        }

        public int hashCode() {
            return abcd.bs.j6(this.j6, this.DW, this.FH);
        }

        public abcd.bs j6() {
            return new abcd.bs(this.j6, this.DW, this.FH, null);
        }

        public void j6(int r1, abcd.Rs r2, abcd.Vr r3) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
        }
    }

    static {
        j6 = new java.util.HashMap(1000);
        DW = new abcd.bs.a(null);
    }

    private bs(int r1, abcd.Rs r2, abcd.Vr r3) {
        if (r1 < 0) goto L10;
        if (r2 == null) goto L8;
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
        return;
    L8:
        throw new java.lang.NullPointerException("type == null");
    L10:
        throw new java.lang.IllegalArgumentException("reg < 0");
    }

    bs(int r1, abcd.Rs r2, abcd.Vr r3, abcd.as r4) {
        this(r1, r2, r3);
    }

    public static abcd.bs DW(int r0, abcd.Rs r1, abcd.Vr r2) {
        if (r2 == null) goto L6;
        return Zo(r0, r1, r2);
    L6:
        throw new java.lang.NullPointerException("local  == null");
    }

    public static abcd.bs FH(int r0, abcd.Rs r1, abcd.Vr r2) {
        return Zo(r0, r1, r2);
    }

    private boolean Hw(int r2, abcd.Rs r3, abcd.Vr r4) {
        if (this.FH == r2) goto L5;
    L12:
        return false;
    L5:
        if (this.Hw.equals(r3) == false) goto L12;
        abcd.Vr r5 = this.v5;
        if (r5 == r4) goto L11;
        if (r5 == null) goto L12;
        if (r5.equals(r4) == false) goto L12;
    L11:
        return true;
    }

    private static abcd.bs Zo(int r2, abcd.Rs r3, abcd.Vr r4) {
        java.util.HashMap<java.lang.Object, abcd.bs> r0 = j6;
        monitor-enter(r0);
        DW.j6(r2, r3, r4);     // Catch: java.lang.Throwable -> L11
        abcd.bs r5 = j6.get(DW);     // Catch: java.lang.Throwable -> L11
        if (r5 == null) goto L8;
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        return r5;
    L8:
        abcd.bs r6 = DW.j6();     // Catch: java.lang.Throwable -> L11
        j6.put(r6, r6);     // Catch: java.lang.Throwable -> L11
        monitor-exit(r0);     // Catch: java.lang.Throwable -> L11
        return r6;
    L11:
        th = move-exception;
        throw th;
    }

    static int j6(int r0, abcd.Rs r1, abcd.Vr r2) {
        return v5(r0, r1, r2);
    }

    public static abcd.bs j6(int r1, abcd.Rs r2) {
        return Zo(r1, r2, null);
    }

    public static java.lang.String j6(int r2) {
        return "v" + r2;
    }

    private java.lang.String j6(boolean r4) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(40);
        r0.append(lg());
        r0.append(":");
        abcd.Vr r1 = this.v5;
        if (r1 == null) goto L5;
        r0.append(r1.toString());
    L5:
        abcd.Qs r2 = this.Hw.getType();
        r0.append(r2);
        if (r2 == this.Hw) goto L18;
        r0.append("=");
        if (r4 == false) goto L12;
        abcd.Rs r3 = this.Hw;
        if ((r3 instanceof abcd.Js) == false) goto L12;
        r0.append(((abcd.Js) r3).lg());
    L12:
        if (r4 == false) goto L16;
        abcd.Rs r5 = this.Hw;
        if ((r5 instanceof abcd.Abstractms) == false) goto L16;
        r0.append(r5.aM());
    L16:
        r0.append(this.Hw);
    L18:
        return r0.toString();
    }

    static boolean j6(abcd.bs r0, int r1, abcd.Rs r2, abcd.Vr r3) {
        return r0.Hw(r1, r2, r3);
    }

    private static int v5(int r0, abcd.Rs r1, abcd.Vr r2) {
        if (r2 == null) goto L4;
        int r3 = r2.hashCode();
    L6:
        return (((r3 * 31) + r1.hashCode()) * 31) + r0;
    L4:
        r3 = 0;
        goto L6
    }

    public abcd.bs DW(int r2) {
        if (r2 != 0) goto L5;
        return this;
    L5:
        return FH(this.FH + r2);
    }

    public boolean DW(abcd.bs r3) {
        if (FH(r3) == true) goto L6;
        return false;
    L6:
        if (this.FH != r3.FH) goto L9;
        return true;
    L9:
        return false;
    }

    public abcd.bs FH(int r3) {
        if (this.FH != r3) goto L6;
        return this;
    L6:
        return FH(r3, this.Hw, this.v5);
    }

    public boolean FH(abcd.bs r4) {
        if (r4 != null) goto L6;
        return false;
    L6:
        if (this.Hw.getType().equals(r4.Hw.getType()) == false) goto L14;
        abcd.Vr r1 = this.v5;
        abcd.Vr r5 = r4.v5;
        if (r1 == r5) goto L12;
        if (r1 != null) goto L11;
        return false;
    L11:
        if (r1.equals(r5) == true) goto L12;
        return false;
    L12:
        return true;
    L14:
        return false;
    }

    public int Hw() {
        return this.Hw.getType().Zo();
    }

    public abcd.Rs J8() {
        return this.Hw;
    }

    @Override
    public final int Mr() {
        return this.Hw.Mr();
    }

    @Override
    public abcd.Rs U2() {
        return this.Hw.U2();
    }

    public int VH() {
        return this.FH + Hw();
    }

    public boolean Ws() {
        return this.Hw.getType().yS();
    }

    public abcd.Vr Zo() {
        return this.v5;
    }

    @Override
    public final boolean a8() {
        return false;
    }

    @Override
    public java.lang.String aM() {
        return j6(true);
    }

    @Override
    public int compareTo(abcd.bs r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r3) {
        if ((r3 instanceof abcd.bs) == false) goto L5;
        abcd.bs r4 = (abcd.bs) r3;
        return Hw(r4.FH, r4.Hw, r4.v5);
    L5:
        if ((r3 instanceof abcd.bs.a) == false) goto L8;
        abcd.bs.a r5 = (abcd.bs.a) r3;
        return Hw(abcd.bs.a.j6(r5), abcd.bs.a.DW(r5), abcd.bs.a.FH(r5));
    L8:
        return false;
    }

    @Override
    public abcd.Qs getType() {
        return this.Hw.getType();
    }

    public int hashCode() {
        return v5(this.FH, this.Hw, this.v5);
    }

    @Override
    public final int j3() {
        return this.Hw.j3();
    }

    public int j6(abcd.bs r5) {
        int r0 = this.FH;
        int r1 = r5.FH;
        if (r0 >= r1) goto L6;
        return -1;
    L6:
        if (r0 <= r1) goto L8;
        return 1;
    L8:
        int r2 = this.Hw.getType().j6(r5.Hw.getType());
        if (r2 == 0) goto L11;
        return r2;
    L11:
        abcd.Vr r3 = this.v5;
        if (r3 == null) goto L14;
        abcd.Vr r6 = r5.v5;
        if (r6 != null) goto L21;
        return 1;
    L21:
        return r3.j6(r6);
    L14:
        if (r5.v5 != null) goto L22;
        return 0;
    L22:
        return -1;
    }

    public abcd.bs j6(abcd.Rs r3) {
        return FH(this.FH, r3, this.v5);
    }

    public abcd.bs j6(abcd.Vr r3) {
        abcd.Vr r0 = this.v5;
        if (r0 == r3) goto L10;
        if (r0 == null) goto L9;
        if (r0.equals(r3) == true) goto L10;
    L9:
        return FH(this.FH, this.Hw, r3);
    L10:
        return this;
    }

    public abcd.bs j6(abcd.bs r5, boolean r6) {
        if (this != r5) goto L5;
        return this;
    L5:
        if (r5 != null) goto L7;
    L37:
        return null;
    L7:
        if (this.FH != r5.we()) goto L37;
        abcd.Vr r1 = this.v5;
        if (r1 != null) goto L12;
    L15:
        abcd.Vr r2 = null;
    L17:
        if (r2 != this.v5) goto L19;
        boolean r3 = true;
    L20:
        if (r6 == false) goto L23;
        if (r3 == true) goto L23;
        return null;
    L23:
        abcd.Rs r7 = getType();
        if (r7 == r5.getType()) goto L27;
        return null;
    L27:
        if (this.Hw.equals(r5.J8()) == false) goto L30;
        r7 = this.Hw;
    L30:
        if (r7 != this.Hw) goto L33;
        if (r3 == false) goto L33;
        return this;
    L33:
        if (r2 != null) goto L36;
        return j6(this.FH, r7);
    L36:
        return DW(this.FH, r7, r2);
    L19:
        r3 = false;
        goto L20
    L12:
        if (r1.equals(r5.Zo()) == false) goto L15;
        r2 = this.v5;
        goto L17
    }

    public java.lang.String lg() {
        return j6(this.FH);
    }

    public abcd.bs rN() {
        abcd.Rs r0 = this.Hw;
        if ((r0 instanceof abcd.Qs) == false) goto L5;
        abcd.Qs r1 = (abcd.Qs) r0;
    L7:
        if (r1.P8() == false) goto L9;
        r1 = r1.Ws();
    L9:
        if (r1 != r0) goto L12;
        return this;
    L12:
        return FH(this.FH, r1, this.v5);
    L5:
        r1 = r0.getType();
        goto L7
    }

    public java.lang.String toString() {
        return j6(false);
    }

    public int we() {
        return this.FH;
    }
}
