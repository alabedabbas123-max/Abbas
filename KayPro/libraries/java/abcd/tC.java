package abcd;

public class tC extends abcd.CC {
    public static final abcd.tC j6 = null;
    protected final byte[] DW;
    protected final abcd.CK FH;

    static {
        j6 = new abcd.tC(new byte[0]);
    }

    public tC(byte[] r3) {
        this.DW = r3;
        byte[] r4 = this.DW;
        this.FH = abcd.IK.Hw(r4, 0, r4.length);
    }

    private int DW(int r2) {
        return this.FH.DW(r2 + 1);
    }

    private int j6(int r2) {
        return this.FH.DW(r2 + 2);
    }

    public static boolean j6(java.io.InputStream r4) {
        byte[] r0 = new byte[8000];
        int r1 = 0;
    L4:
        if (r1 >= r0.length) goto L9;
        int r2 = r4.read(r0, r1, r0.length - r1);
        if (r2 == (-1)) goto L9;
        r1 = r1 + r2;
    L9:
        return j6(r0, r1);
    }

    public static boolean j6(byte[] r1) {
        return j6(r1, r1.length);
    }

    public static boolean j6(byte[] r3, int r4) {
        if (r4 <= 8000) goto L5;
        r4 = 8000;
    L5:
        int r1 = 0;
    L6:
        if (r1 >= r4) goto L7;
        if (r3[r1] == 0) goto L10;
        r1 = r1 + 1;
        goto L6
    L10:
        return true;
    L7:
        return false;
    }

    public boolean DW() {
        abcd.CK r0 = this.FH;
        int r1 = r0.DW(r0.DW() - 1);
        if (r1 != 0) goto L6;
        return true;
    L6:
        if (this.DW[r1 - 1] == 10) goto L8;
        return true;
    L8:
        return false;
    }

    @Override
    public int j6() {
        return this.FH.DW() - 2;
    }

    public void j6(java.io.OutputStream r4, int r5) {
        int r0 = DW(r5);
        int r6 = j6(r5);
        if (this.DW[r6 - 1] != 10) goto L5;
        r6 = r6 - 1;
    L5:
        r4.write(this.DW, r0, r6 - r0);
    }
}
