package abcd;

public class EI {
    private static final byte[] j6 = null;
    private final java.io.OutputStream DW;
    private final byte[] FH;
    private boolean Hw;

    static {
        j6 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    }

    public EI(java.io.OutputStream r1) {
        this.DW = r1;
        this.FH = new byte[5];
        this.Hw = true;
    }

    private void j6(int r2) {
        j6(this.FH, r2);
    }

    static void j6(byte[] r4, int r5) {
        int r0 = 3;
    L3:
        if (r0 < 0) goto L7;
        if (r5 == 0) goto L7;
        r4[r0] = j6[r5 & 15];
        r5 = r5 >>> 4;
        r0 = r0 - 1;
    L7:
        if (r0 < 0) goto L8;
        r4[r0] = 48;
        r0 = r0 - 1;
        goto L7
    }

    public void DW() {
        this.DW.flush();
    }

    public void j6() {
        j6(0);
        this.DW.write(this.FH, 0, 4);
        if (this.Hw == false) goto L6;
        DW();
        return;
    }

    public void j6(java.lang.String r1) {
        j6(abcd.hE.j6(r1));
    }

    public void j6(boolean r1) {
        this.Hw = r1;
    }

    public void j6(byte[] r5) {
        j6(r5.length + 4);
        this.DW.write(this.FH, 0, 4);
        this.DW.write(r5);
    }
}
