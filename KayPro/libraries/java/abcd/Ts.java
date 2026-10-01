package abcd;

public class Ts extends abcd.Abstractqt {
    private int DW;
    private abcd.au j6;

    public Ts(int r2) {
        this.j6 = new abcd.au(r2);
    }

    @Override
    public int j6() {
        return this.DW;
    }

    public int j6(int r2) {
        if (r2 < this.j6.size()) goto L7;
        return -1;
    L7:
        return this.j6.get(r2);
    }

    @Override
    public abcd.bs j6(abcd.bs r3) {
        if (r3 != null) goto L13;
        return null;
    L13:
        int r0 = this.j6.get(r3.we());     // Catch: java.lang.IndexOutOfBoundsException -> L7
    L8:
        if (r0 < 0) goto L12;
        return r3.FH(r0);
    L12:
        throw new java.lang.RuntimeException("no mapping specified for register");
    L7:
        r0 = -1;
        goto L8
    }

    public void j6(int r4, int r5, int r6) {
        if (r4 < this.j6.size()) goto L7;
        int r0 = r4 - this.j6.size();
    L5:
        if (r0 < 0) goto L7;
        this.j6.DW(-1);
        r0 = r0 - 1;
    L7:
        this.j6.FH(r4, r5);
        int r7 = r5 + r6;
        if (this.DW >= r7) goto L12;
        this.DW = r7;
        return;
    }
}
