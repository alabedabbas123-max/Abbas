package com.aide.ui.views.editor;

@abcd.Interfacexu
public abstract class Abstractb implements com.aide.ui.views.editor.Interfaceo {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 3286947504893832567L)
    private java.util.Vector<com.aide.ui.views.editor.Interfacep> FH;

    @abcd.Interfaceru(field = -5205861703241239587L)
    private java.util.Vector<com.aide.ui.views.editor.r> Hw;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.Abstractb.class, 1566531812821854615L, 1566531812821854615L);
    }

    @abcd.Interfacesu(method = 2705676661541352780L)
    protected Abstractb() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1940832251156448216L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1940832251156448216L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new java.util.Vector();     // Catch: java.lang.Throwable -> L8
        this.Hw = new java.util.Vector();     // Catch: java.lang.Throwable -> L8
    }

    public java.io.Reader DW(int r11, int r12, int r13, int r14, boolean r15) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5694848270465911392L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Boolean(r15));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5694848270465911392L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Boolean(r15));     // Catch: java.lang.Throwable -> L7
    L5:
        return new com.aide.ui.views.editor.ua(this, r11, r12, r13, r14, r15, java.lang.System.getProperty("line.separator"));
    }

    public java.io.Reader DW(abcd.hm r8, java.lang.String r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -4522341776286661584L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4522341776286661584L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return j6(r8, false, r9);
    }

    @abcd.Interfacesu(method = -2659111120049956835L)
    protected void DW(int r10, int r11, int r12, int r13) {
    L11:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -1084801988655710325L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L16:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1084801988655710325L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L11
    L5:
        int r0 = 0;
    L6:
        if (r0 >= this.FH.size()) goto L10;
        this.FH.elementAt(r0).j6(this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L11
        r0 = r0 + 1;
        goto L6
    }

    @Override
    public void DW(com.aide.ui.views.editor.Interfacep r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3369301767984234572L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3369301767984234572L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.removeElement(r5);     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void DW(com.aide.ui.views.editor.r r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -2163666501094445L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-2163666501094445L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.Hw.contains(r5) == true) goto L17;
        this.Hw.addElement(r5);     // Catch: java.lang.Throwable -> L10
        return;
    }

    @abcd.Interfacesu(method = -440917883039987895L)
    protected void FH(int r10, int r11, int r12, int r13) {
    L11:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -312712619351427013L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L16:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-312712619351427013L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L11
    L5:
        int r0 = 0;
    L6:
        if (r0 >= this.FH.size()) goto L10;
        this.FH.elementAt(r0).DW(this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L11
        r0 = r0 + 1;
        goto L6
    }

    @abcd.Interfacesu(method = -4069884155891298133L)
    protected void J0(int r8, int r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 159681233771880745L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L16:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(159681233771880745L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L11
    L5:
        int r0 = 0;
    L6:
        if (r0 >= this.Hw.size()) goto L10;
        this.Hw.elementAt(r0).j6(this, r8, r9);     // Catch: java.lang.Throwable -> L11
        r0 = r0 + 1;
        goto L6
    }

    @abcd.Interfacesu(method = -297265072102469451L)
    protected void QX() {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 5563573155584199L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5563573155584199L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        int r2 = 0;
    L7:
        if (r2 >= this.Hw.size()) goto L11;
        this.Hw.elementAt(r2).DW(this);     // Catch: java.lang.Throwable -> L12
        r2 = r2 + 1;
        goto L7
    }

    @abcd.Interfacesu(method = -693325699505062629L)
    protected void XL() {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 5900180538325225529L, this);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5900180538325225529L, this);     // Catch: java.lang.Throwable -> L12
    L6:
        int r2 = 0;
    L7:
        if (r2 >= this.FH.size()) goto L11;
        this.FH.elementAt(r2).j6(this);     // Catch: java.lang.Throwable -> L12
        r2 = r2 + 1;
        goto L7
    }

    public java.io.Reader aM() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5537572141167890352L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5537572141167890352L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(false);
    }

    public java.io.Reader j6(int r14, int r15, int r16, int r17, boolean r18, java.lang.String r19) {
        if (j6 == false) goto L7;
        abcd.wu.j6(7210769073445213731L, this, new java.lang.Object[]{new java.lang.Integer(r14), new java.lang.Integer(r15), new java.lang.Integer(r16), new java.lang.Integer(r17), new java.lang.Boolean(r18), r19});
    L7:
        return new com.aide.ui.views.editor.ClassQ(this, r14, r15, r16, r17, r18, r19);
    }

    public java.io.Reader j6(abcd.hm r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3450285179285759665L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3450285179285759665L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(r5, false);
    }

    @Override
    public java.io.Reader j6(abcd.hm r10, java.lang.String r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 73590916201905727L, this, r10, r11);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(73590916201905727L, this, r10, r11);     // Catch: java.lang.Throwable -> L7
    L5:
        return new com.aide.ui.views.editor.ua(this, r10.FH(), r10.Hw(), r10.j6(), r10.DW(), false, r11);
    }

    public java.io.Reader j6(abcd.hm r8, boolean r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1885027708993265764L, this, r8, new java.lang.Boolean(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1885027708993265764L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        return DW(r8.FH(), r8.Hw(), r8.j6(), r8.DW(), r9);
    }

    public java.io.Reader j6(abcd.hm r10, boolean r11, java.lang.String r12) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2293925547897467929L, this, r10, new java.lang.Boolean(r11), r12);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2293925547897467929L, this, r10, new java.lang.Boolean(r11), r12);     // Catch: java.lang.Throwable -> L7
    L5:
        return new com.aide.ui.views.editor.ClassQ(this, r10.FH(), r10.Hw(), r10.j6(), r10.DW(), r11, r12);
    }

    public java.io.Reader j6(boolean r10) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5249827198154366685L, this, new java.lang.Boolean(r10));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5249827198154366685L, this, r10);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(0, 0, 0, Integer.MAX_VALUE, r10);
    }

    @abcd.Interfacesu(method = 155795949525734895L)
    protected void j6(int r10, int r11, int r12, int r13) {
    L11:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 784750405027757653L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));
    L16:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(784750405027757653L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L11
    L5:
        int r0 = 0;
    L6:
        if (r0 >= this.Hw.size()) goto L10;
        this.Hw.elementAt(r0).FH(this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L11
        r0 = r0 + 1;
        goto L6
    }

    @abcd.Interfacesu(method = -2647374387096262005L)
    protected void j6(int r10, int r11, int r12, char[] r13) {
    L11:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -1120075562095978227L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), r13);
    L16:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1120075562095978227L, this, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12), r13);     // Catch: java.lang.Throwable -> L11
    L5:
        int r0 = 0;
    L6:
        if (r0 >= this.FH.size()) goto L10;
        this.FH.elementAt(r0).j6(this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L11
        r0 = r0 + 1;
        goto L6
    }

    @abcd.Interfacesu(method = 1885550603148405136L)
    protected void j6(abcd.hm r8, abcd.hm r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -1531011926099529156L, this, r8, r9);
    L16:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1531011926099529156L, this, r8, r9);     // Catch: java.lang.Throwable -> L11
    L5:
        int r0 = 0;
    L6:
        if (r0 >= this.Hw.size()) goto L10;
        this.Hw.elementAt(r0).j6(this, r8, r9);     // Catch: java.lang.Throwable -> L11
        r0 = r0 + 1;
        goto L6
    }

    @Override
    public void j6(com.aide.ui.views.editor.Interfacep r5) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 135809270154903147L, this, r5);
    L14:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(135809270154903147L, this, r5);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.FH.contains(r5) == true) goto L17;
        this.FH.addElement(r5);     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    public void j6(com.aide.ui.views.editor.r r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2701702598178151760L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2701702598178151760L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw.removeElement(r5);     // Catch: java.lang.Throwable -> L8
    }
}
