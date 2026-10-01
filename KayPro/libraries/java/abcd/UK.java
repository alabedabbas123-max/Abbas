package abcd;

public class UK extends java.io.InputStream {
    private final byte[] DW;
    private final java.io.InputStream FH;
    private int Hw;
    private boolean VH;
    private boolean Zo;
    private final byte[] j6;
    private int v5;

    public UK(java.io.InputStream r2) {
        this.j6 = new byte[1];
        this.DW = new byte[8096];
        this.FH = r2;
    }

    private boolean j6() {
        java.io.InputStream r0 = this.FH;
        byte[] r1 = this.DW;
        this.Hw = r0.read(r1, 0, r1.length);
        int r2 = this.Hw;
        if (r2 >= 1) goto L6;
        return false;
    L6:
        if (this.VH == true) goto L8;
        this.Zo = abcd.tC.j6(this.DW, r2);
        this.VH = true;
    L8:
        this.v5 = 0;
        return true;
    }

    @Override
    public void close() {
        this.FH.close();
    }

    @Override
    public int read() {
        if (read(this.j6, 0, 1) == 1) goto L7;
        return -1;
    L7:
        return this.j6[0] & 255;
    }

    @Override
    public int read(byte[] r7, int r8, int r9) {
        if (r9 != 0) goto L6;
        return 0;
    L6:
        if (this.Hw != (-1)) goto L8;
        return -1;
    L8:
        int r10 = r9 + r8;
        int r0 = r8;
    L9:
        if (r0 >= r10) goto L15;
        if (this.v5 == this.Hw) goto L14;
    L16:
        byte[] r2 = this.DW;
        int r3 = this.v5;
        this.v5 = r3 + 1;
        byte r4 = r2[r3];
        if (this.Zo == true) goto L35;
        if (r4 != 13) goto L35;
        if (this.v5 == this.Hw) goto L24;
    L30:
        byte[] r5 = this.DW;
        int r6 = this.v5;
        if (r5[r6] != 10) goto L33;
        int r11 = r0 + 1;
        r7[r0] = 10;
        this.v5 = r6 + 1;
    L34:
        r0 = r11;
        goto L9
    L33:
        r11 = r0 + 1;
        r7[r0] = 13;
        goto L34
    L24:
        if (j6() == true) goto L30;
        int r12 = r0 + 1;
        r7[r0] = 13;
    L26:
        if (r8 != r12) goto L29;
        return -1;
    L29:
        return r12 - r8;
    L35:
        r7[r0] = r4;
        r0 = r0 + 1;
        goto L9
    L14:
        if (j6() == true) goto L16;
    L15:
        r12 = r0;
        goto L26
    }
}
