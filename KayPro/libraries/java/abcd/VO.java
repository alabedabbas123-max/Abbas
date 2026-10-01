package abcd;

public class VO extends abcd.SO {
    private java.math.BigInteger FH;

    public VO(java.math.BigInteger r2, abcd.TO r3) {
        super(false, r3);
        this.FH = r2;
    }

    public java.math.BigInteger FH() {
        return this.FH;
    }

    @Override
    public boolean equals(java.lang.Object r4) {
        if ((r4 instanceof abcd.VO) == true) goto L6;
        return false;
    L6:
        if (((abcd.VO) r4).FH().equals(this.FH) == true) goto L8;
    L11:
        return false;
    L8:
        if (super.equals(r4) == false) goto L11;
        return true;
    }

    @Override
    public int hashCode() {
        return this.FH.hashCode() ^ super.hashCode();
    }
}
