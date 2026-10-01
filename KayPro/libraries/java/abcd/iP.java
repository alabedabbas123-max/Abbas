package abcd;

public class iP extends java.security.BasicPermission {
    private final int DW;
    private final java.lang.String j6;

    public iP(java.lang.String r1, java.lang.String r2) {
        super(r1, r2);
        this.j6 = r2;
        this.DW = j6(r2);
    }

    private int j6(java.lang.String r4) {
        java.util.StringTokenizer r0 = new java.util.StringTokenizer(abcd.TP.DW(r4), " ,");
        int r5 = 0;
    L4:
        if (r0.hasMoreTokens() == false) goto L5;
        java.lang.String r1 = r0.nextToken();
        if (r1.equals("threadlocalecimplicitlyca") == true) goto L11;
        if (r1.equals("ecimplicitlyca") == true) goto L14;
        if (r1.equals("threadlocaldhdefaultparams") == true) goto L17;
        if (r1.equals("dhdefaultparams") == true) goto L20;
        if (r1.equals("all") == false) goto L4;
        r5 = r5 | 15;
        goto L4
    L20:
        r5 = r5 | 8;
        goto L4
    L17:
        r5 = r5 | 4;
        goto L4
    L14:
        r5 = r5 | 2;
        goto L4
    L11:
        r5 = r5 | 1;
        goto L4
    L5:
        if (r5 == 0) goto L8;
        return r5;
    L8:
        throw new java.lang.IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(java.lang.Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof abcd.iP) == false) goto L12;
        abcd.iP r6 = (abcd.iP) r5;
        if (this.DW != r6.DW) goto L12;
        if (getName().equals(r6.getName()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    @Override
    public java.lang.String getActions() {
        return this.j6;
    }

    public int hashCode() {
        return getName().hashCode() + this.DW;
    }

    @Override
    public boolean implies(java.security.Permission r4) {
        if ((r4 instanceof abcd.iP) == true) goto L6;
        return false;
    L6:
        if (getName().equals(r4.getName()) == true) goto L8;
        return false;
    L8:
        int r0 = this.DW;
        int r5 = ((abcd.iP) r4).DW;
        if ((r0 & r5) != r5) goto L12;
        return true;
    L12:
        return false;
    }
}
