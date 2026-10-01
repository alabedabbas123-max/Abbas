package abcd;

public class WF extends abcd.AbstractjK {
    private final abcd.fK FH;
    private abcd.AbstractbG Hw;

    WF(abcd.fK r1) {
        this.FH = r1;
    }

    public static abcd.WF j6(java.lang.String r1) {
        return new abcd.WF(abcd.fK.j6(r1));
    }

    public java.lang.String DW() {
        return this.FH.DW();
    }

    public abcd.AbstractbG FH() {
        return this.Hw;
    }

    @Override
    public abcd.AbstractjK clone() {
        abcd.fK r1 = this.FH;
        r1.clone();
        return new abcd.WF(r1);
    }

    public void j6(abcd.AbstractbG r1) {
        this.Hw = r1;
    }

    @Override
    public boolean j6() {
        if (this.FH.j6() == false) goto L5;
        return true;
    L5:
        if (abcd.AbstractjK.DW.j6() == true) goto L10;
        return false;
    L10:
        return true;
    }

    @Override
    public boolean j6(abcd.YJ r2) {
        if (this.FH.j6(r2) == true) goto L5;
        return false;
    L5:
        if (abcd.AbstractjK.DW.j6(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override
    public java.lang.String toString() {
        return "(FOLLOW(" + this.FH.toString() + ") AND " + abcd.AbstractjK.DW.toString() + ")";
    }
}
