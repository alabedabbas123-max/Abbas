package com.aide.ui.views.editor;

@abcd.Interfacexu
class ClassQ extends java.io.Reader {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -33415978249027341L)
    private com.aide.ui.views.editor.Interfaceo FH;

    @abcd.Interfaceru(field = -1565989522330427247L)
    private int Hw;

    @abcd.Interfaceru(field = 106621836159123792L)
    private int VH;

    @abcd.Interfaceru(field = 3529359687829859504L)
    private int Zo;

    @abcd.Interfaceru(field = -2101006542006529287L)
    private char gn;

    @abcd.Interfaceru(field = 1592903492243448067L)
    private char[] tp;

    @abcd.Interfaceru(field = -209342069288996800L)
    private int u7;

    @abcd.Interfaceru(field = 523738323999885033L)
    private int v5;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ClassQ.class, -2860579357306958496L, -2860579357306958496L);
    }

    @abcd.Interfacesu(method = -336306307054872585L)
    ClassQ(com.aide.ui.views.editor.Interfaceo r9, int r10, int r11, int r12, int r13, boolean r14, java.lang.String r15) {
        if (j6 == false) goto L5;
        abcd.wu.j6(58416528859645440L, null, new java.lang.Object[]{r9, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Boolean(r14), r15});
    L5:
        this.FH = r9;
        this.Hw = r10;
        this.v5 = r11;
        this.VH = r13;
        this.Zo = r12;
        if (this.VH <= (r9.v5() - 1)) goto L9;
        this.VH = r9.v5() - 1;
        this.Zo = r9.EQ(this.VH);
    L9:
        if (this.Zo <= r9.EQ(this.VH)) goto L11;
        this.Zo = r9.EQ(this.VH);
    L11:
        if (r14 == false) goto L13;
        char r16 = ' ';
    L14:
        this.gn = r16;
        this.u7 = 0;
        this.tp = r15.toCharArray();
        return;
    L13:
        r16 = '\t';
        goto L14
    }

    @Override
    @abcd.Interfacesu(method = -136981706850093275L)
    public void close() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1968969293903434385L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(-1968969293903434385L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    @abcd.Interfacesu(method = 1854250374981214893L)
    public int read() {
    L61:
        th = move-exception;
        if (DW == false) goto L65;
        abcd.wu.j6(th, -213908543651208097L, this);
    L65:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-213908543651208097L, this);     // Catch: java.lang.Throwable -> L61
    L6:
        com.aide.ui.views.editor.Interfaceo r2 = this.FH;     // Catch: java.lang.Throwable -> L61
        monitor-enter(r2);     // Catch: java.lang.Throwable -> L61
        int r3 = this.FH.v5();     // Catch: java.lang.Throwable -> L58
        if (this.v5 >= this.VH) goto L30;
        if (this.v5 >= r3) goto L30;
        if (this.Hw >= this.FH.EQ(this.v5)) goto L22;
        com.aide.ui.views.editor.Interfaceo r4 = this.FH;     // Catch: java.lang.Throwable -> L58
        int r5 = this.Hw;     // Catch: java.lang.Throwable -> L58
        this.Hw = r5 + 1;     // Catch: java.lang.Throwable -> L58
        char r6 = r4.FH(r5, this.v5);     // Catch: java.lang.Throwable -> L58
        if (r6 == '\t') goto L18;
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L58
        return r6;
    L18:
        char r7 = this.gn;     // Catch: java.lang.Throwable -> L58
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L58
        return r7;
    L22:
        if (this.u7 >= (this.tp.length - 1)) goto L26;
        char[] r8 = this.tp;     // Catch: java.lang.Throwable -> L58
        int r9 = this.u7;     // Catch: java.lang.Throwable -> L58
        this.u7 = r9 + 1;     // Catch: java.lang.Throwable -> L58
        char r10 = r8[r9];     // Catch: java.lang.Throwable -> L58
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L58
        return r10;
    L26:
        this.u7 = 0;     // Catch: java.lang.Throwable -> L58
        this.Hw = 0;     // Catch: java.lang.Throwable -> L58
        this.v5++;     // Catch: java.lang.Throwable -> L58
        char r11 = this.tp[this.tp.length - 1];     // Catch: java.lang.Throwable -> L58
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L58
        return r11;
    L30:
        if (this.v5 == this.VH) goto L32;
    L56:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L58
        return -1;
    L32:
        if (this.v5 >= r3) goto L56;
        if (this.Hw <= this.Zo) goto L36;
    L54:
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L58
        return -1;
    L36:
        if (this.Hw > this.FH.EQ(this.v5)) goto L54;
        if (this.Hw >= this.FH.EQ(this.v5)) goto L47;
        com.aide.ui.views.editor.Interfaceo r12 = this.FH;     // Catch: java.lang.Throwable -> L58
        int r13 = this.Hw;     // Catch: java.lang.Throwable -> L58
        this.Hw = r13 + 1;     // Catch: java.lang.Throwable -> L58
        char r14 = r12.FH(r13, this.v5);     // Catch: java.lang.Throwable -> L58
        if (r14 == '\t') goto L43;
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L58
        return r14;
    L43:
        char r15 = this.gn;     // Catch: java.lang.Throwable -> L58
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L58
        return r15;
    L47:
        if (this.u7 >= (this.tp.length - 1)) goto L51;
        char[] r16 = this.tp;     // Catch: java.lang.Throwable -> L58
        int r17 = this.u7;     // Catch: java.lang.Throwable -> L58
        this.u7 = r17 + 1;     // Catch: java.lang.Throwable -> L58
        char r18 = r16[r17];     // Catch: java.lang.Throwable -> L58
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L58
        return r18;
    L51:
        this.u7 = 0;     // Catch: java.lang.Throwable -> L58
        this.Hw = 0;     // Catch: java.lang.Throwable -> L58
        this.v5++;     // Catch: java.lang.Throwable -> L58
        char r19 = this.tp[this.tp.length - 1];     // Catch: java.lang.Throwable -> L58
        monitor-exit(r2);     // Catch: java.lang.Throwable -> L58
        return r19;
    L58:
        th = move-exception;
        throw th;     // Catch: java.lang.Throwable -> L61
    }

    @Override
    @abcd.Interfacesu(method = 434601568616869173L)
    public int read(char[] r9, int r10, int r11) {
    L38:
        th = th;
    L40:
        if (DW == false) goto L43;
        java.lang.Throwable r1 = th;
        abcd.wu.j6(r1, -22544804121713933L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L43:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-22544804121713933L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L38
    L5:
        if (r9 == null) goto L37;
        if (r11 < 0) goto L35;
        if (r10 < 0) goto L33;
        if ((r11 + r10) > r9.length) goto L31;
        if (r11 != 0) goto L13;
        return 0;
    L13:
        int r0 = read();     // Catch: java.lang.Throwable -> L38
        if (r0 != (-1)) goto L17;
        return -1;
    L17:
        int r2 = r10 + 1;
        r9[r10] = (char) r0;     // Catch: java.lang.Throwable -> L28
        int r12 = 1;
    L19:
        if (r12 >= r11) goto L27;
        int r3 = read();     // Catch: java.lang.Throwable -> L28
        if (r3 == (-1)) goto L27;
        int r4 = r2 + 1;
        r9[r2] = (char) r3;     // Catch: java.lang.Throwable -> L25
        r12 = r12 + 1;
        r2 = r4;
    L25:
        th = th;
        r10 = r4;
    L27:
        return r12;
    L28:
        th = th;
        r10 = r2;
        goto L40
    L31:
        throw new java.lang.IndexOutOfBoundsException();     // Catch: java.lang.Throwable -> L38
    L33:
        throw new java.lang.IndexOutOfBoundsException();     // Catch: java.lang.Throwable -> L38
    L35:
        throw new java.lang.IndexOutOfBoundsException();     // Catch: java.lang.Throwable -> L38
    L37:
        throw new java.lang.NullPointerException();     // Catch: java.lang.Throwable -> L38
    }
}
