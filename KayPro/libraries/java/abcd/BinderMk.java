package abcd;

@abcd.Interfacexu
class BinderMk extends com.aide.engine.service.u.a {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;
    final abcd.Nk.a VH;

    @abcd.Interfaceru(field = -393744849814177100L)
    private com.aide.engine.service.CharArray Zo;

    @abcd.Interfacevu
    final abcd.Nk gn;

    @abcd.Interfaceru(field = 98836575055614671L)
    private com.aide.engine.I v5;

    static {
        abcd.wu.j6(abcd.BinderMk.class, -87904726456966265L, 555058604179105996L);
    }

    BinderMk(abcd.Nk r1, abcd.Nk.a r2) {
        this.gn = r1;
        this.VH = r2;
        this.v5 = new com.aide.engine.I();
        this.Zo = new com.aide.engine.service.CharArray(10000);
    }

    @Override
    @abcd.Interfacesu(method = 2235608365559036496L)
    public com.aide.engine.service.CharArray FH(int r10) {
    L17:
        th = th;
    L19:
        if (Hw == false) goto L22;
        abcd.wu.j6(th, -1061154994333155840L, this, new java.lang.Integer(r10));
    L22:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-1061154994333155840L, this, r10);     // Catch: java.lang.Throwable -> L17
    L6:
        char[] r2 = this.v5.FH;     // Catch: java.lang.Throwable -> L17
        char[] r3 = this.Zo.FH;     // Catch: java.lang.Throwable -> L17
        int r4 = this.v5.Hw;     // Catch: java.lang.Throwable -> L17
        int r5 = r3.length;     // Catch: java.lang.Throwable -> L17
        int r6 = 0;
    L8:
        if (r10 >= r4) goto L15;
        if (r6 >= r5) goto L15;
        int r7 = r6 + 1;
        int r8 = r10 + 1;
        r3[r6] = r2[r10];     // Catch: java.lang.Throwable -> L13
        r6 = r7;
        r10 = r8;
    L13:
        th = th;
        r10 = r8;
    L15:
        this.Zo.Hw = r6;     // Catch: java.lang.Throwable -> L17
        return this.Zo;
    }

    @Override
    @abcd.Interfacesu(method = -1667774281767890280L)
    public long getVersion() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1635135770701214400L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(1635135770701214400L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.VH.getVersion();
    }

    @Override
    @abcd.Interfacesu(method = 2210754340865682671L)
    public int sE() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1245703052780377183L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(1245703052780377183L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.v5.Hw;
    }

    @Override
    @abcd.Interfacesu(method = 4312686639289931136L)
    public long ye() {
    L12:
        th = move-exception;
        if (Hw == false) goto L16;
        abcd.wu.j6(th, -96783880885932968L, this);
    L16:
        throw th;
    L4:
        if (FH == false) goto L19;
        abcd.wu.j6(-96783880885932968L, this);     // Catch: java.lang.Throwable -> L12
    L19:
        this.VH.j6(this.v5);     // Catch: java.io.IOException -> L8 java.lang.Throwable -> L12
        com.aide.engine.I r2 = this.v5;     // Catch: java.io.IOException -> L8 java.lang.Throwable -> L12
        r2.FH = this.v5.FH;     // Catch: java.io.IOException -> L8 java.lang.Throwable -> L12
        com.aide.engine.I r3 = this.v5;     // Catch: java.io.IOException -> L8 java.lang.Throwable -> L12
        r3.Hw = this.v5.Hw;     // Catch: java.io.IOException -> L8 java.lang.Throwable -> L12
        com.aide.engine.I r4 = this.v5;     // Catch: java.io.IOException -> L8 java.lang.Throwable -> L12
        r4.v5 = this.v5.v5;     // Catch: java.io.IOException -> L8 java.lang.Throwable -> L12
    L10:
        return this.v5.v5;
    L8:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L12
        this.v5.Hw = 0;     // Catch: java.lang.Throwable -> L12
        goto L10
    }
}
