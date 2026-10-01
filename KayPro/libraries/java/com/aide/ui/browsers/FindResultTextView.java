package com.aide.ui.browsers;

@abcd.Interfacexu
public class FindResultTextView extends android.widget.TextView {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.browsers.FindResultTextView.class, 861791236826087153L, 861791236826087153L);
    }

    public FindResultTextView(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 84251207679510144L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(84251207679510144L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
        j6();     // Catch: java.lang.Throwable -> L8
    }

    public FindResultTextView(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -4051398043761124765L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4051398043761124765L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        j6();     // Catch: java.lang.Throwable -> L7
    }

    public FindResultTextView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1117803328554548160L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1117803328554548160L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        j6();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = 1038554163218819556L)
    private int j6(int r11, int r12, java.lang.String r13, int r14, int r15) {
    L17:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -5657873162711850493L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), r13, new java.lang.Integer(r14), new java.lang.Integer(r15));
    L21:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-5657873162711850493L, this, new java.lang.Integer(r11), new java.lang.Integer(r12), r13, new java.lang.Integer(r14), new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L17
    L5:
        int r0 = (r14 - r11) + 1;     // Catch: java.lang.Throwable -> L17
        if (r0 != 1) goto L8;
        int r2 = r15 - r12;     // Catch: java.lang.Throwable -> L17
    L9:
        if (r0 >= 1) goto L12;
        return 0;
    L12:
        if (r0 <= 1) goto L16;
        return r13.length();
    L16:
        return java.lang.Math.min(r13.length(), r2 - 1);
    L8:
        r2 = r15;
        goto L9
    }

    @abcd.Interfacesu(method = -2935053394939927080L)
    private void j6() {
        com.almlkaide.kaypro.aide.AdvancedSetting.setFindResultTextView(this);
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 779932234851519957L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(779932234851519957L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    public void setContent(com.aide.engine.FindResult r19) {
        com.aide.engine.FindResult r8 = r19;
    L40:
        th = move-exception;
        if (DW == false) goto L45;
        abcd.wu.j6(th, 402399515101525760L, this, r19);
    L45:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(402399515101525760L, this, r8);     // Catch: java.lang.Throwable -> L40
    L6:
        int r0 = r8.Hw;     // Catch: java.lang.Throwable -> L40
        java.lang.String r1 = r8.VH;     // Catch: java.lang.Throwable -> L40
        int r12 = 0;
    L8:
        if (r12 >= r1.length()) goto L12;
        if (java.lang.Character.isWhitespace(r1.charAt(r12)) == false) goto L12;
        r12 = r12 + 1;     // Catch: java.lang.Throwable -> L40
    L12:
        java.lang.String r13 = r1.substring(r12, r1.length());     // Catch: java.lang.Throwable -> L40
        setText(r13, android.widget.TextView.BufferType.SPANNABLE);     // Catch: java.lang.Throwable -> L40
        android.text.Spannable r14 = (android.text.Spannable) getText();     // Catch: java.lang.Throwable -> L40
        int r3 = r12;
        int r15 = j6(r0, r3, r13, r8.Hw, r8.v5);     // Catch: java.lang.Throwable -> L40
        int r4 = r12;
        int r2 = j6(r0, r4, r13, r8.Hw, r8.Zo);     // Catch: java.lang.Throwable -> L40
        r14.setSpan(new android.text.style.UnderlineSpan(), r15, r2, 33);     // Catch: java.lang.Throwable -> L40
        boolean r16 = com.aide.ui.aa.lg();     // Catch: java.lang.Throwable -> L40
        int r5 = 0;
    L14:
        if (r5 >= r8.gn.size()) goto L37;
        com.aide.engine.FindResult.Highlighting r6 = r8.gn.get(r5);     // Catch: java.lang.Throwable -> L40
        if (r6.VH == null) goto L34;
        int r7 = r6.VH.j6(getContext(), r16);     // Catch: java.lang.Throwable -> L40
        int r9 = r6.VH.Hw();     // Catch: java.lang.Throwable -> L40
        if (r9 == 1) goto L22;
        if (r9 == 2) goto L21;
        int r10 = 0;
    L23:
        int r11 = r10;
        int r17 = r12;
        boolean r18 = r16;
        int r110 = r5;
        int r20 = j6(r0, r17, r13, r6.FH, r6.Hw);     // Catch: java.lang.Throwable -> L40
        int r21 = r12;
        int r22 = j6(r0, r21, r13, r6.v5, r6.Zo);     // Catch: java.lang.Throwable -> L40
        if (r20 < 0) goto L35;
        if (r22 < 0) goto L35;
        r14.setSpan(new android.text.style.ForegroundColorSpan(r7), r20, r22, 33);     // Catch: java.lang.Throwable -> L40
        if (r11 != 1) goto L29;
    L33:
        r14.setSpan(new android.text.style.StyleSpan(r11), r20, r22, 33);     // Catch: java.lang.Throwable -> L40
        goto L35
    L29:
        if (r11 == 2) goto L33;
        if (r11 == 3) goto L33;
    L35:
        r5 = r110 + 1;     // Catch: java.lang.Throwable -> L40
        r8 = r19;
        r16 = r18;
        goto L14
    L21:
        r10 = 2;
        goto L23
    L22:
        r10 = 1;
        goto L23
    L34:
        r110 = r5;
        r18 = r16;
        goto L35
    L37:
        if (android.os.Build.VERSION.SDK_INT < 20) goto L57;
        setTypeface(android.graphics.Typeface.MONOSPACE);     // Catch: java.lang.Throwable -> L40
        return;
    }
}
