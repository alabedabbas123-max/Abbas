package com.aide.uidesigner;

@abcd.Interfacexu
public class ProxyMarginLayoutParams {

    @abcd.Interfacetu
    private static boolean $ON_ENTER_TOGGLE;

    @abcd.Interfaceuu
    private static boolean $ON_THROW_TOGGLE;

    @abcd.Interfaceru(field = 1286728673468488320L)
    private android.view.ViewGroup.MarginLayoutParams params;

    static {
        abcd.wu.j6(com.aide.uidesigner.ProxyMarginLayoutParams.class, -4357380200993762145L, -4357380200993762145L);
    }

    public ProxyMarginLayoutParams(java.lang.Object r6) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, 2088598866734157688L, null, r6);
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(2088598866734157688L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params = (android.view.ViewGroup.MarginLayoutParams) r6;     // Catch: java.lang.Throwable -> L8
    }

    public void setMargin(int r5) {
    L8:
        th = move-exception;
        if ($ON_THROW_TOGGLE == false) goto L12;
        abcd.wu.j6(th, -1042662775487324376L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if ($ON_ENTER_TOGGLE == false) goto L6;
        abcd.wu.j6(-1042662775487324376L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.params.setMargins(r5, r5, r5, r5);     // Catch: java.lang.Throwable -> L8
    }
}
