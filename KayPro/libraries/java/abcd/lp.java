package abcd;

public final class lp extends abcd.Abstractmp implements java.lang.Comparable<abcd.lp> {
    private final abcd.ws DW;

    public lp(abcd.ws r1, int r2) {
        super(r2);
        if (r1 == null) goto L7;
        this.DW = r1;
        return;
    L7:
        throw new java.lang.NullPointerException("field == null");
    }

    public abcd.ws Zo() {
        return this.DW;
    }

    @Override
    public java.lang.String aM() {
        return this.DW.aM();
    }

    @Override
    public int compareTo(abcd.lp r1) {
        return j6(r1);
    }

    public boolean equals(java.lang.Object r3) {
        if ((r3 instanceof abcd.lp) == true) goto L6;
        return false;
    L6:
        if (j6((abcd.lp) r3) != 0) goto L9;
        return true;
    L9:
        return false;
    }

    public int hashCode() {
        return this.DW.hashCode();
    }

    @Override
    public int j6(abcd.jp r5, abcd.Lt r6, int r7, int r8) {
        int r9 = r5.v5().j6(this.DW);
        int r10 = r9 - r7;
        int r0 = Hw();
        if (r6.Hw() == false) goto L5;
        r6.j6(0, java.lang.String.format("  [%x] %s", new java.lang.Object[]{java.lang.Integer.valueOf(r8), this.DW.aM()}));
        r6.j6(abcd.eu.j6(r10), "    field_idx:    " + abcd.Yt.gn(r9));
        r6.j6(abcd.eu.j6(r0), "    access_flags: " + abcd.Mr.DW(r0));
    L5:
        r6.DW(r10);
        r6.DW(r0);
        return r9;
    }

    public int j6(abcd.lp r2) {
        return this.DW.j6(r2.DW);
    }

    public void j6(abcd.jp r2) {
        r2.v5().DW(this.DW);
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append(abcd.lp.class.getName());
        r0.append('{');
        r0.append(abcd.Yt.v5(Hw()));
        r0.append(' ');
        r0.append(this.DW);
        r0.append('}');
        return r0.toString();
    }
}
