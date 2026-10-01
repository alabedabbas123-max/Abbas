package abcd;

class _L extends java.io.InputStream {
    private boolean DW;
    private java.io.InputStream FH;
    private final abcd.JL j6;

    _L(abcd.JL r2) {
        this.DW = true;
        this.j6 = r2;
    }

    @Override
    public int read() {
        if (this.FH != null) goto L11;
        if (this.DW == true) goto L7;
        return -1;
    L7:
        abcd.BL r0 = (abcd.BL) this.j6.j6();
        if (r0 != null) goto L10;
        return -1;
    L10:
        this.DW = false;
        this.FH = r0.FH();
    L11:
        int r1 = this.FH.read();
        if (r1 >= 0) goto L13;
        abcd.BL r2 = (abcd.BL) this.j6.j6();
        if (r2 == null) goto L16;
        this.FH = r2.FH();
        goto L11
    L16:
        this.FH = null;
        return -1;
    L13:
        return r1;
    }

    @Override
    public int read(byte[] r6, int r7, int r8) {
        int r1 = 0;
        if (this.FH != null) goto L11;
        if (this.DW == true) goto L7;
        return -1;
    L7:
        abcd.BL r0 = (abcd.BL) this.j6.j6();
        if (r0 != null) goto L10;
        return -1;
    L10:
        this.DW = false;
        this.FH = r0.FH();
    L11:
        int r2 = this.FH.read(r6, r7 + r1, r8 - r1);
        if (r2 >= 0) goto L13;
        abcd.BL r3 = (abcd.BL) this.j6.j6();
        if (r3 == null) goto L18;
        this.FH = r3.FH();
        goto L11
    L18:
        this.FH = null;
        if (r1 >= 1) goto L31;
        return -1;
    L31:
        return r1;
    L13:
        r1 = r1 + r2;
        if (r1 != r8) goto L11;
        return r1;
    }
}
