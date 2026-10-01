package com.aide.uidesigner;

@abcd.Interfacexu
class ma implements android.widget.ExpandableListView.OnChildClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.AlertDialog FH;

    @abcd.Interfacevu
    final com.aide.uidesigner.na Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.ma.class, -20062164340700416L, -1453526942889476916L);
    }

    ma(com.aide.uidesigner.na r1, android.app.AlertDialog r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3268146217971866880L)
    public boolean onChildClick(android.widget.ExpandableListView r15, android.view.View r16, int r17, int r18, long r19) {
    L26:
        th = move-exception;
        if (DW == false) goto L30;
        abcd.wu.j6(th, 6212157870653134011L, this, r15, r16, new java.lang.Integer(r17), new java.lang.Integer(r18), new java.lang.Long(r19));
    L30:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(6212157870653134011L, this, r15, r16, new java.lang.Integer(r17), new java.lang.Integer(r18), new java.lang.Long(r19));     // Catch: java.lang.Throwable -> L26
    L6:
        this.FH.dismiss();     // Catch: java.lang.Throwable -> L26
        com.aide.uidesigner.Ka.a r0 = (com.aide.uidesigner.Ka.a) ((java.util.List) this.Hw.gn.get(r17)).get(r18);     // Catch: java.lang.Throwable -> L26
        java.util.HashMap r1 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L26
        r1.putAll(r0.Hw());     // Catch: java.lang.Throwable -> L26
        if (this.Hw.tp == false) goto L18;
        if (r1.containsKey("android:layout_width") == true) goto L14;
        r1.put("android:layout_width", "match_parent");     // Catch: java.lang.Throwable -> L26
    L14:
        if (r1.containsKey("android:layout_height") == true) goto L23;
        r1.put("android:layout_height", "match_parent");     // Catch: java.lang.Throwable -> L26
    L23:
        com.aide.uidesigner.ClassB r2 = new com.aide.uidesigner.ClassB(r0.VH(), r1);     // Catch: java.lang.Throwable -> L26
        this.Hw.EQ.j6(r2);     // Catch: java.lang.Throwable -> L26
        return true;
    L18:
        if (r1.containsKey("android:layout_width") == true) goto L21;
        r1.put("android:layout_width", "wrap_content");     // Catch: java.lang.Throwable -> L26
    L21:
        if (r1.containsKey("android:layout_height") == true) goto L23;
        r1.put("android:layout_height", "wrap_content");     // Catch: java.lang.Throwable -> L26
        goto L23
    }
}
