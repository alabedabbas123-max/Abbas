package com.aide.uidesigner;

@abcd.Interfacexu
public class ProxyViewPaddings {

    @abcd.Interfacetu
    private static boolean $ON_ENTER_TOGGLE;

    @abcd.Interfaceuu
    private static boolean $ON_THROW_TOGGLE;

    @abcd.Interfaceru(field = 1283934071954100160L)
    private int padding;

    @abcd.Interfaceru(field = 2502059665285126269L)
    private int paddingBottom;

    @abcd.Interfaceru(field = -941965546655400267L)
    private int paddingEnd;

    @abcd.Interfaceru(field = -3138892354802734225L)
    private int paddingLeft;

    @abcd.Interfaceru(field = -3093936463656996900L)
    private int paddingRight;

    @abcd.Interfaceru(field = -3007477963878563320L)
    private int paddingStart;

    @abcd.Interfaceru(field = -942836894611569765L)
    private int paddingTop;

    @abcd.Interfaceru(field = 583791923828363040L)
    private android.view.View view;

    static {
        abcd.wu.j6(com.aide.uidesigner.ProxyViewPaddings.class, 232054640984430660L, 232054640984430660L);
    }

    public ProxyViewPaddings(java.lang.Object r6) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -1541985154764514020L, null, r6);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-1541985154764514020L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.view = (android.view.View) r6;     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -1906919809088034468L)
    private void updatePadding() {
    L27:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L31;
        abcd.wu.j6(th, 4071297115228859836L, this);
    L31:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L7;
        abcd.wu.j6(4071297115228859836L, this);     // Catch: java.lang.Throwable -> L27
    L7:
        if (this.padding <= 0) goto L10;
        this.view.setPadding(this.padding, this.padding, this.padding, this.padding);     // Catch: java.lang.Throwable -> L27
        return;
    L10:
        if (this.paddingStart > 0) goto L24;
        if (this.paddingEnd > 0) goto L24;
        if (this.paddingLeft <= 0) goto L17;
    L22:
        this.view.setPadding(this.paddingLeft, this.paddingTop, this.paddingRight, this.paddingBottom);     // Catch: java.lang.Throwable -> L27
        return;
    L17:
        if (this.paddingRight > 0) goto L22;
        if (this.paddingTop > 0) goto L22;
        if (this.paddingBottom > 0) goto L22;
        return;
    L24:
        if (android.os.Build.VERSION.SDK_INT < 17) goto L36;
        this.view.setPaddingRelative(this.paddingStart, this.paddingTop, this.paddingEnd, this.paddingBottom);     // Catch: java.lang.Throwable -> L27
        return;
    }

    public void setPadding(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -633694578456592928L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-633694578456592928L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.padding = r5;     // Catch: java.lang.Throwable -> L8
        updatePadding();     // Catch: java.lang.Throwable -> L8
    }

    public void setPaddingBottom(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 1493921854605055659L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(1493921854605055659L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.paddingBottom = r5;     // Catch: java.lang.Throwable -> L8
        updatePadding();     // Catch: java.lang.Throwable -> L8
    }

    public void setPaddingEnd(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 2588808217676287737L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2588808217676287737L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.paddingEnd = r5;     // Catch: java.lang.Throwable -> L8
        updatePadding();     // Catch: java.lang.Throwable -> L8
    }

    public void setPaddingLeft(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -2955563154388918191L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-2955563154388918191L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.paddingLeft = r5;     // Catch: java.lang.Throwable -> L8
        updatePadding();     // Catch: java.lang.Throwable -> L8
    }

    public void setPaddingRight(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 302511640466470520L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(302511640466470520L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.paddingRight = r5;     // Catch: java.lang.Throwable -> L8
        updatePadding();     // Catch: java.lang.Throwable -> L8
    }

    public void setPaddingStart(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -977041310190241500L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-977041310190241500L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.paddingStart = r5;     // Catch: java.lang.Throwable -> L8
        updatePadding();     // Catch: java.lang.Throwable -> L8
    }

    public void setPaddingTop(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -890816286062971485L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-890816286062971485L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.paddingTop = r5;     // Catch: java.lang.Throwable -> L8
        updatePadding();     // Catch: java.lang.Throwable -> L8
    }
}
