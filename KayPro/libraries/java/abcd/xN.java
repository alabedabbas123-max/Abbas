package abcd;

public class xN extends abcd.AbstractyL {
    abcd.wL DW;
    abcd.dM j6;

    private xN(abcd.FL r4) {
        this.j6 = new abcd.dM(false);
        this.DW = null;
        if (r4.tp() != 0) goto L6;
        this.j6 = null;
        this.DW = null;
        return;
    L6:
        if ((r4.j6(0) instanceof abcd.dM) == false) goto L8;
        this.j6 = abcd.dM.j6(r4.j6(0));
    L10:
        if (r4.tp() > 1) goto L12;
        return;
    L12:
        if (this.j6 == null) goto L15;
        this.DW = abcd.lM.j6(r4.j6(1));
        return;
    L15:
        throw new java.lang.IllegalArgumentException("wrong sequence in constructor");
    L8:
        this.j6 = null;
        this.DW = abcd.lM.j6(r4.j6(0));
        goto L10
    }

    public static abcd.xN j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.xN) == false) goto L7;
        return (abcd.xN) r1;
    L7:
        if ((r1 instanceof abcd.IN) == true) goto L9;
        if (r1 != null) goto L12;
        return null;
    L12:
        return new abcd.xN(abcd.FL.j6(r1));
    L9:
        return j6(abcd.IN.j6((abcd.IN) r1));
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        abcd.dM r1 = this.j6;
        if (r1 == null) goto L5;
        r0.j6(r1);
    L5:
        abcd.wL r2 = this.DW;
        if (r2 == null) goto L9;
        r0.j6(r2);
    L9:
        return new abcd.tM(r0);
    }

    public boolean Zo() {
        abcd.dM r0 = this.j6;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.u7() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public java.lang.String toString() {
        if (this.DW != null) goto L11;
        if (this.j6 != null) goto L9;
        return "BasicConstraints: isCa(false)";
    L9:
        return "BasicConstraints: isCa(" + Zo() + ")";
    L11:
        return "BasicConstraints: isCa(" + Zo() + "), pathLenConstraint = " + this.DW.tp();
    }

    public java.math.BigInteger v5() {
        abcd.wL r0 = this.DW;
        if (r0 != null) goto L5;
        return null;
    L5:
        return r0.tp();
    }
}
