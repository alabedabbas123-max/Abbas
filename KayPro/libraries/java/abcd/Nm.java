package abcd;

public final class Nm extends abcd.hu {
    private final abcd.Rs[] DW;
    private final boolean[] FH;
    private int Hw;

    public Nm(int r3) {
        if (r3 == 0) goto L5;
        boolean r1 = true;
    L6:
        super(r1);
        this.DW = new abcd.Rs[r3];
        this.FH = new boolean[r3];
        this.Hw = 0;
        return;
    L5:
        r1 = false;
        goto L6
    }

    private static abcd.Rs DW(java.lang.String r3) {
        throw new abcd.an("stack: " + r3);
    }

    private static java.lang.String DW(abcd.Rs r0) {
        if (r0 != null) goto L6;
        return "<invalid>";
    L6:
        return r0.toString();
    }

    public abcd.Rs DW(int r3) {
        if (r3 < 0) goto L10;
        int r0 = this.Hw;
        if (r3 < r0) goto L6;
        DW("underflow");
        throw null;
    L6:
        return this.DW[(r0 - r3) - 1];
    L10:
        throw new java.lang.IllegalArgumentException("n < 0");
    }

    public void DW(abcd.Qs r5) {
        if (this.Hw != 0) goto L5;
        return;
    L5:
        J8();
        abcd.Qs r0 = r5.Ws();
        int r1 = 0;
    L7:
        if (r1 >= this.Hw) goto L12;
        abcd.Rs[] r2 = this.DW;
        if (r2[r1] != r5) goto L11;
        r2[r1] = r0;
    L11:
        r1 = r1 + 1;
        goto L7
    }

    public boolean FH(int r3) {
        if (r3 < 0) goto L10;
        int r0 = this.Hw;
        if (r3 >= r0) goto L8;
        return this.FH[(r0 - r3) - 1];
    L8:
        throw new abcd.an("stack: underflow");
    L10:
        throw new java.lang.IllegalArgumentException("n < 0");
    }

    public abcd.Qs Hw(int r1) {
        return DW(r1).getType();
    }

    public abcd.Rs er() {
        J8();
        abcd.Rs r1 = DW(0);
        abcd.Rs[] r2 = this.DW;
        int r3 = this.Hw;
        r2[r3 - 1] = null;
        this.FH[r3 - 1] = false;
        this.Hw = r3 - r1.getType().Zo();
        return r1;
    }

    public abcd.Nm j6(abcd.Nm r3) {
        return abcd.Um.j6(this, r3);
    L4:
        e = move-exception;
        e.j6("underlay stack:");
        j6(e);
        e.j6("overlay stack:");
        r3.j6(e);
        throw e;
    }

    public void j6(int r4, abcd.Rs r5) {
        J8();
        abcd.Rs r6 = r5.U2();     // Catch: java.lang.NullPointerException -> L12
        int r0 = (this.Hw - r4) - 1;
        abcd.Rs r7 = this.DW[r0];
        if (r7 != null) goto L7;
    L10:
        DW("incompatible substitution: " + DW(r7) + " -> " + DW(r6));
        throw null;
    L7:
        if (r7.getType().Zo() != r6.getType().Zo()) goto L10;
        this.DW[r0] = r6;
        return;
    L13:
        throw new java.lang.NullPointerException("type == null");
    }

    public void j6(abcd.Rs r7) {
        J8();
        abcd.Rs r8 = r7.U2();     // Catch: java.lang.NullPointerException -> L13
        int r0 = r8.getType().Zo();     // Catch: java.lang.NullPointerException -> L13
        int r1 = this.Hw;
        int r2 = r1 + r0;
        abcd.Rs[] r3 = this.DW;
        if (r2 <= r3.length) goto L7;
        DW("overflow");
        throw null;
    L7:
        if (r0 != 2) goto L9;
        r3[r1] = null;
        this.Hw = r1 + 1;
    L9:
        abcd.Rs[] r4 = this.DW;
        int r5 = this.Hw;
        r4[r5] = r8;
        this.Hw = r5 + 1;
        return;
    L14:
        throw new java.lang.NullPointerException("type == null");
    }

    public void j6(abcd.Vt r6) {
        int r0 = this.Hw - 1;
        int r1 = 0;
    L3:
        if (r1 > r0) goto L8;
        if (r1 != r0) goto L6;
        java.lang.String r2 = "top0";
    L7:
        r6.j6("stack[" + r2 + "]: " + DW(this.DW[r1]));
        r1 = r1 + 1;
        goto L3
    L6:
        r2 = abcd.Yt.v5(r0 - r1);
        goto L7
    }

    public void lg() {
        J8();
        int r1 = 0;
    L4:
        if (r1 >= this.Hw) goto L6;
        this.DW[r1] = null;
        this.FH[r1] = false;
        r1 = r1 + 1;
        goto L4
    L6:
        this.Hw = 0;
    }

    public abcd.Nm rN() {
        abcd.Nm r0 = new abcd.Nm(this.DW.length);
        abcd.Rs[] r1 = this.DW;
        java.lang.System.arraycopy(r1, 0, r0.DW, 0, r1.length);
        boolean[] r2 = this.FH;
        java.lang.System.arraycopy(r2, 0, r0.FH, 0, r2.length);
        r0.Hw = this.Hw;
        return r0;
    }

    public int size() {
        return this.Hw;
    }

    public void yS() {
        J8();
        this.FH[this.Hw] = true;
    }
}
