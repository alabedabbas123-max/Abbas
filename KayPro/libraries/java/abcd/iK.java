package abcd;

public class iK extends abcd.AbstractjK {
    private final int FH;

    public iK(int r1) {
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
        abcd.RC r4 = (abcd.RC) r3.j6(this.FH, abcd.RC.class);
        if (r4 != null) goto L5;
        return true;
    L5:
        abcd.QC r5 = r4.J8();
        if (r5 != null) goto L8;
    L11:
        return true;
    L8:
        if (r5.we() == false) goto L11;
        return false;
    }

    @Override
    public java.lang.String toString() {
        return "SkipWorkTree(" + this.FH + ")";
    }
}
