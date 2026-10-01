package abcd;

public final class go {
    private java.util.ArrayList<abcd.AbstractVn> DW;
    private final abcd.ho j6;

    public go(abcd.Fn r2, int r3, int r4, int r5) {
        this.j6 = new abcd.ho(r2, r3, r5);
        this.DW = new java.util.ArrayList(r4);
    }

    private void DW() {
        int r0 = this.DW.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        this.j6.j6(this.DW.get(r1));
        r1 = r1 + 1;
        goto L3
    L5:
        this.DW = null;
    }

    public void DW(abcd.AbstractVn r2) {
        this.DW.add(r2);
    }

    public abcd.ho j6() {
        if (this.DW == null) goto L7;
        DW();
        return this.j6;
    L7:
        throw new java.lang.UnsupportedOperationException("already processed");
    }

    public void j6(int r2, abcd.Sn r3) {
        this.j6.j6(r2, r3);
    }

    public void j6(abcd.AbstractVn r2) {
        this.j6.j6(r2);
    }
}
