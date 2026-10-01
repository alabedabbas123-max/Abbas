package abcd;

public final class Qt implements abcd.Lt, abcd.Tt {
    private byte[] DW;
    private int FH;
    private boolean Hw;
    private int VH;
    private int Zo;
    private final boolean j6;
    private java.util.ArrayList<abcd.Qt.a> v5;

    private static class a {
        private int DW;
        private final java.lang.String FH;
        private final int j6;

        public a(int r1, int r2, java.lang.String r3) {
            this.j6 = r1;
            this.DW = r2;
            this.FH = r3;
        }

        public a(int r2, java.lang.String r3) {
            this(r2, Integer.MAX_VALUE, r3);
        }

        public int DW() {
            return this.j6;
        }

        public void DW(int r3) {
            if (this.DW != Integer.MAX_VALUE) goto L6;
            this.DW = r3;
            return;
        }

        public java.lang.String FH() {
            return this.FH;
        }

        public int j6() {
            return this.DW;
        }

        public void j6(int r1) {
            this.DW = r1;
        }
    }

    public Qt() {
        this(1000);
    }

    public Qt(int r2) {
        this(new byte[r2], true);
    }

    public Qt(byte[] r2) {
        this(r2, false);
    }

    private Qt(byte[] r1, boolean r2) {
        if (r1 == null) goto L7;
        this.j6 = r2;
        this.DW = r1;
        this.FH = 0;
        this.Hw = false;
        this.v5 = null;
        this.Zo = 0;
        this.VH = 0;
        return;
    L7:
        throw new java.lang.NullPointerException("data == null");
    }

    private void Zo(int r4) {
        byte[] r0 = this.DW;
        if (r0.length >= r4) goto L6;
        byte[] r5 = new byte[(r4 * 2) + 1000];
        java.lang.System.arraycopy(r0, 0, r5, 0, this.FH);
        this.DW = r5;
        return;
    }

    private static void u7() {
        throw new java.lang.IndexOutOfBoundsException("attempt to write past the end");
    }

    @Override
    public int DW(int r2) {
        if (this.j6 == false) goto L5;
        Zo(this.FH + 5);
    L5:
        int r0 = this.FH;
        abcd.eu.DW(this, r2);
        return this.FH - r0;
    }

    @Override
    public boolean DW() {
        return this.Hw;
    }

    @Override
    public void FH() {
        java.util.ArrayList<abcd.Qt.a> r0 = this.v5;
        if (r0 != null) goto L5;
        return;
    L5:
        int r1 = r0.size();
        if (r1 == 0) goto L9;
        this.v5.get(r1 - 1).DW(this.FH);
        return;
    }

    @Override
    public void FH(int r4) {
        if (this.FH != r4) goto L6;
        return;
    L6:
        throw new abcd.Vt("expected cursor " + r4 + "; actual value: " + this.FH);
    }

    @Override
    public void Hw(int r2) {
        int r0 = r2 - 1;
        if (r2 < 0) goto L16;
        if ((r2 & r0) != 0) goto L16;
        int r3 = (this.FH + r0) & (r0 ^ (-1));
        if (this.j6 == false) goto L10;
        Zo(r3);
    L11:
        this.FH = r3;
        return;
    L10:
        if (r3 <= this.DW.length) goto L11;
        u7();
        throw null;
    L16:
        throw new java.lang.IllegalArgumentException("bogus alignment");
    }

    @Override
    public boolean Hw() {
        if (this.v5 == null) goto L5;
        return true;
    L5:
        return false;
    }

    public byte[] VH() {
        return this.DW;
    }

    public void Zo() {
        FH();
        java.util.ArrayList<abcd.Qt.a> r0 = this.v5;
        if (r0 == null) goto L15;
        int r1 = r0.size();
    L5:
        if (r1 <= 0) goto L17;
        int r2 = r1 - 1;
        abcd.Qt.a r3 = this.v5.get(r2);
        if (r3.DW() <= this.FH) goto L9;
        this.v5.remove(r2);
        r1 = r1 - 1;
        goto L5
    L9:
        int r4 = r3.j6();
        int r5 = this.FH;
        if (r4 <= r5) goto L16;
        r3.j6(r5);
        return;
    L16:
        return;
    L17:
        return;
    }

