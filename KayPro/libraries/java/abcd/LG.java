package abcd;

public class LG {
    public static final abcd.LG DW = null;
    public static final abcd.LG j6 = null;
    private final long FH;
    private volatile long Hw;
    private boolean v5;

    static {
        j6 = new abcd.LG(-1, -1);
        DW = new abcd.KG(0, 0);
    }

    private LG(long r1, long r3) {
        this.Hw = r1;
        this.FH = r3;
        this.v5 = DW(r1);
    }

    LG(long r1, long r3, abcd.LG r5) {
        this(r1, r3);
    }

    public static abcd.LG DW(java.io.File r4) {
        return new abcd.LG(java.lang.System.currentTimeMillis(), r4.lastModified());
    }

    private boolean DW(long r4) {
        if ((r4 - this.FH) <= 2500) goto L6;
        return true;
    L6:
        return false;
    }

    private boolean j6(long r5) {
        if (this.FH == r5) goto L6;
        return true;
    L6:
        if (this.v5 == false) goto L9;
        return false;
    L9:
        if (DW(this.Hw) == false) goto L11;
        return false;
    L11:
        this.Hw = java.lang.System.currentTimeMillis();
        if (DW(this.Hw) == false) goto L14;
        return false;
    L14:
        return true;
    }

    public void DW(abcd.LG r3) {
        long r0 = r3.Hw;
        if (DW(r0) == false) goto L5;
        this.v5 = true;
    L5:
        this.Hw = r0;
    }

    public boolean equals(java.lang.Object r2) {
        if ((r2 instanceof abcd.LG) == true) goto L5;
        return false;
    L5:
        return j6((abcd.LG) r2);
    }

    public int hashCode() {
        return (int) this.FH;
    }

    public long j6() {
        return this.FH;
    }

    public boolean j6(abcd.LG r5) {
        if (this.FH != r5.FH) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean j6(java.io.File r3) {
        return j6(r3.lastModified());
    }
}
