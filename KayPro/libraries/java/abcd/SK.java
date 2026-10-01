package abcd;

public class SK extends java.io.OutputStream {
    private int DW;
    private byte[] FH;
    private int Hw;
    private final java.io.OutputStream j6;
    private boolean v5;

    public SK(java.io.OutputStream r2) {
        this.DW = -1;
        this.FH = new byte[8000];
        this.Hw = 0;
        this.j6 = r2;
    }

    private int j6(byte r4) {
        int r0 = this.Hw;
        byte[] r1 = this.FH;
        if (r0 <= r1.length) goto L6;
        return 1;
    L6:
        this.Hw = r0 + 1;
        r1[r0] = r4;
        if (this.Hw != r1.length) goto L11;
        j6();
        return 0;
    L11:
        return 0;
    }

    private int j6(byte[] r4, int r5, int r6) {
        int r0 = this.Hw;
        byte[] r1 = this.FH;
        if (r0 <= r1.length) goto L5;
        return r6;
    L5:
        int r2 = java.lang.Math.min(r1.length - r0, r6);
        java.lang.System.arraycopy(r4, r5, this.FH, this.Hw, r2);
        this.Hw += r2;
        int r7 = r6 - r2;
        if (r7 <= 0) goto L8;
        j6();
    L8:
        return r7;
    }

    private void j6() {
        this.v5 = abcd.tC.j6(this.FH, this.Hw);
        int r0 = this.Hw;
        byte[] r1 = this.FH;
        this.Hw = r1.length + 1;
        write(r1, 0, r0);
    }

    @Override
    public void close() {
        flush();
        this.j6.close();
    }

    @Override
    public void flush() {
        if (this.Hw >= this.FH.length) goto L5;
        j6();
    L5:
        this.DW = -1;
        this.j6.flush();
    }

    @Override
    public void write(int r4) {
        if (j6((byte) r4) < 0) goto L6;
        return;
    L6:
        if (this.v5 == false) goto L10;
        this.j6.write(r4);
        return;
    L10:
        if (r4 != 10) goto L16;
        int r5 = this.DW;
        if (r5 != 13) goto L14;
        this.j6.write(10);
        this.DW = -1;
        return;
    L14:
        if (r5 != (-1)) goto L21;
        this.j6.write(13);
        this.j6.write(10);
        this.DW = -1;
        return;
    L21:
        return;
    L16:
        if (r4 != 13) goto L18;
        this.j6.write(r4);
        this.DW = 13;
        return;
    L18:
        this.j6.write(r4);
        this.DW = -1;
    }

    @Override
    public void write(byte[] r3) {
        int r0 = j6(r3, 0, r3.length);
        if (r0 <= 0) goto L6;
        write(r3, r3.length - r0, r0);
        return;
    }

    @Override
    public void write(byte[] r7, int r8, int r9) {
        int r0 = j6(r7, r8, r9);
        if (r0 >= 0) goto L5;
        return;
    L5:
        int r10 = (r8 + r9) - r0;
        if (r0 != 0) goto L9;
        return;
    L9:
        if (this.v5 == false) goto L12;
        this.j6.write(r7, r10, r0);
        return;
    L12:
        int r11 = r10;
        int r1 = r11;
    L13:
        int r2 = r10 + r0;
        if (r11 >= r2) goto L15;
        byte r3 = r7[r11];
        if (r3 != 13) goto L25;
        this.DW = 13;
    L33:
        r11 = r11 + 1;
        goto L13
    L25:
        if (r3 == 10) goto L27;
        this.DW = -1;
        goto L33
    L27:
        if (this.DW == 13) goto L31;
        if (r1 >= r11) goto L30;
        this.j6.write(r7, r1, r11 - r1);
    L30:
        this.j6.write(13);
        r1 = r11;
    L31:
        this.DW = -1;
        goto L33
    L15:
        if (r1 >= r2) goto L18;
        this.j6.write(r7, r1, r2 - r1);
    L18:
        if (r7[r2 - 1] != 13) goto L38;
        this.DW = 13;
        return;
    }
}