    public byte[] gn() {
        int r0 = this.FH;
        byte[] r1 = new byte[r0];
        java.lang.System.arraycopy(this.DW, 0, r1, 0, r0);
        return r1;
    }

    @Override
    public int j6() {
        int r0 = this.VH;
        int r1 = ((r0 * 2) + 8) + (r0 / 2);
        return this.Zo - r1;
    }

    @Override
    public void j6(int r2) {
        if (r2 < 0) goto L13;
        int r0 = this.FH + r2;
        if (this.j6 == false) goto L7;
        Zo(r0);
    L8:
        this.FH = r0;
        return;
    L7:
        if (r0 <= this.DW.length) goto L8;
        u7();
        throw null;
    L13:
        throw new java.lang.IllegalArgumentException("count < 0");
    }

    @Override
    public void j6(int r4, java.lang.String r5) {
        if (this.v5 != null) goto L5;
        return;
    L5:
        FH();
        int r0 = this.v5.size();
        if (r0 != 0) goto L8;
        int r1 = 0;
    L9:
        int r2 = this.FH;
        if (r1 > r2) goto L12;
        r1 = r2;
    L12:
        this.v5.add(new abcd.Qt.a(r1, r4 + r1, r5));
        return;
    L8:
        r1 = this.v5.get(r0 - 1).j6();
        goto L9
    }

    public void j6(int r4, boolean r5) {
        if (this.v5 != null) goto L18;
        if (this.FH != 0) goto L18;
        if (r4 < 40) goto L16;
        int r0 = (((r4 - 7) / 15) + 1) & (-2);
        if (r0 >= 6) goto L11;
        r0 = 6;
    L13:
        this.v5 = new java.util.ArrayList(1000);
        this.Zo = r4;
        this.VH = r0;
        this.Hw = r5;
        return;
    L11:
        if (r0 <= 10) goto L13;
        r0 = 10;
        goto L13
    L16:
        throw new java.lang.IllegalArgumentException("annotationWidth < 40");
    L18:
        throw new java.lang.RuntimeException("cannot enable annotations");
    }

    @Override
    public void j6(abcd.Pt r4) {
        int r0 = r4.FH();
        int r1 = this.FH;
        int r2 = r0 + r1;
        if (this.j6 == false) goto L6;
        Zo(r2);
    L7:
        r4.j6(this.DW, r1);
        this.FH = r2;
        return;
    L6:
        if (r2 <= this.DW.length) goto L7;
        u7();
        throw null;
    }

    public void j6(java.io.Writer r14) {
        int r0 = j6();
        abcd.mu r2 = new abcd.mu(r14, (this.Zo - r0) - 1, r0, "|");
        java.io.Writer r15 = r2.DW();
        java.io.Writer r1 = r2.FH();
        int r3 = this.v5.size();
        int r4 = 0;
        int r7 = 0;
    L4:
        if (r7 >= this.FH) goto L11;
        if (r4 >= r3) goto L11;
        abcd.Qt.a r5 = this.v5.get(r4);
        int r6 = r5.DW();
        if (r7 >= r6) goto L9;
        java.lang.String r8 = "";
        int r10 = r7;
    L10:
        r15.write(abcd.Yt.j6(this.DW, r10, r6 - r10, r10, this.VH, 6));
        r1.write(r8);
        r2.j6();
        r7 = r6;
        goto L4
    L9:
        int r9 = r5.j6();
        r8 = r5.FH();
        r4 = r4 + 1;
        r10 = r6;
        r6 = r9;
    L11:
        int r11 = this.FH;
        if (r7 >= r11) goto L14;
        r15.write(abcd.Yt.j6(this.DW, r7, r11 - r7, r7, this.VH, 6));
    L14:
        if (r4 >= r3) goto L16;
        r1.write(this.v5.get(r4).FH());
        r4 = r4 + 1;
        goto L14
    L16:
        r2.j6();
    }

