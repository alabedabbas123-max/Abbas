package abcd;

public abstract class AbstractrE {
    public static final abcd.AbstractrE DW = null;
    public static final abcd.AbstractrE FH = null;
    public static final abcd.AbstractrE Hw = null;
    public static final abcd.AbstractrE Zo = null;
    public static final abcd.AbstractrE j6 = null;
    public static final abcd.AbstractrE v5 = null;
    private final byte[] VH;
    private final int gn;
    private final int u7;

    static {
        j6 = new abcd.kE(16384, 2);
        DW = new abcd.lE(40960, 3);
        FH = new abcd.mE(33188, 3);
        Hw = new abcd.nE(33261, 3);
        v5 = new abcd.oE(57344, 1);
        Zo = new abcd.pE(0, -1);
    }

    private AbstractrE(int r5, int r6) {
        this.gn = r5;
        this.u7 = r6;
        int r0 = 0;
        if (r5 == 0) goto L12;
        byte[] r1 = new byte[10];
        int r2 = r1.length;
    L5:
        if (r5 == 0) goto L6;
        r2 = r2 - 1;
        r1[r2] = (byte) ((r5 & 7) + 48);
        r5 = r5 >> 3;
        goto L5
    L6:
        this.VH = new byte[r1.length - r2];
    L7:
        byte[] r7 = this.VH;
        if (r0 >= r7.length) goto L16;
        r7[r0] = r1[r2 + r0];
        r0 = r0 + 1;
        goto L7
    L16:
        return;
    L12:
        this.VH = new byte[]{48};
    }

    AbstractrE(int r1, int r2, abcd.AbstractrE r3) {
        this(r1, r2);
    }

    public static final abcd.AbstractrE DW(int r2) {
        int r0 = 61440 & r2;
        if (r0 != 0) goto L5;
        if (r2 == 0) goto L27;
    L29:
        return new abcd.qE(r2, -1, r2);
    L27:
        return Zo;
    L5:
        if (r0 == 16384) goto L24;
        if (r0 == 32768) goto L18;
        if (r0 == 40960) goto L16;
        if (r0 != 57344) goto L29;
        return v5;
    L16:
        return DW;
    L18:
        if ((r2 & 73) == 0) goto L22;
        return Hw;
    L22:
        return FH;
    L24:
        return j6;
    }

    public int DW() {
        return this.gn;
    }

    public int FH() {
        return this.u7;
    }

    public int j6() {
        return this.VH.length;
    }

    public void j6(java.io.OutputStream r2) {
        r2.write(this.VH);
    }

    public void j6(byte[] r4, int r5) {
        byte[] r0 = this.VH;
        java.lang.System.arraycopy(r0, 0, r4, r5, r0.length);
    }

    public abstract boolean j6(int r1);

    public java.lang.String toString() {
        return java.lang.Integer.toOctalString(this.gn);
    }
}
