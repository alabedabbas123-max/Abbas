package abcd;

public final class es {
    private final abcd.Qs DW;
    private final abcd.Ss FH;
    private final abcd.Ss Hw;
    private final java.lang.String VH;
    private final boolean Zo;
    private final int j6;
    private final int v5;

    public es(int r9, abcd.Qs r10, abcd.Ss r11, int r12, java.lang.String r13) {
        this(r9, r10, r11, abcd.Ps.FH, r12, false, r13);
    }

    public es(int r3, abcd.Qs r4, abcd.Ss r5, abcd.Ss r6, int r7, boolean r8, java.lang.String r9) {
        if (r4 == null) goto L25;
        if (r5 == null) goto L23;
        if (r6 == null) goto L21;
        if (r7 < 1) goto L19;
        if (r7 > 6) goto L19;
        if (r6.size() == 0) goto L16;
        if (r7 == 6) goto L16;
        throw new java.lang.IllegalArgumentException("exceptions / branchingness mismatch");
    L16:
        this.j6 = r3;
        this.DW = r4;
        this.FH = r5;
        this.Hw = r6;
        this.v5 = r7;
        this.Zo = r8;
        this.VH = r9;
        return;
    L19:
        throw new java.lang.IllegalArgumentException("bogus branchingness");
    L21:
        throw new java.lang.NullPointerException("exceptions == null");
    L23:
        throw new java.lang.NullPointerException("sources == null");
    L25:
        throw new java.lang.NullPointerException("result == null");
    }

    public es(int r9, abcd.Qs r10, abcd.Ss r11, abcd.Ss r12, java.lang.String r13) {
        this(r9, r10, r11, r12, 6, false, r13);
    }

    public es(int r9, abcd.Qs r10, abcd.Ss r11, java.lang.String r12) {
        this(r9, r10, r11, abcd.Ps.FH, 1, false, r12);
    }

    public es(int r9, abcd.Ss r10, abcd.Ss r11) {
        this(r9, abcd.Qs.tp, r10, r11, 6, true, null);
    }

    public int DW() {
        return this.v5;
    }

    public java.lang.String FH() {
        java.lang.String r0 = this.VH;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return toString();
    }

    public int Hw() {
        return this.j6;
    }

    public boolean VH() {
        return this.Zo;
    }

    public abcd.Ss Zo() {
        return this.FH;
    }

    public boolean equals(java.lang.Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof abcd.es) == true) goto L8;
        return false;
    L8:
        abcd.es r6 = (abcd.es) r5;
        if (this.j6 == r6.j6) goto L11;
    L19:
        return false;
    L11:
        if (this.v5 != r6.v5) goto L19;
        if (this.DW != r6.DW) goto L19;
        if (this.FH.equals(r6.FH) == false) goto L19;
        if (this.Hw.equals(r6.Hw) == false) goto L19;
        return true;
    }

    public boolean gn() {
        int r0 = this.j6;
        if (r0 != 14) goto L5;
        return true;
    L5:
        if (r0 == 16) goto L11;
        switch(r0) {
            case 20: goto L12;
            case 21: goto L12;
            case 22: goto L12;
            default: goto L7;
        };
    L7:
        return false;
    L12:
        return true;
    L11:
        return true;
    }

    public int hashCode() {
        return (((((((this.j6 * 31) + this.v5) * 31) + this.DW.hashCode()) * 31) + this.FH.hashCode()) * 31) + this.Hw.hashCode();
    }

    public final boolean j6() {
        if (this.Hw.size() == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(40);
        r0.append("Rop{");
        r0.append(abcd._r.DW(this.j6));
        if (this.DW == abcd.Qs.tp) goto L5;
        r0.append(" ");
        r0.append(this.DW);
    L6:
        r0.append(" <-");
        int r1 = this.FH.size();
        int r5 = 0;
        if (r1 != 0) goto L9;
        r0.append(" .");
    L13:
        if (this.Zo == false) goto L15;
        r0.append(" call");
    L15:
        int r2 = this.Hw.size();
        if (r2 == 0) goto L24;
        r0.append(" throws");
    L18:
        if (r5 >= r2) goto L40;
        r0.append(' ');
        if (this.Hw.getType(r5) != abcd.Qs.j3) goto L22;
        r0.append("<any>");
    L23:
        r5 = r5 + 1;
        goto L18
    L22:
        r0.append(this.Hw.getType(r5));
    L40:
        r0.append('}');
        return r0.toString();
    L24:
        int r3 = this.v5;
        if (r3 != 1) goto L27;
        r0.append(" flows");
        goto L40
    L27:
        if (r3 != 2) goto L29;
        r0.append(" returns");
        goto L40
    L29:
        if (r3 != 3) goto L31;
        r0.append(" gotos");
        goto L40
    L31:
        if (r3 != 4) goto L33;
        r0.append(" ifs");
        goto L40
    L33:
        if (r3 == 5) goto L35;
        r0.append(" " + abcd.Yt.Hw(this.v5));
        goto L40
    L35:
        r0.append(" switches");
        goto L40
    L9:
        int r4 = 0;
    L10:
        if (r4 >= r1) goto L13;
        r0.append(' ');
        r0.append(this.FH.getType(r4));
        r4 = r4 + 1;
        goto L10
    L5:
        r0.append(" .");
        goto L6
    }

    public abcd.Qs v5() {
        return this.DW;
    }
}
