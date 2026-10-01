package abcd;

public final class Om {
    private final abcd.Nm DW;
    private final abcd.au FH;
    private final abcd.AbstractRm j6;

    public Om(int r2, int r3) {
        this(new abcd.Vm(r2), new abcd.Nm(r3));
    }

    private Om(abcd.AbstractRm r2, abcd.Nm r3) {
        this(r2, r3, abcd.au.DW);
    }

    private Om(abcd.AbstractRm r1, abcd.Nm r2, abcd.au r3) {
        if (r1 == null) goto L10;
        if (r2 == null) goto L8;
        r3.Ws();
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        return;
    L8:
        throw new java.lang.NullPointerException("stack == null");
    L10:
        throw new java.lang.NullPointerException("locals == null");
    }

    private static abcd.AbstractRm j6(abcd.AbstractRm r1, abcd.au r2) {
        if ((r1 instanceof abcd.Sm) == true) goto L5;
        return r1;
    L5:
        abcd.Sm r3 = (abcd.Sm) r1;
        if (r2.size() == 0) goto L8;
        return r3;
    L8:
        return r3.rN();
    }

    private abcd.au j6(abcd.au r7) {
        if (this.FH.equals(r7) == true) goto L5;
        abcd.au r0 = new abcd.au();
        int r1 = this.FH.size();
        int r2 = r7.size();
        int r3 = 0;
    L7:
        if (r3 >= r1) goto L12;
        if (r3 >= r2) goto L12;
        if (this.FH.get(r3) != r7.get(r3)) goto L12;
        r0.DW(r3);
        r3 = r3 + 1;
    L12:
        r0.we();
        return r0;
    L5:
        return this.FH;
    }

    public abcd.Om DW(int r5, int r6) {
        abcd.AbstractRm r1 = this.j6;
        if ((r1 instanceof abcd.Sm) == false) goto L5;
        abcd.AbstractRm r7 = ((abcd.Sm) r1).DW(r6);
    L19:
        abcd.au r2 = this.FH.lg();     // Catch: java.lang.NullPointerException -> L15 java.lang.IndexOutOfBoundsException -> L17
        if (r2.rN() != r5) goto L14;
        r2.we();     // Catch: java.lang.NullPointerException -> L15 java.lang.IndexOutOfBoundsException -> L17
        if (r7 != null) goto L12;
        return null;
    L12:
        return new abcd.Om(r7, this.DW, r2);
    L14:
        throw new java.lang.RuntimeException("returning from invalid subroutine");     // Catch: java.lang.NullPointerException -> L15 java.lang.IndexOutOfBoundsException -> L17
    L18:
        throw new java.lang.RuntimeException("returning from invalid subroutine");
    L16:
        throw new java.lang.NullPointerException("can't return from non-subroutine");
    L5:
        r7 = null;
        goto L19
    }

    public abcd.AbstractRm DW() {
        return this.j6;
    }

    public abcd.Nm FH() {
        return this.DW;
    }

    public abcd.au Hw() {
        return this.FH;
    }

    public abcd.Om j6() {
        return new abcd.Om(this.j6.lg(), this.DW.rN(), this.FH);
    }

    public abcd.Om j6(int r5, int r6) {
        this.FH.lg().DW(r5);
        return new abcd.Om(this.j6.rN(), this.DW, abcd.au.Zo(r5)).j6(this, r5, r6);
    }

    public abcd.Om j6(abcd.Ks r4) {
        abcd.Nm r0 = FH().rN();
        r0.lg();
        r0.j6(r4);
        return new abcd.Om(DW(), r0, this.FH);
    }

    public abcd.Om j6(abcd.Om r4) {
        abcd.AbstractRm r0 = DW().j6(r4.DW());
        abcd.Nm r1 = FH().j6(r4.FH());
        abcd.au r5 = j6(r4.FH);
        abcd.AbstractRm r2 = j6(r0, r5);
        if (r2 != DW()) goto L10;
        if (r1 != FH()) goto L10;
        if (this.FH != r5) goto L10;
        return this;
    L10:
        return new abcd.Om(r2, r1, r5);
    }

    public abcd.Om j6(abcd.Om r8, int r9, int r10) {
        abcd.Sm r11 = DW().j6(r8.DW(), r10);
        abcd.Nm r0 = FH().j6(r8.FH());
        abcd.au r12 = r8.FH.lg();
        r12.DW(r9);
        r12.we();
        if (r11 != DW()) goto L10;
        if (r0 != FH()) goto L10;
        if (this.FH.equals(r12) == false) goto L10;
        return this;
    L10:
        if (this.FH.equals(r12) == false) goto L13;
        r12 = this.FH;
    L24:
        return new abcd.Om(r11, r0, r12);
    L13:
        if (this.FH.size() <= r12.size()) goto L15;
        abcd.au r13 = r12;
        r12 = this.FH;
    L16:
        int r1 = r12.size();
        int r2 = r13.size();
        int r3 = r2 - 1;
    L17:
        if (r3 < 0) goto L24;
        if (r13.get(r3) != r12.get((r1 - r2) + r3)) goto L22;
        r3 = r3 - 1;
        goto L17
    L22:
        throw new java.lang.RuntimeException("Incompatible merged subroutines");
    L15:
        r13 = this.FH;
        goto L16
    }

    public void j6(abcd.Ps r6) {
        int r0 = r6.size();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r0) goto L5;
        abcd.Qs r3 = r6.get(r1);
        this.j6.j6(r2, r3);
        r2 = r2 + r3.Zo();
        r1 = r1 + 1;
        goto L3
    }

    public void j6(abcd.Qs r2) {
        this.j6.DW(r2);
        this.DW.DW(r2);
    }

    public void j6(abcd.Vt r2) {
        this.j6.j6(r2);
        this.DW.j6(r2);
    }

    public void v5() {
        this.j6.we();
        this.DW.we();
    }
}
