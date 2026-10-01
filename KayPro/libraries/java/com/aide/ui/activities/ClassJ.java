package com.aide.ui.activities;

@abcd.Interfacexu
class ClassJ implements android.widget.AdapterView.OnItemLongClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.ListView FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.CommitActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.ClassJ.class, -48774866763899575L, -801339419722986243L);
    }

    ClassJ(com.aide.ui.activities.CommitActivity r1, android.widget.ListView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -1608362703901782144L)
    public boolean onItemLongClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -6164577527024316400L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-6164577527024316400L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L8
    L5:
        this.FH.requestFocus();     // Catch: java.lang.Throwable -> L8
        ((com.aide.ui.scm.ModifiedFileListEntry) r11).j6();     // Catch: java.lang.Throwable -> L8
        return true;
    }
}
