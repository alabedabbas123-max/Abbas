package com.aide.common;

@abcd.Interfacexu
public class KeyStrokeEditText extends android.widget.EditText {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = -3199900292018766867L)
    private com.aide.common.ClassU FH;

    @abcd.Interfaceru(field = 6443564963460235156L)
    private com.aide.common.KeyStrokeDetector Hw;

    @abcd.Interfaceru(field = 388758416480593952L)
    private com.aide.common.KeyStrokeDetector.a v5;

    static {
        abcd.wu.j6(com.aide.common.KeyStrokeEditText.class, -2670818707938442347L, -2670818707938442347L);
    }

    public KeyStrokeEditText(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1525777556603888544L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1525777556603888544L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
        this.v5 = new com.aide.common.ClassW(this);     // Catch: java.lang.Throwable -> L8
        j6();     // Catch: java.lang.Throwable -> L8
    }

    public KeyStrokeEditText(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 8265290387827753827L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(8265290387827753827L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
        this.v5 = new com.aide.common.ClassW(this);     // Catch: java.lang.Throwable -> L7
        j6();     // Catch: java.lang.Throwable -> L7
    }

    public KeyStrokeEditText(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -670950516412742336L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-670950516412742336L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
        this.v5 = new com.aide.common.ClassW(this);     // Catch: java.lang.Throwable -> L7
        j6();     // Catch: java.lang.Throwable -> L7
    }

    @abcd.Interfacesu(method = -1341425219413963196L)
    private void j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1407998017524319795L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1407998017524319795L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Hw = new com.aide.common.KeyStrokeDetector(getContext());     // Catch: java.lang.Throwable -> L8
    }

    public com.aide.common.ClassU getKeyStroke() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4173086052872262372L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4173086052872262372L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return this.FH;
    }

    @Override
    public boolean onCheckIsTextEditor() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 6228503499472035280L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(6228503499472035280L, this);     // Catch: java.lang.Throwable -> L8
        return true;
    L15:
        return true;
    }

    @Override
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 1329573529808750779L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(1329573529808750779L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (com.aide.common.ClassG.Ws(getContext()) == false) goto L9;
        r5.imeOptions = 1073741825;     // Catch: java.lang.Throwable -> L12
        r5.inputType = 131217;     // Catch: java.lang.Throwable -> L12
    L10:
        return this.Hw.j6(this, this.v5);
    L9:
        r5.imeOptions = 1073741825;     // Catch: java.lang.Throwable -> L12
        goto L10
    }

    @Override
    public boolean onKeyDown(int r8, android.view.KeyEvent r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 356467929665310813L, this, new java.lang.Integer(r8), r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(356467929665310813L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.Hw.j6(r8, r9, this.v5) == false) goto L9;
        return true;
    L9:
        return super.onKeyDown(r8, r9);
    }

    @Override
    public boolean onKeyUp(int r8, android.view.KeyEvent r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -1245967393128813824L, this, new java.lang.Integer(r8), r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1245967393128813824L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.Hw.DW(r8, r9, this.v5) == false) goto L9;
        return true;
    L9:
        return super.onKeyUp(r8, r9);
    }

    public void setKeyStroke(com.aide.common.ClassU r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1349775928786849280L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1349775928786849280L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r5;     // Catch: java.lang.Throwable -> L8
        setText(r5.toString());     // Catch: java.lang.Throwable -> L8
    }
}
