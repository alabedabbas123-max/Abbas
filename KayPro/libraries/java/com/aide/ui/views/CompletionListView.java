package com.aide.ui.views;

@abcd.Interfacexu
public class CompletionListView extends com.aide.ui.views.CustomKeysListView {

    @abcd.Interfacetu
    private static boolean Hw;

    @abcd.Interfaceuu
    private static boolean v5;

    @abcd.Interfaceru(field = 2045108703843522643L)
    private com.aide.common.KeyStrokeDetector.a VH;

    @abcd.Interfaceru(field = 1982564770279018035L)
    private com.aide.common.KeyStrokeDetector Zo;

    static {
        abcd.wu.j6(com.aide.ui.views.CompletionListView.class, 85373884122756255L, 85373884122756255L);
    }

    public CompletionListView(android.content.Context r6) {
    L8:
        th = move-exception;
        if (v5 == false) goto L12;
        abcd.wu.j6(th, 1012263937666637019L, null, r6);
    L12:
        throw th;
    L4:
        if (Hw == false) goto L6;
        abcd.wu.j6(1012263937666637019L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
    }

    public CompletionListView(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, -8763854125042118644L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(-8763854125042118644L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    public CompletionListView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, -1619114962724624595L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(-1619114962724624595L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    }

    @Override
    public boolean onCheckIsTextEditor() {
    L11:
        th = move-exception;
        if (v5 == false) goto L15;
        abcd.wu.j6(th, 5402945009408630112L, this);
    L15:
        throw th;
    L4:
        if (Hw == false) goto L6;
        abcd.wu.j6(5402945009408630112L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.Zo == null) goto L9;
        return true;
    L9:
        return false;
    }

    @Override
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r5) {
    L12:
        th = move-exception;
        if (v5 == false) goto L16;
        abcd.wu.j6(th, -507097421382997161L, this, r5);
    L16:
        throw th;
    L4:
        if (Hw == false) goto L7;
        abcd.wu.j6(-507097421382997161L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (com.aide.common.ClassG.Ws(getContext()) == false) goto L9;
        r5.imeOptions = 1073741825;     // Catch: java.lang.Throwable -> L12
        r5.inputType = 131217;     // Catch: java.lang.Throwable -> L12
    L10:
        return this.Zo.j6(this, this.VH);
    L9:
        r5.imeOptions = 1073741825;     // Catch: java.lang.Throwable -> L12
        goto L10
    }

    @Override
    public boolean onKeyDown(int r8, android.view.KeyEvent r9) {
    L27:
        th = move-exception;
        if (v5 == false) goto L31;
        abcd.wu.j6(th, 61320235065127605L, this, new java.lang.Integer(r8), r9);
    L31:
        throw th;
    L3:
        if (Hw == false) goto L6;
        abcd.wu.j6(61320235065127605L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L27
    L6:
        if (r8 == 19) goto L26;
        if (r8 == 20) goto L26;
        if (r8 == 23) goto L26;
        if (r8 == 66) goto L26;
        if (r8 == 96) goto L26;
        if (r8 == 92) goto L26;
        if (r8 == 93) goto L26;
        if (r8 == 122) goto L26;
        if (r8 == 123) goto L26;
        return super.onKeyDown(r8, r9);
    L26:
        return j6(r8, r9);
    }

    @Override
    public boolean onKeyUp(int r8, android.view.KeyEvent r9) {
    L27:
        th = move-exception;
        if (v5 == false) goto L31;
        abcd.wu.j6(th, 3286524981524102004L, this, new java.lang.Integer(r8), r9);
    L31:
        throw th;
    L3:
        if (Hw == false) goto L6;
        abcd.wu.j6(3286524981524102004L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L27
    L6:
        if (r8 == 19) goto L26;
        if (r8 == 20) goto L26;
        if (r8 == 23) goto L26;
        if (r8 == 66) goto L26;
        if (r8 == 96) goto L26;
        if (r8 == 92) goto L26;
        if (r8 == 93) goto L26;
        if (r8 == 122) goto L26;
        if (r8 == 123) goto L26;
        return super.onKeyUp(r8, r9);
    L26:
        return DW(r8, r9);
    }

    public void setKeyStrokeDetector(com.aide.common.KeyStrokeDetector r5) {
    L8:
        th = move-exception;
        if (v5 == false) goto L12;
        abcd.wu.j6(th, -5549793282224567904L, this, r5);
    L12:
        throw th;
    L4:
        if (Hw == false) goto L6;
        abcd.wu.j6(-5549793282224567904L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.Zo = r5;     // Catch: java.lang.Throwable -> L8
    }

    public void setKeyStrokeHandler(com.aide.common.KeyStrokeDetector.a r5) {
    L8:
        th = move-exception;
        if (v5 == false) goto L12;
        abcd.wu.j6(th, 5792652026469602632L, this, r5);
    L12:
        throw th;
    L4:
        if (Hw == false) goto L6;
        abcd.wu.j6(5792652026469602632L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.VH = r5;     // Catch: java.lang.Throwable -> L8
    }
}
