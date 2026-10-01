package com.aide.ui.views;

@abcd.Interfacexu
public class CustomKeysListView extends android.widget.ListView {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 1544908190932456740L)
    private com.aide.ui.views.CustomKeysListView.a FH;

    public interface a {
        boolean onKeyDown(int r1, android.view.KeyEvent r2);

        boolean onKeyUp(int r1, android.view.KeyEvent r2);
    }

    static {
        abcd.wu.j6(com.aide.ui.views.CustomKeysListView.class, -285407883451740000L, -285407883451740000L);
    }

    public CustomKeysListView(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2429505840056829768L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2429505840056829768L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        super(r6);     // Catch: java.lang.Throwable -> L8
    }

    public CustomKeysListView(android.content.Context r8, android.util.AttributeSet r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 399867451615048543L, null, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(399867451615048543L, null, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        super(r8, r9);     // Catch: java.lang.Throwable -> L7
    }

    public CustomKeysListView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 333633083686443036L, null, r9, r10, new java.lang.Integer(r11));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(333633083686443036L, null, r9, r10, new java.lang.Integer(r11));     // Catch: java.lang.Throwable -> L7
    L5:
        super(r9, r10, r11);     // Catch: java.lang.Throwable -> L7
    }

    public boolean DW(int r8, android.view.KeyEvent r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1464922279717604984L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1464922279717604984L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return super.onKeyUp(r8, r9);
    }

    public boolean j6(int r8, android.view.KeyEvent r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1292086796923669161L, this, new java.lang.Integer(r8), r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1292086796923669161L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L7
    L5:
        return super.onKeyDown(r8, r9);
    }

    @Override
    public boolean onKeyDown(int r8, android.view.KeyEvent r9) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -912691128963686363L, this, new java.lang.Integer(r8), r9);
    L17:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-912691128963686363L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L13
    L6:
        if (this.FH != null) goto L8;
    L11:
        return super.onKeyDown(r8, r9);
    L8:
        if (this.FH.onKeyDown(r8, r9) == false) goto L11;
        return true;
    }

    @Override
    public boolean onKeyUp(int r8, android.view.KeyEvent r9) {
    L13:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, 8270839950906617280L, this, new java.lang.Integer(r8), r9);
    L17:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(8270839950906617280L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L13
    L6:
        if (this.FH != null) goto L8;
    L11:
        return super.onKeyUp(r8, r9);
    L8:
        if (this.FH.onKeyUp(r8, r9) == false) goto L11;
        return true;
    }

    @Override
    protected void onMeasure(int r3, int r4) {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(r3), 1073741824), r4);
    }

    @Override
    public boolean requestFocus(int r8, android.graphics.Rect r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 3449932190114844280L, this, new java.lang.Integer(r8), r9);
    L15:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(3449932190114844280L, this, new java.lang.Integer(r8), r9);     // Catch: java.lang.Throwable -> L11
    L6:
        if (getFocusedChild() == null) goto L9;
        return false;
    L9:
        return super.requestFocus(r8, r9);
    }

    public void setOnKeyEventListener(com.aide.ui.views.CustomKeysListView.a r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -377468209336966572L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-377468209336966572L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r5;     // Catch: java.lang.Throwable -> L8
    }
}
