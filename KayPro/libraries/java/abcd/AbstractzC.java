package abcd;

public abstract class AbstractzC extends DC<abcd.tC> {
    public static final abcd.AbstractzC DW = null;
    public static final abcd.AbstractzC FH = null;
    public static final abcd.AbstractzC Hw = null;
    public static final abcd.AbstractzC j6 = null;
    public static final abcd.AbstractzC v5 = null;

    static {
        j6 = new abcd.uC();
        DW = new abcd.vC();
        FH = new abcd.wC();
        Hw = new abcd.xC();
        v5 = new abcd.yC();
    }

    public AbstractzC() {
    }

    private static int DW(abcd.CK r1, int r2, int r3) {
    L2:
        if (r2 <= 0) goto L7;
        if (r3 > r1.DW(r2)) goto L7;
        r2 = r2 - 1;
    L7:
        return r2;
    }

    private static int j6(abcd.CK r2, int r3, int r4) {
        int r0 = r2.DW() - 2;
    L3:
        if (r3 >= r0) goto L8;
        if (r2.DW(r3 + 2) >= r4) goto L8;
        r3 = r3 + 1;
    L8:
        return r3;
    }

    public int j6(abcd.CC r1, int r2) {
        return j6((abcd.tC) r1, r2);
    }

    public int j6(abcd.tC r3, int r4) {
        int r0 = r3.FH.DW(r4 + 1);
        int r5 = r3.FH.DW(r4 + 2);
        return j6(r3.DW, r0, r5);
    }

    protected abstract int j6(byte[] r1, int r2, int r3);

    public abcd.jC j6(abcd.CC r1, abcd.CC r2, abcd.jC r3) {
        j6((abcd.tC) r1, (abcd.tC) r2, r3);
        return r3;
    }

    public abcd.jC j6(abcd.tC r10, abcd.tC r11, abcd.jC r12) {
        int r0 = r12.j6;
        if (r0 != r12.DW) goto L5;
    L41:
        return r12;
    L5:
        if (r12.FH == r12.Hw) goto L41;
        byte[] r1 = r10.DW;
        byte[] r2 = r11.DW;
        int r3 = r10.FH.DW(r0 + 1);
        int r4 = r10.FH.DW(r12.FH + 1);
        int r5 = r10.FH.DW(r12.DW + 1);
        int r6 = r11.FH.DW(r12.Hw + 1);
        if (r3 < 0) goto L40;
        if (r4 < 0) goto L40;
        if (r5 > r1.length) goto L40;
        if (r6 > r2.length) goto L40;
    L14:
        if (r3 >= r5) goto L20;
        if (r4 >= r6) goto L20;
        if (r1[r3] != r2[r4]) goto L20;
        r3 = r3 + 1;
        r4 = r4 + 1;
    L20:
        if (r3 >= r5) goto L26;
        if (r4 >= r6) goto L26;
        if (r1[r5 - 1] != r2[r6 - 1]) goto L26;
        r5 = r5 - 1;
        r6 = r6 - 1;
    L26:
        r12.j6 = j6(r10.FH, r12.j6, r3);
        r12.FH = j6(r11.FH, r12.FH, r4);
        r12.DW = DW(r10.FH, r12.DW, r5);
        if (r5 >= r10.FH.DW(r12.DW + 1)) goto L29;
        boolean r7 = true;
    L30:
        if (r7 == false) goto L32;
        r6 = r6 + (r10.FH.DW(r12.DW + 1) - r5);
    L32:
        r12.Hw = DW(r11.FH, r12.Hw, r6);
        if (r7 == false) goto L35;
    L37:
        super.j6(r10, r11, r12);
        return r12;
    L35:
        if (r6 >= r11.FH.DW(r12.Hw + 1)) goto L37;
        r12.DW++;
        goto L37
    L29:
        r7 = false;
    L40:
        throw new java.lang.ArrayIndexOutOfBoundsException();
    }
}
