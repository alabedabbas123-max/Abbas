package com.aide.appwizard;

@abcd.Interfacexu
public class B {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -2194784078686983268L)
    private com.aide.appwizard.AppWizardDesignActivity FH;

    @abcd.Interfaceru(field = -119322325207946560L)
    private com.aide.appwizard.runtime.i.c Hw;

    static {
        abcd.wu.j6(com.aide.appwizard.B.class, 3947348440358438304L, 3947348440358438304L);
    }

    public B(com.aide.appwizard.AppWizardDesignActivity r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -425007188381565617L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-425007188381565617L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6;     // Catch: java.lang.Throwable -> L8
    }

    static java.lang.String DW(com.aide.appwizard.B r0, java.lang.String r1, java.lang.String r2) {
        return r0.DW(r1, r2);
    }

    @abcd.Interfacesu(method = -460634347084192692L)
    private java.lang.String DW(java.lang.String r8, java.lang.String r9) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 6003390928539563520L, this, r8, r9);
    L13:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(6003390928539563520L, this, r8, r9);     // Catch: java.lang.Throwable -> L9
    L5:
        if (r9 != null) goto L7;
        return r8;
    L7:
        return r8 + " = <b>&quot;" + r9 + "&quot;</b>";
    }

    @abcd.Interfacesu(method = -5962017558637850175L)
    private void DW(java.util.List<com.aide.common.ua.a> r8, com.aide.appwizard.runtime.i.b r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3810775062842195793L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3810775062842195793L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        r8.add(new com.aide.appwizard.m(this, r9));     // Catch: java.lang.Throwable -> L7
    }

    static com.aide.appwizard.AppWizardDesignActivity j6(com.aide.appwizard.B r0) {
        return r0.FH;
    }

    static com.aide.appwizard.runtime.i.c j6(com.aide.appwizard.B r0, com.aide.appwizard.runtime.i.c r1) {
        r0.Hw = r1;
        return r1;
    }

    static java.lang.String j6(com.aide.appwizard.B r0, java.lang.String r1, java.lang.String r2) {
        return r0.j6(r1, r2);
    }

    @abcd.Interfacesu(method = 432456299891089119L)
    private java.lang.String j6(java.lang.String r8, java.lang.String r9) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 145829374660606507L, this, r8, r9);
    L13:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(145829374660606507L, this, r8, r9);     // Catch: java.lang.Throwable -> L9
    L5:
        if (r9 != null) goto L7;
        return r8;
    L7:
        return r8 + " = <b>" + r9 + "</b>";
    }

    @abcd.Interfacesu(method = -175498574952083328L)
    private java.util.List<? extends com.aide.common.ua.a> j6(com.aide.appwizard.runtime.i.b r7) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -757870497926421264L, this, r7);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-757870497926421264L, this, r7);     // Catch: java.lang.Throwable -> L12
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L12
        java.util.Iterator<com.aide.appwizard.runtime.i.c> r3 = r7.DW().iterator();     // Catch: java.lang.Throwable -> L12
    L8:
        if (r3.hasNext() == false) goto L10;
        r2.add(new com.aide.appwizard.w(this, r3.next()));     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        r2.add(new com.aide.appwizard.x(this, r7));     // Catch: java.lang.Throwable -> L12
        j6(r2, "Title", r7.Hw(), new com.aide.appwizard.y(this, r7));     // Catch: java.lang.Throwable -> L12
        j6(r2, r7);     // Catch: java.lang.Throwable -> L12
        DW(r2, r7);     // Catch: java.lang.Throwable -> L12
        j6(r2, "Show Title", r7.EQ(), new com.aide.appwizard.z(this, r7));     // Catch: java.lang.Throwable -> L12
        j6(r2, "Show Action Bar", r7.VH(), new com.aide.appwizard.A(this, r7));     // Catch: java.lang.Throwable -> L12
        j6(r2, "Fullscreen", r7.u7(), new com.aide.appwizard.i(this, r7));     // Catch: java.lang.Throwable -> L12
        return r2;
    }

    @abcd.Interfacesu(method = -2092020680233591143L)
    private java.util.List<? extends com.aide.common.ua.a> j6(com.aide.appwizard.runtime.i.c r7) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -3489616603797823103L, this, r7);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3489616603797823103L, this, r7);     // Catch: java.lang.Throwable -> L11
    L6:
        java.util.ArrayList r2 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L11
        r2.add(new com.aide.appwizard.s(this));     // Catch: java.lang.Throwable -> L11
        if (r7.DW().DW().size() <= 1) goto L9;
        r2.add(new com.aide.appwizard.t(this, r7));     // Catch: java.lang.Throwable -> L11
    L9:
        j6(r2, "Title", r7.v5(), new com.aide.appwizard.u(this, r7));     // Catch: java.lang.Throwable -> L11
        r2.add(new com.aide.appwizard.v(this, r7));     // Catch: java.lang.Throwable -> L11
        return r2;
    }

    @abcd.Interfacesu(method = -2784757224471345444L)
    private void j6(java.util.List<com.aide.common.ua.a> r8, com.aide.appwizard.runtime.i.b r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 2160859413410613840L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(2160859413410613840L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        r8.add(new com.aide.appwizard.k(this, r9));     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -6961360701991494444L)
    private void j6(java.util.List<com.aide.common.ua.a> r10, java.lang.String r11, java.lang.Boolean r12, com.aide.common.ab<java.lang.Boolean> r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 138542902559513616L, this, r10, r11, r12, r13);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(138542902559513616L, this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
    L5:
        r10.add(new com.aide.appwizard.r(this, r11, r13, r12));     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 2136045333170136936L)
    private void j6(java.util.List<com.aide.common.ua.a> r10, java.lang.String r11, java.lang.String r12, com.aide.common.ab<java.lang.String> r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -4570842829380256352L, this, r10, r11, r12, r13);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4570842829380256352L, this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
    L5:
        r10.add(new com.aide.appwizard.o(this, r11, r12, r13));     // Catch: java.lang.Throwable -> L7
    }

    public void j6() {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -2629781559517107456L, this);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L8;
        abcd.wu.j6(-2629781559517107456L, this);     // Catch: java.lang.Throwable -> L12
    L8:
        if (this.Hw == null) goto L10;
        com.aide.common.Abstractma.j6(this.FH, new com.aide.common.ua("Activity \"" + this.FH.u7().FH().Hw() + "\" > Fragment \"" + this.Hw.v5() + "\"", j6(this.Hw)));     // Catch: java.lang.Throwable -> L12
        return;
    L10:
        com.aide.common.Abstractma.j6(this.FH, new com.aide.common.ua("Activity \"" + this.FH.u7().FH().Hw() + "\"", j6(this.FH.u7().FH())));     // Catch: java.lang.Throwable -> L12
    }
}
