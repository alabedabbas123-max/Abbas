package com.aide.uidesigner;

@abcd.Interfacexu
class Na extends android.widget.BaseExpandableListAdapter {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.uidesigner.Pa FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.Na.class, -1505387028266607057L, 1578126810207181311L);
    }

    Na(com.aide.uidesigner.Pa r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 982916760897295677L)
    public java.lang.Object getChild(int r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3812158390644098649L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L14;
        abcd.wu.j6(3812158390644098649L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        return null;
    L14:
        return null;
    }

    @Override
    @abcd.Interfacesu(method = -2455592382232554624L)
    public long getChildId(int r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 156678578588808L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L14;
        abcd.wu.j6(156678578588808L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        return 0;
    L14:
        return 0;
    }

    @Override
    @abcd.Interfacesu(method = -2227456186571250175L)
    public android.view.View getChildView(int r11, int r12, boolean r13, android.view.View r14, android.view.ViewGroup r15) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 1370934711070881999L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Boolean(r13), r14, r15);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1370934711070881999L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), new java.lang.Boolean(r13), r14, r15);     // Catch: java.lang.Throwable -> L11
    L6:
        if (r14 != null) goto L8;
        android.view.View r1 = android.view.LayoutInflater.from(com.aide.uidesigner.Pa.DW(this.FH)).inflate(17367047, r15, false);     // Catch: java.lang.Throwable -> L11
    L9:
        android.widget.TextView r2 = (android.widget.TextView) r1.findViewById(16908308);     // Catch: java.lang.Throwable -> L11
        java.lang.StringBuilder r3 = new java.lang.StringBuilder();     // Catch: java.lang.Throwable -> L11
        r3.append("Item ");     // Catch: java.lang.Throwable -> L11
        int r4 = r12 + 1;     // Catch: java.lang.Throwable -> L11
        r3.append(r4);     // Catch: java.lang.Throwable -> L11
        r2.setText(r3.toString());     // Catch: java.lang.Throwable -> L11
        ((android.widget.TextView) r1.findViewById(16908309)).setText("Item " + r4);     // Catch: java.lang.Throwable -> L11
        return r1;
    L8:
        r1 = r14;
        goto L9
    }

    @Override
    @abcd.Interfacesu(method = -4982255037806816224L)
    public int getChildrenCount(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3742943147527237168L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-3742943147527237168L, this, r5);     // Catch: java.lang.Throwable -> L8
        return 2;
    L15:
        return 2;
    }

    @Override
    @abcd.Interfacesu(method = -913490219873276773L)
    public java.lang.Object getGroup(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -128065633659257303L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-128065633659257303L, this, r5);     // Catch: java.lang.Throwable -> L8
        return null;
    L15:
        return null;
    }

    @Override
    @abcd.Interfacesu(method = -5495115976507608203L)
    public int getGroupCount() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4796115743598909483L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(4796115743598909483L, this);     // Catch: java.lang.Throwable -> L8
        return 30;
    L15:
        return 30;
    }

    @Override
    @abcd.Interfacesu(method = -895106342997241056L)
    public long getGroupId(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 44237693808139780L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(44237693808139780L, this, r5);     // Catch: java.lang.Throwable -> L8
    L7:
        return r5;
    }

    @Override
    @abcd.Interfacesu(method = -3540904556454270291L)
    public android.view.View getGroupView(int r10, boolean r11, android.view.View r12, android.view.ViewGroup r13) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, 5110418311299742197L, this, new java.lang.Integer(r10), new java.lang.Boolean(r11), r12, r13);
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(5110418311299742197L, this, new java.lang.Integer(r10), new java.lang.Boolean(r11), r12, r13);     // Catch: java.lang.Throwable -> L10
    L5:
        if (r12 != null) goto L7;
        android.view.View r0 = android.view.LayoutInflater.from(com.aide.uidesigner.Pa.DW(this.FH)).inflate(17367046, r13, false);     // Catch: java.lang.Throwable -> L10
    L8:
        ((android.widget.TextView) r0.findViewById(16908308)).setText("Group " + (r10 + 1));     // Catch: java.lang.Throwable -> L10
        return r0;
    L7:
        r0 = r12;
        goto L8
    }

    @Override
    @abcd.Interfacesu(method = 4655885736357998472L)
    public boolean hasStableIds() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3357678628057742380L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(3357678628057742380L, this);     // Catch: java.lang.Throwable -> L8
        return true;
    L15:
        return true;
    }

    @Override
    @abcd.Interfacesu(method = -35363442974433009L)
    public boolean isChildSelectable(int r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 8449732978807418109L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L14;
        abcd.wu.j6(8449732978807418109L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        return true;
    L14:
        return true;
    }
}
