package com.aide.ui.views.editor;

@abcd.Interfacexu
class A {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -1959384356968685160L)
    protected char[] FH;

    @abcd.Interfaceru(field = -1956739901776658388L)
    protected int Hw;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.A.class, -1387074681965109305L, -1387074681965109305L);
    }

    @abcd.Interfacesu(method = -3234523648113087092L)
    public A() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1213807812719345060L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1213807812719345060L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this(8);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 148479439339798965L)
    public A(int r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2602481444527372197L, null, new java.lang.Integer(r6));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2602481444527372197L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new char[r6];     // Catch: java.lang.Throwable -> L8
        this.Hw = 0;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = 1955306806711584L)
    public A(char[] r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3395930771742966880L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3395930771742966880L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6;     // Catch: java.lang.Throwable -> L8
        this.Hw = r6.length;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -889702160574492915L)
    protected void DW() {
    L18:
        th = move-exception;
        if (DW == false) goto L23;
        abcd.wu.j6(th, -1205030465657484831L, this);
    L23:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1205030465657484831L, this);     // Catch: java.lang.Throwable -> L18
    L6:
        int r2 = this.FH.length;     // Catch: java.lang.Throwable -> L18
    L7:
        if (r2 <= 8) goto L14;
        if (this.Hw >= (r2 / 4)) goto L14;
        r2 = r2 / 2;     // Catch: java.lang.Throwable -> L18
        if (r2 >= 8) goto L7;
        r2 = 8;
    L14:
        if (r2 != this.FH.length) goto L16;
        return;
    L16:
        char[] r3 = new char[r2];     // Catch: java.lang.Throwable -> L18
        java.lang.System.arraycopy(this.FH, 0, r3, 0, this.Hw);     // Catch: java.lang.Throwable -> L18
        this.FH = r3;     // Catch: java.lang.Throwable -> L18
    }

    @abcd.Interfacesu(method = 1204947273498699645L)
    public void DW(char r8, int r9) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -957859015917768843L, this, new java.lang.Character(r8), new java.lang.Integer(r9));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-957859015917768843L, this, new java.lang.Character(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L16
    L5:
        int r0 = r9 + 1;     // Catch: java.lang.Throwable -> L16
        DW(r0);     // Catch: java.lang.Throwable -> L16
        if (r9 != this.Hw) goto L9;
        this.Hw = r0;     // Catch: java.lang.Throwable -> L16
    L14:
        this.FH[r9] = r8;     // Catch: java.lang.Throwable -> L16
        return;
    L9:
        if (r9 <= this.Hw) goto L14;
        int r1 = this.Hw;     // Catch: java.lang.Throwable -> L16
    L11:
        if (r1 >= r9) goto L13;
        this.FH[r1] = ' ';     // Catch: java.lang.Throwable -> L16
        r1 = r1 + 1;     // Catch: java.lang.Throwable -> L16
        goto L11
    L13:
        this.Hw = r0;     // Catch: java.lang.Throwable -> L16
        goto L14
    }

    @abcd.Interfacesu(method = 731962299301213128L)
    protected void DW(int r7) {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -721263249276454520L, this, new java.lang.Integer(r7));
    L20:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-721263249276454520L, this, r7);     // Catch: java.lang.Throwable -> L15
    L6:
        int r2 = this.FH.length;     // Catch: java.lang.Throwable -> L15
        if (r2 != 0) goto L9;
        r2 = 1;
    L9:
        if (r2 >= r7) goto L12;
        r2 = r2 * 2;     // Catch: java.lang.Throwable -> L15
        goto L9
    L12:
        if (r2 == this.FH.length) goto L26;
        char[] r3 = new char[r2];     // Catch: java.lang.Throwable -> L15
        java.lang.System.arraycopy(this.FH, 0, r3, 0, this.FH.length);     // Catch: java.lang.Throwable -> L15
        this.FH = r3;     // Catch: java.lang.Throwable -> L15
        return;
    }

    @abcd.Interfacesu(method = 1352549333408226129L)
    public void DW(char[] r8, int r9) {
    L19:
        th = move-exception;
        if (DW == false) goto L24;
        abcd.wu.j6(th, -837988466895852867L, this, r8, new java.lang.Integer(r9));
    L24:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-837988466895852867L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L19
    L5:
        DW(r8.length + r9);     // Catch: java.lang.Throwable -> L19
        if (r9 <= this.Hw) goto L11;
        int r0 = this.Hw;     // Catch: java.lang.Throwable -> L19
    L8:
        if (r0 >= r9) goto L11;
        this.FH[r0] = ' ';     // Catch: java.lang.Throwable -> L19
        r0 = r0 + 1;     // Catch: java.lang.Throwable -> L19
    L11:
        if ((r8.length + r9) <= this.Hw) goto L13;
        this.Hw = r8.length + r9;     // Catch: java.lang.Throwable -> L19
    L13:
        int r1 = 0;
    L14:
        if (r1 >= r8.length) goto L18;
        this.FH[r9 + r1] = r8[r1];     // Catch: java.lang.Throwable -> L19
        r1 = r1 + 1;
        goto L14
    }

    @abcd.Interfacesu(method = 1247548531626430425L)
    public int FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1180819762823701691L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1180819762823701691L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.Hw;
    }

    @abcd.Interfacesu(method = -3785451009388181140L)
    public void FH(int r7) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3293931018734763200L, this, new java.lang.Integer(r7));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3293931018734763200L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        java.lang.System.arraycopy(this.FH, r7 + 1, this.FH, r7, (this.FH.length - r7) - 1);     // Catch: java.lang.Throwable -> L8
        this.Hw--;     // Catch: java.lang.Throwable -> L8
        DW();     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -124752135297276528L)
    public char j6(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 323405128204145712L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(323405128204145712L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH[r5];
    }

    @abcd.Interfacesu(method = -4086056952028583520L)
    public void j6(char r8, int r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -1311648763299673968L, this, new java.lang.Character(r8), new java.lang.Integer(r9));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1311648763299673968L, this, new java.lang.Character(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L10
    L6:
        if (r9 < this.Hw) goto L8;
        DW(r8, r9);     // Catch: java.lang.Throwable -> L10
        return;
    L8:
        DW(this.Hw + 1);     // Catch: java.lang.Throwable -> L10
        java.lang.System.arraycopy(this.FH, r9, this.FH, r9 + 1, this.Hw - r9);     // Catch: java.lang.Throwable -> L10
        this.FH[r9] = r8;     // Catch: java.lang.Throwable -> L10
        this.Hw++;     // Catch: java.lang.Throwable -> L10
    }

    @abcd.Interfacesu(method = 3528362942474277676L)
    public void j6(int r8, int r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 1280316356218634784L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1280316356218634784L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L11
    L5:
        int r0 = r9 + r8;     // Catch: java.lang.Throwable -> L11
        if (r0 > this.Hw) goto L10;
        java.lang.System.arraycopy(this.FH, r0, this.FH, r9, (this.FH.length - r9) - r8);     // Catch: java.lang.Throwable -> L11
        this.Hw -= r8;     // Catch: java.lang.Throwable -> L11
        DW();     // Catch: java.lang.Throwable -> L11
        return;
    L10:
        throw new java.lang.ArrayIndexOutOfBoundsException("Trying to remove " + r8 + " characters at position " + r9 + " from a line containing " + this.Hw + " characters");     // Catch: java.lang.Throwable -> L11
    }

    @abcd.Interfacesu(method = 459567826997307912L)
    public void j6(int r10, int r11, char[] r12, int r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 315531791291037808L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), r12, new java.lang.Integer(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(315531791291037808L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        java.lang.System.arraycopy(this.FH, r10, r12, r13, r11);     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 361967082420023848L)
    public void j6(char[] r7) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -82934643534134616L, this, r7);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-82934643534134616L, this, r7);     // Catch: java.lang.Throwable -> L12
    L6:
        DW(this.Hw + r7.length);     // Catch: java.lang.Throwable -> L12
        int r2 = 0;
    L8:
        if (r2 >= r7.length) goto L10;
        this.FH[this.Hw + r2] = r7[r2];     // Catch: java.lang.Throwable -> L12
        r2 = r2 + 1;     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        this.Hw += r7.length;     // Catch: java.lang.Throwable -> L12
    }

    @abcd.Interfacesu(method = 4442709740692535444L)
    public void j6(char[] r8, int r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 2101052007481125120L, this, r8, new java.lang.Integer(r9));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(2101052007481125120L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L10
    L6:
        if (r9 < this.Hw) goto L8;
        DW(r8, r9);     // Catch: java.lang.Throwable -> L10
        return;
    L8:
        DW(this.Hw + r8.length);     // Catch: java.lang.Throwable -> L10
        java.lang.System.arraycopy(this.FH, r9, this.FH, r8.length + r9, this.Hw - r9);     // Catch: java.lang.Throwable -> L10
        java.lang.System.arraycopy(r8, 0, this.FH, r9, r8.length);     // Catch: java.lang.Throwable -> L10
        this.Hw += r8.length;     // Catch: java.lang.Throwable -> L10
    }

    @abcd.Interfacesu(method = -1404723648088250251L)
    public char[] j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2307418730626148425L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2307418730626148425L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        char[] r2 = new char[this.Hw];     // Catch: java.lang.Throwable -> L8
        j6(0, this.Hw, r2, 0);     // Catch: java.lang.Throwable -> L8
        return r2;
    }
}
