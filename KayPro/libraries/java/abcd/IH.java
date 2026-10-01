package abcd;

class IH {
    private final abcd.CH DW;
    private abcd.RK.c EQ;
    private final abcd.IE FH;
    private final abcd.JH[] Hw;
    private java.util.zip.Deflater J0;
    private long VH;
    private final int Zo;
    private int gn;
    private final abcd.NH j6;
    private abcd.JH tp;
    private int u7;
    private final long v5;
    private int we;

    static final class a extends java.io.OutputStream {
        private final byte[] DW;
        private int FH;
        private final java.util.zip.Deflater j6;

        a(java.util.zip.Deflater r1, byte[] r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        int j6() {
            this.j6.finish();
        L3:
            int r0 = this.FH;
            byte[] r1 = this.DW;
            if (r0 == r1.length) goto L15;
            int r2 = this.j6.deflate(r1, r0, r1.length - r0);
            if (r2 == 0) goto L8;
            this.FH += r2;
            goto L3
        L8:
            if (this.j6.finished() == false) goto L12;
            return this.FH;
        L12:
            throw new java.io.IOException();
        L15:
            throw new java.io.EOFException();
        }

        @Override
        public void write(int r1) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public void write(byte[] r2, int r3, int r4) {
            this.j6.setInput(r2, r3, r4);
        L3:
            int r5 = this.FH;
            byte[] r6 = this.DW;
            if (r5 == r6.length) goto L14;
            int r7 = this.j6.deflate(r6, r5, r6.length - r5);
            if (r7 == 0) goto L8;
            this.FH += r7;
            goto L3
        L8:
            if (this.j6.needsInput() == false) goto L11;
            return;
        L11:
            throw new java.io.IOException();
        L14:
            throw new java.io.EOFException();
        }
    }

    IH(abcd.NH r1, abcd.CH r2, abcd.IE r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = new abcd.JH[this.j6.Zo() + 1];
        int r4 = 0;
    L3:
        abcd.JH[] r5 = this.Hw;
        if (r4 >= r5.length) goto L5;
        r5[r4] = new abcd.JH();
        r4 = r4 + 1;
        goto L3
    L5:
        this.v5 = this.j6.v5();
        this.Zo = this.j6.u7();
    }

    private void DW() {
        this.gn = FH(this.gn);
    }

    private void DW(int r1) {
    }

    private void DW(abcd.JH r6) {
        abcd.EH r0 = r6.FH;
        if (r0 == null) goto L6;
        this.VH -= r0.j6();
    L8:
        r6.j6(null);
        return;
    L6:
        if (this.tp.DW == null) goto L8;
        this.VH -= (long) r6.DW.length;
        goto L8
    }

    private int FH(int r2) {
        int r3 = r2 + 1;
        if (r3 != this.Hw.length) goto L6;
        return 0;
    L6:
        return r3;
    }

    private abcd.EH FH(abcd.JH r8) {
        abcd.EH r0 = r8.FH;
        if (r0 == null) goto L13;
    L12:
        return r0;
    L13:
        r0 = new abcd.EH(j6(r8));     // Catch: java.lang.OutOfMemoryError -> L9
        if (0 >= this.v5) goto L8;
        this.VH += r0.j6() - r0.DW();
    L8:
        r8.FH = r0;
    L9:
        e = move-exception;
        abcd.cD.c r1 = new abcd.cD.c(e);
        r1.j6(r8.j6);
        throw r1;
    }

    private void FH() {
        this.u7 = this.Zo;
        int r0 = this.gn;
    L3:
        r0 = Hw(r0);
        if (r0 == this.gn) goto L9;
        abcd.JH r1 = this.Hw[r0];
        if (r1.DW() == true) goto L9;
        if (j6(r1, r0) != 0) goto L3;
        this.EQ = null;
        return;
    L9:
        if (this.EQ != null) goto L12;
        DW();
        return;
    L12:
        abcd.MH r2 = this.Hw[this.we].j6;
        abcd.MH r3 = this.tp.j6;
        if (r2.P8() == false) goto L15;
        r3.DW(r2.Hw());
    L16:
        r3.Hw(r2.rN() + 1);
        r3.Mr();
        j6(r2, r3);
        this.EQ = null;
        if (r3.rN() != this.Zo) goto L19;
        return;
    L19:
        Hw();
        DW();
        return;
    L15:
        r3.DW(r2);
        goto L16
    }

    private int Hw(int r1) {
        if (r1 != 0) goto L6;
        return this.Hw.length - 1;
    L6:
        return r1 - 1;
    }

    private void Hw() {
        abcd.JH[] r0 = this.Hw;
        int r1 = this.gn;
        r0[r1] = r0[this.we];
        abcd.JH r2 = this.tp;
        int r3 = Hw(r1);
    L4:
        if (r3 == this.we) goto L5;
        abcd.JH[] r4 = this.Hw;
        abcd.JH r5 = r4[r3];
        r4[r3] = r2;
        r3 = Hw(r3);
        r2 = r5;
        goto L4
    L5:
        this.Hw[r3] = r2;
    }

    private static int j6(int r1) {
        return ((((r1 + 7) >> 3) + r1) + ((r1 + 63) >> 6)) + 11;
    }

