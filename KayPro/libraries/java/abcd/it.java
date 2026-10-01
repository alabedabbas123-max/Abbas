package abcd;

public class it extends abcd.hu {
    private final int DW;
    private final abcd.ds FH;
    private final abcd.ds[] Hw;
    private final java.util.HashMap<abcd.Abstractvt, abcd.bs> v5;

    public it(abcd.yt r3) {
        if (r3 == null) goto L7;
        java.util.ArrayList<abcd.tt> r0 = r3.DW();
        this.DW = r3.u7();
        this.FH = new abcd.ds(this.DW);
        this.Hw = new abcd.ds[r0.size()];
        this.v5 = new java.util.HashMap();
        this.FH.we();
        return;
    L7:
        throw new java.lang.NullPointerException("method == null");
    }

    private abcd.ds Hw(int r2) {
        return this.Hw[r2];
    L5:
        throw new java.lang.IllegalArgumentException("bogus index");
    }

    public abcd.ds DW(int r1) {
        abcd.ds r2 = Hw(r1);
        if (r2 == null) goto L6;
        return r2;
    L6:
        return this.FH;
    }

    public void DW(int r2, abcd.ds r3) {
        J8();
        if (r3 == null) goto L9;
        this.Hw[r2] = r3;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L6
        return;
    L7:
        throw new java.lang.IllegalArgumentException("bogus index");
    L9:
        throw new java.lang.NullPointerException("specs == null");
    }

    public abcd.ds FH(int r2) {
        abcd.ds r3 = Hw(r2);
        if (r3 == null) goto L6;
        return r3.rN();
    L6:
        return new abcd.ds(this.DW);
    }

    public void j6(abcd.Abstractvt r2, abcd.bs r3) {
        J8();
        if (r2 == null) goto L10;
        if (r3 == null) goto L8;
        this.v5.put(r2, r3);
        return;
    L8:
        throw new java.lang.NullPointerException("spec == null");
    L10:
        throw new java.lang.NullPointerException("insn == null");
    }

    public boolean j6(int r4, abcd.ds r5) {
        abcd.ds r0 = Hw(r4);
        if (r0 != null) goto L6;
        DW(r4, r5);
        return true;
    L6:
        abcd.ds r2 = r0.rN();
        r2.j6(r5, true);
        if (r0.equals(r2) == false) goto L10;
        return false;
    L10:
        r2.we();
        DW(r4, r2);
        return true;
    }
}
