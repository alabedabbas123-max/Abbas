package abcd;

@abcd.Interfacexu
public final class wc extends java.io.Reader {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -3901488013810570605L)
    private int EQ;

    @abcd.Interfaceru(field = 1223981471092438224L)
    private java.io.Reader FH;

    @abcd.Interfaceru(field = 1791917173016709680L)
    private char[] Hw;

    @abcd.Interfaceru(field = -7378995248337726376L)
    private int J0;

    @abcd.Interfaceru(field = 40755095542000200L)
    private int J8;

    @abcd.Interfaceru(field = 2129210516147708133L)
    private int VH;

    @abcd.Interfaceru(field = -4169784818957103495L)
    private boolean Ws;

    @abcd.Interfaceru(field = -4339679485673802368L)
    private int Zo;

    @abcd.Interfaceru(field = 2133767135118013304L)
    private int gn;

    @abcd.Interfaceru(field = -1747669195909045504L)
    private int tp;

    @abcd.Interfaceru(field = 3277389036248364532L)
    private int u7;

    @abcd.Interfaceru(field = -4057650634066717695L)
    private int v5;

    @abcd.Interfaceru(field = 20759376291682560L)
    private int we;

    static {
        abcd.wu.j6(abcd.wc.class, 3029094188873400095L, 3029094188873400095L);
    }

    public wc() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3033754888632851289L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3033754888632851289L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new char[16384];     // Catch: java.lang.Throwable -> L8
        this.u7 = 1;     // Catch: java.lang.Throwable -> L8
        this.tp = 1;     // Catch: java.lang.Throwable -> L8
        this.EQ = -1;     // Catch: java.lang.Throwable -> L8
        this.we = -1;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 2757400930519688256L)
    private void DW() {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -871699983253226772L, this);
    L24:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-871699983253226772L, this);     // Catch: java.lang.Throwable -> L19
    L7:
        if ((this.v5 + 10) < this.Hw.length) goto L12;
        if (this.VH <= 10) goto L11;
        java.lang.System.arraycopy(this.Hw, this.VH, this.Hw, 0, this.v5 - this.VH);     // Catch: java.lang.Throwable -> L19
        this.v5 -= this.VH;     // Catch: java.lang.Throwable -> L19
        this.Zo -= this.VH;     // Catch: java.lang.Throwable -> L19
        this.EQ -= this.VH;     // Catch: java.lang.Throwable -> L19
        this.VH = 0;     // Catch: java.lang.Throwable -> L19
        goto L12
    L11:
        char[] r2 = new char[this.Hw.length * 2];     // Catch: java.lang.Throwable -> L19
        java.lang.System.arraycopy(this.Hw, 0, r2, 0, this.v5);     // Catch: java.lang.Throwable -> L19
        this.Hw = r2;     // Catch: java.lang.Throwable -> L19
    L12:
        int r3 = this.FH.read(this.Hw, this.v5, (this.Hw.length - this.v5) - 10);     // Catch: java.lang.Throwable -> L19
        if (r3 == 0) goto L12;
        if (r3 >= 0) goto L17;
        this.Ws = true;     // Catch: java.lang.Throwable -> L19
        return;
    L17:
        this.v5 += r3;     // Catch: java.lang.Throwable -> L19
    }

    @abcd.Interfacesu(method = -2334286517715510193L)
    private void FH(int r8, boolean r9) {
    L56:
        th = move-exception;
        if (DW == false) goto L61;
        abcd.wu.j6(th, -3395974040566592215L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
    L61:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3395974040566592215L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L56
    L6:
        if (r8 < this.gn) goto L55;
        if (((this.VH + r8) - this.gn) != (this.v5 + 1)) goto L11;
        r8 = r8 - 1;     // Catch: java.lang.Throwable -> L56
    L11:
        if (((this.VH + r8) - this.gn) > this.v5) goto L53;
        int r0 = this.VH;     // Catch: java.lang.Throwable -> L56
        int r1 = this.gn;     // Catch: java.lang.Throwable -> L56
    L14:
        if (r1 >= r8) goto L30;
        int r6 = r0 + 1;     // Catch: java.lang.Throwable -> L56
        char r2 = this.Hw[r0];     // Catch: java.lang.Throwable -> L56
        if (r2 == '\n') goto L27;
        if (r2 != 65534) goto L19;
        int r3 = r6 + 7;     // Catch: java.lang.Throwable -> L56
        if (r3 >= this.v5) goto L25;
        this.u7 = (((this.Hw[r6] << 24) | (this.Hw[r6 + 1] << 16)) | (this.Hw[r6 + 2] << '\b')) | this.Hw[r6 + 3];     // Catch: java.lang.Throwable -> L56
        this.tp = this.Hw[r3] | (((this.Hw[r6 + 4] << 24) | (this.Hw[r6 + 5] << 16)) | (this.Hw[r6 + 6] << '\b'));     // Catch: java.lang.Throwable -> L56
        r6 = r6 + 8;     // Catch: java.lang.Throwable -> L56
        r1 = r1 - 1;     // Catch: java.lang.Throwable -> L56
    L29:
        r0 = r6;
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L56
        goto L14
    L25:
        throw new java.lang.RuntimeException("Incomplete buffer while reading position");     // Catch: java.lang.Throwable -> L56
    L19:
        if (this.u7 <= 0) goto L29;
        this.tp++;     // Catch: java.lang.Throwable -> L56
        goto L29
    L27:
        if (this.u7 <= 0) goto L29;
        this.u7++;     // Catch: java.lang.Throwable -> L56
        this.tp = 1;     // Catch: java.lang.Throwable -> L56
        goto L29
    L30:
        this.gn = r8;     // Catch: java.lang.Throwable -> L56
        this.VH = r0;     // Catch: java.lang.Throwable -> L56
        if (r9 == true) goto L33;
        return;
    L33:
        if (this.we != r8) goto L35;
        return;
    L35:
        this.we = r8;     // Catch: java.lang.Throwable -> L56
        this.J0 = this.u7;     // Catch: java.lang.Throwable -> L56
        this.J8 = this.tp;     // Catch: java.lang.Throwable -> L56
        this.EQ = this.VH;     // Catch: java.lang.Throwable -> L56
    L37:
        if (this.EQ < this.v5) goto L45;
        if (this.Ws == true) goto L40;
        DW();     // Catch: java.lang.Throwable -> L56
        if (this.Ws == false) goto L45;
        return;
    L40:
        return;
    L45:
        if (this.Hw[this.EQ] != 65534) goto L75;
        this.EQ++;     // Catch: java.lang.Throwable -> L56
        if ((this.EQ + 7) >= this.v5) goto L50;
        this.J0 = (((this.Hw[this.EQ] << 24) | (this.Hw[this.EQ + 1] << 16)) | (this.Hw[this.EQ + 2] << '\b')) | this.Hw[this.EQ + 3];     // Catch: java.lang.Throwable -> L56
        this.J8 = (((this.Hw[this.EQ + 4] << 24) | (this.Hw[this.EQ + 5] << 16)) | (this.Hw[this.EQ + 6] << '\b')) | this.Hw[this.EQ + 7];     // Catch: java.lang.Throwable -> L56
        this.EQ += 8;     // Catch: java.lang.Throwable -> L56
        goto L37
    L50:
        throw new java.lang.RuntimeException("Incomplete buffer while reading position");     // Catch: java.lang.Throwable -> L56
    L75:
        return;
    L53:
        throw new java.lang.IllegalArgumentException("Trying to advance to position not yet read");     // Catch: java.lang.Throwable -> L56
    L55:
        throw new java.lang.IllegalArgumentException("getLine(), getColumn() must be called for monotonically increasing values");     // Catch: java.lang.Throwable -> L56
    }

    public int DW(int r8, boolean r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 2540021048482679160L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2540021048482679160L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L10
    L5:
        FH(r8, r9);     // Catch: java.lang.Throwable -> L10
        if (r9 == false) goto L9;
        return this.J0;
    L9:
        return this.u7;
    }

    @Override
    public void close() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1680727992679029448L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1680727992679029448L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = null;     // Catch: java.lang.Throwable -> L8
    }

    public int j6(int r8, boolean r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 1046429192824092328L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1046429192824092328L, this, new java.lang.Integer(r8), new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L10
    L5:
        FH(r8, r9);     // Catch: java.lang.Throwable -> L10
        if (r9 == false) goto L9;
        return this.J8;
    L9:
        return this.tp;
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6603622254896705L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6603622254896705L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.u7 = 0;     // Catch: java.lang.Throwable -> L8
        this.tp = 0;     // Catch: java.lang.Throwable -> L8
    }

    public void j6(java.io.Reader r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 483606290191106647L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(483606290191106647L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r5;     // Catch: java.lang.Throwable -> L8
        this.v5 = 0;     // Catch: java.lang.Throwable -> L8
        this.Zo = 0;     // Catch: java.lang.Throwable -> L8
        this.VH = 0;     // Catch: java.lang.Throwable -> L8
        this.gn = 0;     // Catch: java.lang.Throwable -> L8
        this.u7 = 1;     // Catch: java.lang.Throwable -> L8
        this.tp = 1;     // Catch: java.lang.Throwable -> L8
        this.we = -1;     // Catch: java.lang.Throwable -> L8
        this.Ws = false;     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public int read(char[] r10, int r11, int r12) {
    L36:
        th = move-exception;
        if (DW == false) goto L41;
        abcd.wu.j6(th, 7073394677899606328L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12));
    L41:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(7073394677899606328L, this, r10, new java.lang.Integer(r11), new java.lang.Integer(r12));     // Catch: java.lang.Throwable -> L36
    L6:
        if (this.Ws == false) goto L9;
        return -1;
    L9:
        if (this.Zo != this.v5) goto L13;
        DW();     // Catch: java.lang.Throwable -> L36
        if (this.Ws == false) goto L13;
        return -1;
    L13:
        char[] r0 = this.Hw;     // Catch: java.lang.Throwable -> L36
        int r1 = this.Zo;     // Catch: java.lang.Throwable -> L36
        int r2 = this.Zo + java.lang.Math.min(this.v5 - this.Zo, r12);     // Catch: java.lang.Throwable -> L36
        int r3 = r11;
    L14:
        if (r1 >= r2) goto L30;
        char r4 = r0[r1];     // Catch: java.lang.Throwable -> L36
        if (r4 == 65534) goto L18;
        r10[r3] = r4;     // Catch: java.lang.Throwable -> L36
        r3 = r3 + 1;     // Catch: java.lang.Throwable -> L36
    L29:
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L36
        goto L14
    L18:
        r1 = r1 + 8;     // Catch: java.lang.Throwable -> L36
        if (r1 < this.v5) goto L27;
        int r5 = (r1 - this.v5) + 1;     // Catch: java.lang.Throwable -> L36
        int r6 = 0;
    L21:
        if (r6 >= r5) goto L27;
        int r7 = this.FH.read();     // Catch: java.lang.Throwable -> L36
        if (r7 < 0) goto L26;
        int r8 = this.v5;     // Catch: java.lang.Throwable -> L36
        this.v5 = r8 + 1;     // Catch: java.lang.Throwable -> L36
        r0[r8] = (char) r7;     // Catch: java.lang.Throwable -> L36
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L36
        goto L21
    L26:
        throw new java.lang.RuntimeException("EOF encountered while reading position");     // Catch: java.lang.Throwable -> L36
    L27:
        if (r1 < r2) goto L29;
        r2 = r1 + 1;     // Catch: java.lang.Throwable -> L36
        goto L29
    L30:
        this.Zo = r2;     // Catch: java.lang.Throwable -> L36
        if (r3 != r11) goto L35;
        return read(r10, r11, r12);
    L35:
        return r3 - r11;
    }
}
