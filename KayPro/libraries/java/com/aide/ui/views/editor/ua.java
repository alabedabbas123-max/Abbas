package com.aide.ui.views.editor;

@abcd.Interfacexu
class ua extends java.io.Reader {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 4587903370976954931L)
    private char[] EQ;

    @abcd.Interfaceru(field = 412333317917277219L)
    private com.aide.ui.views.editor.Interfaceo FH;

    @abcd.Interfaceru(field = 1328527460320608825L)
    private int Hw;

    @abcd.Interfaceru(field = 2618435471901938744L)
    private int VH;

    @abcd.Interfaceru(field = 3323455104459596200L)
    private int Zo;

    @abcd.Interfaceru(field = 5937247321418295515L)
    private int gn;

    @abcd.Interfaceru(field = -6311479247298608L)
    private int tp;

    @abcd.Interfaceru(field = 290187455210148033L)
    private char u7;

    @abcd.Interfaceru(field = -1964389678324685183L)
    private int v5;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ua.class, 1215171460922875599L, 1215171460922875599L);
    }

    @abcd.Interfacesu(method = -1468295511332350655L)
    ua(com.aide.ui.views.editor.Interfaceo r9, int r10, int r11, int r12, int r13, boolean r14, java.lang.String r15) {
        if (j6 == false) goto L5;
        abcd.wu.j6(-51200298011060736L, null, new java.lang.Object[]{r9, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Boolean(r14), r15});
    L5:
        this.FH = r9;
        this.Hw = r10;
        this.v5 = r11;
        if (r13 >= r9.v5()) goto L12;
        this.VH = r13;
        if (r12 < r9.EQ(this.VH)) goto L11;
        r12 = r9.EQ(this.VH) - 1;
    L11:
        this.Zo = r12;
    L14:
        if (r11 != this.VH) goto L16;
        int r16 = this.Zo + 1;
    L17:
        this.gn = r16;
        if (r14 == false) goto L20;
        char r17 = ' ';
    L21:
        this.u7 = r17;
        this.tp = 0;
        this.EQ = r15.toCharArray();
        return;
    L20:
        r17 = '\t';
        goto L21
    L16:
        r16 = r9.EQ(r11);
        goto L17
    L12:
        this.VH = r9.v5() - 1;
        this.Zo = r9.EQ(this.VH) - 1;
        goto L14
    }

    @Override
    @abcd.Interfacesu(method = -2850881407170820185L)
    public void close() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2043230389146606560L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(2043230389146606560L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    @abcd.Interfacesu(method = -1037753150407565601L)
    public int read() {
    L27:
        th = move-exception;
        if (DW == false) goto L31;
        abcd.wu.j6(th, 709409337973381296L, this);
    L31:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(709409337973381296L, this);     // Catch: java.lang.Throwable -> L27
    L7:
        if (this.Hw >= this.gn) goto L14;
        com.aide.ui.views.editor.Interfaceo r2 = this.FH;     // Catch: java.lang.Throwable -> L27
        int r3 = this.Hw;     // Catch: java.lang.Throwable -> L27
        this.Hw = r3 + 1;     // Catch: java.lang.Throwable -> L27
        char r4 = r2.FH(r3, this.v5);     // Catch: java.lang.Throwable -> L27
        if (r4 == '\t') goto L12;
        return r4;
    L12:
        return this.u7;
    L14:
        if (this.v5 != this.VH) goto L18;
        return -1;
    L18:
        if (this.tp >= (this.EQ.length - 1)) goto L21;
        char[] r5 = this.EQ;     // Catch: java.lang.Throwable -> L27
        int r6 = this.tp;     // Catch: java.lang.Throwable -> L27
        this.tp = r6 + 1;     // Catch: java.lang.Throwable -> L27
        return r5[r6];
    L21:
        this.tp = 0;     // Catch: java.lang.Throwable -> L27
        this.Hw = 0;     // Catch: java.lang.Throwable -> L27
        this.v5++;     // Catch: java.lang.Throwable -> L27
        if (this.v5 != this.VH) goto L24;
        int r7 = this.Zo + 1;     // Catch: java.lang.Throwable -> L27
    L25:
        this.gn = r7;     // Catch: java.lang.Throwable -> L27
        return this.EQ[this.EQ.length - 1];
    L24:
        r7 = this.FH.EQ(this.v5);     // Catch: java.lang.Throwable -> L27
        goto L25
    }

    @Override
    @abcd.Interfacesu(method = -731244846448698805L)
    public int read(char[] r9, int r10, int r11) {
    L38:
        th = th;
    L40:
        if (DW == false) goto L43;
        java.lang.Throwable r1 = th;
        abcd.wu.j6(r1, 3839133521585640380L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));
    L43:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3839133521585640380L, this, r9, new java.lang.Integer(r10), new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L38
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