    @Override
    public void j6(java.lang.String r4) {
        if (this.v5 != null) goto L5;
        return;
    L5:
        FH();
        this.v5.add(new abcd.Qt.a(this.FH, r4));
    }

    public void j6(byte[] r5, int r6, int r7) {
        int r0 = this.FH;
        int r1 = r0 + r7;
        int r2 = r6 + r7;
        if (((r6 | r7) | r1) < 0) goto L16;
        if (r2 > r5.length) goto L16;
        if (this.j6 == false) goto L10;
        Zo(r1);
    L11:
        java.lang.System.arraycopy(r5, r6, this.DW, r0, r7);
        this.FH = r1;
        return;
    L10:
        if (r1 <= this.DW.length) goto L11;
        u7();
        throw null;
    L16:
        throw new java.lang.IndexOutOfBoundsException("bytes.length " + r5.length + "; " + r6 + "..!" + r1);
    }

    @Override
    public int v5() {
        return this.FH;
    }

    public int v5(int r2) {
        if (this.j6 == false) goto L5;
        Zo(this.FH + 5);
    L5:
        int r0 = this.FH;
        abcd.eu.j6(this, r2);
        return this.FH - r0;
    }

    @Override
    public void write(byte[] r3) {
        j6(r3, 0, r3.length);
    }

    @Override
    public void writeByte(int r4) {
        int r0 = this.FH;
        int r1 = r0 + 1;
        if (this.j6 == false) goto L6;
        Zo(r1);
    L7:
        this.DW[r0] = (byte) r4;
        this.FH = r1;
        return;
    L6:
        if (r1 <= this.DW.length) goto L7;
        u7();
        throw null;
    }

    @Override
    public void writeInt(int r6) {
        int r0 = this.FH;
        int r1 = r0 + 4;
        if (this.j6 == false) goto L6;
        Zo(r1);
    L7:
        byte[] r2 = this.DW;
        r2[r0] = (byte) r6;
        r2[r0 + 1] = (byte) (r6 >> 8);
        r2[r0 + 2] = (byte) (r6 >> 16);
        r2[r0 + 3] = (byte) (r6 >> 24);
        this.FH = r1;
        return;
    L6:
        if (r1 <= this.DW.length) goto L7;
        u7();
        throw null;
    }

    @Override
    public void writeLong(long r7) {
        int r0 = this.FH;
        int r1 = r0 + 8;
        if (this.j6 == false) goto L6;
        Zo(r1);
    L7:
        int r2 = (int) r7;
        byte[] r3 = this.DW;
        r3[r0] = (byte) r2;
        r3[r0 + 1] = (byte) (r2 >> 8);
        r3[r0 + 2] = (byte) (r2 >> 16);
        r3[r0 + 3] = (byte) (r2 >> 24);
        int r8 = (int) (r7 >> 32);
        r3[r0 + 4] = (byte) r8;
        r3[r0 + 5] = (byte) (r8 >> 8);
        r3[r0 + 6] = (byte) (r8 >> 16);
        r3[r0 + 7] = (byte) (r8 >> 24);
        this.FH = r1;
        return;
    L6:
        if (r1 <= this.DW.length) goto L7;
        u7();
        throw null;
    }

    @Override
    public void writeShort(int r5) {
        int r0 = this.FH;
        int r1 = r0 + 2;
        if (this.j6 == false) goto L6;
        Zo(r1);
    L7:
        byte[] r2 = this.DW;
        r2[r0] = (byte) r5;
        r2[r0 + 1] = (byte) (r5 >> 8);
        this.FH = r1;
        return;
    L6:
        if (r1 <= this.DW.length) goto L7;
        u7();
        throw null;
    }
}