    private int j6(abcd.JH r10, int r11) {
        if (r10.Hw() == this.tp.Hw()) goto L6;
        DW();
        return 0;
    L6:
        int r0 = r10.j6();
        int r1 = this.u7;
        if (r0 <= r1) goto L9;
        return 1;
    L9:
        int r2 = j6(this.tp, r1, r10);
        if (r2 > 8) goto L13;
        return 1;
    L13:
        if ((this.tp.FH() - r10.FH()) <= r2) goto L16;
        return 1;
    L16:
        if (this.tp.FH() >= (r10.FH() / 16)) goto L47;
        return 1;
    L47:
        abcd.EH r3 = FH(r10);     // Catch: java.io.IOException -> L34 abcd.cD -> L40
        byte[] r4 = j6(this.tp);     // Catch: abcd.cD -> L33
        abcd.RK.c r5 = this.EQ;
        if (r5 != null) goto L23;
    L25:
        abcd.RK.c r6 = new abcd.RK.c(r2);
        if (r3.j6(r6, r4, r2) == true) goto L30;
        return 1;
    L30:
        if (j6(r10, r6) == false) goto L32;
        this.EQ = r6;
        this.we = r11;
    L32:
        return 1;
    L23:
        if (r5.DW() >= r2) goto L25;
        r2 = (int) this.EQ.DW();
    L33:
        return 0;
    L40:
        DW(r11);
        return 1;
    L34:
        e = move-exception;
        if (r10.j6.P8() == false) goto L39;
        DW(r11);
        return 1;
    L39:
        throw e;
    }

    private static int j6(abcd.JH r0, int r1, abcd.JH r2) {
        return (((r0.FH() / 2) - 20) * (r1 - r2.j6())) / r1;
    }

    private static long j6(abcd.MH r2) {
        return abcd.EH.j6(r2.gW());
    }

    private java.util.zip.Deflater j6() {
        java.util.zip.Deflater r0 = this.J0;
        if (r0 != null) goto L5;
        this.J0 = new java.util.zip.Deflater(this.j6.DW());
    L7:
        return this.J0;
    L5:
        r0.reset();
        goto L7
    }

    private void j6(abcd.MH r6, abcd.MH r7) {
        if (2147483647L >= this.EQ.DW()) goto L5;
        return;
    L5:
        int r1 = (int) this.EQ.DW();
        if (this.DW.j6(r1, r6, r7) == false) goto L14;
        byte[] r8 = new byte[j6(r1)];     // Catch: java.lang.OutOfMemoryError -> L9 java.io.IOException -> L10
        abcd.IH.a r0 = new abcd.IH.a(j6(), r8);     // Catch: java.lang.OutOfMemoryError -> L9 java.io.IOException -> L10
        this.EQ.j6(r0, null);     // Catch: java.lang.OutOfMemoryError -> L9 java.io.IOException -> L10
        this.EQ = null;     // Catch: java.lang.OutOfMemoryError -> L9 java.io.IOException -> L10
        int r2 = r0.j6();     // Catch: java.lang.OutOfMemoryError -> L9 java.io.IOException -> L10
        r7.j6(this.DW.j6(r8, r2, r1));     // Catch: java.lang.OutOfMemoryError -> L9 java.io.IOException -> L10
        r7.FH(r1);     // Catch: java.lang.OutOfMemoryError -> L9 java.io.IOException -> L10
    L16:
        return;
    L10:
        this.DW.j6(r1);
        return;
    L9:
        this.DW.j6(r1);
        return;
    }

    private boolean j6(abcd.JH r8, abcd.RK.c r9) {
        if (this.EQ != null) goto L6;
        return true;
    L6:
        if (r9.DW() != this.EQ.DW()) goto L12;
        if (r8.j6() >= this.Hw[this.we].j6()) goto L10;
        return true;
    L10:
        return false;
    L12:
        if (r9.DW() >= this.EQ.DW()) goto L14;
        return true;
    L14:
        return false;
    }

    private byte[] j6(abcd.JH r7) {
        byte[] r0 = r7.DW;
        if (r0 != null) goto L8;
        r0 = abcd.TH.j6(this.j6, this.FH, r7.j6);
        if (0 >= this.v5) goto L7;
        this.VH += (long) r0.length;
    L7:
        r7.DW = r0;
    L8:
        return r0;
    }

    void j6(abcd.LE r9, abcd.MH[] r10, int r11, int r12) {
        int r13 = r12 + r11;
    L3:
        if (r11 >= r13) goto L4;
        this.tp = this.Hw[this.gn];     // Catch: java.lang.Throwable -> L22
        if (0 >= this.v5) goto L17;
        DW(this.tp);     // Catch: java.lang.Throwable -> L22
        int r0 = FH(this.gn);     // Catch: java.lang.Throwable -> L22
        long r1 = j6(r10[r11]);     // Catch: java.lang.Throwable -> L22
    L12:
        if (this.v5 >= (this.VH + r1)) goto L17;
        if (r0 == this.gn) goto L17;
        DW(this.Hw[r0]);     // Catch: java.lang.Throwable -> L22
        r0 = FH(r0);     // Catch: java.lang.Throwable -> L22
    L17:
        this.tp.j6(r10[r11]);     // Catch: java.lang.Throwable -> L22
        if (this.tp.j6.P8() == false) goto L20;
        DW();     // Catch: java.lang.Throwable -> L22
    L21:
        r11 = r11 + 1;
        goto L3
    L20:
        r9.update(1);     // Catch: java.lang.Throwable -> L22
        FH();     // Catch: java.lang.Throwable -> L22
    L22:
        th = move-exception;
        java.util.zip.Deflater r14 = this.J0;
        if (r14 == null) goto L27;
        r14.end();
    L27:
        throw th;
    L4:
        java.util.zip.Deflater r15 = this.J0;
        if (r15 == null) goto L36;
        r15.end();
        return;
    }
}
