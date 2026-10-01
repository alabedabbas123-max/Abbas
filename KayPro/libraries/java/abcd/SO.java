package abcd;

public class SO extends abcd.PO {
    private abcd.TO DW;

    protected SO(boolean r1, abcd.TO r2) {
        super(r1);
        this.DW = r2;
    }

    public abcd.TO DW() {
        return this.DW;
    }

    public boolean equals(java.lang.Object r3) {
        if ((r3 instanceof abcd.SO) == true) goto L5;
        return false;
    L5:
        abcd.SO r4 = (abcd.SO) r3;
        abcd.TO r0 = this.DW;
        if (r0 != null) goto L13;
        if (r4.DW() != null) goto L11;
        return true;
    L11:
        return false;
    L13:
        return r0.equals(r4.DW());
    }

    public int hashCode() {
        if (j6() == false) goto L5;
        int r0 = 0;
    L6:
        abcd.TO r1 = this.DW;
        if (r1 != null) goto L9;
        return r0;
    L9:
        return r0 ^ r1.hashCode();
    L5:
        r0 = 1;
        goto L6
    }
}
