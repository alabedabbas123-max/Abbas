package abcd;

public final class hs {
    public static final abcd.hs j6 = null;
    private final abcd.Js DW;
    private final int FH;
    private final int Hw;

    static {
        j6 = new abcd.hs(null, -1, -1);
    }

    public hs(abcd.Js r2, int r3, int r4) {
        if (r3 < (-1)) goto L10;
        if (r4 < (-1)) goto L8;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        return;
    L8:
        throw new java.lang.IllegalArgumentException("line < -1");
    L10:
        throw new java.lang.IllegalArgumentException("address < -1");
    }

    public boolean DW(abcd.hs r3) {
        if (this.Hw != r3.Hw) goto L10;
        abcd.Js r0 = this.DW;
        abcd.Js r4 = r3.DW;
        if (r0 == r4) goto L9;
        if (r0 == null) goto L10;
        if (r0.equals(r4) == false) goto L10;
    L9:
        return true;
    L10:
        return false;
    }

    public boolean equals(java.lang.Object r5) {
        if ((r5 instanceof abcd.hs) == true) goto L6;
        return false;
    L6:
        if (this != r5) goto L8;
        return true;
    L8:
        abcd.hs r6 = (abcd.hs) r5;
        if (this.FH == r6.FH) goto L11;
    L13:
        return false;
    L11:
        if (DW(r6) == false) goto L13;
        return true;
    }

    public int hashCode() {
        return (this.DW.hashCode() + this.FH) + this.Hw;
    }

    public int j6() {
        return this.Hw;
    }

    public boolean j6(abcd.hs r2) {
        if (this.Hw != r2.Hw) goto L5;
        return true;
    L5:
        return false;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(50);
        abcd.Js r1 = this.DW;
        if (r1 == null) goto L5;
        r0.append(r1.aM());
        r0.append(":");
    L5:
        int r2 = this.Hw;
        if (r2 < 0) goto L8;
        r0.append(r2);
    L8:
        r0.append('@');
        int r3 = this.FH;
        if (r3 >= 0) goto L11;
        r0.append("????");
    L13:
        return r0.toString();
    L11:
        r0.append(abcd.Yt.v5(r3));
        goto L13
    }
}
