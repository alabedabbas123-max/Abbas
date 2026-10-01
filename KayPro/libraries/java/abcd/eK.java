package abcd;

public class eK extends abcd.AbstractjK {
    private final int FH;

    public eK(int r1) {
        this.FH = r1;
    }

    @Override
    public abcd.AbstractjK clone() {
        return this;
    }

    @Override
    public boolean j6() {
        return false;
    }

    @Override
    public boolean j6(abcd.YJ r3) {
        abcd._J r4 = (abcd._J) r3.j6(this.FH, abcd._J.class);
        if (r4 != null) goto L5;
        return true;
    L5:
        if (r4.U2() == false) goto L10;
        return false;
    L10:
        return true;
    }

    @Override
    public java.lang.String toString() {
        return "NotIgnored(" + this.FH + ")";
    }
}
