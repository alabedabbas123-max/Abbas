package abcd;

public final class Xr extends abcd.hu {
    private final int DW;
    private final abcd.ds FH;
    private final abcd.ds[] Hw;
    private final java.util.HashMap<abcd.Tr, abcd.bs> v5;

    public Xr(abcd.fs r4) {
        if (r4 == null) goto L7;
        abcd.Or r5 = r4.j6();
        int r0 = r5.rN();
        this.DW = r5.BT();
        this.FH = new abcd.ds(this.DW);
        this.Hw = new abcd.ds[r0];
        this.v5 = new java.util.HashMap(r5.yS());
        this.FH.we();
        return;
    L7:
        throw new java.lang.NullPointerException("method == null");
    }

    private abcd.ds Hw(int r2) {
        return this.Hw[r2];
    L5:
        throw new java.lang.IllegalArgumentException("bogus label");
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
        throw new java.lang.IllegalArgumentException("bogus label");
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

    public abcd.bs j6(abcd.Tr r2) {
        return this.v5.get(r2);
    }

    public abcd.ds j6(abcd.Nr r1) {
        return DW(r1.DW());
    }

    public void j6(abcd.Tr r2, abcd.bs r3) {
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

    public boolean j6(int r5, abcd.ds r6) {
        abcd.ds r0 = Hw(r5);
        if (r0 != null) goto L6;
        DW(r5, r6);
        return true;
    L6:
        abcd.ds r2 = r0.rN();
        if (r0.size() == 0) goto L9;
        r2.j6(r6, true);
    L11:
        if (r0.equals(r2) == false) goto L14;
        return false;
    L14:
        r2.we();
        DW(r5, r2);
        return true;
    L9:
        r2 = r6.rN();
        goto L11
    }

    public int lg() {
        return this.v5.size();
    }
}
