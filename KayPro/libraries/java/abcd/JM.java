package abcd;

class JM extends abcd.MM {
    private int FH;
    private int Hw;
    private boolean Zo;
    private boolean v5;

    JM(java.io.InputStream r1, int r2) {
        super(r1, r2);
        this.v5 = false;
        this.Zo = true;
        this.FH = r1.read();
        this.Hw = r1.read();
        if (this.Hw < 0) goto L7;
        DW();
        return;
    L7:
        throw new java.io.EOFException();
    }

    private boolean DW() {
        if (this.v5 == true) goto L12;
        if (this.Zo == false) goto L12;
        if (this.FH != 0) goto L12;
        if (this.Hw != 0) goto L12;
        this.v5 = true;
        j6(true);
    L12:
        return this.v5;
    }

    void DW(boolean r1) {
        this.Zo = r1;
        DW();
    }

    @Override
    public int read() {
        if (DW() == false) goto L6;
        return -1;
    L6:
        int r0 = this.j6.read();
        if (r0 < 0) goto L11;
        int r1 = this.FH;
        this.FH = this.Hw;
        this.Hw = r0;
        return r1;
    L11:
        throw new java.io.EOFException();
    }

    @Override
    public int read(byte[] r3, int r4, int r5) {
        if (this.Zo == true) goto L22;
        if (r5 < 3) goto L22;
        if (this.v5 == false) goto L11;
        return -1;
    L11:
        int r6 = this.j6.read(r3, r4 + 2, r5 - 2);
        if (r6 < 0) goto L20;
        r3[r4] = (byte) this.FH;
        r3[r4 + 1] = (byte) this.Hw;
        this.FH = this.j6.read();
        this.Hw = this.j6.read();
        if (this.Hw < 0) goto L18;
        return r6 + 2;
    L18:
        throw new java.io.EOFException();
    L20:
        throw new java.io.EOFException();
    L22:
        return super.read(r3, r4, r5);
    }
}
