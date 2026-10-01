package com.aide.ui.scm;

@abcd.Interfacexu
public class ModifiedFileListEntry extends android.widget.LinearLayout {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 747486342880451449L)
    private boolean FH;

    static {
        abcd.wu.j6(com.aide.ui.scm.ModifiedFileListEntry.class, 44416731421310896L, 44416731421310896L);
    }

    public ModifiedFileListEntry(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4345442029832131620L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4345442029832131620L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
    }

    public ModifiedFileListEntry(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1859560107448818465L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1859560107448818465L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    public ModifiedFileListEntry(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -5001600418926741656L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5001600418926741656L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    }

    public android.widget.CheckBox getCheckBox() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3428980609986670455L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3428980609986670455L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return (android.widget.CheckBox) findViewById(com.almlkaide.kaypro.R.id.modifiedFileChecked);
    }

    public void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2406539537675644928L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2406539537675644928L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        getCheckBox().toggle();     // Catch: java.lang.Throwable -> L8
    }

    public void setChecked(boolean r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 584271293101273680L, this, new java.lang.Boolean(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(584271293101273680L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        getCheckBox().setChecked(r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1449255381540544281L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1449255381540544281L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        getCheckBox().setOnCheckedChangeListener(r5);     // Catch: java.lang.Throwable -> L8
    }

    public void setSelectedForDiff(boolean r6) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 2256362095475756180L, this, new java.lang.Boolean(r6));
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2256362095475756180L, this, r6);     // Catch: java.lang.Throwable -> L11
    L6:
        this.FH = r6;     // Catch: java.lang.Throwable -> L11
        if (this.FH == false) goto L9;
        android.content.res.TypedArray r2 = getContext().obtainStyledAttributes(new int[]{com.almlkaide.kaypro.R.attr.color_selected_item});     // Catch: java.lang.Throwable -> L11
        setBackgroundColor(r2.getColor(0, 0));     // Catch: java.lang.Throwable -> L11
        r2.recycle();     // Catch: java.lang.Throwable -> L11
        return;
    L9:
        setBackgroundResource(com.almlkaide.kaypro.R.color.transparent);     // Catch: java.lang.Throwable -> L11
    }
}
