package abcd;

public class RO extends abcd.uO {
    private abcd.TO FH;

    public RO(java.security.SecureRandom r2, abcd.TO r3) {
        super(r2, j6(r3));
        this.FH = r3;
    }

    static int j6(abcd.TO r1) {
        if (r1.DW() == 0) goto L6;
        return r1.DW();
    L6:
        return r1.Hw().bitLength();
    }

    public abcd.TO DW() {
        return this.FH;
    }
}
