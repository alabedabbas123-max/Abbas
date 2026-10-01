package abcd;

public class uF<S extends abcd.CC> implements java.lang.Iterable<abcd.qF> {
    private static final abcd.qF.a[] j6 = null;
    private final java.util.List<S> DW;
    private final abcd.CK FH;
    private boolean Hw;

    static {
        j6 = abcd.qF.a.values();
    }

    public uF(java.util.List<S> r2) {
        this.FH = new abcd.CK();
        this.Hw = false;
        this.DW = r2;
    }

    static abcd.CK j6(abcd.uF r0) {
        return r0.FH;
    }

    static abcd.qF.a[] j6() {
        return j6;
    }

    public boolean DW() {
        return this.Hw;
    }

    public java.util.List<S> FH() {
        return this.DW;
    }

    @Override
    public java.util.Iterator<abcd.qF> iterator() {
        return new abcd.tF(this);
    }

    public void j6(int r3, int r4, int r5, abcd.qF.a r6) {
        this.FH.j6(r6.ordinal());
        this.FH.j6(r3);
        this.FH.j6(r4);
        this.FH.j6(r5);
        if (r6 == abcd.qF.a.j6) goto L6;
        this.Hw = true;
        return;
    }
}
