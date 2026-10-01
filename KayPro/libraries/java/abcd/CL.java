package abcd;

public class CL {
    private java.io.OutputStream j6;

    private class a extends abcd.CL {
        private boolean DW;
        final abcd.CL FH;

        public a(abcd.CL r1, java.io.OutputStream r2) {
            this.FH = r1;
            super(r2);
            this.DW = true;
        }

        @Override
        public void j6(int r2) {
            if (this.DW == false) goto L5;
            this.DW = false;
            return;
        L5:
            super.j6(r2);
        }
    }

    public CL(java.io.OutputStream r1) {
        this.j6 = r1;
    }

    abcd.CL DW() {
        return new abcd.DM(this.j6);
    }

    void DW(int r4) {
        if (r4 <= 127) goto L12;
        int r1 = r4;
        int r2 = 1;
    L5:
        r1 = r1 >>> 8;
        if (r1 == 0) goto L7;
        r2 = r2 + 1;
        goto L5
    L7:
        j6((byte) (r2 | 128));
        int r3 = (r2 - 1) * 8;
    L8:
        if (r3 < 0) goto L16;
        j6((byte) (r4 >> r3));
        r3 = r3 - 8;
        goto L8
    L16:
        return;
    L12:
        j6((byte) r4);
    }

    abcd.CL j6() {
        return new abcd.rM(this.j6);
    }

    void j6(int r2) {
        this.j6.write(r2);
    }

    void j6(int r4, int r5) {
        if (r5 >= 31) goto L5;
        j6(r4 | r5);
        return;
    L5:
        j6(r4 | 31);
        if (r5 >= 128) goto L8;
        j6(r5);
        return;
    L8:
        byte[] r0 = new byte[5];
        int r1 = r0.length - 1;
        r0[r1] = (byte) (r5 & 127);
    L9:
        r5 = r5 >> 7;
        r1 = r1 - 1;
        r0[r1] = (byte) ((r5 & 127) | 128);
        if (r5 > 127) goto L9;
        j6(r0, r1, r0.length - r1);
    }

    void j6(int r1, int r2, byte[] r3) {
        j6(r1, r2);
        DW(r3.length);
        j6(r3);
    }

    void j6(int r1, byte[] r2) {
        j6(r1);
        DW(r2.length);
        j6(r2);
    }

    void j6(abcd.EL r3) {
        if (r3 == null) goto L6;
        r3.j6(new abcd.CL.a(this, this.j6));
        return;
    L6:
        throw new java.io.IOException("null object detected");
    }

    public void j6(abcd.InterfaceqL r2) {
        if (r2 == null) goto L6;
        r2.DW().j6(this);
        return;
    L6:
        throw new java.io.IOException("null object detected");
    }

    void j6(byte[] r2) {
        this.j6.write(r2);
    }

    void j6(byte[] r2, int r3, int r4) {
        this.j6.write(r2, r3, r4);
    }
}
