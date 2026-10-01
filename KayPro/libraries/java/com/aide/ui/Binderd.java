package com.aide.ui;

@abcd.Interfacexu
class Binderd extends com.aide.engine.service.o.a {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfacevu
    final com.aide.ui.ClassJ Zo;

    @abcd.Interfaceru(field = -2520756610768463740L)
    private java.util.List<com.aide.engine.SourceEntity> v5;

    static {
        abcd.wu.j6(com.aide.ui.Binderd.class, 1778539205842150985L, -7057479416484808744L);
    }

    Binderd(com.aide.ui.ClassJ r1) {
        this.Zo = r1;
        this.v5 = new java.util.ArrayList();
    }

    @Override
    @abcd.Interfacesu(method = 1159331326330560675L)
    public void Hw(java.util.List r6) {
    L16:
        th = move-exception;
        if (Hw == false) goto L21;
        abcd.wu.j6(th, 2859758183347652895L, this, r6);
    L21:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(2859758183347652895L, this, r6);     // Catch: java.lang.Throwable -> L16
    L6:
        java.util.Iterator r2 = r6.iterator();     // Catch: java.lang.Throwable -> L16
    L7:
        if (r2.hasNext() == false) goto L15;
        com.aide.engine.SourceEntity r3 = (com.aide.engine.SourceEntity) r2.next();     // Catch: java.lang.Throwable -> L16
        if (com.aide.ui.ClassJ.j6(this.Zo) == true) goto L13;
        if (r3.j3() == true) goto L7;
    L13:
        this.v5.add(r3);     // Catch: java.lang.Throwable -> L16
        goto L7
    }

    @Override
    @abcd.Interfacesu(method = 167240921394471565L)
    public void j6(java.lang.String r10, long r11, int r13, int r14) {
    L9:
        th = move-exception;
        if (Hw == false) goto L13;
        abcd.wu.j6(th, 917661025685274759L, this, r10, new java.lang.Long(r11), new java.lang.Integer(r13), new java.lang.Integer(r14));
    L13:
        throw th;
    L3:
        if (FH == false) goto L6;
        abcd.wu.j6(917661025685274759L, this, r10, new java.lang.Long(r11), new java.lang.Integer(r13), new java.lang.Integer(r14));     // Catch: java.lang.Throwable -> L9
    L6:
        if (r10.equals(com.aide.ui.U.er().DW()) == false) goto L16;
        com.aide.ui.U.j6(new com.aide.ui.RunnableC1727a(this));     // Catch: java.lang.Throwable -> L9
        return;
    }

    @Override
    @abcd.Interfacesu(method = 4911125035837846176L)
    public void j6(java.lang.String r6, long r7, int r9, int r10, int r11, com.aide.engine.SourceEntity r12, java.lang.String r13) {
        if (FH == false) goto L6;
        abcd.wu.j6(372754244901186504L, this, new java.lang.Object[]{r6, new java.lang.Long(r7), new java.lang.Integer(r9), new java.lang.Integer(r10), new java.lang.Integer(r11), r12, r13});
    L6:
        if (r6.equals(com.aide.ui.U.er().DW()) == true) goto L8;
        return;
    L8:
        if (r7 == com.aide.ui.U.er().FH()) goto L10;
        return;
    L10:
        if (this.v5.size() >= 1000) goto L12;
        java.util.Collections.sort(this.v5, new com.aide.ui.ClassB(this));
    L12:
        java.util.List<com.aide.engine.SourceEntity> r8 = this.v5;
        this.v5 = null;
        com.aide.ui.U.j6(new com.aide.ui.RunnableC1779c(this, r9, r11, r8));
    }

    @Override
    @abcd.Interfacesu(method = 1424925237601204352L)
    public void k2() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -1916804816764552296L, this);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-1916804816764552296L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
    }
}
